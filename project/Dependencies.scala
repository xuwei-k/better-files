import sbt._

object Dependencies {
  def scalaReflect(version: String) = "org.scala-lang"    % "scala-reflect" % version % Provided
  val akka                          = "com.typesafe.akka" %% "akka-actor"   % "2.5.14" // Used in Akka file watcher
  val scalatest                     = "org.scalatest"     %% "scalatest"    % "3.0.6-SNAP1" % Test
  val shapeless                     = "com.chuusai"       %% "shapeless"    % "2.3.3" % Test // For shapeless based Reader/Scanner in tests
  val commonsio                     = "commons-io"        % "commons-io"    % "2.6" % Test // Benchmarks
  val fastjavaio                    = "fastjavaio"        % "fastjavaio"    % "1.0" % Test from "https://github.com/williamfiset/FastJavaIO/releases/download/v1.0/fastjavaio.jar" //Benchmarks
}
