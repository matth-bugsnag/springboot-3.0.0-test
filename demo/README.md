Project for testing Springboot 3.0.0-RCI

The base project uses some code taken from the `bugsnag-java` springboot-web example (e.g. notifier and async implementation).

In its current state this project will not work (See notes in `Config.java`).

Removing line 10 in `Config.java` will allow the application to start, however, only handled errors will be sent to Bugsnag. 

To run project use: `gradle bootRun`

