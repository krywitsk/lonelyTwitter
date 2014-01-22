package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetListController
{

	//uppercase is the class, lowercase is the instance 
	private static TweetListModel tweetListModel = null;
	
	public TweetListController()
	{
		super();
		if (tweetListModel == null) {
			tweetListModel = new TweetListModel();
		}
	}
	
	public void addTweet(String text)
	{
		LonelyTweetModel lt = new NormalTweetModel(text);
		ArrayList<LonelyTweetModel> list = tweetListModel.getList();
		list.add(lt);
		tweetListModel.setList(list);
	}
	
	public TweetListModel getTweetListModel() {
		return tweetListModel;
	}
		
	
}
