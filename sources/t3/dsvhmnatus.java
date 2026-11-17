package t3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface dsvhmnatus {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f109383iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f109384ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f109385wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final byte[] f109386zoijcleaow;

        public iobyxmoadg(int i13, byte[] bArr, int i14, int i15) {
            this.f109383iobyxmoadg = i13;
            this.f109386zoijcleaow = bArr;
            this.f109384ppxfxbqfkf = i14;
            this.f109385wkgbmnqykc = i15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || iobyxmoadg.class != obj.getClass()) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f109383iobyxmoadg == iobyxmoadgVar.f109383iobyxmoadg && this.f109384ppxfxbqfkf == iobyxmoadgVar.f109384ppxfxbqfkf && this.f109385wkgbmnqykc == iobyxmoadgVar.f109385wkgbmnqykc && Arrays.equals(this.f109386zoijcleaow, iobyxmoadgVar.f109386zoijcleaow);
        }

        public int hashCode() {
            return (((((this.f109383iobyxmoadg * 31) + Arrays.hashCode(this.f109386zoijcleaow)) * 31) + this.f109384ppxfxbqfkf) * 31) + this.f109385wkgbmnqykc;
        }
    }

    default void eablkybsjg(long j13) {
    }

    default int gxszxtbevo(v2.btonecajqb btonecajqbVar, int i13, boolean z13) {
        return ppxfxbqfkf(btonecajqbVar, i13, z13, 0);
    }

    void iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    default void lqeggnwhkg(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        wkgbmnqykc(yadqdtsiqtVar, i13, 0);
    }

    int ppxfxbqfkf(v2.btonecajqb btonecajqbVar, int i13, boolean z13, int i14);

    void wkgbmnqykc(y2.yadqdtsiqt yadqdtsiqtVar, int i13, int i14);

    void zoijcleaow(long j13, int i13, int i14, int i15, iobyxmoadg iobyxmoadgVar);
}
