package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConsultaClienteUI extends JInternalFrame {
	private JTable jtListaClientes;
	private JTextField jtfPesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaClienteUI frame = new ConsultaClienteUI();
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
	public ConsultaClienteUI() {
		setTitle("Consulta de Clientes");
		setBounds(100, 100, 450, 326);
		
		JPanel jpConsultaCliente = new JPanel();
		jpConsultaCliente.setBorder(new TitledBorder(null, "Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton jbEditar = new JButton("Editar");
		
		JButton jbExcluir = new JButton("Excluir");
		
		JButton jbInserir = new JButton("Inserir");
		
		JButton jbCancelar = new JButton("Cancelar");
		
		JButton jbAtualizar = new JButton("Atualizar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jpConsultaCliente, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jbEditar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jbExcluir)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jbInserir)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jbAtualizar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jbCancelar)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpConsultaCliente, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbEditar)
						.addComponent(jbExcluir)
						.addComponent(jbInserir)
						.addComponent(jbAtualizar)
						.addComponent(jbCancelar))
					.addContainerGap())
		);
		
		JScrollPane jspListaClientes = new JScrollPane();
		
		JLabel jlPesquisa = new JLabel("Pesquisa:");
		
		jtfPesquisa = new JTextField();
		jtfPesquisa.setColumns(10);
		
		JButton jbBuscar = new JButton("Buscar");
		GroupLayout gl_jpConsultaCliente = new GroupLayout(jpConsultaCliente);
		gl_jpConsultaCliente.setHorizontalGroup(
			gl_jpConsultaCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpConsultaCliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpConsultaCliente.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpConsultaCliente.createSequentialGroup()
							.addComponent(jlPesquisa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jtfPesquisa, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jbBuscar))
						.addComponent(jspListaClientes, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_jpConsultaCliente.setVerticalGroup(
			gl_jpConsultaCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpConsultaCliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpConsultaCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlPesquisa)
						.addComponent(jtfPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbBuscar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jspListaClientes, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		
		jtListaClientes = new JTable();
		jtListaClientes.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "Nome", "CPF"
			}
		));
		jspListaClientes.setViewportView(jtListaClientes);
		jpConsultaCliente.setLayout(gl_jpConsultaCliente);
		getContentPane().setLayout(groupLayout);

	}
}
