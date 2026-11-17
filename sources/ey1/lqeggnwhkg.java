package ey1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f32327iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f32328zoijcleaow;

    public lqeggnwhkg(List purchaseLists, boolean z13) {
        zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
        this.f32327iobyxmoadg = purchaseLists;
        this.f32328zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f32327iobyxmoadg, lqeggnwhkgVar.f32327iobyxmoadg) && this.f32328zoijcleaow == lqeggnwhkgVar.f32328zoijcleaow;
    }

    public int hashCode() {
        return (this.f32327iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f32328zoijcleaow);
    }

    public final List iobyxmoadg() {
        return this.f32327iobyxmoadg;
    }

    public String toString() {
        return "Model(purchaseLists=" + this.f32327iobyxmoadg + ", isLoading=" + this.f32328zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f32328zoijcleaow;
    }
}
