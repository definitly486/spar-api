package rv;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f104925eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f104926iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f104927ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f104928wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f104929zoijcleaow;

    public iobyxmoadg(String date, String text, int i13, int i14, List categories) {
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(categories, "categories");
        this.f104926iobyxmoadg = date;
        this.f104929zoijcleaow = text;
        this.f104927ppxfxbqfkf = i13;
        this.f104928wkgbmnqykc = i14;
        this.f104925eablkybsjg = categories;
    }

    public final String eablkybsjg() {
        return this.f104929zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f104926iobyxmoadg, iobyxmoadgVar.f104926iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104929zoijcleaow, iobyxmoadgVar.f104929zoijcleaow) && this.f104927ppxfxbqfkf == iobyxmoadgVar.f104927ppxfxbqfkf && this.f104928wkgbmnqykc == iobyxmoadgVar.f104928wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f104925eablkybsjg, iobyxmoadgVar.f104925eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f104926iobyxmoadg.hashCode() * 31) + this.f104929zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f104927ppxfxbqfkf)) * 31) + Integer.hashCode(this.f104928wkgbmnqykc)) * 31) + this.f104925eablkybsjg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f104925eablkybsjg;
    }

    public final int ppxfxbqfkf() {
        return this.f104928wkgbmnqykc;
    }

    public String toString() {
        return "LoyaltyCategoriesDetail(date=" + this.f104926iobyxmoadg + ", text=" + this.f104929zoijcleaow + ", quantityForChoose=" + this.f104927ppxfxbqfkf + ", quantityChosen=" + this.f104928wkgbmnqykc + ", categories=" + this.f104925eablkybsjg + ")";
    }

    public final int wkgbmnqykc() {
        return this.f104927ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f104926iobyxmoadg;
    }
}
