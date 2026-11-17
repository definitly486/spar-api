package qn;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f79213iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f79214zoijcleaow;

    public zoijcleaow(String shopId, String address) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(address, "address");
        this.f79213iobyxmoadg = shopId;
        this.f79214zoijcleaow = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f79213iobyxmoadg, zoijcleaowVar.f79213iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f79214zoijcleaow, zoijcleaowVar.f79214zoijcleaow);
    }

    public int hashCode() {
        return (this.f79213iobyxmoadg.hashCode() * 31) + this.f79214zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f79214zoijcleaow;
    }

    public String toString() {
        return "AddressMapShopMarkerData(shopId=" + this.f79213iobyxmoadg + ", address=" + this.f79214zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f79213iobyxmoadg;
    }
}
