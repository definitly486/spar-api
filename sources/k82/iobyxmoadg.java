package k82;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f54191iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f54192zoijcleaow;

    public iobyxmoadg(String id2, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f54191iobyxmoadg = id2;
        this.f54192zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f54191iobyxmoadg, iobyxmoadgVar.f54191iobyxmoadg) && this.f54192zoijcleaow == iobyxmoadgVar.f54192zoijcleaow;
    }

    public int hashCode() {
        return (this.f54191iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f54192zoijcleaow);
    }

    public final String iobyxmoadg() {
        return this.f54191iobyxmoadg;
    }

    public String toString() {
        return "SubscriptionOrderInfo(id=" + this.f54191iobyxmoadg + ", needVerify=" + this.f54192zoijcleaow + ")";
    }
}
