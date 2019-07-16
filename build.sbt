import sbt.Keys.libraryDependencies

  name := "ASCII-Art-Maker"
  version := "0.1"
  scalaVersion := "2.12.2"
  val sparkVersion = "2.4.0"
  resolvers ++= Seq(
    "Maven2" at "http://repo.maven.apache.org/maven2/")
