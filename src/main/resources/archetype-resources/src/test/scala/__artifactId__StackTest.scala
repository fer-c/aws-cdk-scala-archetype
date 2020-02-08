package ${package}

import software.amazon.awscdk.core.App
import software.amazon.awscdk.core.Stack
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import org.junit.{Assert, Test};

class ${artifactId}StackTest {
    import Assert.assertEquals

    val JSON: ObjectMapper =
        new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true);

    import JSON._

    @Test
    def testStack(): Unit = {
        val app = new App();
        val stack: Stack = new ${artifactId}Stack(app, "test");

        // synthesize the stack to a CloudFormation template and compare against
        // a checked-in JSON file.
        val actual: JsonNode = valueToTree(app.synth().getStackArtifact(stack.getArtifactId).getTemplate);
        assertEquals(new ObjectMapper().createObjectNode(), actual);
    }
}
