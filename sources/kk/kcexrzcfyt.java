package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wp f57290iobyxmoadg;

    public kcexrzcfyt(wp paymentTokenStatus) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentTokenStatus, "paymentTokenStatus");
        this.f57290iobyxmoadg = paymentTokenStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57290iobyxmoadg, ((kcexrzcfyt) obj).f57290iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57290iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "PaymentTokenResult(paymentTokenStatus=" + this.f57290iobyxmoadg + ")";
    }
}
