package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class wt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f59195iobyxmoadg;

    public wt(ms title) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        this.f59195iobyxmoadg = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59195iobyxmoadg, ((wt) obj).f59195iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59195iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "CardListHeaderItem(title=" + this.f59195iobyxmoadg + ")";
    }
}
