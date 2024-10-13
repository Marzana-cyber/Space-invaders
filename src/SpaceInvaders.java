import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SpaceInvaders extends JPanel {
    //board
    int titleSize = 32;
    int rows = 16;
    int columns = 16;
    int boardWidth = titleSize * columns; //32*16
    int boardHeight = titleSize * rows;

    SpaceInvaders() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.black);
    }
}
