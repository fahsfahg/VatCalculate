public class Main {
    public static void main(String[] args) {

        VatCalculator calculate = new VatCalculator();
        calculate.getPrice();
        calculate.CalculateVat(calculate.price);
        calculate.CalculateTotal();

        System.out.println(calculate.CalculateVat(calculate.price));
        System.out.print(calculate.CalculateTotal());

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number =");
//
//        int number = sc.nextInt();
//        System.out.print(number);
//
//        int number1 = 4;
//        int number2 = 1;
//        System.out.println(number1);
//        System.out.println(number2);
//
//        int total = number1 + number2;
//        System.out.println(total);
//
//        if(total>10){
//            System.out.println("More than 10");
//        }
//        else{
//            System.out.println("Less than 10");
//        }
//
//        for(int i=0; i<10; i++){
//            System.out.print(i);
//        }
//        getNumber();
//        int Number1 = getNumber();
//        int Number2 = getNumber();
//
//        System.out.println(Number1);
//        System.out.println(Number2);

    }


}
