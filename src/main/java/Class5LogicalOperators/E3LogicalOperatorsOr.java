package Class5LogicalOperators;

public class E3LogicalOperatorsOr {
    public static void main(String[] args) {
        // Only When both conditions are false it doesn't read the if
        boolean condition1=false;
        boolean condition2=false;

        if(condition1|| condition2){
            System.out.println("If");
        }else {
            System.out.println("Else");

        }
    }
}
