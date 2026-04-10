import java.util.*;

public class Library {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1. Add Book\n2. Issue Book\n3. Return Book\n4. Exit");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Book Added Successfully");
                    break;

                case 2:
                    System.out.println("Book Issued Successfully");
                    break;

                case 3:
                    System.out.println("Book Returned Successfully");
                    break;
            }
        } while(choice != 4);
    }
}
