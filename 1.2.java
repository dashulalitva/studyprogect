import java.util.Scanner;
public class Main { static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String code = in.next();
        String title = in.next();

        int bpm = in.nextInt();


        int durationSec =in.nextInt() ;

        final int SLOW = 95;
        final int MEDIUM = 120;


        String tempo;
        if (bpm < SLOW) {
            tempo = "медленный";
        } else if (bpm <= MEDIUM) {
            tempo = "средний";
        } else {
            tempo = "быстрый";
        }


        int total_counts = (int) Math.round(durationSec * (bpm / 60.0));


        int count_of_8_int = total_counts / 8;
        int tail = total_counts % 8;


        System.out.println("Трек: " + code + " " + title);
        System.out.println("Темп: " + bpm + " BPM - " + tempo);
        System.out.println("Счетов: " + total_counts + ", полных восьмерок: " + count_of_8_int);


        if (tail > 0) {
            System.out.println("Внимание: в конце трека хвост " + tail + " сч.");
        }
    }
}
