public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PoorBuilder poor = new PoorBuilder();
        director.buildPoorHouse(poor);
    }
}

