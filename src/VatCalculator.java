import java.util.Scanner;
public class VatCalculator {
    public double vat = 7.0;
    public double price;

    public double getPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price");
        price = sc.nextDouble();

        return price;
    }

    public double CalculateVat(double price){
        return price*vat/100;
    }

    public double CalculateTotal(){
        return price+CalculateVat(price);
    }

}
