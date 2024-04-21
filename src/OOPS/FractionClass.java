package OOPS;

public class FractionClass {

    private static Fraction addFractions(Fraction f1, Fraction f2){

        int numerator = f1.num*f2.den + f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator,denominator);
        return f3;

    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,7);
        System.out.println(f1.num +"/" +f1.den);
        Fraction f2 = new Fraction(5,3);
        System.out.println(f2.num +"/" +f2.den);

        Fraction sum = addFractions(f1,f2);
        System.out.println(sum.num+"/"+sum.den);

    }
}
