void setup() {
  PImage face = loadImage("face.jpeg");
    size(800,600);
    face.resize(800,600);
    background(face);
  
}

void draw() {
  if(mouseX<205){
    mouseX = 205;
  }
  if(mouseX>245) {
    mouseX=245;
  }
  if(mouseY<295){
   mouseY=295; 
  }
  if(mouseY>335){
    mouseY=335;
  }
  
  fill(255, 255, 255);
  ellipse(225, 310, 75, 75);
  fill(0, 0, 0);
  ellipse(mouseX, mouseY, 25, 25);
  fill(255, 255, 255);
  ellipse(425, 310, 75, 75);
  fill(0, 0, 0);
  ellipse(mouseX + 200, mouseY, 25, 25);
}
