
package views.html.Home

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, lastName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>Welcome to Play</title>
</head>
<body>
	<p>Welcome """),_display_(/*9.14*/name),format.raw/*9.18*/(""" """),_display_(/*9.20*/lastName),format.raw/*9.28*/(""", how are you?</p>
</body>
</html>"""))
      }
    }
  }

  def render(name:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(name,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,lastName) => apply(name,lastName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 16 16:18:52 COT 2018
                  SOURCE: C:/Users/felip/Documents/Arquitectura/Play/Proyectos/ejemplo1/app/views/Home/welcome.scala.html
                  HASH: 6dc05c16dc7f7d4f9f536815f5aeddffcaba0c49
                  MATRIX: 962->1|1089->33|1119->37|1241->133|1265->137|1293->139|1321->147
                  LINES: 28->1|33->1|35->3|41->9|41->9|41->9|41->9
                  -- GENERATED --
              */
          