package u90;

import c52.cqumvgiudr;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.evropolis.api.model.EvropolisGift;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113021iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cqumvgiudr.iobyxmoadg f113022ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final EvropolisGift f113023wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f113024zoijcleaow;

    public iobyxmoadg(String stickersBlockSubtitle, List stickers, cqumvgiudr.iobyxmoadg gifts, EvropolisGift gift) {
        zdlpuopuiu.btonecajqb(stickersBlockSubtitle, "stickersBlockSubtitle");
        zdlpuopuiu.btonecajqb(stickers, "stickers");
        zdlpuopuiu.btonecajqb(gifts, "gifts");
        zdlpuopuiu.btonecajqb(gift, "gift");
        this.f113021iobyxmoadg = stickersBlockSubtitle;
        this.f113024zoijcleaow = stickers;
        this.f113022ppxfxbqfkf = gifts;
        this.f113023wkgbmnqykc = gift;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f113021iobyxmoadg, iobyxmoadgVar.f113021iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f113024zoijcleaow, iobyxmoadgVar.f113024zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f113022ppxfxbqfkf, iobyxmoadgVar.f113022ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f113023wkgbmnqykc, iobyxmoadgVar.f113023wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f113021iobyxmoadg.hashCode() * 31) + this.f113024zoijcleaow.hashCode()) * 31) + this.f113022ppxfxbqfkf.hashCode()) * 31) + this.f113023wkgbmnqykc.hashCode();
    }

    public final EvropolisGift iobyxmoadg() {
        return this.f113023wkgbmnqykc;
    }

    public final List ppxfxbqfkf() {
        return this.f113024zoijcleaow;
    }

    public String toString() {
        return "EvropolisRedeem(stickersBlockSubtitle=" + this.f113021iobyxmoadg + ", stickers=" + this.f113024zoijcleaow + ", gifts=" + this.f113022ppxfxbqfkf + ", gift=" + this.f113023wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f113021iobyxmoadg;
    }

    public final cqumvgiudr.iobyxmoadg zoijcleaow() {
        return this.f113022ppxfxbqfkf;
    }
}
