package ds;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ColorsUiModel f29406eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f29407iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f29408ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f29409wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f29410zoijcleaow;

    public btonecajqb(List items, String title, boolean z13, boolean z14, ColorsUiModel colorsModel) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        this.f29407iobyxmoadg = items;
        this.f29410zoijcleaow = title;
        this.f29408ppxfxbqfkf = z13;
        this.f29409wkgbmnqykc = z14;
        this.f29406eablkybsjg = colorsModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f29407iobyxmoadg, btonecajqbVar.f29407iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29410zoijcleaow, btonecajqbVar.f29410zoijcleaow) && this.f29408ppxfxbqfkf == btonecajqbVar.f29408ppxfxbqfkf && this.f29409wkgbmnqykc == btonecajqbVar.f29409wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f29406eablkybsjg, btonecajqbVar.f29406eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f29407iobyxmoadg.hashCode() * 31) + this.f29410zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f29408ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f29409wkgbmnqykc)) * 31) + this.f29406eablkybsjg.hashCode();
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f29406eablkybsjg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f29409wkgbmnqykc;
    }

    public String toString() {
        return "Model(items=" + this.f29407iobyxmoadg + ", title=" + this.f29410zoijcleaow + ", isLoading=" + this.f29408ppxfxbqfkf + ", isInitialLoading=" + this.f29409wkgbmnqykc + ", colorsModel=" + this.f29406eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f29408ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f29407iobyxmoadg;
    }
}
