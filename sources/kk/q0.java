package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f58131iobyxmoadg;

    public q0(String url) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("spaysdk://payment", "returnUrl");
        this.f58131iobyxmoadg = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58131iobyxmoadg, ((q0) obj).f58131iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("spaysdk://payment", "spaysdk://payment");
    }

    public final int hashCode() {
        return (this.f58131iobyxmoadg.hashCode() * 31) - 1869215823;
    }

    public final String toString() {
        return "AppToken(url=" + this.f58131iobyxmoadg + ", returnUrl=spaysdk://payment)";
    }
}
