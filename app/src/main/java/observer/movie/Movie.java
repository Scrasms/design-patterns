package observer.movie;

import java.util.ArrayList;
import java.util.List;

// Subject class that notifies observers of interesting events
public class Movie {
    // List of Observer classes that respond to events in Subject class Movie
    private List<MovieWatcher> watchers = new ArrayList<>();
    private String currScene;

    // Adds an Observer
    public void addWatcher(MovieWatcher watcher) {
        if (!watchers.contains(watcher)) {
            watchers.add(watcher);
        }
    }

    // Removes an Observer
    public void removeWatcher(MovieWatcher watcher) {
        watchers.remove(watcher);
    }

    // Alerts Observers of changes
    public void notifyWatchers() {
        watchers.forEach(watcher -> watcher.update(currScene));
    }

    // Method that triggers events for the Observers to react to
    public void playScene() {
        List<String> scenes = List.of("sad", "funny", "scary");
        int randScene = (int) Math.floor(scenes.size() * Math.random());

        currScene = scenes.get(randScene);
        System.out.println("Current scene: " + currScene);
        notifyWatchers();
    }

    public static void main(String[] args) {
        Movie minecraftMovie = new Movie();
        minecraftMovie.addWatcher(new Child());
        minecraftMovie.addWatcher(new Adult());
        minecraftMovie.addWatcher(new Teenager());

        System.out.println("Now playing movie...");

        for (int i = 0; i < 3; i++) {
            minecraftMovie.playScene();
        }
    }
}
