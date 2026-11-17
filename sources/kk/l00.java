package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class l00 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wj f57369iobyxmoadg;

    public l00(wj helpers) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helpers, "helpers");
        this.f57369iobyxmoadg = helpers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l00) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57369iobyxmoadg, ((l00) obj).f57369iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57369iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HelpersState(helpers=" + this.f57369iobyxmoadg + ")";
    }
}
