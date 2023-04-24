package javaCC.JavaP;
import java.util.*;
class Population {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float populationNow = 312_032_486;

        float birthInDay = 12342.0F;
        float immigrantInDay =  1920;
        float deathInDay = 6646.0F;

        float birthInfiveYears = ((birthInDay * 30) * 12) * 5;
        float immigrantInfiveYears = ((immigrantInDay * 30) * 12) * 5;
        float deathInfiveYears = ((deathInDay * 30) * 12) * 5;

        double population =  populationNow + ((birthInfiveYears  - deathInfiveYears) + immigrantInfiveYears);


        System.out.println((int)population);

        input.close();

    }
    
}
