name := "obstkorb"

version := "1.0"

lazy val `obstkorb` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"


libraryDependencies += guice

libraryDependencies += ws