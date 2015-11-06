import play.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import models.Anuncio;
import models.DAO.GenericDAO;
import play.db.jpa.JPA;


public class Global extends GlobalSettings {

	private static GenericDAO dao = new GenericDAO();

	@Override
	public void onStart(Application app) {
		Logger.info("Aplicação inicializada...");

		JPA.withTransaction(new play.libs.F.Callback0() {
			@Override
			public void invoke() throws Throwable {
				
									//Criando 25 anuncios
//====================================================||===========================================\\
				
				Anuncio anuncio = new Anuncio();
			
				anuncio.setId(0);
				anuncio.setTitulo("Toco violão");
				anuncio.setCidade("Campina Grande");
				anuncio.setBairro("Quarenta");
				anuncio.setDescricao("Estou a fim de formar uma banda!!!");
				anuncio.setFinalidadeAnuncio("Banda");
				anuncio.setExcluir("123");
				
				
				
				ArrayList<String> estilo = new ArrayList<String>();
				estilo.add("MPB");
				estilo.add("Rock");
				anuncio.setEstiloGosta(estilo);
				
				ArrayList<String> estiloNaoGosta = new ArrayList<String>();
				estiloNaoGosta.add("Funk");
				anuncio.setEstiloNaoGosta(estiloNaoGosta);
				
				
				ArrayList<String> instrumentos = new ArrayList<String>();
				instrumentos.add("Violão");
				anuncio.setInstrumentos(instrumentos);
				
				ArrayList<String> contato = new ArrayList<String>();
				contato.add("pedro@hotmail.com");
				anuncio.setContato(contato);
				
				dao.persist(anuncio);
				dao.flush();		
				
//====================================================||===========================================\\
				
				Anuncio anuncio1 = new Anuncio();
				
				
				anuncio1.setId(0);
				anuncio1.setTitulo("Guitarrista");
				anuncio1.setCidade("Campina Grande");
				anuncio1.setBairro("Bodocongó");
				anuncio1.setDescricao("Procuro galera pra formar uma banda");
				anuncio1.setFinalidadeAnuncio("Banda");
				anuncio1.setExcluir("123");
				
				
				
				ArrayList<String> estilo1 = new ArrayList<String>();
				estilo1.add("Reggae");
				estilo1.add("Rock");
				anuncio1.setEstiloGosta(estilo1);
				
				ArrayList<String> estiloNaoGosta1 = new ArrayList<String>();
				estiloNaoGosta1.add("Funk");
				estiloNaoGosta1.add("Romântico");
				anuncio1.setEstiloNaoGosta(estiloNaoGosta1);
				
				
				ArrayList<String> instrumentos1 = new ArrayList<String>();
				instrumentos1.add("Guitarra");
				instrumentos1.add("Violão");
				anuncio1.setInstrumentos(instrumentos1);
				
				ArrayList<String> contato1 = new ArrayList<String>();
				contato1.add("carlinhos@hotmail.com");
				anuncio1.setContato(contato1);
				
				dao.persist(anuncio1);
				dao.flush();	
				
//====================================================||===========================================\\
				
				Anuncio anuncio2 = new Anuncio();
				
				
				anuncio2.setId(0);
				anuncio2.setTitulo("Vai um pagodim?");
				anuncio2.setCidade("João Pessoa");
				anuncio2.setBairro("Bessa");
				anuncio2.setDescricao("Aí galera se reunir fds pra tocar um pagodim");
				anuncio2.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio2.setExcluir("123");
				
				
				
				ArrayList<String> estilo2 = new ArrayList<String>();
				estilo2.add("Pagode");
				estilo2.add("MPB");
				anuncio2.setEstiloGosta(estilo2);
				
				ArrayList<String> estiloNaoGosta2 = new ArrayList<String>();
				estiloNaoGosta2.add("Funk");
				estiloNaoGosta2.add("Clássico");
				anuncio2.setEstiloNaoGosta(estiloNaoGosta2);
				
				
				ArrayList<String> instrumentos2 = new ArrayList<String>();
				instrumentos2.add("Percussão");
				anuncio2.setInstrumentos(instrumentos2);
				
				ArrayList<String> contato2 = new ArrayList<String>();
				contato2.add("tiago@gmail.com");
				anuncio2.setContato(contato2);
				
				dao.persist(anuncio2);
				dao.flush();		
//====================================================||===========================================\\
				
				Anuncio anuncio3 = new Anuncio();
				
				
				anuncio3.setId(0);
				anuncio3.setTitulo("Tecladista");
				anuncio3.setCidade("Guarabira");
				anuncio3.setBairro("Centro");
				anuncio3.setDescricao("Toco teclado e estou a procura de um grupo");
				anuncio3.setFinalidadeAnuncio("Banda");
				anuncio3.setExcluir("123");
				
				
				
				ArrayList<String> estilo3 = new ArrayList<String>();
				estilo3.add("Clássico");
				estilo3.add("Indie");
				anuncio3.setEstiloGosta(estilo3);
				
				ArrayList<String> estiloNaoGosta3 = new ArrayList<String>();
				estiloNaoGosta3.add("Pagode");
				estiloNaoGosta3.add("Samba");
				anuncio3.setEstiloNaoGosta(estiloNaoGosta3);
				
				
				ArrayList<String> instrumentos3 = new ArrayList<String>();
				instrumentos3.add("Teclado");
				anuncio3.setInstrumentos(instrumentos3);
				
				ArrayList<String> contato3 = new ArrayList<String>();
				contato3.add("julio@gmail.com");
				anuncio3.setContato(contato3);
				
				dao.persist(anuncio3);
				dao.flush();
//====================================================||===========================================\\
				
				Anuncio anuncio4 = new Anuncio();
				
				
				anuncio4.setId(0);
				anuncio4.setTitulo("Que tal uma garota baterista?");
				anuncio4.setCidade("Recife");
				anuncio4.setBairro("Centro");
				anuncio4.setDescricao("Sou garota e toco bateria, e aí? ;)");
				anuncio4.setFinalidadeAnuncio("Banda");
				anuncio4.setExcluir("123");
				
				
				
				ArrayList<String> estilo4 = new ArrayList<String>();
				estilo4.add("Rock");
				estilo4.add("Country");
				anuncio4.setEstiloGosta(estilo4);
				
				ArrayList<String> estiloNaoGosta4 = new ArrayList<String>();
				estiloNaoGosta4.add("Romântico");
				estiloNaoGosta4.add("Samba");
				anuncio4.setEstiloNaoGosta(estiloNaoGosta4);
				
				
				ArrayList<String> instrumentos4 = new ArrayList<String>();
				instrumentos4.add("Bateria");
				anuncio4.setInstrumentos(instrumentos4);
				
				ArrayList<String> contato4 = new ArrayList<String>();
				contato4.add("alana@yahoo.com.br");
				anuncio4.setContato(contato4);
				
				dao.persist(anuncio4);
				dao.flush();
			
//====================================================||===========================================\\
				
				Anuncio anuncio5 = new Anuncio();
				
				
				anuncio5.setId(0);
				anuncio5.setTitulo("Vamos tocar na UFCG");
				anuncio5.setCidade("Campina Grande");
				anuncio5.setBairro("Conjunto dos professores");
				anuncio5.setDescricao("Moro aqui perto da UFCG e quero me juntar com alguém pra tocar");
				anuncio5.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio5.setExcluir("123");
				
				
				
				ArrayList<String> estilo5 = new ArrayList<String>();
				estilo5.add("Sertanejo");
				estilo5.add("Forró");
				anuncio5.setEstiloGosta(estilo5);
				
				ArrayList<String> estiloNaoGosta5 = new ArrayList<String>();
				estiloNaoGosta5.add("Eletrônico");
				anuncio5.setEstiloNaoGosta(estiloNaoGosta5);
				
				
				ArrayList<String> instrumentos5 = new ArrayList<String>();
				instrumentos5.add("Cavaquinho");
				anuncio5.setInstrumentos(instrumentos5);
				
				ArrayList<String> contato5 = new ArrayList<String>();
				contato5.add("roberto@yahoo.com.br");
				anuncio5.setContato(contato5);
				
				dao.persist(anuncio5);
				dao.flush();

//====================================================||===========================================\\
				
				Anuncio anuncio6 = new Anuncio();
				
				
				anuncio6.setId(0);
				anuncio6.setTitulo("Galera da UEPB");
				anuncio6.setCidade("Campina Grande");
				anuncio6.setBairro("Bodocongó");
				anuncio6.setDescricao("E aí galera, vamos se reunir pra tocar na UEPB?");
				anuncio6.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio6.setExcluir("123");
				
				
				
				ArrayList<String> estilo6 = new ArrayList<String>();
				estilo6.add("Sertanejo");
				estilo6.add("Forró");
				anuncio6.setEstiloGosta(estilo6);
				
				ArrayList<String> estiloNaoGosta6 = new ArrayList<String>();
				estiloNaoGosta6.add("Eletrônico");
				anuncio6.setEstiloNaoGosta(estiloNaoGosta6);
				
				
				ArrayList<String> instrumentos6 = new ArrayList<String>();
				instrumentos6.add("Cavaquinho");
				instrumentos6.add("Percussão");
				
				anuncio6.setInstrumentos(instrumentos6);
				
				ArrayList<String> contato6 = new ArrayList<String>();
				contato6.add("jonny@gmail.com");
				anuncio6.setContato(contato6);
				
				dao.persist(anuncio6);
				dao.flush();

//====================================================||===========================================\\
				
				Anuncio anuncio7 = new Anuncio();
				
				
				anuncio7.setId(0);
				anuncio7.setTitulo("Banda gospel");
				anuncio7.setCidade("Campina Grande");
				anuncio7.setBairro("Centenário");
				anuncio7.setDescricao("Eu toco violino na minha igreja e quero formar uma banda gospel");
				anuncio7.setFinalidadeAnuncio("Banda");
				anuncio7.setExcluir("123");
				
				
				
				ArrayList<String> estilo7 = new ArrayList<String>();
				estilo7.add("Gospel");
				anuncio7.setEstiloGosta(estilo7);
				
				ArrayList<String> estiloNaoGosta7 = new ArrayList<String>();
				estiloNaoGosta7.add("Rock");
				estiloNaoGosta7.add("Funk");
				anuncio7.setEstiloNaoGosta(estiloNaoGosta7);
				
				
				ArrayList<String> instrumentos7 = new ArrayList<String>();
				instrumentos7.add("Violino");
				
				anuncio7.setInstrumentos(instrumentos7);
				
				ArrayList<String> contato7 = new ArrayList<String>();
				contato7.add("priscila_oliveira@gmail.com");
				anuncio7.setContato(contato7);
				
				dao.persist(anuncio7);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio8 = new Anuncio();
				
				
				anuncio8.setId(0);
				anuncio8.setTitulo("Só no ritmo da pancada");
				anuncio8.setCidade("Campina Grande");
				anuncio8.setBairro("Jardim Quarenta");
				anuncio8.setDescricao("Percussão é comigo mesmo! Vamos tocar aqui em casa no fds!");
				anuncio8.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio8.setExcluir("123");
				
				
				ArrayList<String> estilo8 = new ArrayList<String>();
				estilo8.add("Pagode");
				estilo8.add("Samba");
				anuncio8.setEstiloGosta(estilo8);
				
				ArrayList<String> estiloNaoGosta8 = new ArrayList<String>();
				estiloNaoGosta8.add("Funk");
				anuncio8.setEstiloNaoGosta(estiloNaoGosta8);
				
				
				ArrayList<String> instrumentos8 = new ArrayList<String>();
				instrumentos8.add("Percussão");
				
				anuncio8.setInstrumentos(instrumentos8);
				
				ArrayList<String> contato8 = new ArrayList<String>();
				contato8.add("jair_dantas@gmail.com");
				anuncio8.setContato(contato8);
				
				dao.persist(anuncio8);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio9 = new Anuncio();
				
				
				anuncio9.setId(0);
				anuncio9.setTitulo("Quero ser igual a Wesley Safadão");
				anuncio9.setCidade("Natal");
				anuncio9.setBairro("Capim Macio");
				anuncio9.setDescricao("Ainda me tornarei igual ao Safadão, the biggest heavy metal singer! |n| ");
				anuncio9.setFinalidadeAnuncio("Banda");
				anuncio9.setExcluir("123");
				
				
				ArrayList<String> estilo9 = new ArrayList<String>();
				estilo9.add("Forró");
				anuncio9.setEstiloGosta(estilo9);
				
				ArrayList<String> estiloNaoGosta9 = new ArrayList<String>();
				estiloNaoGosta9.add("Funk");
				estiloNaoGosta9.add("Rock");
				anuncio9.setEstiloNaoGosta(estiloNaoGosta9);
				
				
				ArrayList<String> instrumentos9 = new ArrayList<String>();
				instrumentos9.add("Sanfona");
				
				anuncio9.setInstrumentos(instrumentos9);
				
				ArrayList<String> contato9 = new ArrayList<String>();
				contato9.add("wesley_rock_power@gmail.com");
				anuncio9.setContato(contato9);
				
				dao.persist(anuncio9);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio10 = new Anuncio();
				
				
				anuncio10.setId(0);
				anuncio10.setTitulo("Instrumentos de sopro");
				anuncio10.setCidade("Campina Grande");
				anuncio10.setBairro("Quarenta");
				anuncio10.setDescricao("Toco instrumentos de sopro");
				anuncio10.setFinalidadeAnuncio("Banda");
				anuncio10.setExcluir("123");
				
				
				ArrayList<String> estilo10 = new ArrayList<String>();
				estilo10.add("MPB");
				estilo10.add("Sertanejo");
				
				anuncio10.setEstiloGosta(estilo10);
				
				ArrayList<String> estiloNaoGosta10 = new ArrayList<String>();
				estiloNaoGosta10.add("Funk");
				anuncio10.setEstiloNaoGosta(estiloNaoGosta10);
				
				
				ArrayList<String> instrumentos10 = new ArrayList<String>();
				instrumentos10.add("Flauta");
				instrumentos10.add("Outros");
				
				anuncio10.setInstrumentos(instrumentos10);
				
				ArrayList<String> contato10 = new ArrayList<String>();
				contato10.add("zepelim_biggest_head@gmail.com");
				anuncio10.setContato(contato10);
				
				dao.persist(anuncio10);
				dao.flush();
//====================================================||===========================================\\
				
				Anuncio anuncio11 = new Anuncio();
				
				
				anuncio11.setId(0);
				anuncio11.setTitulo("Pianista");
				anuncio11.setCidade("Campina Grande");
				anuncio11.setBairro("Alto Branco");
				anuncio11.setDescricao("Procuro parceiro musical");
				anuncio11.setFinalidadeAnuncio("Banda");
				anuncio11.setExcluir("123");
				
				
				ArrayList<String> estilo11 = new ArrayList<String>();
				estilo11.add("Clássico");
				estilo11.add("MPB");
				
				anuncio11.setEstiloGosta(estilo11);
				
				ArrayList<String> estiloNaoGosta11 = new ArrayList<String>();
				estiloNaoGosta11.add("Funk");
				anuncio11.setEstiloNaoGosta(estiloNaoGosta11);
				
				
				ArrayList<String> instrumentos11 = new ArrayList<String>();
				instrumentos11.add("Piano");
				
				anuncio11.setInstrumentos(instrumentos11);
				
				ArrayList<String> contato11 = new ArrayList<String>();
				contato11.add("cleyton_pianista@gmail.com");
				anuncio11.setContato(contato11);
				
				dao.persist(anuncio11);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio12 = new Anuncio();
				
				
				anuncio12.setId(0);
				anuncio12.setTitulo("Contra-baixista");
				anuncio12.setCidade("Campina Grande");
				anuncio12.setBairro("Jardim Paulistano");
				anuncio12.setDescricao("Quero parceiros para formar banda");
				anuncio12.setFinalidadeAnuncio("Banda");
				anuncio12.setExcluir("123");
				
				
				ArrayList<String> estilo12 = new ArrayList<String>();
				estilo12.add("Rock");
				estilo12.add("MPB");
				
				anuncio12.setEstiloGosta(estilo12);
				
				ArrayList<String> estiloNaoGosta12 = new ArrayList<String>();
				estiloNaoGosta12.add("Funk");
				anuncio12.setEstiloNaoGosta(estiloNaoGosta12);
				
				
				ArrayList<String> instrumentos12 = new ArrayList<String>();
				instrumentos12.add("Contrabaixo");
				
				anuncio12.setInstrumentos(instrumentos12);
				
				ArrayList<String> contato12 = new ArrayList<String>();
				contato12.add("mohammed_contrabaixista@gmail.com");
				anuncio12.setContato(contato12);
				
				dao.persist(anuncio12);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio13 = new Anuncio();
				
				
				anuncio13.setId(0);
				anuncio13.setTitulo("Funkeiro");
				anuncio13.setCidade("Rio de Janeiro");
				anuncio13.setBairro("Morro do Urubú");
				anuncio13.setDescricao("Quero formar parceria no funk");
				anuncio13.setFinalidadeAnuncio("Banda");
				anuncio13.setExcluir("123");
				
				
				ArrayList<String> estilo13 = new ArrayList<String>();
				estilo13.add("Funk");
				
				anuncio13.setEstiloGosta(estilo13);
				
				ArrayList<String> estiloNaoGosta13 = new ArrayList<String>();
				estiloNaoGosta13.add("Góspel");
				anuncio13.setEstiloNaoGosta(estiloNaoGosta13);
				
				
				ArrayList<String> instrumentos13 = new ArrayList<String>();
				instrumentos13.add("Teclado");
				
				anuncio13.setInstrumentos(instrumentos13);
				
				ArrayList<String> contato13 = new ArrayList<String>();
				contato13.add("mai_mo_ta_fukeiro@gmail.com");
				anuncio13.setContato(contato13);
				
				dao.persist(anuncio13);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio14 = new Anuncio();
				
				
				anuncio14.setId(0);
				anuncio14.setTitulo("Faço shows com gaita");
				anuncio14.setCidade("Santa Luzia");
				anuncio14.setBairro("Centro");
				anuncio14.setDescricao("Show com gaita, procuro parceiros musicais");
				anuncio14.setFinalidadeAnuncio("Banda");
				anuncio14.setExcluir("123");
				
				
				ArrayList<String> estilo14 = new ArrayList<String>();
				estilo14.add("MPB");
				
				anuncio14.setEstiloGosta(estilo14);
				
				ArrayList<String> estiloNaoGosta14 = new ArrayList<String>();
				estiloNaoGosta14.add("Funk");
				anuncio14.setEstiloNaoGosta(estiloNaoGosta14);
				
				
				ArrayList<String> instrumentos14 = new ArrayList<String>();
				instrumentos14.add("Gaita");
				
				anuncio14.setInstrumentos(instrumentos14);
				
				ArrayList<String> contato14 = new ArrayList<String>();
				contato14.add("joao_gaita@gmail.com");
				anuncio14.setContato(contato14);
				
				dao.persist(anuncio14);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio15 = new Anuncio();
				
				
				anuncio15.setId(0);
				anuncio15.setTitulo("Trompetista");
				anuncio15.setCidade("Caicó - RN");
				anuncio15.setBairro("Centro");
				anuncio15.setDescricao("Toco trompete nos fds");
				anuncio15.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio15.setExcluir("123");
				
				
				ArrayList<String> estilo15 = new ArrayList<String>();
				estilo15.add("MPB");
				
				
				anuncio15.setEstiloGosta(estilo15);
				
				ArrayList<String> estiloNaoGosta15 = new ArrayList<String>();
				estiloNaoGosta15.add("Funk");
				anuncio15.setEstiloNaoGosta(estiloNaoGosta15);
				
				
				ArrayList<String> instrumentos15 = new ArrayList<String>();
				instrumentos15.add("Trompete");
				
				anuncio15.setInstrumentos(instrumentos15);
				
				ArrayList<String> contato15 = new ArrayList<String>();
				contato15.add("gabriel_trompetista@gmail.com");
				anuncio15.setContato(contato15);
				
				dao.persist(anuncio15);
				dao.flush();
//====================================================||===========================================\\
				
				Anuncio anuncio16 = new Anuncio();
				
				
				anuncio16.setId(0);
				anuncio16.setTitulo("Saxofonista");
				anuncio16.setCidade("Campina Grande");
				anuncio16.setBairro("Tambor");
				anuncio16.setDescricao("Elegância no som é o meu lema");
				anuncio16.setFinalidadeAnuncio("Banda");
				anuncio16.setExcluir("123");
				
				
				ArrayList<String> estilo16 = new ArrayList<String>();
				estilo16.add("Forró");
				estilo16.add("Blues");
				
				anuncio16.setEstiloGosta(estilo16);
				
				ArrayList<String> estiloNaoGosta16 = new ArrayList<String>();
				estiloNaoGosta16.add("Funk");
				anuncio16.setEstiloNaoGosta(estiloNaoGosta16);
				
				
				ArrayList<String> instrumentos16 = new ArrayList<String>();
				instrumentos16.add("Saxofone");
				
				anuncio16.setInstrumentos(instrumentos16);
				
				ArrayList<String> contato16 = new ArrayList<String>();
				contato16.add("romulo_saxofonista@gmail.com");
				anuncio16.setContato(contato16);
				
				dao.persist(anuncio16);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio17 = new Anuncio();
				
				
				anuncio17.setId(0);
				anuncio17.setTitulo("Cavaquinho na veia!");
				anuncio17.setCidade("Campina Grande");
				anuncio17.setBairro("Liberdade");
				anuncio17.setDescricao("É só ouvir o som do cavaquinho...");
				anuncio17.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio17.setExcluir("123");
				
				
				ArrayList<String> estilo17 = new ArrayList<String>();
				estilo17.add("Forró");
				estilo17.add("Samba");
				
				anuncio17.setEstiloGosta(estilo17);
				
				ArrayList<String> estiloNaoGosta17 = new ArrayList<String>();
				estiloNaoGosta17.add("Funk");
				anuncio17.setEstiloNaoGosta(estiloNaoGosta17);
				
				
				ArrayList<String> instrumentos17 = new ArrayList<String>();
				instrumentos17.add("Cavaquinho");
				
				anuncio17.setInstrumentos(instrumentos17);
				
				ArrayList<String> contato17 = new ArrayList<String>();
				contato17.add("kenedy_cavaquinho@hotmail.com");
				anuncio17.setContato(contato17);
				
				dao.persist(anuncio17);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio18 = new Anuncio();
				
				
				anuncio18.setId(0);
				anuncio18.setTitulo("Asa Branca");
				anuncio18.setCidade("Campina Grande");
				anuncio18.setBairro("Liberdade");
				anuncio18.setDescricao("É o som da asa branca na sanfona!!!");
				anuncio18.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio18.setExcluir("123");
				
				
				ArrayList<String> estilo18 = new ArrayList<String>();
				estilo18.add("Forró");
				estilo18.add("MPB");
				
				anuncio18.setEstiloGosta(estilo18);
				
				ArrayList<String> estiloNaoGosta18 = new ArrayList<String>();
				estiloNaoGosta18.add("Funk");
				anuncio18.setEstiloNaoGosta(estiloNaoGosta18);
				
				
				ArrayList<String> instrumentos18 = new ArrayList<String>();
				instrumentos18.add("Sanfona");
				
				anuncio18.setInstrumentos(instrumentos18);
				
				ArrayList<String> contato18 = new ArrayList<String>();
				contato18.add("felipe_sanfoneiro@hotmail.com");
				anuncio18.setContato(contato18);
				
				dao.persist(anuncio18);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio19 = new Anuncio();
				
				
				anuncio19.setId(0);
				anuncio19.setTitulo("Daniel dos teclados");
				anuncio19.setCidade("Campina Grande");
				anuncio19.setBairro("Liberdade");
				anuncio19.setDescricao("Estou a disposição como tecladista para uma banda");
				anuncio19.setFinalidadeAnuncio("Banda");
				anuncio19.setExcluir("123");
				
				
				ArrayList<String> estilo19 = new ArrayList<String>();
				estilo19.add("Forró");
				estilo19.add("MPB");
				
				anuncio19.setEstiloGosta(estilo19);
				
				ArrayList<String> estiloNaoGosta19 = new ArrayList<String>();
				estiloNaoGosta19.add("Funk");
				anuncio19.setEstiloNaoGosta(estiloNaoGosta19);
				
				
				ArrayList<String> instrumentos19 = new ArrayList<String>();
				instrumentos19.add("Teclado");
				
				anuncio19.setInstrumentos(instrumentos19);
				
				ArrayList<String> contato19 = new ArrayList<String>();
				contato19.add("daniel_dos_teclados@hotmail.com");
				anuncio19.setContato(contato19);
				
				dao.persist(anuncio19);
				dao.flush();
//====================================================||===========================================\\
				
				Anuncio anuncio20 = new Anuncio();
				
				
				anuncio20.setId(0);
				anuncio20.setTitulo("Não deixe Bob Marley morrer...");
				anuncio20.setCidade("Campina Grande");
				anuncio20.setBairro("Cruzeiro");
				anuncio20.setDescricao("Vamos manter o mito sempre vivo!");
				anuncio20.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio20.setExcluir("123");
				
				
				ArrayList<String> estilo20 = new ArrayList<String>();
				estilo20.add("Reggae");
				estilo20.add("MPB");
				
				anuncio20.setEstiloGosta(estilo20);
				
				ArrayList<String> estiloNaoGosta20 = new ArrayList<String>();
				estiloNaoGosta20.add("Funk");
				anuncio20.setEstiloNaoGosta(estiloNaoGosta20);
				
				
				ArrayList<String> instrumentos20 = new ArrayList<String>();
				instrumentos20.add("Percussão");
				
				anuncio20.setInstrumentos(instrumentos20);
				
				ArrayList<String> contato20 = new ArrayList<String>();
				contato20.add("tio_bob@hotmail.com");
				anuncio20.setContato(contato20);
				
				dao.persist(anuncio20);
				dao.flush();
//====================================================||===========================================\\
				
				Anuncio anuncio21 = new Anuncio();
				
				
				anuncio21.setId(0);
				anuncio21.setTitulo("Tributo aos Mamonas Assassinas");
				anuncio21.setCidade("Campina Grande");
				anuncio21.setBairro("José Pinheiro");
				anuncio21.setDescricao("Vamos se reunir pra fazer um tributo aos mamonas?");
				anuncio21.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio21.setExcluir("123");
				
				
				ArrayList<String> estilo21 = new ArrayList<String>();
				estilo21.add("Rock");
				estilo21.add("MPB");
				
				anuncio21.setEstiloGosta(estilo21);
				
				ArrayList<String> estiloNaoGosta21 = new ArrayList<String>();
				estiloNaoGosta21.add("Funk");
				anuncio21.setEstiloNaoGosta(estiloNaoGosta21);
				
				
				ArrayList<String> instrumentos21 = new ArrayList<String>();
				instrumentos21.add("Guitarra");
				
				anuncio21.setInstrumentos(instrumentos21);
				
				ArrayList<String> contato21 = new ArrayList<String>();
				contato21.add("roda_roda_vira@hotmail.com");
				anuncio21.setContato(contato21);
				
				dao.persist(anuncio21);
				dao.flush();
				
//====================================================||===========================================\\
				
				Anuncio anuncio22 = new Anuncio();
				
				
				anuncio22.setId(0);
				anuncio22.setTitulo("Tributo aos Beatles");
				anuncio22.setCidade("João Pessoa");
				anuncio22.setBairro("Manaíra");
				anuncio22.setDescricao("Vamos homenagear essa banda incrível");
				anuncio22.setFinalidadeAnuncio("Tocar Ocasionalmente");
				anuncio22.setExcluir("123");
				
				
				ArrayList<String> estilo22 = new ArrayList<String>();
				estilo22.add("Rock");
				
				anuncio22.setEstiloGosta(estilo22);
				
				ArrayList<String> estiloNaoGosta22 = new ArrayList<String>();
				estiloNaoGosta22.add("Funk");
				anuncio22.setEstiloNaoGosta(estiloNaoGosta22);
				
				
				ArrayList<String> instrumentos22 = new ArrayList<String>();
				instrumentos22.add("Guitarra");
				
				anuncio22.setInstrumentos(instrumentos22);
				
				ArrayList<String> contato22 = new ArrayList<String>();
				contato22.add("let_it_be@hotmail.com");
				anuncio22.setContato(contato22);
				
				dao.persist(anuncio22);
				dao.flush();
//====================================================||===========================================\\
				
				Anuncio anuncio23 = new Anuncio();
				
				
				anuncio23.setId(0);
				anuncio23.setTitulo("Cover de Legião Urbana");
				anuncio23.setCidade("João Pessoa");
				anuncio23.setBairro("Bancários");
				anuncio23.setDescricao("Quero formar banda pra um cover de Legião");
				anuncio23.setFinalidadeAnuncio("Banda");
				anuncio23.setExcluir("123");
				
				
				ArrayList<String> estilo23 = new ArrayList<String>();
				estilo23.add("Rock");
				
				anuncio23.setEstiloGosta(estilo23);
				
				ArrayList<String> estiloNaoGosta23 = new ArrayList<String>();
				estiloNaoGosta23.add("Funk");
				anuncio23.setEstiloNaoGosta(estiloNaoGosta23);
				
				
				ArrayList<String> instrumentos23 = new ArrayList<String>();
				instrumentos23.add("Violão");
				
				anuncio23.setInstrumentos(instrumentos23);
				
				ArrayList<String> contato23 = new ArrayList<String>();
				contato23.add("legiao@hotmail.com");
				anuncio23.setContato(contato23);
				
				dao.persist(anuncio23);
				dao.flush();
//====================================================||===========================================\\
				
				Anuncio anuncio24 = new Anuncio();
				
				
				anuncio24.setId(0);
				anuncio24.setTitulo("Michael Jackson is live!");
				anuncio24.setCidade("Campina Grande");
				anuncio24.setBairro("Buraco da Gia");
				anuncio24.setDescricao("O rei do pop!");
				anuncio24.setFinalidadeAnuncio("Banda");
				anuncio24.setExcluir("123");
				
				
				ArrayList<String> estilo24 = new ArrayList<String>();
				estilo24.add("Pop");
				
				anuncio24.setEstiloGosta(estilo24);
				
				ArrayList<String> estiloNaoGosta24 = new ArrayList<String>();
				estiloNaoGosta24.add("Funk");
				anuncio24.setEstiloNaoGosta(estiloNaoGosta24);
				
				
				ArrayList<String> instrumentos24 = new ArrayList<String>();
				instrumentos24.add("Outros");
				
				anuncio24.setInstrumentos(instrumentos24);
				
				ArrayList<String> contato24 = new ArrayList<String>();
				contato24.add("mjackson@hotmail.com");
				anuncio24.setContato(contato24);
				
				dao.persist(anuncio24);
				dao.flush();
			
			}

		});
		
}}