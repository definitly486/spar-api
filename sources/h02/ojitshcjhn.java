package h02;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.RatingBar;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.ezmngbhpjk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.roivzttewh;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.vdvldrhtss;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ojitshcjhn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, j02.eablkybsjg eablkybsjgVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(wkgbmnqykcVar, eablkybsjgVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final j02.eablkybsjg item, final tg.draadjrbmk ratingChangedListener, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(ratingChangedListener, "ratingChangedListener");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1589589627);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(ratingChangedListener) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i15;
        if ((i17 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1589589627, i17, -1, "ru.myspar.rate.rate_order.impl.presentation.components.RatingOrderTitleItem (RatingOrderTitleItem.kt:32)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1807461545);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = ezmngbhpjk.iobyxmoadg(item.eablkybsjg());
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            final roivzttewh roivzttewhVar = (roivzttewh) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f13 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(esjtqupxsv.rgvfuqvkyq(wkgbmnqykcVar4, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 7, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm);
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
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar3, 0.0f, 1, null);
            z zVar = z.f44180iobyxmoadg;
            int i18 = z.f44181zoijcleaow;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar4;
            w6.btonecajqb(item.nufgyqmvbu(), wkgbmnqykcVarNufgyqmvbu, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).eablkybsjg(), draadjrbmkVarBtonecajqb, 48, 0, 65528);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm2 = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.istkbnxepw(iobyxmoadgVar3, null, false, 3, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, 0.0f, 13, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(700645649);
            boolean z13 = (i17 & 896) == 256;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: h02.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ojitshcjhn.gxszxtbevo(roivzttewhVar, ratingChangedListener, (Context) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(700664317);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: h02.draadjrbmk
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ojitshcjhn.nufgyqmvbu(roivzttewhVar, (AppCompatRatingBar) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.viewinterop.eablkybsjg.iobyxmoadg(draadjrbmkVar3, wkgbmnqykcVarOxmwwwfdhm2, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 432, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(700667638);
            if (item.dxjokdxxww()) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(item.lqeggnwhkg(), esjtqupxsv.oxmwwwfdhm(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar3, 0.0f, 1, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 0.0f, 13, null), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).gxszxtbevo(), draadjrbmkVar2, 48, 0, 65528);
            } else {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar5;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: h02.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ojitshcjhn.dxjokdxxww(wkgbmnqykcVar3, item, ratingChangedListener, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatRatingBar gxszxtbevo(final roivzttewh roivzttewhVar, final tg.draadjrbmk draadjrbmkVar, Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        AppCompatRatingBar appCompatRatingBar = new AppCompatRatingBar(new ContextThemeWrapper(context, s40.wflxmlrfwp.RatingBarStyle), null, 0);
        appCompatRatingBar.setNumStars(5);
        appCompatRatingBar.setStepSize(1.0f);
        appCompatRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: h02.agtfadlqog
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f13, boolean z13) {
                ojitshcjhn.lqeggnwhkg(roivzttewhVar, draadjrbmkVar, ratingBar, f13, z13);
            }
        });
        return appCompatRatingBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(roivzttewh roivzttewhVar, tg.draadjrbmk draadjrbmkVar, RatingBar ratingBar, float f13, boolean z13) {
        roivzttewhVar.pkzmftpjix(f13);
        draadjrbmkVar.invoke(Integer.valueOf((int) f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(roivzttewh roivzttewhVar, AppCompatRatingBar view) {
        zdlpuopuiu.btonecajqb(view, "view");
        view.setRating(roivzttewhVar.zoijcleaow());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
