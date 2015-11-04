package models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Gera uma tabela
@SuppressWarnings("serial")
@Entity
@Table(name = "ANUNCIO")
public class Anuncio implements Serializable{

	//Gera um ID
	@Id
	@GeneratedValue
	private long id;
	
	//Gera uma coluna
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="contato")
	private ArrayList<String> contato;

	//criacao da data
	@Temporal(TemporalType.DATE)
	@Column(name = "data")
	private static Calendar dataDeCriacaoAnuncio;

	@Column(name="finalidadeAnuncio")
	private String finalidadeAnuncio;
	
	@Column(name="instrumentos")
	private ArrayList<String> instrumentos;
	
	@Column(name="listaEstiloGosta", nullable = true)
	private ArrayList<String> estiloGosta;
	
	@Column(name="listaEstiloNaoGosta", nullable = true)
	private ArrayList<String> estiloNaoGosta;
	
	@Column(name="excluir")
	private String excluir;
	
	
	//Construtor default
	public Anuncio(){
		setDataDeCriacaoAnuncio(Calendar.getInstance());
		
	}
	//Construtor com parâmetros
	public Anuncio(String titulo, String cidade, String bairro, String finalidadeAnuncio, String descricao, ArrayList<String> contato, ArrayList<String> instrumentos, ArrayList<String> estiloGosta, ArrayList<String> estiloNaoGosta, String excluir) throws Exception{
		setTitulo(titulo);
		setCidade(cidade);
		setBairro(bairro);
		setDescricao(descricao);
		
		setFinalidadeAnuncio(finalidadeAnuncio);
		setDataDeCriacaoAnuncio(Calendar.getInstance());
		
		setInstrumentos(instrumentos);
		setEstiloGosta(estiloGosta);
		setEstiloNaoGosta(estiloNaoGosta);
		
		setExcluir(excluir);
	}

	
	
	//Sets and Gets
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) throws Exception {
		if (titulo.trim().equals("") || titulo == null) {
			throw new Exception("Insira um titulo ao anuncio");
		}
		this.titulo = titulo;
	}

	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) throws Exception {
		if (cidade.trim().equals("") || cidade == null){
			throw new Exception("Insira uma cidade");
		}
		this.cidade = cidade;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) throws Exception {
		if(bairro.trim().equals("") || bairro == null){
			throw new Exception("Insira um bairro");
		}
		this.bairro = bairro;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) throws Exception{
		if(descricao.equals("") || descricao == null){
			throw new Exception("Insira uma descrição para o seu anúncio");
		}
		this.descricao = descricao;
	}
	
	public ArrayList<String> getContato() {
		return contato;
	}
	
	public void setContato(ArrayList<String> contato) throws Exception{
		if(contato.isEmpty() || contato == null){
			throw new Exception("Digite um contato por favor.");
		}
		this.contato = contato;
	}
	
	public Calendar getDataDeCriacaoAnuncio() {
		return dataDeCriacaoAnuncio;
	}
	
	public void setDataDeCriacaoAnuncio(Calendar dataDeCriacaoAnuncio) {
		this.dataDeCriacaoAnuncio = dataDeCriacaoAnuncio;
	}
	
	public String getData(){
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
		String dataDeCriacao = formatar.format(this.getDataDeCriacaoAnuncio().getTime());
		return dataDeCriacao;
	}
	
	public String getFinalidadeAnuncio() {
		return finalidadeAnuncio;
	}
	
	public void setFinalidadeAnuncio(String finalidadeAnuncio) throws Exception{
		if(finalidadeAnuncio.equals("") || finalidadeAnuncio == null){
			throw new Exception("Escolha qual a finalidade do seu anuncio");
		}
		this.finalidadeAnuncio = finalidadeAnuncio;
	}
	
	
	public ArrayList<String> getInstrumentos() {
		return instrumentos;
	}
	
	public void setInstrumentos(ArrayList<String> instrumentos) throws Exception{
		if (instrumentos.isEmpty() || instrumentos == null){
			throw new Exception("Escolha ao menos um instrumento");
		}
		this.instrumentos = instrumentos;
	}

	public ArrayList<String> getEstiloGosta() {
		return estiloGosta;
	}
	
	public void setEstiloGosta(ArrayList<String> estiloGosta){
		this.estiloGosta = estiloGosta;
	}
	
	public ArrayList<String> getEstiloNaoGosta() {
		return estiloNaoGosta;
	}
	
	public void setEstiloNaoGosta(ArrayList<String> estiloNaoGosta){
		this.estiloNaoGosta = estiloNaoGosta;
	}
	
	public String getExcluir() {
		return excluir;
	}
	public void setExcluir(String excluir) throws Exception{
		if(excluir.trim().equals("") || excluir == null){
			throw new Exception("Insira uma palavra para futuramente excluir este anúncio.");
		}
		this.excluir = excluir;
	} 

}
