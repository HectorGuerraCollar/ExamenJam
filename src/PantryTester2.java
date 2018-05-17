import java.util.Scanner;

/**
 *
 * @author Hector Guerra
 */
public class PantryTester2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, amount;
		Jam goose = new Jam("Gooseberry", "7/4/2015", 12);
		Jam apple = new Jam("Crab Apple", "9/30/2015", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/2014", 3);
		Jam rhub2 = new Jam("Rhubarb", "10/31/2014", 3);
		Pantry hubbard = new Pantry(goose, apple, rhub);

		System.out.println("Welcome to Mother Hubbard's Party!");
		System.out.println("The jams are: ");
		hubbard.print();
		do {
			System.out.println("Enter your selection (1,2,or 3):");
			num = scan.nextInt();
			if (num == 1 || num == 2 || num == 3) {
				hubbard.select(num);
				System.out.println("Enter amount to spread:");
				amount = scan.nextInt();
				hubbard.spread(amount);
				System.out.println("The jams are: ");
				hubbard.print();
			} else {
				System.out.println("Selection out-of-range, please enter again or '-1' for exit!");
			}
		} while (num != -1);
		System.out.println("Good-by!");
		scan.close();
	}
}
