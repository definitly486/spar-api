package nf;

import com.pandulapeter.beagle.common.configuration.Text;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final ppxfxbqfkf f69915gxszxtbevo = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final gg.gtknphoqwx f69916lqeggnwhkg = gg.draadjrbmk.zoijcleaow(zoijcleaow.f69923zdlpuopuiu);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f69917eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f69918iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f69919ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f69920wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f69921zoijcleaow;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f69922zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).longValue());
        }

        public final String iobyxmoadg(long j13) {
            String str = gtknphoqwx.f69915gxszxtbevo.zoijcleaow().format(Long.valueOf(j13));
            zdlpuopuiu.dxjokdxxww(str, "format(...)");
            return str;
        }
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SimpleDateFormat zoijcleaow() {
            return (SimpleDateFormat) gtknphoqwx.f69916lqeggnwhkg.getValue();
        }

        private ppxfxbqfkf() {
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f69923zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        }
    }

    public gtknphoqwx(Text title, int i13, tg.draadjrbmk draadjrbmkVar, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f69918iobyxmoadg = title;
        this.f69921zoijcleaow = i13;
        this.f69919ppxfxbqfkf = draadjrbmkVar;
        this.f69920wkgbmnqykc = z13;
        this.f69917eablkybsjg = "networkLogList";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return zdlpuopuiu.eablkybsjg(this.f69918iobyxmoadg, gtknphoqwxVar.f69918iobyxmoadg) && this.f69921zoijcleaow == gtknphoqwxVar.f69921zoijcleaow && zdlpuopuiu.eablkybsjg(this.f69919ppxfxbqfkf, gtknphoqwxVar.f69919ppxfxbqfkf) && this.f69920wkgbmnqykc == gtknphoqwxVar.f69920wkgbmnqykc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.f69918iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f69921zoijcleaow)) * 31;
        tg.draadjrbmk draadjrbmkVar = this.f69919ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (draadjrbmkVar == null ? 0 : draadjrbmkVar.hashCode())) * 31;
        boolean z13 = this.f69920wkgbmnqykc;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode2 + r13;
    }

    public String toString() {
        return "NetworkLogListModule(title=" + this.f69918iobyxmoadg + ", maxItemCount=" + this.f69921zoijcleaow + ", timestampFormatter=" + this.f69919ppxfxbqfkf + ", isExpandedInitially=" + this.f69920wkgbmnqykc + ")";
    }

    public /* synthetic */ gtknphoqwx(Text text, int i13, tg.draadjrbmk draadjrbmkVar, boolean z13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Network activity") : text, (i14 & 2) != 0 ? 10 : i13, (i14 & 4) != 0 ? iobyxmoadg.f69922zdlpuopuiu : draadjrbmkVar, (i14 & 8) != 0 ? false : z13);
    }
}
