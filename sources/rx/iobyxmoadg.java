package rx;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f104992iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f104993ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.iobyxmoadg f104994wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Integer f104995zoijcleaow;

    public iobyxmoadg(zoijcleaow type, Integer num, String str, tg.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(type, "type");
        this.f104992iobyxmoadg = type;
        this.f104995zoijcleaow = num;
        this.f104993ppxfxbqfkf = str;
        this.f104994wkgbmnqykc = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f104992iobyxmoadg == iobyxmoadgVar.f104992iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f104995zoijcleaow, iobyxmoadgVar.f104995zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104993ppxfxbqfkf, iobyxmoadgVar.f104993ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104994wkgbmnqykc, iobyxmoadgVar.f104994wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = this.f104992iobyxmoadg.hashCode() * 31;
        Integer num = this.f104995zoijcleaow;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f104993ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        tg.iobyxmoadg iobyxmoadgVar = this.f104994wkgbmnqykc;
        return iHashCode3 + (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
    }

    public final tg.iobyxmoadg iobyxmoadg() {
        return this.f104994wkgbmnqykc;
    }

    public final Integer ppxfxbqfkf() {
        return this.f104995zoijcleaow;
    }

    public String toString() {
        return "AlertButton(type=" + this.f104992iobyxmoadg + ", textRes=" + this.f104995zoijcleaow + ", text=" + this.f104993ppxfxbqfkf + ", listener=" + this.f104994wkgbmnqykc + ")";
    }

    public final zoijcleaow wkgbmnqykc() {
        return this.f104992iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f104993ppxfxbqfkf;
    }

    public /* synthetic */ iobyxmoadg(zoijcleaow zoijcleaowVar, Integer num, String str, tg.iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : iobyxmoadgVar);
    }
}
