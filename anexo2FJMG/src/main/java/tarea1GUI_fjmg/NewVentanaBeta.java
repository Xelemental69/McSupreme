/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1GUI_fjmg;

/**
 *
 * @author fco-j
 */
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class NewVentanaBeta {
    
    public static void main(String[] args) {

	// Construimos la ventana
	JFrame ventanaPrincipal = new JFrame ("PINGAS");

	// Establecemos tamaño y posición
	ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

	// Añadimos un objeto MiPanel al JFrame
	ventanaPrincipal.add(new NewPanelolClass(Color.cyan));

	// Hacemos visible la ventana
	ventanaPrincipal.setVisible(true);

	// Acción por defecto al pulsar el botón de cierre de la ventana
	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    
}
