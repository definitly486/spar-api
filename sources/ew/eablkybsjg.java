package ew;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f32211iobyxmoadg;

    public eablkybsjg(String orderId) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.f32211iobyxmoadg = orderId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f32211iobyxmoadg, ((eablkybsjg) obj).f32211iobyxmoadg);
    }

    public int hashCode() {
        return this.f32211iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f32211iobyxmoadg;
    }

    public String toString() {
        return "PaymentFlowResult(orderId=" + this.f32211iobyxmoadg + ")";
    }
}
