package Class5LogicalOperators;

public class E7LOSwitchStatements {
    public static void main(String[] args) {
        int day=7;
        switch (day){
            case 1:
                System.out.println("Monday");
                // break; is used to terminate a statement
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                // default: is optional
            default:
                System.out.println("Invalid");

        }
    }
}
