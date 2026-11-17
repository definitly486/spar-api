package t62;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f109937jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f109938yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f109939zdlpuopuiu;

    public wkgbmnqykc(String itemId, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f109939zdlpuopuiu = itemId;
        this.f109938yggfygwlhe = items;
        this.f109937jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: t62.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.wkgbmnqykc(this.f109936zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he0.iobyxmoadg wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar) {
        return zoijcleaow.zoijcleaow(wkgbmnqykcVar);
    }

    public final he0.iobyxmoadg eablkybsjg() {
        return (he0.iobyxmoadg) this.f109937jyumaefscl.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f109939zdlpuopuiu, wkgbmnqykcVar.f109939zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f109938yggfygwlhe, wkgbmnqykcVar.f109938yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f109939zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f109939zdlpuopuiu.hashCode() * 31) + this.f109938yggfygwlhe.hashCode();
    }

    public final List lqeggnwhkg() {
        return this.f109938yggfygwlhe;
    }

    public String toString() {
        return "VideosSpecialBannerUIModel(itemId=" + this.f109939zdlpuopuiu + ", items=" + this.f109938yggfygwlhe + ")";
    }
}
