package Class3IfElse;
/*Traffic Light Actions: Declare a String variable trafficLight
and set it to either "Red", "Yellow", or "Green". Use if-else statements
to print "Stop" if the light is "Red", "Caution" if the light is "Yellow",
and "Go" if the light is "Green"

 */
public class T9 {
    public static void main(String[] args) {

        String TrafficLight="Green";

        if(TrafficLight.equals("Red")){
            System.out.println("Stop");
        } else if (TrafficLight.equals("Yellow")) {
            System.out.println("Caution");
            
        } else if (TrafficLight.equals("Green")) {
            System.out.println("GO!");
            
        }
    }
}
