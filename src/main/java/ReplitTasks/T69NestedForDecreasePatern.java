package ReplitTasks;
/* Pattern
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6
0 1 2 3 4 5
0 1 2 3 4
...
1
 */
public class T69NestedForDecreasePatern {
    public static void main(String[] args) {
        int x=8;

        for(int i=0;i<8;i++){
            x=x-1;
            for (int j=0;j<=x;j++){
                System.out.print(j+" ");

            }
            System.out.println();

        }

    }
}
