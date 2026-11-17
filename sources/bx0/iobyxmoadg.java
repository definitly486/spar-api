package bx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f17280iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f17281ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f17282wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f17283zoijcleaow;

    public iobyxmoadg(int i13, int i14, int i15, String tooltip) {
        zdlpuopuiu.btonecajqb(tooltip, "tooltip");
        this.f17280iobyxmoadg = i13;
        this.f17283zoijcleaow = i14;
        this.f17281ppxfxbqfkf = i15;
        this.f17282wkgbmnqykc = tooltip;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f17280iobyxmoadg == iobyxmoadgVar.f17280iobyxmoadg && this.f17283zoijcleaow == iobyxmoadgVar.f17283zoijcleaow && this.f17281ppxfxbqfkf == iobyxmoadgVar.f17281ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f17282wkgbmnqykc, iobyxmoadgVar.f17282wkgbmnqykc);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f17280iobyxmoadg) * 31) + Integer.hashCode(this.f17283zoijcleaow)) * 31) + Integer.hashCode(this.f17281ppxfxbqfkf)) * 31) + this.f17282wkgbmnqykc.hashCode();
    }

    public final int iobyxmoadg() {
        return this.f17281ppxfxbqfkf;
    }

    public final int ppxfxbqfkf() {
        return this.f17283zoijcleaow;
    }

    public String toString() {
        return "CartBonusesEntity(available=" + this.f17280iobyxmoadg + ", balance=" + this.f17283zoijcleaow + ", applied=" + this.f17281ppxfxbqfkf + ", tooltip=" + this.f17282wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f17282wkgbmnqykc;
    }

    public final int zoijcleaow() {
        return this.f17280iobyxmoadg;
    }
}
