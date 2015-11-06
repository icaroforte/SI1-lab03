package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


import javax.persistence.Query;
import models.Anuncio;
import models.DAO.GenericDAO;
import play.*;
import play.data.Form;
import play.data.DynamicForm;
import play.db.jpa.Transactional;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	//Acessar os metodos de persistencia.
	private static final GenericDAO dao = new GenericDAO();	
	
	//Pega o que tiver no banco de dados com a entidade Anuncio.
	@Transactional
    public Result home() {
        return ok(home.render("Your new application is ready.", dao.findAllByClass(Anuncio.class)));
    }
    public Result cadastro(){
	    return ok(views.html.cadastro.render());
   }
    
    @Transactional
	public Result novoAnuncio() {
		
    	
    	Anuncio anuncio = new Anuncio();
    	DynamicForm requestAnuncio = Form.form().bindFromRequest();
    	requestAnuncio.bindFromRequest("instrumentos");
    	
		try {
			/*
			 * Informacoes do anuncio
			 */
			
			anuncio.setTitulo(requestAnuncio.get("titulo"));
			anuncio.setCidade(requestAnuncio.get("cidade"));
			anuncio.setBairro(requestAnuncio.get("bairro"));
			anuncio.setDescricao(requestAnuncio.get("descricao"));
			anuncio.setFinalidadeAnuncio(requestAnuncio.get("finalidadeAnuncio"));
			anuncio.setInstrumentos(getListaInstrumentos());
			anuncio.setEstiloGosta(getListaEstiloGosta());
			anuncio.setEstiloNaoGosta(getListaEstiloNaoGosta());
			anuncio.setContato(getListaContato());
			anuncio.setExcluir(requestAnuncio.get("excluir"));
			
			//persistencia dos dados
			dao.persist(anuncio);
			dao.flush();
			
			
		} catch (Exception e) {
			e.getMessage();
			return redirect(routes.Application.cadastro());
		}

		return redirect(routes.Application.home());
			
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
	public Result pesquisarAnuncio(){
		DynamicForm requestPesquisa = Form.form().bindFromRequest();
		
		if(requestPesquisa.get("pesquisa").equals("titulo")){
			Query consultaTitulo =	dao.createQuery("FROM Anuncio a WHERE a.titulo LIKE :titulo");
			consultaTitulo.setParameter("titulo", "%"+requestPesquisa.get("valuePesquisa")+"%");
			
			return ok(views.html.home.render("Our Sound", consultaTitulo.getResultList()));
			
		}else if(requestPesquisa.get("pesquisa").equals("cidade")){
			Query consultaCidade =	dao.createQuery("FROM Anuncio a WHERE a.cidade LIKE :cidade");
			consultaCidade.setParameter("cidade", "%"+requestPesquisa.get("valuePesquisa")+"%");
			
			return ok(views.html.home.render("Our Sound", consultaCidade.getResultList()));
		
		}else if(requestPesquisa.get("pesquisa").equals("bairro")){
			Query consultaBairro =	dao.createQuery("FROM Anuncio a WHERE a.bairro LIKE :bairro");
			consultaBairro.setParameter("bairro", "%"+requestPesquisa.get("valuePesquisa")+"%");
			
			return ok(views.html.home.render("Our Sound", consultaBairro.getResultList()));
		
		}else if(requestPesquisa.get("pesquisa").equals("banda")){
			Query consultaFinalidade =	dao.createQuery("FROM Anuncio a WHERE a.titulo LIKE :finalidadeAnuncio AND a.finalidadeAnuncio = 'Banda' ");
			//"FROM Anuncio a WHERE a.anunciante.id in (SELECT n.id FROM Anunciante n WHERE n.ondeTocar = :parametro)"
			//"FROM Anuncio a WHERE a.titulo LIKE :palavra OR a.descricao LIKE :palavra"
			//"SELECT a FROM Anuncio a, Instrumento i WHERE i.nome = :instrumento"
			consultaFinalidade.setParameter("finalidadeAnuncio", "%"+requestPesquisa.get("valuePesquisa")+"%");
			
			return ok(views.html.home.render("Our Sound", consultaFinalidade.getResultList()));
		
		}else if(requestPesquisa.get("pesquisa").equals("ocasionalmente")){
			Query consultaFinalidade =	dao.createQuery("FROM Anuncio a WHERE a.titulo LIKE :finalidadeAnuncio AND a.finalidadeAnuncio = 'Tocar Ocasionalmente' ");
			consultaFinalidade.setParameter("finalidadeAnuncio", "%"+requestPesquisa.get("valuePesquisa")+"%");
			
			return ok(views.html.home.render("Our Sound", consultaFinalidade.getResultList()));
		
		}else if(requestPesquisa.get("pesquisa").equals("instrumentos")){
			
			Query consultaInstrumentos =	dao.createQuery("FROM Anuncio");
			
			List<Anuncio> listAnuncio = new ArrayList<>();
		
			for(Object anuncio : consultaInstrumentos.getResultList()){
				for(String instrumento : ((Anuncio) anuncio).getInstrumentos()){
					if(requestPesquisa.get("valuePesquisa").toLowerCase().equals(instrumento.toLowerCase())){
						listAnuncio.add(((Anuncio) anuncio));
					}
				}
			}
			
			return ok(views.html.home.render("Our Sound", listAnuncio));
		
		}else if(requestPesquisa.get("pesquisa").equals("estilo")){
			
			Query consultaEstilo =	dao.createQuery("FROM Anuncio");
			
			List<Anuncio> listAnuncio = new ArrayList<>();
		
			for(Object anuncio : consultaEstilo.getResultList()){
				for(String estilo : ((Anuncio) anuncio).getEstiloGosta()){
					if(requestPesquisa.get("valuePesquisa").toLowerCase().equals(estilo.toLowerCase())){
						listAnuncio.add(((Anuncio) anuncio));
					}
				}
			}
			
			return ok(views.html.home.render("Our Sound", listAnuncio));
		
		}
		
		return redirect(routes.Application.home());
	}
    
    
    
    @Transactional
	private static ArrayList<String> getListaInstrumentos() {
		
    	Map<String, String[]> map = request().body().asFormUrlEncoded();

		String[] instrumentosEscolhidos = map.get("instrumentos[]");
		ArrayList<String> listaInstrumentos = new ArrayList<>();
		
		for (String key:instrumentosEscolhidos ) {
			listaInstrumentos.add(key);
		}

		return listaInstrumentos;
	} 
    
    @Transactional
	private static ArrayList<String> getListaEstiloGosta() {
		
    	Map<String, String[]> map = request().body().asFormUrlEncoded();

		String[] estilosEscolhidos = map.get("listaEstiloGosta[]");
		ArrayList<String> listaEstilos = new ArrayList<>();
		
		
		for (String key:estilosEscolhidos ) {
			listaEstilos.add(key);
		}

		return listaEstilos;
	} 
    
    @Transactional
	private static ArrayList<String> getListaEstiloNaoGosta() {
		
    	Map<String, String[]> map = request().body().asFormUrlEncoded();

		String[] estilosEscolhidos = map.get("listaEstiloNaoGosta[]");
		ArrayList<String> listaEstilos = new ArrayList<>();
	
		
		for (String key:estilosEscolhidos ) {
			listaEstilos.add(key);
		}

		return listaEstilos;
	} 
   
    @Transactional
  	private static ArrayList<String> getListaContato() {
  		
      	Map<String, String[]> map = request().body().asFormUrlEncoded();

  		String[] contatoEscolhido = map.get("contato[]");
  		ArrayList<String> listaContato = new ArrayList<>();
  		
  		for (String key:contatoEscolhido ) {
  			listaContato.add(key);
  		}

  		return listaContato;
  	} 
    
    @Transactional
	public Result excluirAnuncio(long id) {
		DynamicForm requestDeletar = Form.form().bindFromRequest();
		Anuncio anuncioADeletar = dao.findByEntityId(Anuncio.class, id);

		if (anuncioADeletar.getExcluir().equals(
				requestDeletar.get("excluir"))) {
			dao.remove(anuncioADeletar);
			
		}
		return redirect(routes.Application.home());
	}
}
