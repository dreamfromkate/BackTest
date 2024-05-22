package Logs;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogClass {
    public static Logger LOGGER = LoggerFactory.getLogger(LogClass.class);

    @Test
    public void LogExample() {
        LOGGER.info("info");
        LOGGER.warn("warn");
        LOGGER.error("error");
    }
}