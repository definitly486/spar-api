package j;

import h.lxfrhoxuzk;
import h.metgxyhuhe;
import h.mhtqkkgtqm;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f50118iobyxmoadg;

        iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            this.f50118iobyxmoadg = wkgbmnqykcVar;
        }

        public long btonecajqb() {
            return this.f50118iobyxmoadg.zoijcleaow();
        }

        @Override // j.nufgyqmvbu
        public void dxjokdxxww(float f13, float f14, float f15, float f16) {
            metgxyhuhe metgxyhuheVarGxszxtbevo = this.f50118iobyxmoadg.gxszxtbevo();
            wkgbmnqykc wkgbmnqykcVar = this.f50118iobyxmoadg;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (btonecajqb() >> 32)) - (f15 + f13);
            long jWkgbmnqykc = g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (btonecajqb() & 4294967295L)) - (f16 + f14))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
            if (!(Float.intBitsToFloat((int) (jWkgbmnqykc >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jWkgbmnqykc & 4294967295L)) >= 0.0f)) {
                lxfrhoxuzk.iobyxmoadg("Width and height must be greater than or equal to zero");
            }
            wkgbmnqykcVar.nufgyqmvbu(jWkgbmnqykc);
            metgxyhuheVarGxszxtbevo.wkgbmnqykc(f13, f14);
        }

        @Override // j.nufgyqmvbu
        public void gxszxtbevo(float f13, float f14, long j13) {
            metgxyhuhe metgxyhuheVarGxszxtbevo = this.f50118iobyxmoadg.gxszxtbevo();
            int i13 = (int) (j13 >> 32);
            int i14 = (int) (j13 & 4294967295L);
            metgxyhuheVarGxszxtbevo.wkgbmnqykc(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
            metgxyhuheVarGxszxtbevo.eablkybsjg(f13, f14);
            metgxyhuheVarGxszxtbevo.wkgbmnqykc(-Float.intBitsToFloat(i13), -Float.intBitsToFloat(i14));
        }

        @Override // j.nufgyqmvbu
        public void iobyxmoadg(float[] fArr) {
            this.f50118iobyxmoadg.gxszxtbevo().cqumvgiudr(fArr);
        }

        @Override // j.nufgyqmvbu
        public void lqeggnwhkg(float f13, long j13) {
            metgxyhuhe metgxyhuheVarGxszxtbevo = this.f50118iobyxmoadg.gxszxtbevo();
            int i13 = (int) (j13 >> 32);
            int i14 = (int) (j13 & 4294967295L);
            metgxyhuheVarGxszxtbevo.wkgbmnqykc(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
            metgxyhuheVarGxszxtbevo.zdlpuopuiu(f13);
            metgxyhuheVarGxszxtbevo.wkgbmnqykc(-Float.intBitsToFloat(i13), -Float.intBitsToFloat(i14));
        }

        @Override // j.nufgyqmvbu
        public void ppxfxbqfkf(float f13, float f14, float f15, float f16, int i13) {
            this.f50118iobyxmoadg.gxszxtbevo().ppxfxbqfkf(f13, f14, f15, f16, i13);
        }

        @Override // j.nufgyqmvbu
        public void wkgbmnqykc(float f13, float f14) {
            this.f50118iobyxmoadg.gxszxtbevo().wkgbmnqykc(f13, f14);
        }

        @Override // j.nufgyqmvbu
        public void zoijcleaow(mhtqkkgtqm mhtqkkgtqmVar, int i13) {
            this.f50118iobyxmoadg.gxszxtbevo().zoijcleaow(mhtqkkgtqmVar, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        return new iobyxmoadg(wkgbmnqykcVar);
    }
}
