package DSA;

public class driver {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Mobile Number:");
        String mobileNumber = sc.nextLine();
        System.out.println("Distance:");
        double distance = Double.parseDouble(sc.nextLine());

        if (distance <8) {
            System.out.println("Request Accepted");
        } else {
            System.out.println("Request Rejected");
        }

        sc.close();
    }

    void receiverequest(String name, String mobileNumber) {
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
    }

    void acceptrequest(String name, String mobileNumber) {
        System.out.println("Request Accepted for " + name + " with Mobile Number: " + mobileNumber);
    }

    void rejectrequest(String name, String mobileNumber) {
        System.out.println("Request Rejected for " + name + " with Mobile Number: " + mobileNumber);
    }

    void distance(String pickup, String drop) {
        System.out.println("Distance between " + pickup + " and " + drop + " is 10 km.");
    }
}
