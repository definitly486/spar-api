package nn;

import kotlin.jvm.internal.zdlpuopuiu;
import zu.ojitshcjhn;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f70416wkgbmnqykc = ojitshcjhn.f131359gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f70417iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final qn.iobyxmoadg f70418ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f70419zoijcleaow;

    public dxjokdxxww(boolean z13, ojitshcjhn mapState, qn.iobyxmoadg bottomBar) {
        zdlpuopuiu.btonecajqb(mapState, "mapState");
        zdlpuopuiu.btonecajqb(bottomBar, "bottomBar");
        this.f70417iobyxmoadg = z13;
        this.f70419zoijcleaow = mapState;
        this.f70418ppxfxbqfkf = bottomBar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f70417iobyxmoadg == dxjokdxxwwVar.f70417iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f70419zoijcleaow, dxjokdxxwwVar.f70419zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70418ppxfxbqfkf, dxjokdxxwwVar.f70418ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f70417iobyxmoadg) * 31) + this.f70419zoijcleaow.hashCode()) * 31) + this.f70418ppxfxbqfkf.hashCode();
    }

    public final qn.iobyxmoadg iobyxmoadg() {
        return this.f70418ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f70417iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f70417iobyxmoadg + ", mapState=" + this.f70419zoijcleaow + ", bottomBar=" + this.f70418ppxfxbqfkf + ")";
    }

    public final ojitshcjhn zoijcleaow() {
        return this.f70419zoijcleaow;
    }
}
