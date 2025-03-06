interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("It has Strings ");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("It has Keys");
    }
}

public class Instruments {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();
        g.play();
        p.play();
    }
}
