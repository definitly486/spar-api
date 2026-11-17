package fi;

import hg.agtfadlqog;
import hg.jyumaefscl;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final C0749iobyxmoadg f33896gxszxtbevo = new C0749iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f33897eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int[] f33898iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f33899ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f33900wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f33901zoijcleaow;

    /* JADX INFO: renamed from: fi.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0749iobyxmoadg {
        public /* synthetic */ C0749iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0749iobyxmoadg() {
        }
    }

    public iobyxmoadg(int... numbers) {
        List listWflxmlrfwp;
        zdlpuopuiu.btonecajqb(numbers, "numbers");
        this.f33898iobyxmoadg = numbers;
        Integer numIyctptxqzt = agtfadlqog.iyctptxqzt(numbers, 0);
        this.f33901zoijcleaow = numIyctptxqzt != null ? numIyctptxqzt.intValue() : -1;
        Integer numIyctptxqzt2 = agtfadlqog.iyctptxqzt(numbers, 1);
        this.f33899ppxfxbqfkf = numIyctptxqzt2 != null ? numIyctptxqzt2.intValue() : -1;
        Integer numIyctptxqzt3 = agtfadlqog.iyctptxqzt(numbers, 2);
        this.f33900wkgbmnqykc = numIyctptxqzt3 != null ? numIyctptxqzt3.intValue() : -1;
        if (numbers.length <= 3) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listWflxmlrfwp = jyumaefscl.m(agtfadlqog.eablkybsjg(numbers).subList(3, numbers.length));
        }
        this.f33897eablkybsjg = listWflxmlrfwp;
    }

    public final boolean eablkybsjg(int i13, int i14, int i15) {
        int i16 = this.f33901zoijcleaow;
        if (i16 < i13) {
            return true;
        }
        if (i16 > i13) {
            return false;
        }
        int i17 = this.f33899ppxfxbqfkf;
        if (i17 < i14) {
            return true;
        }
        return i17 <= i14 && this.f33900wkgbmnqykc <= i15;
    }

    public boolean equals(Object obj) {
        if (obj != null && zdlpuopuiu.eablkybsjg(getClass(), obj.getClass())) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            if (this.f33901zoijcleaow == iobyxmoadgVar.f33901zoijcleaow && this.f33899ppxfxbqfkf == iobyxmoadgVar.f33899ppxfxbqfkf && this.f33900wkgbmnqykc == iobyxmoadgVar.f33900wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f33897eablkybsjg, iobyxmoadgVar.f33897eablkybsjg)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean gxszxtbevo(iobyxmoadg ourVersion) {
        zdlpuopuiu.btonecajqb(ourVersion, "ourVersion");
        int i13 = this.f33901zoijcleaow;
        if (i13 == 0) {
            if (ourVersion.f33901zoijcleaow != 0 || this.f33899ppxfxbqfkf != ourVersion.f33899ppxfxbqfkf) {
                return false;
            }
        } else if (i13 != ourVersion.f33901zoijcleaow || this.f33899ppxfxbqfkf > ourVersion.f33899ppxfxbqfkf) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i13 = this.f33901zoijcleaow;
        int i14 = i13 + (i13 * 31) + this.f33899ppxfxbqfkf;
        int i15 = i14 + (i14 * 31) + this.f33900wkgbmnqykc;
        return i15 + (i15 * 31) + this.f33897eablkybsjg.hashCode();
    }

    public final int iobyxmoadg() {
        return this.f33901zoijcleaow;
    }

    public final int[] lqeggnwhkg() {
        return this.f33898iobyxmoadg;
    }

    public final boolean ppxfxbqfkf(int i13, int i14, int i15) {
        int i16 = this.f33901zoijcleaow;
        if (i16 > i13) {
            return true;
        }
        if (i16 < i13) {
            return false;
        }
        int i17 = this.f33899ppxfxbqfkf;
        if (i17 > i14) {
            return true;
        }
        return i17 >= i14 && this.f33900wkgbmnqykc >= i15;
    }

    public String toString() {
        int[] iArrLqeggnwhkg = lqeggnwhkg();
        ArrayList arrayList = new ArrayList();
        for (int i13 : iArrLqeggnwhkg) {
            if (i13 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i13));
        }
        return arrayList.isEmpty() ? CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE : jyumaefscl.iwxlajgraz(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean wkgbmnqykc(iobyxmoadg version) {
        zdlpuopuiu.btonecajqb(version, "version");
        return ppxfxbqfkf(version.f33901zoijcleaow, version.f33899ppxfxbqfkf, version.f33900wkgbmnqykc);
    }

    public final int zoijcleaow() {
        return this.f33899ppxfxbqfkf;
    }
}
