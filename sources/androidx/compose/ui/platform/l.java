package androidx.compose.ui.platform;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    private static final boolean eablkybsjg(g.lqeggnwhkg lqeggnwhkgVar, float f13, float f14) {
        return lqeggnwhkgVar.nufgyqmvbu() <= f13 && f13 < lqeggnwhkgVar.dxjokdxxww() && lqeggnwhkgVar.gtknphoqwx() <= f14 && f14 < lqeggnwhkgVar.eablkybsjg();
    }

    private static final boolean gxszxtbevo(h.ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar, float f13, float f14, h.mhtqkkgtqm mhtqkkgtqmVar, h.mhtqkkgtqm mhtqkkgtqmVar2) {
        g.dxjokdxxww dxjokdxxwwVarZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        if (f13 < dxjokdxxwwVarZoijcleaow.eablkybsjg() || f13 >= dxjokdxxwwVarZoijcleaow.gxszxtbevo() || f14 < dxjokdxxwwVarZoijcleaow.lqeggnwhkg() || f14 >= dxjokdxxwwVarZoijcleaow.iobyxmoadg()) {
            return false;
        }
        if (!iobyxmoadg(dxjokdxxwwVarZoijcleaow)) {
            h.mhtqkkgtqm mhtqkkgtqmVarIobyxmoadg = mhtqkkgtqmVar2 == null ? h.ntlheqmsrt.iobyxmoadg() : mhtqkkgtqmVar2;
            h.mhtqkkgtqm.zdlpuopuiu(mhtqkkgtqmVarIobyxmoadg, dxjokdxxwwVarZoijcleaow, null, 2, null);
            return wkgbmnqykc(mhtqkkgtqmVarIobyxmoadg, f13, f14, mhtqkkgtqmVar, mhtqkkgtqmVar2);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.nufgyqmvbu() >> 32)) + dxjokdxxwwVarZoijcleaow.eablkybsjg();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.nufgyqmvbu() & 4294967295L)) + dxjokdxxwwVarZoijcleaow.lqeggnwhkg();
        float fGxszxtbevo = dxjokdxxwwVarZoijcleaow.gxszxtbevo() - Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.dxjokdxxww() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.dxjokdxxww() & 4294967295L)) + dxjokdxxwwVarZoijcleaow.lqeggnwhkg();
        float fGxszxtbevo2 = dxjokdxxwwVarZoijcleaow.gxszxtbevo() - Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.ppxfxbqfkf() >> 32));
        float fIobyxmoadg = dxjokdxxwwVarZoijcleaow.iobyxmoadg() - Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.ppxfxbqfkf() & 4294967295L));
        float fIobyxmoadg2 = dxjokdxxwwVarZoijcleaow.iobyxmoadg() - Float.intBitsToFloat((int) (4294967295L & dxjokdxxwwVarZoijcleaow.zoijcleaow()));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (dxjokdxxwwVarZoijcleaow.zoijcleaow() >> 32)) + dxjokdxxwwVarZoijcleaow.eablkybsjg();
        if (f13 < fIntBitsToFloat && f14 < fIntBitsToFloat2) {
            return lqeggnwhkg(f13, f14, dxjokdxxwwVarZoijcleaow.nufgyqmvbu(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        if (f13 < fIntBitsToFloat4 && f14 > fIobyxmoadg2) {
            return lqeggnwhkg(f13, f14, dxjokdxxwwVarZoijcleaow.zoijcleaow(), fIntBitsToFloat4, fIobyxmoadg2);
        }
        if (f13 > fGxszxtbevo && f14 < fIntBitsToFloat3) {
            return lqeggnwhkg(f13, f14, dxjokdxxwwVarZoijcleaow.dxjokdxxww(), fGxszxtbevo, fIntBitsToFloat3);
        }
        if (f13 <= fGxszxtbevo2 || f14 <= fIobyxmoadg) {
            return true;
        }
        return lqeggnwhkg(f13, f14, dxjokdxxwwVarZoijcleaow.ppxfxbqfkf(), fGxszxtbevo2, fIobyxmoadg);
    }

    private static final boolean iobyxmoadg(g.dxjokdxxww dxjokdxxwwVar) {
        return Float.intBitsToFloat((int) (dxjokdxxwwVar.nufgyqmvbu() >> 32)) + Float.intBitsToFloat((int) (dxjokdxxwwVar.dxjokdxxww() >> 32)) <= dxjokdxxwwVar.btonecajqb() && Float.intBitsToFloat((int) (dxjokdxxwwVar.zoijcleaow() >> 32)) + Float.intBitsToFloat((int) (dxjokdxxwwVar.ppxfxbqfkf() >> 32)) <= dxjokdxxwwVar.btonecajqb() && Float.intBitsToFloat((int) (dxjokdxxwwVar.nufgyqmvbu() & 4294967295L)) + Float.intBitsToFloat((int) (dxjokdxxwwVar.zoijcleaow() & 4294967295L)) <= dxjokdxxwwVar.wkgbmnqykc() && Float.intBitsToFloat((int) (dxjokdxxwwVar.dxjokdxxww() & 4294967295L)) + Float.intBitsToFloat((int) (dxjokdxxwwVar.ppxfxbqfkf() & 4294967295L)) <= dxjokdxxwwVar.wkgbmnqykc();
    }

    private static final boolean lqeggnwhkg(float f13, float f14, long j13, float f15, float f16) {
        float f17 = f13 - f15;
        float f18 = f14 - f16;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        return ((f17 * f17) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f18 * f18) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    public static /* synthetic */ boolean ppxfxbqfkf(h.ageimvtcrz ageimvtcrzVar, float f13, float f14, h.mhtqkkgtqm mhtqkkgtqmVar, h.mhtqkkgtqm mhtqkkgtqmVar2, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            mhtqkkgtqmVar = null;
        }
        if ((i13 & 16) != 0) {
            mhtqkkgtqmVar2 = null;
        }
        return zoijcleaow(ageimvtcrzVar, f13, f14, mhtqkkgtqmVar, mhtqkkgtqmVar2);
    }

    private static final boolean wkgbmnqykc(h.mhtqkkgtqm mhtqkkgtqmVar, float f13, float f14, h.mhtqkkgtqm mhtqkkgtqmVar2, h.mhtqkkgtqm mhtqkkgtqmVar3) {
        g.lqeggnwhkg lqeggnwhkgVar = new g.lqeggnwhkg(f13 - 0.005f, f14 - 0.005f, f13 + 0.005f, f14 + 0.005f);
        if (mhtqkkgtqmVar2 == null) {
            mhtqkkgtqmVar2 = h.ntlheqmsrt.iobyxmoadg();
        }
        h.mhtqkkgtqm.rgvfuqvkyq(mhtqkkgtqmVar2, lqeggnwhkgVar, null, 2, null);
        if (mhtqkkgtqmVar3 == null) {
            mhtqkkgtqmVar3 = h.ntlheqmsrt.iobyxmoadg();
        }
        mhtqkkgtqmVar3.yggfygwlhe(mhtqkkgtqmVar, mhtqkkgtqmVar2, h.ezmngbhpjk.f38886iobyxmoadg.zoijcleaow());
        boolean zIsEmpty = mhtqkkgtqmVar3.isEmpty();
        mhtqkkgtqmVar3.zoijcleaow();
        mhtqkkgtqmVar2.zoijcleaow();
        return !zIsEmpty;
    }

    public static final boolean zoijcleaow(h.ageimvtcrz ageimvtcrzVar, float f13, float f14, h.mhtqkkgtqm mhtqkkgtqmVar, h.mhtqkkgtqm mhtqkkgtqmVar2) {
        if (ageimvtcrzVar instanceof h.ageimvtcrz.zoijcleaow) {
            return eablkybsjg(((h.ageimvtcrz.zoijcleaow) ageimvtcrzVar).zoijcleaow(), f13, f14);
        }
        if (ageimvtcrzVar instanceof h.ageimvtcrz.ppxfxbqfkf) {
            return gxszxtbevo((h.ageimvtcrz.ppxfxbqfkf) ageimvtcrzVar, f13, f14, mhtqkkgtqmVar, mhtqkkgtqmVar2);
        }
        if (ageimvtcrzVar instanceof h.ageimvtcrz.iobyxmoadg) {
            return wkgbmnqykc(((h.ageimvtcrz.iobyxmoadg) ageimvtcrzVar).zoijcleaow(), f13, f14, mhtqkkgtqmVar, mhtqkkgtqmVar2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
