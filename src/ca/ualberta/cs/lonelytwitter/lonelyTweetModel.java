package ca.ualberta.cs.lonelytwitter;


//Java Access modifiers
//	private - only current class
//	default (nothing) - current class + package
//	protected - class + subclasses + package
//	public - anywhere

public class lonelyTweetModel
{
	private String text;
	private Date timestamp;
	
	public String getText()
	{
		return text;
	}
	public void setText(String text)
	{
		this.text = text;
	}
	public Date getTimestamp()
	{
		return timestamp;
	}
	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
	}
	
}
