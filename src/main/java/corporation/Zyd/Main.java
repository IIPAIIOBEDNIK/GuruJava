package corporation.Zyd;

public class Main {

    public static void main(String[] args) {

        Ball volleyball  = new Ball();
        Ball football = new Ball();
        Ball golf = new Ball();
        Ball ping_pong = new Ball();
        Ball basketball = new Ball();

        volleyball.color = "white-blue";
        football.color = "white-black";
        golf.color = "white";

        volleyball.setSize("l");
        football.setSize("l");
        golf.setSize("m");
        ping_pong.setSize("s");
        basketball.setSize("xl");
    }
}
