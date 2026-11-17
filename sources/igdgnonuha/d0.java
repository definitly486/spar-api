package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(rgvfuqvkyqVar, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1677843913);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 3) != 2, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1677843913, i14, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            rgvfuqvkyqVar.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf(i14 & 14));
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.c0
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return d0.ppxfxbqfkf(rgvfuqvkyqVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
