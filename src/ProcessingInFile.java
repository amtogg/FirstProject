import java.nio.file.Path;
import java.util.Scanner;

public class ProcessingInFile {
/*  зря, нам это не надо  public InValue inFile (String fileAddressIn, String fileAddressOf, int key){
        InValue newValue = new InValue();
        Scanner console = new Scanner(System.in);
        newValue.fileAddressIn = console.nextLine();
        newValue.fileAddressOf = console.nextLine();
        newValue.key = console.nextInt();
        return newValue;*/

    public Path inFile (String fileAddressIn){

    Scanner console = new Scanner(System.in);
    System.out.println("Необходимо ввести адрес файла с текстом");
    fileAddressIn = console.nextLine();
    while (fileAddressIn.isEmpty()) {
        System.out.println("Что-то пошло не так, введите корректный адрес файла, для получения текста");
        fileAddressIn = console.nextLine();
    }
        return Path.of(fileAddressIn);
    }
}
