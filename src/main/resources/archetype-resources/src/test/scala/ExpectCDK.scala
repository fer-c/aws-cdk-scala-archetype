package ${package}

import com.fasterxml.jackson.databind._
import com.fasterxml.jackson.module.scala._
import org.junit.Assert.assertEquals

object ExpectCDK {


  val JSON = new ObjectMapper() with ScalaObjectMapper
  JSON.registerModule(DefaultScalaModule)
  JSON.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
  JSON.configure(SerializationFeature.INDENT_OUTPUT, true)

  import JSON._

  def expect(expected: Any, template: Any) {
    val actual: JsonNode = valueToTree(template);
    assertEquals(writeValueAsString( expected), actual.toPrettyString
    );
  }
}
