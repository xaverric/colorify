package xml.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "color")
@XmlType(propOrder = { "red", "green", "blue"})
public class Color {

    private int red;
    private int green;
    private int blue;


    public int getRed() {
        return red;
    }

    @XmlElement(name="red")
    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    @XmlElement(name="green")
    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    @XmlElement(name="blue")
    public void setBlue(int blue) {
        this.blue = blue;
    }
}
