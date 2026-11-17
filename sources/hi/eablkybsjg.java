package hi;

import java.util.Arrays;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends fi.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final eablkybsjg f40415btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final eablkybsjg f40416dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final eablkybsjg f40417gtknphoqwx;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f40418nufgyqmvbu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f40419lqeggnwhkg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        eablkybsjg eablkybsjgVar = new eablkybsjg(2, 0, 0);
        f40416dxjokdxxww = eablkybsjgVar;
        f40415btonecajqb = eablkybsjgVar.wflxmlrfwp();
        f40417gtknphoqwx = new eablkybsjg(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(int[] versionArray, boolean z13) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        zdlpuopuiu.btonecajqb(versionArray, "versionArray");
        this.f40419lqeggnwhkg = z13;
    }

    private final boolean draadjrbmk(eablkybsjg eablkybsjgVar) {
        if (iobyxmoadg() > eablkybsjgVar.iobyxmoadg()) {
            return true;
        }
        return iobyxmoadg() >= eablkybsjgVar.iobyxmoadg() && zoijcleaow() > eablkybsjgVar.zoijcleaow();
    }

    private final boolean dxjokdxxww(eablkybsjg eablkybsjgVar) {
        if ((iobyxmoadg() == 1 && zoijcleaow() == 0) || iobyxmoadg() == 0) {
            return false;
        }
        return !draadjrbmk(eablkybsjgVar);
    }

    public final boolean btonecajqb() {
        return this.f40419lqeggnwhkg;
    }

    public final eablkybsjg gtknphoqwx(boolean z13) {
        eablkybsjg eablkybsjgVar = z13 ? f40416dxjokdxxww : f40415btonecajqb;
        return eablkybsjgVar.draadjrbmk(this) ? eablkybsjgVar : this;
    }

    public final boolean nufgyqmvbu(eablkybsjg metadataVersionFromLanguageVersion) {
        zdlpuopuiu.btonecajqb(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (iobyxmoadg() == 2 && zoijcleaow() == 0) {
            eablkybsjg eablkybsjgVar = f40416dxjokdxxww;
            if (eablkybsjgVar.iobyxmoadg() == 1 && eablkybsjgVar.zoijcleaow() == 8) {
                return true;
            }
        }
        return dxjokdxxww(metadataVersionFromLanguageVersion.gtknphoqwx(this.f40419lqeggnwhkg));
    }

    public final eablkybsjg wflxmlrfwp() {
        return (iobyxmoadg() == 1 && zoijcleaow() == 9) ? new eablkybsjg(2, 0, 0) : new eablkybsjg(iobyxmoadg(), zoijcleaow() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(int... numbers) {
        this(numbers, false);
        zdlpuopuiu.btonecajqb(numbers, "numbers");
    }
}
