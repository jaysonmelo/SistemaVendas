package dao;

import java.util.ArrayList;

import model.Venda;

public class VendaDAO {

	private ArrayList<Venda> listaVendas = new ArrayList<Venda>();
	private static VendaDAO vendaDao;
	
	public static VendaDAO obterInstancia(){
		if ( vendaDao == null){
			vendaDao = new VendaDAO();
		}
		return vendaDao;
	}

	public ArrayList<Venda> getListaVendas() {
		return listaVendas;
	}

	public void setListaVendas(ArrayList<Venda> listaVendas) {
		this.listaVendas = listaVendas;
	}
	
}
