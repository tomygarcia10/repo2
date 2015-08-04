package jar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrettifierFrame extends JFrame {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    private JPanel workSpace;
    private JLabel requestInputMessage;
    private JLabel result;
    private JTextField input;
    private JButton btnPrettify;

    public PrettifierFrame(){

        setBounds(HEIGHT, HEIGHT,WIDTH, HEIGHT);
        setResizable(false);
        setTitle("TGAT");

        requestInputMessage = new JLabel("Please enter the number to prettify");
        requestInputMessage.setBounds(20, 20, 260, 14);
        requestInputMessage.setVisible(true);

        input = new JTextField("");
        input.setBounds(50,60,200,16);
        input.setVisible(true);

        btnPrettify = new JButton("Pretify");
        btnPrettify.setBounds(WIDTH / 2 - 50, 90, 100, 15);
        btnPrettify.setVisible(true);
        btnPrettify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prettifyAction();
            }
        });

        result = new JLabel("");
        result.setBounds(WIDTH / 2 - 70, 130, 140, 20);
        result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setVisible(true);

        workSpace = new JPanel(null);
        workSpace.setSize(WIDTH, HEIGHT);
        workSpace.setBackground(Color.lightGray);
        workSpace.add(requestInputMessage);
        workSpace.add(input);
        workSpace.add(btnPrettify);
        workSpace.add(result);
        workSpace.setVisible(true);

        getContentPane().add(workSpace);
        setVisible(true);
    }

    private void prettifyAction(){
        try{
            Double inputNumber = Double.parseDouble(input.getText());
            input.setText("");
            result.setText(new MillionPrettifier().prettify(inputNumber));
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(getParent(), "Invalid input value! Please enter a valid number");
        }
    }
}
