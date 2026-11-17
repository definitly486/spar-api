package wo0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f120286iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f120287ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120288zoijcleaow;

    public btonecajqb(String sectionId, String title, List recommendations) {
        zdlpuopuiu.btonecajqb(sectionId, "sectionId");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        this.f120286iobyxmoadg = sectionId;
        this.f120288zoijcleaow = title;
        this.f120287ppxfxbqfkf = recommendations;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f120286iobyxmoadg, btonecajqbVar.f120286iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120288zoijcleaow, btonecajqbVar.f120288zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f120287ppxfxbqfkf, btonecajqbVar.f120287ppxfxbqfkf);
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return Integer.valueOf(this.f120286iobyxmoadg.hashCode());
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.RECOMMENDATIONS;
    }

    public int hashCode() {
        return (((this.f120286iobyxmoadg.hashCode() * 31) + this.f120288zoijcleaow.hashCode()) * 31) + this.f120287ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f120287ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f120288zoijcleaow;
    }

    public String toString() {
        return "CartRecommendationsUiModel(sectionId=" + this.f120286iobyxmoadg + ", title=" + this.f120288zoijcleaow + ", recommendations=" + this.f120287ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f120286iobyxmoadg;
    }
}
