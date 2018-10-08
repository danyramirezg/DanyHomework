
    class Homework {
        public static void main(String[] args) {
            int bankBalance = 500;
            bankBalance = bankBalance + 250;
            bankBalance = bankBalance - 100;
            System.out.println(bankBalance);


            System.out.println(10.0 / 3 + 5);


        /*
        Write Java code to define an integer variable called day,
        and a String variable called month.
        Give month and day appropriate values for your birthday. */

            int day;
            day = 22;
            String month;
            month = "April";
            System.out.println(month + " " + day);

        /*
        Hello, my name is [full name].
        There are [number] letters in my name.
        * */
            String name;
            name = "Dany";
            String lastName;
            lastName = "Ramirez";
            String fullName;
            fullName = name + " " + lastName;

            System.out.println("Hello, my name is " + fullName + ".");
            System.out.println("There are " + name.length() + " letters in " + name
                    + " and " + lastName.length() + " in " + lastName + ".");


            String output1, output2;
            output1 = String.format("Hello, my name is %s.", fullName);
            output2 = String.format("There are %d letters in my name.", name.length());
            System.out.println(output1);
            System.out.println(output2);
        }
    }
        /* Use String concatenation to create the first String to print
         using the fullName variable, and
use the .length() command on firstName and lastName to
calculate the number of letters.*/
    /*Define an integer variable called bankBalance.
    Initialize it to a value of 500. Then add 250
to it. Then subtract 100 from it. Finally, print the resulting value.*/
