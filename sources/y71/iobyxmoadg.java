package y71;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import vq1.cqumvgiudr;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f124031iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cqumvgiudr.iobyxmoadg f124032ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final EvropolisGift f124033wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f124034zoijcleaow;

    public iobyxmoadg(String stickersBlockSubtitle, List stickers, cqumvgiudr.iobyxmoadg gifts, EvropolisGift gift) {
        zdlpuopuiu.btonecajqb(stickersBlockSubtitle, "stickersBlockSubtitle");
        zdlpuopuiu.btonecajqb(stickers, "stickers");
        zdlpuopuiu.btonecajqb(gifts, "gifts");
        zdlpuopuiu.btonecajqb(gift, "gift");
        this.f124031iobyxmoadg = stickersBlockSubtitle;
        this.f124034zoijcleaow = stickers;
        this.f124032ppxfxbqfkf = gifts;
        this.f124033wkgbmnqykc = gift;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f124031iobyxmoadg, iobyxmoadgVar.f124031iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f124034zoijcleaow, iobyxmoadgVar.f124034zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f124032ppxfxbqfkf, iobyxmoadgVar.f124032ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f124033wkgbmnqykc, iobyxmoadgVar.f124033wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f124031iobyxmoadg.hashCode() * 31) + this.f124034zoijcleaow.hashCode()) * 31) + this.f124032ppxfxbqfkf.hashCode()) * 31) + this.f124033wkgbmnqykc.hashCode();
    }

    public final EvropolisGift iobyxmoadg() {
        return this.f124033wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f124034zoijcleaow;
    }

    public String toString() {
        return "EvropolisRedeem(stickersBlockSubtitle=" + this.f124031iobyxmoadg + ", stickers=" + this.f124034zoijcleaow + ", gifts=" + this.f124032ppxfxbqfkf + ", gift=" + this.f124033wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f124031iobyxmoadg;
    }

    public final cqumvgiudr.iobyxmoadg zoijcleaow() {
        return this.f124032ppxfxbqfkf;
    }
}
