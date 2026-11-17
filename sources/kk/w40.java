package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class w40 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f59090iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final t3 f59091ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f59092zoijcleaow;

    public w40(String token, long j13, t3 t3Var) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("", "code");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("", "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(token, "token");
        this.f59090iobyxmoadg = token;
        this.f59092zoijcleaow = j13;
        this.f59091ppxfxbqfkf = t3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w40)) {
            return false;
        }
        w40 w40Var = (w40) obj;
        w40Var.getClass();
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("", "") && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("", "") && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59090iobyxmoadg, w40Var.f59090iobyxmoadg) && this.f59092zoijcleaow == w40Var.f59092zoijcleaow && this.f59091ppxfxbqfkf == w40Var.f59091ppxfxbqfkf;
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f59092zoijcleaow) + (this.f59090iobyxmoadg.hashCode() * 31)) * 31;
        t3 t3Var = this.f59091ppxfxbqfkf;
        return iHashCode + (t3Var == null ? 0 : t3Var.hashCode());
    }

    public final String toString() {
        return "AppTokenModel(code=, state=, token=" + this.f59090iobyxmoadg + ", createTime=" + this.f59092zoijcleaow + ", typeAuth=" + this.f59091ppxfxbqfkf + ")";
    }
}
