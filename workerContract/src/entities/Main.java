package entities;

import java.awt.EventQueue;
import view.InfoWorker;
public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				InfoWorker infoWorker = new InfoWorker();
				infoWorker.setVisible(true);
				
				
				
			}
		});
		
	}

}
