package userimput;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String firstInital;
        String firstName;
        int housNumber;
        String streetName;
        String streetType;
        String city;

        Scanner readLetter = new Scanner(System.in);
        {


            System.out.println("  please inter the First  inital");

            firstInital= readLetter.next();


           // firsInitial = firstinitial;


            System.out.println(" please inter Firist Name");
            {
                firstName = readLetter.next();
              //  firstName = firstname;

                //System.out.println(firstName);
            }

            System.out.println(" please inter the House number");
            {
                housNumber = readLetter.nextInt();

               // System.out.println(housNomb);
            }

            System.out.println(" please inter Steeet name");
            {
                streetName = readLetter.next();

                //System.out.println(streetNo);
            }


            System.out.println("please Street tyep");
            {

                streetType = readLetter.next();

                //System.out.println(streetType);
            }

            System.out.println("please inter the city");
            {
                city = readLetter.next();

                //System.out.println(city);
            }


            System.out.println("First Initial "+ firstName +"First Name "+ firstName +"  House No "+ housNumber +"Street Nm "+ streetName + "Street Type " +streetType +"City "+ city);

            // write your code here


        }
    }

}


