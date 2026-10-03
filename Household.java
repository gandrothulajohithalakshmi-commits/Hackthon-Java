import java.util.Scanner;
public class Household {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people in the household:");
        int numberOfPeople = sc.nextInt();
        System.out.println(" Enter the Water consumed in liters:");
        double waterConsumed = sc.nextDouble();
        System.out.println("Enter the House Number:");
        int houseNumber = sc.nextInt();
        System.out.println(" Enter the Water Usage Status");
        char waterUsageStatus = sc.next().charAt(0);
        System.out.println("Household Information:");
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Water Consumed: " + waterConsumed + " liters");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + waterUsageStatus);

    }
    
}
