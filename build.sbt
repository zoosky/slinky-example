enablePlugins(ScalaJSBundlerPlugin)

name := "slinky-example"

scalaVersion in ThisBuild := "2.12.3"

scalacOptions in ThisBuild ++= Seq("-feature", "-deprecation")

scalaJSUseMainModuleInitializer := true

npmDependencies in Compile += "react" -> "15.6.1"

npmDependencies in Compile += "react-dom" -> "15.6.1"

npmDependencies in Compile += "react-proxy" -> "1.1.8"

webpackConfigFile in fastOptJS := Some(baseDirectory.value / "webpack-fastopt.config.js")
webpackConfigFile in fullOptJS := Some(baseDirectory.value / "webpack-opt.config.js")

emitSourceMaps := false

webpackDevServerExtraArgs := Seq("--inline", "--hot")

libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.1.1" // core React functionality, no React DOM
libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.1.1" // React DOM, HTML and SVG tags
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.1.1" // Hot loading with Webpack
libraryDependencies += "me.shadaj" %%% "slinky-scalajsreact-interop" % "0.1.1" // Interop with japgolly/scalajs-react
