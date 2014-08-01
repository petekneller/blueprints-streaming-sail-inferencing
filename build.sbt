organization := "blueprints-streaming-sail-inferencing"

version := "1.0"

name := "blueprints-streaming-sail-inferencing"

scalaVersion := "2.10.2"

//fork in run := true

//javaOptions in run += "-Xmx1500m"

resolvers += "neo4j-public-repository" at "http://m2.neo4j.org"

libraryDependencies += "com.tinkerpop.blueprints" % "blueprints-neo4j2-graph" % "2.5.0"

libraryDependencies += "com.tinkerpop.blueprints" % "blueprints-graph-sail" % "2.5.0"