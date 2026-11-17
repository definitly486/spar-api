package ow0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f74826iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f74827ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.iobyxmoadg f74828wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Integer f74829zoijcleaow;

    public iobyxmoadg(zoijcleaow type, Integer num, String str, tg.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(type, "type");
        this.f74826iobyxmoadg = type;
        this.f74829zoijcleaow = num;
        this.f74827ppxfxbqfkf = str;
        this.f74828wkgbmnqykc = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f74826iobyxmoadg == iobyxmoadgVar.f74826iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f74829zoijcleaow, iobyxmoadgVar.f74829zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f74827ppxfxbqfkf, iobyxmoadgVar.f74827ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f74828wkgbmnqykc, iobyxmoadgVar.f74828wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = this.f74826iobyxmoadg.hashCode() * 31;
        Integer num = this.f74829zoijcleaow;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f74827ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        tg.iobyxmoadg iobyxmoadgVar = this.f74828wkgbmnqykc;
        return iHashCode3 + (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
    }

    public final tg.iobyxmoadg iobyxmoadg() {
        return this.f74828wkgbmnqykc;
    }

    public final Integer ppxfxbqfkf() {
        return this.f74829zoijcleaow;
    }

    public String toString() {
        return "AlertButton(type=" + this.f74826iobyxmoadg + ", textRes=" + this.f74829zoijcleaow + ", text=" + this.f74827ppxfxbqfkf + ", listener=" + this.f74828wkgbmnqykc + ")";
    }

    public final zoijcleaow wkgbmnqykc() {
        return this.f74826iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f74827ppxfxbqfkf;
    }

    public /* synthetic */ iobyxmoadg(zoijcleaow zoijcleaowVar, Integer num, String str, tg.iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : iobyxmoadgVar);
    }
}
