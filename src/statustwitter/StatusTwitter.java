package statustwitter;

import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 *
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException Rama con sus respectivos cambios.
     */
    public static void main(String[] args) throws TwitterException {
//No he sido capaz en este intento, ahora volveré a hacerlo a ver si va de esta :D

        Twitter twitter;
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("Ako7UjY3M9qkf0yRlbgW31D3h")
                .setOAuthConsumerSecret("WJ3GGGvYyUoSnV0Ag7RwDz8isExrcxNWNZZTozzTSnM2X1dXe4")
                .setOAuthAccessToken("403449991-2vwfIjdgGOqQcHndqWRwJ8PHxLdHmV3LXYerlmH5")
                .setOAuthAccessTokenSecret("zrQRIj6NDy9a7O1C1NUTvfbLdSvvl1fEPylZcCLDeqScw");
        twitter = new TwitterFactory(cb.build()).getInstance();

        Paging pagina = new Paging();

//Twitter mitwitter = new TwitterFactory().getInstance();
        Query query = new Query("#Cangas");
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }
//ASq   weret/fasd
}
