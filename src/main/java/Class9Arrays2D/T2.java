package Class9Arrays2D;

public class T2 {
    public static void main(String[] args) {
        String[][] arr={
                {"Filip","Filip1","Filip2","Filip3"},
                {"A","B","A","D"}
        };
        for(int i=0; i<arr[0].length ;i++){
            if(arr[1][i].equals("A")||arr[1][i].equals("B")){
                System.out.println(arr[0][i]+" "+arr[1][i]);
            }


        }

    }
}
