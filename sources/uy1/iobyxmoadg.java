package uy1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114745iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f114746zoijcleaow;

    public iobyxmoadg(String str, String str2) {
        this.f114745iobyxmoadg = str;
        this.f114746zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f114745iobyxmoadg, iobyxmoadgVar.f114745iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114746zoijcleaow, iobyxmoadgVar.f114746zoijcleaow);
    }

    public int hashCode() {
        String str = this.f114745iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f114746zoijcleaow;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f114745iobyxmoadg;
    }

    public String toString() {
        return "PurchaseDeliveryInfoUiModel(address=" + this.f114745iobyxmoadg + ", dateTime=" + this.f114746zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f114746zoijcleaow;
    }
}
