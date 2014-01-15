package ca.ualberta.cs.lonelytwitter;


public class ImportantTweetModel extends LonelyTweetModel
{

	public importantTweetModel(String text, Date timestamp)
	{
		super(text, timestamp);
	}

	public void setText(String text)
	{
		this.text = text;
		
	@Override
	public boolean isTweetImportant()
	{
		return this.getClass().getName() == 'importantTweetModel';
	}

}
