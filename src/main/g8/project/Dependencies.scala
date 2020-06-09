import sbt._

object Dependencies {

  object Versions {
    val cats             = "2.1.1"
    val catsEffect       = "2.1.2"
    val catsMeowMtl      = "0.4.0"
    val logback          = "1.2.1"
    val scalaLogging     = "3.9.2"
    val newtype          = "0.4.4"
    val refined          = "0.9.14"
    val pureConfig       = "0.12.3"
    val enumeratum       = "1.6.1"

    val scalaTest = "3.1.0"
  }

  object Libraries {
    val cats         = "org.typelevel"  %% "cats-core"    % Versions.cats
    val catsEffect   = "org.typelevel"  %% "cats-effect"  % Versions.catsEffect

    val refinedCore = "eu.timepit" %% "refined"      % Versions.refined
    val refinedCats = "eu.timepit" %% "refined-cats" % Versions.refined

    val newtype  = "io.estatico"       %% "newtype"        % Versions.newtype

    val pureConfig = "com.github.pureconfig" %% "pureconfig" % Versions.pureConfig

    val logback      = "ch.qos.logback"              % "logback-classic" % Versions.logback
    val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging"   % Versions.scalaLogging

    val enumeratum = "com.beachape" %% "enumeratum" % Versions.enumeratum
  }

  object TestLibraries {
    val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest % Test
  }

}
