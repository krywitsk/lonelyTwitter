package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetListModel
{
	public TweetListModel() {
		
		list = new ArrayList<LonelyTweetModel>();
	}
	private ArrayList<LonelyTweetModel> list;
	private ArrayList<String> strList;

	
	public ArrayList<LonelyTweetModel> getList()
	{
		return list;
	}
	
	public ArrayList<String> getStrings() {
		return strList;
	}
	
	public void update()
	{
		ArrayList<String> strArray = new ArrayList<String>();
		
		if (!this.list.isEmpty()) {
			
			for (LonelyTweetModel tweet : this.list) {
				String str = (tweet.getText() + " " + tweet.getTimestamp().toString());
				strArray.add(str);
			}
			
		}
		strList = strArray;
	}

	
	public void setList(ArrayList<LonelyTweetModel> list)
	{
	
		this.list = list;
	}
	
}
