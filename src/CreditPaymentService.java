public class CreditPaymentService {
    public int calculate(int period, int amount, double i_rate) {
        double coefficient = i_rate + (i_rate / (Math.pow(1 + i_rate, period) - 1));
        double payment = coefficient * amount;
        return (int) payment;
    }
}
