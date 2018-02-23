import sbt._

object Dependencies {
  lazy val scalaSpecs = Seq(
    "org.specs2" %% "specs2-core" % "4.0.0" % "test",
    "org.specs2" %% "specs2-scalacheck" % "4.0.0" % "test"
  )

  lazy val core = Seq(
    "org.scalaz" %% "scalaz-core" % "7.2.19",
    "com.typesafe" % "config" % "1.3.1"
  )
}
