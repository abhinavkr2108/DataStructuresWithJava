package OOPS;

public class Fraction {
    int num;
    int den;

    public static int gcd(int num, int den){
        int min = Math.min(num,den);
        for (int i=min; i>=1; i--){
            if(num%i==0 && den%i==0){
                return i;
            }
        }
        return min;
    }
    public Fraction(){}

    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }
    public void Simplify(){
        int hcf = gcd(num,den);
        num = num/hcf;
        den = den/hcf;

    }

}
