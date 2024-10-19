import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SpaceInvaders extends JPanel {
    //board
    class Block {
        int x;
        int y;
        int width;
        int height;
        Image img;
        boolean alive = true; //used for aliens
        boolean used = false; //used for builders

        Block(int x, int y, int width, int height, Image img) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.img = img;
}
    }

// Declare the ship variable
    //board
    int tileSize = 32;
    int rows = 16;
    int columns = 16;
    int boardWidth = tileSize * columns; //32*16
    int boardHeight = tileSize * rows;

    Image shipImg;
    Image alienImg;
    Image alienCyanImg;
    Image alienMagentaImg;
    Image alienYellowImg;
    ArrayList<Image> alienImgArray;

    //ship 
    int shipWidth = tileSize * 2; //64px
    int shipHeight = tileSize;  //32px
    int shipX = tileSize*columns/2 - tileSize;
    int shipY = boardHeight - tileSize*2;

    Block ship;

    SpaceInvaders() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.black);

        //load images
        shipImg = new ImageIcon(getClass().getResource("./ship.jpeg")).getImage();
        alienImg = new ImageIcon(getClass().getResource("./alien.jpeg")).getImage();
        alienCyanImg = new ImageIcon(getClass().getResource("./alien-cyan.jpeg")).getImage();
        alienMagentaImg = new ImageIcon(getClass().getResource("./alien-magenta.jpeg")).getImage();
        alienYellowImg = new ImageIcon(getClass().getResource("./alien-yellow.jpeg")).getImage();
        

        alienImgArray = new ArrayList<Image>();
        alienImgArray.add(alienImg);
        alienImgArray.add(alienCyanImg);
        alienImgArray.add(alienMagentaImg);
        alienImgArray.add(alienYellowImg);


        ship = new Block(shipX, shipY, shipWidth, shipHeight, shipImg);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.drawImage(ship.img, ship.x, ship.y, ship.width, ship.height, null);
    }
}




