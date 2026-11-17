package sr1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import vq1.jpowsppfya;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f108476iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f108477jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jpowsppfya f108478yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f108479zdlpuopuiu;

    public wkgbmnqykc(String itemId, jpowsppfya type, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f108479zdlpuopuiu = itemId;
        this.f108478yggfygwlhe = type;
        this.f108477jyumaefscl = items;
        this.f108476iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: sr1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.wkgbmnqykc(this.f108470zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cc1.iobyxmoadg wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar) {
        return eablkybsjg.zoijcleaow(wkgbmnqykcVar);
    }

    public final cc1.iobyxmoadg eablkybsjg() {
        return (cc1.iobyxmoadg) this.f108476iwizpuwonk.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f108479zdlpuopuiu, wkgbmnqykcVar.f108479zdlpuopuiu) && this.f108478yggfygwlhe == wkgbmnqykcVar.f108478yggfygwlhe && zdlpuopuiu.eablkybsjg(this.f108477jyumaefscl, wkgbmnqykcVar.f108477jyumaefscl);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f108479zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f108479zdlpuopuiu.hashCode() * 31) + this.f108478yggfygwlhe.hashCode()) * 31) + this.f108477jyumaefscl.hashCode();
    }

    public final List lqeggnwhkg() {
        return this.f108477jyumaefscl;
    }

    public String toString() {
        return "BannersBigSpecialBannerUiModel(itemId=" + this.f108479zdlpuopuiu + ", type=" + this.f108478yggfygwlhe + ", items=" + this.f108477jyumaefscl + ")";
    }
}
