val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).filter(_ != "").getOrElse("1.0.0")

val scalaNativeVersion =
  Option(System.getenv("SCALANATIVE_VERSION")).filter(_ != "").getOrElse("0.4.4")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.3.2")

addSbtPlugin("org.scala-native" % "sbt-scala-native" % scalaNativeVersion)
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.3.2")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.8.1")
