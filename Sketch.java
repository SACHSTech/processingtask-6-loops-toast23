import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  // global variables 
  public float width = 500f;
  public float height = 500f;
  public float widthSF = width/500f;
  public float heightSF = height/500f;

  public float middleX = width/2;
  public float middleY = height/2;
  public float lineIncrementX = middleX/10;
  public float lineIncrementY = middleY/10;
  public float circleIncrementX = middleX/6;
  public float circleIncrementY = middleY/6;

  public float circleSize = 25;
  public float flowerCentreSize = 40;
  public float petalwidth = 155; 
  public float petalheight = 25;
  

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size((int)width, (int)height);
  }

  
  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
    quadrant1();
    quadrant2();
    quadrant3();
    quadrant4();

  }


  public void quadrant1() {
    strokeWeight(1);
    fill(253, 3, 115);
    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 6; j++) {
        ellipse(middleX + (j * circleIncrementX), i * circleIncrementY, circleSize * widthSF, circleSize * heightSF);
      }
    }
  }


  public void quadrant2() {
    strokeWeight(3);
    for (int i = 1; i < 10; i++) {
      line(i * lineIncrementX, 0, i * lineIncrementX, middleY);
    }
    for (int j = 1; j < 10; j++) {
      line(0, j * lineIncrementY, middleX, j * lineIncrementY);
    }
  }

  
  public void quadrant3() {
    for (int i = 0; i < middleX; i++) {
      line(i, middleY, i, height);
      stroke(i);
    }
  }


  public void quadrant4() {
    fill(212, 95, 66);
    translate((middleX / 2) * 3, (middleY / 2) * 3);
    for (int i = 0; i < 8; i++) {
      rotate(TWO_PI / 8);
      stroke(1);
      strokeWeight(1.25f);
      ellipse(0, 0, petalwidth, petalheight); 
    }
    fill(59, 125, 61);
    strokeWeight(0.25f);
    ellipse(0, 0, flowerCentreSize * widthSF, flowerCentreSize * heightSF);

  }


    
  



}