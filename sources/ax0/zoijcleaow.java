package ax0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14712iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f14713ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f14714wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f14715zoijcleaow;

    public zoijcleaow(String str, boolean z13, double d13, String statusText) {
        zdlpuopuiu.btonecajqb(statusText, "statusText");
        this.f14712iobyxmoadg = str;
        this.f14715zoijcleaow = z13;
        this.f14713ppxfxbqfkf = d13;
        this.f14714wkgbmnqykc = statusText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f14712iobyxmoadg, zoijcleaowVar.f14712iobyxmoadg) && this.f14715zoijcleaow == zoijcleaowVar.f14715zoijcleaow && Double.compare(this.f14713ppxfxbqfkf, zoijcleaowVar.f14713ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f14714wkgbmnqykc, zoijcleaowVar.f14714wkgbmnqykc);
    }

    public int hashCode() {
        String str = this.f14712iobyxmoadg;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f14715zoijcleaow)) * 31) + Double.hashCode(this.f14713ppxfxbqfkf)) * 31) + this.f14714wkgbmnqykc.hashCode();
    }

    public final double iobyxmoadg() {
        return this.f14713ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f14714wkgbmnqykc;
    }

    public String toString() {
        return "PromocodeEntity(value=" + this.f14712iobyxmoadg + ", status=" + this.f14715zoijcleaow + ", discount=" + this.f14713ppxfxbqfkf + ", statusText=" + this.f14714wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f14712iobyxmoadg;
    }

    public final boolean zoijcleaow() {
        return this.f14715zoijcleaow;
    }

    public /* synthetic */ zoijcleaow(String str, boolean z13, double d13, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? 0.0d : d13, (i13 & 8) != 0 ? "" : str2);
    }
}
