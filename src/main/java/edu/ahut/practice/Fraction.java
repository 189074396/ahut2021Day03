package edu.ahut.practice;

/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.practice
 * @ClassName: Fraction
 * @author: wang
 * @create: 2021/07/11 14:31
 * @Version: 1.0
 */
public class Fraction {
    private long numerator;
    private long denominator;

    public Fraction() {
    }

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }
    public Fraction add(Fraction f){
        Fraction fraction=new Fraction(0,0);
        if (this.numerator==0){
            return f;
        }
        if(f.numerator==0){
            return this;
        }
        if(this.denominator==f.denominator){
            fraction.numerator=this.numerator+f.numerator;
            fraction.denominator=this.denominator;
        }else {
            fraction.numerator=this.numerator*f.denominator+f.numerator*this.denominator;
            fraction.denominator=this.denominator*f.denominator;
        }
        long a=gcd(fraction.numerator,fraction.denominator);
        fraction.numerator=fraction.numerator/a;
        fraction.denominator=fraction.denominator/a;
        return fraction;
    }
    public Fraction sub(Fraction f){
        if (this.numerator==0){
            return f;
        }
        if(f.numerator==0){
            return this;
        }
        Fraction fraction=new Fraction();
        if(this.denominator==f.denominator){
            fraction.numerator=this.numerator-f.numerator;
            fraction.denominator=this.denominator;
        }else {
            fraction.numerator=this.numerator*f.denominator-f.numerator*this.denominator;
            fraction.denominator=this.denominator*f.denominator;
        }
        long a=gcd(fraction.numerator,fraction.denominator);
        fraction.numerator=fraction.numerator/a;
        fraction.denominator=fraction.denominator/a;
        return fraction;
    }
    public Fraction multi(Fraction f){
        Fraction fraction=new Fraction();
        fraction.numerator=this.numerator*f.numerator;
        fraction.denominator=this.denominator*f.denominator;
        long a=gcd(fraction.numerator,fraction.denominator);
        fraction.numerator=fraction.numerator/a;
        fraction.denominator=fraction.denominator/a;
        return fraction;
    }
    public Fraction div(Fraction f){
        Fraction fraction=new Fraction();
        fraction.numerator=this.numerator*f.denominator;
        fraction.denominator=this.denominator*f.numerator;
        long a=gcd(fraction.numerator,fraction.denominator);
        fraction.numerator=fraction.numerator/a;
        fraction.denominator=fraction.denominator/a;
        return fraction;
    }
    private long gcd(long m,long n){
        long res=0;
        if(m>n){
            res=n;
            n=m;
            m=res;
        }
        res=m%n;
        while(res!=0)
        {

            m=n;
            n=res;
            res=m%n;
        }
        if(n<0){
            n=-n;
        }
       return n;
    }
    public void showFraction(){
        if(this.numerator==0){
            System.out.println("0");
        }else if(this.numerator==this.denominator){
            System.out.println("1");
        }else {
            System.out.println(this.numerator+"/"+this.denominator);
        }
    }

    @Override
    public String toString() {
        return this.numerator+"/"+this.denominator;
    }
}
