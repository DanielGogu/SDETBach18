package Class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        phone1.size="medium";
        phone1.color="white";
        phone1.memory=512;
        phone1.model="FX1";
        phone1.Brand="Samsung";
        phone1.ring();
        phone1.sms();
        phone1.games();

        System.out.println();

        Phone phone2=new Phone();
        phone2.size="Larde";
        phone1.color="Black";
        phone1.memory=1024;
        phone1.model="SL10";
        phone1.Brand="Pixel";
        phone1.ring();
        phone1.sms();
        phone1.games();
    }
}
