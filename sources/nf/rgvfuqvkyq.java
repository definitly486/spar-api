package nf;

import com.pandulapeter.beagle.common.configuration.Text;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Integer f69972btonecajqb = null;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final tg.iobyxmoadg f69975nufgyqmvbu = null;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f69976eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tg.iobyxmoadg f69977gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f69978iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Integer f69979ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f69980wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f69981zoijcleaow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f69974lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final zoijcleaow f69973dxjokdxxww = zoijcleaow.NORMAL;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public enum zoijcleaow {
        NORMAL,
        SECTION_HEADER,
        BUTTON;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f69982cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public rgvfuqvkyq(Text text, zoijcleaow type, Integer num, boolean z13, String id2, tg.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f69978iobyxmoadg = text;
        this.f69981zoijcleaow = type;
        this.f69979ppxfxbqfkf = num;
        this.f69980wkgbmnqykc = z13;
        this.f69976eablkybsjg = id2;
        this.f69977gxszxtbevo = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return zdlpuopuiu.eablkybsjg(this.f69978iobyxmoadg, rgvfuqvkyqVar.f69978iobyxmoadg) && this.f69981zoijcleaow == rgvfuqvkyqVar.f69981zoijcleaow && zdlpuopuiu.eablkybsjg(this.f69979ppxfxbqfkf, rgvfuqvkyqVar.f69979ppxfxbqfkf) && this.f69980wkgbmnqykc == rgvfuqvkyqVar.f69980wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f69976eablkybsjg, rgvfuqvkyqVar.f69976eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f69977gxszxtbevo, rgvfuqvkyqVar.f69977gxszxtbevo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.f69978iobyxmoadg.hashCode() * 31) + this.f69981zoijcleaow.hashCode()) * 31;
        Integer num = this.f69979ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z13 = this.f69980wkgbmnqykc;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r13) * 31) + this.f69976eablkybsjg.hashCode()) * 31;
        tg.iobyxmoadg iobyxmoadgVar = this.f69977gxszxtbevo;
        return iHashCode3 + (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
    }

    public String toString() {
        return "TextModule(text=" + this.f69978iobyxmoadg + ", type=" + this.f69981zoijcleaow + ", icon=" + this.f69979ppxfxbqfkf + ", isEnabled=" + this.f69980wkgbmnqykc + ", id=" + this.f69976eablkybsjg + ", onItemSelected=" + this.f69977gxszxtbevo + ")";
    }

    public /* synthetic */ rgvfuqvkyq(Text text, zoijcleaow zoijcleaowVar, Integer num, boolean z13, String str, tg.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(text, (i13 & 2) != 0 ? f69973dxjokdxxww : zoijcleaowVar, (i13 & 4) != 0 ? f69972btonecajqb : num, (i13 & 8) != 0 ? true : z13, (i13 & 16) != 0 ? kf.ppxfxbqfkf.zoijcleaow() : str, (i13 & 32) != 0 ? f69975nufgyqmvbu : iobyxmoadgVar);
    }

    public /* synthetic */ rgvfuqvkyq(CharSequence charSequence, zoijcleaow zoijcleaowVar, Integer num, boolean z13, String str, tg.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(charSequence, (i13 & 2) != 0 ? f69973dxjokdxxww : zoijcleaowVar, (i13 & 4) != 0 ? f69972btonecajqb : num, (i13 & 8) != 0 ? true : z13, (i13 & 16) != 0 ? kf.ppxfxbqfkf.zoijcleaow() : str, (i13 & 32) != 0 ? f69975nufgyqmvbu : iobyxmoadgVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rgvfuqvkyq(CharSequence text, zoijcleaow type, Integer num, boolean z13, String id2, tg.iobyxmoadg iobyxmoadgVar) {
        this(com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg(text), type, num, z13, id2, iobyxmoadgVar);
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(id2, "id");
    }
}
