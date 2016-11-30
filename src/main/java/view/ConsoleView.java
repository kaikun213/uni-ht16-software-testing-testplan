package main.java.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import main.java.controller.GameController.Event;
import main.java.model.Player;

public class ConsoleView implements IView{
	
	final static String MENU = "-=[ Game of Chance MENU ]=-\n" +
								"1 - Play the pick a number game\n" +
								"2 - Play the No Match Dealer game\n" +
								"3 - Play the Find the Ace game\n" +
								"4 - View current high score\n" +
								"5 - Change your user Name\n" +
								"6 - Reset your account at 100 credits\n" +
								"7 - Quit\n";
	final static String REGISTER = "-=-=-{ NEW PLAYER REGISTRATION }-=-=-\n" +
									"Enter your Name:";
	
	PrintStream out;
	BufferedReader in;
	
	public ConsoleView(){
		this.out = System.out;	// set default PrintStream
		this.in = new BufferedReader(new InputStreamReader(System.in));	// set default InputStream (Console)
	}
	
	public ConsoleView(PrintStream out){
		this.out = out;
		this.in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public ConsoleView(PrintStream out,BufferedReader in){
		this.out = out;
		this.in = in;
	}

	public void showMenu() {
		out.println(MENU);
	}

	public Event getUserEvent() {
		return null;
	}

	public Player registerPlayer() {
		out.println(REGISTER);
		String name = getName();
		out.println("Welcome to the Game of Chance" + name +"\n" +
					"You have been given"+ Player.defaultCredits +" credits.\n");
		return new Player(name);
	}
	
	private String getName(){
		String name = "";
		
		try {
			name = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return name;
		
	}

}
