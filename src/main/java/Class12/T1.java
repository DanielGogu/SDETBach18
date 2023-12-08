package Class12;

public class T1 {
    public static void main(String[] args) {
        String task1="Write a program to get a new String without any spaces";
        System.out.println(task1);
        String newTask1=task1.replaceAll(" ","");
        System.out.println(newTask1);
    }
}
