void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#ED0C0C);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#00641B);
    rect(176, 103, 12, 32);
    if (mousePressed){
      fill(#C9C9C9);
      ellipse(90, 200,45,45);
    }
}
