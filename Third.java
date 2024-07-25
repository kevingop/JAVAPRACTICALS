import java.util.Scanner;

class Third {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        Scanner obj = new Scanner(System.in);
        String mob = obj.nextLine();

        // Check if the input length is exactly 10
        if (mob.length() == 10) {
            String mobileOperatorCode = mob.substring(0, 2);
            String mobileSwitchingCode = mob.substring(2, 5);
            String uniqueSubscriberCode = mob.substring(5);

            System.out.println("Mobile system operator code: " + mobileOperatorCode);
            System.out.println("Mobile switching code (MSC): " + mobileSwitchingCode);
            System.out.println("Unique subscriber code: " + uniqueSubscriberCode);
        } else {
            System.out.println("Invalid input length. Please enter a 10-digit mobile number.");
        }

    }
}
