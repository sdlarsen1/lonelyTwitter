package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by makepeac on 9/29/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    // http://stackoverflow.com/questions/5207029/how-to-sort-a-list-of-objects-by-their-date-java-collections-listobject
    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
        return tweets;
    }

    public int getCount() {
        return tweets.size();
    }
    public boolean hasTweet(Tweet tweet){
        for (Tweet t : tweets) {
            if (t.equals(tweet)) {
                return true;
            }
        }
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
