package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


//Java Access modifiers
//	private - only current class
//	default (nothing) - current class + package
//	protected - class + subclasses + package
//	public - anywhere

//You must add abstract for methods with no body in the method and class name
//Abstract means we can only instantiate from an inherited class

public abstract class LonelyTweetModel
{
	protected String text;
	protected Date timestamp;
	protected String type;
	
	public LonelyTweetModel(String text, Date timestamp)
	{
		super();
		this.text = text;
		this.timestamp = timestamp;
	}
	
	public LonelyTweetModel(String text)
	{
		super();
		this.text = text;
		this.timestamp = new Date();
	}
	
	public String getText()
	{
		return text;
	}
	public abstract void setText(String text);
	
	public Date getTimestamp()
	{
		return timestamp;
	}
	public abstract void setTimestamp(Date timestamp);
	
	public abstract boolean isTweetImportant();

	
}
