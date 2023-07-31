public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 80;
        double heightInMeters =2;
        double index = service.calculate(weightInKg, heightInMeters);
        System.out.println("Индекс массы тела:");
        System.out.println((int) index);
    }
}