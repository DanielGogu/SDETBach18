package Review2;

public class R1TypeCasting {
    public static void main(String[] args) {
        //Casting: widening/implicit & narrowing/explicit
        //byte>short>int>long>float>double
        double price=12;
        System.out.println(price); //12.0
        double price1=12.99;
        System.out.println(price1);

        //narrowing: double -> int
        int num=(int)12.99; //force int narrowing/explicit/manual
        System.out.println(num); //12
        double result= 12/7;
        System.out.println(result); //1.0

    }
}