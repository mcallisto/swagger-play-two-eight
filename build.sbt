
name := "swagger-play-28"

scalaVersion := "2.13.2"

val PlayVersion = "2.8.1"
val SwaggerVersion = "1.6.0"
val Specs2Version = "4.8.3"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % PlayVersion,
  "com.typesafe.play" %% "routes-compiler" % PlayVersion,
  "io.swagger" % "swagger-core" % SwaggerVersion,
  "io.swagger" %% "swagger-scala-module" % "1.0.6",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.10.2",
  "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.3",
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "com.typesafe.play" %% "play-ebean" % "5.0.2" % "test",
  "org.specs2" %% "specs2-core" % Specs2Version % "test",
  "org.specs2" %% "specs2-mock" % Specs2Version % "test",
  "org.specs2" %% "specs2-junit" % Specs2Version % "test",
  "org.mockito" % "mockito-core" % "3.2.0" % "test"
)

// see https://github.com/scala/bug/issues/11813
scalacOptions -= "-Wself-implicit"

scalacOptions in Test ~= filterConsoleScalacOptions

parallelExecution in Test := false // Swagger uses global state which breaks parallel tests

publishMavenStyle := true
homepage := Some(new URL("https://github.com/mcallisto/swagger-play-28"))
startYear := Some(2020)
pomExtra := (
  <scm>
    <connection>scm:git:github.com:/mcallisto/swagger-play-28</connection>
    <developerConnection>scm:git:git@github.com:mcallisto/swagger-play-28.git</developerConnection>
    <url>github.com:mcallisto/swagger-play-28.git</url>
  </scm>
    <developers>
      <developer>
        <id>mcallisto</id>
        <name>Mario Càllisto</name>
      </developer>
    </developers>
  )
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "libs"
