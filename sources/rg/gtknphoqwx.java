package rg;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx {
    public static final long iobyxmoadg(Reader reader, Writer out, int i13) throws IOException {
        zdlpuopuiu.btonecajqb(reader, "<this>");
        zdlpuopuiu.btonecajqb(out, "out");
        char[] cArr = new char[i13];
        int i14 = reader.read(cArr);
        long j13 = 0;
        while (i14 >= 0) {
            out.write(cArr, 0, i14);
            j13 += (long) i14;
            i14 = reader.read(cArr);
        }
        return j13;
    }

    public static final String ppxfxbqfkf(Reader reader) {
        zdlpuopuiu.btonecajqb(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        zoijcleaow(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ long zoijcleaow(Reader reader, Writer writer, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 8192;
        }
        return iobyxmoadg(reader, writer, i13);
    }
}
