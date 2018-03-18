
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

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
	<title>Edit Book</title>
</head>
<body>

	<h1>Edit Book</h1>

	"""),_display_(/*13.3*/helper/*13.9*/.form(action = routes.BooksController.update())/*13.56*/ {_display_(Seq[Any](format.raw/*13.58*/("""

		"""),_display_(/*15.4*/helper/*15.10*/.inputText(bookFrom("id"))),format.raw/*15.36*/("""
		"""),_display_(/*16.4*/helper/*16.10*/.inputText(bookFrom("title"))),format.raw/*16.39*/("""
		"""),_display_(/*17.4*/helper/*17.10*/.inputText(bookFrom("price"))),format.raw/*17.39*/("""
		"""),_display_(/*18.4*/helper/*18.10*/.inputText(bookFrom("author"))),format.raw/*18.40*/("""

		"""),format.raw/*20.3*/("""<input type = "submit" value = "Edit Book"> 

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
                  DATE: Sat Mar 17 18:04:40 COT 2018
                  SOURCE: C:/Users/felip/Documents/Arquitectura/Play/Proyectos/ejemplo1/app/views/books/edit.scala.html
                  HASH: 0d92ae12d24525ad3da78ca6067947d158d393e3
                  MATRIX: 957->1|1051->25|1096->22|1124->42|1152->44|1282->148|1296->154|1352->201|1392->203|1425->210|1440->216|1487->242|1518->247|1533->253|1583->282|1614->287|1629->293|1679->322|1710->327|1725->333|1776->363|1809->369|1889->419|1920->423
                  LINES: 28->1|31->2|34->1|35->3|36->4|45->13|45->13|45->13|45->13|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|52->20|54->22|56->24
                  -- GENERATED --
              */
          