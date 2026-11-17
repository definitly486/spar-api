package qq0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f80524iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f80525ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f80526zoijcleaow;

    public zoijcleaow(String str, String str2, String str3) {
        this.f80524iobyxmoadg = str;
        this.f80526zoijcleaow = str2;
        this.f80525ppxfxbqfkf = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f80524iobyxmoadg, zoijcleaowVar.f80524iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80526zoijcleaow, zoijcleaowVar.f80526zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f80525ppxfxbqfkf, zoijcleaowVar.f80525ppxfxbqfkf);
    }

    public int hashCode() {
        String str = this.f80524iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f80526zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80525ppxfxbqfkf;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f80524iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f80525ppxfxbqfkf;
    }

    public String toString() {
        return "ProductDescriptionUiModel(information=" + this.f80524iobyxmoadg + ", styling=" + this.f80526zoijcleaow + ", tasting=" + this.f80525ppxfxbqfkf + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f80524iobyxmoadg == null && this.f80526zoijcleaow == null && this.f80525ppxfxbqfkf == null;
    }

    public final String zoijcleaow() {
        return this.f80526zoijcleaow;
    }
}
