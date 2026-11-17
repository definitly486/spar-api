package p9;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jyumaefscl {
    static jyumaefscl iobyxmoadg(long j13) {
        return new draadjrbmk(j13);
    }

    public static jyumaefscl zoijcleaow(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        jyumaefscl jyumaefsclVarIobyxmoadg = iobyxmoadg(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return jyumaefsclVarIobyxmoadg;
                    }
                    jyumaefscl jyumaefsclVarIobyxmoadg2 = iobyxmoadg(jsonReader.nextLong());
                    jsonReader.close();
                    return jyumaefsclVarIobyxmoadg2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public abstract long ppxfxbqfkf();
}
