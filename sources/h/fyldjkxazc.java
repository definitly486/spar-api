package h;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class fyldjkxazc {
    private static final long eablkybsjg(g.lqeggnwhkg lqeggnwhkgVar) {
        float fDxjokdxxww = lqeggnwhkgVar.dxjokdxxww() - lqeggnwhkgVar.nufgyqmvbu();
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(lqeggnwhkgVar.eablkybsjg() - lqeggnwhkgVar.gtknphoqwx())) & 4294967295L) | (Float.floatToRawIntBits(fDxjokdxxww) << 32));
    }

    private static final long gxszxtbevo(g.dxjokdxxww dxjokdxxwwVar) {
        float fBtonecajqb = dxjokdxxwwVar.btonecajqb();
        float fWkgbmnqykc = dxjokdxxwwVar.wkgbmnqykc();
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(fBtonecajqb)) << 32) | (((long) Float.floatToRawIntBits(fWkgbmnqykc)) & 4294967295L));
    }

    public static final void iobyxmoadg(j.gxszxtbevo gxszxtbevoVar, ageimvtcrz ageimvtcrzVar, jztzpxfvev jztzpxfvevVar, float f13, j.lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13) {
        mhtqkkgtqm mhtqkkgtqmVarZoijcleaow;
        if (ageimvtcrzVar instanceof ageimvtcrz.zoijcleaow) {
            g.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((ageimvtcrz.zoijcleaow) ageimvtcrzVar).zoijcleaow();
            gxszxtbevoVar.fyldjkxazc(jztzpxfvevVar, lqeggnwhkg(lqeggnwhkgVarZoijcleaow), eablkybsjg(lqeggnwhkgVarZoijcleaow), f13, lqeggnwhkgVar, wkgbmnqykcVar, i13);
            return;
        }
        if (ageimvtcrzVar instanceof ageimvtcrz.ppxfxbqfkf) {
            ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar = (ageimvtcrz.ppxfxbqfkf) ageimvtcrzVar;
            mhtqkkgtqmVarZoijcleaow = ppxfxbqfkfVar.ppxfxbqfkf();
            if (mhtqkkgtqmVarZoijcleaow == null) {
                g.dxjokdxxww dxjokdxxwwVarZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.zoijcleaow() >> 32));
                gxszxtbevoVar.D(jztzpxfvevVar, nufgyqmvbu(dxjokdxxwwVarZoijcleaow), gxszxtbevo(dxjokdxxwwVarZoijcleaow), g.iobyxmoadg.zoijcleaow((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), f13, lqeggnwhkgVar, wkgbmnqykcVar, i13);
                return;
            }
        } else {
            if (!(ageimvtcrzVar instanceof ageimvtcrz.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            mhtqkkgtqmVarZoijcleaow = ((ageimvtcrz.iobyxmoadg) ageimvtcrzVar).zoijcleaow();
        }
        gxszxtbevoVar.kegysxyocb(mhtqkkgtqmVarZoijcleaow, jztzpxfvevVar, f13, lqeggnwhkgVar, wkgbmnqykcVar, i13);
    }

    private static final long lqeggnwhkg(g.lqeggnwhkg lqeggnwhkgVar) {
        float fNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu();
        float fGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fNufgyqmvbu)) << 32) | (((long) Float.floatToRawIntBits(fGtknphoqwx)) & 4294967295L));
    }

    private static final long nufgyqmvbu(g.dxjokdxxww dxjokdxxwwVar) {
        float fEablkybsjg = dxjokdxxwwVar.eablkybsjg();
        float fLqeggnwhkg = dxjokdxxwwVar.lqeggnwhkg();
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fEablkybsjg)) << 32) | (((long) Float.floatToRawIntBits(fLqeggnwhkg)) & 4294967295L));
    }

    public static final void ppxfxbqfkf(j.gxszxtbevo gxszxtbevoVar, ageimvtcrz ageimvtcrzVar, long j13, float f13, j.lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13) {
        mhtqkkgtqm mhtqkkgtqmVarZoijcleaow;
        if (ageimvtcrzVar instanceof ageimvtcrz.zoijcleaow) {
            g.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((ageimvtcrz.zoijcleaow) ageimvtcrzVar).zoijcleaow();
            gxszxtbevoVar.O(j13, lqeggnwhkg(lqeggnwhkgVarZoijcleaow), eablkybsjg(lqeggnwhkgVarZoijcleaow), f13, lqeggnwhkgVar, wkgbmnqykcVar, i13);
            return;
        }
        if (ageimvtcrzVar instanceof ageimvtcrz.ppxfxbqfkf) {
            ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar = (ageimvtcrz.ppxfxbqfkf) ageimvtcrzVar;
            mhtqkkgtqmVarZoijcleaow = ppxfxbqfkfVar.ppxfxbqfkf();
            if (mhtqkkgtqmVarZoijcleaow == null) {
                g.dxjokdxxww dxjokdxxwwVarZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.zoijcleaow() >> 32));
                gxszxtbevoVar.roivzttewh(j13, nufgyqmvbu(dxjokdxxwwVarZoijcleaow), gxszxtbevo(dxjokdxxwwVarZoijcleaow), g.iobyxmoadg.zoijcleaow((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), lqeggnwhkgVar, f13, wkgbmnqykcVar, i13);
                return;
            }
        } else {
            if (!(ageimvtcrzVar instanceof ageimvtcrz.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            mhtqkkgtqmVarZoijcleaow = ((ageimvtcrz.iobyxmoadg) ageimvtcrzVar).zoijcleaow();
        }
        gxszxtbevoVar.g(mhtqkkgtqmVarZoijcleaow, j13, f13, lqeggnwhkgVar, wkgbmnqykcVar, i13);
    }

    public static /* synthetic */ void zoijcleaow(j.gxszxtbevo gxszxtbevoVar, ageimvtcrz ageimvtcrzVar, jztzpxfvev jztzpxfvevVar, float f13, j.lqeggnwhkg lqeggnwhkgVar, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        if ((i14 & 8) != 0) {
            lqeggnwhkgVar = j.btonecajqb.f50092iobyxmoadg;
        }
        j.lqeggnwhkg lqeggnwhkgVar2 = lqeggnwhkgVar;
        if ((i14 & 16) != 0) {
            wkgbmnqykcVar = null;
        }
        androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i14 & 32) != 0) {
            i13 = j.gxszxtbevo.f50103lqeggnwhkg.iobyxmoadg();
        }
        iobyxmoadg(gxszxtbevoVar, ageimvtcrzVar, jztzpxfvevVar, f14, lqeggnwhkgVar2, wkgbmnqykcVar2, i13);
    }
}
