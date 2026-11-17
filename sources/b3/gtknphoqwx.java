package b3;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx implements androidx.media3.datasource.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f15044iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Uri f15045ppxfxbqfkf = Uri.EMPTY;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Map f15046wkgbmnqykc = Collections.emptyMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f15047zoijcleaow;

    public gtknphoqwx(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar) {
        this.f15044iobyxmoadg = (androidx.media3.datasource.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        return this.f15044iobyxmoadg.agtfadlqog();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        this.f15044iobyxmoadg.close();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void eablkybsjg(wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
        this.f15044iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
        this.f15045ppxfxbqfkf = lqeggnwhkgVar.f15057iobyxmoadg;
        this.f15046wkgbmnqykc = Collections.emptyMap();
        try {
            return this.f15044iobyxmoadg.iobyxmoadg(lqeggnwhkgVar);
        } finally {
            Uri uriAgtfadlqog = agtfadlqog();
            if (uriAgtfadlqog != null) {
                this.f15045ppxfxbqfkf = uriAgtfadlqog;
            }
            this.f15046wkgbmnqykc = wkgbmnqykc();
        }
    }

    public void kcexrzcfyt() {
        this.f15047zoijcleaow = 0L;
    }

    public Map oxmwwwfdhm() {
        return this.f15046wkgbmnqykc;
    }

    public long rgvfuqvkyq() {
        return this.f15047zoijcleaow;
    }

    public Uri vdvldrhtss() {
        return this.f15045ppxfxbqfkf;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Map wkgbmnqykc() {
        return this.f15044iobyxmoadg.wkgbmnqykc();
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) {
        int iZoijcleaow = this.f15044iobyxmoadg.zoijcleaow(bArr, i13, i14);
        if (iZoijcleaow != -1) {
            this.f15047zoijcleaow += (long) iZoijcleaow;
        }
        return iZoijcleaow;
    }
}
