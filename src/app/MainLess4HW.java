package app;

public class MainLess4HW {

    public static void main(String[] args) {
        String finishSymbol = ".";
        String product = "Product No ";
        int prodNum1 = 1;
        String smart = ": smartphone,";
        String total = "total sales for ";
        int dayNum1 = 5;
        String is = " is EUR ";
        String sales ="sales by day";
        String days = " day ";
        double sum = 12153.41;
        double divide = sum / dayNum1;
        System.out.println(product + prodNum1 + smart + "\n" +
                total + dayNum1 + days + is + sum + "\n" +
                sales + is + divide + finishSymbol);

        finishSymbol = ".";
        product = "Product No ";
        int prodNum2 = 2;
        String lap = ": laptop,";
        total = "total sales for ";
        int dayNum2 = 7;
        is = " is EUR ";
        sales ="sales by day";
        double sal = 1498.12;
        double multiply = dayNum2 * sal;

        System.out.println(product + prodNum2 + lap + "\n" +
                total + dayNum2 + days + is + multiply+ "\n" +
                sales + is + sal + finishSymbol);



    }



}
