public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int averageValue() {
        int sum = 0;
        int i = -2;
        for (long sale : sales) {
            if (sale != min() && sale != max())
                sum += sale;
            i++;
        }
        return (sum / i);
    }
}

