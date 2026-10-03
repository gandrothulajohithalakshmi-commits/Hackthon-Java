import java.util.Scanner;
public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water consumption in liters:");
        double waterConsumption = sc.nextDouble();

        double billAmount;
        if (waterConsumption <= 500) {
            billAmount = 100;
        } else {
            billAmount = 200;
        }

        System.out.println("Water Bill Amount: $" + billAmount);
        sc.close();
    }
}

