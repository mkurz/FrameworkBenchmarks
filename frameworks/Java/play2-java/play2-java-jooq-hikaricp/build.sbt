name := "play2-java-jooq-hikaricp"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayNettyServer)

scalaVersion := "2.12.4"

val jOOQVersion = "3.10.2"

libraryDependencies ++= Seq(
  guice,
  javaJdbc,
  "mysql" % "mysql-connector-java" % "5.1.44",
  "xx.xxx" %% "xxxx" % "my-jooq-module",
  "org.jooq" % "jooq" % jOOQVersion,
  "org.jooq" % "jooq-codegen" % jOOQVersion,
  "org.jooq" % "jooq-meta" % jOOQVersion,
)
