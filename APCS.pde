/*******************************************
 *                                         * 
 * Processiano (Processing Piano)          *
 *                                         *
 * UTeach CSP                              *
 * Bradley Beth                            *
 * rev. 20160920                           * 
 *                                         *
 *******************************************/

import processing.sound.*;
 
float C4, D4, E4, F4, G4, A4, B4;
char currentNote;
SinOsc soundOutput;

void setup()
{
    // Fill in note frequencies here 
    
    C4 = 261.626;     //Middle C (C4)
    D4 = 293.665;
    E4 = 329.628;
    F4 = 349.228;
    G4 = 391.995;
    A4 = 440.000;
    B4 = 493.883;
       
    size(200,200);
    textSize(64);
    fill(0);
    currentNote = '-';
    soundOutput = new SinOsc(this); 
    soundOutput.play();
    soundOutput.freq(0);      //start playing nothing (0 frequency)
}

void draw() 
{
    background(255);
    text(currentNote, width/2-18, height/2+18);
}

void keyPressed()
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

void keyReleased()
{
    if (key == currentNote)
    {
      currentNote = '-';
      soundOutput.freq(0);
    }
}
 