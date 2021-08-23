package app;

import java.awt.EventQueue;

import view.FrameClientLogin;
import view.FrameFormRegistration;

public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater( new Runnable() {
			
			@Override
			public void run() {
				FrameClientLogin windowLogin = new FrameClientLogin();
				FrameFormRegistration windowFormRegistration = new FrameFormRegistration();
				windowFormRegistration.setVisible(true);
			}
		});

	}

}
