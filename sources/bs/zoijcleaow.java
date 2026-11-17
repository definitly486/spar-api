package bs;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16992iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f16993ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f16994zoijcleaow;

    public zoijcleaow(String str, String str2, String str3) {
        this.f16992iobyxmoadg = str;
        this.f16994zoijcleaow = str2;
        this.f16993ppxfxbqfkf = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f16992iobyxmoadg, zoijcleaowVar.f16992iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16994zoijcleaow, zoijcleaowVar.f16994zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16993ppxfxbqfkf, zoijcleaowVar.f16993ppxfxbqfkf);
    }

    public int hashCode() {
        String str = this.f16992iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16994zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16993ppxfxbqfkf;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f16992iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f16993ppxfxbqfkf;
    }

    public String toString() {
        return "ProductDescriptionUiModel(information=" + this.f16992iobyxmoadg + ", styling=" + this.f16994zoijcleaow + ", tasting=" + this.f16993ppxfxbqfkf + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f16992iobyxmoadg == null && this.f16994zoijcleaow == null && this.f16993ppxfxbqfkf == null;
    }

    public final String zoijcleaow() {
        return this.f16994zoijcleaow;
    }
}
