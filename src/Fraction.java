public class Fraction {
    protected int numerator;
    protected int denominator;
    protected int numerator2;
    protected int denominator2;
    protected int sumNum;
    protected int sumDen;
    protected int subNum;
    protected int subDen;


    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator2() {
        return numerator2;
    }
    public void setNumerator2(int numerator2) {
        this.numerator2 = numerator2;
    }

    public int getDenominator2() {
        return denominator2;
    }
    public void setDenominator2(int denominator2) {
        this.denominator2 = denominator2;
    }

    public void Sum(){

        if(denominator==denominator2){
        sumNum = numerator+numerator2;
        sumDen = denominator;
        }else if (denominator>denominator2){
            System.out.println("a");
        }

        System.out.println("Сумма: " );
        System.out.println(sumNum);
        System.out.println("--");
        System.out.println(sumDen);
    }

//    public void Sub(){
//        subNum = numerator - numerator2;
//        subDen = denominator - denominator2;
//        System.out.println("Вычитание: ");
//        System.out.println(subNum);
//        System.out.println("--");
//        System.out.println(subDen);
//    }

}
