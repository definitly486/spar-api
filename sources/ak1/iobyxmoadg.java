package ak1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f2111iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f2112zoijcleaow;

    public iobyxmoadg(String str, String str2) {
        this.f2111iobyxmoadg = str;
        this.f2112zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f2111iobyxmoadg, iobyxmoadgVar.f2111iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f2112zoijcleaow, iobyxmoadgVar.f2112zoijcleaow);
    }

    public int hashCode() {
        String str = this.f2111iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2112zoijcleaow;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f2111iobyxmoadg;
    }

    public String toString() {
        return "PurchaseDeliveryInfoUiModel(address=" + this.f2111iobyxmoadg + ", dateTime=" + this.f2112zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f2112zoijcleaow;
    }
}
