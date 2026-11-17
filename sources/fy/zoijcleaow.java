package fy;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f35312iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f35313ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f35314wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f35315zoijcleaow;

    public zoijcleaow(String str, boolean z13, double d13, String statusText) {
        zdlpuopuiu.btonecajqb(statusText, "statusText");
        this.f35312iobyxmoadg = str;
        this.f35315zoijcleaow = z13;
        this.f35313ppxfxbqfkf = d13;
        this.f35314wkgbmnqykc = statusText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f35312iobyxmoadg, zoijcleaowVar.f35312iobyxmoadg) && this.f35315zoijcleaow == zoijcleaowVar.f35315zoijcleaow && Double.compare(this.f35313ppxfxbqfkf, zoijcleaowVar.f35313ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f35314wkgbmnqykc, zoijcleaowVar.f35314wkgbmnqykc);
    }

    public int hashCode() {
        String str = this.f35312iobyxmoadg;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f35315zoijcleaow)) * 31) + Double.hashCode(this.f35313ppxfxbqfkf)) * 31) + this.f35314wkgbmnqykc.hashCode();
    }

    public final double iobyxmoadg() {
        return this.f35313ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f35314wkgbmnqykc;
    }

    public String toString() {
        return "PromocodeEntity(value=" + this.f35312iobyxmoadg + ", status=" + this.f35315zoijcleaow + ", discount=" + this.f35313ppxfxbqfkf + ", statusText=" + this.f35314wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f35312iobyxmoadg;
    }

    public final boolean zoijcleaow() {
        return this.f35315zoijcleaow;
    }

    public /* synthetic */ zoijcleaow(String str, boolean z13, double d13, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? 0.0d : d13, (i13 & 8) != 0 ? "" : str2);
    }
}
