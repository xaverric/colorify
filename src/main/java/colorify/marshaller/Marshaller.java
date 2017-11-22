package colorify.marshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.net.URISyntaxException;

public class Marshaller<T> {

    public T unmarshal(Class<T> clazz, String source) throws JAXBException, URISyntaxException {
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (T) jaxbUnmarshaller.unmarshal(getFileAsStream(source));
    }

    private InputStream getFileAsStream(String path) {
        return this.getClass().getClassLoader().getResourceAsStream(path);
    }
}
