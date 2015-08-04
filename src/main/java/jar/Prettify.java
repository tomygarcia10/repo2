package jar;


public interface Prettify {

    public static final int MILLION = 1000000;
    public static final double BILLION = 1000000000000d;
    public static final double TRILLION = 1000000000000000000d;

    public String prettify(Double number);
}
