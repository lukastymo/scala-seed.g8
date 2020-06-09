import sbt._

object Dependencies {

  object Libraries {
    val catsV = "2.1.1"
    val catsEffectV = "2.1.2"
    val logbackV = "1.2.1"
    val scalaLoggingV = "3.9.2"
    val newtypeV = "0.4.4"
    val refinedV = "0.9.14"
    val pureConfigV = "0.12.3"
    val enumeratumV = "1.6.1"

    val cats = "org.typelevel" %% "cats-core" % catsV
    val catsEffect = "org.typelevel" %% "cats-effect" % catsEffectV

    val refinedCore = "eu.timepit" %% "refined" % refinedV
    val refinedCats = "eu.timepit" %% "refined-cats" % refinedV

    val newtype = "io.estatico" %% "newtype" % newtypeV

    val pureConfig = "com.github.pureconfig" %% "pureconfig" % pureConfigV

    val logback = "ch.qos.logback" % "logback-classic" % logbackV
    val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingV

    val enumeratum = "com.beachape" %% "enumeratum" % enumeratumV
  }

  object TestLibraries {
    val scalaTestV = "3.1.2"

    val scalaTest = "org.scalatest" %% "scalatest" % scalaTestV % Test
  }

  object CompilerPlugins {}

}
