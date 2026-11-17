package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
final class agtfadlqog implements androidx.media3.datasource.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f11100eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f11101iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f11102ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final byte[] f11103wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f11104zoijcleaow;

    public interface iobyxmoadg {
        void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar);
    }

    public agtfadlqog(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, int i13, iobyxmoadg iobyxmoadgVar2) {
        y2.iobyxmoadg.iobyxmoadg(i13 > 0);
        this.f11101iobyxmoadg = iobyxmoadgVar;
        this.f11104zoijcleaow = i13;
        this.f11102ppxfxbqfkf = iobyxmoadgVar2;
        this.f11103wkgbmnqykc = new byte[1];
        this.f11100eablkybsjg = i13;
    }

    private boolean rgvfuqvkyq() {
        if (this.f11101iobyxmoadg.zoijcleaow(this.f11103wkgbmnqykc, 0, 1) == -1) {
            return false;
        }
        int i13 = (this.f11103wkgbmnqykc[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
        if (i13 == 0) {
            return true;
        }
        byte[] bArr = new byte[i13];
        int i14 = i13;
        int i15 = 0;
        while (i14 > 0) {
            int iZoijcleaow = this.f11101iobyxmoadg.zoijcleaow(bArr, i15, i14);
            if (iZoijcleaow == -1) {
                return false;
            }
            i15 += iZoijcleaow;
            i14 -= iZoijcleaow;
        }
        while (i13 > 0 && bArr[i13 - 1] == 0) {
            i13--;
        }
        if (i13 > 0) {
            this.f11102ppxfxbqfkf.iobyxmoadg(new y2.yadqdtsiqt(bArr, i13));
        }
        return true;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        return this.f11101iobyxmoadg.agtfadlqog();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void eablkybsjg(b3.wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
        this.f11101iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(b3.lqeggnwhkg lqeggnwhkgVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Map wkgbmnqykc() {
        return this.f11101iobyxmoadg.wkgbmnqykc();
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) {
        if (this.f11100eablkybsjg == 0) {
            if (!rgvfuqvkyq()) {
                return -1;
            }
            this.f11100eablkybsjg = this.f11104zoijcleaow;
        }
        int iZoijcleaow = this.f11101iobyxmoadg.zoijcleaow(bArr, i13, Math.min(this.f11100eablkybsjg, i14));
        if (iZoijcleaow != -1) {
            this.f11100eablkybsjg -= iZoijcleaow;
        }
        return iZoijcleaow;
    }
}
