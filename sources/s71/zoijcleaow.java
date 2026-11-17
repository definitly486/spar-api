package s71;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105668iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gz0.iobyxmoadg f105669ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final EvropolisGift f105670wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f105671zoijcleaow;

    public zoijcleaow(String stickersBlockSubtitle, List stickers, gz0.iobyxmoadg gifts, EvropolisGift gift) {
        zdlpuopuiu.btonecajqb(stickersBlockSubtitle, "stickersBlockSubtitle");
        zdlpuopuiu.btonecajqb(stickers, "stickers");
        zdlpuopuiu.btonecajqb(gifts, "gifts");
        zdlpuopuiu.btonecajqb(gift, "gift");
        this.f105668iobyxmoadg = stickersBlockSubtitle;
        this.f105671zoijcleaow = stickers;
        this.f105669ppxfxbqfkf = gifts;
        this.f105670wkgbmnqykc = gift;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f105668iobyxmoadg, zoijcleaowVar.f105668iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105671zoijcleaow, zoijcleaowVar.f105671zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105669ppxfxbqfkf, zoijcleaowVar.f105669ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f105670wkgbmnqykc, zoijcleaowVar.f105670wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f105668iobyxmoadg.hashCode() * 31) + this.f105671zoijcleaow.hashCode()) * 31) + this.f105669ppxfxbqfkf.hashCode()) * 31) + this.f105670wkgbmnqykc.hashCode();
    }

    public final EvropolisGift iobyxmoadg() {
        return this.f105670wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f105671zoijcleaow;
    }

    public String toString() {
        return "EvropolisRedeemUiModel(stickersBlockSubtitle=" + this.f105668iobyxmoadg + ", stickers=" + this.f105671zoijcleaow + ", gifts=" + this.f105669ppxfxbqfkf + ", gift=" + this.f105670wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f105668iobyxmoadg;
    }

    public final gz0.iobyxmoadg zoijcleaow() {
        return this.f105669ppxfxbqfkf;
    }
}
