
void setup() {
PImage face = loadImage("face.jpeg");
size(500, 500);
face.resize(width, height);
image(face, 0, 0);

}
void draw() {
fill(mouseX, mouseY, mouseX);
ellipse(165, 240, 110, 120);
ellipse(325, 240, 110, 120);
fill(0,0,0);
ellipse(165,240,10,20);
ellipse(325, 240, 10, 20);

}
