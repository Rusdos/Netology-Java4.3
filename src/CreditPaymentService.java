public class CreditPaymentService {
    double calculate(double percent, long amount, int term) {
        int termInMonth = term * 12;
        double percentInMonth = percent/100/12;
        double coefficient = percentInMonth * Math.pow((1+percentInMonth),termInMonth)/(Math.pow((1+percentInMonth),termInMonth)-1);
        double payment = coefficient * amount;
        return payment;
    }
}
