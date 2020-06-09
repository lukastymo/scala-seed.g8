import Dependencies._

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.lukastymo"
ThisBuild / organizationName := "lukastymo"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies ++= Seq(
      Libraries.cats,
      Libraries.catsEffect,
      Libraries.newtype,
      Libraries.refinedCore,
      Libraries.pureConfig,
      Libraries.logback,
      Libraries.scalaLogging,
      Libraries.enumeratum,
      TestLibraries.scalaTest
    )
  )

// Disable documentation generation for faster compile
sources in (Compile, doc) := Seq.empty

// Automatically load changes in sbt console
Global / onChangedBuildSource := ReloadOnSourceChanges

cancelable in Global := true
