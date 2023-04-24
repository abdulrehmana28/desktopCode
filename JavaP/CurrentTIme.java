package javaCC.JavaP;
import java.util.*;
class CurrentTIme {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Timezone: ");
        int timeZone = input.nextInt();

        

        long seconds = System.currentTimeMillis() / 1000;
        int currentSecond =  (int)(seconds % 60);
        System.out.println("Seconds: " + seconds);
        

        long minutes = seconds / 60;
        System.out.println("Minutes: " + minutes);
        int currentMinute =  (int)(minutes % 60);

        long hours = minutes / 60;
        System.out.println("Hours: " + hours);
        int currentHour =  (int)(hours % 24);

        int CorrectHour =  currentHour + timeZone;

        System.out.println("The current time is: " + CorrectHour + " : " + currentMinute + " : " + currentSecond);
        
        

        input.close();

    }
}