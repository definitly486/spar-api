package nf;

import com.pandulapeter.beagle.common.configuration.Text;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final String f69864btonecajqb = null;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f69867eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f69868gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f69869iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f69870lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f69871ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f69872wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f69873zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final ppxfxbqfkf f69866nufgyqmvbu = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final gg.gtknphoqwx f69865dxjokdxxww = gg.draadjrbmk.zoijcleaow(zoijcleaow.f69875zdlpuopuiu);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f69874zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).longValue());
        }

        public final String iobyxmoadg(long j13) {
            String str = btonecajqb.f69866nufgyqmvbu.ppxfxbqfkf().format(Long.valueOf(j13));
            zdlpuopuiu.dxjokdxxww(str, "format(...)");
            return str;
        }
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SimpleDateFormat ppxfxbqfkf() {
            return (SimpleDateFormat) btonecajqb.f69865dxjokdxxww.getValue();
        }

        public final String zoijcleaow(String str) {
            return "logList_" + str;
        }

        private ppxfxbqfkf() {
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f69875zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        }
    }

    public btonecajqb(Text title, int i13, tg.draadjrbmk draadjrbmkVar, String str, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f69869iobyxmoadg = title;
        this.f69873zoijcleaow = i13;
        this.f69871ppxfxbqfkf = draadjrbmkVar;
        this.f69872wkgbmnqykc = str;
        this.f69867eablkybsjg = z13;
        this.f69868gxszxtbevo = z14;
        this.f69870lqeggnwhkg = f69866nufgyqmvbu.zoijcleaow(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f69869iobyxmoadg, btonecajqbVar.f69869iobyxmoadg) && this.f69873zoijcleaow == btonecajqbVar.f69873zoijcleaow && zdlpuopuiu.eablkybsjg(this.f69871ppxfxbqfkf, btonecajqbVar.f69871ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f69872wkgbmnqykc, btonecajqbVar.f69872wkgbmnqykc) && this.f69867eablkybsjg == btonecajqbVar.f69867eablkybsjg && this.f69868gxszxtbevo == btonecajqbVar.f69868gxszxtbevo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((this.f69869iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f69873zoijcleaow)) * 31;
        tg.draadjrbmk draadjrbmkVar = this.f69871ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (draadjrbmkVar == null ? 0 : draadjrbmkVar.hashCode())) * 31;
        String str = this.f69872wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z13 = this.f69867eablkybsjg;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode3 + r13) * 31;
        boolean z14 = this.f69868gxszxtbevo;
        return i13 + (z14 ? 1 : z14);
    }

    public String toString() {
        return "LogListModule(title=" + this.f69869iobyxmoadg + ", maxItemCount=" + this.f69873zoijcleaow + ", timestampFormatter=" + this.f69871ppxfxbqfkf + ", label=" + this.f69872wkgbmnqykc + ", isHorizontalScrollEnabled=" + this.f69867eablkybsjg + ", isExpandedInitially=" + this.f69868gxszxtbevo + ")";
    }

    public /* synthetic */ btonecajqb(Text text, int i13, tg.draadjrbmk draadjrbmkVar, String str, boolean z13, boolean z14, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Logs") : text, (i14 & 2) != 0 ? 10 : i13, (i14 & 4) != 0 ? iobyxmoadg.f69874zdlpuopuiu : draadjrbmkVar, (i14 & 8) != 0 ? f69864btonecajqb : str, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? false : z14);
    }
}
