import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new SkoolConverter(false).convert(
            new File("zx spectrum/mm.skool"),
            new File("src/temp.a99"),
            0x4000
        );
    }
}
