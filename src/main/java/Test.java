
import com.google.common.base.Ascii;
import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string!");
        String userInput = scanner.nextLine();
        if (StringUtils.isNumeric(userInput)){
            System.out.println("That's a number not a string");
        } else {
            System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
            System.out.println("Reversed: " + StringUtils.reverse(userInput));
        }

        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        builder.width(420).height(20);
        builder.element(new PseudoText(userInput));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);




    }
}
