import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

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
 * Warhol Grid Generator starter code      *
 *                                         *
 * UTeach CSP                              *
 * Bradley Beth                            *
 * rev. 20160831                           * 
 *                                         *
 *******************************************/

PImage imgOrig, imgVar1, imgVar2, imgVar3;

public void setup()
{
  textSize(16);                   //set font size            //set font color
  fill(127);
  
  //Load image(s)
  imgOrig = loadImage("original.png");
  imgVar1 = imgOrig.get();
  imgVar2 = imgOrig.get();
  imgVar3 = imgOrig.get();
  
  //Set window size
  
  surface.setResizable(true);
  surface.setSize(imgOrig.width * 2, imgOrig.height * 2);
  
  /*************************
  Place STATIC filters here
  * ex: imgVar1.filter(...);
  *************************/
  imgVar2.filter(POSTERIZE, 4);
  imgVar2.filter(INVERT);
  imgVar3.filter(POSTERIZE, 4);

  
  
  /************************/
  
}

public void draw()
{
  /*************************
  Place DYNAMIC filters here
  *************************/
  imgVar1.filter(BLUR);

  
  
  /************************/
   
  //Draw original image
  image(imgOrig, 0, 0);
  text("original", imgOrig.width / 4, imgOrig.height - 10); 

  //Draw image variant 1
  image(imgVar1, imgVar1.width, 0);
  text("blur loop", 5 * imgVar1.width / 4, imgVar1.height - 10);
  
  //Draw image variant 2
  image(imgVar2, 0, imgVar2.height);
  text("posterize + invert", imgVar2.width / 4, (2 * imgVar2.height) - 10);
  
  //Draw image variant 3
  image(imgVar3, imgVar3.width, imgVar3.height);
  text("posterize", 5 * imgVar3.width / 4, (2 * imgVar3.height) - 10);
  
  save("2x2.png");
}
  public void settings() {  size(1, 1); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "APCS" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
