package jd;

import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow extends OutputStream {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    long f51117iwizpuwonk = -1;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    lqeggnwhkg f51118jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Timer f51119yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final OutputStream f51120zdlpuopuiu;

    public zoijcleaow(OutputStream outputStream, lqeggnwhkg lqeggnwhkgVar, Timer timer) {
        this.f51120zdlpuopuiu = outputStream;
        this.f51118jyumaefscl = lqeggnwhkgVar;
        this.f51119yggfygwlhe = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j13 = this.f51117iwizpuwonk;
        if (j13 != -1) {
            this.f51118jyumaefscl.iwizpuwonk(j13);
        }
        this.f51118jyumaefscl.lmojexxdyd(this.f51119yggfygwlhe.eablkybsjg());
        try {
            this.f51120zdlpuopuiu.close();
        } catch (IOException e13) {
            this.f51118jyumaefscl.wwaezpbzkn(this.f51119yggfygwlhe.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51118jyumaefscl);
            throw e13;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f51120zdlpuopuiu.flush();
        } catch (IOException e13) {
            this.f51118jyumaefscl.wwaezpbzkn(this.f51119yggfygwlhe.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51118jyumaefscl);
            throw e13;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i13) throws IOException {
        try {
            this.f51120zdlpuopuiu.write(i13);
            long j13 = this.f51117iwizpuwonk + 1;
            this.f51117iwizpuwonk = j13;
            this.f51118jyumaefscl.iwizpuwonk(j13);
        } catch (IOException e13) {
            this.f51118jyumaefscl.wwaezpbzkn(this.f51119yggfygwlhe.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51118jyumaefscl);
            throw e13;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f51120zdlpuopuiu.write(bArr);
            long length = this.f51117iwizpuwonk + ((long) bArr.length);
            this.f51117iwizpuwonk = length;
            this.f51118jyumaefscl.iwizpuwonk(length);
        } catch (IOException e13) {
            this.f51118jyumaefscl.wwaezpbzkn(this.f51119yggfygwlhe.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51118jyumaefscl);
            throw e13;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i13, int i14) throws IOException {
        try {
            this.f51120zdlpuopuiu.write(bArr, i13, i14);
            long j13 = this.f51117iwizpuwonk + ((long) i14);
            this.f51117iwizpuwonk = j13;
            this.f51118jyumaefscl.iwizpuwonk(j13);
        } catch (IOException e13) {
            this.f51118jyumaefscl.wwaezpbzkn(this.f51119yggfygwlhe.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51118jyumaefscl);
            throw e13;
        }
    }
}
