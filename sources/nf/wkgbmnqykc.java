package nf;

import com.pandulapeter.beagle.common.configuration.Text;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Integer f69994btonecajqb = null;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f69998eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tg.iobyxmoadg f69999gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f70000iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f70001lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rgvfuqvkyq.zoijcleaow f70002ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f70003wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f70004zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final zoijcleaow f69997nufgyqmvbu = new zoijcleaow(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final rgvfuqvkyq.zoijcleaow f69995dxjokdxxww = rgvfuqvkyq.zoijcleaow.BUTTON;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final tg.iobyxmoadg f69996gtknphoqwx = iobyxmoadg.f70005zdlpuopuiu;

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f70005zdlpuopuiu = new iobyxmoadg();

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

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public wkgbmnqykc(Text text, boolean z13, rgvfuqvkyq.zoijcleaow type, Integer num, boolean z14, tg.iobyxmoadg onButtonPressed) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(onButtonPressed, "onButtonPressed");
        this.f70000iobyxmoadg = text;
        this.f70004zoijcleaow = z13;
        this.f70002ppxfxbqfkf = type;
        this.f70003wkgbmnqykc = num;
        this.f69998eablkybsjg = z14;
        this.f69999gxszxtbevo = onButtonPressed;
        this.f70001lqeggnwhkg = "developerOptionsButton";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f70000iobyxmoadg, wkgbmnqykcVar.f70000iobyxmoadg) && this.f70004zoijcleaow == wkgbmnqykcVar.f70004zoijcleaow && this.f70002ppxfxbqfkf == wkgbmnqykcVar.f70002ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f70003wkgbmnqykc, wkgbmnqykcVar.f70003wkgbmnqykc) && this.f69998eablkybsjg == wkgbmnqykcVar.f69998eablkybsjg && zdlpuopuiu.eablkybsjg(this.f69999gxszxtbevo, wkgbmnqykcVar.f69999gxszxtbevo);
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
        int iHashCode = this.f70000iobyxmoadg.hashCode() * 31;
        boolean z13 = this.f70004zoijcleaow;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int iHashCode2 = (((iHashCode + r13) * 31) + this.f70002ppxfxbqfkf.hashCode()) * 31;
        Integer num = this.f70003wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z14 = this.f69998eablkybsjg;
        return ((iHashCode3 + (z14 ? 1 : z14)) * 31) + this.f69999gxszxtbevo.hashCode();
    }

    public String toString() {
        return "DeveloperOptionsButtonModule(text=" + this.f70000iobyxmoadg + ", shouldOpenInNewTask=" + this.f70004zoijcleaow + ", type=" + this.f70002ppxfxbqfkf + ", icon=" + this.f70003wkgbmnqykc + ", isEnabled=" + this.f69998eablkybsjg + ", onButtonPressed=" + this.f69999gxszxtbevo + ")";
    }

    public /* synthetic */ wkgbmnqykc(Text text, boolean z13, rgvfuqvkyq.zoijcleaow zoijcleaowVar, Integer num, boolean z14, tg.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Developer options") : text, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? f69995dxjokdxxww : zoijcleaowVar, (i13 & 8) != 0 ? f69994btonecajqb : num, (i13 & 16) != 0 ? true : z14, (i13 & 32) != 0 ? f69996gtknphoqwx : iobyxmoadgVar);
    }
}
