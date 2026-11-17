package ydmasvzmpa;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cllcsxoeiz extends androidx.compose.foundation.lazy.layout.stevsuqkhv {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.jpowsppfya f124411ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f124412wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vdvldrhtss f124413zoijcleaow;

    public cllcsxoeiz(vdvldrhtss vdvldrhtssVar, androidx.compose.foundation.lazy.layout.jpowsppfya jpowsppfyaVar, int i13) {
        this.f124413zoijcleaow = vdvldrhtssVar;
        this.f124411ppxfxbqfkf = jpowsppfyaVar;
        this.f124412wkgbmnqykc = i13;
    }

    public final hkdspvbjdz eablkybsjg(int i13, long j13, int i14, int i15, int i16) {
        int iWflxmlrfwp;
        Object objWkgbmnqykc = this.f124413zoijcleaow.wkgbmnqykc(i13);
        Object objGxszxtbevo = this.f124413zoijcleaow.gxszxtbevo(i13);
        List listZoijcleaow = zoijcleaow(this.f124411ppxfxbqfkf, i13, j13);
        if (w0.zoijcleaow.btonecajqb(j13)) {
            iWflxmlrfwp = w0.zoijcleaow.agtfadlqog(j13);
        } else {
            if (!w0.zoijcleaow.dxjokdxxww(j13)) {
                rlfsiqarku.eablkybsjg.iobyxmoadg("does not have fixed height");
            }
            iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
        }
        return ppxfxbqfkf(i13, objWkgbmnqykc, objGxszxtbevo, iWflxmlrfwp, i16, listZoijcleaow, j13, i14, i15);
    }

    public final androidx.collection.wflxmlrfwp gxszxtbevo() {
        return this.f124413zoijcleaow.eablkybsjg();
    }

    public final androidx.compose.foundation.lazy.layout.yadqdtsiqt lqeggnwhkg() {
        return this.f124413zoijcleaow.zoijcleaow();
    }

    public abstract hkdspvbjdz ppxfxbqfkf(int i13, Object obj, Object obj2, int i14, int i15, List list, long j13, int i16, int i17);

    @Override // androidx.compose.foundation.lazy.layout.stevsuqkhv
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public hkdspvbjdz iobyxmoadg(int i13, int i14, int i15, long j13) {
        return eablkybsjg(i13, j13, i14, i15, this.f124412wkgbmnqykc);
    }
}
