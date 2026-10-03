import java.util.Scanner;

public class TotalWaterConsumption {
    static int calculateTotal(int morningUsage, int eveningUsage) {
        int totalUsage = morningUsage + eveningUsage;
        return totalUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water usage in the morning (in liters):");
        int morningUsage = sc.nextInt();
        System.out.println("Enter the water usage in the evening (in liters):");
        int eveningUsage = sc.nextInt();

        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Morning Water Usage: " + morningUsage + " liters");
        System.out.println("Evening Water Usage: " + eveningUsage + " liters");
        System.out.println("Total Water Consumption: " + totalUsage + " liters");
    }
}
