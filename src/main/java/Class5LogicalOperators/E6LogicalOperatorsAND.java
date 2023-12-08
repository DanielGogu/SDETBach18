package Class5LogicalOperators;

public class E6LogicalOperatorsAND {
    public static void main(String[] args) {
        //Only when every condition is true it will execute if
        boolean cond1=true;
        boolean cond2=true;
        boolean cond3=false;
        if (cond1&&cond2&&cond3){
            System.out.println("If");
        }else {
            System.out.println("Else");
        }
    }
}
