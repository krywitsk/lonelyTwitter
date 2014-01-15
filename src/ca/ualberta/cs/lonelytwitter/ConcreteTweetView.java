package ca.ualberta.cs.lonelytwitter;


public class ConcreteTweetView implements tweetView
{

	public String formatTweet(lonelyTweetModel lt)
	{
		return lt.getTimestamp.toString() + " | " + lt.getText();
	}

}
