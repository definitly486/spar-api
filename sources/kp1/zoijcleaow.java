package kp1;

import java.time.LocalDateTime;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f60333eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LocalDateTime f60334iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f60335ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final bo1.zoijcleaow f60336wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f60337zoijcleaow;

    public zoijcleaow(LocalDateTime localDateTime, String startText, boolean z13, bo1.zoijcleaow zoijcleaowVar, String str) {
        zdlpuopuiu.btonecajqb(startText, "startText");
        this.f60334iobyxmoadg = localDateTime;
        this.f60337zoijcleaow = startText;
        this.f60335ppxfxbqfkf = z13;
        this.f60336wkgbmnqykc = zoijcleaowVar;
        this.f60333eablkybsjg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f60334iobyxmoadg, zoijcleaowVar.f60334iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60337zoijcleaow, zoijcleaowVar.f60337zoijcleaow) && this.f60335ppxfxbqfkf == zoijcleaowVar.f60335ppxfxbqfkf && this.f60336wkgbmnqykc == zoijcleaowVar.f60336wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f60333eablkybsjg, zoijcleaowVar.f60333eablkybsjg);
    }

    public int hashCode() {
        LocalDateTime localDateTime = this.f60334iobyxmoadg;
        int iHashCode = (((((localDateTime == null ? 0 : localDateTime.hashCode()) * 31) + this.f60337zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f60335ppxfxbqfkf)) * 31;
        bo1.zoijcleaow zoijcleaowVar = this.f60336wkgbmnqykc;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str = this.f60333eablkybsjg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f60333eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f60337zoijcleaow;
    }

    public String toString() {
        return "ScanGoStartSessionModel(expiresAt=" + this.f60334iobyxmoadg + ", startText=" + this.f60337zoijcleaow + ", isSuccess=" + this.f60335ppxfxbqfkf + ", error=" + this.f60336wkgbmnqykc + ", errorMessage=" + this.f60333eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f60335ppxfxbqfkf;
    }

    public final LocalDateTime zoijcleaow() {
        return this.f60334iobyxmoadg;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zoijcleaow(LocalDateTime localDateTime, String str, boolean z13, bo1.zoijcleaow zoijcleaowVar, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        LocalDateTime localDateTime2 = (i13 & 1) != 0 ? null : localDateTime;
        String str3 = (i13 & 2) != 0 ? "" : str;
        if ((i13 & 4) != 0) {
            z13 = localDateTime2 != null;
        }
        this(localDateTime2, str3, z13, (i13 & 8) != 0 ? null : zoijcleaowVar, (i13 & 16) != 0 ? null : str2);
    }
}
