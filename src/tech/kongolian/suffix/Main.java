package tech.kongolian.suffix;
import tech.kongolian.suffix.Suffixes.Scientific;
import tech.kongolian.suffix.Suffixes.abbreviation;
import tech.kongolian.suffix.Suffixes.full;

import java.util.Scanner;

public class Main {

    public static boolean error;
    public static boolean repeat;
    public static String TextNumber;
    public static double Number;

    public static void main(String[] args) {
        error = false;
        repeat = false;
        Looper();












    }

    public static void Looper(){
        do {
            System.out.println("Please select what prefix you would like to use: ");
            System.out.println("1) Scientific");
            System.out.println("2) Full");
            System.out.println("3) Abbreviation");

            Scanner sc = new Scanner(System.in);
            String myLine = sc.nextLine().toLowerCase();
            if (myLine.equals("1") || myLine.equals("scientific")) {
                System.out.println("You've Chosen Scientific");
                do{
                    System.out.println("Enter number:");
                    TextNumber = sc.nextLine();
                    if (TextNumber.matches("[0-9]+")) {
                        Number = Double.parseDouble(TextNumber);
                        Scientific s = new Scientific(Number);
                        System.out.println(s.Output());
                        repeat();
                    }
                    else{
                        System.out.println("Invalid number");
                    }
                } while(!TextNumber.matches("[0-9]+"));







                // this is the validation
                error = false;
            } else if (myLine.equals("2") || myLine.equals("full")) {
                System.out.println("You've Chosen Full");
                do{
                    System.out.println("Enter number:");
                    TextNumber = sc.nextLine();
                    if (TextNumber.matches("[0-9]+")) {
                        Number = Double.parseDouble(TextNumber);
                        full f = new full(Number);
                        System.out.println(f.Output());
                        repeat();




                    }
                    else{
                        System.out.println("Invalid number");
                    }
                } while(!TextNumber.matches("[0-9]+"));





                error = false;




            } else if (myLine.equals("3") || myLine.equals("abbreviation")) {
                System.out.println("You've Chosen Abbreviation");

                do{
                    System.out.println("Enter number:");
                    TextNumber = sc.nextLine();
                    if (TextNumber.matches("[0-9]+")) {
                        Number = Double.parseDouble(TextNumber);
                        abbreviation a = new abbreviation(Number);
                        System.out.println(a.Output());
                        repeat();
                    }
                    else{
                        System.out.println("Invalid number");
                    }
                } while(!TextNumber.matches("[0-9]+"));





                error = false;
                sc.close();



            } else {
                error = true;
                System.out.println("Please choose a correct input!");

            }



        } while (error || repeat);

    }


    public static void repeat(){
        System.out.println("whould you like to repeat? (y/n)");
        Scanner sc = new Scanner(System.in);
        String txtrepeat = sc.nextLine();
        if (txtrepeat.equals("y")){
            repeat = true;

        }  else {
            repeat = false;
            System.out.println("Thank you for using the program");
            sc.close();
        }
    }




}
