
package temperaturas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ventana extends JFrame
{
    
    private JLabel lblTempC,lblTempF,lblResultado;
    private JTextField campoC,campoF;
    private JButton btnOk;
    private double C,F;
    
    ventana()
    {
        super();
        this.setTitle("Temperaturas");
        this.setSize(400, 150);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void componentes()
    {
        this.C = 0;
        this.F = 0;
        conversor miConversor = new conversor();
        
        lblTempC = new JLabel();
        lblTempC.setText("Grado Celcius:");
        lblTempC.setBounds(20, 20, 82, 10);
        this.add(lblTempC);
        
        lblTempF = new JLabel();
        lblTempF.setText("Grado Fahrenheit:");
        lblTempF.setBounds(20, 50, 100, 10);
        this.add(lblTempF);
        
        campoC = new JTextField();
        campoC.setBounds(104,17,40,20);
        this.add(campoC);
        
        
        campoF = new JTextField();
        campoF.setBounds(125, 47, 40, 20);
        this.add(campoF);
        
        
        lblResultado = new JLabel();
        lblResultado.setText("0");
        lblResultado.setBounds(320, 20, 100, 50);
        lblResultado.setFont(new Font("Times New Roman",Font.BOLD,26));
        this.add(lblResultado);
        
        btnOk = new JButton();
        btnOk.setText("Convertir");
        btnOk.setBounds(200, 20, 100, 50);
        this.add(btnOk);
        
        
        btnOk.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
                if(campoC.getText().equals("") && campoF.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Hey morro, no tienes nada","Neta?",JOptionPane.QUESTION_MESSAGE);
                }
                else
                {
                    if(!campoC.getText().equals(""))
                    {
                        C = Double.parseDouble(campoC.getText());
                        //JOptionPane.showMessageDialog(null,"su equivalente es: " + miConversor.convertirCaF(C) + " °F");
                        lblResultado.setText(String.valueOf(miConversor.convertirCaF(C)+ " °F"));
                        campoC.setText("");
                    }
                    else 
                    {
                        F = Double.parseDouble(campoF.getText());
                        //JOptionPane.showMessageDialog(null,"su equivalente es: " + miConversor.convertirFaC(F) + " °C");
                        lblResultado.setText(String.valueOf(miConversor.convertirFaC(F)+ " °C"));
                        campoF.setText("");
                    }
                }
            }
        }
        );
        
        
    }
    
}
