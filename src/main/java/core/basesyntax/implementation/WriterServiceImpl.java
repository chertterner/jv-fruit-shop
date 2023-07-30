package core.basesyntax.implementation;

import core.basesyntax.service.WriterService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriterServiceImpl implements WriterService {
    public void writeReport(String data, String outputPath) {
        try {
            Files.writeString(Path.of(outputPath), data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file "
                    + outputPath + System.lineSeparator(), e);
        }
    }
}