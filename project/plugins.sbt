scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)

libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % "always"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.19")

addSbtPlugin("com.heroku" % "sbt-heroku" % "2.1.4")
