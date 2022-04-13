public class DigitException extends Exception {
    char a;

    public DigitException (String desc, char a){
super(desc) ;
       this.a=a;

    }
}
