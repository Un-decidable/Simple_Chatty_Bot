import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        System.out.println(String.valueOf(scan.nextLine().toLowerCase().charAt(0)).equalsIgnoreCase("j"));
    }
}