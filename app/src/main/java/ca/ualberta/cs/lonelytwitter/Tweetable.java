package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public interface Tweetable {
    String getMessage();  // removed 'public' modifier -- redundant

    Date getDate();  // removed 'public' modifier -- redundant

}
