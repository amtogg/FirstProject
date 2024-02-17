import java.nio.file.Path;
import java.util.Scanner;

public class ProcessingOfFile {
    public Path ofFile (String fileAddressOf) {
        Scanner console = new Scanner(System.in);
        System.out.println("Необходимо ввести адрес файла куда сохранить зашифрованный текст");
        fileAddressOf = console.nextLine();
        return Path.of(fileAddressOf);
    }
}
