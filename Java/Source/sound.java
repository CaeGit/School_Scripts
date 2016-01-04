import sun.audio.*;
import java.io.*;

InputStream in = new FileInputStream("Grid Virus.mp3")
AudioStream as = new AudioStream(in);
AudioPlayer.player.start(as);

