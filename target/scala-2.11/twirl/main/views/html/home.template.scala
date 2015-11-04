
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Anuncio],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(listAnuncio: List[Anuncio]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""


"""),_display_(/*4.2*/main("Lista de anuncios")/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""

	
  
"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Bootstrap Google Plus Theme</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href=""""),_display_(/*16.16*/routes/*16.22*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*16.72*/("""" rel="stylesheet">
		<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<link href=""""),_display_(/*20.16*/routes/*20.22*/.Assets.versioned("stylesheets/styles.css")),format.raw/*20.65*/("""" rel="stylesheet">
		<script src=""""),_display_(/*21.17*/routes/*21.23*/.Assets.versioned("javascripts/jquery-2.1.4.min.js")),format.raw/*21.75*/(""""> </script>
		
	</head>
	<body>
<nav class="navbar navbar-fixed-top header">
 	<div class="col-md-12">
        <div class="navbar-header">
          
          <a href=""""),_display_(/*29.21*/routes/*29.27*/.Application.home()),format.raw/*29.46*/("""" class="navbar-brand">Our Sound</a>
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse1">
          <i class="glyphicon glyphicon-search"></i>
          </button>
      
        </div>
        <div class="collapse navbar-collapse" id="navbar-collapse1">
          <form class="navbar-form pull-left" action=""""),_display_(/*36.56*/routes/*36.62*/.Application.pesquisarAnuncio()),format.raw/*36.93*/("""" method="post">
               <div class="input-group" style="max-width:670px;">
                
	  			
				 <div class="form-group">
 					 
  					<select class="form-control" name="pesquisa" id="sel1">
    					<option value="titulo">Titulo</option>
  						<option value="cidade">Cidade</option>
 						<option value="bairro">Bairro</option>
  						<option value="banda">Banda</option>
  						<option value="ocasionalmente">Ocasionalmente</option>
  						<option value="instrumentos">Instrumentos</option>
  						<option value="estilo">Estilo</option>
  					</select>
				</div>
	  	 			<input class="span9" name="valuePesquisa" id="appendedInputButton" type="text" placeholder="Pesquise anúncios aqui.">
                </div>
                
              <div class="input-group" style="max-width:470px;">
                
               
                <div class="input-group-btn">
                  <button class="btn btn-default btn-primary" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                </div>
               
              </div>
             
          </form>
          <ul class="nav navbar-nav navbar-right">
             <li><a href="https://github.com/icaroforte" target="_ext">Ícaro Forte</a></li>
             
             
             
           </ul>
        </div>	
     </div>	
</nav>
<div class="navbar navbar-default" id="subnav">
    <div class="col-md-12">
        <div class="navbar-header">
          
          <a href=""""),_display_(/*78.21*/routes/*78.27*/.Application.cadastro),format.raw/*78.48*/("""" style="margin-left:15px;" class="navbar-btn btn btn-default btn-plus dropdown-toggle">Crie um anúncio agora! </a>
   
        </div>
        <div class="collapse navbar-collapse" id="navbar-collapse2">
          <ul class="nav navbar-nav navbar-right">
             <li class="active"><a href="#">Anúncios</a></li>
             <li><a href="#loginModal" role="button" data-toggle="modal">Entrar</a></li>
             <li><a href="#aboutModal" role="button" data-toggle="modal">Sobre</a></li>
           </ul>
        </div>	
     </div>	
</div>



<!--main-->
<div class="container" id="main">
   <div class="row">
      
       
       
        """),_display_(/*99.10*/if(listAnuncio.isEmpty)/*99.33*/{_display_(Seq[Any](format.raw/*99.34*/("""
		"""),format.raw/*100.3*/("""<h3>Não há anúncios cadastrados</h3>
		
	""")))}/*102.3*/else/*102.7*/{_display_(Seq[Any](format.raw/*102.8*/("""
	"""),format.raw/*103.2*/("""<h3>Anúncios cadastrados</h3>
	
	
	"""),_display_(/*106.3*/for(anuncio <- listAnuncio.reverse) yield /*106.38*/{_display_(Seq[Any](format.raw/*106.39*/("""
	
	
	
	
   """),format.raw/*111.4*/("""<div class="col-md-4 col-sm-6">
    
        <div class="panel panel-default">
           <div class="panel-heading"> <h4>"""),_display_(/*114.45*/anuncio/*114.52*/.getTitulo),format.raw/*114.62*/("""</h4></div>
   			<div class="panel-body">
              <div class="clearfix"></div>
				"""),_display_(/*117.6*/anuncio/*117.13*/.getDescricao),format.raw/*117.26*/("""              
              """),format.raw/*118.15*/("""<hr>        
					<ul class="list-group">
					<li class="list-group-item"><b>Cidade:</b> """),_display_(/*120.50*/anuncio/*120.57*/.getCidade),format.raw/*120.67*/("""</li>
					<li class="list-group-item"><b>Bairro:</b> """),_display_(/*121.50*/anuncio/*121.57*/.getBairro),format.raw/*121.67*/("""</li>
					</ul>
					<ul class="list-group">
					<li class="list-group-item"><b>Instrumentos:</b></li>
					"""),_display_(/*125.7*/for(anuncio <- anuncio.getInstrumentos) yield /*125.46*/{_display_(Seq[Any](format.raw/*125.47*/("""
					"""),format.raw/*126.6*/("""<li class="list-group-item">"""),_display_(/*126.35*/anuncio),format.raw/*126.42*/("""</li>
		
					""")))}),format.raw/*128.7*/("""
					"""),format.raw/*129.6*/("""</ul>			 
					<ul class="list-group">
					<li class="list-group-item"><b>Estilo preferidos:</b></li>
					"""),_display_(/*132.7*/for(anuncio <- anuncio.getEstiloGosta()) yield /*132.47*/{_display_(Seq[Any](format.raw/*132.48*/("""
					"""),format.raw/*133.6*/("""<li class="list-group-item">"""),_display_(/*133.35*/anuncio),format.raw/*133.42*/("""</li>
					
					""")))}),format.raw/*135.7*/("""
					"""),format.raw/*136.6*/("""</ul>
					
					<ul class="list-group">
					<li class="list-group-item"><b>Estilo que não gosto:</b></li>
					"""),_display_(/*140.7*/for(anuncio <- anuncio.getEstiloNaoGosta) yield /*140.48*/{_display_(Seq[Any](format.raw/*140.49*/("""
					"""),format.raw/*141.6*/("""<li class="list-group-item">"""),_display_(/*141.35*/anuncio),format.raw/*141.42*/("""</li>
					
					""")))}),format.raw/*143.7*/("""
					"""),format.raw/*144.6*/("""</ul>
					<ul class="list-group">
					<li class="list-group-item"><b>O que busco:</b> """),_display_(/*146.55*/anuncio/*146.62*/.getFinalidadeAnuncio),format.raw/*146.83*/("""</li>
					</ul>
					<ul class="list-group">
					<li class="list-group-item"><b>Meus contatos:</b></li>
					"""),_display_(/*150.7*/for(anuncio <- anuncio.getContato) yield /*150.41*/{_display_(Seq[Any](format.raw/*150.42*/("""
					"""),format.raw/*151.6*/("""<li class="list-group-item">"""),_display_(/*151.35*/anuncio),format.raw/*151.42*/("""</li>
					
					""")))}),format.raw/*153.7*/("""
				
					"""),format.raw/*155.6*/("""</ul>
					
						<a href="#excluirModal" role="button" data-toggle="modal">Excluir este anúncio</a>
						
               </div>
               
         </div> 
	
	</div>
	
	<!-- excluir modal -->
				<div id="excluirModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
 					<div class="modal-dialog">
  						<div class="modal-content">
      						<div class="modal-header">
          						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          						<h2 class="text-center">Excluir este anúncio?</h2>
      						</div>
      						<div class="modal-body">
          						<div class="col-md-12 text-center">
            
            					<form class="form-horizontal" action=""""),_display_(/*176.57*/routes/*176.63*/.Application.excluirAnuncio(anuncio.getId())),format.raw/*176.107*/("""" method="post">
                  				<div class="control-group">
                     
                     			<div class="controls">
                        		Digite a palavra-chave:  <input type="password" name="excluir" required autofocus>
                     			</div>
                  				</div>
                 
               					</form>
            
            			
          						</div>
     			<div class="modal-footer">
          					<br><input type="submit" class="btn btn-danger" value="Excluir!">
      					</div>
      </div>
       		
  </div>
  </div>
</div>
	
	""")))}),format.raw/*197.3*/("""
	
	""")))}),format.raw/*199.3*/("""
  	
  
	

  """),format.raw/*204.3*/("""</div><!--/row-->
      	

    
    <br>
    
    <div class="clearfix"></div>
      
    <hr>
    <div class="col-md-12 text-center"><p><a href="http://www.cifraclub.com.br/" target="_ext">Visite o CifraClub</a><br><a href="http://letras.mus.br/" target="_ext">Visite o Letras.mus</a></p></div>
    <hr>
    
  </div>
</div><!--/main-->

<!--login modal-->
<div id="loginModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h2 class="text-center"><img src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100" class="img-circle"><br>Entrar</h2>
      </div>
      <div class="modal-body">
          <form class="form col-md-12 center-block">
            <div class="form-group">
              <input type="text" class="form-control input-lg" placeholder="Email">
            </div>
            <div class="form-group">
              <input type="password" class="form-control input-lg" placeholder="Senha">
            </div>
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block">Entrar</button>
              <span class="pull-right"><a href="#">Registrar</a></span><span><a href="#">Ajuda?</a></span>
            </div>
          </form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <button class="btn" data-dismiss="modal" aria-hidden="true">Cancelar</button>
		  </div>	
      </div>
  </div>
  </div>
</div>


<!--about modal-->
<div id="aboutModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h2 class="text-center">Sobre</h2>
      </div>
      <div class="modal-body">
          <div class="col-md-12 text-center">
            <a href="">Our Sound</a><br><br>Sua solução para encontrar parceiros musicais.
            <br><br>
            <a href="https://github.com/icaroforte">GitHub</a>
          </div>
      </div>
      <div class="modal-footer">
          <button class="btn" data-dismiss="modal" aria-hidden="true">OK</button>
      </div>
  </div>
  </div>
</div>




	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src=""""),_display_(/*278.17*/routes/*278.23*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*278.72*/(""""></script>
		<script src=""""),_display_(/*279.17*/routes/*279.23*/.Assets.versioned("javascripts/scripts.js")),format.raw/*279.66*/(""""> </script>
		
	</body>
</html>

""")))}),format.raw/*284.2*/("""

"""))
      }
    }
  }

  def render(message:String,listAnuncio:List[Anuncio]): play.twirl.api.HtmlFormat.Appendable = apply(message)(listAnuncio)

  def f:((String) => (List[Anuncio]) => play.twirl.api.HtmlFormat.Appendable) = (message) => (listAnuncio) => apply(message)(listAnuncio)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Tue Nov 03 22:36:40 BRT 2015
                  SOURCE: /home/icaro/activator-dist-1.3.6/app1/app/views/home.scala.html
                  HASH: ab2662138bb827fa017d062e9832b002a4deba01
                  MATRIX: 757->1|897->46|926->50|959->75|998->77|1031->84|1388->414|1403->420|1474->470|1644->613|1659->619|1723->662|1786->698|1801->704|1874->756|2072->927|2087->933|2127->952|2520->1318|2535->1324|2587->1355|4116->2857|4131->2863|4173->2884|4849->3533|4881->3556|4920->3557|4951->3560|5012->3602|5025->3606|5064->3607|5094->3609|5157->3645|5209->3680|5249->3681|5289->3693|5440->3816|5457->3823|5489->3833|5607->3924|5624->3931|5659->3944|5717->3973|5836->4064|5853->4071|5885->4081|5968->4136|5985->4143|6017->4153|6155->4264|6211->4303|6251->4304|6285->4310|6342->4339|6371->4346|6417->4361|6451->4367|6587->4476|6644->4516|6684->4517|6718->4523|6775->4552|6804->4559|6853->4577|6887->4583|7028->4697|7086->4738|7126->4739|7160->4745|7217->4774|7246->4781|7295->4799|7329->4805|7446->4894|7463->4901|7506->4922|7645->5034|7696->5068|7736->5069|7770->5075|7827->5104|7856->5111|7905->5129|7944->5140|8720->5888|8736->5894|8803->5938|9423->6527|9459->6532|9500->6545|12126->9143|12142->9149|12213->9198|12269->9226|12285->9232|12350->9275|12416->9310
                  LINES: 27->1|32->1|35->4|35->4|35->4|39->8|47->16|47->16|47->16|51->20|51->20|51->20|52->21|52->21|52->21|60->29|60->29|60->29|67->36|67->36|67->36|109->78|109->78|109->78|130->99|130->99|130->99|131->100|133->102|133->102|133->102|134->103|137->106|137->106|137->106|142->111|145->114|145->114|145->114|148->117|148->117|148->117|149->118|151->120|151->120|151->120|152->121|152->121|152->121|156->125|156->125|156->125|157->126|157->126|157->126|159->128|160->129|163->132|163->132|163->132|164->133|164->133|164->133|166->135|167->136|171->140|171->140|171->140|172->141|172->141|172->141|174->143|175->144|177->146|177->146|177->146|181->150|181->150|181->150|182->151|182->151|182->151|184->153|186->155|207->176|207->176|207->176|228->197|230->199|235->204|309->278|309->278|309->278|310->279|310->279|310->279|315->284
                  -- GENERATED --
              */
          