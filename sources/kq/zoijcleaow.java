package kq;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f60390iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f60391ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f60392zoijcleaow;

    public zoijcleaow(String intervalText, String additionalInfo, boolean z13) {
        zdlpuopuiu.btonecajqb(intervalText, "intervalText");
        zdlpuopuiu.btonecajqb(additionalInfo, "additionalInfo");
        this.f60390iobyxmoadg = intervalText;
        this.f60392zoijcleaow = additionalInfo;
        this.f60391ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f60390iobyxmoadg, zoijcleaowVar.f60390iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60392zoijcleaow, zoijcleaowVar.f60392zoijcleaow) && this.f60391ppxfxbqfkf == zoijcleaowVar.f60391ppxfxbqfkf;
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return "DeliveryIntervalUiModel";
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.DELIVERY_INTERVAL;
    }

    public int hashCode() {
        return (((this.f60390iobyxmoadg.hashCode() * 31) + this.f60392zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f60391ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f60392zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f60391ppxfxbqfkf;
    }

    public String toString() {
        return "CartDeliveryIntervalUiModel(intervalText=" + this.f60390iobyxmoadg + ", additionalInfo=" + this.f60392zoijcleaow + ", isAvailableOnlyOneInterval=" + this.f60391ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f60390iobyxmoadg;
    }
}
