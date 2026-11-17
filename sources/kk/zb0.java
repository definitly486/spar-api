package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class zb0 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final jd f59565iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f59566zoijcleaow;

    public zb0(jd state, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        this.f59565iobyxmoadg = state;
        this.f59566zoijcleaow = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59565iobyxmoadg, zb0Var.f59565iobyxmoadg) && this.f59566zoijcleaow == zb0Var.f59566zoijcleaow;
    }

    public final int hashCode() {
        return Long.hashCode(this.f59566zoijcleaow) + (this.f59565iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "OneTimePassword(state=" + this.f59565iobyxmoadg + ", timerTime=" + this.f59566zoijcleaow + ")";
    }
}
