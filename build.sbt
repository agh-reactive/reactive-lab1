name := """reactive-lab1"""

version := "1.3"

scalaVersion := "3.0.2"

libraryDependencies ++= Seq(
  ("com.typesafe.akka" %% "akka-actor"               % "2.6.16").cross(CrossVersion.for3Use2_13),
  ("com.typesafe.akka" %% "akka-actor-typed"         % "2.6.16").cross(CrossVersion.for3Use2_13),
  ("com.typesafe.akka" %% "akka-testkit"             % "2.6.16" % "test").cross(CrossVersion.for3Use2_13),
  ("com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.16" % "test").cross(CrossVersion.for3Use2_13),
  ("org.scalatest"     %% "scalatest"                % "3.2.9"  % "test").cross(CrossVersion.for3Use2_13),
  "ch.qos.logback"      % "logback-classic"          % "1.2.3"
)
