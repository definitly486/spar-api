package gy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f38669iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f38670zoijcleaow;

    public draadjrbmk(boolean z13, String reasonMessage) {
        zdlpuopuiu.btonecajqb(reasonMessage, "reasonMessage");
        this.f38669iobyxmoadg = z13;
        this.f38670zoijcleaow = reasonMessage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f38669iobyxmoadg == draadjrbmkVar.f38669iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f38670zoijcleaow, draadjrbmkVar.f38670zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f38669iobyxmoadg) * 31) + this.f38670zoijcleaow.hashCode();
    }

    public final boolean iobyxmoadg() {
        return this.f38669iobyxmoadg;
    }

    public String toString() {
        return "CartUnavailableOrderReasonEntity(canCreateOrder=" + this.f38669iobyxmoadg + ", reasonMessage=" + this.f38670zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f38670zoijcleaow;
    }
}
