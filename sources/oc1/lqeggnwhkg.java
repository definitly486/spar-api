package oc1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f72597eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f72598gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f72599iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final rc1.iobyxmoadg f72600lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f72601ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f72602wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f72603zoijcleaow;

    public lqeggnwhkg(boolean z13, boolean z14, String date, List categories, boolean z15, boolean z16, rc1.iobyxmoadg info) {
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(categories, "categories");
        zdlpuopuiu.btonecajqb(info, "info");
        this.f72599iobyxmoadg = z13;
        this.f72603zoijcleaow = z14;
        this.f72601ppxfxbqfkf = date;
        this.f72602wkgbmnqykc = categories;
        this.f72597eablkybsjg = z15;
        this.f72598gxszxtbevo = z16;
        this.f72600lqeggnwhkg = info;
    }

    public final boolean eablkybsjg() {
        return this.f72599iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f72599iobyxmoadg == lqeggnwhkgVar.f72599iobyxmoadg && this.f72603zoijcleaow == lqeggnwhkgVar.f72603zoijcleaow && zdlpuopuiu.eablkybsjg(this.f72601ppxfxbqfkf, lqeggnwhkgVar.f72601ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f72602wkgbmnqykc, lqeggnwhkgVar.f72602wkgbmnqykc) && this.f72597eablkybsjg == lqeggnwhkgVar.f72597eablkybsjg && this.f72598gxszxtbevo == lqeggnwhkgVar.f72598gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f72600lqeggnwhkg, lqeggnwhkgVar.f72600lqeggnwhkg);
    }

    public final boolean gxszxtbevo() {
        return this.f72603zoijcleaow;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f72599iobyxmoadg) * 31) + Boolean.hashCode(this.f72603zoijcleaow)) * 31) + this.f72601ppxfxbqfkf.hashCode()) * 31) + this.f72602wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f72597eablkybsjg)) * 31) + Boolean.hashCode(this.f72598gxszxtbevo)) * 31) + this.f72600lqeggnwhkg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f72602wkgbmnqykc;
    }

    public final boolean lqeggnwhkg() {
        return this.f72598gxszxtbevo;
    }

    public final rc1.iobyxmoadg ppxfxbqfkf() {
        return this.f72600lqeggnwhkg;
    }

    public String toString() {
        return "Model(isInitialized=" + this.f72599iobyxmoadg + ", isLoading=" + this.f72603zoijcleaow + ", date=" + this.f72601ppxfxbqfkf + ", categories=" + this.f72602wkgbmnqykc + ", isBtnAcceptEnabled=" + this.f72597eablkybsjg + ", isSelectedAvailable=" + this.f72598gxszxtbevo + ", info=" + this.f72600lqeggnwhkg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f72597eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f72601ppxfxbqfkf;
    }
}
