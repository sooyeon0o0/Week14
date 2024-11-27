import java.io.*;

/*
"input.txt"라는 이름의 텍스트 파일이 있습니다. 이 파일에서 모든 내용을 읽은 다음, 각 라인을 대문자로 변환하여 "output.txt"라는 새 파일에 쓰는 자바 프로그램을 작성하세요.import java.io.*;

*/
public class Question1 {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bfw = new BufferedWriter(new FileWriter("output.txt"))){

            String data;
            while ((data = bfr.readLine()) != null) {
                bfw.write(data.toUpperCase());
            }
            System.out.println("Done");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}