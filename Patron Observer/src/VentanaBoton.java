/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tonny
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class VentanaBoton extends JFrame implements Observer, ActionListener {

    JLabel titulo;
    int colorSeleccionado;
    JButton miBoton;
    ClaseObservador miObservador;

    public VentanaBoton(ClaseObservador observador) {

        miObservador = observador;
        miBoton = new JButton();
        miBoton.setBounds(5, 40, 75, 25);
        miBoton.addActionListener(this);

        titulo = new JLabel();
        titulo.setText("BOTON DE COLORES");
        titulo.setBounds(20, 10, 150, 25);

        add(titulo);
        add(miBoton);

        setSize(200, 200);
        setTitle("Ventana Color");
        setLocation(1000, 250);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        colorSeleccionado = miObservador.getColorSeleccionado();

        switch (colorSeleccionado) {

            case 1:
                miBoton.setBackground(Color.yellow);
                break;
            case 2:
                miBoton.setBackground(Color.blue);
                break;

            case 3:
                miBoton.setBackground(Color.red);
                break;

            case 4:
                miBoton.setBackground(Color.green);
                break;

            case 5:
                miBoton.setBackground(Color.black);
                break;
            case 6:
                miBoton.setBackground(Color.white);
                break;

            default:
                miBoton.setBackground(null);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
