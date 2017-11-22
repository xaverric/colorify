package colorify;

import colorify.generator.PaletteGenerator;
import colorify.element.ColorPalettes;
import colorify.element.Palette;
import colorify.marshaller.Marshaller;

import javax.xml.bind.JAXBException;
import java.net.URISyntaxException;

public class Colorify {

    private static final String FILE_PATH = "palettes.xml";

    private ColorPalettes colorPalettes;

    public Colorify() {
        init();
    }

    private void init() {
        try {
            Marshaller<ColorPalettes> m = new Marshaller();
            this.colorPalettes = m.unmarshal(ColorPalettes.class, FILE_PATH);
        } catch (JAXBException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public Palette getPalette() {
        PaletteGenerator<Palette> generator = new PaletteGenerator<>();
        return generator.getRandom(colorPalettes.getPaletteList());
    }
}
