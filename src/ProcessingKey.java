import java.util.Scanner;

public class ProcessingKey {
    public InValue key (int key) {
        InValue keyValue = new InValue();
        Scanner console = new Scanner(System.in);
        keyValue.key = console.nextInt();
        if ((Math.abs(keyValue.key) % 33) == 0) {
            System.out.println("введите другое значение ключа (шифровка с данным значением ключа бессмысленна)");
            while ((Math.abs(keyValue.key) % 33) == 0) {
                keyValue.key = console.nextInt();
            }
        } else if (Math.abs(key) > 33) {
            keyValue.key = key / 33;
        }
        return keyValue;
    }
}
