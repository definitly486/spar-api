package zp0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jlmebxxoox {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i16) {
        zoijcleaow(wkgbmnqykcVar, i13, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1660276507);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i14 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i14;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        if ((i16 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = i17 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1660276507, i16, -1, "ru.myspar.proloyalty.catalog.impl.search.compose.SearchStubText (SearchStubText.kt:15)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar4, 0.0f, 1, null);
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(i13, draadjrbmkVarBtonecajqb, (i16 >> 3) & 14);
            z zVar = z.f44180iobyxmoadg;
            int i18 = z.f44181zoijcleaow;
            n nVarIobyxmoadg = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).iobyxmoadg();
            wkgbmnqykcVar3 = wkgbmnqykcVar4;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(strPpxfxbqfkf, wkgbmnqykcVarNufgyqmvbu, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(v0.btonecajqb.f114934zoijcleaow.iobyxmoadg()), 0L, 0, false, 0, 0, null, nVarIobyxmoadg, draadjrbmkVar2, 0, 0, 65016);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zp0.crxdokpmqz
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return jlmebxxoox.ppxfxbqfkf(wkgbmnqykcVar3, i13, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
