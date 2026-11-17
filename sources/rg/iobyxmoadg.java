package rg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static final long iobyxmoadg(InputStream inputStream, OutputStream out, int i13) throws IOException {
        zdlpuopuiu.btonecajqb(inputStream, "<this>");
        zdlpuopuiu.btonecajqb(out, "out");
        byte[] bArr = new byte[i13];
        int i14 = inputStream.read(bArr);
        long j13 = 0;
        while (i14 >= 0) {
            out.write(bArr, 0, i14);
            j13 += (long) i14;
            i14 = inputStream.read(bArr);
        }
        return j13;
    }

    public static final byte[] ppxfxbqfkf(InputStream inputStream) {
        zdlpuopuiu.btonecajqb(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        zoijcleaow(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        zdlpuopuiu.dxjokdxxww(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ long zoijcleaow(InputStream inputStream, OutputStream outputStream, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 8192;
        }
        return iobyxmoadg(inputStream, outputStream, i13);
    }
}
