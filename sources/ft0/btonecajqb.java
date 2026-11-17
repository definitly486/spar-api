package ft0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.vdvldrhtss;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;
import zs0.kcexrzcfyt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class btonecajqb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(jt0.wkgbmnqykc wkgbmnqykcVar, js0.zoijcleaow zoijcleaowVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        ppxfxbqfkf(wkgbmnqykcVar, zoijcleaowVar, wkgbmnqykcVar2, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void ppxfxbqfkf(final jt0.wkgbmnqykc product, final js0.zoijcleaow counterStyle, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        tg.draadjrbmk draadjrbmkVar3;
        int i17;
        int i18;
        tg.draadjrbmk draadjrbmkVar4;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar5;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final tg.draadjrbmk draadjrbmkVar6;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(2100565029);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(product) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(counterStyle) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    if (i19 != 0) {
                        wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(135960952);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt = new tg.draadjrbmk() { // from class: ft0.nufgyqmvbu
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return btonecajqb.wkgbmnqykc((ProductCardEvent) obj);
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                    } else {
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(2100565029, i18, -1, "ru.myspar.proloyalty.common.view.product.compose.single.promo.ProductCardPromoInfo (ProductCardPromoInfo.kt:31)");
                    }
                    zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar2);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                    vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
                    String strAgtfadlqog = product.agtfadlqog();
                    z zVar = z.f44180iobyxmoadg;
                    int i23 = z.f44181zoijcleaow;
                    w6.btonecajqb(strAgtfadlqog, null, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i23).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 3, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i23).zoijcleaow().rgvfuqvkyq(), draadjrbmkVarBtonecajqb, 0, 3120, 55290);
                    androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar, androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 1.0f, false, 2, null), draadjrbmkVarBtonecajqb, 0);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1091222169);
                    if (product.yggfygwlhe()) {
                        zs0.wwaezpbzkn.eablkybsjg(product.wflxmlrfwp(), null, draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i18 >> 3) & 896, 2);
                        t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    kcexrzcfyt.nufgyqmvbu(product.lqeggnwhkg(), product.eablkybsjg(), null, counterStyle, draadjrbmkVar4, draadjrbmkVarBtonecajqb, ((i18 << 6) & 7168) | (57344 & (i18 << 3)), 4);
                    draadjrbmkVar5.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    draadjrbmkVar6 = draadjrbmkVar4;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    draadjrbmkVar6 = draadjrbmkVar3;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                }
                a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ft0.dxjokdxxww
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return btonecajqb.eablkybsjg(product, counterStyle, wkgbmnqykcVar3, draadjrbmkVar6, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            draadjrbmkVar3 = draadjrbmkVar;
            i18 = i15;
            if ((i18 & 1171) == 1170) {
                if (i19 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(135960952);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: ft0.nufgyqmvbu
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return btonecajqb.wkgbmnqykc((ProductCardEvent) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(2100565029, i18, -1, "ru.myspar.proloyalty.common.view.product.compose.single.promo.ProductCardPromoInfo (ProductCardPromoInfo.kt:31)");
                }
                zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar2);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
                vdvldrhtss vdvldrhtssVar2 = vdvldrhtss.f26487iobyxmoadg;
                String strAgtfadlqog2 = product.agtfadlqog();
                z zVar2 = z.f44180iobyxmoadg;
                int i24 = z.f44181zoijcleaow;
                w6.btonecajqb(strAgtfadlqog2, null, l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i24).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 3, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i24).zoijcleaow().rgvfuqvkyq(), draadjrbmkVarBtonecajqb, 0, 3120, 55290);
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar2, androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 1.0f, false, 2, null), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1091222169);
                if (product.yggfygwlhe()) {
                    zs0.wwaezpbzkn.eablkybsjg(product.wflxmlrfwp(), null, draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i18 >> 3) & 896, 2);
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                kcexrzcfyt.nufgyqmvbu(product.lqeggnwhkg(), product.eablkybsjg(), null, counterStyle, draadjrbmkVar4, draadjrbmkVarBtonecajqb, ((i18 << 6) & 7168) | (57344 & (i18 << 3)), 4);
                draadjrbmkVar5.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                draadjrbmkVar6 = draadjrbmkVar4;
            } else {
                if (i19 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(135960952);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: ft0.nufgyqmvbu
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return btonecajqb.wkgbmnqykc((ProductCardEvent) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(2100565029, i18, -1, "ru.myspar.proloyalty.common.view.product.compose.single.promo.ProductCardPromoInfo (ProductCardPromoInfo.kt:31)");
                }
                zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar2);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar3.wkgbmnqykc());
                vdvldrhtss vdvldrhtssVar3 = vdvldrhtss.f26487iobyxmoadg;
                String strAgtfadlqog3 = product.agtfadlqog();
                z zVar3 = z.f44180iobyxmoadg;
                int i25 = z.f44181zoijcleaow;
                w6.btonecajqb(strAgtfadlqog3, null, l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i25).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 3, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i25).zoijcleaow().rgvfuqvkyq(), draadjrbmkVarBtonecajqb, 0, 3120, 55290);
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar3, androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 1.0f, false, 2, null), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1091222169);
                if (product.yggfygwlhe()) {
                    zs0.wwaezpbzkn.eablkybsjg(product.wflxmlrfwp(), null, draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i18 >> 3) & 896, 2);
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                kcexrzcfyt.nufgyqmvbu(product.lqeggnwhkg(), product.eablkybsjg(), null, counterStyle, draadjrbmkVar4, draadjrbmkVarBtonecajqb, ((i18 << 6) & 7168) | (57344 & (i18 << 3)), 4);
                draadjrbmkVar5.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                draadjrbmkVar6 = draadjrbmkVar4;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ft0.dxjokdxxww
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return btonecajqb.eablkybsjg(product, counterStyle, wkgbmnqykcVar3, draadjrbmkVar6, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 1171) == 1170) {
                if (i19 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(135960952);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: ft0.nufgyqmvbu
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return btonecajqb.wkgbmnqykc((ProductCardEvent) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(2100565029, i18, -1, "ru.myspar.proloyalty.common.view.product.compose.single.promo.ProductCardPromoInfo (ProductCardPromoInfo.kt:31)");
                }
                zynmafqrjb zynmafqrjbVarIobyxmoadg4 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar2);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg4, iobyxmoadgVar4.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar4.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar4.wkgbmnqykc());
                vdvldrhtss vdvldrhtssVar4 = vdvldrhtss.f26487iobyxmoadg;
                String strAgtfadlqog4 = product.agtfadlqog();
                z zVar4 = z.f44180iobyxmoadg;
                int i26 = z.f44181zoijcleaow;
                w6.btonecajqb(strAgtfadlqog4, null, l41.ppxfxbqfkf.iobyxmoadg(zVar4, draadjrbmkVarBtonecajqb, i26).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 3, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar4, draadjrbmkVarBtonecajqb, i26).zoijcleaow().rgvfuqvkyq(), draadjrbmkVarBtonecajqb, 0, 3120, 55290);
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar4, androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 1.0f, false, 2, null), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1091222169);
                if (product.yggfygwlhe()) {
                    zs0.wwaezpbzkn.eablkybsjg(product.wflxmlrfwp(), null, draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i18 >> 3) & 896, 2);
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                kcexrzcfyt.nufgyqmvbu(product.lqeggnwhkg(), product.eablkybsjg(), null, counterStyle, draadjrbmkVar4, draadjrbmkVarBtonecajqb, ((i18 << 6) & 7168) | (57344 & (i18 << 3)), 4);
                draadjrbmkVar5.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                draadjrbmkVar6 = draadjrbmkVar4;
            } else {
                if (i19 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(135960952);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: ft0.nufgyqmvbu
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return btonecajqb.wkgbmnqykc((ProductCardEvent) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(2100565029, i18, -1, "ru.myspar.proloyalty.common.view.product.compose.single.promo.ProductCardPromoInfo (ProductCardPromoInfo.kt:31)");
                }
                zynmafqrjb zynmafqrjbVarIobyxmoadg5 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar2);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg5, iobyxmoadgVar5.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar5.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar5.wkgbmnqykc());
                vdvldrhtss vdvldrhtssVar5 = vdvldrhtss.f26487iobyxmoadg;
                String strAgtfadlqog5 = product.agtfadlqog();
                z zVar5 = z.f44180iobyxmoadg;
                int i27 = z.f44181zoijcleaow;
                w6.btonecajqb(strAgtfadlqog5, null, l41.ppxfxbqfkf.iobyxmoadg(zVar5, draadjrbmkVarBtonecajqb, i27).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 3, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar5, draadjrbmkVarBtonecajqb, i27).zoijcleaow().rgvfuqvkyq(), draadjrbmkVarBtonecajqb, 0, 3120, 55290);
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar5, androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 1.0f, false, 2, null), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1091222169);
                if (product.yggfygwlhe()) {
                    zs0.wwaezpbzkn.eablkybsjg(product.wflxmlrfwp(), null, draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i18 >> 3) & 896, 2);
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                kcexrzcfyt.nufgyqmvbu(product.lqeggnwhkg(), product.eablkybsjg(), null, counterStyle, draadjrbmkVar4, draadjrbmkVarBtonecajqb, ((i18 << 6) & 7168) | (57344 & (i18 << 3)), 4);
                draadjrbmkVar5.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                draadjrbmkVar6 = draadjrbmkVar4;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ft0.dxjokdxxww
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return btonecajqb.eablkybsjg(product, counterStyle, wkgbmnqykcVar3, draadjrbmkVar6, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        draadjrbmkVar3 = draadjrbmkVar;
        i18 = i15;
        if ((i18 & 1171) == 1170) {
            if (i19 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(135960952);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ft0.nufgyqmvbu
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return btonecajqb.wkgbmnqykc((ProductCardEvent) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2100565029, i18, -1, "ru.myspar.proloyalty.common.view.product.compose.single.promo.ProductCardPromoInfo (ProductCardPromoInfo.kt:31)");
            }
            zynmafqrjb zynmafqrjbVarIobyxmoadg6 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar6 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar6.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg6, iobyxmoadgVar6.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar6.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar6.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar6.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar6 = vdvldrhtss.f26487iobyxmoadg;
            String strAgtfadlqog6 = product.agtfadlqog();
            z zVar6 = z.f44180iobyxmoadg;
            int i28 = z.f44181zoijcleaow;
            w6.btonecajqb(strAgtfadlqog6, null, l41.ppxfxbqfkf.iobyxmoadg(zVar6, draadjrbmkVarBtonecajqb, i28).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 3, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar6, draadjrbmkVarBtonecajqb, i28).zoijcleaow().rgvfuqvkyq(), draadjrbmkVarBtonecajqb, 0, 3120, 55290);
            androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar6, androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 1.0f, false, 2, null), draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1091222169);
            if (product.yggfygwlhe()) {
                zs0.wwaezpbzkn.eablkybsjg(product.wflxmlrfwp(), null, draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i18 >> 3) & 896, 2);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            kcexrzcfyt.nufgyqmvbu(product.lqeggnwhkg(), product.eablkybsjg(), null, counterStyle, draadjrbmkVar4, draadjrbmkVarBtonecajqb, ((i18 << 6) & 7168) | (57344 & (i18 << 3)), 4);
            draadjrbmkVar5.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            draadjrbmkVar6 = draadjrbmkVar4;
        } else {
            if (i19 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(135960952);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ft0.nufgyqmvbu
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return btonecajqb.wkgbmnqykc((ProductCardEvent) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2100565029, i18, -1, "ru.myspar.proloyalty.common.view.product.compose.single.promo.ProductCardPromoInfo (ProductCardPromoInfo.kt:31)");
            }
            zynmafqrjb zynmafqrjbVarIobyxmoadg7 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt7 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg7 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar7 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar7.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg7, iobyxmoadgVar7.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt7, iobyxmoadgVar7.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar7.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg7, iobyxmoadgVar7.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar7 = vdvldrhtss.f26487iobyxmoadg;
            String strAgtfadlqog7 = product.agtfadlqog();
            z zVar7 = z.f44180iobyxmoadg;
            int i29 = z.f44181zoijcleaow;
            w6.btonecajqb(strAgtfadlqog7, null, l41.ppxfxbqfkf.iobyxmoadg(zVar7, draadjrbmkVarBtonecajqb, i29).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 3, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar7, draadjrbmkVarBtonecajqb, i29).zoijcleaow().rgvfuqvkyq(), draadjrbmkVarBtonecajqb, 0, 3120, 55290);
            androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar7, androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 1.0f, false, 2, null), draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1091222169);
            if (product.yggfygwlhe()) {
                zs0.wwaezpbzkn.eablkybsjg(product.wflxmlrfwp(), null, draadjrbmkVar4, draadjrbmkVarBtonecajqb, (i18 >> 3) & 896, 2);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            kcexrzcfyt.nufgyqmvbu(product.lqeggnwhkg(), product.eablkybsjg(), null, counterStyle, draadjrbmkVar4, draadjrbmkVarBtonecajqb, ((i18 << 6) & 7168) | (57344 & (i18 << 3)), 4);
            draadjrbmkVar5.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            draadjrbmkVar6 = draadjrbmkVar4;
        }
        a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ft0.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.eablkybsjg(product, counterStyle, wkgbmnqykcVar3, draadjrbmkVar6, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(ProductCardEvent it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
