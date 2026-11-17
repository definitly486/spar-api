package lu0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f64108eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f64109iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f64110ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f64111wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f64112zoijcleaow;

    public iobyxmoadg(String date, String text, int i13, int i14, List categories) {
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(categories, "categories");
        this.f64109iobyxmoadg = date;
        this.f64112zoijcleaow = text;
        this.f64110ppxfxbqfkf = i13;
        this.f64111wkgbmnqykc = i14;
        this.f64108eablkybsjg = categories;
    }

    public final String eablkybsjg() {
        return this.f64112zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f64109iobyxmoadg, iobyxmoadgVar.f64109iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f64112zoijcleaow, iobyxmoadgVar.f64112zoijcleaow) && this.f64110ppxfxbqfkf == iobyxmoadgVar.f64110ppxfxbqfkf && this.f64111wkgbmnqykc == iobyxmoadgVar.f64111wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f64108eablkybsjg, iobyxmoadgVar.f64108eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f64109iobyxmoadg.hashCode() * 31) + this.f64112zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f64110ppxfxbqfkf)) * 31) + Integer.hashCode(this.f64111wkgbmnqykc)) * 31) + this.f64108eablkybsjg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f64108eablkybsjg;
    }

    public final int ppxfxbqfkf() {
        return this.f64111wkgbmnqykc;
    }

    public String toString() {
        return "LoyaltyCategoriesDetail(date=" + this.f64109iobyxmoadg + ", text=" + this.f64112zoijcleaow + ", quantityForChoose=" + this.f64110ppxfxbqfkf + ", quantityChosen=" + this.f64111wkgbmnqykc + ", categories=" + this.f64108eablkybsjg + ")";
    }

    public final int wkgbmnqykc() {
        return this.f64110ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f64109iobyxmoadg;
    }
}
