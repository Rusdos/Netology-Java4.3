public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(9.99,1000000,1);
        System.out.printf("Ежемесячный платёж %,.0f%n",payment);

        CreditPaymentService service1 = new CreditPaymentService();
        double payment1 = service1.calculate(9.99,1000000,2);
        System.out.printf("Ежемесячный платёж %,.0f%n",payment1);

        CreditPaymentService service2 = new CreditPaymentService();
        double payment2 = service2.calculate(9.99,1000000,3);
        System.out.printf("Ежемесячный платёж %,.0f%n",payment2);

    }
}

