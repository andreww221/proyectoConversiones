
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import view.*;

public class main {

    public static void main(String[] args) {

        //VENTANA PRINCIPAL
        viewOptionsConversor vp = new viewOptionsConversor();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        vp.setLocation((width / 2) - 198, (height / 2) - 237);
        vp.setVisible(true);

        //VENTANA CONVERSOR DE MONEDAS
        viewConversorMonedas vc = new viewConversorMonedas();
        vc.setLocation((width / 2) - 198, (height / 2) - 237);
        vc.setVisible(false);

        //VENTANA CONVERSOR DE TEMPERATURAS
        viewConversorTemperaturas vcp = new viewConversorTemperaturas();
        vcp.setLocation((width / 2) - 198, (height / 2) - 237);
        vcp.setVisible(false);

        //BOTONES DE HOME PARA CADA VENTANA
        JLabel home = vcp.homeTemperatura();
        JLabel home2 = vc.homeTemperatura();

        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vcp.setVisible(false);
                vp.setVisible(true);
            }

        });

        home2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vc.setVisible(false);
                vp.setVisible(true);
            }

        });

        //BOTONES DE LA VENTANA PRINCIPAL PARA INVOCAR ALGUNA DE LAS 2 VENTANAS 
        
        JButton boton = vp.botonMonedas();
        JButton boton2 = vp.botonTemperaturas();

        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                vp.setVisible(false);
                vc.setVisible(true);
            }
        };

        ActionListener al1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                vp.setVisible(false);
                vcp.setVisible(true);
            }
        };

        boton.addActionListener(al);
        boton2.addActionListener(al1);

    }

}
