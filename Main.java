public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        int timeOneYear = service.calculate( 12, 9.99f, 1000000);
        System.out.println(timeOneYear);

        int timeTwoYaer = service.calculate(24, 9.99f,1000000);
        System.out.println(timeTwoYaer);

        int timeThreeYear = service.calculate(36, 9.99f,1000000);
        System.out.println(timeThreeYear);
    }
}
