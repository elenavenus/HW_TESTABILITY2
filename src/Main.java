//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.87;
        int weightKilos = 98;
        int index = service.calculate(heightMeters, weightKilos);
        System.out.println(index);
    }
}