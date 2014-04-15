import java.awt.*;

import javax.swing.*;

/*
 * Implement a simple 2-player
 * tank battle game.
 *
 * written by mike slattery - mar 2007
 */

public class NetTankWar {
	static boolean debug = true;
	static boolean normal = true;

   public static void main(String[] args) {
		JFrame f = new JFrame("TankWar");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WarPanel panel = new WarPanel();
		print("Didn't get here","debug");
		f.add(panel, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
   }
   
   public static void print(String s, String mode) {
		if (mode == "normal" || mode == "debug" || 
				mode == "turnin" || mode == "error") {
			if (mode == "normal" && normal) {
				System.out.println(s);
			} else if (mode == "debug" && debug) {
				System.out.println(s);
			} else if (mode == "turnin") {
				System.out.println(s);
			}else if (mode == "error"){
				System.out.println("Error: "+s);
			}
		} else {
			print("Mode \""+mode + "\" doesn't exist. Msg:\n" + s,"error");
		}

	}
}
