import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int YEAR = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter the genre: ");
        String GENRE = scanner.nextLine();

        System.out.print("Enter the album: ");
        String ALBUM = scanner.nextLine();

        System.out.print("Enter the song title: ");
        String TITLE = scanner.nextLine();

        System.out.print("Enter the artist: ");
        String ARTIST = scanner.nextLine();
        
        System.out.println("------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("------------------------------");
        System.out.println("Year Released: " + YEAR);
        System.out.println("Genre: " + GENRE);
        System.out.println("Album: " + ALBUM);
        System.out.println("Title: \"" + TITLE + "\"");
        System.out.println("Artist: " + ARTIST);

        scanner.close();
    }
}
