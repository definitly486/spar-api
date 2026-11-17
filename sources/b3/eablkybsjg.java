package b3;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends InputStream {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f15039esjtqupxsv;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f15042yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f15043zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f15040iwizpuwonk = false;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f15038cqumvgiudr = false;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final byte[] f15041jyumaefscl = new byte[1];

    public eablkybsjg(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar) {
        this.f15043zdlpuopuiu = iobyxmoadgVar;
        this.f15042yggfygwlhe = lqeggnwhkgVar;
    }

    private void iobyxmoadg() {
        if (this.f15040iwizpuwonk) {
            return;
        }
        this.f15043zdlpuopuiu.iobyxmoadg(this.f15042yggfygwlhe);
        this.f15040iwizpuwonk = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f15038cqumvgiudr) {
            return;
        }
        this.f15043zdlpuopuiu.close();
        this.f15038cqumvgiudr = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f15041jyumaefscl) == -1) {
            return -1;
        }
        return this.f15041jyumaefscl[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f15038cqumvgiudr);
        iobyxmoadg();
        int iZoijcleaow = this.f15043zdlpuopuiu.zoijcleaow(bArr, i13, i14);
        if (iZoijcleaow == -1) {
            return -1;
        }
        this.f15039esjtqupxsv += (long) iZoijcleaow;
        return iZoijcleaow;
    }
}
