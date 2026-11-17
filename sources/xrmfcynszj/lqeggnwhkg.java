package xrmfcynszj;

import gg.cqumvgiudr;
import java.util.List;
import jztzpxfvev.jlmebxxoox;
import sflfametgt.cdpycssgdh;
import sflfametgt.ikoacuggdj;
import sflfametgt.istkbnxepw;
import sflfametgt.sopmlzcsov;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg implements agtfadlqog {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj f123167iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ sopmlzcsov f123168ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f123169zoijcleaow;

        iobyxmoadg(ikoacuggdj ikoacuggdjVar, tg.vdvldrhtss vdvldrhtssVar, sopmlzcsov sopmlzcsovVar) {
            this.f123167iobyxmoadg = ikoacuggdjVar;
            this.f123169zoijcleaow = vdvldrhtssVar;
            this.f123168ppxfxbqfkf = sopmlzcsovVar;
        }

        private final gg.vdvldrhtss eablkybsjg(ojitshcjhn ojitshcjhnVar, float f13) {
            float f14;
            List listNufgyqmvbu = ppxfxbqfkf().nufgyqmvbu();
            ikoacuggdj ikoacuggdjVar = this.f123167iobyxmoadg;
            int size = listNufgyqmvbu.size();
            int i13 = 0;
            float f15 = Float.NEGATIVE_INFINITY;
            float f16 = Float.POSITIVE_INFINITY;
            while (true) {
                f14 = 0.0f;
                if (i13 >= size) {
                    break;
                }
                sflfametgt.agtfadlqog agtfadlqogVar = (sflfametgt.agtfadlqog) listNufgyqmvbu.get(i13);
                float fIobyxmoadg = rgvfuqvkyq.iobyxmoadg(cdpycssgdh.iobyxmoadg(ppxfxbqfkf()), ppxfxbqfkf().wkgbmnqykc(), ppxfxbqfkf().zoijcleaow(), ppxfxbqfkf().lqeggnwhkg(), agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.getIndex(), ojitshcjhnVar, ikoacuggdjVar.pkzmftpjix());
                if (fIobyxmoadg <= 0.0f && fIobyxmoadg > f15) {
                    f15 = fIobyxmoadg;
                }
                if (fIobyxmoadg >= 0.0f && fIobyxmoadg < f16) {
                    f16 = fIobyxmoadg;
                }
                i13++;
            }
            if (f15 == Float.NEGATIVE_INFINITY) {
                f15 = f16;
            }
            if (f16 == Float.POSITIVE_INFINITY) {
                f16 = f15;
            }
            if (!this.f123167iobyxmoadg.eablkybsjg()) {
                if (lqeggnwhkg.eablkybsjg(this.f123167iobyxmoadg, f13)) {
                    f15 = 0.0f;
                    f16 = 0.0f;
                } else {
                    f16 = 0.0f;
                }
            }
            if (this.f123167iobyxmoadg.ppxfxbqfkf()) {
                f14 = f15;
            } else if (!lqeggnwhkg.eablkybsjg(this.f123167iobyxmoadg, f13)) {
                f16 = 0.0f;
            }
            return cqumvgiudr.iobyxmoadg(Float.valueOf(f14), Float.valueOf(f16));
        }

        @Override // xrmfcynszj.agtfadlqog
        public float iobyxmoadg(float f13) {
            gg.vdvldrhtss vdvldrhtssVarEablkybsjg = eablkybsjg(this.f123167iobyxmoadg.yadqdtsiqt().gtknphoqwx(), f13);
            float fFloatValue = ((Number) vdvldrhtssVarEablkybsjg.iobyxmoadg()).floatValue();
            float fFloatValue2 = ((Number) vdvldrhtssVarEablkybsjg.wkgbmnqykc()).floatValue();
            float fFloatValue3 = ((Number) this.f123169zoijcleaow.invoke(Float.valueOf(f13), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
            if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                rlfsiqarku.eablkybsjg.ppxfxbqfkf("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
            }
            if (wkgbmnqykc(fFloatValue3)) {
                return fFloatValue3;
            }
            return 0.0f;
        }

        public final istkbnxepw ppxfxbqfkf() {
            return this.f123167iobyxmoadg.yadqdtsiqt();
        }

        public final boolean wkgbmnqykc(float f13) {
            return (f13 == Float.POSITIVE_INFINITY || f13 == Float.NEGATIVE_INFINITY) ? false : true;
        }

        @Override // xrmfcynszj.agtfadlqog
        public float zoijcleaow(float f13, float f14) {
            int iHcddaimhww = this.f123167iobyxmoadg.hcddaimhww() + this.f123167iobyxmoadg.hkdspvbjdz();
            if (iHcddaimhww == 0) {
                return 0.0f;
            }
            int iPmvmpeiblj = f13 < 0.0f ? this.f123167iobyxmoadg.pmvmpeiblj() + 1 : this.f123167iobyxmoadg.pmvmpeiblj();
            int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(Math.abs((zg.gtknphoqwx.agtfadlqog(this.f123168ppxfxbqfkf.iobyxmoadg(iPmvmpeiblj, zg.gtknphoqwx.agtfadlqog(((int) (f14 / iHcddaimhww)) + iPmvmpeiblj, 0, this.f123167iobyxmoadg.pkzmftpjix()), f13, this.f123167iobyxmoadg.hcddaimhww(), this.f123167iobyxmoadg.hkdspvbjdz()), 0, this.f123167iobyxmoadg.pkzmftpjix()) - iPmvmpeiblj) * iHcddaimhww) - iHcddaimhww, 0);
            if (iGxszxtbevo == 0) {
                return iGxszxtbevo;
            }
            return Math.signum(f13) * iGxszxtbevo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eablkybsjg(ikoacuggdj ikoacuggdjVar, float f13) {
        boolean zGxszxtbevo = ikoacuggdjVar.yadqdtsiqt().gxszxtbevo();
        boolean z13 = (ikoacuggdjVar.jlmebxxoox() ? -f13 : wkgbmnqykc(ikoacuggdjVar)) > 0.0f;
        return (z13 && zGxszxtbevo) || !(z13 || zGxszxtbevo);
    }

    public static final agtfadlqog iobyxmoadg(ikoacuggdj ikoacuggdjVar, sopmlzcsov sopmlzcsovVar, tg.vdvldrhtss vdvldrhtssVar) {
        return new iobyxmoadg(ikoacuggdjVar, vdvldrhtssVar, sopmlzcsovVar);
    }

    public static final float ppxfxbqfkf(ikoacuggdj ikoacuggdjVar, zdlpuopuiu zdlpuopuiuVar, float f13, float f14, float f15, float f16) {
        boolean zEablkybsjg = eablkybsjg(ikoacuggdjVar, f14);
        if (ikoacuggdjVar.yadqdtsiqt().getOrientation() != jlmebxxoox.Vertical && zdlpuopuiuVar != zdlpuopuiu.Ltr) {
            zEablkybsjg = !zEablkybsjg;
        }
        int iLqeggnwhkg = ikoacuggdjVar.yadqdtsiqt().lqeggnwhkg();
        float fWkgbmnqykc = iLqeggnwhkg == 0 ? 0.0f : wkgbmnqykc(ikoacuggdjVar) / iLqeggnwhkg;
        float f17 = fWkgbmnqykc - ((int) fWkgbmnqykc);
        int iZoijcleaow = gxszxtbevo.zoijcleaow(ikoacuggdjVar.lereixgezr(), f14);
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f123206iobyxmoadg;
        if (wkgbmnqykc.eablkybsjg(iZoijcleaow, iobyxmoadgVar.iobyxmoadg())) {
            if (Math.abs(f17) > f13) {
                if (!zEablkybsjg) {
                    return f15;
                }
            } else if (Math.abs(fWkgbmnqykc) >= Math.abs(ikoacuggdjVar.wypolnanlu())) {
                if (zEablkybsjg) {
                    return f15;
                }
            } else if (Math.abs(f15) < Math.abs(f16)) {
                return f15;
            }
        } else if (!wkgbmnqykc.eablkybsjg(iZoijcleaow, iobyxmoadgVar.zoijcleaow())) {
            if (wkgbmnqykc.eablkybsjg(iZoijcleaow, iobyxmoadgVar.ppxfxbqfkf())) {
                return f15;
            }
            return 0.0f;
        }
        return f16;
    }

    private static final float wkgbmnqykc(ikoacuggdj ikoacuggdjVar) {
        return ikoacuggdjVar.yadqdtsiqt().getOrientation() == jlmebxxoox.Horizontal ? Float.intBitsToFloat((int) (ikoacuggdjVar.sopmlzcsov() >> 32)) : Float.intBitsToFloat((int) (ikoacuggdjVar.sopmlzcsov() & 4294967295L));
    }
}
