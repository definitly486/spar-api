package b3;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk implements androidx.media3.datasource.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f15032iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f15033ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f15034wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f15035zoijcleaow;

    public draadjrbmk(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar) {
        this.f15032iobyxmoadg = (androidx.media3.datasource.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        this.f15035zoijcleaow = (wkgbmnqykc) y2.iobyxmoadg.eablkybsjg(wkgbmnqykcVar);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        return this.f15032iobyxmoadg.agtfadlqog();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        try {
            this.f15032iobyxmoadg.close();
        } finally {
            if (this.f15033ppxfxbqfkf) {
                this.f15033ppxfxbqfkf = false;
                this.f15035zoijcleaow.close();
            }
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void eablkybsjg(wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
        this.f15032iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
        long jIobyxmoadg = this.f15032iobyxmoadg.iobyxmoadg(lqeggnwhkgVar);
        this.f15034wkgbmnqykc = jIobyxmoadg;
        if (jIobyxmoadg == 0) {
            return 0L;
        }
        if (lqeggnwhkgVar.f15059nufgyqmvbu == -1 && jIobyxmoadg != -1) {
            lqeggnwhkgVar = lqeggnwhkgVar.eablkybsjg(0L, jIobyxmoadg);
        }
        this.f15033ppxfxbqfkf = true;
        this.f15035zoijcleaow.iobyxmoadg(lqeggnwhkgVar);
        return this.f15034wkgbmnqykc;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Map wkgbmnqykc() {
        return this.f15032iobyxmoadg.wkgbmnqykc();
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) {
        if (this.f15034wkgbmnqykc == 0) {
            return -1;
        }
        int iZoijcleaow = this.f15032iobyxmoadg.zoijcleaow(bArr, i13, i14);
        if (iZoijcleaow > 0) {
            this.f15035zoijcleaow.gtknphoqwx(bArr, i13, iZoijcleaow);
            long j13 = this.f15034wkgbmnqykc;
            if (j13 != -1) {
                this.f15034wkgbmnqykc = j13 - ((long) iZoijcleaow);
            }
        }
        return iZoijcleaow;
    }
}
