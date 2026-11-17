package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class lmojexxdyd {
    public static final a btonecajqb(tg.iobyxmoadg iobyxmoadgVar) {
        return new j1(iobyxmoadgVar);
    }

    public static final a dxjokdxxww(tg.draadjrbmk draadjrbmkVar) {
        return new hkdspvbjdz(draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(b[] bVarArr, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        wkgbmnqykc(bVarArr, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(b bVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        ppxfxbqfkf(bVar, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final a lqeggnwhkg(u0 u0Var, tg.iobyxmoadg iobyxmoadgVar) {
        return new sopmlzcsov(u0Var, iobyxmoadgVar);
    }

    public static /* synthetic */ a nufgyqmvbu(u0 u0Var, tg.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            u0Var = v0.rgvfuqvkyq();
        }
        return lqeggnwhkg(u0Var, iobyxmoadgVar);
    }

    public static final void ppxfxbqfkf(final b bVar, final tg.rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, final int i13) {
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-149765515);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-149765515, i13, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:387)");
        }
        draadjrbmkVarBtonecajqb.hcddaimhww(bVar);
        rgvfuqvkyqVar.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i13 >> 3) & 14));
        draadjrbmkVarBtonecajqb.iwizpuwonk();
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: androidx.compose.runtime.yadqdtsiqt
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lmojexxdyd.gxszxtbevo(bVar, rgvfuqvkyqVar, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void wkgbmnqykc(final b[] bVarArr, final tg.rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, final int i13) {
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(415205898);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(415205898, i13, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)");
        }
        draadjrbmkVarBtonecajqb.crxdokpmqz(bVarArr);
        rgvfuqvkyqVar.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i13 >> 3) & 14));
        draadjrbmkVarBtonecajqb.cllcsxoeiz();
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: androidx.compose.runtime.iozdgvuglv
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lmojexxdyd.eablkybsjg(bVarArr, rgvfuqvkyqVar, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
