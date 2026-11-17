package yl0;

import kotlin.jvm.internal.zdlpuopuiu;
import tt0.ojitshcjhn;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f125877wkgbmnqykc = ojitshcjhn.f111514gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f125878iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bm0.iobyxmoadg f125879ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f125880zoijcleaow;

    public dxjokdxxww(boolean z13, ojitshcjhn mapState, bm0.iobyxmoadg bottomBar) {
        zdlpuopuiu.btonecajqb(mapState, "mapState");
        zdlpuopuiu.btonecajqb(bottomBar, "bottomBar");
        this.f125878iobyxmoadg = z13;
        this.f125880zoijcleaow = mapState;
        this.f125879ppxfxbqfkf = bottomBar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f125878iobyxmoadg == dxjokdxxwwVar.f125878iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f125880zoijcleaow, dxjokdxxwwVar.f125880zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f125879ppxfxbqfkf, dxjokdxxwwVar.f125879ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f125878iobyxmoadg) * 31) + this.f125880zoijcleaow.hashCode()) * 31) + this.f125879ppxfxbqfkf.hashCode();
    }

    public final bm0.iobyxmoadg iobyxmoadg() {
        return this.f125879ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f125878iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f125878iobyxmoadg + ", mapState=" + this.f125880zoijcleaow + ", bottomBar=" + this.f125879ppxfxbqfkf + ")";
    }

    public final ojitshcjhn zoijcleaow() {
        return this.f125880zoijcleaow;
    }
}
