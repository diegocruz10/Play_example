
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books:Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>All Books</title>
</head>
<body>

	<h1>All Books</h1>

	"""),_display_(/*12.3*/for(book <- books) yield /*12.21*/ {_display_(Seq[Any](format.raw/*12.23*/("""
		"""),format.raw/*13.3*/("""<a href="#">"""),_display_(/*13.16*/book/*13.20*/.title),format.raw/*13.26*/("""</a>
		<p>Price: """),_display_(/*14.14*/book/*14.18*/.price),format.raw/*14.24*/("""</p>
		<p>Author: """),_display_(/*15.15*/book/*15.19*/.author),format.raw/*15.26*/("""</p>
	""")))}),format.raw/*16.3*/("""	
"""),format.raw/*17.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 17 18:01:16 COT 2018
                  SOURCE: C:/Users/felip/Documents/Arquitectura/Play/Proyectos/ejemplo1/app/views/books/index.scala.html
                  HASH: 071a2c04a411b76e7914a6725e78ca66087c3360
                  MATRIX: 957->1|1069->18|1099->22|1229->126|1263->144|1303->146|1334->150|1374->163|1387->167|1414->173|1460->192|1473->196|1500->202|1547->222|1560->226|1588->233|1626->241|1656->244
                  LINES: 28->1|33->1|35->3|44->12|44->12|44->12|45->13|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|49->17
                  -- GENERATED --
              */
          