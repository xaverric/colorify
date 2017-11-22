package colorify.element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "palette")
@XmlAccessorType(XmlAccessType.FIELD)
public class Palette {

    @XmlElement(name = "color")
    private List<Color> colors;

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> palette) {
        this.colors = palette;
    }
}
