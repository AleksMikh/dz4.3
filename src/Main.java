public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int period = 12;
        int amount = 1_000_000;
        double rate = 9.99 / 100 / 12;
        int payment = service.calculate(period, amount, rate);

        System.out.println();
        System.out.println("Оплата в месяц за кредит на год");
        System.out.println(service.calculate(12, 1_000_000, 9.99 / 100 / 12));

        System.out.println();
        System.out.println("Оплата в месяц за кредит на два года");
        System.out.println(service.calculate(24, 1_000_000, 9.99 / 100 / 12));

        System.out.println();
        System.out.println("Оплата в месяц за кредит на три года");
        System.out.println(service.calculate(36, 1_000_000, 9.99 / 100 / 12));
    }

}
