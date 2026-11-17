package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wp f57716iobyxmoadg;

    public n2(wp result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        this.f57716iobyxmoadg = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57716iobyxmoadg, ((n2) obj).f57716iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57716iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "HandlePaymentTokenStatus(result=" + this.f57716iobyxmoadg + ")";
    }
}
