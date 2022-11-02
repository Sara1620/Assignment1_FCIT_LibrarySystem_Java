import java.util.Scanner;

public class FCIT_LibrarySystem{
    public static void main(String[]Args){
        Scanner input=new Scanner(System.in);

            System.out.println("--------------------------------------------------- ");
            System.out.println("       Welcome to KAU Library ");
            System.out.println("--------------------------------------------------- ");
            System.out.println("Enter 1 for Borrowing Books ");
            System.out.println("Enter 2 for Returning Books ");
            System.out.println("Enter any other number to quit ");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            //-------------------------------
            
            //Main choice 1,2, otherwise quit
            if (choice == 1 || choice == 2) {
                System.out.println("---------------------------------------------------");
                System.out.println("    BORROWING/RETURNING MENU ");
                System.out.println("---------------------------------------------------");
                System.out.println("Enter 1 for Faculty Members: ");
                System.out.println("Enter 2 for Staff ");
                System.out.println("Enter 3 for PhD/Master Student ");
                System.out.println("Enter 4 for Undergraduate Student ");
                System.out.println("Enter any other number to quit ");
                System.out.print("Enter your choice: ");
                int member = input.nextInt();
                String ID;  int count=1;
                //Borrowing_Returning choice 1 2 3 4
                if (member >=1 && member<= 4) 
                    {
                    do{ //ID should have 8 digits, make a loop to ask again for the ID
                    System.out.print("Enter your ID (It should have 8 digits) : ");
                    ID = input.next();

                    count=0; //To start counting from 1 at each loop

                    //Count digits
                    for(int i=0;i<ID.length();i++)
                    { if (Character.isDigit(ID.charAt(i)))
                        count++; 
                    }
                }
                    while (count!=8);
                            

                    //------    -------
                    //Create the variables to be used
                    int booksAllowed = 0;
                    int allowedDays = 0;
                    String Designation = "";
                    int penalty=0;
                    
                    if (member == 1) {
                        booksAllowed = 10;
                        allowedDays = 120;
                        Designation = "Faculty";
                        penalty=50;
                    } else if (member == 2) {
                        booksAllowed = 8;
                        allowedDays = 90;
                        Designation = "Staff";
                        penalty=40;
                    } else if (member == 3) {
                        booksAllowed = 6;
                        allowedDays = 30;
                        Designation = "PostGraduate Student";
                        penalty=30;
                    } else if (member == 4) {
                        booksAllowed = 3;
                        allowedDays = 15;
                        Designation = "UnderGraduate Student";
                        penalty=20;
                    }
                    //----------------------------------------
                    //Continue the borrowing choice menu
                    if (choice == 1) {
                        System.out.print("Enter the number of books being borrowed: ");
                        int borrowedBooks = input.nextInt();
                        if (borrowedBooks <= booksAllowed) {
                            System.out.println("--------------------------------------------------- ");
                            System.out.println("    INFORMATION DETAILS FOR BORROWING");
                            System.out.println("--------------------------------------------------- ");
                            System.out.println("Identity number : " + ID);
                            System.out.println("Member Category : " + Designation);
                            System.out.println("Number of borrowed books : " + borrowedBooks);
                            System.out.println("Number of allowed books : " + booksAllowed);
                            System.out.println("Number of allowed days : " + allowedDays);
                            System.out.println("--------------------------------------------------- ");
                            System.out.println("*** Thank you for Visiting *** ");
                            System.out.println("--------------------------------------------------- ");
                            System.exit(0);
                        }//Num of books are less than or equal the available num
                        
                        else {
                            System.out.println("Sorry! Number of books exceeds the allowed quantity!");
                            System.exit(0);
                        }//More than the allowed books
                    }//Borrowing choice 1,2,3,4
                    
                    else {// 2 is entered..Returning
                        System.out.print("Enter the number of books returning: ");
                        int return_Books = input.nextInt();
                        System.out.print("Enter the number of extra days: ");
                        int exDays = input.nextInt();

                        if (exDays == 0) {
                            System.out.println(" ----------------------------------------- ");
                            System.out.println("Information Details for RETURNING");
                            System.out.println("----------------------------------------- ");
                            System.out.println("Identity Number : " + ID);
                            System.out.println("Member Category : " + Designation);
                            System.out.println("Number of books returned : " + return_Books);
                            System.out.println("Number of allowed days : " + allowedDays);
                            System.out.println("Number of extra days : " + exDays);
                        }//Extra days are 0
                        
                        else {
                            System.out.print("Enter the total price of books (in SAR): ");
                            double price = input.nextDouble();
                            System.out.println("Information Details for RETURNING");
                            System.out.println("----------------------------------------- ");
                            System.out.println("Identity Number : " + ID);
                            System.out.println("Member Category : " + Designation);
                            System.out.println("Number of books returned : " + return_Books);
                            System.out.println("Number of allowed days : " + allowedDays);
                            System.out.println("Number of extra days : " + exDays);
                            System.out.println("Total price of books (in SAR) : " + price);
                            System.out.println("Penalty : " + penalty * price / 100 + "SAR ");
                            System.out.println("You exceeded the allowed period! The penalty is " + penalty + "% of the price of the books.");
                           }
                        //---   ---
                        System.out.println(" ----------------------------------------- ");
                        System.out.println("*** Thank you for Visiting *** ");
                        System.out.println(" ----------------------------------------- ");
                        //printed in both cases..Extra days or no
                    }//End choice 2..Returning
                    
                }//Borrowing_Returning choice  1 2 3 4 correct
               
                else{
                    System.out.println();
                    System.out.println("Wrong selection of member type!");
                    System.out.println("------------------------------------------ ");
                    System.out.println("*** Thank you for visiting ***");
                    System.out.println("------------------------------------------");
                  } //Borrowing_Returning choice, Wrong selection..Quit
            }//End of the main choice
            
            else {//Quit from the main menu..Not 1 2 
                System.out.println("--------------------------------------------------- ");
                System.out.println("*** Thank you for Visiting *** ");
                System.out.println("--------------------------------------------------- ");
            }// main choice is neither 1 nor 2 to quit from the whole system
            
            input.close();

    }//End of the main method

}
