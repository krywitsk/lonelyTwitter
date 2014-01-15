package ca.ualberta.cs.lonelytwitter;


public class NormalTweetModel extends LonelyTweetModel
{

	public normalTweetModel(String text)
	{;
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
	
	@Override
	public boolean getTweetModelType()
	{
		return this.getClass().getName() == 'importantTweetModel';
	} 
	
}
