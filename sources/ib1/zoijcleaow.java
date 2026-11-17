package ib1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f42341yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f42342zdlpuopuiu;

    public zoijcleaow(String itemId, List cards) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(cards, "cards");
        this.f42342zdlpuopuiu = itemId;
        this.f42341yggfygwlhe = cards;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f42342zdlpuopuiu, zoijcleaowVar.f42342zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f42341yggfygwlhe, zoijcleaowVar.f42341yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f42342zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f42342zdlpuopuiu.hashCode() * 31) + this.f42341yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f42341yggfygwlhe;
    }

    public String toString() {
        return "CardsItemUiModel(itemId=" + this.f42342zdlpuopuiu + ", cards=" + this.f42341yggfygwlhe + ")";
    }
}
