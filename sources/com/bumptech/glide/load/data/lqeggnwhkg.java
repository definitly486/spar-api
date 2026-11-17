package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends FilterInputStream {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final int f20789cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final int f20790iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final byte[] f20791jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f20792yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final byte f20793zdlpuopuiu;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f20791jyumaefscl = bArr;
        int length = bArr.length;
        f20790iwizpuwonk = length;
        f20789cqumvgiudr = length + 2;
    }

    public lqeggnwhkg(InputStream inputStream, int i13) {
        super(inputStream);
        if (i13 >= -1 && i13 <= 8) {
            this.f20793zdlpuopuiu = (byte) i13;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i13);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i13;
        int i14;
        int i15 = this.f20792yggfygwlhe;
        if (i15 < 2 || i15 > (i14 = f20789cqumvgiudr)) {
            i13 = super.read();
        } else {
            i13 = i15 == i14 ? this.f20793zdlpuopuiu : f20791jyumaefscl[i15 - 2] & 255;
        }
        if (i13 != -1) {
            this.f20792yggfygwlhe++;
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j13) throws IOException {
        long jSkip = super.skip(j13);
        if (jSkip > 0) {
            this.f20792yggfygwlhe = (int) (((long) this.f20792yggfygwlhe) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) throws IOException {
        int i15;
        int i16 = this.f20792yggfygwlhe;
        int i17 = f20789cqumvgiudr;
        if (i16 > i17) {
            i15 = super.read(bArr, i13, i14);
        } else if (i16 == i17) {
            bArr[i13] = this.f20793zdlpuopuiu;
            i15 = 1;
        } else if (i16 < 2) {
            i15 = super.read(bArr, i13, 2 - i16);
        } else {
            int iMin = Math.min(i17 - i16, i14);
            System.arraycopy(f20791jyumaefscl, this.f20792yggfygwlhe - 2, bArr, i13, iMin);
            i15 = iMin;
        }
        if (i15 > 0) {
            this.f20792yggfygwlhe += i15;
        }
        return i15;
    }
}
