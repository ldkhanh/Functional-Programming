package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda {
    public static void main(String[] args) {

        Game football = new Game() {
          public void play() {
              System.out.println("I'm Playing Football");
          }
        };

        football.play();

        Game cricket = () -> System.out.println("I'm Playing Cricket");
        cricket.play();
        Game footballLambda = () -> System.out.println("I'm Playing Football");
        footballLambda.play();
        Series odiSeries = (type) -> System.out.println("I'm a " + type +" series");
        odiSeries.play("ODI");

        List<String> players = Arrays.asList("Khanh", "Vy", "Thi", "Hien", "Hang", "Tran", "Chau", "MKhanh");

        boolean mk = false;
        for (String player : players) {
            if (player.equals("MKhanh")) {
                mk = true;
                break;
            }
        }
        if (mk)
            System.out.println("Yes. Minh Khanh is in the squad");


        players
                .stream()
                .filter(p -> p.equals("MKhanh"))
                .forEach(p -> System.out.println("Yes. "+p+" is in the list"));

        Optional<String> optional = players.stream().filter(p -> p.equals("MKhanh")).findFirst();
        if (optional.isPresent()) {
            System.out.println("Yes. Minh Khanh ");
        }

    }

    interface Game {
        void play();
    }

    interface Series {
        void play(String type);
    }

}
