  PImage pepperoni;
  PImage olive;
  PImage mushroom;
  PImage box;
void setup() {
  size(500, 500);
pepperoni = loadImage("pepperoni.png");
olive = loadImage("olive.png");
mushroom = loadImage("mushroom.png");
PImage pizzaBox = loadImage("box.png");
pizzaBox.resize(500, 500);
background(pizzaBox);
 //Makes Dough
    fill(#CEB896);
    ellipse(250, 250,400, 400);
    // Makes Sause 
     fill(#C61D14);
    ellipse(250, 250,350, 350); 
     fill(#D8CC88);
    ellipse(250, 250,300, 300); 
}
void draw() {
  //Makes Toopings
    //pepperoni
    image(pepperoni,100,300);
    image(pepperoni,75,125);
    image(pepperoni,210,195);
    image(pepperoni,275,325);
    image(pepperoni,300,100);  
    //olive
   image(olive,300,210);
   image(olive,195,290);
   image(olive,95,195);
   image(olive,200,90);
   if (mousePressed && (mouseButton == RIGHT)) {
     image(mushroom,295,150);
     image(mushroom,150,95);
     image(mushroom,125,250);
   }
   
   
  
  
}
