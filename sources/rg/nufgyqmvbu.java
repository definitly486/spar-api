package rg;

import gg.wwaezpbzkn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu extends lqeggnwhkg {
    public static /* synthetic */ void btonecajqb(File file, String str, Charset charset, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            charset = mj.wkgbmnqykc.f67326zoijcleaow;
        }
        dxjokdxxww(file, str, charset);
    }

    public static final void dxjokdxxww(File file, String text, Charset charset) {
        zdlpuopuiu.btonecajqb(file, "<this>");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            gtknphoqwx(fileOutputStream, text, charset);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            zoijcleaow.iobyxmoadg(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                zoijcleaow.iobyxmoadg(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final ByteBuffer eablkybsjg(int i13, CharsetEncoder encoder) {
        zdlpuopuiu.btonecajqb(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i13 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        zdlpuopuiu.dxjokdxxww(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void gtknphoqwx(OutputStream outputStream, String text, Charset charset) throws IOException {
        zdlpuopuiu.btonecajqb(outputStream, "<this>");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            zdlpuopuiu.dxjokdxxww(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderGxszxtbevo = gxszxtbevo(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        zdlpuopuiu.lqeggnwhkg(charsetEncoderGxszxtbevo);
        ByteBuffer byteBufferEablkybsjg = eablkybsjg(8192, charsetEncoderGxszxtbevo);
        int i13 = 0;
        int i14 = 0;
        while (i13 < text.length()) {
            int iMin = Math.min(8192 - i14, text.length() - i13);
            int i15 = i13 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            zdlpuopuiu.dxjokdxxww(cArrArray, "array(...)");
            text.getChars(i13, i15, cArrArray, i14);
            charBufferAllocate.limit(iMin + i14);
            i14 = 1;
            if (!charsetEncoderGxszxtbevo.encode(charBufferAllocate, byteBufferEablkybsjg, i15 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferEablkybsjg.array(), 0, byteBufferEablkybsjg.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i14 = 0;
            }
            charBufferAllocate.clear();
            byteBufferEablkybsjg.clear();
            i13 = i15;
        }
    }

    public static final CharsetEncoder gxszxtbevo(Charset charset) {
        zdlpuopuiu.btonecajqb(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final String lqeggnwhkg(File file, Charset charset) {
        zdlpuopuiu.btonecajqb(file, "<this>");
        zdlpuopuiu.btonecajqb(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strPpxfxbqfkf = gtknphoqwx.ppxfxbqfkf(inputStreamReader);
            zoijcleaow.iobyxmoadg(inputStreamReader, null);
            return strPpxfxbqfkf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                zoijcleaow.iobyxmoadg(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String nufgyqmvbu(File file, Charset charset, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            charset = mj.wkgbmnqykc.f67326zoijcleaow;
        }
        return lqeggnwhkg(file, charset);
    }

    public static final void ppxfxbqfkf(File file, String text, Charset charset) {
        zdlpuopuiu.btonecajqb(file, "<this>");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            gtknphoqwx(fileOutputStream, text, charset);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            zoijcleaow.iobyxmoadg(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                zoijcleaow.iobyxmoadg(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void wkgbmnqykc(File file, String str, Charset charset, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            charset = mj.wkgbmnqykc.f67326zoijcleaow;
        }
        ppxfxbqfkf(file, str, charset);
    }
}
