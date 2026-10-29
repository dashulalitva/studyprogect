public class Main {
    public static void main(String[] args) {
    String code ="TR-01";
    String title = "Concrete Groove";
    String style = "HIPHOP";
    int bpm = 120;
    int durationSec = 64;
    double bpm_sec_double = 60.0/bpm;
    int count_of_8_int=durationSec/8;
    double count_of_8_double = durationSec*2/8.0;

    System.out.println("трек "+code+title+"\n"+"Длительность "+durationSec+"\n"+"стиль "+style+"\n"+"количество восьмерок "+count_of_8_double+"\n"+"один счет "+bpm_sec_double+"\n"+"всего счетов "+durationSec*2);
    }
