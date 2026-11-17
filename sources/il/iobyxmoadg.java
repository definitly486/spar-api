package il;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg extends ArrayList implements zoijcleaow, wkgbmnqykc {
    private static final long serialVersionUID = 3957988303675231981L;

    public static void agtfadlqog(Collection collection, Writer writer) throws IOException {
        if (collection == null) {
            writer.write("null");
            return;
        }
        writer.write(91);
        boolean z13 = true;
        for (Object obj : collection) {
            if (z13) {
                z13 = false;
            } else {
                writer.write(44);
            }
            if (obj == null) {
                writer.write("null");
            } else {
                eablkybsjg.wkgbmnqykc(obj, writer);
            }
        }
        writer.write(93);
    }

    public static void cqumvgiudr(short[] sArr, Writer writer) throws IOException {
        if (sArr == null) {
            writer.write("null");
            return;
        }
        if (sArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf((int) sArr[0]));
        for (int i13 = 1; i13 < sArr.length; i13++) {
            writer.write(StringUtils.COMMA);
            writer.write(String.valueOf((int) sArr[i13]));
        }
        writer.write("]");
    }

    public static String draadjrbmk(Collection collection) {
        StringWriter stringWriter = new StringWriter();
        try {
            agtfadlqog(collection, stringWriter);
            return stringWriter.toString();
        } catch (IOException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static void jyumaefscl(Object[] objArr, Writer writer) throws IOException {
        if (objArr == null) {
            writer.write("null");
            return;
        }
        if (objArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        eablkybsjg.wkgbmnqykc(objArr[0], writer);
        for (int i13 = 1; i13 < objArr.length; i13++) {
            writer.write(StringUtils.COMMA);
            eablkybsjg.wkgbmnqykc(objArr[i13], writer);
        }
        writer.write("]");
    }

    public static void kcexrzcfyt(float[] fArr, Writer writer) throws IOException {
        if (fArr == null) {
            writer.write("null");
            return;
        }
        if (fArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(fArr[0]));
        for (int i13 = 1; i13 < fArr.length; i13++) {
            writer.write(StringUtils.COMMA);
            writer.write(String.valueOf(fArr[i13]));
        }
        writer.write("]");
    }

    public static void lereixgezr(boolean[] zArr, Writer writer) throws IOException {
        if (zArr == null) {
            writer.write("null");
            return;
        }
        if (zArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(zArr[0]));
        for (int i13 = 1; i13 < zArr.length; i13++) {
            writer.write(StringUtils.COMMA);
            writer.write(String.valueOf(zArr[i13]));
        }
        writer.write("]");
    }

    public static void ojitshcjhn(byte[] bArr, Writer writer) throws IOException {
        if (bArr == null) {
            writer.write("null");
            return;
        }
        if (bArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf((int) bArr[0]));
        for (int i13 = 1; i13 < bArr.length; i13++) {
            writer.write(StringUtils.COMMA);
            writer.write(String.valueOf((int) bArr[i13]));
        }
        writer.write("]");
    }

    public static void rgvfuqvkyq(char[] cArr, Writer writer) throws IOException {
        if (cArr == null) {
            writer.write("null");
            return;
        }
        if (cArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[\"");
        writer.write(eablkybsjg.iobyxmoadg(String.valueOf(cArr[0])));
        for (int i13 = 1; i13 < cArr.length; i13++) {
            writer.write("\",\"");
            writer.write(eablkybsjg.iobyxmoadg(String.valueOf(cArr[i13])));
        }
        writer.write("\"]");
    }

    public static void vdvldrhtss(double[] dArr, Writer writer) throws IOException {
        if (dArr == null) {
            writer.write("null");
            return;
        }
        if (dArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(dArr[0]));
        for (int i13 = 1; i13 < dArr.length; i13++) {
            writer.write(StringUtils.COMMA);
            writer.write(String.valueOf(dArr[i13]));
        }
        writer.write("]");
    }

    public static void yggfygwlhe(long[] jArr, Writer writer) throws IOException {
        if (jArr == null) {
            writer.write("null");
            return;
        }
        if (jArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(jArr[0]));
        for (int i13 = 1; i13 < jArr.length; i13++) {
            writer.write(StringUtils.COMMA);
            writer.write(String.valueOf(jArr[i13]));
        }
        writer.write("]");
    }

    public static void zdlpuopuiu(int[] iArr, Writer writer) throws IOException {
        if (iArr == null) {
            writer.write("null");
            return;
        }
        if (iArr.length == 0) {
            writer.write("[]");
            return;
        }
        writer.write("[");
        writer.write(String.valueOf(iArr[0]));
        for (int i13 = 1; i13 < iArr.length; i13++) {
            writer.write(StringUtils.COMMA);
            writer.write(String.valueOf(iArr[i13]));
        }
        writer.write("]");
    }

    @Override // il.wkgbmnqykc
    public void iobyxmoadg(Writer writer) throws IOException {
        agtfadlqog(this, writer);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return wkgbmnqykc();
    }

    @Override // il.zoijcleaow
    public String wkgbmnqykc() {
        return draadjrbmk(this);
    }
}
