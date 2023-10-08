import javax.swing.*; /*Es una biblioteca gráfica para Java. 
Incluye widgets para interfaz gráfica de usuario tales como cajas de texto, 
botones, listas desplegables y tablas. */

public class Ventana extends JFrame{ /*JFrame es una biblioteca gráfica para Java. Incluye widgets 
para interfaz gráfica de usuario tales como cajas de texto, botones, listas desplegables y tablas. */
    
    private JLabel etiqueta; /*Declarar etiqueta */
    private JTextField texto; /*Declarar un caja de texto */
    
    public Ventana(){ /*Aquí se asignan las propiedades de nuestra etiqueta y nuestra ventana*/
        setTitle("Bienvenido");
        setLayout(null); /*Habilitar la ventana para editar*/

        etiqueta = new JLabel("NOMBRE"); /*Constructor etiqueta*/
        etiqueta.setBounds(40,20,100,35);
        add(etiqueta);

        texto = new JTextField(""); /*Constructor caja de texto */
        texto.setBounds(210,20,250,35);
        add(texto);
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setBounds(0,0,500,700);/*Medidas de la ventana */
        ventana.setVisible(true);/*Hacerla visible */
        ventana.setLocationRelativeTo(null); /*Centrar ventana */        
    }
}