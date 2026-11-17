package yu0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f126654iobyxmoadg;

    public eablkybsjg(String orderId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.f126654iobyxmoadg = orderId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f126654iobyxmoadg, ((eablkybsjg) obj).f126654iobyxmoadg);
    }

    public int hashCode() {
        return this.f126654iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f126654iobyxmoadg;
    }

    public String toString() {
        return "PaymentFlowResult(orderId=" + this.f126654iobyxmoadg + ")";
    }
}
