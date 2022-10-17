ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "compactor"
  )


libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test