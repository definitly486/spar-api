package wo0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f120336iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f120337ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120338zoijcleaow;

    public zoijcleaow(String intervalText, String additionalInfo, boolean z13) {
        zdlpuopuiu.btonecajqb(intervalText, "intervalText");
        zdlpuopuiu.btonecajqb(additionalInfo, "additionalInfo");
        this.f120336iobyxmoadg = intervalText;
        this.f120338zoijcleaow = additionalInfo;
        this.f120337ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f120336iobyxmoadg, zoijcleaowVar.f120336iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120338zoijcleaow, zoijcleaowVar.f120338zoijcleaow) && this.f120337ppxfxbqfkf == zoijcleaowVar.f120337ppxfxbqfkf;
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return "DeliveryIntervalUiModel";
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.DELIVERY_INTERVAL;
    }

    public int hashCode() {
        return (((this.f120336iobyxmoadg.hashCode() * 31) + this.f120338zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f120337ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f120338zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f120337ppxfxbqfkf;
    }

    public String toString() {
        return "CartDeliveryIntervalUiModel(intervalText=" + this.f120336iobyxmoadg + ", additionalInfo=" + this.f120338zoijcleaow + ", isAvailableOnlyOneInterval=" + this.f120337ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f120336iobyxmoadg;
    }
}
