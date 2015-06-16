name := "akka-typed-actors"

organization := "com.mentat-labs.akkatyped"

version := "0.1"

scalaVersion := "2.11.6"

scalacOptions := Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-explaintypes",
  "-feature",
  "-optimise",
  "-unchecked",
  "-Xcheckinit",
  "-Xfatal-warnings",
  "-Xlint",
  "-Xlog-implicits",
  "-Xno-uescape",
  "-Xverify"
)

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.3" % "test"

unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil

unmanagedResourceDirectories in Compile := Nil

unmanagedResourceDirectories in Test := Nil
