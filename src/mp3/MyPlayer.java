package mp3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jlme.util.Player;

public class MyPlayer {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\Suyash\\Desktop\\test.mp3");
			BufferedInputStream bin=new BufferedInputStream(fin);
			Player pl=new Player(bin);
			pl.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
