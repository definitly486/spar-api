package gk1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37765iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f37766ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f37767zoijcleaow;

    public ppxfxbqfkf(String article, double d13, String measure) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        this.f37765iobyxmoadg = article;
        this.f37767zoijcleaow = d13;
        this.f37766ppxfxbqfkf = measure;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f37765iobyxmoadg, ppxfxbqfkfVar.f37765iobyxmoadg) && Double.compare(this.f37767zoijcleaow, ppxfxbqfkfVar.f37767zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f37766ppxfxbqfkf, ppxfxbqfkfVar.f37766ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f37765iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f37767zoijcleaow)) * 31) + this.f37766ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f37765iobyxmoadg;
    }

    public final double ppxfxbqfkf() {
        return this.f37767zoijcleaow;
    }

    public String toString() {
        return "PurchasesListProductDetail(article=" + this.f37765iobyxmoadg + ", quantity=" + this.f37767zoijcleaow + ", measure=" + this.f37766ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f37766ppxfxbqfkf;
    }
}
