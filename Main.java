import java.util.Scanner;


class Main {  
  public static void main(String args[]) {
  
//The difference after the machine has been paid.
    double difference;
    
// The two parameters that were asked for.
//The amount the machine deducts for how long you have been parked for initialised to the minimum amount.
    double amountRequired = 50.0;
    
//The amount paid to the machine for how long you have been parked for.
    double amountGiven;
    

    
Scanner scan = new Scanner(System.in);
    
//The time options:
     String options = "\n Please select an option of how long you have been parked for"
            + "\n1  Option A: 0 - 30 minutes ...  R50"
            + "\n2  Option B: 30 - 60 minutes ...  R70"
            + "\n3  Option C: 60+ minutes ...  R100";
               
     System.out.println(options);

//Receive the ticket from the user of how long they have been parked.
       
        char option = scan.next().charAt(0);

        if (option == 'A' || option == 'a') {
            amountRequired *= 1;
        }
        else if (option == 'B' || option == 'b') {
            amountRequired += 20;
        }
        else if (option == 'C' || option == 'c') {
            amountRequired *= 2;

        }
//Repeat the process if wrong option has been entered:
    
        else {
           
            System.out.println("Please enter a valid option. (A, B or C)");
            System.out.println(options);
            option = scan.next().charAt(0);
            
           }
//Payment required.
        System.out.println("Please pay the required amount money");
        Scanner scan2 = new Scanner(System.in);
        amountGiven = scan2.nextDouble();
    

//This is where I handle the difference between the amount paid and amount deducted.Including  converting the amounts to the Rand Currency in a more simpler way.

        difference = amountGiven - amountRequired;
        if (difference == 0) {
            System.out.println("Thank you.\nPlease collect your ticket " + "and have a lovely day!");
        } else if (difference > 0) {
            System.out.println("Your change is R" + difference + ", please collect your ticket and \nHave a lovely day!");
        } else {
            difference *= -1;
            System.out.println("The outstanding amount is R" + difference + ". Please pay the balance before you can get your ticket!!!");
        }
    }
}
