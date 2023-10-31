import sbt.*

object Dependencies {
  private val zioHttpVersion = "3.0.0-RC3"

  lazy val zioHttp: List[ModuleID] = List(
    "dev.zio" %% "zio-http" % zioHttpVersion
  )
}
