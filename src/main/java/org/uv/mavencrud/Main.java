package org.uv.mavencrud;

/**
 *
 * @author Luis Angel
 */
public class Main {
    frameMain desktop;

    public Main() {
        desktop = new frameMain();
        start();
        desktop.setVisible(true);
    }

    private void start() {
        personaFrame sf = new personaFrame(
                "Persona",
                new Persona(),
                new DAOPersona(),
                "Id", "Name", "Address", "Phone"
        );

        desktop.setFrames(sf);
    }

    public static void main(String[] args) {
        Main app = new Main();
    }
}
