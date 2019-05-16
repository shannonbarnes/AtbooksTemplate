
organization := "atbooks"

name := "BookTemplate"

scalaVersion := "2.12.8"

unmanagedResourceDirectories in Compile := Seq(baseDirectory.value)

// add the configuration files to things that should be
// included in the jar
includeFilter in unmanagedResources := "*"

// make sure that contents in the target dir dont get sucked up
// into the package recursivly if the build is dirty.
excludeFilter in unmanagedResources := "target" | "library" | "*.sbt" | "*.md" | ".git" | "project" | "sd.allow" | "screwdriver.yaml" | (".*"  - ".")

// disable using the Scala version on artifact
crossPaths := false

lazy val root = (project in file("."))