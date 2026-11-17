package nf;

import com.pandulapeter.beagle.common.configuration.Text;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Integer f70006btonecajqb = null;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f70010eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tg.iobyxmoadg f70011gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f70012iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f70013lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rgvfuqvkyq.zoijcleaow f70014ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f70015wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f70016zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final C1506zoijcleaow f70009nufgyqmvbu = new C1506zoijcleaow(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final rgvfuqvkyq.zoijcleaow f70007dxjokdxxww = rgvfuqvkyq.zoijcleaow.BUTTON;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final tg.iobyxmoadg f70008gtknphoqwx = iobyxmoadg.f70017zdlpuopuiu;

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f70017zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: nf.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1506zoijcleaow {
        public /* synthetic */ C1506zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1506zoijcleaow() {
        }
    }

    public zoijcleaow(Text text, boolean z13, rgvfuqvkyq.zoijcleaow type, Integer num, boolean z14, tg.iobyxmoadg onButtonPressed) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(onButtonPressed, "onButtonPressed");
        this.f70012iobyxmoadg = text;
        this.f70016zoijcleaow = z13;
        this.f70014ppxfxbqfkf = type;
        this.f70015wkgbmnqykc = num;
        this.f70010eablkybsjg = z14;
        this.f70011gxszxtbevo = onButtonPressed;
        this.f70013lqeggnwhkg = "appInfoButton";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f70012iobyxmoadg, zoijcleaowVar.f70012iobyxmoadg) && this.f70016zoijcleaow == zoijcleaowVar.f70016zoijcleaow && this.f70014ppxfxbqfkf == zoijcleaowVar.f70014ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f70015wkgbmnqykc, zoijcleaowVar.f70015wkgbmnqykc) && this.f70010eablkybsjg == zoijcleaowVar.f70010eablkybsjg && zdlpuopuiu.eablkybsjg(this.f70011gxszxtbevo, zoijcleaowVar.f70011gxszxtbevo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.f70012iobyxmoadg.hashCode() * 31;
        boolean z13 = this.f70016zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int iHashCode2 = (((iHashCode + r13) * 31) + this.f70014ppxfxbqfkf.hashCode()) * 31;
        Integer num = this.f70015wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z14 = this.f70010eablkybsjg;
        return ((iHashCode3 + (z14 ? 1 : z14)) * 31) + this.f70011gxszxtbevo.hashCode();
    }

    public String toString() {
        return "AppInfoButtonModule(text=" + this.f70012iobyxmoadg + ", shouldOpenInNewTask=" + this.f70016zoijcleaow + ", type=" + this.f70014ppxfxbqfkf + ", icon=" + this.f70015wkgbmnqykc + ", isEnabled=" + this.f70010eablkybsjg + ", onButtonPressed=" + this.f70011gxszxtbevo + ")";
    }

    public /* synthetic */ zoijcleaow(Text text, boolean z13, rgvfuqvkyq.zoijcleaow zoijcleaowVar, Integer num, boolean z14, tg.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Show app info") : text, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? f70007dxjokdxxww : zoijcleaowVar, (i13 & 8) != 0 ? f70006btonecajqb : num, (i13 & 16) != 0 ? true : z14, (i13 & 32) != 0 ? f70008gtknphoqwx : iobyxmoadgVar);
    }
}
