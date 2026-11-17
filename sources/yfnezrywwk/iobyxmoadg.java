package yfnezrywwk;

import androidx.compose.foundation.lazy.layout.dvvnrvtcbc;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg implements pkzmftpjix {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float f124759gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f124760iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow f124761ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f124762wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f124763zoijcleaow = -1;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f124758eablkybsjg = -1;

    public iobyxmoadg(int i13) {
        this.f124760iobyxmoadg = i13;
    }

    private final int eablkybsjg(cqumvgiudr cqumvgiudrVar, boolean z13) {
        return z13 ? ((agtfadlqog) hg.jyumaefscl.skhdrjzrfn(cqumvgiudrVar.nufgyqmvbu())).getIndex() + 1 : ((agtfadlqog) hg.jyumaefscl.opjhrmiecq(cqumvgiudrVar.nufgyqmvbu())).getIndex() - 1;
    }

    private final void gxszxtbevo(cqumvgiudr cqumvgiudrVar, int i13, boolean z13) {
        if (i13 == -1 || cqumvgiudrVar.nufgyqmvbu().isEmpty() || i13 == eablkybsjg(cqumvgiudrVar, z13)) {
            return;
        }
        lqeggnwhkg();
    }

    private final void lqeggnwhkg() {
        this.f124763zoijcleaow = -1;
        androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow zoijcleaowVar = this.f124761ppxfxbqfkf;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.cancel();
        }
        this.f124761ppxfxbqfkf = null;
    }

    @Override // yfnezrywwk.pkzmftpjix
    public void iobyxmoadg(dvvnrvtcbc dvvnrvtcbcVar, int i13) {
        int iZoijcleaow = dvvnrvtcbcVar.zoijcleaow() == -1 ? this.f124760iobyxmoadg : dvvnrvtcbcVar.zoijcleaow();
        for (int i14 = 0; i14 < iZoijcleaow; i14++) {
            dvvnrvtcbcVar.iobyxmoadg(i13 + i14);
        }
    }

    @Override // yfnezrywwk.pkzmftpjix
    public void ppxfxbqfkf(ylkuphrtab ylkuphrtabVar, float f13, cqumvgiudr cqumvgiudrVar) {
        androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow zoijcleaowVar;
        androidx.compose.foundation.lazy.layout.crxdokpmqz.zoijcleaow zoijcleaowVar2;
        if (!cqumvgiudrVar.nufgyqmvbu().isEmpty()) {
            boolean z13 = f13 < 0.0f;
            int iEablkybsjg = eablkybsjg(cqumvgiudrVar, z13);
            if (iEablkybsjg >= 0 && iEablkybsjg < cqumvgiudrVar.gxszxtbevo()) {
                if (iEablkybsjg != this.f124763zoijcleaow) {
                    if (this.f124762wkgbmnqykc != z13) {
                        lqeggnwhkg();
                    }
                    this.f124762wkgbmnqykc = z13;
                    this.f124763zoijcleaow = iEablkybsjg;
                    this.f124761ppxfxbqfkf = ylkuphrtab.zoijcleaow(ylkuphrtabVar, iEablkybsjg, null, 2, null);
                }
                if (z13) {
                    agtfadlqog agtfadlqogVar = (agtfadlqog) hg.jyumaefscl.skhdrjzrfn(cqumvgiudrVar.nufgyqmvbu());
                    if (((agtfadlqogVar.iobyxmoadg() + agtfadlqogVar.getSize()) + cqumvgiudrVar.lqeggnwhkg()) - cqumvgiudrVar.ppxfxbqfkf() < (-f13) && (zoijcleaowVar2 = this.f124761ppxfxbqfkf) != null) {
                        zoijcleaowVar2.iobyxmoadg();
                    }
                } else if (cqumvgiudrVar.eablkybsjg() - ((agtfadlqog) hg.jyumaefscl.opjhrmiecq(cqumvgiudrVar.nufgyqmvbu())).iobyxmoadg() < f13 && (zoijcleaowVar = this.f124761ppxfxbqfkf) != null) {
                    zoijcleaowVar.iobyxmoadg();
                }
            }
        }
        this.f124759gxszxtbevo = f13;
    }

    @Override // yfnezrywwk.pkzmftpjix
    public void wkgbmnqykc(ylkuphrtab ylkuphrtabVar, cqumvgiudr cqumvgiudrVar) {
        gxszxtbevo(cqumvgiudrVar, this.f124763zoijcleaow, this.f124762wkgbmnqykc);
        int iGxszxtbevo = cqumvgiudrVar.gxszxtbevo();
        int i13 = this.f124758eablkybsjg;
        if (i13 != -1 && this.f124759gxszxtbevo != 0.0f && i13 != iGxszxtbevo && !cqumvgiudrVar.nufgyqmvbu().isEmpty()) {
            int iEablkybsjg = eablkybsjg(cqumvgiudrVar, this.f124759gxszxtbevo < 0.0f);
            if (iEablkybsjg >= 0 && iEablkybsjg < iGxszxtbevo) {
                this.f124763zoijcleaow = iEablkybsjg;
                this.f124761ppxfxbqfkf = ylkuphrtab.zoijcleaow(ylkuphrtabVar, iEablkybsjg, null, 2, null);
            }
        }
        this.f124758eablkybsjg = iGxszxtbevo;
    }
}
