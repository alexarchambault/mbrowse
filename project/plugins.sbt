addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.13.1")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.18")
addSbtPlugin(
  "io.get-coursier" % "sbt-coursier" % coursier.util.Properties.version
)
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.24")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.4.0")
addSbtPlugin("org.portable-scala" % "sbt-crossproject" % "0.4.0")
addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.2.2")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin-shaded" % "0.8.0-RC1"
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
