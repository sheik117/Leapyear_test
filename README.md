# Leapyear_test
Brukte "Java CI with Gradle" til å generere en workflow.
Fik en error: "Error: Gradle script '/home/runner/work/Leapyear_test/Leapyear_test/gradlew' is not executable." som tilsa at jeg måtte gi kjøre rettigheter med komandoen "git update-index --chmod=+x gradlew".
La også til:
"
    - name: Run chmod to make gradlew executable
      run: chmod +x ./gradlew
"
som et step i builden siden jeg ikke fikk til det forige steget med en gang

La til:
"
    - name: Gradle Test
      run: gradle test
"
i pipelinen, og la til:
"
testLogging {
        events "passed", "skipped", "failed", "standardOut", "standardError"
    }
"
i build.gradle for å se testene kjøre i Github Actions.
