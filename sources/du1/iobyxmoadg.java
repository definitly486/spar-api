package du1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f29624iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f29625zoijcleaow;

    public iobyxmoadg(String id2, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f29624iobyxmoadg = id2;
        this.f29625zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f29624iobyxmoadg, iobyxmoadgVar.f29624iobyxmoadg) && this.f29625zoijcleaow == iobyxmoadgVar.f29625zoijcleaow;
    }

    public int hashCode() {
        return (this.f29624iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f29625zoijcleaow);
    }

    public final String iobyxmoadg() {
        return this.f29624iobyxmoadg;
    }

    public String toString() {
        return "SubscriptionOrderInfo(id=" + this.f29624iobyxmoadg + ", needVerify=" + this.f29625zoijcleaow + ")";
    }
}
