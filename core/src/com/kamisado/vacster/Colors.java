package com.kamisado.vacster;

public enum Colors {
	ORANGE("orange.png"), BLUE("blue.png"), CYAN("cyan.png"), PINK("pink.png"), 
	YELLOW("yellow.png"), RED("red.png"), GREEN("green.png"), BROWN("brown.png");
	
	private String str;
	
	private Colors(String str) 
	{
		this.str = str;
	}
	
	public String getName()
	{
		return str;
	}
}
