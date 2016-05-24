package dao;

import java.util.ArrayList;

import model.Produto;

public class ProdutoDAO {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private static ProdutoDAO produtoDao;
	
	public static ProdutoDAO obterInstancia(){
		if ( produtoDao == null){
			produtoDao = new ProdutoDAO();
		}
		return produtoDao;
	}

	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
}
