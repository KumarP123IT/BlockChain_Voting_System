import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Election {

    static Scanner input = new Scanner(System.in);

    private String name;
    private String fatherName;
    private String address;
    private long phoneNo;
    private boolean hasVoted;

    private static Blockchain blockchain = new Blockchain();
    private static HashMap<String, Integer> voteCount = new HashMap<>();

    public void voteNow() {
        System.out.println("Fill the given details in the below section");
        System.out.print("Enter the Age: ");
        int a = input.nextInt();
        input.nextLine();
        ageLimit(a);
    }

    void ageLimit(int age) {

        if (age >= 18) {
            details();
        }
        else {
            System.out.println("Sorry, you are not eligible for voting...");
            System.out.println("---------------------------------------------");
        }
    }

    void details() {
        System.out.print("Please enter the Name: ");
        this.name = input.nextLine();
        System.out.print("Enter your Father's name: ");
        this.fatherName = input.nextLine();
        System.out.print("Enter Your Address: ");
        this.address = input.nextLine();
        System.out.print("Enter your Phone Number: ");
        this.phoneNo = input.nextLong();
        input.nextLine();

        String phoneNoStr = String.valueOf(this.phoneNo);
        System.out.println("---------------------------------");

        if (phoneNoStr.length() == 10) {
            System.out.println("Your Phone number is valid...");
            DisplayUserDetail();
        }
        else {
            System.out.println("Invalid Phone Number, it must contain 10 digits...");
        }
    }

    void DisplayUserDetail() {
        System.out.println("---------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Father's Name: " + this.fatherName);
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNo);
        System.out.println();

        hasVoted = false;

        System.out.println("Do you want to continue (Y/N)? ");
        String confirmation = input.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {
            votingParties();
        }
        else {
            System.out.println("Ok, continue next time...");
        }
    }

    void votingParties() {
        ArrayList<String> party = new ArrayList<>();

        party.add("DMK");
        party.add("AIADMK");
        party.add("BJP");
        party.add("INC");
        party.add("TNCC");
        party.add("DMDK");
        party.add("MNM");

        for (String p : party) {
            voteCount.put(p.toLowerCase(), voteCount.getOrDefault(p.toLowerCase(), 0));
        }

        String vote;

        System.out.println("Vote for your favorite party! Type 'exit' to stop voting...");
        System.out.println("The following parties are participating in the election:\n- DMK\n- BJP\n- INC\n- TNCC\n- DMDK\n- MNM");

        while (true) {
            System.out.print("Enter your party name: ");
            vote = input.nextLine().trim().toLowerCase();

            if (vote.equalsIgnoreCase("exit")) {
                break;
            }


            if (voteCount.containsKey(vote)) {
                voteCount.put(vote, voteCount.get(vote) + 1);
                String voteData = "Vote for " + vote + " by " + name;
                blockchain.addBlock(voteData);
                System.out.println("Thanks for voting for " + vote + "!");
                hasVoted = true;
                break;
            }
            else {
                System.out.println("Invalid party name! Please try again...");
            }
        }

        System.out.print("Do you want to see the result? (Y/N): ");
        String resultDisplay = input.nextLine();

        if (resultDisplay.equalsIgnoreCase("Y")) {
            System.out.println("Displaying voting result!");

            for (String p : party) {
                System.out.println(p + ": " + voteCount.get(p.toLowerCase()) + " votes");
            }
            blockchain.printChain();  // Print the blockchain
        }
        else {
            System.out.println("Thank you for participating!");
        }
    }

    public static void main(String[] args) {
        Election obj = new Election();

        while (true) {
            System.out.print("Do you want to vote (Y/N)? ");
            String option = input.nextLine();
            if (option.equalsIgnoreCase("Y")) {
                obj.voteNow();
            }
            else {
                System.out.println("Ok, continue next time...");
                System.out.println("--------------------------------------------");
                break;
            }
        }
    }
}
