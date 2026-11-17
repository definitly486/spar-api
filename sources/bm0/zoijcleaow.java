package bm0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16790iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f16791zoijcleaow;

    public zoijcleaow(String shopId, String address) {
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(address, "address");
        this.f16790iobyxmoadg = shopId;
        this.f16791zoijcleaow = address;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f16790iobyxmoadg, zoijcleaowVar.f16790iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16791zoijcleaow, zoijcleaowVar.f16791zoijcleaow);
    }

    public int hashCode() {
        return (this.f16790iobyxmoadg.hashCode() * 31) + this.f16791zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f16791zoijcleaow;
    }

    public String toString() {
        return "AddressMapShopMarkerData(shopId=" + this.f16790iobyxmoadg + ", address=" + this.f16791zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f16790iobyxmoadg;
    }
}
