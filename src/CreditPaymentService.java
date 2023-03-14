public class CreditPaymentService {
    public int calculate(int period, int amount, double rate) {
        double coefficient = rate + (rate / (Math.pow(1 + rate, period) - 1));
        double payment = coefficient * amount;
        return (int) payment;
    }
}
