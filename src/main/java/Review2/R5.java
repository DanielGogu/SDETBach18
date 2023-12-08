package Review2;

public class R5 {
    public static void main(String[] args) {

        boolean allergy=true;
        String allergyType="fish";

        if(allergy) { //outer if
            System.out.println("Let's check what kind of allergy you have");
            if(allergyType.equals("peanut")){   // nested/inner if
                System.out.println("Please avoid food that contains peanuts");
            } else if (allergyType.equals("dairy")) {
                System.out.println("Please avoid food with dairy products");
            } else if (allergyType.equals("pollen")) {
                System.out.println("Please stay indoor when trees are blooming");
            }
        }
    }
}
