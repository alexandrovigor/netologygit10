public class Main {
    public static void main(String[] args) {

        long[] sale = {10, 20, 30, 16, 2, 8};
        SalesManager sales = new SalesManager(sale);
        System.out.println("Max sale: " + sales.max());
    }
}
