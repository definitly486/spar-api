package bx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f17236iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f17237zoijcleaow;

    public draadjrbmk(boolean z13, String reasonMessage) {
        zdlpuopuiu.btonecajqb(reasonMessage, "reasonMessage");
        this.f17236iobyxmoadg = z13;
        this.f17237zoijcleaow = reasonMessage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f17236iobyxmoadg == draadjrbmkVar.f17236iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f17237zoijcleaow, draadjrbmkVar.f17237zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f17236iobyxmoadg) * 31) + this.f17237zoijcleaow.hashCode();
    }

    public final boolean iobyxmoadg() {
        return this.f17236iobyxmoadg;
    }

    public String toString() {
        return "CartUnavailableOrderReasonEntity(canCreateOrder=" + this.f17236iobyxmoadg + ", reasonMessage=" + this.f17237zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f17237zoijcleaow;
    }
}
