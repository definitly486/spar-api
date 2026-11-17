package v2;

import java.util.Arrays;
import java.util.List;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class wwaezpbzkn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.common.collect.zdlpuopuiu f115692iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final wwaezpbzkn f115691zoijcleaow = new wwaezpbzkn(com.google.common.collect.zdlpuopuiu.zynmafqrjb());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f115690ppxfxbqfkf = stevsuqkhv.uawqvzlxes(0);

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean[] f115697eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f115698iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f115699ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int[] f115700wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final yadqdtsiqt f115701zoijcleaow;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final String f115694gxszxtbevo = stevsuqkhv.uawqvzlxes(0);

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private static final String f115695lqeggnwhkg = stevsuqkhv.uawqvzlxes(1);

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private static final String f115696nufgyqmvbu = stevsuqkhv.uawqvzlxes(3);

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private static final String f115693dxjokdxxww = stevsuqkhv.uawqvzlxes(4);

        public iobyxmoadg(yadqdtsiqt yadqdtsiqtVar, boolean z13, int[] iArr, boolean[] zArr) {
            int i13 = yadqdtsiqtVar.f115705iobyxmoadg;
            this.f115698iobyxmoadg = i13;
            boolean z14 = false;
            y2.iobyxmoadg.iobyxmoadg(i13 == iArr.length && i13 == zArr.length);
            this.f115701zoijcleaow = yadqdtsiqtVar;
            if (z13 && i13 > 1) {
                z14 = true;
            }
            this.f115699ppxfxbqfkf = z14;
            this.f115700wkgbmnqykc = (int[]) iArr.clone();
            this.f115697eablkybsjg = (boolean[]) zArr.clone();
        }

        public boolean dxjokdxxww(int i13, boolean z13) {
            int i14 = this.f115700wkgbmnqykc[i13];
            return i14 == 4 || (z13 && i14 == 3);
        }

        public boolean eablkybsjg() {
            return com.google.common.primitives.iobyxmoadg.iobyxmoadg(this.f115697eablkybsjg, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || iobyxmoadg.class != obj.getClass()) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f115699ppxfxbqfkf == iobyxmoadgVar.f115699ppxfxbqfkf && this.f115701zoijcleaow.equals(iobyxmoadgVar.f115701zoijcleaow) && Arrays.equals(this.f115700wkgbmnqykc, iobyxmoadgVar.f115700wkgbmnqykc) && Arrays.equals(this.f115697eablkybsjg, iobyxmoadgVar.f115697eablkybsjg);
        }

        public boolean gxszxtbevo(boolean z13) {
            for (int i13 = 0; i13 < this.f115700wkgbmnqykc.length; i13++) {
                if (dxjokdxxww(i13, z13)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f115701zoijcleaow.hashCode() * 31) + (this.f115699ppxfxbqfkf ? 1 : 0)) * 31) + Arrays.hashCode(this.f115700wkgbmnqykc)) * 31) + Arrays.hashCode(this.f115697eablkybsjg);
        }

        public yadqdtsiqt iobyxmoadg() {
            return this.f115701zoijcleaow;
        }

        public boolean lqeggnwhkg(int i13) {
            return this.f115697eablkybsjg[i13];
        }

        public boolean nufgyqmvbu(int i13) {
            return dxjokdxxww(i13, false);
        }

        public int ppxfxbqfkf() {
            return this.f115701zoijcleaow.f115706ppxfxbqfkf;
        }

        public boolean wkgbmnqykc() {
            return this.f115699ppxfxbqfkf;
        }

        public androidx.media3.common.iobyxmoadg zoijcleaow(int i13) {
            return this.f115701zoijcleaow.iobyxmoadg(i13);
        }
    }

    public wwaezpbzkn(List list) {
        this.f115692iobyxmoadg = com.google.common.collect.zdlpuopuiu.jyumaefscl(list);
    }

    public boolean eablkybsjg(int i13, boolean z13) {
        for (int i14 = 0; i14 < this.f115692iobyxmoadg.size(); i14++) {
            if (((iobyxmoadg) this.f115692iobyxmoadg.get(i14)).ppxfxbqfkf() == i13 && ((iobyxmoadg) this.f115692iobyxmoadg.get(i14)).gxszxtbevo(z13)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wwaezpbzkn.class != obj.getClass()) {
            return false;
        }
        return this.f115692iobyxmoadg.equals(((wwaezpbzkn) obj).f115692iobyxmoadg);
    }

    public int hashCode() {
        return this.f115692iobyxmoadg.hashCode();
    }

    public com.google.common.collect.zdlpuopuiu iobyxmoadg() {
        return this.f115692iobyxmoadg;
    }

    public boolean ppxfxbqfkf(int i13) {
        for (int i14 = 0; i14 < this.f115692iobyxmoadg.size(); i14++) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f115692iobyxmoadg.get(i14);
            if (iobyxmoadgVar.eablkybsjg() && iobyxmoadgVar.ppxfxbqfkf() == i13) {
                return true;
            }
        }
        return false;
    }

    public boolean wkgbmnqykc(int i13) {
        return eablkybsjg(i13, false);
    }

    public boolean zoijcleaow() {
        return this.f115692iobyxmoadg.isEmpty();
    }
}
