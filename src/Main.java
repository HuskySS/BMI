import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadejte vysku(m):");
        float height = scanner.nextFloat();
        System.out.println("zadejte vahu(kg):");
        int weight = scanner.nextInt();
        float bmi = weight/((height)*(height));
            if (bmi<18.5) {
                System.out.println("bmi:" + bmi);
                System.out.println("prilis lehka");
            }
            else if (bmi >=18.5 && bmi<24){
            System.out.println("bmi:" + bmi);
            System.out.println("normal");
        }
            else if (bmi>=24 && bmi<27) {
            System.out.println("bmi:" + bmi);
            System.out.println("overload");
        }
            else if (bmi >=27 && bmi<30) {
            System.out.println("bmi:" + bmi);
            System.out.println("lehce obezitni");
        }
            else if (bmi >=30 && bmi<35){
            System.out.println("bmi:" + bmi);
            System.out.println("stredne obezitni");
        }
            else
                System.out.println("bmi:"+bmi);
                System.out.println("velmi obezitni");

        }

    }


