package en1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f31626iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f31627ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f31628zoijcleaow;

    public lqeggnwhkg(int i13, int i14, List banks) {
        zdlpuopuiu.btonecajqb(banks, "banks");
        this.f31626iobyxmoadg = i13;
        this.f31628zoijcleaow = i14;
        this.f31627ppxfxbqfkf = banks;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f31626iobyxmoadg == lqeggnwhkgVar.f31626iobyxmoadg && this.f31628zoijcleaow == lqeggnwhkgVar.f31628zoijcleaow && zdlpuopuiu.eablkybsjg(this.f31627ppxfxbqfkf, lqeggnwhkgVar.f31627ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f31626iobyxmoadg) * 31) + Integer.hashCode(this.f31628zoijcleaow)) * 31) + this.f31627ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f31627ppxfxbqfkf;
    }

    public final int ppxfxbqfkf() {
        return this.f31626iobyxmoadg;
    }

    public String toString() {
        return "Model(title=" + this.f31626iobyxmoadg + ", subtitle=" + this.f31628zoijcleaow + ", banks=" + this.f31627ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f31628zoijcleaow;
    }
}
