package xr;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.vdvldrhtss;
import czzsidtyhn.wflxmlrfwp;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.w6;
import igdgnonuha.yggfygwlhe;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(bs.gxszxtbevo gxszxtbevoVar, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(gxszxtbevoVar, iobyxmoadgVar, iobyxmoadgVar2, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0220  */
    /* JADX WARN: Code duplicated, block: B:80:0x023c  */
    /* JADX WARN: Code duplicated, block: B:81:0x023e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0288  */
    /* JADX WARN: Code duplicated, block: B:86:0x0296  */
    /* JADX WARN: Code duplicated, block: B:90:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final bs.gxszxtbevo userReviews, final tg.iobyxmoadg onAddReviewClick, final tg.iobyxmoadg onMoreReviewsClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        oipsdeybqn oipsdeybqnVar;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        Integer numValueOf;
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar;
        float f13;
        int i16;
        float f14;
        yggfygwlhe yggfygwlheVarNufgyqmvbu;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(userReviews, "userReviews");
        zdlpuopuiu.btonecajqb(onAddReviewClick, "onAddReviewClick");
        zdlpuopuiu.btonecajqb(onMoreReviewsClick, "onMoreReviewsClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-926162661);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(userReviews) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onAddReviewClick) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onMoreReviewsClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-926162661, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.reviews.ReviewsBlock (ReviewsBlock.kt:34)");
                }
                oipsdeybqnVar = (oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(sr.lqeggnwhkg.iobyxmoadg());
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "rvReviews", null, null, false, 14, null);
                zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
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
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
                numValueOf = Integer.valueOf(userReviews.ppxfxbqfkf());
                if (userReviews.zoijcleaow().isEmpty()) {
                    numValueOf = null;
                }
                iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                f13 = 16;
                i16 = i15 >> 3;
                wkgbmnqykc.zoijcleaow(numValueOf, onMoreReviewsClick, esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), draadjrbmkVarBtonecajqb, (i16 & 112) | 384, 0);
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                if (userReviews.zoijcleaow().isEmpty()) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1301935339);
                    String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(pm.dxjokdxxww.no_reviews_emptystate, draadjrbmkVarBtonecajqb, 0);
                    z zVar = z.f44180iobyxmoadg;
                    int i18 = z.f44181zoijcleaow;
                    f14 = 0.0f;
                    w6.btonecajqb(strPpxfxbqfkf, esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).cqumvgiudr(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).iobyxmoadg()), draadjrbmkVarBtonecajqb, 48, 0, 65528);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    f14 = 0.0f;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1302254019);
                    btonecajqb.wkgbmnqykc(userReviews.zoijcleaow(), l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar, "tapeReviews", null, null, false, 14, null), draadjrbmkVarBtonecajqb, 0, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1011846664);
                if (userReviews.iobyxmoadg() != null) {
                    i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                    String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(userReviews.iobyxmoadg().intValue(), draadjrbmkVarBtonecajqb, 0);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1011853448);
                    if (oipsdeybqnVar == null) {
                        yggfygwlheVarNufgyqmvbu = null;
                    } else {
                        oipsdeybqnVar.iwizpuwonk();
                        yggfygwlheVarNufgyqmvbu = igdgnonuha.jyumaefscl.f43186iobyxmoadg.nufgyqmvbu(oipsdeybqn.f38945zoijcleaow.gxszxtbevo(), oipsdeybqnVar.iwizpuwonk(), oipsdeybqnVar.iwizpuwonk(), draadjrbmkVarBtonecajqb, (igdgnonuha.jyumaefscl.f43181draadjrbmk << 9) | 6, 0);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    a50.lqeggnwhkg.wkgbmnqykc(onAddReviewClick, strPpxfxbqfkf2, esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, f14, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), f14, 2, null), false, null, yggfygwlheVarNufgyqmvbu, null, null, draadjrbmkVarBtonecajqb, (i16 & 14) | 384, 216);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVarBtonecajqb = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: xr.iobyxmoadg
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return zoijcleaow.ppxfxbqfkf(userReviews, onAddReviewClick, onMoreReviewsClick, wkgbmnqykcVar2, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 1171) == 1170) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-926162661, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.reviews.ReviewsBlock (ReviewsBlock.kt:34)");
            }
            oipsdeybqnVar = (oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(sr.lqeggnwhkg.iobyxmoadg());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj2 = l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "rvReviews", null, null, false, 14, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg2 = wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarPmvmpeiblj2);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar2 = vdvldrhtss.f26487iobyxmoadg;
            numValueOf = Integer.valueOf(userReviews.ppxfxbqfkf());
            if (userReviews.zoijcleaow().isEmpty()) {
                numValueOf = null;
            }
            iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            f13 = 16;
            i16 = i15 >> 3;
            wkgbmnqykc.zoijcleaow(numValueOf, onMoreReviewsClick, esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), draadjrbmkVarBtonecajqb, (i16 & 112) | 384, 0);
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            if (userReviews.zoijcleaow().isEmpty()) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1301935339);
                String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(pm.dxjokdxxww.no_reviews_emptystate, draadjrbmkVarBtonecajqb, 0);
                z zVar2 = z.f44180iobyxmoadg;
                int i19 = z.f44181zoijcleaow;
                f14 = 0.0f;
                w6.btonecajqb(strPpxfxbqfkf3, esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).cqumvgiudr(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i19).iobyxmoadg()), draadjrbmkVarBtonecajqb, 48, 0, 65528);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                f14 = 0.0f;
                draadjrbmkVarBtonecajqb.sopmlzcsov(1302254019);
                btonecajqb.wkgbmnqykc(userReviews.zoijcleaow(), l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar, "tapeReviews", null, null, false, 14, null), draadjrbmkVarBtonecajqb, 0, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1011846664);
            if (userReviews.iobyxmoadg() != null) {
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                String strPpxfxbqfkf4 = e0.gxszxtbevo.ppxfxbqfkf(userReviews.iobyxmoadg().intValue(), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1011853448);
                if (oipsdeybqnVar == null) {
                    yggfygwlheVarNufgyqmvbu = null;
                } else {
                    oipsdeybqnVar.iwizpuwonk();
                    yggfygwlheVarNufgyqmvbu = igdgnonuha.jyumaefscl.f43186iobyxmoadg.nufgyqmvbu(oipsdeybqn.f38945zoijcleaow.gxszxtbevo(), oipsdeybqnVar.iwizpuwonk(), oipsdeybqnVar.iwizpuwonk(), draadjrbmkVarBtonecajqb, (igdgnonuha.jyumaefscl.f43181draadjrbmk << 9) | 6, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                a50.lqeggnwhkg.wkgbmnqykc(onAddReviewClick, strPpxfxbqfkf4, esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, f14, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), f14, 2, null), false, null, yggfygwlheVarNufgyqmvbu, null, null, draadjrbmkVarBtonecajqb, (i16 & 14) | 384, 216);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-926162661, i15, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.reviews.ReviewsBlock (ReviewsBlock.kt:34)");
            }
            oipsdeybqnVar = (oipsdeybqn) draadjrbmkVarBtonecajqb.ojitshcjhn(sr.lqeggnwhkg.iobyxmoadg());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj3 = l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "rvReviews", null, null, false, 14, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg3 = wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarPmvmpeiblj3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar4.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar3 = vdvldrhtss.f26487iobyxmoadg;
            numValueOf = Integer.valueOf(userReviews.ppxfxbqfkf());
            if (userReviews.zoijcleaow().isEmpty()) {
                numValueOf = null;
            }
            iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            f13 = 16;
            i16 = i15 >> 3;
            wkgbmnqykc.zoijcleaow(numValueOf, onMoreReviewsClick, esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), draadjrbmkVarBtonecajqb, (i16 & 112) | 384, 0);
            i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            if (userReviews.zoijcleaow().isEmpty()) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1301935339);
                String strPpxfxbqfkf5 = e0.gxszxtbevo.ppxfxbqfkf(pm.dxjokdxxww.no_reviews_emptystate, draadjrbmkVarBtonecajqb, 0);
                z zVar3 = z.f44180iobyxmoadg;
                int i110 = z.f44181zoijcleaow;
                f14 = 0.0f;
                w6.btonecajqb(strPpxfxbqfkf5, esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null), y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).cqumvgiudr(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i110).iobyxmoadg()), draadjrbmkVarBtonecajqb, 48, 0, 65528);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                f14 = 0.0f;
                draadjrbmkVarBtonecajqb.sopmlzcsov(1302254019);
                btonecajqb.wkgbmnqykc(userReviews.zoijcleaow(), l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar, "tapeReviews", null, null, false, 14, null), draadjrbmkVarBtonecajqb, 0, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1011846664);
            if (userReviews.iobyxmoadg() != null) {
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                String strPpxfxbqfkf6 = e0.gxszxtbevo.ppxfxbqfkf(userReviews.iobyxmoadg().intValue(), draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1011853448);
                if (oipsdeybqnVar == null) {
                    yggfygwlheVarNufgyqmvbu = null;
                } else {
                    oipsdeybqnVar.iwizpuwonk();
                    yggfygwlheVarNufgyqmvbu = igdgnonuha.jyumaefscl.f43186iobyxmoadg.nufgyqmvbu(oipsdeybqn.f38945zoijcleaow.gxszxtbevo(), oipsdeybqnVar.iwizpuwonk(), oipsdeybqnVar.iwizpuwonk(), draadjrbmkVarBtonecajqb, (igdgnonuha.jyumaefscl.f43181draadjrbmk << 9) | 6, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                a50.lqeggnwhkg.wkgbmnqykc(onAddReviewClick, strPpxfxbqfkf6, esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, f14, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), f14, 2, null), false, null, yggfygwlheVarNufgyqmvbu, null, null, draadjrbmkVarBtonecajqb, (i16 & 14) | 384, 216);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: xr.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(userReviews, onAddReviewClick, onMoreReviewsClick, wkgbmnqykcVar2, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
