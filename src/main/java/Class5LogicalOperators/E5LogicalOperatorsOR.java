package Class5LogicalOperators;

public class E5LogicalOperatorsOR {
    public static void main(String[] args) {
        boolean is4GAvlb=true;
        boolean isWifiAvlb=false;

        if (isWifiAvlb||is4GAvlb){
            System.out.println("You can browse the internet");
        }else {
            System.out.println("Can't use internet");
        }
    }
}
