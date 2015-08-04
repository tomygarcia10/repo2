package jar;


public enum MillionUnit {

    EMPTY,
    MILLION,
    BILLION,
    TRILLION ;

    public static MillionUnit getMillonUnitFromNumber(Double bigNumber){

        bigNumber = Math.abs(bigNumber);
        if(bigNumber < Prettify.MILLION){
            return EMPTY;
        } else if(bigNumber < Prettify.BILLION){
            return MILLION;
        } else if(bigNumber < Prettify.TRILLION){
            return BILLION;
        } else{
            return TRILLION;
        }
     }

    @Override
    public String toString(){
        switch (this){
            case MILLION: return "M";
            case BILLION: return "B";
            case TRILLION: return "T";
            default: return "";
            }
    }
}

