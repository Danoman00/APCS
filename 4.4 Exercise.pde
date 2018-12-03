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
    fill(0);
    rect(40, 40, 300 - 80, 500 - 80, 10);
    if (mousePressed)
    {
        fill(0);
    }
    else
    {
        fill(255);
    }
    //Home button
    ellipse(150, 480, 25, 25);
    ellipse(150, 480, 15, 15);

    //Earpiece
    line(130, 20, 170, 20);
}