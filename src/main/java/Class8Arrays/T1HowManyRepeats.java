package Class8Arrays;
//How many times Zeeshan appears in the array?
public class T1HowManyRepeats {
    public static void main(String[] args) {
        String [] names={"Aidos","Zeeshan","Abid","Sharif","Zeeshan"};
        int ZeeshanPerTimes=0;
        for(int i=0;i< names.length;i++){
            if(names[i]=="Zeeshan"){
                ZeeshanPerTimes=ZeeshanPerTimes+1;
            }

        }
        System.out.println("Zeeshan is repeated "+ZeeshanPerTimes+" times");

    }
}
