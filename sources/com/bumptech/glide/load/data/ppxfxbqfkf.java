package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf extends OutputStream {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f20794iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private o8.zoijcleaow f20795jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private byte[] f20796yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final OutputStream f20797zdlpuopuiu;

    public ppxfxbqfkf(OutputStream outputStream, o8.zoijcleaow zoijcleaowVar) {
        this(outputStream, zoijcleaowVar, 65536);
    }

    private void iobyxmoadg() throws IOException {
        int i13 = this.f20794iwizpuwonk;
        if (i13 > 0) {
            this.f20797zdlpuopuiu.write(this.f20796yggfygwlhe, 0, i13);
            this.f20794iwizpuwonk = 0;
        }
    }

    private void release() {
        byte[] bArr = this.f20796yggfygwlhe;
        if (bArr != null) {
            this.f20795jyumaefscl.eablkybsjg(bArr);
            this.f20796yggfygwlhe = null;
        }
    }

    private void wkgbmnqykc() throws IOException {
        if (this.f20794iwizpuwonk == this.f20796yggfygwlhe.length) {
            iobyxmoadg();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f20797zdlpuopuiu.close();
            release();
        } catch (Throwable th2) {
            this.f20797zdlpuopuiu.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        iobyxmoadg();
        this.f20797zdlpuopuiu.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i13) throws IOException {
        byte[] bArr = this.f20796yggfygwlhe;
        int i14 = this.f20794iwizpuwonk;
        this.f20794iwizpuwonk = i14 + 1;
        bArr[i14] = (byte) i13;
        wkgbmnqykc();
    }

    ppxfxbqfkf(OutputStream outputStream, o8.zoijcleaow zoijcleaowVar, int i13) {
        this.f20797zdlpuopuiu = outputStream;
        this.f20795jyumaefscl = zoijcleaowVar;
        this.f20796yggfygwlhe = (byte[]) zoijcleaowVar.ppxfxbqfkf(i13, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = 0;
        do {
            int i16 = i14 - i15;
            int i17 = i13 + i15;
            int i18 = this.f20794iwizpuwonk;
            if (i18 == 0 && i16 >= this.f20796yggfygwlhe.length) {
                this.f20797zdlpuopuiu.write(bArr, i17, i16);
                return;
            }
            int iMin = Math.min(i16, this.f20796yggfygwlhe.length - i18);
            System.arraycopy(bArr, i17, this.f20796yggfygwlhe, this.f20794iwizpuwonk, iMin);
            this.f20794iwizpuwonk += iMin;
            i15 += iMin;
            wkgbmnqykc();
        } while (i15 < i14);
    }
}
