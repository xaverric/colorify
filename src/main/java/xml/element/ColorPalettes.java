package xml.element;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "colorpalettes")
@XmlAccessorType(XmlAccessType.FIELD)
public class ColorPalettes {

    @XmlElement(name = "palette")
    private List<Palette> paletteList;


    public List<Palette> getPaletteList() {
        return paletteList;
    }

    public void setPaletteList(List<Palette> paletteList) {
        this.paletteList = paletteList;
    }
}
