package jar;


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MillionPrettifier implements Prettify{

    private static final DecimalFormat df = new DecimalFormat("#.#");

        public String prettify(Double number){
        df.setRoundingMode(RoundingMode.DOWN);
        return df.format(getNumberValue(number)) + MillionUnit.getMillonUnitFromNumber(number).toString();
        }

    private Double getNumberValue(Double numberValue){

        MillionUnit mu = MillionUnit.getMillonUnitFromNumber(numberValue);
        switch(mu){

            case EMPTY:
                return numberValue;
            case MILLION:
                return numberValue / Prettify.MILLION;
            case BILLION:
                return numberValue / Prettify.BILLION;
            case TRILLION:
                return numberValue / Prettify.TRILLION;
            default:
                return numberValue;
        }
    }
}
