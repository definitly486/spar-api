package g81;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ColorsUiModel f36643eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f36644iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f36645ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f36646wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f36647zoijcleaow;

    public btonecajqb(boolean z13, List items, String str, String str2, ColorsUiModel colorsUiModel) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(colorsUiModel, "colorsUiModel");
        this.f36644iobyxmoadg = z13;
        this.f36647zoijcleaow = items;
        this.f36645ppxfxbqfkf = str;
        this.f36646wkgbmnqykc = str2;
        this.f36643eablkybsjg = colorsUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return this.f36644iobyxmoadg == btonecajqbVar.f36644iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f36647zoijcleaow, btonecajqbVar.f36647zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f36645ppxfxbqfkf, btonecajqbVar.f36645ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f36646wkgbmnqykc, btonecajqbVar.f36646wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f36643eablkybsjg, btonecajqbVar.f36643eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f36644iobyxmoadg) * 31) + this.f36647zoijcleaow.hashCode()) * 31;
        String str = this.f36645ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f36646wkgbmnqykc;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f36643eablkybsjg.hashCode();
    }

    public final ColorsUiModel iobyxmoadg() {
        return this.f36643eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f36645ppxfxbqfkf;
    }

    public String toString() {
        return "Model(isLoading=" + this.f36644iobyxmoadg + ", items=" + this.f36647zoijcleaow + ", primaryButtonText=" + this.f36645ppxfxbqfkf + ", secondaryButtonText=" + this.f36646wkgbmnqykc + ", colorsUiModel=" + this.f36643eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f36646wkgbmnqykc;
    }

    public final List zoijcleaow() {
        return this.f36647zoijcleaow;
    }
}
