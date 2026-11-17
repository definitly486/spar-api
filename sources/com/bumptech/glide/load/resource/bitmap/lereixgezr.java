package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class lereixgezr extends FilterInputStream {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f21097cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final o8.zoijcleaow f21098esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f21099iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f21100jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f21101yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile byte[] f21102zdlpuopuiu;

    static class iobyxmoadg extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        iobyxmoadg(String str) {
            super(str);
        }
    }

    public lereixgezr(InputStream inputStream, o8.zoijcleaow zoijcleaowVar) {
        this(inputStream, zoijcleaowVar, 65536);
    }

    private int iobyxmoadg(InputStream inputStream, byte[] bArr) throws IOException {
        int i13 = this.f21099iwizpuwonk;
        if (i13 != -1) {
            int i14 = this.f21097cqumvgiudr - i13;
            int i15 = this.f21100jyumaefscl;
            if (i14 < i15) {
                if (i13 == 0 && i15 > bArr.length && this.f21101yggfygwlhe == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i15) {
                        i15 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f21098esjtqupxsv.ppxfxbqfkf(i15, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f21102zdlpuopuiu = bArr2;
                    this.f21098esjtqupxsv.eablkybsjg(bArr);
                    bArr = bArr2;
                } else if (i13 > 0) {
                    System.arraycopy(bArr, i13, bArr, 0, bArr.length - i13);
                }
                int i16 = this.f21097cqumvgiudr - this.f21099iwizpuwonk;
                this.f21097cqumvgiudr = i16;
                this.f21099iwizpuwonk = 0;
                this.f21101yggfygwlhe = 0;
                int i17 = inputStream.read(bArr, i16, bArr.length - i16);
                int i18 = this.f21097cqumvgiudr;
                if (i17 > 0) {
                    i18 += i17;
                }
                this.f21101yggfygwlhe = i18;
                return i17;
            }
        }
        int i19 = inputStream.read(bArr);
        if (i19 > 0) {
            this.f21099iwizpuwonk = -1;
            this.f21097cqumvgiudr = 0;
            this.f21101yggfygwlhe = i19;
        }
        return i19;
    }

    private static IOException lqeggnwhkg() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f21102zdlpuopuiu == null || inputStream == null) {
            throw lqeggnwhkg();
        }
        return (this.f21101yggfygwlhe - this.f21097cqumvgiudr) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f21102zdlpuopuiu != null) {
            this.f21098esjtqupxsv.eablkybsjg(this.f21102zdlpuopuiu);
            this.f21102zdlpuopuiu = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i13) {
        this.f21100jyumaefscl = Math.max(this.f21100jyumaefscl, i13);
        this.f21099iwizpuwonk = this.f21097cqumvgiudr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f21102zdlpuopuiu;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw lqeggnwhkg();
        }
        if (this.f21097cqumvgiudr >= this.f21101yggfygwlhe && iobyxmoadg(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f21102zdlpuopuiu && (bArr = this.f21102zdlpuopuiu) == null) {
            throw lqeggnwhkg();
        }
        int i13 = this.f21101yggfygwlhe;
        int i14 = this.f21097cqumvgiudr;
        if (i13 - i14 <= 0) {
            return -1;
        }
        this.f21097cqumvgiudr = i14 + 1;
        return bArr[i14] & 255;
    }

    public synchronized void release() {
        if (this.f21102zdlpuopuiu != null) {
            this.f21098esjtqupxsv.eablkybsjg(this.f21102zdlpuopuiu);
            this.f21102zdlpuopuiu = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f21102zdlpuopuiu == null) {
            throw new IOException("Stream is closed");
        }
        int i13 = this.f21099iwizpuwonk;
        if (-1 == i13) {
            throw new iobyxmoadg("Mark has been invalidated, pos: " + this.f21097cqumvgiudr + " markLimit: " + this.f21100jyumaefscl);
        }
        this.f21097cqumvgiudr = i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j13) {
        if (j13 < 1) {
            return 0L;
        }
        byte[] bArr = this.f21102zdlpuopuiu;
        if (bArr == null) {
            throw lqeggnwhkg();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw lqeggnwhkg();
        }
        int i13 = this.f21101yggfygwlhe;
        int i14 = this.f21097cqumvgiudr;
        if (i13 - i14 >= j13) {
            this.f21097cqumvgiudr = (int) (((long) i14) + j13);
            return j13;
        }
        long j14 = ((long) i13) - ((long) i14);
        this.f21097cqumvgiudr = i13;
        if (this.f21099iwizpuwonk == -1 || j13 > this.f21100jyumaefscl) {
            long jSkip = inputStream.skip(j13 - j14);
            if (jSkip > 0) {
                this.f21099iwizpuwonk = -1;
            }
            return j14 + jSkip;
        }
        if (iobyxmoadg(inputStream, bArr) == -1) {
            return j14;
        }
        int i15 = this.f21101yggfygwlhe;
        int i16 = this.f21097cqumvgiudr;
        if (i15 - i16 >= j13 - j14) {
            this.f21097cqumvgiudr = (int) ((((long) i16) + j13) - j14);
            return j13;
        }
        long j15 = (j14 + ((long) i15)) - ((long) i16);
        this.f21097cqumvgiudr = i15;
        return j15;
    }

    public synchronized void wkgbmnqykc() {
        this.f21100jyumaefscl = this.f21102zdlpuopuiu.length;
    }

    lereixgezr(InputStream inputStream, o8.zoijcleaow zoijcleaowVar, int i13) {
        super(inputStream);
        this.f21099iwizpuwonk = -1;
        this.f21098esjtqupxsv = zoijcleaowVar;
        this.f21102zdlpuopuiu = (byte[]) zoijcleaowVar.ppxfxbqfkf(i13, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i13, int i14) {
        int i15;
        int i16;
        byte[] bArr2 = this.f21102zdlpuopuiu;
        if (bArr2 == null) {
            throw lqeggnwhkg();
        }
        if (i14 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i17 = this.f21097cqumvgiudr;
            int i18 = this.f21101yggfygwlhe;
            if (i17 < i18) {
                int i19 = i18 - i17 >= i14 ? i14 : i18 - i17;
                System.arraycopy(bArr2, i17, bArr, i13, i19);
                this.f21097cqumvgiudr += i19;
                if (i19 == i14 || inputStream.available() == 0) {
                    return i19;
                }
                i13 += i19;
                i15 = i14 - i19;
            } else {
                i15 = i14;
            }
            while (true) {
                if (this.f21099iwizpuwonk == -1 && i15 >= bArr2.length) {
                    i16 = inputStream.read(bArr, i13, i15);
                    if (i16 == -1) {
                        return i15 != i14 ? i14 - i15 : -1;
                    }
                } else {
                    if (iobyxmoadg(inputStream, bArr2) == -1) {
                        return i15 != i14 ? i14 - i15 : -1;
                    }
                    if (bArr2 != this.f21102zdlpuopuiu && (bArr2 = this.f21102zdlpuopuiu) == null) {
                        throw lqeggnwhkg();
                    }
                    int i23 = this.f21101yggfygwlhe;
                    int i24 = this.f21097cqumvgiudr;
                    i16 = i23 - i24 >= i15 ? i15 : i23 - i24;
                    System.arraycopy(bArr2, i24, bArr, i13, i16);
                    this.f21097cqumvgiudr += i16;
                }
                i15 -= i16;
                if (i15 == 0) {
                    return i14;
                }
                if (inputStream.available() == 0) {
                    return i14 - i15;
                }
                i13 += i16;
            }
        } else {
            throw lqeggnwhkg();
        }
    }
}
