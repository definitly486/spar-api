package o90;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.evropolis.api.model.EvropolisGift;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72367iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o00.iobyxmoadg f72368ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final EvropolisGift f72369wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f72370zoijcleaow;

    public zoijcleaow(String stickersBlockSubtitle, List stickers, o00.iobyxmoadg gifts, EvropolisGift gift) {
        zdlpuopuiu.btonecajqb(stickersBlockSubtitle, "stickersBlockSubtitle");
        zdlpuopuiu.btonecajqb(stickers, "stickers");
        zdlpuopuiu.btonecajqb(gifts, "gifts");
        zdlpuopuiu.btonecajqb(gift, "gift");
        this.f72367iobyxmoadg = stickersBlockSubtitle;
        this.f72370zoijcleaow = stickers;
        this.f72368ppxfxbqfkf = gifts;
        this.f72369wkgbmnqykc = gift;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f72367iobyxmoadg, zoijcleaowVar.f72367iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f72370zoijcleaow, zoijcleaowVar.f72370zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72368ppxfxbqfkf, zoijcleaowVar.f72368ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f72369wkgbmnqykc, zoijcleaowVar.f72369wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f72367iobyxmoadg.hashCode() * 31) + this.f72370zoijcleaow.hashCode()) * 31) + this.f72368ppxfxbqfkf.hashCode()) * 31) + this.f72369wkgbmnqykc.hashCode();
    }

    public final EvropolisGift iobyxmoadg() {
        return this.f72369wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f72370zoijcleaow;
    }

    public String toString() {
        return "EvropolisRedeemUiModel(stickersBlockSubtitle=" + this.f72367iobyxmoadg + ", stickers=" + this.f72370zoijcleaow + ", gifts=" + this.f72368ppxfxbqfkf + ", gift=" + this.f72369wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f72367iobyxmoadg;
    }

    public final o00.iobyxmoadg zoijcleaow() {
        return this.f72368ppxfxbqfkf;
    }
}
