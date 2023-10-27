/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamestates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import gui_Assignment.Game;

import static gui_Assignment.Game.framewidth;
import static gui_Assignment.Game.framehight;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

//import static gui_Assignment.game.UNIT_SIZE;
public class menu extends state implements statemethods {

	// start button
	// size
	private static int startButtonSizeX = 270;
	private static int startButtonSizeY = 50;
	// postion
	private static int startbuttonY = 464;
	private static int startbuttonX = 900/2-startButtonSizeX/2;
	// text off set
	private static int startTextY = 35;
	
        private BufferedImage menubackround;
        private boolean startGlow;

	public menu(Game game) throws IOException {
            super(game);
                this.menubackround = game.getMenubackround();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
        private void importimages(){
             // Specify the file path to the image you want to import
            File imageFile = new File("startgame.png");

            try {
                // Use ImageIO to read the image into a BufferedImage
                 this.menubackround = ImageIO.read(imageFile);
            } catch (IOException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
	@Override
	public void draw(Graphics g) {
            g.drawImage(menubackround, 0, 0, null);
            g.setColor(Color.GRAY);
            //g.fillRect(startbuttonX, startbuttonY, startButtonSizeX, startButtonSizeY);
            g.setColor(Color.YELLOW);
            if(startGlow == false){
            g.setColor(Color.WHITE);
            }
            g.setFont(new Font("Serif", Font.BOLD, 40));
            int offset = centertext(g,new Font("Serif", Font.BOLD, 40),"start",900);
            g.drawString("start", offset, startbuttonY + startTextY);    
		

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getX() < startButtonSizeX + startbuttonX && e.getX() > startbuttonX) {
			if (e.getY() < startButtonSizeY + startbuttonY && e.getY() > startbuttonY) {
				Gamestate.state = Gamestate.playing;
				
			}
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
            this.startGlow = false;
		if (e.getX() < startButtonSizeX + startbuttonX && e.getX() > startbuttonX) {
			if (e.getY() < startButtonSizeY + startbuttonY && e.getY() > startbuttonY) {
				this.startGlow = true;
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
        public int centertext(Graphics g, Font f, String text, int sizeX) {
		g.setFont(f);
		int width = g.getFontMetrics().stringWidth(text);
		int offset = (sizeX - width) / 2;

		return offset;
	}
}