package kk;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ei0 implements y60 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public boolean f56427iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public boolean f56428zoijcleaow;

    /* JADX WARN: Code duplicated, block: B:29:0x003b  */
    @Override // kk.y60
    public final Object iobyxmoadg(nb0 nb0Var) {
        boolean z13;
        vf0 vf0Var = (vf0) nb0Var;
        int i13 = vf0Var == null ? -1 : zg0.f59584iobyxmoadg[vf0Var.ordinal()];
        if (i13 != -1) {
            z13 = true;
            if (i13 == 1) {
                z13 = this.f56427iobyxmoadg;
            } else if (i13 == 2) {
                z13 = this.f56428zoijcleaow;
            } else if (i13 != 3) {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!this.f56427iobyxmoadg && !this.f56428zoijcleaow) {
                    z13 = false;
                }
            } else if (!this.f56427iobyxmoadg || !this.f56428zoijcleaow) {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        return Boolean.valueOf(z13);
    }

    @Override // kk.y60
    public final void zoijcleaow(ia0 ia0Var) {
        pe0 pe0Var = (pe0) ia0Var;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pe0Var, dc0.f56257iobyxmoadg)) {
            this.f56427iobyxmoadg = true;
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pe0Var, md0.f57633iobyxmoadg)) {
            this.f56428zoijcleaow = true;
        }
    }
}
