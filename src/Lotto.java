import java.util.ArrayList;
import java.util.Collections;

/* 로또 생성기 45까지 6개의 숫자를 랜덤으로 뽑기*/
public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            lottoNumbers.add(i);
        }
        System.out.println(lottoNumbers);
        Collections.shuffle(lottoNumbers);
        System.out.println(lottoNumbers);
        System.out.println("이번주 로또 번호는 : ");


        for (int i=0; i<5; i++){
            System.out.println(lottoNumbers.get(i));
        }
        System.out.println();
        System.out.println("보너스 넘버는 : ");

        System.out.println(lottoNumbers.get(5));
    }
}
