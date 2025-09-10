import java.util.Scanner;
public class scanner_example {
    public static void main(String[]ars){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age:");
        int age = scanner.nextInt();

        System.out.print("enter your name:");
        String name = scanner.nextLine();

        System.out.print("enter your favourite colour:");
        String colour = scanner.nextLine();

        System.out.println("your" +" " +age + " "+"years old");
        System.out.println("you like the colour" + colour );

        scanner.close();
        
    }
}
