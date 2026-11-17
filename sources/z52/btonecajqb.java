package z52;

import c52.jpowsppfya;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f129142iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f129143jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jpowsppfya f129144yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f129145zdlpuopuiu;

    public btonecajqb(String itemId, jpowsppfya type, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f129145zdlpuopuiu = itemId;
        this.f129144yggfygwlhe = type;
        this.f129143jyumaefscl = items;
        this.f129142iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: z52.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return btonecajqb.wkgbmnqykc(this.f129151zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wkgbmnqykc(btonecajqb btonecajqbVar) {
        return gtknphoqwx.zoijcleaow(btonecajqbVar);
    }

    public final List eablkybsjg() {
        return (List) this.f129142iwizpuwonk.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f129145zdlpuopuiu, btonecajqbVar.f129145zdlpuopuiu) && this.f129144yggfygwlhe == btonecajqbVar.f129144yggfygwlhe && zdlpuopuiu.eablkybsjg(this.f129143jyumaefscl, btonecajqbVar.f129143jyumaefscl);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f129145zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f129145zdlpuopuiu.hashCode() * 31) + this.f129144yggfygwlhe.hashCode()) * 31) + this.f129143jyumaefscl.hashCode();
    }

    public final List lqeggnwhkg() {
        return this.f129143jyumaefscl;
    }

    public String toString() {
        return "BannersSmallSpecialBannerUiModel(itemId=" + this.f129145zdlpuopuiu + ", type=" + this.f129144yggfygwlhe + ", items=" + this.f129143jyumaefscl + ")";
    }
}
