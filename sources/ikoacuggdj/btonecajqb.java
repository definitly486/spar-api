package ikoacuggdj;

import androidx.compose.foundation.BorderModifierNodeElement;
import h.e;
import h.ezmngbhpjk;
import h.f;
import h.mhtqkkgtqm;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e.nufgyqmvbu agtfadlqog(e.wkgbmnqykc wkgbmnqykcVar, final h.jztzpxfvev jztzpxfvevVar, long j13, long j14, boolean z13, float f13) {
        final long jPpxfxbqfkf = z13 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j13;
        final long jZoijcleaow = z13 ? wkgbmnqykcVar.zoijcleaow() : j14;
        final j.lqeggnwhkg gtknphoqwxVar = z13 ? j.btonecajqb.f50092iobyxmoadg : new j.gtknphoqwx(f13, 0.0f, 0, 0, null, 30, null);
        return wkgbmnqykcVar.lqeggnwhkg(new tg.draadjrbmk() { // from class: ikoacuggdj.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return btonecajqb.ojitshcjhn(jztzpxfvevVar, jPpxfxbqfkf, jZoijcleaow, gtknphoqwxVar, (j.ppxfxbqfkf) obj);
            }
        });
    }

    private static final g.dxjokdxxww btonecajqb(float f13, g.dxjokdxxww dxjokdxxwwVar) {
        return new g.dxjokdxxww(f13, f13, dxjokdxxwwVar.btonecajqb() - f13, dxjokdxxwwVar.wkgbmnqykc() - f13, rgvfuqvkyq(dxjokdxxwwVar.nufgyqmvbu(), f13), rgvfuqvkyq(dxjokdxxwwVar.dxjokdxxww(), f13), rgvfuqvkyq(dxjokdxxwwVar.ppxfxbqfkf(), f13), rgvfuqvkyq(dxjokdxxwwVar.zoijcleaow(), f13), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.nufgyqmvbu draadjrbmk(e.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.lqeggnwhkg(new tg.draadjrbmk() { // from class: ikoacuggdj.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return btonecajqb.wflxmlrfwp((j.ppxfxbqfkf) obj);
            }
        });
    }

    public static final androidx.compose.ui.wkgbmnqykc dxjokdxxww(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, h.jztzpxfvev jztzpxfvevVar, e eVar) {
        return wkgbmnqykcVar.eablkybsjg(new BorderModifierNodeElement(f13, jztzpxfvevVar, eVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mhtqkkgtqm gtknphoqwx(mhtqkkgtqm mhtqkkgtqmVar, g.dxjokdxxww dxjokdxxwwVar, float f13, boolean z13) {
        mhtqkkgtqmVar.zoijcleaow();
        mhtqkkgtqm.zdlpuopuiu(mhtqkkgtqmVar, dxjokdxxwwVar, null, 2, null);
        if (!z13) {
            mhtqkkgtqm mhtqkkgtqmVarIobyxmoadg = h.ntlheqmsrt.iobyxmoadg();
            mhtqkkgtqm.zdlpuopuiu(mhtqkkgtqmVarIobyxmoadg, btonecajqb(f13, dxjokdxxwwVar), null, 2, null);
            mhtqkkgtqmVar.yggfygwlhe(mhtqkkgtqmVar, mhtqkkgtqmVarIobyxmoadg, ezmngbhpjk.f38886iobyxmoadg.iobyxmoadg());
        }
        return mhtqkkgtqmVar;
    }

    public static final androidx.compose.ui.wkgbmnqykc lqeggnwhkg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, vdvldrhtss vdvldrhtssVar, e eVar) {
        return dxjokdxxww(wkgbmnqykcVar, vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.iobyxmoadg(), eVar);
    }

    public static final androidx.compose.ui.wkgbmnqykc nufgyqmvbu(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, long j13, e eVar) {
        return dxjokdxxww(wkgbmnqykcVar, f13, new f(j13, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(h.jztzpxfvev jztzpxfvevVar, long j13, long j14, j.lqeggnwhkg lqeggnwhkgVar, j.ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkfVar.b0();
        j.gxszxtbevo.a(ppxfxbqfkfVar, jztzpxfvevVar, j13, j14, 0.0f, lqeggnwhkgVar, null, 0, 104, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rgvfuqvkyq(long j13, float f13) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j13 >> 32)) - f13);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j13 & 4294967295L)) - f13);
        return g.iobyxmoadg.zoijcleaow((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(j.ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkfVar.b0();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
