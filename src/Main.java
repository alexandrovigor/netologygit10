public class Main {
    public static void main(String[] args) {

        long[] sale = {10, 20, 30, 16, 2, 8};
        long[] sale1 = {1, 35, 25, 29, 31, 900,};

        SalesManager sales = new SalesManager(sale);
        SalesManager sales1 = new SalesManager(sale1);
        System.out.println("Max sale: " + sales.max());
        System.out.println(sales1.max());
        System.out.println(sales1.min());
        System.out.println(sales1.averageValue());
    }
}
