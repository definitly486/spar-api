package androidx.navigation;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Object f12065dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f12066eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f12067gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f12069lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ah.wkgbmnqykc f12070nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f12071ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f12073zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx.iobyxmoadg f12068iobyxmoadg = new gtknphoqwx.iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f12072wkgbmnqykc = -1;

    private final void gxszxtbevo(String str) {
        if (str != null) {
            if (kcexrzcfyt.zfvoamnweg(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.f12066eablkybsjg = str;
            this.f12067gxszxtbevo = false;
        }
    }

    public final void eablkybsjg(int i13) {
        this.f12072wkgbmnqykc = i13;
        this.f12067gxszxtbevo = false;
    }

    public final void iobyxmoadg(tg.draadjrbmk animBuilder) {
        zdlpuopuiu.btonecajqb(animBuilder, "animBuilder");
        h5.iobyxmoadg iobyxmoadgVar = new h5.iobyxmoadg();
        animBuilder.invoke(iobyxmoadgVar);
        this.f12068iobyxmoadg.zoijcleaow(iobyxmoadgVar.iobyxmoadg()).ppxfxbqfkf(iobyxmoadgVar.zoijcleaow()).eablkybsjg(iobyxmoadgVar.ppxfxbqfkf()).gxszxtbevo(iobyxmoadgVar.wkgbmnqykc());
    }

    public final void lqeggnwhkg(boolean z13) {
        this.f12071ppxfxbqfkf = z13;
    }

    public final void ppxfxbqfkf(int i13, tg.draadjrbmk popUpToBuilder) {
        zdlpuopuiu.btonecajqb(popUpToBuilder, "popUpToBuilder");
        eablkybsjg(i13);
        gxszxtbevo(null);
        h5.agtfadlqog agtfadlqogVar = new h5.agtfadlqog();
        popUpToBuilder.invoke(agtfadlqogVar);
        this.f12067gxszxtbevo = agtfadlqogVar.iobyxmoadg();
        this.f12069lqeggnwhkg = agtfadlqogVar.zoijcleaow();
    }

    public final void wkgbmnqykc(boolean z13) {
        this.f12073zoijcleaow = z13;
    }

    public final gtknphoqwx zoijcleaow() {
        gtknphoqwx.iobyxmoadg iobyxmoadgVar = this.f12068iobyxmoadg;
        iobyxmoadgVar.wkgbmnqykc(this.f12073zoijcleaow);
        iobyxmoadgVar.draadjrbmk(this.f12071ppxfxbqfkf);
        String str = this.f12066eablkybsjg;
        if (str != null) {
            iobyxmoadgVar.btonecajqb(str, this.f12067gxszxtbevo, this.f12069lqeggnwhkg);
        } else {
            ah.wkgbmnqykc wkgbmnqykcVar = this.f12070nufgyqmvbu;
            if (wkgbmnqykcVar != null) {
                zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
                iobyxmoadgVar.nufgyqmvbu(wkgbmnqykcVar, this.f12067gxszxtbevo, this.f12069lqeggnwhkg);
            } else {
                Object obj = this.f12065dxjokdxxww;
                if (obj != null) {
                    zdlpuopuiu.lqeggnwhkg(obj);
                    iobyxmoadgVar.dxjokdxxww(obj, this.f12067gxszxtbevo, this.f12069lqeggnwhkg);
                } else {
                    iobyxmoadgVar.lqeggnwhkg(this.f12072wkgbmnqykc, this.f12067gxszxtbevo, this.f12069lqeggnwhkg);
                }
            }
        }
        return iobyxmoadgVar.iobyxmoadg();
    }
}
