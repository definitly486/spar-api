package gk1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37768iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f37769zoijcleaow;

    public wkgbmnqykc(String article, boolean z13) {
        zdlpuopuiu.btonecajqb(article, "article");
        this.f37768iobyxmoadg = article;
        this.f37769zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f37768iobyxmoadg, wkgbmnqykcVar.f37768iobyxmoadg) && this.f37769zoijcleaow == wkgbmnqykcVar.f37769zoijcleaow;
    }

    public int hashCode() {
        return (this.f37768iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f37769zoijcleaow);
    }

    public final String iobyxmoadg() {
        return this.f37768iobyxmoadg;
    }

    public String toString() {
        return "PurchasesListProductStatus(article=" + this.f37768iobyxmoadg + ", isBought=" + this.f37769zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f37769zoijcleaow;
    }
}
