interface StreamingService {
    void streamMovies();
    default void showSubscriptionDetails() {
        System.out.println("Streaming Service Subscription: Premium Plan");
    }
}

interface GamingService {
    void playGames();
    default void showSubscriptionDetails() {
        System.out.println("Gaming Service Subscription: Gold Plan");
    }
}

class SmartTV implements StreamingService, GamingService {
    String[] movies = {"Avengers", "Inception", "Interstellar", "Jawan"};
    String[] games = {"FIFA 25", "Minecraft", "GTA V", "PUBG"};

    @Override
    public void streamMovies() {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }
    }

    @Override
    public void playGames() {
        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println("- " + game);
        }
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class MultiServiceSmartTV {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();
        tv.showSubscriptionDetails();
        System.out.println();
        tv.streamMovies();
        System.out.println();
        tv.playGames();
    }
}