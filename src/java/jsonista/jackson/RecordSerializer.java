package jsonista.jackson;

import clojure.lang.IRecord;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class RecordSerializer extends StdSerializer<IRecord> {

  public RecordSerializer() {
    super(RecordSerializer.class, true);
  }

  @Override
  public void serialize(IRecord value, JsonGenerator gen, SerializerProvider provider) throws IOException {
    gen.writeObject(value);
  }
}
