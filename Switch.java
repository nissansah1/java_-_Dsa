import java.util.Scanner;

class Switch {  // Renamed class to avoid conflict with switch keyword
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Button = sc.nextInt();

        switch (Button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hey");
                break;
            default:
                System.out.println("Invalid number");
        }
        sc.close();
    }
}
