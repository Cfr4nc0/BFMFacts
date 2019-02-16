package practice;

public class Celebrity {
    String artist;
    int rich;

    public Celebrity(String artist, int rich){
        this.artist = artist;
        this.rich = rich;
    }
    void walk(){
        System.out.println("Hello peeps");

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRich() {
        return rich;
    }

    public void setRich(int rich) {
        this.rich = rich;
    }

    public static void main(String[] args) {
        Celebrity yourCelebrity = new Celebrity("Marina", 10);
        yourCelebrity.walk();
        System.out.println("My celebrity: " + yourCelebrity.getArtist());
    }
}


