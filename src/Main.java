public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
//         Масса тела в кг
        double mass = 82.60;
//         Рост в метрах
        double height = 1.82;

        double bmi = service.calculate(mass, height);
        System.out.println("Ваш индекс тела составляет: " + String.format("%.2f", bmi) + " кг/м²");
    }
}