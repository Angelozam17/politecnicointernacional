package UML;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;

public class uml extends JFrame {

	private JPanel contentPane;
	private JTextField weight;
	private JTextField age;
	private JTextField height;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	double weight_v[] = new double[4];
	double height_v[] = new double[4];
	String id_v[] = new String[4];
	byte age_v[] = new byte[4];
	
	byte i = 0;
	double imc_v;
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uml frame = new uml();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public void limpiar() {
		
		weight.setText("");
		id.setText("");
		height.setText("");
		age.setText("");
	}
	
	public uml() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNRegistro = new JLabel("N\u00B0 registro");
		lblNRegistro.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		
		JLabel registro = new JLabel("0");
		registro.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		
		JLabel lblImc_1 = new JLabel("IMC");
		lblImc_1.setFont(new Font("Calibri Light", Font.BOLD, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(208)
					.addComponent(lblImc_1)
					.addGap(70)
					.addComponent(lblNRegistro)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(registro))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(registro)
						.addComponent(lblNRegistro))
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(15, Short.MAX_VALUE)
					.addComponent(lblImc_1)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblPeso = new JLabel("Peso: ");
		
		weight = new JTextField();
		weight.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad: ");
		
		age = new JTextField();
		age.setColumns(10);
		
		JLabel lblEstatura = new JLabel("Estatura: ");
		
		height = new JTextField();
		height.setColumns(10);
		
		JLabel lblId = new JLabel("ID: ");
		
		id = new JTextField();
		id.setColumns(10);
		
		JLabel imc = new JLabel("0");
		imc.setVerticalAlignment(SwingConstants.BOTTOM);
		imc.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		imc.setForeground(Color.DARK_GRAY);
		imc.setHorizontalAlignment(SwingConstants.LEFT);
		imc.setBackground(Color.DARK_GRAY);
		
		JLabel status = new JLabel("Escribe algunos datos");
		status.setVerticalAlignment(SwingConstants.BOTTOM);
		status.setHorizontalAlignment(SwingConstants.LEFT);
		status.setForeground(Color.BLACK);
		status.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		status.setBackground(Color.DARK_GRAY);
		
		JLabel valor = new JLabel("");
		valor.setHorizontalAlignment(SwingConstants.CENTER);
		valor.setForeground(Color.WHITE);
		valor.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		valor.setBackground(Color.DARK_GRAY);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		
		JLabel lblEstado = new JLabel("Estado");
		
		JLabel lblValorKilos = new JLabel("Valor kilos");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEstatura)
								.addComponent(lblPeso)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(28)
							.addComponent(lblImc)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(imc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnMostrar, Alignment.TRAILING)
						.addComponent(height)
						.addComponent(weight, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
					.addGap(53)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addComponent(lblValorKilos)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(valor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addComponent(lblEstado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(status, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addComponent(lblEdad)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(age, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addComponent(lblId)
							.addGap(18)
							.addComponent(id)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblEdad))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPeso))
						.addComponent(weight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblEstatura)
							.addComponent(height, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblId)))
					.addGap(37)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblEstado, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
							.addComponent(status, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(imc)
						.addComponent(lblImc, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnMostrar)
							.addComponent(lblValorKilos, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addComponent(valor, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(12))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnCapturar = new JButton("CAPTURAR");
		btnCapturar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				weight_v[i] = Double.parseDouble(weight.getText());		
				height_v[i] = Double.parseDouble(height.getText());	
				age_v[i] = Byte.parseByte(age.getText());	
				id_v[i] = id.getText();
				i++;
				registro.setText("" + i);
				
				limpiar();
				
			}
		});
		panel_2.add(btnCapturar);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limpiar();
				
			}
		});
		panel_2.add(btnLimpiar);
		
		JButton btnEstadsticas = new JButton("ESTAD\u00CDSTICAS");
		btnEstadsticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imc_v = (Double.parseDouble(weight.getText()) / (Double.parseDouble(height.getText()) * Double.parseDouble(height.getText())));
				imc.setText("" + imc_v);
				
				if(imc_v <= 18.5) status.setText("Estás demasiado delgado.");
				else if(imc_v > 18.8 && imc_v <= 24.9) status.setText("Estás en el peso ideal.");
				else if(imc_v > 24.9 && imc_v <= 29.9) status.setText("Estás en sobrepeso.");
				else if(imc_v > 29.9 && imc_v <= 39.9) status.setText("Estás obeso.");
				else if(imc_v > 39.9) status.setText("Obesidad mórbida.");
				
			}
		});
		panel_2.add(btnEstadsticas);
		
		JButton btnSalir = new JButton("SALIR");
		panel_2.add(btnSalir);
	}
}
