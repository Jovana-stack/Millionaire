/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamestates;

import gui_Assignment.Game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

/**
 *
 * @author jovan
 */
public class continueoption extends state implements statemethods {
        private static int option1X = 25;
	private static int option1Y = 465;

	private static int optionSizeX = 420;
	private static int optionSizeY = 70;
        

	Font Moneyfont; 
	Font otherfont;
	
	public continueoption(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
		
		this.Moneyfont = new Font("Monospaced", Font.BOLD, 70);
		this.otherfont = new Font("Monospaced", Font.BOLD, 40);
		
	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void draw(Graphics g) {
		int offsetx;
                
		
                g.setColor(Color.GRAY);
                offsetx = centertext(g,otherfont,"you can save this money",900);
                g.fillRect(offsetx-5, 110, g.getFontMetrics().stringWidth("you can save this money")+10, 120);
                g.setColor(Color.BLACK);	                
                
		g.drawString("you can save this money", offsetx, 150);
                offsetx = centertext(g,otherfont,"or risk it for more",900);
                g.drawString("or risk it for more", offsetx, 220);
                
                g.setColor(Color.YELLOW);
		offsetx = centertext(g,Moneyfont,"$"+game.getUser().getMoney(),900);
		g.drawString("$"+game.getUser().getMoney(), offsetx, 300);                
                
                g.setColor(Color.gray);
                g.fillRect(option1X, option1Y, optionSizeX, optionSizeY);// frist option
                g.fillRect(option1X + optionSizeX + 10, option1Y, optionSizeX, optionSizeY); // second option
                
                g.setColor(Color.BLACK);                
                offsetx = centertext(g,otherfont,"risk",optionSizeX);
                g.drawString("risk", option1X+offsetx+optionSizeX+10, option1Y+45);
                offsetx = centertext(g,otherfont,"save",optionSizeX);
                g.drawString("save", option1X+offsetx, option1Y+45);
                
                
             	
	}
	
	
	
	public int centertext(Graphics g, Font f, String text, int sizeX) {
		g.setFont(f);
		int width = g.getFontMetrics().stringWidth(text);
		int offset = (sizeX - width) / 2;

		return offset;
	}

	@Override
	public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
		//if option 0 if pressed
		if (e.getX() < option1X + optionSizeX && e.getX() > option1X) {
			if (e.getY() < optionSizeY + option1Y && e.getY() > option1Y) {
				System.out.println("option 0 was pressed");
				Gamestate.state = Gamestate.gameover;
				return;
			}
		}
		// if option 1 is pressed
		if (e.getX() < option1X + optionSizeX + optionSizeX + 10 && e.getX() > option1X + optionSizeX + 10) {
			if (e.getY() < optionSizeY + option1Y && e.getY() > option1Y) {
				System.out.println("option 1 was pressed");
				Gamestate.state = Gamestate.playing;
				return;

			}
		}
                
                
                
                
                
                
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}