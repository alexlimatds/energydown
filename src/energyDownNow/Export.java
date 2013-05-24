/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energyDownNow;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import energyDownNow.cenario.cenarioFacil.CenarioFacil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author lobao
 */
public class Export {

    public static void main(String[] args) {
        XStream xstream = new XStream(new StaxDriver());
        
        try {
            FileOutputStream fs = new FileOutputStream("src/energyDownNow/cenario/cenarioFacil.xml");
            xstream.toXML(CenarioFacil.getCenario(), fs);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
