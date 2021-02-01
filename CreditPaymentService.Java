public class CreditPaymentService {
    public int calculate (int time, float percent, int summ) {


        float c = percent / time;
        float q = (float) c / 100; // месячная процентная ставка
        float b = 1 + q;
        float a = (float) Math.pow(b, time);
        float q1 = q * a; // левая часть деления
        float q2 = a - 1;// правая часть деления
        float totalq = q1 / q2; // Коэффициент аннуитента
        int payMonth = (int) (totalq * summ);

        return payMonth;
    }
}
