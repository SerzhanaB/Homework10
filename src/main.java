import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ввести строку");

        while (true) {

            String a = src.nextLine();
            int MassiveLength = a.length();
            char[] massive = new char[MassiveLength];

            for (int i = 0; i < massive.length; i++) {
                massive[i] = a.charAt(i);
                //  System.out.println("Новый массив "+massive[i]);
            }

            try {
                for (int i = 0; i < massive.length; i++) {
                    //  if (massive[i].charAt(0)== 1 || massive[i].charAt(0)== 2  )

                    if (massive[i] == '1' || massive[i] == '2' || massive[i] == '3' || massive[i] == '4' || massive[i] == '5' ||
                            massive[i] == '6' || massive[i] == '7' || massive[i] == '8' || massive[i] == '9' || massive[i] == '0') {

                        System.out.println("найдено число" + massive[i]);
                        throw new DigitException("Ошибка", massive[i]);
                    }
                }
            } catch (DigitException de) {
                System.out.println("В исходной строке найдено число");
            }

            try {
                for (int i = 0; i < massive.length; i++) {
                    if (massive[i] == massive[i + 1] & massive[i]== massive[i + 2]) {
                        System.out.println("найден повтор: " + massive[i]);
                        throw new DigitException("Ошибка", massive[i]);
                    }

                }

            } catch (DigitException e) {
                e.printStackTrace();
            }
        }
    }

}
