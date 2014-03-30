import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "Multiproject"
  val appVersion = "1.0"

  lazy val main    = play.Project("Multiproject", appVersion)

  lazy val command = Project(id = "Command", base = file("modules/Module1"))
    .settings(
      mainClass := Some("hoge.Something")
    ).dependsOn(main)
}
