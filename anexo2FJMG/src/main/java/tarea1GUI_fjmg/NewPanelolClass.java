/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fjmg.tarea1GUI;

/**
 *
 * @author fco-j
 */
import java.awt.Color;
import javax.swing.*;


public class NewPanelolClass extends JPanel {
    
    // Añadimos un componente de tipo slaps (JLabel)
	private JLabel slaps;
    
	// Constructor pasando un color, que llama al método initComponents(), 
	public NewPanelolClass(Color color){
            
   		initComponents();
		cambiarColorFondo(color);
                
	}
    
	// Método que inicializa los elementos gráficos del formulario
	private void initComponents(){
            
		// Construimos la slaps con el texto que queremos que muestre
    		slaps = new JLabel("<html> <h1 align= \"center\">Teoría de enlaces</h1>\n" +
"        <p>Para más información visite <a href=\"https://www.google.es\">Google</a></p>\n" +
"        <p>Si le apetece, ve a esta <a href=\"https://www.youtube.com/watch?v=9ha5ujHnYXg\">página</a>, o a <a href=\"https://www.youtube.com/watch?v=9ha5ujHnYXg\">esta</a>.\n" +
"        </p>\n" +
"        </html>");
                
		// Añade la slaps al contenedor MiPanel (al JPanel)
    		this.add(slaps);
                
	}
	
	private void cambiarColorFondo(Color color){
            
		// Establece el color de fondo del panel
    		this.setBackground(color);
                
	}

	// Método getter
	public JLabel getSlaps() { 
            
    		return slaps;
                
	}

    
}
