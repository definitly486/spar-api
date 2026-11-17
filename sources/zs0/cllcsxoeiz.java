package zs0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.h;
import j0.i;
import j0.n;
import java.util.List;
import ru.myspar.proloyalty.common.view.counter.model.Price;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class cllcsxoeiz {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ n f131122cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ int f131123esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ n f131124iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f131125jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ h f131126lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f131127yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Price f131128zdlpuopuiu;

        iobyxmoadg(Price price, String str, String str2, n nVar, n nVar2, int i13, h hVar) {
            this.f131128zdlpuopuiu = price;
            this.f131127yggfygwlhe = str;
            this.f131125jyumaefscl = str2;
            this.f131124iwizpuwonk = nVar;
            this.f131122cqumvgiudr = nVar2;
            this.f131123esjtqupxsv = i13;
            this.f131126lereixgezr = hVar;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((czzsidtyhn.gtknphoqwx) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(czzsidtyhn.gtknphoqwx BoxWithConstraints, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            int i14;
            z zVar;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(BoxWithConstraints, "$this$BoxWithConstraints");
            int i15 = (i13 & 6) == 0 ? i13 | (draadjrbmkVar.ulzqkzuiru(BoxWithConstraints) ? 4 : 2) : i13;
            if ((i15 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1181142225, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardPrice.<anonymous> (ProductCardPrice.kt:64)");
            }
            Integer numValueOf = Integer.valueOf(w0.zoijcleaow.draadjrbmk(BoxWithConstraints.ppxfxbqfkf()));
            if (!w0.zoijcleaow.nufgyqmvbu(BoxWithConstraints.ppxfxbqfkf())) {
                numValueOf = null;
            }
            draadjrbmkVar.sopmlzcsov(-243722091);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f131128zdlpuopuiu) | draadjrbmkVar.ulzqkzuiru(this.f131127yggfygwlhe) | draadjrbmkVar.ulzqkzuiru(this.f131125jyumaefscl) | draadjrbmkVar.ulzqkzuiru(this.f131124iwizpuwonk) | draadjrbmkVar.ulzqkzuiru(this.f131122cqumvgiudr) | draadjrbmkVar.ulzqkzuiru(numValueOf);
            Price price = this.f131128zdlpuopuiu;
            n nVar = this.f131124iwizpuwonk;
            String str = this.f131127yggfygwlhe;
            String str2 = this.f131125jyumaefscl;
            int i16 = this.f131123esjtqupxsv;
            n nVar2 = this.f131122cqumvgiudr;
            h hVar = this.f131126lereixgezr;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                float fWflxmlrfwp = 1.0f;
                if (numValueOf != null) {
                    gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(price.getPrice(), nVar);
                    String priceFractional = price.getPriceFractional();
                    if (priceFractional.length() <= 0) {
                        priceFractional = null;
                    }
                    List<gg.vdvldrhtss> listOxmwwwfdhm = hg.jyumaefscl.oxmwwwfdhm(vdvldrhtssVarIobyxmoadg, priceFractional != null ? gg.cqumvgiudr.iobyxmoadg(priceFractional, nVar2) : null, gg.cqumvgiudr.iobyxmoadg(str, nVar), str2 != null ? gg.cqumvgiudr.iobyxmoadg(str2, nVar2) : null);
                    int iZynmafqrjb = 0;
                    for (gg.vdvldrhtss vdvldrhtssVar : listOxmwwwfdhm) {
                        iZynmafqrjb += (int) (hVar.iobyxmoadg((String) vdvldrhtssVar.iobyxmoadg(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 2) != 0 ? n.f50293wkgbmnqykc.iobyxmoadg() : (n) vdvldrhtssVar.wkgbmnqykc(), (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 4) != 0 ? v0.jyumaefscl.f114986iobyxmoadg.iobyxmoadg() : 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 8) != 0, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 16) != 0 ? Integer.MAX_VALUE : 1, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 32) != 0 ? w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, 0, 15, null) : 0L, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & 64) != 0 ? hVar.f50223ppxfxbqfkf : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hVar.f50225zoijcleaow : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? hVar.f50222iobyxmoadg : null, (GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : false).zynmafqrjb() >> 32);
                    }
                    int iIntValue = numValueOf.intValue() - (i16 * (listOxmwwwfdhm.size() - 1));
                    if (iZynmafqrjb > iIntValue) {
                        fWflxmlrfwp = zg.gtknphoqwx.wflxmlrfwp((iIntValue / iZynmafqrjb) * 0.97f, 0.7f, 1.0f);
                    }
                }
                objYadqdtsiqt = Float.valueOf(fWflxmlrfwp);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            float fFloatValue = ((Number) objYadqdtsiqt).floatValue();
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(-243692579);
            boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f131124iwizpuwonk) | draadjrbmkVar.zoijcleaow(fFloatValue);
            n nVar3 = this.f131124iwizpuwonk;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = cllcsxoeiz.eablkybsjg(nVar3, fFloatValue);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            n nVar4 = (n) objYadqdtsiqt2;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(-243689413);
            boolean zUlzqkzuiru3 = draadjrbmkVar.ulzqkzuiru(this.f131122cqumvgiudr) | draadjrbmkVar.zoijcleaow(fFloatValue);
            n nVar5 = this.f131122cqumvgiudr;
            Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = cllcsxoeiz.eablkybsjg(nVar5, fFloatValue);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
            }
            n nVar6 = (n) objYadqdtsiqt3;
            draadjrbmkVar.stevsuqkhv();
            Price price2 = this.f131128zdlpuopuiu;
            String str3 = this.f131127yggfygwlhe;
            String str4 = this.f131125jyumaefscl;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            x.zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.draadjrbmk(), draadjrbmkVar, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, iobyxmoadgVar);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar, "PRODUCT_CARD_PRICE", null, null, false, 14, null);
            String price3 = price2.getPrice();
            z zVar2 = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            long jPmvmpeiblj = l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVar, i17).pmvmpeiblj();
            v0.jyumaefscl.iobyxmoadg iobyxmoadgVar3 = v0.jyumaefscl.f114986iobyxmoadg;
            w6.btonecajqb(price3, wkgbmnqykcVarOjitshcjhn, jPmvmpeiblj, 0L, null, null, null, 0L, null, null, 0L, iobyxmoadgVar3.zoijcleaow(), false, 1, 0, null, nVar4, draadjrbmkVar, 0, 3120, 55288);
            draadjrbmkVar.sopmlzcsov(-1872298377);
            if (price2.getPriceFractional().length() > 0) {
                t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(2), draadjrbmkVar, 6);
                i14 = i17;
                zVar = zVar2;
                w6.btonecajqb(price2.getPriceFractional(), androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar, "PRODUCT_CARD_PRICE_FRACTIONAL", null, null, false, 14, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg((float) 0.5d), 0.0f, 0.0f, 13, null), l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVar, i17).pmvmpeiblj(), 0L, null, null, null, 0L, null, null, 0L, iobyxmoadgVar3.zoijcleaow(), false, 1, 0, null, nVar6, draadjrbmkVar, 0, 3120, 55288);
            } else {
                i14 = i17;
                zVar = zVar2;
            }
            draadjrbmkVar.stevsuqkhv();
            float f13 = 2;
            t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVar, 6);
            int i18 = i14;
            z zVar3 = zVar;
            w6.btonecajqb(str3, null, l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVar, i18).pmvmpeiblj(), 0L, null, null, null, 0L, null, null, 0L, iobyxmoadgVar3.zoijcleaow(), false, 1, 0, null, nVar4, draadjrbmkVar, 0, 3120, 55290);
            draadjrbmkVar.sopmlzcsov(-1872269389);
            if (str4 != null) {
                t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVar, 6);
                w6.btonecajqb(str4, androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar, "PRODUCT_CARD_PRICE_MEASURE", null, null, false, 14, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg((float) 0.5d), 0.0f, 0.0f, 13, null), l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVar, i18).istkbnxepw(), 0L, null, null, null, 0L, null, null, 0L, iobyxmoadgVar3.zoijcleaow(), false, 1, 0, null, nVar6, draadjrbmkVar, 0, 3120, 55288);
            }
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n eablkybsjg(n nVar, float f13) {
        if (f13 == 1.0f) {
            return nVar;
        }
        long jDraadjrbmk = nVar.draadjrbmk();
        w0.iwizpuwonk.zoijcleaow(jDraadjrbmk);
        long jGtknphoqwx = w0.iwizpuwonk.gtknphoqwx(w0.jyumaefscl.gxszxtbevo(jDraadjrbmk), w0.jyumaefscl.nufgyqmvbu(jDraadjrbmk) * f13);
        long jKcexrzcfyt = nVar.kcexrzcfyt();
        w0.iwizpuwonk.zoijcleaow(jKcexrzcfyt);
        return nVar.zoijcleaow((16777183 & 1) != 0 ? nVar.f50294iobyxmoadg.lqeggnwhkg() : 0L, (16777183 & 2) != 0 ? nVar.f50294iobyxmoadg.gtknphoqwx() : jGtknphoqwx, (16777183 & 4) != 0 ? nVar.f50294iobyxmoadg.agtfadlqog() : null, (16777183 & 8) != 0 ? nVar.f50294iobyxmoadg.draadjrbmk() : null, (16777183 & 16) != 0 ? nVar.f50294iobyxmoadg.wflxmlrfwp() : null, (16777183 & 32) != 0 ? nVar.f50294iobyxmoadg.dxjokdxxww() : null, (16777183 & 64) != 0 ? nVar.f50294iobyxmoadg.btonecajqb() : null, (16777183 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nVar.f50294iobyxmoadg.ojitshcjhn() : 0L, (16777183 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nVar.f50294iobyxmoadg.eablkybsjg() : null, (16777183 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? nVar.f50294iobyxmoadg.yggfygwlhe() : null, (16777183 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? nVar.f50294iobyxmoadg.rgvfuqvkyq() : null, (16777183 & 2048) != 0 ? nVar.f50294iobyxmoadg.wkgbmnqykc() : 0L, (16777183 & 4096) != 0 ? nVar.f50294iobyxmoadg.kcexrzcfyt() : null, (16777183 & 8192) != 0 ? nVar.f50294iobyxmoadg.oxmwwwfdhm() : null, (16777183 & 16384) != 0 ? nVar.f50294iobyxmoadg.nufgyqmvbu() : null, (16777183 & 32768) != 0 ? nVar.f50296zoijcleaow.nufgyqmvbu() : 0, (16777183 & 65536) != 0 ? nVar.f50296zoijcleaow.dxjokdxxww() : 0, (16777183 & 131072) != 0 ? nVar.f50296zoijcleaow.eablkybsjg() : w0.iwizpuwonk.gtknphoqwx(w0.jyumaefscl.gxszxtbevo(jKcexrzcfyt), w0.jyumaefscl.nufgyqmvbu(jKcexrzcfyt) * f13), (16777183 & 262144) != 0 ? nVar.f50296zoijcleaow.btonecajqb() : null, (16777183 & 524288) != 0 ? nVar.f50295ppxfxbqfkf : null, (16777183 & 1048576) != 0 ? nVar.f50296zoijcleaow.gxszxtbevo() : null, (16777183 & 2097152) != 0 ? nVar.f50296zoijcleaow.wkgbmnqykc() : 0, (16777183 & 4194304) != 0 ? nVar.f50296zoijcleaow.ppxfxbqfkf() : 0, (16777183 & 8388608) != 0 ? nVar.f50296zoijcleaow.gtknphoqwx() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, double d13, MeasureTypeModel measureTypeModel, boolean z13, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, d13, measureTypeModel, z13, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final double d13, final MeasureTypeModel measureTypeModel, final boolean z13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        String str;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1907930713);
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
            wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1907930713, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardPrice (ProductCardPrice.kt:40)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-966433112);
            boolean z14 = (i15 & 112) == 32;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = ks0.ppxfxbqfkf.wkgbmnqykc(ks0.ppxfxbqfkf.f60512iobyxmoadg, d13, 0, true, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            Price price = (Price) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(b31.wflxmlrfwp.proloyalty_rouble, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-966426572);
            if (measureTypeModel == null || !z13) {
                str = null;
            } else {
                String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(b31.wflxmlrfwp.proloyalty_measure_both_value, draadjrbmkVarBtonecajqb, 0);
                String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(ks0.zoijcleaow.iobyxmoadg(measureTypeModel.getCurrentMeasure()), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-966419381);
                boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(measureTypeModel);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    if (!measureTypeModel.nufgyqmvbu()) {
                        strPpxfxbqfkf2 = strPpxfxbqfkf3;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(strPpxfxbqfkf2);
                    objYadqdtsiqt2 = strPpxfxbqfkf2;
                }
                str = (String) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            z zVar = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            czzsidtyhn.btonecajqb.ppxfxbqfkf(wkgbmnqykcVar3, null, false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1181142225, true, new iobyxmoadg(price, strPpxfxbqfkf, str, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().gtknphoqwx(), l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().wflxmlrfwp(), ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo())).hszhottldk(w0.nufgyqmvbu.lqeggnwhkg(2)), i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1)), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, (i15 & 14) | 3072, 6);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zs0.hkdspvbjdz
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return cllcsxoeiz.ppxfxbqfkf(wkgbmnqykcVar4, d13, measureTypeModel, z13, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
