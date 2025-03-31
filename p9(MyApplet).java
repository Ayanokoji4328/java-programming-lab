import java.applet.Applet;
import java.awt.*;
/*
    <applet code = "MyApplet" width = "300" height="200">
        <param name = "message" value = "Hello, Welcome to Java Applet!">
    </applet>
 */
public class MyApplet extends Applet {
    String message;
    public void init() {
        message = getParameter("message");
        if (message == null) {
            message = "Default message: Hello, Applet!";
        }
    }
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString(message, 20, 100);
    }
}