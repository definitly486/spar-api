package af0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f1676eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1677iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f1678ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f1679wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1680zoijcleaow;

    public zoijcleaow(String str, String str2, String str3, String str4, String str5) {
        this.f1677iobyxmoadg = str;
        this.f1680zoijcleaow = str2;
        this.f1678ppxfxbqfkf = str3;
        this.f1679wkgbmnqykc = str4;
        this.f1676eablkybsjg = str5;
    }

    public final String eablkybsjg() {
        return this.f1677iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f1677iobyxmoadg, zoijcleaowVar.f1677iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1680zoijcleaow, zoijcleaowVar.f1680zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f1678ppxfxbqfkf, zoijcleaowVar.f1678ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f1679wkgbmnqykc, zoijcleaowVar.f1679wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f1676eablkybsjg, zoijcleaowVar.f1676eablkybsjg);
    }

    public int hashCode() {
        String str = this.f1677iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1680zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1678ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1679wkgbmnqykc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1676eablkybsjg;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f1676eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f1680zoijcleaow;
    }

    public String toString() {
        return "LoymaxPopupContent(title=" + this.f1677iobyxmoadg + ", subtitle=" + this.f1680zoijcleaow + ", imageUrl=" + this.f1678ppxfxbqfkf + ", text=" + this.f1679wkgbmnqykc + ", buttonText=" + this.f1676eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f1679wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f1678ppxfxbqfkf;
    }
}
