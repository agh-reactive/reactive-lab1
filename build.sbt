name := """reactive-lab1"""

version := "1.4"

scalaVersion := "2.13.6"
val akkaVersion = "2.6.20"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor"               % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit"             % akkaVersion % "test",
  "com.typesafe.akka" %% "akka-actor-typed"         % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % "test",
  "org.scalatest"     %% "scalatest"                % "3.2.12" % "test",
  "ch.qos.logback"    % "logback-classic"           % "1.4.1"
)
