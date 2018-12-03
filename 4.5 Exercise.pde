void setup()
{
    size(300, 500);
}

void draw()
{

    strokeWeight(2.5);

    //Bezel
    fill(94);
    rect(0, 0, 300, 500, 20);

    //Screen
    if (keyPressed)
    {
        if (key == 'r') 
        {
            fill(255, 0, 0);
        }
         if (key == 'g') 
        {
            fill(0, 255, 0);
        }
         if (key == 'b') 
        {
            fill(0, 0, 255);
        }
    }
    else
    {
        fill(0);
    }

    //Home button
    rect(40, 40, 220, 420, 10);
    if (keyPressed) 
    {
        if (key == CODED) 
        {
            if (keyCode == UP) 
            {
                fill(255);
            }    
        }
        if (key == CODED) 
        {
            if (keyCode == DOWN) 
            {
                fill(0);
            }    
        }
    } 
    else 
    {
        fill(128);
    }


    ellipse(150, 480, 25, 25);
    ellipse(150, 480, 15, 15);

    //Earpiece
    line(130, 20, 170, 20);

    //Buttons
    fill(0);
    int numberOfButtonsDrawn = 0;
    while (numberOfButtonsDrawn < 3)
    {
        ellipse(280, (100+20*numberOfButtonsDrawn), 5, 5);
        numberOfButtonsDrawn = numberOfButtonsDrawn + 1;
    }
}