import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClimaAppGui().setVisible(true);
                //System.out.println(ClimaApp.getCurrentTime());
            }
        });
    }
}
