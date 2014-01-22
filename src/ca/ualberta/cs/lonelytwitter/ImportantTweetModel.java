package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class ImportantTweetModel extends LonelyTweetModel
{

	public ImportantTweetModel(String text)
	{

		super(text);
		// TODO Auto-generated constructor stub
	}

	public ImportantTweetModel(String text, Date timestamp)
	{
		super(text, timestamp);
	}

	public void setText(String text)
	{
		this.text = text;
	}
		
	@Override
	public boolean isTweetImportant()
	{
		return this.getClass().getName() == "importantTweetModel";
	}

	@Override
	public void setTimestamp(Date timestamp)
	{

		// TODO Auto-generated method stub
		
	}

}
