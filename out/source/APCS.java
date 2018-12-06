import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.sound.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class APCS extends PApplet {

/*******************************************
 *                                         * 
 * Processiano (Processing Piano)          *
 *                                         *
 * UTeach CSP                              *
 * Bradley Beth                            *
 * rev. 20160920                           * 
 *                                         *
 *******************************************/


 
float C4, D4, E4, F4, G4, A4, B4;
char currentNote;
SinOsc soundOutput;

public void setup()
{
    // Fill in note frequencies here 
    
    C4 = 261.626f;     //Middle C (C4)
    D4 = 293.665f;
    E4 = 329.628f;
    F4 = 349.228f;
    G4 = 391.995f;
    A4 = 440.000f;
    B4 = 493.883f;
       
    
    textSize(64);
    fill(0);
    currentNote = '-';
    soundOutput = new SinOsc(this); 
    soundOutput.play();
    soundOutput.freq(0);      //start playing nothing (0 frequency)
}

public void draw() 
{
    background(255);
    text(currentNote, width/2-18, height/2+18);
}

public void keyPressed()
{
    if (key != CODED)              //change display
      currentNote = key;           //only if necessary
    if (key == 'c')
      soundOutput.freq(C4);
    if (key == 'd')
      soundOutput.freq(D4);
    if (key == 'e')
      soundOutput.freq(E4);
    if (key == 'f')
      soundOutput.freq(F4);
    if (key == 'g')
      soundOutput.freq(G4);
    if (key == 'a')
      soundOutput.freq(A4);
    if (key == 'b')
      soundOutput.freq(B4);
    if (key == 'C')
      soundOutput.freq(C4 * 2);
    if (key == 'D')
      soundOutput.freq(D4 * 2);
    if (key == 'E')
      soundOutput.freq(E4 * 2);
    if (key == 'F')
      soundOutput.freq(F4 * 2);
    if (key == 'G')
      soundOutput.freq(G4 * 2);
    if (key == 'A')
      soundOutput.freq(A4 * 2);
    if (key == 'B')
      soundOutput.freq(B4 * 2);
}

public void keyReleased()
{
    if (key == currentNote)
    {
      currentNote = '-';
      soundOutput.freq(0);
    }
}
 
  public void settings() {  size(200,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "APCS" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
