import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.lukastymo"
ThisBuild / organizationName := "lukastymo"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies ++= dependencies
  )

// Disable documentation generation for faster compile
sources in (Compile, doc) := Seq.empty

// Automatically load changes in sbt console
Global / onChangedBuildSource := ReloadOnSourceChanges

cancelable in Global := true
