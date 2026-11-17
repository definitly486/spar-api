package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18954iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18955ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18956zoijcleaow;

    public lqeggnwhkg(int i13, jpowsppfya type, List comboSetList) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        this.f18954iobyxmoadg = i13;
        this.f18956zoijcleaow = type;
        this.f18955ppxfxbqfkf = comboSetList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f18954iobyxmoadg == lqeggnwhkgVar.f18954iobyxmoadg && this.f18956zoijcleaow == lqeggnwhkgVar.f18956zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18955ppxfxbqfkf, lqeggnwhkgVar.f18955ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18954iobyxmoadg) * 31) + this.f18956zoijcleaow.hashCode()) * 31) + this.f18955ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f18955ppxfxbqfkf;
    }

    public String toString() {
        return "ComboSetSpecialBanner(index=" + this.f18954iobyxmoadg + ", type=" + this.f18956zoijcleaow + ", comboSetList=" + this.f18955ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18954iobyxmoadg;
    }
}
