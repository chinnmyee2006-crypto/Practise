import java.util.Scanner;

public class lexicograph{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        String smallest = str.substring(0, k);
        String largest = str.substring(0, k);

        for (int i = 1; i <= str.length() - k; i++) {

            String current = str.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
            }
        }

        System.out.println("Smallest substring: " + smallest);
        System.out.println("Largest substring: " + largest);
    }
}


