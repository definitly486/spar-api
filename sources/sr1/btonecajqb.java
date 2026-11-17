package sr1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import vq1.jpowsppfya;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gg.gtknphoqwx f108451iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f108452jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final jpowsppfya f108453yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f108454zdlpuopuiu;

    public btonecajqb(String itemId, jpowsppfya type, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f108454zdlpuopuiu = itemId;
        this.f108453yggfygwlhe = type;
        this.f108452jyumaefscl = items;
        this.f108451iwizpuwonk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: sr1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return btonecajqb.wkgbmnqykc(this.f108460zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wkgbmnqykc(btonecajqb btonecajqbVar) {
        return gtknphoqwx.zoijcleaow(btonecajqbVar);
    }

    public final List eablkybsjg() {
        return (List) this.f108451iwizpuwonk.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f108454zdlpuopuiu, btonecajqbVar.f108454zdlpuopuiu) && this.f108453yggfygwlhe == btonecajqbVar.f108453yggfygwlhe && zdlpuopuiu.eablkybsjg(this.f108452jyumaefscl, btonecajqbVar.f108452jyumaefscl);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f108454zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f108454zdlpuopuiu.hashCode() * 31) + this.f108453yggfygwlhe.hashCode()) * 31) + this.f108452jyumaefscl.hashCode();
    }

    public final List lqeggnwhkg() {
        return this.f108452jyumaefscl;
    }

    public String toString() {
        return "BannersSmallSpecialBannerUiModel(itemId=" + this.f108454zdlpuopuiu + ", type=" + this.f108453yggfygwlhe + ", items=" + this.f108452jyumaefscl + ")";
    }
}
