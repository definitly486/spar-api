package n12;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f68435iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f68436ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f68437zoijcleaow;

    public lqeggnwhkg(int i13, int i14, List banks) {
        zdlpuopuiu.btonecajqb(banks, "banks");
        this.f68435iobyxmoadg = i13;
        this.f68437zoijcleaow = i14;
        this.f68436ppxfxbqfkf = banks;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f68435iobyxmoadg == lqeggnwhkgVar.f68435iobyxmoadg && this.f68437zoijcleaow == lqeggnwhkgVar.f68437zoijcleaow && zdlpuopuiu.eablkybsjg(this.f68436ppxfxbqfkf, lqeggnwhkgVar.f68436ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f68435iobyxmoadg) * 31) + Integer.hashCode(this.f68437zoijcleaow)) * 31) + this.f68436ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f68436ppxfxbqfkf;
    }

    public final int ppxfxbqfkf() {
        return this.f68435iobyxmoadg;
    }

    public String toString() {
        return "Model(title=" + this.f68435iobyxmoadg + ", subtitle=" + this.f68437zoijcleaow + ", banks=" + this.f68436ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f68437zoijcleaow;
    }
}
