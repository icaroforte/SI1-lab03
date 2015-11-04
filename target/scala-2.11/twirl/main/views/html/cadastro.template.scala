
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cadastro_Scope0 {
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

class cadastro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Cadastro</title>

    <!-- Bootstrap -->
    <link href=""""),_display_(/*12.18*/routes/*12.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.74*/("""" rel="stylesheet">
	<link href=""""),_display_(/*13.15*/routes/*13.21*/.Assets.versioned("stylesheets/cadastro.css")),format.raw/*13.66*/("""" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>


<body>

	<form action="/novoAnuncio" method="POST">
		
		
		<h3>Crie seu anúncio</h3>
    <p>Por favor, preencha os campos abaixo:</p>
    <div class="container">
    <div class="row">
        <form role="form">
            <div class="col-lg-6">
                <div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span> Campo obrigatório</strong></div>
                <div class="form-group">
					<label for="Titulo"> Titulo do anúncio:</label>
                    <div class="input-group">
						
						
						<input type="text" id="titulo" class="form-control" name="titulo" placeHolder="Titulo do anuncio" value="" required>
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                      
                    </div>
                </div>
                <div class="form-group">
					<label for="Cidade"> Cidade:</label>
                    <div class="input-group">
						
						
						<input type="text" id="cidade" class="form-control" name="cidade" placeHolder="Sua cidade" value="" required>
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        
                        
                    </div>
                </div>
                <div class="form-group">
					 <label for="Bairro"> Bairro:</label>
                    <div class="input-group">
                        
                       
						<input type="text" class="form-control" name="bairro" placeHolder="Seu bairro" value="" required>
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        
                        
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <label>Selecione ao menos 1 instrumento que você toca abaixo: (*)</label><br>
                        
                        <div class="instrumentos">
							<input type="checkbox" name="instrumentos[]" value="Bateria"> Bateria <br>
							<input type="checkbox" name="instrumentos[]" value="Cavaquinho"> Cavaquinho <br>
							<input type="checkbox" name="instrumentos[]" value="Contrabaixo"> Contrabaixo<br>
							<input type="checkbox" name="instrumentos[]" value="Flauta"> Flauta <br> 
                        </div>
                        <div class="instrumentos">
							<input type="checkbox" name="instrumentos[]" value="Gaita"> Gaita <br>
							<input type="checkbox" name="instrumentos[]" value="Guitarra"> Guitarra <br>
							<input type="checkbox" name="instrumentos[]" value="Percussao"> Percussão <br>
							<input type="checkbox" name="instrumentos[]" value="Piano"> Piano <br>
						</div>
						<div class="instrumentos">
							<input type="checkbox" name="instrumentos[]" value="Sanfona"> Sanfona <br>
							<input type="checkbox" name="instrumentos[]" value="Saxofone"> Saxofone <br>	
							<input type="checkbox" name="instrumentos[]" value="Teclado"> Teclado <br>
							<input type="checkbox" name="instrumentos[]" value="Trompete"> Trompete <br>
						</div>
						<div class="instrumentos">
							<input type="checkbox" name="instrumentos[]" value="Viola"> Viola <br>
							<input type="checkbox" name="instrumentos[]" value="Violão"> Violão <br>	
							<input type="checkbox" name="instrumentos[]" value="Violino"> Violino <br>
							<input type="checkbox" name="instrumentos[]" value="Outros"> Outros <br>
						</div>
						
						<label>Você gosta de tocar qual(is) estilo(s)?</label><br>
						
						<div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="Alternativo"> Alternativo <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Axé"> Axé <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Blues"> Blues<br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Brega"> Brega <br> 
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="Clássico"> Clássico <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Country"> Country <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Eletrônico"> Eletrônico <br> 
							<input type="checkbox" name="listaEstiloGosta[]" value="Forró"> Forró <br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="Funk"> Funk <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Gospel"> Gospel <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Hip-hop"> Hip-hop <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Indie"> Indie<br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="MPB"> MPB <br> 
							<input type="checkbox" name="listaEstiloGosta[]" value="Pagode"> Pagode <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Pop"> Pop <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Reggae"> Reggae<br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloGosta[]" value="Rock"> Rock <br> 
							<input type="checkbox" name="listaEstiloGosta[]" value="Romântico"> Romântico <br> 
							<input type="checkbox" name="listaEstiloGosta[]" value="Samba"> Samba <br>
							<input type="checkbox" name="listaEstiloGosta[]" value="Sertanejo"> Sertanejo <br>  
                        </div>
                        
                        <label>... E de quais não gosta?</label><br>
						<div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Alternativo"> Alternativo <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Axé"> Axé <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Blues"> Blues<br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Brega"> Brega <br> 
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Clássico"> Clássico <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Country"> Country <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Eletrônico"> Eletrônico <br> 
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Forró"> Forró <br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Funk"> Funk <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Gospel"> Gospel <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Hip-hop"> Hip-hop <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Indie"> Indie<br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="MPB"> MPB <br> 
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Pagode"> Pagode <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Pop"> Pop <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Reggae"> Reggae<br>
                        </div>
                        <div class="estilos">
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Rock"> Rock <br> 
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Romântico"> Romântico <br> 
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Samba"> Samba <br>
							<input type="checkbox" name="listaEstiloNaoGosta[]" value="Sertanejo"> Sertanejo <br>  
                        </div>
                       
						<br>
						
						
						
                    </div>
                </div>
                
                <div class="form-group">
					<label for="Contatos"> Contatos:</label> 
                    <div class="input-group">
                      
                       <input type="text" class="form-control" name="contato[]" placeHolder="Seu e-mail" value="" required>
                       <input type="text" class="form-control" name="contato[]" placeHolder="Facebook" value="">
                      
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
               
                
                 <div class="form-group">
                    <div class="input-group"> 
						                    
						<label class="radio-inline"><input type="radio" name="finalidadeAnuncio" value="Banda"required>Banda</label>

						<label class="radio-inline"><input type="radio" name="finalidadeAnuncio" value="Tocar Ocasionalmente">Tocar Casualmente</label>              
						
		
                    </div>
                </div>
                 <div class="form-group">
                <label for="excluir"> Palavra para excluir este anúncio:</label>
                    <div class="input-group">
                        
						<input type="text" class="form-control" name="excluir" placeHolder="Insira uma palavra para excluir futuramente este anúncio" value="" required>
						<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        
                        
                    </div> 
  				</div>
               
                <div class="form-group">
                    <label for="Contatos"> Descreva seu anúncio:</label> 
                    <div class="input-group">
                        <textarea class="form-control" name="descricao" rows="5" id="descricao"></textarea>
                        <span class="input-group-addon"></span>
                    </div>
                    <br>
                   
					 
                </div>
                 
                 
                    <input type="submit" class="btn btn-info" value="Cadastrar">
                </div>
                
            </div>
        </form>
        <br><br>
    </div>
</div>

	</form>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src=""""),_display_(/*227.19*/routes/*227.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*227.74*/(""""></script>
    <script src=""""),_display_(/*228.19*/routes/*228.25*/.Assets.versioned("javascripts/script.js")),format.raw/*228.67*/(""""> </script>
</body>
</html>


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object cadastro extends cadastro_Scope0.cadastro
              /*
                  -- GENERATED --
                  DATE: Wed Oct 28 12:01:49 BRT 2015
                  SOURCE: /home/icaro/activator-dist-1.3.6/app1/app/views/cadastro.scala.html
                  HASH: c6b890769d95ea4a46891d3d3febc2984036da01
                  MATRIX: 833->1|1247->388|1262->394|1333->444|1394->478|1409->484|1475->529|12429->11455|12445->11461|12516->11510|12574->11540|12590->11546|12654->11588
                  LINES: 32->2|42->12|42->12|42->12|43->13|43->13|43->13|257->227|257->227|257->227|258->228|258->228|258->228
                  -- GENERATED --
              */
          