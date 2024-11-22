public class ArtistDemo {
    public static void main(String[] args) {
        
        Artist artist = new Artist("Charlie Puth", 32 , "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", 29 , "Music", Genre.POP);
        singer.displayInfo();

        Dancer dancer = new Dancer("Mikhail Baryshnikov", 75 , "Dancing", DanceStyle.BALLET);
        dancer.displayInfo();

        Painter painter = new Painter("Leonardo da Vinci", 67 , "Painting", Medium.OIL);
        painter.displayInfo();

        Writer writer = new Writer("Nicholas Sparks", 58 , "Writing", WritingStyle.DRAMA);
        writer.displayInfo();

    }

}
