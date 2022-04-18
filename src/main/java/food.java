import java.util.Scanner;

public class food {

    public static void main(String[] args) {
//      Food mover app
        String mainItem;
        mainItem = String.valueOf(4.99);
        int mainQuantity;
        double mainPrice;
//      double totalPrice;

//      Scanner
        Scanner scanner = new Scanner(System.in);

//      User input
//      Food Order
        System.out.println("What you want?!");
        mainItem = scanner.nextLine();
        System.out.println("You chose: " + mainItem);
//      read in price
        System.out.println("How much you paying?!");
        mainPrice = scanner.nextDouble();
//        System.out.println("Price of your order is: " + mainPrice);


//      Quantity ordered
        System.out.println("How many?!");
        mainQuantity = scanner.nextInt();
        System.out.println("You got: " + mainQuantity + " " + mainItem);
        System.out.println("Your total is: $" + (mainPrice * mainQuantity));


//        Total price
//        totalPrice = scanner.nextDouble();
//        scanner.nextLine();

    }





}