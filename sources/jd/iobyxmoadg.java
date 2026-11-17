package jd;

import com.google.firebase.perf.util.Timer;
import hd.lqeggnwhkg;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends InputStream {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private long f51107cqumvgiudr;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Timer f51110jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f51111yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final InputStream f51112zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f51109iwizpuwonk = -1;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f51108esjtqupxsv = -1;

    public iobyxmoadg(InputStream inputStream, lqeggnwhkg lqeggnwhkgVar, Timer timer) {
        this.f51110jyumaefscl = timer;
        this.f51112zdlpuopuiu = inputStream;
        this.f51111yggfygwlhe = lqeggnwhkgVar;
        this.f51107cqumvgiudr = lqeggnwhkgVar.lqeggnwhkg();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f51112zdlpuopuiu.available();
        } catch (IOException e13) {
            this.f51111yggfygwlhe.wwaezpbzkn(this.f51110jyumaefscl.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51111yggfygwlhe);
            throw e13;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jEablkybsjg = this.f51110jyumaefscl.eablkybsjg();
        if (this.f51108esjtqupxsv == -1) {
            this.f51108esjtqupxsv = jEablkybsjg;
        }
        try {
            this.f51112zdlpuopuiu.close();
            long j13 = this.f51109iwizpuwonk;
            if (j13 != -1) {
                this.f51111yggfygwlhe.iozdgvuglv(j13);
            }
            long j14 = this.f51107cqumvgiudr;
            if (j14 != -1) {
                this.f51111yggfygwlhe.ylkuphrtab(j14);
            }
            this.f51111yggfygwlhe.wwaezpbzkn(this.f51108esjtqupxsv);
            this.f51111yggfygwlhe.ppxfxbqfkf();
        } catch (IOException e13) {
            this.f51111yggfygwlhe.wwaezpbzkn(this.f51110jyumaefscl.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51111yggfygwlhe);
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i13) {
        this.f51112zdlpuopuiu.mark(i13);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f51112zdlpuopuiu.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i13 = this.f51112zdlpuopuiu.read();
            long jEablkybsjg = this.f51110jyumaefscl.eablkybsjg();
            if (this.f51107cqumvgiudr == -1) {
                this.f51107cqumvgiudr = jEablkybsjg;
            }
            if (i13 == -1 && this.f51108esjtqupxsv == -1) {
                this.f51108esjtqupxsv = jEablkybsjg;
                this.f51111yggfygwlhe.wwaezpbzkn(jEablkybsjg);
                this.f51111yggfygwlhe.ppxfxbqfkf();
            } else {
                long j13 = this.f51109iwizpuwonk + 1;
                this.f51109iwizpuwonk = j13;
                this.f51111yggfygwlhe.iozdgvuglv(j13);
            }
            return i13;
        } catch (IOException e13) {
            this.f51111yggfygwlhe.wwaezpbzkn(this.f51110jyumaefscl.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51111yggfygwlhe);
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f51112zdlpuopuiu.reset();
        } catch (IOException e13) {
            this.f51111yggfygwlhe.wwaezpbzkn(this.f51110jyumaefscl.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51111yggfygwlhe);
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j13) throws IOException {
        try {
            long jSkip = this.f51112zdlpuopuiu.skip(j13);
            long jEablkybsjg = this.f51110jyumaefscl.eablkybsjg();
            if (this.f51107cqumvgiudr == -1) {
                this.f51107cqumvgiudr = jEablkybsjg;
            }
            if (jSkip == -1 && this.f51108esjtqupxsv == -1) {
                this.f51108esjtqupxsv = jEablkybsjg;
                this.f51111yggfygwlhe.wwaezpbzkn(jEablkybsjg);
            } else {
                long j14 = this.f51109iwizpuwonk + jSkip;
                this.f51109iwizpuwonk = j14;
                this.f51111yggfygwlhe.iozdgvuglv(j14);
            }
            return jSkip;
        } catch (IOException e13) {
            this.f51111yggfygwlhe.wwaezpbzkn(this.f51110jyumaefscl.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51111yggfygwlhe);
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) throws IOException {
        try {
            int i15 = this.f51112zdlpuopuiu.read(bArr, i13, i14);
            long jEablkybsjg = this.f51110jyumaefscl.eablkybsjg();
            if (this.f51107cqumvgiudr == -1) {
                this.f51107cqumvgiudr = jEablkybsjg;
            }
            if (i15 == -1 && this.f51108esjtqupxsv == -1) {
                this.f51108esjtqupxsv = jEablkybsjg;
                this.f51111yggfygwlhe.wwaezpbzkn(jEablkybsjg);
                this.f51111yggfygwlhe.ppxfxbqfkf();
            } else {
                long j13 = this.f51109iwizpuwonk + ((long) i15);
                this.f51109iwizpuwonk = j13;
                this.f51111yggfygwlhe.iozdgvuglv(j13);
            }
            return i15;
        } catch (IOException e13) {
            this.f51111yggfygwlhe.wwaezpbzkn(this.f51110jyumaefscl.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51111yggfygwlhe);
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i13 = this.f51112zdlpuopuiu.read(bArr);
            long jEablkybsjg = this.f51110jyumaefscl.eablkybsjg();
            if (this.f51107cqumvgiudr == -1) {
                this.f51107cqumvgiudr = jEablkybsjg;
            }
            if (i13 == -1 && this.f51108esjtqupxsv == -1) {
                this.f51108esjtqupxsv = jEablkybsjg;
                this.f51111yggfygwlhe.wwaezpbzkn(jEablkybsjg);
                this.f51111yggfygwlhe.ppxfxbqfkf();
            } else {
                long j13 = this.f51109iwizpuwonk + ((long) i13);
                this.f51109iwizpuwonk = j13;
                this.f51111yggfygwlhe.iozdgvuglv(j13);
            }
            return i13;
        } catch (IOException e13) {
            this.f51111yggfygwlhe.wwaezpbzkn(this.f51110jyumaefscl.eablkybsjg());
            wkgbmnqykc.wkgbmnqykc(this.f51111yggfygwlhe);
            throw e13;
        }
    }
}
