package core;

import generator.PaletteGenerator;
import xml.element.ColorPalettes;
import xml.element.Palette;
import xml.marshaller.Marshaller;

import javax.xml.bind.JAXBException;
import java.net.URISyntaxException;

public class Colorify {

    private static final String FILE_PATH = "palettes.xml";

    private ColorPalettes colorPalettes;

    public Colorify() {
        init();
    }

    private void init(){
        try {
            Marshaller<ColorPalettes> m = new Marshaller();
            this.colorPalettes = m.unmarshal(ColorPalettes.class, FILE_PATH);
        } catch (JAXBException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public Palette getPalette(){
        PaletteGenerator<Palette> generator = new PaletteGenerator<Palette>();
        return generator.getRandom(colorPalettes.getPaletteList());
    }
}
