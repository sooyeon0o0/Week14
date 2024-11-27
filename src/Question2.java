/*
사용자로부터 파일 경로를 입력받아 해당 파일의 이름, 절대 경로, 파일 크기(바이트 단위)를 출력하는 프로그램을 작성하세요.
파일이 존재하지 않을 경우, "파일이 존재하지 않습니다."라고 출력하세요.
 */
import java.io.File;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("경로를 입력해주세요! : ");
        String filenPath = sc.nextLine();

        File file = new File(filenPath);
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length() + "bytes");
    }
}
