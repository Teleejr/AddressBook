import java.io.File;
import java.util.Scanner;

public class Address implements Add, Print{

        //create access to file for address book
        File file = new File("src/main/resources/Address.csv");

        // enable scanner for input
        Scanner input = new Scanner(System.in);

        //method to append users input into file
        public void enterAdd() {
            // array to tell user what to enter
            String[] prompts = new String[9];
            prompts[0] = "enter First Name";
            prompts[1] = "enter Last Name";
            prompts[2] = "enter Home Phone";
            prompts[3] = "enter Mobile Phone";
            prompts[4] = "enter Email";
            prompts[5] = "enter Street";
            prompts[6] = "enter Street Number";
            prompts[7] = "enter Town";
            prompts[8] = "enter Zip";

            // array to save user input
            String[] add = new String[9];

            // display text from array and collect responses in array
            for (int i=0; prompts.length>i; i++)
            {
                System.out.println(prompts[i]);
                add[i] = input.nextLine();
            }

            // called add method to add user responses to file
            Add(add[0], add[1], add[2], add[3], add[4], add[5], add[6], add[7], add[8]);
        }
    }

