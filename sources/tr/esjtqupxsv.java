package tr;

import android.content.res.Configuration;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import igdgnonuha.z;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class esjtqupxsv {
    private static final boolean agtfadlqog(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    private static final void btonecajqb(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String str, final String str2, final float f13, final float f14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-438610733);
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.zoijcleaow(f13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.zoijcleaow(f14) ? 16384 : 8192;
        }
        int i17 = i15;
        if ((i17 & 9363) == 9362 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-438610733, i17, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.ParamItem (ProductParamsBlock.kt:97)");
            }
            x.zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.gxszxtbevo(), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVarBtonecajqb, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIwizpuwonk = androidx.compose.foundation.layout.cdpycssgdh.iwizpuwonk(iobyxmoadgVar2, 0.0f, f13, 1, null);
            z zVar = z.f44180iobyxmoadg;
            int i18 = z.f44181zoijcleaow;
            gxszxtbevo.gxszxtbevo(str, wkgbmnqykcVarIwizpuwonk, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).zoijcleaow().zoijcleaow(), null, null, 2, 0, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), draadjrbmkVarBtonecajqb, ((i17 >> 3) & 14) | 196608, 88);
            float f15 = 8;
            lqeggnwhkg(y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).esjtqupxsv(), tbqsvytpvh.zoijcleaow(roivzttewhVar, androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(f15), w0.nufgyqmvbu.lqeggnwhkg(12), w0.nufgyqmvbu.lqeggnwhkg(f15), 0.0f, 8, null), 1.0f, false, 2, null), draadjrbmkVarBtonecajqb, 0, 0);
            gxszxtbevo.gxszxtbevo(str2, androidx.compose.foundation.layout.cdpycssgdh.iwizpuwonk(iobyxmoadgVar2, 0.0f, f14, 1, null), y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).zoijcleaow().zoijcleaow(), null, null, 0, 0, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), draadjrbmkVarBtonecajqb, (i17 >> 6) & 14, 120);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: tr.jyumaefscl
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.gtknphoqwx(wkgbmnqykcVar4, str, str2, f13, f14, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x013b  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:66:0x0203  */
    /* JADX WARN: Code duplicated, block: B:70:0x0212 A[LOOP:0: B:68:0x020c->B:70:0x0212, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x026a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0270  */
    /* JADX WARN: Code duplicated, block: B:77:0x0274  */
    /* JADX WARN: Code duplicated, block: B:80:0x0299  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void draadjrbmk(final List params, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        float fLqeggnwhkg;
        float fLqeggnwhkg2;
        boolean z13;
        Object objYadqdtsiqt;
        final iwxlajgraz iwxlajgrazVar;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        Object obj;
        int iHashCode2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2;
        int size;
        int i16;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt2;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1226697059);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(params) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i15 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1226697059, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.ProductParamsBlock (ProductParamsBlock.kt:45)");
                }
                float fLqeggnwhkg3 = w0.nufgyqmvbu.lqeggnwhkg(((Configuration) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gxszxtbevo())).screenWidthDp);
                fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(0.4f * fLqeggnwhkg3);
                fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(fLqeggnwhkg3 * 0.6f);
                z13 = false;
                Object[] objArr = new Object[0];
                draadjrbmkVarBtonecajqb.sopmlzcsov(1466305477);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: tr.kcexrzcfyt
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return esjtqupxsv.wflxmlrfwp();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iwxlajgrazVar = (iwxlajgraz) rhgxfdycjh.wkgbmnqykc.gxszxtbevo(objArr, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 48);
                String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(pm.dxjokdxxww.cart_specifications, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "rvParams", null, null, false, 14, null);
                czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
                czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = eablkybsjgVar.dxjokdxxww();
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww, iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarPmvmpeiblj);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                yr.wkgbmnqykc.zoijcleaow(strPpxfxbqfkf, l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar3, "tvParams", null, strPpxfxbqfkf, false, 10, null), draadjrbmkVarBtonecajqb, 0, 0);
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(16), draadjrbmkVarBtonecajqb, 6);
                obj = null;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = androidx.compose.animation.iobyxmoadg.zoijcleaow(iobyxmoadgVar3, null, null, 3, null);
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-57038637);
                if (agtfadlqog(iwxlajgrazVar)) {
                    size = params.size();
                } else {
                    size = 2;
                }
                for (mb0.ppxfxbqfkf ppxfxbqfkfVar : hg.jyumaefscl.f(params, size)) {
                    btonecajqb(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, obj), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow(), fLqeggnwhkg, fLqeggnwhkg2, draadjrbmkVarBtonecajqb, 6, 0);
                    i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(12), draadjrbmkVarBtonecajqb, 6);
                    z13 = false;
                    obj = null;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(8), draadjrbmkVarBtonecajqb, 6);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1004909335);
                if (params.size() > 2) {
                    if (agtfadlqog(iwxlajgrazVar)) {
                        i16 = pm.dxjokdxxww.collapse_product_params;
                    } else {
                        i16 = pm.dxjokdxxww.expand_product_params;
                    }
                    String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(i16, draadjrbmkVarBtonecajqb, 0);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj2 = l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "btnRollParams", null, strPpxfxbqfkf2, false, 10, null);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1004923911);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(iwxlajgrazVar);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: tr.zdlpuopuiu
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return esjtqupxsv.rgvfuqvkyq(iwxlajgrazVar);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    vr.zoijcleaow.zoijcleaow(strPpxfxbqfkf2, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVarPmvmpeiblj2, draadjrbmkVarBtonecajqb, 0, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: tr.yggfygwlhe
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj2, Object obj3) {
                        return esjtqupxsv.vdvldrhtss(params, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 19) == 18) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1226697059, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.ProductParamsBlock (ProductParamsBlock.kt:45)");
            }
            float fLqeggnwhkg4 = w0.nufgyqmvbu.lqeggnwhkg(((Configuration) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gxszxtbevo())).screenWidthDp);
            fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(0.4f * fLqeggnwhkg4);
            fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(fLqeggnwhkg4 * 0.6f);
            z13 = false;
            Object[] objArr2 = new Object[0];
            draadjrbmkVarBtonecajqb.sopmlzcsov(1466305477);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: tr.kcexrzcfyt
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return esjtqupxsv.wflxmlrfwp();
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            iwxlajgrazVar = (iwxlajgraz) rhgxfdycjh.wkgbmnqykc.gxszxtbevo(objArr2, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 48);
            String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(pm.dxjokdxxww.cart_specifications, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj3 = l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "rvParams", null, null, false, 14, null);
            czzsidtyhn.eablkybsjg eablkybsjgVar2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww2 = eablkybsjgVar2.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar4 = a.eablkybsjg.f20iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww2, iobyxmoadgVar4.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarPmvmpeiblj3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar5 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar5.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar2 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            yr.wkgbmnqykc.zoijcleaow(strPpxfxbqfkf3, l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar6, "tvParams", null, strPpxfxbqfkf3, false, 10, null), draadjrbmkVarBtonecajqb, 0, 0);
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(16), draadjrbmkVarBtonecajqb, 6);
            obj = null;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow2 = androidx.compose.animation.iobyxmoadg.zoijcleaow(iobyxmoadgVar6, null, null, 3, null);
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg4 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar2.dxjokdxxww(), iobyxmoadgVar4.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow2);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar5.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg4, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar5.wkgbmnqykc());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-57038637);
            if (agtfadlqog(iwxlajgrazVar)) {
                size = params.size();
            } else {
                size = 2;
            }
            while (r4.hasNext()) {
                btonecajqb(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, obj), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow(), fLqeggnwhkg, fLqeggnwhkg2, draadjrbmkVarBtonecajqb, 6, 0);
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(12), draadjrbmkVarBtonecajqb, 6);
                z13 = false;
                obj = null;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(8), draadjrbmkVarBtonecajqb, 6);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1004909335);
            if (params.size() > 2) {
                if (agtfadlqog(iwxlajgrazVar)) {
                    i16 = pm.dxjokdxxww.collapse_product_params;
                } else {
                    i16 = pm.dxjokdxxww.expand_product_params;
                }
                String strPpxfxbqfkf4 = e0.gxszxtbevo.ppxfxbqfkf(i16, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj4 = l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "btnRollParams", null, strPpxfxbqfkf4, false, 10, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1004923911);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(iwxlajgrazVar);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: tr.zdlpuopuiu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return esjtqupxsv.rgvfuqvkyq(iwxlajgrazVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: tr.zdlpuopuiu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return esjtqupxsv.rgvfuqvkyq(iwxlajgrazVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                vr.zoijcleaow.zoijcleaow(strPpxfxbqfkf4, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVarPmvmpeiblj4, draadjrbmkVarBtonecajqb, 0, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1226697059, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.ProductParamsBlock (ProductParamsBlock.kt:45)");
            }
            float fLqeggnwhkg5 = w0.nufgyqmvbu.lqeggnwhkg(((Configuration) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.gxszxtbevo())).screenWidthDp);
            fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(0.4f * fLqeggnwhkg5);
            fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(fLqeggnwhkg5 * 0.6f);
            z13 = false;
            Object[] objArr3 = new Object[0];
            draadjrbmkVarBtonecajqb.sopmlzcsov(1466305477);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: tr.kcexrzcfyt
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return esjtqupxsv.wflxmlrfwp();
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            iwxlajgrazVar = (iwxlajgraz) rhgxfdycjh.wkgbmnqykc.gxszxtbevo(objArr3, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 48);
            String strPpxfxbqfkf5 = e0.gxszxtbevo.ppxfxbqfkf(pm.dxjokdxxww.cart_specifications, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj5 = l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "rvParams", null, null, false, 14, null);
            czzsidtyhn.eablkybsjg eablkybsjgVar3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww3 = eablkybsjgVar3.dxjokdxxww();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar7 = a.eablkybsjg.f20iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg5 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww3, iobyxmoadgVar7.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarPmvmpeiblj5);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar8 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar8.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg5, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar8.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar3 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar9 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            yr.wkgbmnqykc.zoijcleaow(strPpxfxbqfkf5, l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar9, "tvParams", null, strPpxfxbqfkf5, false, 10, null), draadjrbmkVarBtonecajqb, 0, 0);
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(16), draadjrbmkVarBtonecajqb, 6);
            obj = null;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow3 = androidx.compose.animation.iobyxmoadg.zoijcleaow(iobyxmoadgVar9, null, null, 3, null);
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg6 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar3.dxjokdxxww(), iobyxmoadgVar7.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow3);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar8.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg2);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg6, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar8.wkgbmnqykc());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-57038637);
            if (agtfadlqog(iwxlajgrazVar)) {
                size = params.size();
            } else {
                size = 2;
            }
            while (r4.hasNext()) {
                btonecajqb(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, obj), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow(), fLqeggnwhkg, fLqeggnwhkg2, draadjrbmkVarBtonecajqb, 6, 0);
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(12), draadjrbmkVarBtonecajqb, 6);
                z13 = false;
                obj = null;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(8), draadjrbmkVarBtonecajqb, 6);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1004909335);
            if (params.size() > 2) {
                if (agtfadlqog(iwxlajgrazVar)) {
                    i16 = pm.dxjokdxxww.collapse_product_params;
                } else {
                    i16 = pm.dxjokdxxww.expand_product_params;
                }
                String strPpxfxbqfkf6 = e0.gxszxtbevo.ppxfxbqfkf(i16, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj6 = l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "btnRollParams", null, strPpxfxbqfkf6, false, 10, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1004923911);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(iwxlajgrazVar);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: tr.zdlpuopuiu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return esjtqupxsv.rgvfuqvkyq(iwxlajgrazVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: tr.zdlpuopuiu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return esjtqupxsv.rgvfuqvkyq(iwxlajgrazVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                vr.zoijcleaow.zoijcleaow(strPpxfxbqfkf6, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVarPmvmpeiblj6, draadjrbmkVarBtonecajqb, 0, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: tr.yggfygwlhe
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return esjtqupxsv.vdvldrhtss(params, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(long j13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        lqeggnwhkg(j13, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, String str2, float f13, float f14, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        btonecajqb(wkgbmnqykcVar, str, str2, f13, f14, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void lqeggnwhkg(final long j13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(67375140);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.wkgbmnqykc(j13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(67375140, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.DottedLine (ProductParamsBlock.kt:128)");
            }
            final float fI = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).I(w0.nufgyqmvbu.lqeggnwhkg(1));
            final float fI2 = ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).I(w0.nufgyqmvbu.lqeggnwhkg(4));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1805274248);
            boolean zZoijcleaow = draadjrbmkVarBtonecajqb.zoijcleaow(fI) | ((i15 & 14) == 4) | draadjrbmkVarBtonecajqb.zoijcleaow(fI2);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zZoijcleaow || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: tr.iwizpuwonk
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return esjtqupxsv.nufgyqmvbu(fI, j13, fI2, (j.gxszxtbevo) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ikoacuggdj.zdlpuopuiu.zoijcleaow(wkgbmnqykcVar, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i15 >> 3) & 14);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: tr.cqumvgiudr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.dxjokdxxww(j13, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(float f13, long j13, float f14, j.gxszxtbevo Canvas) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.zoijcleaow() & 4294967295L)) / 2;
        float f15 = f13;
        while (f15 <= Float.intBitsToFloat((int) (Canvas.zoijcleaow() >> 32)) - f13) {
            j.gxszxtbevo.jztzpxfvev(Canvas, j13, f13, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            f15 += f14;
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void ojitshcjhn(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(iwxlajgraz iwxlajgrazVar) {
        ojitshcjhn(iwxlajgrazVar, !agtfadlqog(iwxlajgrazVar));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn vdvldrhtss(List list, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        draadjrbmk(list, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iwxlajgraz wflxmlrfwp() {
        return c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
    }
}
