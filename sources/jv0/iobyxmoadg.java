package jv0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PromoCollectionInfo f52461iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f52462zoijcleaow;

    public iobyxmoadg(PromoCollectionInfo info, List items) {
        zdlpuopuiu.btonecajqb(info, "info");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f52461iobyxmoadg = info;
        this.f52462zoijcleaow = items;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, PromoCollectionInfo promoCollectionInfo, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            promoCollectionInfo = iobyxmoadgVar.f52461iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            list = iobyxmoadgVar.f52462zoijcleaow;
        }
        return iobyxmoadgVar.iobyxmoadg(promoCollectionInfo, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f52461iobyxmoadg, iobyxmoadgVar.f52461iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f52462zoijcleaow, iobyxmoadgVar.f52462zoijcleaow);
    }

    public int hashCode() {
        return (this.f52461iobyxmoadg.hashCode() * 31) + this.f52462zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg(PromoCollectionInfo info, List items) {
        zdlpuopuiu.btonecajqb(info, "info");
        zdlpuopuiu.btonecajqb(items, "items");
        return new iobyxmoadg(info, items);
    }

    public final PromoCollectionInfo ppxfxbqfkf() {
        return this.f52461iobyxmoadg;
    }

    public String toString() {
        return "PromoCollectionCache(info=" + this.f52461iobyxmoadg + ", items=" + this.f52462zoijcleaow + ")";
    }

    public final List wkgbmnqykc() {
        return this.f52462zoijcleaow;
    }
}
