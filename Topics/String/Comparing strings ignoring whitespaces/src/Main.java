import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine().replace(" ", "");
        String second = scan.nextLine().replace(" ", "");

        System.out.println(first.equals(second) ? "true" : "false");
    }
}