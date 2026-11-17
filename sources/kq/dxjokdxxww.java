package kq;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f60349iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f60350zoijcleaow;

    public dxjokdxxww(String sectionId, List recommendations) {
        zdlpuopuiu.btonecajqb(sectionId, "sectionId");
        zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        this.f60349iobyxmoadg = sectionId;
        this.f60350zoijcleaow = recommendations;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f60349iobyxmoadg, dxjokdxxwwVar.f60349iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60350zoijcleaow, dxjokdxxwwVar.f60350zoijcleaow);
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return Integer.valueOf(this.f60349iobyxmoadg.hashCode());
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.RECOMMENDATIONS;
    }

    public int hashCode() {
        return (this.f60349iobyxmoadg.hashCode() * 31) + this.f60350zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f60350zoijcleaow;
    }

    public String toString() {
        return "CartRecommendationsUiModel(sectionId=" + this.f60349iobyxmoadg + ", recommendations=" + this.f60350zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f60349iobyxmoadg;
    }
}
