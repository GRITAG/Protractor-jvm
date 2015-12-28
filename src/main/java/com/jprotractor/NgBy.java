package com.jprotractor;

import org.openqa.selenium.By;
//import com.ostusa.JavaScriptBy;

public class NgBy 
{
	private NgBy() { }
	
	public static By binding(String binding)
	{
		return new JavaScriptBy(ClientSideScripts.FindBindings, binding);
	}
	
	public static By options(String options)
	{
		return new JavaScriptBy(ClientSideScripts.FindOptions, options);
	}

	public static By model(String model)
	{
		return new JavaScriptBy(ClientSideScripts.FindModel, model);
	}
	
	public static By selectedOption(String model)
	{
		return new JavaScriptBy(ClientSideScripts.FindSelectedOption, model);
	}
	
	public static By repeater(String repeat)
	{
		return new JavaScriptBy(ClientSideScripts.FindAllRepeaterRows, repeat);
	}

	public static By buttonText(String text)
	{
		return new JavaScriptBy(ClientSideScripts.FindButtonText, text);
	}
	
}