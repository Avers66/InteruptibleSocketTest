import javax.swing.*;
import java.awt.*;

/**
 * InteruptibleSocketTest
 *
 * @Author Tretyakov Alexandr
 */

public class InteruptibleSocketTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            var frame = new InterruptibleSocketFrame();
            frame.setTitle("InterruptibleSocketTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
