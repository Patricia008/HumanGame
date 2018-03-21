import sun.audio.*;
import java.io.*;

public class Sound1 {

	public static void music(String s)
	{
	AudioPlayer MGP = AudioPlayer.player;
	AudioStream BGM;
	AudioData MD;
	AudioDataStream loop=null;
	try {
	BGM= new AudioStream(new FileInputStream(s));
	MD=BGM.getData();	
	loop=new AudioDataStream(MD);
	}
	catch(IOException e){
		System.out.println("file not found");
	}
	MGP.start(loop);
	}
}