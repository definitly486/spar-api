package z52;

import c52.jpowsppfya;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f129157iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f129158jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jpowsppfya f129159yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f129160zdlpuopuiu;

    public lqeggnwhkg(String itemId, jpowsppfya type, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f129160zdlpuopuiu = itemId;
        this.f129159yggfygwlhe = type;
        this.f129158jyumaefscl = items;
        this.f129157iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: z52.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.wkgbmnqykc(this.f129152zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        return nufgyqmvbu.zoijcleaow(lqeggnwhkgVar);
    }

    public final List eablkybsjg() {
        return (List) this.f129157iwizpuwonk.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f129160zdlpuopuiu, lqeggnwhkgVar.f129160zdlpuopuiu) && this.f129159yggfygwlhe == lqeggnwhkgVar.f129159yggfygwlhe && zdlpuopuiu.eablkybsjg(this.f129158jyumaefscl, lqeggnwhkgVar.f129158jyumaefscl);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f129160zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f129160zdlpuopuiu.hashCode() * 31) + this.f129159yggfygwlhe.hashCode()) * 31) + this.f129158jyumaefscl.hashCode();
    }

    public final List lqeggnwhkg() {
        return this.f129158jyumaefscl;
    }

    public String toString() {
        return "BannersLongSpecialBannerUiModel(itemId=" + this.f129160zdlpuopuiu + ", type=" + this.f129159yggfygwlhe + ", items=" + this.f129158jyumaefscl + ")";
    }
}
