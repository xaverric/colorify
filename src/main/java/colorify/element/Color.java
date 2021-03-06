package colorify.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "color")
@XmlType(propOrder = {"red", "green", "blue"})
public class Color {

    private int red;
    private int green;
    private int blue;

    public int getRed() {
        return red;
    }

    @XmlElement(name = "red")
    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    @XmlElement(name = "green")
    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    @XmlElement(name = "blue")
    public void setBlue(int blue) {
        this.blue = blue;
    }

    public double getRedXYZ() {
        return red / 255.0;
    }

    public double getGreenXYZ() {
        return green / 255.0;
    }

    public double getBlueXYZ() {
        return blue / 255.0;
    }

    public String getHex() {
        String hex = "#";
        hex += String.format("%02X", red);
        hex += String.format("%02X", green);
        hex += String.format("%02X", blue);
        return hex;
    }

    public java.awt.Color getAwtColor(){
        return new java.awt.Color(red, green, blue);
    }

    public javafx.scene.paint.Color getFXColor(){
        return new javafx.scene.paint.Color(red, green,blue,1);
    }
}
