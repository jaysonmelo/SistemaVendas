package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class CadastroClienteUI extends JInternalFrame {
	private JTextField jtfNomeCliente;
	private JTextField jtfCpfCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClienteUI frame = new CadastroClienteUI();
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
	public CadastroClienteUI() {
		setResizable(true);
		setClosable(true);
		setTitle("Cadastro de Cliente");
		setBounds(100, 100, 405, 204);
		
		JPanel jpCadastroCliente = new JPanel();
		jpCadastroCliente.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton jbSalvar = new JButton("Salvar");
		
		JButton jbCancelar = new JButton("Cancelar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jpCadastroCliente, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jbSalvar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jbCancelar))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpCadastroCliente, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbSalvar)
						.addComponent(jbCancelar))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel jlNomeCliente = new JLabel("Nome:");
		
		JLabel jlCpf = new JLabel("CPF:");
		
		jtfNomeCliente = new JTextField();
		jtfNomeCliente.setColumns(10);
		
		jtfCpfCliente = new JTextField();
		jtfCpfCliente.setColumns(10);
		GroupLayout gl_jpCadastroCliente = new GroupLayout(jpCadastroCliente);
		gl_jpCadastroCliente.setHorizontalGroup(
			gl_jpCadastroCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroCliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroCliente.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpCadastroCliente.createSequentialGroup()
							.addComponent(jlNomeCliente)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jtfNomeCliente, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
						.addGroup(gl_jpCadastroCliente.createSequentialGroup()
							.addComponent(jlCpf)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(jtfCpfCliente, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_jpCadastroCliente.setVerticalGroup(
			gl_jpCadastroCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroCliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlNomeCliente)
						.addComponent(jtfNomeCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_jpCadastroCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCpf)
						.addComponent(jtfCpfCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(157, Short.MAX_VALUE))
		);
		jpCadastroCliente.setLayout(gl_jpCadastroCliente);
		getContentPane().setLayout(groupLayout);

	}
}
