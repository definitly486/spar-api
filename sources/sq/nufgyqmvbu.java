package sq;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f107908iobyxmoadg;

        static {
            int[] iArr = new int[v00.ppxfxbqfkf.values().length];
            try {
                iArr[v00.ppxfxbqfkf.POPULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v00.ppxfxbqfkf.PRICE_ASC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v00.ppxfxbqfkf.PRICE_DESC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v00.ppxfxbqfkf.RATING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v00.ppxfxbqfkf.VIVINO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f107908iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(v00.ppxfxbqfkf ppxfxbqfkfVar, ColorsUiModel.Hex hex, boolean z13, tg.iobyxmoadg iobyxmoadgVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        ppxfxbqfkf(ppxfxbqfkfVar, hex, z13, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final String gxszxtbevo(v00.ppxfxbqfkf ppxfxbqfkfVar, draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(1610730064);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(1610730064, i13, -1, "ru.myspar.catalog.impl.choosesort.presentation.compose.rememberTypeName (ChooseSortItem.kt:49)");
        }
        String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.sort_title_popular_dialog, draadjrbmkVar, 0);
        String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.sort_title_price_asc_dialog, draadjrbmkVar, 0);
        String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.sort_title_price_desc_dialog, draadjrbmkVar, 0);
        String strPpxfxbqfkf4 = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.sort_title_rating_dialog, draadjrbmkVar, 0);
        String strPpxfxbqfkf5 = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.sort_title_rating_vivino_dialog, draadjrbmkVar, 0);
        draadjrbmkVar.sopmlzcsov(2042451087);
        boolean z13 = (((i13 & 14) ^ 6) > 4 && draadjrbmkVar.ulzqkzuiru(ppxfxbqfkfVar)) || (i13 & 6) == 4;
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            int i14 = iobyxmoadg.f107908iobyxmoadg[ppxfxbqfkfVar.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    strPpxfxbqfkf = strPpxfxbqfkf2;
                } else if (i14 == 3) {
                    strPpxfxbqfkf = strPpxfxbqfkf3;
                } else if (i14 == 4) {
                    strPpxfxbqfkf = strPpxfxbqfkf4;
                } else {
                    if (i14 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strPpxfxbqfkf = strPpxfxbqfkf5;
                }
            }
            draadjrbmkVar.jyumaefscl(strPpxfxbqfkf);
            objYadqdtsiqt = strPpxfxbqfkf;
        }
        String str = (String) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return str;
    }

    public static final void ppxfxbqfkf(final v00.ppxfxbqfkf type, final ColorsUiModel.Hex hex, final boolean z13, final tg.iobyxmoadg onSelect, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        draadjrbmk draadjrbmkVar2;
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(onSelect, "onSelect");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(539231618);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(type) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(hex) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onSelect) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i15 = i14;
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(539231618, i15, -1, "ru.myspar.catalog.impl.choosesort.presentation.compose.ChooseSortItem (ChooseSortItem.kt:26)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarDxjokdxxww = cdpycssgdh.dxjokdxxww(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(44));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1659995235);
            boolean z14 = (i15 & 7168) == 2048;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: sq.gxszxtbevo
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.wkgbmnqykc(onSelect);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.eablkybsjg.nufgyqmvbu(wkgbmnqykcVarDxjokdxxww, false, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt, 15, null), w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(roivzttewh.f26469iobyxmoadg, iobyxmoadgVar, 1.0f, false, 2, null);
            String strGxszxtbevo = gxszxtbevo(type, draadjrbmkVarBtonecajqb, i15 & 14);
            z zVar = z.f44180iobyxmoadg;
            int i16 = z.f44181zoijcleaow;
            n nVarIobyxmoadg = zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i16).iobyxmoadg();
            long jIwizpuwonk = y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).iwizpuwonk();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(strGxszxtbevo, wkgbmnqykcVarZoijcleaow, jIwizpuwonk, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVarIobyxmoadg, draadjrbmkVar2, 0, 0, 65528);
            eablkybsjg.zoijcleaow(z13, hex, draadjrbmkVar2, ((i15 >> 6) & 14) | (i15 & 112));
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: sq.lqeggnwhkg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return nufgyqmvbu.eablkybsjg(type, hex, z13, onSelect, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
