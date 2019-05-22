
name         := "yaidom-exercise"
description  := "Programming exercise using the yaidom library"
organization := "yaidom-exercise"
version      := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings", "-Xlint")

libraryDependencies += "eu.cdevreeze.yaidom" %% "yaidom" % "1.9.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

