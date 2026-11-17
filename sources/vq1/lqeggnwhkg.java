package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117874iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117875ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117876zoijcleaow;

    public lqeggnwhkg(int i13, jpowsppfya type, List comboSetList) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        this.f117874iobyxmoadg = i13;
        this.f117876zoijcleaow = type;
        this.f117875ppxfxbqfkf = comboSetList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f117874iobyxmoadg == lqeggnwhkgVar.f117874iobyxmoadg && this.f117876zoijcleaow == lqeggnwhkgVar.f117876zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117875ppxfxbqfkf, lqeggnwhkgVar.f117875ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117874iobyxmoadg) * 31) + this.f117876zoijcleaow.hashCode()) * 31) + this.f117875ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117875ppxfxbqfkf;
    }

    public String toString() {
        return "ComboSetSpecialBanner(index=" + this.f117874iobyxmoadg + ", type=" + this.f117876zoijcleaow + ", comboSetList=" + this.f117875ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117874iobyxmoadg;
    }
}
