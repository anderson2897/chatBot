package vista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import modelo.ModeloBot;
public class VistaBot extends JFrame implements ActionListener{
    
    ModeloBot mB;
    JButton boton;
    JTextField entrada;
    JTextField salida;
    JLabel titulo;
    
    
    public VistaBot() {
        setBounds(0, 0, 500, 500);
        setLayout(new FlowLayout());
        mB = new ModeloBot();
        entrada = new JTextField(20);
        salida = new JTextField(20);
        titulo = new JLabel("ChatBot");
        boton = new JButton("Enviar");
        salida.setFocusable(false);//para impedir que se modifique le JTextField
        boton.addActionListener(this);
        
        //add metodo para añadir en el JFrame
        add(titulo);
        add(entrada);
        add(boton);
        add(salida);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }//constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        salida.setText(mB.dialogo(entrada.getText()));
    }//boton
    
    
}//VistaBot
