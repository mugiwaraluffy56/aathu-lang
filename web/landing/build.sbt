name := "aathu-landing"
version := "0.1.0"
scalaVersion := "3.3.3"

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core"  % "2.1.1",
  "com.github.japgolly.scalajs-react" %%% "extra" % "2.1.1",
  "org.scala-js"                       %%% "scalajs-dom" % "2.8.0",
)

Compile / npmDependencies ++= Seq(
  "react"     -> "17.0.2",
  "react-dom" -> "17.0.2",
)

scalaJSUseMainModuleInitializer := true

webpackConfigFile := Some(baseDirectory.value / "webpack.config.js")
