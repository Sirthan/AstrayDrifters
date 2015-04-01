package astrayDrifters.Main;

import astrayDrifters.Gui.TitleScreen;

public class Main {
	public static void main(String[] args){
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitleScreen("Pre-pre-alpha 0.0.1").setVisible(true);
            }
        });
	}
}