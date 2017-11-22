package puzzle_boy;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	static JFrame frame;
	static Puzzle puzzle;
        
        void exec(){
            frame = new JFrame("Puzzle Boy");
		frame.setSize(377, 390);
	
		puzzle = new Puzzle(new ImageIcon(Main.class.getResource("image.png")).getImage());
		
		frame.add(puzzle);
		
		frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
		frame.setVisible(true);
//		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!puzzle.started) 
                                    puzzle.start();
                                else if (!puzzle.mixing) 
                                    puzzle.onClick(e);
				else 
                                    puzzle.mixing = false;
			}
		});
        }
	
	public static void main(String [] args) {
		frame = new JFrame("Puzzle Boy");
		frame.setSize(377, 390);
	
		puzzle = new Puzzle(new ImageIcon(Main.class.getResource("image.png")).getImage());
		
		frame.add(puzzle);
		
		frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!puzzle.started) 
                                    puzzle.start();
                                else if (!puzzle.mixing) 
                                    puzzle.onClick(e);
				else 
                                    puzzle.mixing = false;
			}
		});
	}

}
