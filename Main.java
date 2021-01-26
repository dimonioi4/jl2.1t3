public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        int timeoneyear = service.calculate(12);
        System.out.println(timeoneyear);

        int timetwoyaer = service.calculate(24);
        System.out.println(timetwoyaer);

        int timethreeyear = service.calculate(36);
        System.out.println(timethreeyear);
    }
}