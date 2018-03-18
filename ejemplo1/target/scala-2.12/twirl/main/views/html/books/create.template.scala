
package views.html.books

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookFrom:Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>Create Book</title>
</head>
<body>

	<h1>Create Book</h1>

	"""),_display_(/*13.3*/helper/*13.9*/.form(action = routes.BooksController.save())/*13.54*/ {_display_(Seq[Any](format.raw/*13.56*/("""

		"""),_display_(/*15.4*/helper/*15.10*/.inputText(bookFrom("id"))),format.raw/*15.36*/("""
		"""),_display_(/*16.4*/helper/*16.10*/.inputText(bookFrom("title"))),format.raw/*16.39*/("""
		"""),_display_(/*17.4*/helper/*17.10*/.inputText(bookFrom("price"))),format.raw/*17.39*/("""
		"""),_display_(/*18.4*/helper/*18.10*/.inputText(bookFrom("author"))),format.raw/*18.40*/("""

		"""),format.raw/*20.3*/("""<input type = "submit" value = "Create Book"> 

	""")))}),format.raw/*22.3*/("""

"""),format.raw/*24.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(bookFrom:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookFrom)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookFrom) => apply(bookFrom)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 17 16:43:14 COT 2018
                  SOURCE: C:/Users/felip/Documents/Arquitectura/Play/Proyectos/ejemplo1/app/views/books/create.scala.html
                  HASH: 79c29eecb5823251197913af087fd165d5e23f2f
                  MATRIX: 959->1|1053->25|1098->22|1126->42|1154->44|1288->152|1302->158|1356->203|1396->205|1429->212|1444->218|1491->244|1522->249|1537->255|1587->284|1618->289|1633->295|1683->324|1714->329|1729->335|1780->365|1813->371|1895->423|1926->427
                  LINES: 28->1|31->2|34->1|35->3|36->4|45->13|45->13|45->13|45->13|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|52->20|54->22|56->24
                  -- GENERATED --
              */
          