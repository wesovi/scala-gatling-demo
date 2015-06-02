enablePlugins(GatlingPlugin)

organization:= "com.wesovi"

name:="scala-gatling-demo"

version:="0.0.1"

startYear:= Some(2015)

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"


EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true

unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil

unmanagedSourceDirectories in Test <<= (sourceDirectory){ src => src / "test" / "scala" :: Nil}

val gatlingVersion ="2.1.6"


libraryDependencies ++= Seq(
	"io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test",
	"io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test"
)