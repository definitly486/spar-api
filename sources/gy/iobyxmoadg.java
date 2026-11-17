package gy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f38714iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f38715ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f38716wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f38717zoijcleaow;

    public iobyxmoadg(int i13, int i14, int i15, String tooltip) {
        zdlpuopuiu.btonecajqb(tooltip, "tooltip");
        this.f38714iobyxmoadg = i13;
        this.f38717zoijcleaow = i14;
        this.f38715ppxfxbqfkf = i15;
        this.f38716wkgbmnqykc = tooltip;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f38714iobyxmoadg == iobyxmoadgVar.f38714iobyxmoadg && this.f38717zoijcleaow == iobyxmoadgVar.f38717zoijcleaow && this.f38715ppxfxbqfkf == iobyxmoadgVar.f38715ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f38716wkgbmnqykc, iobyxmoadgVar.f38716wkgbmnqykc);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f38714iobyxmoadg) * 31) + Integer.hashCode(this.f38717zoijcleaow)) * 31) + Integer.hashCode(this.f38715ppxfxbqfkf)) * 31) + this.f38716wkgbmnqykc.hashCode();
    }

    public final int iobyxmoadg() {
        return this.f38715ppxfxbqfkf;
    }

    public final int ppxfxbqfkf() {
        return this.f38717zoijcleaow;
    }

    public String toString() {
        return "CartBonusesEntity(available=" + this.f38714iobyxmoadg + ", balance=" + this.f38717zoijcleaow + ", applied=" + this.f38715ppxfxbqfkf + ", tooltip=" + this.f38716wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f38716wkgbmnqykc;
    }

    public final int zoijcleaow() {
        return this.f38714iobyxmoadg;
    }
}
