/*
FileInputStream과 FileOutputStream을 사용하여 파일을 복사하는 프로그램과,
BufferedInputStream과 BufferedOutputStream을 사용하여 파일을 복사하는 프로그램을 각각 작성하세요.
두 방법의 실행 시간을 비교하여 어느 방법이 더 효율적인지 결론을 내리세요.
*/
import java.io.*;

public class Question3 {
    public static void main(String[] args) {
        String filePath = "source.txt";
        String outPath = "output.txt";
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        fileInputStream(filePath, outPath);
        long lastTime = System.currentTimeMillis();
        System.out.println(lastTime-startTime);

        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        bufferedInputStream(filePath, outPath);
        lastTime = System.currentTimeMillis();
        System.out.println(lastTime-startTime);
    }

    private static void fileInputStream(String filePath, String outPath){
        try (FileInputStream fis = new FileInputStream(filePath);
             FileOutputStream fos = new FileOutputStream(outPath)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedInputStream(String filePath, String outPath){
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outPath))) {

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            System.out.println("File copied with buffering!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
