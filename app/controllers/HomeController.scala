package controllers

import play.api._
import play.api.mvc._
import scala.concurrent.ExecutionContext
import javax.inject._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._


case class Fruit(name: String)

@Singleton
class HomeController @Inject()(cc: ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def got = Action { implicit request =>
    Ok("Got request [" + request + "]")
  }

  val fruitForm = Form(
    mapping(
      "name" -> text
    )(Fruit.apply)(Fruit.unapply)
  )


}