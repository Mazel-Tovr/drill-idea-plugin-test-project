# drill-idea-plugin-test-project
This repository created for testing [drill idea plugin](https://github.com/Drill4J/intellij-plugin) <br>
# Jacoco
Run `./gradlew simple-app:test` to generated jacoco file exec file <br>
Display coverage in idea: `Run` -> `Show Coverage Data` -> `+` seclet test.exec file (in /simple-app/build/jacoco/test.exec)
# Drill
Run app with drill `./gradlew simple-app:bootRun` then run autotest `./gradlew autotest:test` to get coverage in drill admin <br>
Use [drill idea plugin](https://github.com/Drill4J/intellij-plugin) to get coverage from drill and display it in idea (see README)
