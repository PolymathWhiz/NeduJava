import java.util.Random;

/**
 *
 * @author miracleanyanwu
 */
public class NeduJava {

    /**
     * Generates an hexadecimal color code when called
     */
    public void colorCodeGenerator() {

        StringBuilder colorCode = new StringBuilder();
        colorCode.append('#');

        for (int i = 0; i < 6; i++) {

            colorCode.append(Integer.toHexString((new Random().nextInt(16))));

        }
        System.out.println(colorCode);
    }

}
