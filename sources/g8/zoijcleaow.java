package g8;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
class zoijcleaow implements Closeable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f36611cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f36612iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private byte[] f36613jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Charset f36614yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final InputStream f36615zdlpuopuiu;

    class iobyxmoadg extends ByteArrayOutputStream {
        iobyxmoadg(int i13) {
            super(i13);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i13 = ((ByteArrayOutputStream) this).count;
            if (i13 > 0 && ((ByteArrayOutputStream) this).buf[i13 - 1] == 13) {
                i13--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i13, zoijcleaow.this.f36614yggfygwlhe.name());
            } catch (UnsupportedEncodingException e13) {
                throw new AssertionError(e13);
            }
        }
    }

    zoijcleaow(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void wkgbmnqykc() throws IOException {
        InputStream inputStream = this.f36615zdlpuopuiu;
        byte[] bArr = this.f36613jyumaefscl;
        int i13 = inputStream.read(bArr, 0, bArr.length);
        if (i13 == -1) {
            throw new EOFException();
        }
        this.f36612iwizpuwonk = 0;
        this.f36611cqumvgiudr = i13;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f36615zdlpuopuiu) {
            try {
                if (this.f36613jyumaefscl != null) {
                    this.f36613jyumaefscl = null;
                    this.f36615zdlpuopuiu.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean lqeggnwhkg() {
        return this.f36611cqumvgiudr == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    String nufgyqmvbu() {
        int i13;
        byte[] bArr;
        int i14;
        synchronized (this.f36615zdlpuopuiu) {
            try {
                if (this.f36613jyumaefscl == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f36612iwizpuwonk >= this.f36611cqumvgiudr) {
                    wkgbmnqykc();
                }
                for (int i15 = this.f36612iwizpuwonk; i15 != this.f36611cqumvgiudr; i15++) {
                    byte[] bArr2 = this.f36613jyumaefscl;
                    if (bArr2[i15] == 10) {
                        int i16 = this.f36612iwizpuwonk;
                        if (i15 != i16) {
                            i14 = i15 - 1;
                            if (bArr2[i14] != 13) {
                                i14 = i15;
                            }
                        } else {
                            i14 = i15;
                        }
                        String str = new String(bArr2, i16, i14 - i16, this.f36614yggfygwlhe.name());
                        this.f36612iwizpuwonk = i15 + 1;
                        return str;
                    }
                }
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg((this.f36611cqumvgiudr - this.f36612iwizpuwonk) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f36613jyumaefscl;
                    int i17 = this.f36612iwizpuwonk;
                    iobyxmoadgVar.write(bArr3, i17, this.f36611cqumvgiudr - i17);
                    this.f36611cqumvgiudr = -1;
                    wkgbmnqykc();
                    i13 = this.f36612iwizpuwonk;
                    while (i13 != this.f36611cqumvgiudr) {
                        bArr = this.f36613jyumaefscl;
                        if (bArr[i13] == 10) {
                            break loop1;
                        }
                        i13++;
                    }
                }
                int i18 = this.f36612iwizpuwonk;
                if (i13 != i18) {
                    iobyxmoadgVar.write(bArr, i18, i13 - i18);
                }
                this.f36612iwizpuwonk = i13 + 1;
                return iobyxmoadgVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    zoijcleaow(InputStream inputStream, int i13, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(ppxfxbqfkf.f36609iobyxmoadg)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f36615zdlpuopuiu = inputStream;
        this.f36614yggfygwlhe = charset;
        this.f36613jyumaefscl = new byte[i13];
    }
}
