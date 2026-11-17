package fu;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import igdgnonuha.w6;
import igdgnonuha.z;
import ru.myspar.common.view.counter.model.Price;
import ru.myspar.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wypolnanlu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, double d13, MeasureTypeModel measureTypeModel, boolean z13, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, d13, measureTypeModel, z13, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final double d13, final MeasureTypeModel measureTypeModel, final boolean z13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(780537296);
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
            i15 |= draadjrbmkVarBtonecajqb.gxszxtbevo(d13) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(measureTypeModel) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(780537296, i15, -1, "ru.myspar.common.view.product.compose.common.ProductCardPrice (ProductCardPrice.kt:32)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-435034306);
            boolean z14 = (i15 & 112) == 32;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = rt.ppxfxbqfkf.wkgbmnqykc(rt.ppxfxbqfkf.f83717iobyxmoadg, d13, 0, false, 6, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            Price price = (Price) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            x.zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar4);
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
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar2, "PRODUCT_CARD_PRICE", null, null, false, 14, null);
            String price2 = price.getPrice();
            z zVar = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            w6.btonecajqb(price2, wkgbmnqykcVarPmvmpeiblj, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).pmvmpeiblj(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().gtknphoqwx(), draadjrbmkVarBtonecajqb, 0, 0, 65528);
            float f13 = 2;
            i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            float f14 = (float) 0.5d;
            w6.btonecajqb(price.getPriceFractional(), androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar2, "PRODUCT_CARD_PRICE_FRACTIONAL", null, null, false, 14, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 0.0f, 13, null), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).pmvmpeiblj(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().wflxmlrfwp(), draadjrbmkVarBtonecajqb, 0, 0, 65528);
            i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            w6.btonecajqb(e0.gxszxtbevo.ppxfxbqfkf(s40.draadjrbmk.rouble, draadjrbmkVarBtonecajqb, 0), null, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).pmvmpeiblj(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().gtknphoqwx(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1100463723);
            if (measureTypeModel != null && z13) {
                i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(s40.draadjrbmk.measure_both_value, draadjrbmkVarBtonecajqb, 0);
                String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(rt.zoijcleaow.iobyxmoadg(measureTypeModel.getCurrentMeasure()), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1100472417);
                boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(measureTypeModel);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    if (!measureTypeModel.nufgyqmvbu()) {
                        strPpxfxbqfkf = strPpxfxbqfkf2;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(strPpxfxbqfkf);
                    objYadqdtsiqt2 = strPpxfxbqfkf;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                w6.btonecajqb((String) objYadqdtsiqt2, androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar2, "PRODUCT_CARD_PRICE_MEASURE", null, null, false, 14, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 0.0f, 13, null), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).istkbnxepw(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().wflxmlrfwp(), draadjrbmkVarBtonecajqb, 0, 0, 65528);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fu.dsvhmnatus
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wypolnanlu.ppxfxbqfkf(wkgbmnqykcVar3, d13, measureTypeModel, z13, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
