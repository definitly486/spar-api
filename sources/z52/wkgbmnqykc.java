package z52;

import c52.jpowsppfya;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f129167iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f129168jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jpowsppfya f129169yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f129170zdlpuopuiu;

    public wkgbmnqykc(String itemId, jpowsppfya type, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f129170zdlpuopuiu = itemId;
        this.f129169yggfygwlhe = type;
        this.f129168jyumaefscl = items;
        this.f129167iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: z52.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.wkgbmnqykc(this.f129161zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he0.iobyxmoadg wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar) {
        return eablkybsjg.zoijcleaow(wkgbmnqykcVar);
    }

    public final he0.iobyxmoadg eablkybsjg() {
        return (he0.iobyxmoadg) this.f129167iwizpuwonk.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f129170zdlpuopuiu, wkgbmnqykcVar.f129170zdlpuopuiu) && this.f129169yggfygwlhe == wkgbmnqykcVar.f129169yggfygwlhe && zdlpuopuiu.eablkybsjg(this.f129168jyumaefscl, wkgbmnqykcVar.f129168jyumaefscl);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f129170zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f129170zdlpuopuiu.hashCode() * 31) + this.f129169yggfygwlhe.hashCode()) * 31) + this.f129168jyumaefscl.hashCode();
    }

    public final List lqeggnwhkg() {
        return this.f129168jyumaefscl;
    }

    public String toString() {
        return "BannersBigSpecialBannerUiModel(itemId=" + this.f129170zdlpuopuiu + ", type=" + this.f129169yggfygwlhe + ", items=" + this.f129168jyumaefscl + ")";
    }
}
