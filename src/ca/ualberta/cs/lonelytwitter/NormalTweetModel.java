package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class NormalTweetModel extends LonelyTweetModel
{



	public NormalTweetModel(String text)
	{
		super(text);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void setText(String text)
	{
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setTimestamp(Date timestamp)
	{
		
	}
	
	public boolean isTweetImportant()
	{
		return this.getClass().getName() == "importantTweetModel";
	} 
	
}
