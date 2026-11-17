package sr1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import vq1.jpowsppfya;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f108466iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f108467jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jpowsppfya f108468yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f108469zdlpuopuiu;

    public lqeggnwhkg(String itemId, jpowsppfya type, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f108469zdlpuopuiu = itemId;
        this.f108468yggfygwlhe = type;
        this.f108467jyumaefscl = items;
        this.f108466iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: sr1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.wkgbmnqykc(this.f108461zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        return nufgyqmvbu.zoijcleaow(lqeggnwhkgVar);
    }

    public final List eablkybsjg() {
        return (List) this.f108466iwizpuwonk.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f108469zdlpuopuiu, lqeggnwhkgVar.f108469zdlpuopuiu) && this.f108468yggfygwlhe == lqeggnwhkgVar.f108468yggfygwlhe && zdlpuopuiu.eablkybsjg(this.f108467jyumaefscl, lqeggnwhkgVar.f108467jyumaefscl);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f108469zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f108469zdlpuopuiu.hashCode() * 31) + this.f108468yggfygwlhe.hashCode()) * 31) + this.f108467jyumaefscl.hashCode();
    }

    public final List lqeggnwhkg() {
        return this.f108467jyumaefscl;
    }

    public String toString() {
        return "BannersLongSpecialBannerUiModel(itemId=" + this.f108469zdlpuopuiu + ", type=" + this.f108468yggfygwlhe + ", items=" + this.f108467jyumaefscl + ")";
    }
}
