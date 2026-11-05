import java.util.Scanner;
public class Main { static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String[] movestyles = {
                "HIPHOP", "LOCKING", "HOUSE", "POPPING", "BREAKING",
                "WAACKING", "HIPHOP", "HOUSE", "POPPING", "BREAKING"
        };
        String[] moves = {"Toprock", "Fresno", "Wave", "Jacking", "Point",
                "Scooby doo", "Lock", "Running man", "Arm whip", "Shuffle"
        };
        int[] counts = { 8, 4, 4, 8, 2, 4, 2, 4, 2, 4 };
        int[] difficulties = { 3, 2, 5, 3, 2, 4, 3, 3, 4, 4 };
        int[] energies= { 6, 3, 3, 6, 2, 5, 2, 5, 2, 5 };
        for (int i = 0; i < moves.length; i++) {
            System.out.println(" | "+moves[i]+" | "+ movestyles[i]+" | "+ counts[i]+" сч. | сложность:  "+ difficulties[i]+" | энергия: "+ energies[i]+" | ");
        }
    }
}
