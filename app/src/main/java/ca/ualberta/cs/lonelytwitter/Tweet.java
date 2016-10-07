package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * @see hahahah
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructor os Tweet class
     * @param message tweet text
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Construtor of tweet class
     * @param message tweet text
     * @param date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Convert class into string
     * @return tweet text
     */
    @Override
    public String toString(){
        return message;
    }

    /**
     * hahaha
     * @return blablabla
     */
    public abstract Boolean isImportant();


    /**
     *
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Set date for tweet
     * @param date date blablaabl
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * blablabla
     * @return blabla
     */
    public String getMessage() {
        return message;
    }

    /**
     * ljdsaljkadslkasdf
     * @return jladsljkadflk
     */
    public Date getDate() {
        return date;
    }
}
