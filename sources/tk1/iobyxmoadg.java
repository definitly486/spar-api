package tk1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final C2734iobyxmoadg f111009gxszxtbevo = new C2734iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Integer f111010eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f111011iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f111012ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f111013wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f111014zoijcleaow;

    /* JADX INFO: renamed from: tk1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2734iobyxmoadg {
        public /* synthetic */ C2734iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2734iobyxmoadg() {
        }
    }

    public enum zoijcleaow {
        DYNAMIC,
        STATIC;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f111015iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public iobyxmoadg(String id2, String code, eablkybsjg eablkybsjgVar, zoijcleaow type, Integer num) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f111011iobyxmoadg = id2;
        this.f111014zoijcleaow = code;
        this.f111012ppxfxbqfkf = eablkybsjgVar;
        this.f111013wkgbmnqykc = type;
        this.f111010eablkybsjg = num;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, String str2, eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f111011iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = iobyxmoadgVar.f111014zoijcleaow;
        }
        String str3 = str2;
        if ((i13 & 4) != 0) {
            eablkybsjgVar = iobyxmoadgVar.f111012ppxfxbqfkf;
        }
        eablkybsjg eablkybsjgVar2 = eablkybsjgVar;
        if ((i13 & 8) != 0) {
            zoijcleaowVar = iobyxmoadgVar.f111013wkgbmnqykc;
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        if ((i13 & 16) != 0) {
            num = iobyxmoadgVar.f111010eablkybsjg;
        }
        return iobyxmoadgVar.iobyxmoadg(str, str3, eablkybsjgVar2, zoijcleaowVar2, num);
    }

    public final Integer eablkybsjg() {
        return this.f111010eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f111011iobyxmoadg, iobyxmoadgVar.f111011iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f111014zoijcleaow, iobyxmoadgVar.f111014zoijcleaow) && this.f111012ppxfxbqfkf == iobyxmoadgVar.f111012ppxfxbqfkf && this.f111013wkgbmnqykc == iobyxmoadgVar.f111013wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f111010eablkybsjg, iobyxmoadgVar.f111010eablkybsjg);
    }

    public final eablkybsjg gxszxtbevo() {
        return this.f111012ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = ((this.f111011iobyxmoadg.hashCode() * 31) + this.f111014zoijcleaow.hashCode()) * 31;
        eablkybsjg eablkybsjgVar = this.f111012ppxfxbqfkf;
        int iHashCode2 = (((iHashCode + (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode())) * 31) + this.f111013wkgbmnqykc.hashCode()) * 31;
        Integer num = this.f111010eablkybsjg;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final iobyxmoadg iobyxmoadg(String id2, String code, eablkybsjg eablkybsjgVar, zoijcleaow type, Integer num) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(type, "type");
        return new iobyxmoadg(id2, code, eablkybsjgVar, type, num);
    }

    public final zoijcleaow lqeggnwhkg() {
        return this.f111013wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f111014zoijcleaow;
    }

    public String toString() {
        return "QrEntity(id=" + this.f111011iobyxmoadg + ", code=" + this.f111014zoijcleaow + ", status=" + this.f111012ppxfxbqfkf + ", type=" + this.f111013wkgbmnqykc + ", lifeTime=" + this.f111010eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f111011iobyxmoadg;
    }
}
