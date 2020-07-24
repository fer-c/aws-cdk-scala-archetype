package ${package}

import org.junit.Test
import software.amazon.awscdk.core.{App, Stack}

class ${artifactId}StackTest {

    @Test
    def testStack(): Unit = {
        val app = new App();
        // WHEN
        val stack: Stack = new ${artifactId}Stack(app, "MyTestStack");
        val template = app.synth().getStackArtifact(stack.getArtifactId).getTemplate
        // THEN
        /*

        You can build the output using Map/List/Strings 

        val expected = Map(
            "Resources"-> Map(
                "MyTestStackApp85A44070" -> Map( 
                )))                
        */
        val expected = Map()

        ExpectCDK.expect(expected, template)
    }
}
