/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square carWindow;
    private Triangle roof;
    private Triangle pyramid;
    private Circle sun;
    private Circle wheel1;
    private Circle wheel2;
    private Circle wheel3;
    private Circle wheel4;
    private Person me;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        me = new Person();
        window = new Square();
        carWindow = new Square();
        roof = new Triangle();
        pyramid = new Triangle();
        sun = new Circle();
        wheel1 = new Circle();
        wheel2 = new Circle();
        wheel3 = new Circle();
        wheel4 = new Circle();
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(100);
            wall.moveVertical(20);
            wall.changeSize(55);
            wall.changeColor("blue");
            wall.makeVisible();
            
            carWindow.changeColor("magenta");
            carWindow.moveHorizontal(130);
            carWindow.moveVertical(30);
            carWindow.changeSize(20);
            carWindow.makeVisible();
            
            window.changeColor("green");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            roof.changeColor("yellow");
            roof.changeSize(100, 180);
            roof.moveHorizontal(90);
            roof.moveVertical(-40);
            roof.makeVisible();
            
            pyramid.changeColor("yellow");
            pyramid.changeSize(120, 200);
            pyramid.moveHorizontal(-100);
            pyramid.moveVertical(-60);
            pyramid.makeVisible();
            
            sun.changeColor("red");
            sun.moveHorizontal(120);
            sun.moveVertical(-80);
            sun.changeSize(80);
            sun.makeVisible();
            
            wheel1.changeColor("black");
            wheel1.moveHorizontal(180);
            wheel1.moveVertical(100);
            wheel1.changeSize(10);
            wheel1.makeVisible();
            
            wheel2.changeColor("black");
            wheel2.moveHorizontal(195);
            wheel2.moveVertical(100);
            wheel2.changeSize(10);
            wheel2.makeVisible();
            
            wheel3.changeColor("black");
            wheel3.moveHorizontal(210);
            wheel3.moveVertical(100);
            wheel3.changeSize(10);
            wheel3.makeVisible();
            
            wheel4.changeColor("black");
            wheel4.moveHorizontal(225);
            wheel4.moveVertical(100);
            wheel4.changeSize(10);
            wheel4.makeVisible();
            
            me.makeVisible();
            me.moveVertical(40);
            me.moveHorizontal(-120);
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        pyramid.changeColor("yellow");
        sun.changeColor("yellow");
    }
}
