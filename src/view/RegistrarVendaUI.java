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
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RegistrarVendaUI extends JInternalFrame {
	private JTextField jtfCodigo;
	private JTextField jtfDataVenda;
	private JTextField jtfQtde;
	private JTable jtItensVenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarVendaUI frame = new RegistrarVendaUI();
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
	public RegistrarVendaUI() {
		setTitle("Registro de Vendas");
		setBounds(100, 100, 574, 362);
		
		JPanel jpRegistroVendas = new JPanel();
		jpRegistroVendas.setBorder(new TitledBorder(null, "Registro de Vendas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton jbRegistrarVenda = new JButton("Registrar Venda");
		
		JButton jbCancelar = new JButton("Cancelar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jpRegistroVendas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jbRegistrarVenda)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jbCancelar)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpRegistroVendas, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbRegistrarVenda)
						.addComponent(jbCancelar))
					.addContainerGap())
		);
		
		JLabel jlCodigo = new JLabel("Código:");
		
		jtfCodigo = new JTextField();
		jtfCodigo.setColumns(10);
		
		JLabel jlDataVenda = new JLabel("Data da Venda:");
		
		jtfDataVenda = new JTextField();
		jtfDataVenda.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		
		JComboBox jcbListaClientes = new JComboBox();
		
		JPanel jpItensVenda = new JPanel();
		jpItensVenda.setBorder(new TitledBorder(null, "Itens da Venda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_jpRegistroVendas = new GroupLayout(jpRegistroVendas);
		gl_jpRegistroVendas.setHorizontalGroup(
			gl_jpRegistroVendas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpRegistroVendas.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpRegistroVendas.createParallelGroup(Alignment.LEADING)
						.addComponent(jpItensVenda, GroupLayout.PREFERRED_SIZE, 509, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jpRegistroVendas.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_jpRegistroVendas.createSequentialGroup()
								.addComponent(jlCodigo)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jtfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(jlDataVenda)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jtfDataVenda, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_jpRegistroVendas.createSequentialGroup()
								.addComponent(lblCliente)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jcbListaClientes, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_jpRegistroVendas.setVerticalGroup(
			gl_jpRegistroVendas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpRegistroVendas.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpRegistroVendas.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCodigo)
						.addComponent(jtfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlDataVenda)
						.addComponent(jtfDataVenda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jpRegistroVendas.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCliente)
						.addComponent(jcbListaClientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jpItensVenda, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JLabel jlQtde = new JLabel("Qtde:");
		
		jtfQtde = new JTextField();
		jtfQtde.setColumns(10);
		
		JLabel lblProduto = new JLabel("Produto:");
		
		JComboBox jcbListaProdutos = new JComboBox();
		
		JButton jbAdicionar = new JButton("Adicionar");
		
		JScrollPane jspItensVenda = new JScrollPane();
		
		JButton jbRemoverItem = new JButton("Remover Item");
		
		JLabel jlValorTotalVenda = new JLabel("R$ 1900,00");
		GroupLayout gl_jpItensVenda = new GroupLayout(jpItensVenda);
		gl_jpItensVenda.setHorizontalGroup(
			gl_jpItensVenda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpItensVenda.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpItensVenda.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpItensVenda.createSequentialGroup()
							.addGroup(gl_jpItensVenda.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jpItensVenda.createSequentialGroup()
									.addComponent(jlQtde)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jtfQtde, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblProduto)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jcbListaProdutos, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jbAdicionar))
								.addComponent(jspItensVenda, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_jpItensVenda.createSequentialGroup()
							.addComponent(jbRemoverItem)
							.addPreferredGap(ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
							.addComponent(jlValorTotalVenda)
							.addGap(59))))
		);
		gl_jpItensVenda.setVerticalGroup(
			gl_jpItensVenda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpItensVenda.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpItensVenda.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlQtde)
						.addComponent(jtfQtde, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProduto)
						.addComponent(jcbListaProdutos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbAdicionar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jspItensVenda, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_jpItensVenda.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbRemoverItem)
						.addComponent(jlValorTotalVenda))
					.addContainerGap())
		);
		
		jtItensVenda = new JTable();
		jtItensVenda.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Descri\u00E7\u00E3o Produto", "Valor Unit\u00E1rio(R$)", "Qtde", "Valor Total Item(R$)"
			}
		));
		jspItensVenda.setViewportView(jtItensVenda);
		jpItensVenda.setLayout(gl_jpItensVenda);
		jpRegistroVendas.setLayout(gl_jpRegistroVendas);
		getContentPane().setLayout(groupLayout);

	}
}
