function setup() {
    createCanvas(500, 500);
  background("black");
  }
  
  function draw() {
    
  
    stroke("white");
    fill("white");
  
    // console.log(mouseIsPressed);
  
    if (mouseIsPressed) {
      rect(mouseX, mouseY, 20, 30);
    }
  }

  