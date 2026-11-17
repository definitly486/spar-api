package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class a5 extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wj f55774iobyxmoadg;

    public a5(wj helpers) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helpers, "helpers");
        this.f55774iobyxmoadg = helpers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55774iobyxmoadg, ((a5) obj).f55774iobyxmoadg);
    }

    public final int hashCode() {
        return this.f55774iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HelpersState(helpers=" + this.f55774iobyxmoadg + ")";
    }
}
