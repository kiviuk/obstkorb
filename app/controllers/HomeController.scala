package controllers

import play.api._
import play.api.mvc._
import scala.concurrent.ExecutionContext
import javax.inject._

@Singleton
class HomeController @Inject()(cc: ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def got = Action { implicit request =>
    Ok("Got request [" + request + "]")
  }


}