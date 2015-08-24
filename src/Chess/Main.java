package Chess;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Main {
  public static void main(String[] args)
  {
    System.out.println("ChessAI");
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(d);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
    
  }

}
