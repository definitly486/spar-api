package az1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14822iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f14823zoijcleaow;

    public wkgbmnqykc(String article, boolean z13) {
        zdlpuopuiu.btonecajqb(article, "article");
        this.f14822iobyxmoadg = article;
        this.f14823zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f14822iobyxmoadg, wkgbmnqykcVar.f14822iobyxmoadg) && this.f14823zoijcleaow == wkgbmnqykcVar.f14823zoijcleaow;
    }

    public int hashCode() {
        return (this.f14822iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f14823zoijcleaow);
    }

    public final String iobyxmoadg() {
        return this.f14822iobyxmoadg;
    }

    public String toString() {
        return "PurchasesListProductStatus(article=" + this.f14822iobyxmoadg + ", isBought=" + this.f14823zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f14823zoijcleaow;
    }
}
