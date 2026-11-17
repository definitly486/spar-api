package oj;

import gg.istkbnxepw;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.gxszxtbevo;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements Serializable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f72980yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f72981zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f72979jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final zoijcleaow f72978iwizpuwonk = new zoijcleaow(0, 0);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final Comparator f72977cqumvgiudr = new Comparator() { // from class: oj.iobyxmoadg
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zoijcleaow.wkgbmnqykc((zoijcleaow) obj, (zoijcleaow) obj2);
        }
    };

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow iobyxmoadg(long j13, long j14) {
            return (j13 == 0 && j14 == 0) ? zoijcleaow() : new zoijcleaow(j13, j14);
        }

        public final zoijcleaow ppxfxbqfkf(String uuidString) {
            zdlpuopuiu.btonecajqb(uuidString, "uuidString");
            if (uuidString.length() != 36) {
                throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
            }
            long jGxszxtbevo = gxszxtbevo.gxszxtbevo(uuidString, 0, 8, null, 4, null);
            wkgbmnqykc.wkgbmnqykc(uuidString, 8);
            long jGxszxtbevo2 = gxszxtbevo.gxszxtbevo(uuidString, 9, 13, null, 4, null);
            wkgbmnqykc.wkgbmnqykc(uuidString, 13);
            long jGxszxtbevo3 = gxszxtbevo.gxszxtbevo(uuidString, 14, 18, null, 4, null);
            wkgbmnqykc.wkgbmnqykc(uuidString, 18);
            long jGxszxtbevo4 = gxszxtbevo.gxszxtbevo(uuidString, 19, 23, null, 4, null);
            wkgbmnqykc.wkgbmnqykc(uuidString, 23);
            return iobyxmoadg((jGxszxtbevo << 32) | (jGxszxtbevo2 << 16) | jGxszxtbevo3, gxszxtbevo.gxszxtbevo(uuidString, 24, 36, null, 4, null) | (jGxszxtbevo4 << 48));
        }

        public final zoijcleaow zoijcleaow() {
            return zoijcleaow.f72978iwizpuwonk;
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(long j13, long j14) {
        this.f72981zdlpuopuiu = j13;
        this.f72980yggfygwlhe = j14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wkgbmnqykc(zoijcleaow a13, zoijcleaow b13) {
        zdlpuopuiu.btonecajqb(a13, "a");
        zdlpuopuiu.btonecajqb(b13, "b");
        long j13 = a13.f72981zdlpuopuiu;
        return j13 != b13.f72981zdlpuopuiu ? Long.compareUnsigned(istkbnxepw.zoijcleaow(j13), istkbnxepw.zoijcleaow(b13.f72981zdlpuopuiu)) : Long.compareUnsigned(istkbnxepw.zoijcleaow(a13.f72980yggfygwlhe), istkbnxepw.zoijcleaow(b13.f72980yggfygwlhe));
    }

    private final Object writeReplace() {
        return ppxfxbqfkf.iobyxmoadg(this);
    }

    public final long dxjokdxxww() {
        return this.f72981zdlpuopuiu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f72981zdlpuopuiu == zoijcleaowVar.f72981zdlpuopuiu && this.f72980yggfygwlhe == zoijcleaowVar.f72980yggfygwlhe;
    }

    public int hashCode() {
        long j13 = this.f72981zdlpuopuiu ^ this.f72980yggfygwlhe;
        return ((int) j13) ^ ((int) (j13 >> 32));
    }

    public final long nufgyqmvbu() {
        return this.f72980yggfygwlhe;
    }

    public String toString() {
        byte[] bArr = new byte[36];
        wkgbmnqykc.eablkybsjg(this.f72980yggfygwlhe, bArr, 24, 6);
        bArr[23] = 45;
        wkgbmnqykc.eablkybsjg(this.f72980yggfygwlhe >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        wkgbmnqykc.eablkybsjg(this.f72981zdlpuopuiu, bArr, 14, 2);
        bArr[13] = 45;
        wkgbmnqykc.eablkybsjg(this.f72981zdlpuopuiu >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        wkgbmnqykc.eablkybsjg(this.f72981zdlpuopuiu >>> 32, bArr, 0, 4);
        return kcexrzcfyt.esjtqupxsv(bArr);
    }
}
