package ms1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f67889yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f67890zdlpuopuiu;

    public zoijcleaow(String itemId, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f67890zdlpuopuiu = itemId;
        this.f67889yggfygwlhe = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f67890zdlpuopuiu, zoijcleaowVar.f67890zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f67889yggfygwlhe, zoijcleaowVar.f67889yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f67890zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f67890zdlpuopuiu.hashCode() * 31) + this.f67889yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f67889yggfygwlhe;
    }

    public String toString() {
        return "VideosSpecialBannerUIModel(itemId=" + this.f67890zdlpuopuiu + ", items=" + this.f67889yggfygwlhe + ")";
    }
}
