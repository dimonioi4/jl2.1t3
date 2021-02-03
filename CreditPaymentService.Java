public class CreditPaymentService {
    public int calculate (int time, float percent, int summ) {
        float c = percent / 12;
        float monthPercent = (float) c / 100; // ежемесячная процентная ставка
        float b = 1 + monthPercent; 
        float a = (float) Math.pow(b, time);
        float q1 = monthPercent * a; // левая часть деления
        float q2 = a - 1;// правая часть деления
        float totalq = q1 / q2; // Коэффициент аннуитента
        int payMonth = (int) (totalq * summ);

        return payMonth;
    }
}
