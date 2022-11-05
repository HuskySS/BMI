import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadejte vysku(m):");
        float height = scanner.nextFloat();
        System.out.println("zadejte vahu(kg):");
        int weight = scanner.nextInt();
        float bmi = weight / ((height) * (height));
        if (bmi < 18.5) {
            System.out.println("bmi:" + bmi);
            System.out.println("zdravotni rizika: podvaha");
        } else if (bmi >= 18.5 && bmi < 24) {
            System.out.println("bmi:" + bmi);
            System.out.println("zdravotni rizika: minimalni");
        } else if (bmi >= 24 && bmi < 27) {
            System.out.println("bmi:" + bmi);
            System.out.println("zdravotni rizika: nizka az lehce vyssi");
        } else if (bmi >= 27 && bmi < 30) {
            System.out.println("bmi:" + bmi);
            System.out.println("zdravotni rizika: zvysena");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("bmi:" + bmi);
            System.out.println("zdravotni rizika: vysoka");
        } else {
            System.out.println("bmi:" + bmi);
            System.out.println("zdravotni rizika: velmi vysoka");

        }
    }

    }


