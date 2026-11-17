package il;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ppxfxbqfkf extends HashMap implements Map, zoijcleaow, wkgbmnqykc {
    private static final long serialVersionUID = -503443796854799292L;

    public static void agtfadlqog(Map map, Writer writer) throws IOException {
        if (map == null) {
            writer.write("null");
            return;
        }
        writer.write(123);
        boolean z13 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z13) {
                z13 = false;
            } else {
                writer.write(44);
            }
            writer.write(34);
            writer.write(lqeggnwhkg(String.valueOf(entry.getKey())));
            writer.write(34);
            writer.write(58);
            eablkybsjg.wkgbmnqykc(entry.getValue(), writer);
        }
        writer.write(125);
    }

    public static String draadjrbmk(Map map) {
        StringWriter stringWriter = new StringWriter();
        try {
            agtfadlqog(map, stringWriter);
            return stringWriter.toString();
        } catch (IOException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static String lqeggnwhkg(String str) {
        return eablkybsjg.iobyxmoadg(str);
    }

    @Override // il.wkgbmnqykc
    public void iobyxmoadg(Writer writer) throws IOException {
        agtfadlqog(this, writer);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return wkgbmnqykc();
    }

    @Override // il.zoijcleaow
    public String wkgbmnqykc() {
        return draadjrbmk(this);
    }
}
