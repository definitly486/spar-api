package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final skhdrjzrfn.i eablkybsjg(wypolnanlu wypolnanluVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-721696685, i13, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long jBtonecajqb = wypolnanluVar.btonecajqb();
        long jPpxfxbqfkf = wypolnanluVar.ppxfxbqfkf();
        draadjrbmkVar.sopmlzcsov(-2060761573);
        long jPpxfxbqfkf2 = kegysxyocb.ppxfxbqfkf(wypolnanluVar, jPpxfxbqfkf);
        if (jPpxfxbqfkf2 == 16) {
            jPpxfxbqfkf2 = ((h.oipsdeybqn) draadjrbmkVar.ojitshcjhn(jlmebxxoox.iobyxmoadg())).iwizpuwonk();
        }
        long j13 = jPpxfxbqfkf2;
        draadjrbmkVar.stevsuqkhv();
        long jWflxmlrfwp = h.oipsdeybqn.wflxmlrfwp(j13, ulzqkzuiru.f43940iobyxmoadg.wkgbmnqykc(draadjrbmkVar, 6), 0.0f, 0.0f, 0.0f, 14, null);
        boolean zWkgbmnqykc = draadjrbmkVar.wkgbmnqykc(jBtonecajqb) | draadjrbmkVar.wkgbmnqykc(jPpxfxbqfkf) | draadjrbmkVar.wkgbmnqykc(jWflxmlrfwp);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zWkgbmnqykc || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new skhdrjzrfn.i(wypolnanluVar.btonecajqb(), wkgbmnqykc(jBtonecajqb, jWflxmlrfwp, jPpxfxbqfkf), null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        skhdrjzrfn.i iVar = (skhdrjzrfn.i) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return iVar;
    }

    private static final float iobyxmoadg(long j13, long j14, long j15) {
        float f13 = 0.2f;
        float f14 = 0.4f;
        float f15 = 0.4f;
        for (int i13 = 0; i13 < 7; i13++) {
            float fPpxfxbqfkf = (ppxfxbqfkf(j13, f14, j14, j15) / 4.5f) - 1.0f;
            if (0.0f <= fPpxfxbqfkf && fPpxfxbqfkf <= 0.01f) {
                break;
            }
            if (fPpxfxbqfkf < 0.0f) {
                f15 = f14;
            } else {
                f13 = f14;
            }
            f14 = (f15 + f13) / 2.0f;
        }
        return f14;
    }

    private static final float ppxfxbqfkf(long j13, float f13, long j14, long j15) {
        long jEablkybsjg = h.bfopjjpdmp.eablkybsjg(h.oipsdeybqn.wflxmlrfwp(j13, f13, 0.0f, 0.0f, 0.0f, 14, null), j15);
        return zoijcleaow(h.bfopjjpdmp.eablkybsjg(j14, jEablkybsjg), jEablkybsjg);
    }

    public static final long wkgbmnqykc(long j13, long j14, long j15) {
        float fIobyxmoadg;
        float fPpxfxbqfkf = ppxfxbqfkf(j13, 0.4f, j14, j15);
        float fPpxfxbqfkf2 = ppxfxbqfkf(j13, 0.2f, j14, j15);
        if (fPpxfxbqfkf >= 4.5f) {
            fIobyxmoadg = 0.4f;
        } else {
            fIobyxmoadg = fPpxfxbqfkf2 < 4.5f ? 0.2f : iobyxmoadg(j13, j14, j15);
        }
        return h.oipsdeybqn.wflxmlrfwp(j13, fIobyxmoadg, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final float zoijcleaow(long j13, long j14) {
        float fLqeggnwhkg = h.bfopjjpdmp.lqeggnwhkg(j13) + 0.05f;
        float fLqeggnwhkg2 = h.bfopjjpdmp.lqeggnwhkg(j14) + 0.05f;
        return Math.max(fLqeggnwhkg, fLqeggnwhkg2) / Math.min(fLqeggnwhkg, fLqeggnwhkg2);
    }
}
