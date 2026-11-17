package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class kd extends fl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final np f57291iobyxmoadg;

    public kd(np item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        this.f57291iobyxmoadg = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57291iobyxmoadg, ((kd) obj).f57291iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57291iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "OnCloseHintClickEvent(item=" + this.f57291iobyxmoadg + ")";
    }
}
