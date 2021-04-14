public class MainRunner {

    public static void main(String[] args) {

        boolean end = false;

        //instantiate the person class
        Address a = new Address();

        while (end==false) {

            System.out.println("Please select an option: \n" +
                    "1. Add an entry. \n" +
                    "2. Edit entries - Search by name. \n" +
                    "3. Edit entries - Search by mobile number. \n" +
                    "4. Delete an entry - Search by name. \n" +
                    "5. Delete an entry - Search by mobile number." +
                    "6. View all entries in address book - Sorted by name. \n" +
                    "7. View all entries in address book - Sorted by mobile number. \n" +
                    "8. Exit address book.");

            int menuChoice = 0;

            if (menuChoice==1) {
                //have the user enter another address and add it to the file
                a.enterAdd();
            }
            else if (menuChoice==2)
            {

            }
            else if (menuChoice==3)
            {

            }
            else if (menuChoice==4)
            {

            }
            else if (menuChoice==5)
            {

            }
            else if (menuChoice==6)
            {
                a.viewByName();
            }
            else if (menuChoice==7)
            {

            }
            else if (menuChoice==8)
            {

            }

        }


    }
}
