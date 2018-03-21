import sun.audio.*;
import java.io.*;

public class Sound {

	public static void music()
	{
	AudioPlayer MGP = AudioPlayer.player;
	AudioStream BGM;
	AudioData MD;
	ContinuousAudioDataStream loop=null;
	try {
	BGM= new AudioStream(new FileInputStream("src/data/bk8.wav"));
	MD=BGM.getData();	
	loop=new ContinuousAudioDataStream(MD);
	}
	catch(IOException e){
		System.out.println("file not found");
	}
	MGP.start(loop);
	}
}