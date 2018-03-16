import java.util.Scanner;

public class BodyMassIndexBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Mời bạn nhập cân nặng của bạn ( kg)");
        weight = scanner.nextDouble();

        System.out.println("Mời bạn nhập chiều cao của bạn (m)");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.println("bmi" + "\tInterpretation");

        if (bmi < 18)
            System.out.println(Math.round(bmi) + "\tUnderweight");
        else if (bmi < 25.0)
            System.out.println(Math.round(bmi) + "\tNormal");
        else if (bmi < 30.0)
            System.out.println(Math.round(bmi) + "\tOverweight");
        else
            System.out.println(Math.round(bmi) + "\tObese");
    }
}