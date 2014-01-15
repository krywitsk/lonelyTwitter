package ca.ualberta.cs.lonelytwitter;


public class normalTweetModel extends lonelyTweetModel
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
	public String getTweetModelType()
	{
		return this.getClass().getName() == 'importantTweetModel";
	} 
	
}
