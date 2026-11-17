package ku;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fu.kegysxyocb;
import igdgnonuha.z;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rgvfuqvkyq {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(String str, int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i16) {
        zoijcleaow(str, i13, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final String str, final int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        int i16;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        Integer numValueOf;
        String strPpxfxbqfkf;
        a0 a0VarWflxmlrfwp;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(405838797);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 == 0) {
            if ((i14 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i16 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(405838797, i16, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalContentRating (ProductCardHorizontalContentRating.kt:19)");
                }
                if (str != null) {
                    numValueOf = Integer.valueOf(i13);
                    strPpxfxbqfkf = null;
                    if (numValueOf.intValue() <= 0) {
                        numValueOf = null;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1046614675);
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        strPpxfxbqfkf = e0.gxszxtbevo.zoijcleaow(s40.gtknphoqwx.plural_reviews, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, draadjrbmkVarBtonecajqb, 0);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1046613722);
                    if (strPpxfxbqfkf == null) {
                        strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(s40.draadjrbmk.no_reviews, draadjrbmkVarBtonecajqb, 0);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_star_16, draadjrbmkVarBtonecajqb, 0);
                    z zVar = z.f44180iobyxmoadg;
                    int i18 = z.f44181zoijcleaow;
                    kegysxyocb.zoijcleaow(str, ppxfxbqfkfVarPpxfxbqfkf, strPpxfxbqfkf, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).zoijcleaow(), wkgbmnqykcVar3, y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).zdlpuopuiu(), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).cqumvgiudr(), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).esjtqupxsv(), draadjrbmkVarBtonecajqb, (i16 & 14) | ((i16 << 6) & 57344), 0);
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVarBtonecajqb = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ku.ojitshcjhn
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return rgvfuqvkyq.ppxfxbqfkf(str, i13, wkgbmnqykcVar2, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i16 & 147) == 146) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(405838797, i16, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalContentRating (ProductCardHorizontalContentRating.kt:19)");
            }
            if (str != null) {
                numValueOf = Integer.valueOf(i13);
                strPpxfxbqfkf = null;
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1046614675);
                if (numValueOf != null) {
                    int iIntValue2 = numValueOf.intValue();
                    strPpxfxbqfkf = e0.gxszxtbevo.zoijcleaow(s40.gtknphoqwx.plural_reviews, iIntValue2, new Object[]{Integer.valueOf(iIntValue2)}, draadjrbmkVarBtonecajqb, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1046613722);
                if (strPpxfxbqfkf == null) {
                    strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(s40.draadjrbmk.no_reviews, draadjrbmkVarBtonecajqb, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf2 = e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_star_16, draadjrbmkVarBtonecajqb, 0);
                z zVar2 = z.f44180iobyxmoadg;
                int i19 = z.f44181zoijcleaow;
                kegysxyocb.zoijcleaow(str, ppxfxbqfkfVarPpxfxbqfkf2, strPpxfxbqfkf, y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).zoijcleaow(), wkgbmnqykcVar3, y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).zdlpuopuiu(), y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).cqumvgiudr(), y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).esjtqupxsv(), draadjrbmkVarBtonecajqb, (i16 & 14) | ((i16 << 6) & 57344), 0);
            }
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(405838797, i16, -1, "ru.myspar.common.view.product.compose.single.horizontal.ProductCardHorizontalContentRating (ProductCardHorizontalContentRating.kt:19)");
            }
            if (str != null) {
                numValueOf = Integer.valueOf(i13);
                strPpxfxbqfkf = null;
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1046614675);
                if (numValueOf != null) {
                    int iIntValue3 = numValueOf.intValue();
                    strPpxfxbqfkf = e0.gxszxtbevo.zoijcleaow(s40.gtknphoqwx.plural_reviews, iIntValue3, new Object[]{Integer.valueOf(iIntValue3)}, draadjrbmkVarBtonecajqb, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1046613722);
                if (strPpxfxbqfkf == null) {
                    strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(s40.draadjrbmk.no_reviews, draadjrbmkVarBtonecajqb, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf3 = e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_star_16, draadjrbmkVarBtonecajqb, 0);
                z zVar3 = z.f44180iobyxmoadg;
                int i110 = z.f44181zoijcleaow;
                kegysxyocb.zoijcleaow(str, ppxfxbqfkfVarPpxfxbqfkf3, strPpxfxbqfkf, y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).zoijcleaow(), wkgbmnqykcVar3, y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).zdlpuopuiu(), y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).cqumvgiudr(), y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).esjtqupxsv(), draadjrbmkVarBtonecajqb, (i16 & 14) | ((i16 << 6) & 57344), 0);
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ku.ojitshcjhn
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return rgvfuqvkyq.ppxfxbqfkf(str, i13, wkgbmnqykcVar2, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
