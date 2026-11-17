package o32;

import java.time.LocalDateTime;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f71928eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocalDateTime f71929iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f71930ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f22.zoijcleaow f71931wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f71932zoijcleaow;

    public zoijcleaow(LocalDateTime localDateTime, String startText, boolean z13, f22.zoijcleaow zoijcleaowVar, String str) {
        zdlpuopuiu.btonecajqb(startText, "startText");
        this.f71929iobyxmoadg = localDateTime;
        this.f71932zoijcleaow = startText;
        this.f71930ppxfxbqfkf = z13;
        this.f71931wkgbmnqykc = zoijcleaowVar;
        this.f71928eablkybsjg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f71929iobyxmoadg, zoijcleaowVar.f71929iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71932zoijcleaow, zoijcleaowVar.f71932zoijcleaow) && this.f71930ppxfxbqfkf == zoijcleaowVar.f71930ppxfxbqfkf && this.f71931wkgbmnqykc == zoijcleaowVar.f71931wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f71928eablkybsjg, zoijcleaowVar.f71928eablkybsjg);
    }

    public int hashCode() {
        LocalDateTime localDateTime = this.f71929iobyxmoadg;
        int iHashCode = (((((localDateTime == null ? 0 : localDateTime.hashCode()) * 31) + this.f71932zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f71930ppxfxbqfkf)) * 31;
        f22.zoijcleaow zoijcleaowVar = this.f71931wkgbmnqykc;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str = this.f71928eablkybsjg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f71928eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f71932zoijcleaow;
    }

    public String toString() {
        return "ScanGoStartSessionModel(expiresAt=" + this.f71929iobyxmoadg + ", startText=" + this.f71932zoijcleaow + ", isSuccess=" + this.f71930ppxfxbqfkf + ", error=" + this.f71931wkgbmnqykc + ", errorMessage=" + this.f71928eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f71930ppxfxbqfkf;
    }

    public final LocalDateTime zoijcleaow() {
        return this.f71929iobyxmoadg;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zoijcleaow(LocalDateTime localDateTime, String str, boolean z13, f22.zoijcleaow zoijcleaowVar, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        LocalDateTime localDateTime2 = (i13 & 1) != 0 ? null : localDateTime;
        String str3 = (i13 & 2) != 0 ? "" : str;
        if ((i13 & 4) != 0) {
            z13 = localDateTime2 != null;
        }
        this(localDateTime2, str3, z13, (i13 & 8) != 0 ? null : zoijcleaowVar, (i13 & 16) != 0 ? null : str2);
    }
}
