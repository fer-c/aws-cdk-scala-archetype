package ${package}

import software.amazon.awscdk.core.App;

object ${artifactId}App extends scala.App {
  val app = new App();
  new ${artifactId}Stack(app, s"${artifactId}Stack");
  app.synth();
}
