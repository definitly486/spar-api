package vp0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.tbqsvytpvh;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.vdvldrhtss;
import tp0.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    static final class iobyxmoadg implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f117671yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f117672zdlpuopuiu;

        iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar, long j13) {
            this.f117672zdlpuopuiu = iobyxmoadgVar;
            this.f117671yggfygwlhe = j13;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((tbqsvytpvh) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(tbqsvytpvh ActionBar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            zdlpuopuiu.btonecajqb(ActionBar, "$this$ActionBar");
            if ((i13 & 17) == 16 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-186804878, i13, -1, "ru.myspar.proloyalty.catalog.impl.product_list.presentation.compose.components.ProductListActionBar.<anonymous> (ProductListActionBar.kt:37)");
            }
            n31.zoijcleaow.zoijcleaow(b31.gxszxtbevo.ic_search, this.f117672zdlpuopuiu, w31.nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "SEARCH_BUTTON", null, null, false, 14, null), false, this.f117671yggfygwlhe, draadjrbmkVar, 0, 8);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(rgvfuqvkyq.iobyxmoadg iobyxmoadgVar, String str, String str2, long j13, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(iobyxmoadgVar, str, str2, j13, iobyxmoadgVar2, iobyxmoadgVar3, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0171  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0166  */
    public static final void zoijcleaow(final rgvfuqvkyq.iobyxmoadg headerType, final String headerTitle, final String str, final long j13, final tg.iobyxmoadg onBackClick, final tg.iobyxmoadg onSearchClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        String strWkgbmnqykc;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(headerType, "headerType");
        zdlpuopuiu.btonecajqb(headerTitle, "headerTitle");
        zdlpuopuiu.btonecajqb(onBackClick, "onBackClick");
        zdlpuopuiu.btonecajqb(onSearchClick, "onSearchClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1395598443);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(headerType) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(headerTitle) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.wkgbmnqykc(j13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onBackClick) ? 16384 : 8192;
        }
        if ((i14 & 32) != 0) {
            i15 |= 196608;
        } else if ((i13 & 196608) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onSearchClick) ? 131072 : 65536;
        }
        int i16 = i14 & 64;
        if (i16 == 0) {
            if ((1572864 & i13) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 1048576 : 524288;
            }
            if ((599187 & i15) == 599186 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1395598443, i15, -1, "ru.myspar.proloyalty.catalog.impl.product_list.presentation.compose.components.ProductListActionBar (ProductListActionBar.kt:24)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(2074172794);
                if (headerType == rgvfuqvkyq.iobyxmoadg.BRAND) {
                    strWkgbmnqykc = e0.gxszxtbevo.wkgbmnqykc(bp0.lqeggnwhkg.proloyalty_format_brand_title, new Object[]{headerTitle}, draadjrbmkVarBtonecajqb, 0);
                } else {
                    strWkgbmnqykc = headerTitle;
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                if (str != null) {
                    strWkgbmnqykc = null;
                }
                if (strWkgbmnqykc == null) {
                    strWkgbmnqykc = "";
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                e31.eablkybsjg.nufgyqmvbu(wkgbmnqykcVar3, strWkgbmnqykc, null, false, onBackClick, oipsdeybqn.dxjokdxxww(j13), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-186804878, true, new iobyxmoadg(onSearchClick, j13), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar2, ((i15 >> 18) & 14) | 12582912 | (57344 & i15) | ((i15 << 6) & 458752), 76);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: vp0.iobyxmoadg
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return zoijcleaow.ppxfxbqfkf(headerType, headerTitle, str, j13, onBackClick, onSearchClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 1572864;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((599187 & i15) == 599186) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1395598443, i15, -1, "ru.myspar.proloyalty.catalog.impl.product_list.presentation.compose.components.ProductListActionBar (ProductListActionBar.kt:24)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(2074172794);
            if (headerType == rgvfuqvkyq.iobyxmoadg.BRAND) {
                strWkgbmnqykc = e0.gxszxtbevo.wkgbmnqykc(bp0.lqeggnwhkg.proloyalty_format_brand_title, new Object[]{headerTitle}, draadjrbmkVarBtonecajqb, 0);
            } else {
                strWkgbmnqykc = headerTitle;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (str != null) {
                strWkgbmnqykc = null;
            }
            if (strWkgbmnqykc == null) {
                strWkgbmnqykc = "";
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            e31.eablkybsjg.nufgyqmvbu(wkgbmnqykcVar3, strWkgbmnqykc, null, false, onBackClick, oipsdeybqn.dxjokdxxww(j13), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-186804878, true, new iobyxmoadg(onSearchClick, j13), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar2, ((i15 >> 18) & 14) | 12582912 | (57344 & i15) | ((i15 << 6) & 458752), 76);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1395598443, i15, -1, "ru.myspar.proloyalty.catalog.impl.product_list.presentation.compose.components.ProductListActionBar (ProductListActionBar.kt:24)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(2074172794);
            if (headerType == rgvfuqvkyq.iobyxmoadg.BRAND) {
                strWkgbmnqykc = e0.gxszxtbevo.wkgbmnqykc(bp0.lqeggnwhkg.proloyalty_format_brand_title, new Object[]{headerTitle}, draadjrbmkVarBtonecajqb, 0);
            } else {
                strWkgbmnqykc = headerTitle;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (str != null) {
                strWkgbmnqykc = null;
            }
            if (strWkgbmnqykc == null) {
                strWkgbmnqykc = "";
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            e31.eablkybsjg.nufgyqmvbu(wkgbmnqykcVar3, strWkgbmnqykc, null, false, onBackClick, oipsdeybqn.dxjokdxxww(j13), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-186804878, true, new iobyxmoadg(onSearchClick, j13), draadjrbmkVarBtonecajqb, 54), draadjrbmkVar2, ((i15 >> 18) & 14) | 12582912 | (57344 & i15) | ((i15 << 6) & 458752), 76);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: vp0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.ppxfxbqfkf(headerType, headerTitle, str, j13, onBackClick, onSearchClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
