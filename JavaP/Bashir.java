package javaCC.JavaP;


class Bashir {
    public static void main(String[] args){

                     

         long totalMilliSeconds = (System.currentTimeMillis());
         long totalSeconds = totalMilliSeconds / 1000;
         long totalMinutes = totalSeconds / 60;
         long currentMinute = totalMinutes % 60;
         long totalHours = totalMinutes / 60;
         long currentHour = totalHours % 24;
            
         System.out.println(currentHour + " : " + currentMinute);
        }
        
    }
