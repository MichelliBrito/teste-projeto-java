package br.com.michelli.models;



import javax.persistence.Embeddable;


@Embeddable
public class Materias {
	
	private String nomeMateria;
	private TipoMateria tipoMateria;

	public String getNomeMateria() {
		return nomeMateria;
	}
	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	public TipoMateria getTipo() {
		return tipoMateria;
	}
	public void setTipo(TipoMateria tipo) {
		this.tipoMateria = tipo;
	}

	

	//public String getNomeMateria() {
		//return nomeMateria;
	//}

	//public void setNomeMateria(String nomeMateria) {
		//this.nomeMateria = nomeMateria;
		//listaMaterias.add(nomeMateria);
	//}

	//public List<String> getListaMaterias() {
		//return listaMaterias;
	//}

}
