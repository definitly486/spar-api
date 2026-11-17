package uj1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import igdgnonuha.z;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.lists.presentation.model.PurchaseListUiModel;
import tg.oxmwwwfdhm;
import x.zynmafqrjb;
import yfnezrywwk.jpowsppfya;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vdvldrhtss {

    public static final class eablkybsjg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f113732yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f113733zdlpuopuiu;

        public eablkybsjg(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f113733zdlpuopuiu = draadjrbmkVar;
            this.f113732yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f113733zdlpuopuiu.invoke(this.f113732yggfygwlhe.get(i13));
        }
    }

    public static final class gxszxtbevo implements oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f113734yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f113735zdlpuopuiu;

        public gxszxtbevo(List list, tg.draadjrbmk draadjrbmkVar) {
            this.f113735zdlpuopuiu = list;
            this.f113734yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (draadjrbmkVar.ulzqkzuiru(eablkybsjgVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 32 : 16;
            }
            if (!draadjrbmkVar.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            PurchaseListUiModel purchaseListUiModel = (PurchaseListUiModel) this.f113735zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-1274071994);
            draadjrbmkVar.sopmlzcsov(1760019651);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f113734yggfygwlhe);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(this.f113734yggfygwlhe);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
            draadjrbmkVar.sopmlzcsov(1760022697);
            boolean zUlzqkzuiru2 = draadjrbmkVar.ulzqkzuiru(this.f113734yggfygwlhe);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(this.f113734yggfygwlhe);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            btonecajqb.lqeggnwhkg(eablkybsjgVar, purchaseListUiModel, draadjrbmkVar2, (tg.draadjrbmk) objYadqdtsiqt2, null, draadjrbmkVar, i15 & 14, 8);
            draadjrbmkVar.stevsuqkhv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class iobyxmoadg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f113736zdlpuopuiu;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
            this.f113736zdlpuopuiu = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((PurchaseListUiModel) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(PurchaseListUiModel it) {
            zdlpuopuiu.btonecajqb(it, "it");
            this.f113736zdlpuopuiu.invoke(new ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.ppxfxbqfkf(it));
        }
    }

    public static final class ppxfxbqfkf implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f113737zdlpuopuiu = new ppxfxbqfkf();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f113738yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f113739zdlpuopuiu;

        public wkgbmnqykc(tg.draadjrbmk draadjrbmkVar, List list) {
            this.f113739zdlpuopuiu = draadjrbmkVar;
            this.f113738yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f113739zdlpuopuiu.invoke(this.f113738yggfygwlhe.get(i13));
        }
    }

    static final class zoijcleaow implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f113740zdlpuopuiu;

        zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
            this.f113740zdlpuopuiu = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((String) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(String it) {
            zdlpuopuiu.btonecajqb(it, "it");
            this.f113740zdlpuopuiu.invoke(new ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.wkgbmnqykc(it));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.zoijcleaow.f99828iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object dxjokdxxww(PurchaseListUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(tj1.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        gxszxtbevo(iobyxmoadgVar, draadjrbmkVar, wkgbmnqykcVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x0333  */
    /* JADX WARN: Code duplicated, block: B:108:0x0389  */
    /* JADX WARN: Code duplicated, block: B:109:0x038b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0392  */
    /* JADX WARN: Code duplicated, block: B:114:0x039a  */
    /* JADX WARN: Code duplicated, block: B:118:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:122:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0212  */
    /* JADX WARN: Code duplicated, block: B:83:0x024a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0256  */
    /* JADX WARN: Code duplicated, block: B:87:0x025a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0279  */
    /* JADX WARN: Code duplicated, block: B:92:0x0287  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ec  */
    public static final void gxszxtbevo(final tj1.iobyxmoadg state, final tg.draadjrbmk dispatch, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        a.eablkybsjg.iobyxmoadg iobyxmoadgVar;
        int iHashCode;
        z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3;
        czzsidtyhn.eablkybsjg eablkybsjgVar;
        int iHashCode2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2;
        czzsidtyhn.vdvldrhtss vdvldrhtssVar;
        int i16;
        boolean z13;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        int iHashCode3;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg3;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow3;
        int i17;
        int i18;
        int i19;
        float f13;
        Object obj;
        int i23;
        int i24;
        Object objYadqdtsiqt2;
        boolean z14;
        boolean z15;
        Object objYadqdtsiqt3;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(state, "state");
        zdlpuopuiu.btonecajqb(dispatch, "dispatch");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1310419090);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(dispatch) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i25 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1310419090, i15, -1, "ru.myspar.proloyalty.purchases.impl.lists.presentation.compose.PurchaseListScreen (PurchaseListScreen.kt:44)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), null, 2, null), "ROOT_PURCHASE_LISTS", null, null, false, 14, null);
                iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn);
                iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = cdpycssgdh.gxszxtbevo(iobyxmoadgVar3, 0.0f, 1, null);
                eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
                zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar2.wkgbmnqykc());
                vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(ti1.nufgyqmvbu.proloyalty_purchases_lists_title, draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(776475899);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: uj1.draadjrbmk
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return vdvldrhtss.lqeggnwhkg(dispatch);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                e31.eablkybsjg.nufgyqmvbu(null, strPpxfxbqfkf, null, false, (tg.iobyxmoadg) objYadqdtsiqt, null, false, null, draadjrbmkVarBtonecajqb, 0, 237);
                draadjrbmkVar2.sopmlzcsov(776479802);
                if (!state.zoijcleaow()) {
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar, iobyxmoadgVar3, 1.0f, false, 2, null);
                    zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.ppxfxbqfkf(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVar2, 6);
                    iHashCode3 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVar2.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarPpxfxbqfkf);
                    iobyxmoadgVarIobyxmoadg3 = iobyxmoadgVar2.iobyxmoadg();
                    if (draadjrbmkVar2.draadjrbmk() == null) {
                        androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                    }
                    draadjrbmkVar2.pkzmftpjix();
                    if (draadjrbmkVar2.lqeggnwhkg()) {
                        draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg3);
                    } else {
                        draadjrbmkVar2.yggfygwlhe();
                    }
                    draadjrbmkVarIobyxmoadg3 = m1.iobyxmoadg(draadjrbmkVar2);
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, zynmafqrjbVarIobyxmoadg2, iobyxmoadgVar2.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar2.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow3 = iobyxmoadgVar2.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg3.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg3.yadqdtsiqt(), Integer.valueOf(iHashCode3))) {
                        draadjrbmkVarIobyxmoadg3.jyumaefscl(Integer.valueOf(iHashCode3));
                        draadjrbmkVarIobyxmoadg3.zdlpuopuiu(Integer.valueOf(iHashCode3), rgvfuqvkyqVarZoijcleaow3);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar2.wkgbmnqykc());
                    if (state.iobyxmoadg().isEmpty()) {
                        i17 = i16;
                        draadjrbmkVar2.sopmlzcsov(-1049650087);
                        i18 = 16;
                        float f14 = 16;
                        i19 = 2;
                        f13 = 0.0f;
                        obj = null;
                        uj1.ppxfxbqfkf.zoijcleaow(esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, 2, null), draadjrbmkVar2, 6, 0);
                        t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f14), draadjrbmkVar2, 6);
                        draadjrbmkVar2.stevsuqkhv();
                        i23 = 1;
                    } else {
                        draadjrbmkVar2.sopmlzcsov(-1050440029);
                        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar, w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar3, "rvLists", null, null, false, 14, null), 1.0f, false, 2, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 1, null);
                        draadjrbmkVar2.sopmlzcsov(1351597716);
                        boolean zLmojexxdyd = draadjrbmkVar2.lmojexxdyd(state);
                        if (i16 == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zLmojexxdyd | z14;
                        objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                        if (z15 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: uj1.wflxmlrfwp
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj2) {
                                    return vdvldrhtss.nufgyqmvbu(state, dispatch, (jpowsppfya) obj2);
                                }
                            };
                            draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVar2.stevsuqkhv();
                        i17 = i16;
                        yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarRgvfuqvkyq, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 0, 510);
                        draadjrbmkVar2.stevsuqkhv();
                        i18 = 16;
                        i23 = 1;
                        i19 = 2;
                        f13 = 0.0f;
                        obj = null;
                    }
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn2 = w31.nufgyqmvbu.ojitshcjhn(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar3, f13, i23, obj), w0.nufgyqmvbu.lqeggnwhkg(i18), f13, i19, obj), "btnCreateList", null, null, false, 14, null);
                    String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(ti1.nufgyqmvbu.proloyalty_purchases_lists_new_list_button, draadjrbmkVar2, 0);
                    i31.nufgyqmvbu nufgyqmvbuVar = i31.nufgyqmvbu.LARGE;
                    draadjrbmkVar2.sopmlzcsov(1351637988);
                    if (i17 == 32) {
                        i24 = i23;
                    } else {
                        i24 = 0;
                    }
                    objYadqdtsiqt2 = draadjrbmkVar2.yadqdtsiqt();
                    if (i24 == 0 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: uj1.agtfadlqog
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return vdvldrhtss.btonecajqb(dispatch);
                            }
                        };
                        draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVar2.stevsuqkhv();
                    i31.wkgbmnqykc.wkgbmnqykc(strPpxfxbqfkf2, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVarOjitshcjhn2, nufgyqmvbuVar, false, null, null, false, draadjrbmkVar2, 3072, 240);
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(20), draadjrbmkVar2, 6);
                    draadjrbmkVar2.cqumvgiudr();
                }
                draadjrbmkVar2.stevsuqkhv();
                o31.wkgbmnqykc.eablkybsjg(null, state.ppxfxbqfkf(), false, null, draadjrbmkVar2, 0, 13);
                draadjrbmkVar2.cqumvgiudr();
                draadjrbmkVar2.cqumvgiudr();
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
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: uj1.ojitshcjhn
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj2, Object obj3) {
                        return vdvldrhtss.gtknphoqwx(state, dispatch, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 147) == 146) {
            if (i25 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1310419090, i15, -1, "ru.myspar.proloyalty.purchases.impl.lists.presentation.compose.PurchaseListScreen (PurchaseListScreen.kt:44)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn3 = w31.nufgyqmvbu.ojitshcjhn(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), null, 2, null), "ROOT_PURCHASE_LISTS", null, null, false, 14, null);
            iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn3);
            iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar3, 0.0f, 1, null);
            eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo2);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar2.wkgbmnqykc());
            vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(ti1.nufgyqmvbu.proloyalty_purchases_lists_title, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(776475899);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: uj1.draadjrbmk
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return vdvldrhtss.lqeggnwhkg(dispatch);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: uj1.draadjrbmk
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return vdvldrhtss.lqeggnwhkg(dispatch);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            e31.eablkybsjg.nufgyqmvbu(null, strPpxfxbqfkf3, null, false, (tg.iobyxmoadg) objYadqdtsiqt, null, false, null, draadjrbmkVarBtonecajqb, 0, 237);
            draadjrbmkVar2.sopmlzcsov(776479802);
            if (!state.zoijcleaow()) {
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar, iobyxmoadgVar3, 1.0f, false, 2, null);
                zynmafqrjb zynmafqrjbVarIobyxmoadg4 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.ppxfxbqfkf(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVar2, 6);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVar2.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarPpxfxbqfkf2);
                iobyxmoadgVarIobyxmoadg3 = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVar2.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar2.pkzmftpjix();
                if (draadjrbmkVar2.lqeggnwhkg()) {
                    draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg3);
                } else {
                    draadjrbmkVar2.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg3 = m1.iobyxmoadg(draadjrbmkVar2);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, zynmafqrjbVarIobyxmoadg4, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow3 = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg3.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg3.jyumaefscl(Integer.valueOf(iHashCode3));
                    draadjrbmkVarIobyxmoadg3.zdlpuopuiu(Integer.valueOf(iHashCode3), rgvfuqvkyqVarZoijcleaow3);
                } else {
                    draadjrbmkVarIobyxmoadg3.jyumaefscl(Integer.valueOf(iHashCode3));
                    draadjrbmkVarIobyxmoadg3.zdlpuopuiu(Integer.valueOf(iHashCode3), rgvfuqvkyqVarZoijcleaow3);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar2.wkgbmnqykc());
                if (state.iobyxmoadg().isEmpty()) {
                    draadjrbmkVar2.sopmlzcsov(-1050440029);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq2 = esjtqupxsv.rgvfuqvkyq(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar, w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar3, "rvLists", null, null, false, 14, null), 1.0f, false, 2, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 1, null);
                    draadjrbmkVar2.sopmlzcsov(1351597716);
                    boolean zLmojexxdyd2 = draadjrbmkVar2.lmojexxdyd(state);
                    if (i16 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zLmojexxdyd2 | z14;
                    objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                    if (z15) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: uj1.wflxmlrfwp
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return vdvldrhtss.nufgyqmvbu(state, dispatch, (jpowsppfya) obj2);
                            }
                        };
                        draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                    } else {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: uj1.wflxmlrfwp
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return vdvldrhtss.nufgyqmvbu(state, dispatch, (jpowsppfya) obj2);
                            }
                        };
                        draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVar2.stevsuqkhv();
                    i17 = i16;
                    yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarRgvfuqvkyq2, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 0, 510);
                    draadjrbmkVar2.stevsuqkhv();
                    i18 = 16;
                    i23 = 1;
                    i19 = 2;
                    f13 = 0.0f;
                    obj = null;
                } else {
                    i17 = i16;
                    draadjrbmkVar2.sopmlzcsov(-1049650087);
                    i18 = 16;
                    float f15 = 16;
                    i19 = 2;
                    f13 = 0.0f;
                    obj = null;
                    uj1.ppxfxbqfkf.zoijcleaow(esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f15), 0.0f, 2, null), draadjrbmkVar2, 6, 0);
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f15), draadjrbmkVar2, 6);
                    draadjrbmkVar2.stevsuqkhv();
                    i23 = 1;
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn4 = w31.nufgyqmvbu.ojitshcjhn(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar3, f13, i23, obj), w0.nufgyqmvbu.lqeggnwhkg(i18), f13, i19, obj), "btnCreateList", null, null, false, 14, null);
                String strPpxfxbqfkf4 = e0.gxszxtbevo.ppxfxbqfkf(ti1.nufgyqmvbu.proloyalty_purchases_lists_new_list_button, draadjrbmkVar2, 0);
                i31.nufgyqmvbu nufgyqmvbuVar2 = i31.nufgyqmvbu.LARGE;
                draadjrbmkVar2.sopmlzcsov(1351637988);
                if (i17 == 32) {
                    i24 = i23;
                } else {
                    i24 = 0;
                }
                objYadqdtsiqt2 = draadjrbmkVar2.yadqdtsiqt();
                if (i24 == 0) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: uj1.agtfadlqog
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return vdvldrhtss.btonecajqb(dispatch);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: uj1.agtfadlqog
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return vdvldrhtss.btonecajqb(dispatch);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar2.stevsuqkhv();
                i31.wkgbmnqykc.wkgbmnqykc(strPpxfxbqfkf4, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVarOjitshcjhn4, nufgyqmvbuVar2, false, null, null, false, draadjrbmkVar2, 3072, 240);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(20), draadjrbmkVar2, 6);
                draadjrbmkVar2.cqumvgiudr();
            }
            draadjrbmkVar2.stevsuqkhv();
            o31.wkgbmnqykc.eablkybsjg(null, state.ppxfxbqfkf(), false, null, draadjrbmkVar2, 0, 13);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i25 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1310419090, i15, -1, "ru.myspar.proloyalty.purchases.impl.lists.presentation.compose.PurchaseListScreen (PurchaseListScreen.kt:44)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn5 = w31.nufgyqmvbu.ojitshcjhn(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(cdpycssgdh.gxszxtbevo(wkgbmnqykcVar3, 0.0f, 1, null), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), null, 2, null), "ROOT_PURCHASE_LISTS", null, null, false, 14, null);
            iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt7 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg7 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOjitshcjhn5);
            iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt7, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg7, iobyxmoadgVar2.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = cdpycssgdh.gxszxtbevo(iobyxmoadgVar3, 0.0f, 1, null);
            eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarIobyxmoadg5 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.dxjokdxxww(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt8 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg8 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarIobyxmoadg5, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt8, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg8, iobyxmoadgVar2.wkgbmnqykc());
            vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            String strPpxfxbqfkf5 = e0.gxszxtbevo.ppxfxbqfkf(ti1.nufgyqmvbu.proloyalty_purchases_lists_title, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(776475899);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: uj1.draadjrbmk
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return vdvldrhtss.lqeggnwhkg(dispatch);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: uj1.draadjrbmk
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return vdvldrhtss.lqeggnwhkg(dispatch);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            e31.eablkybsjg.nufgyqmvbu(null, strPpxfxbqfkf5, null, false, (tg.iobyxmoadg) objYadqdtsiqt, null, false, null, draadjrbmkVarBtonecajqb, 0, 237);
            draadjrbmkVar2.sopmlzcsov(776479802);
            if (!state.zoijcleaow()) {
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf3 = czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar, iobyxmoadgVar3, 1.0f, false, 2, null);
                zynmafqrjb zynmafqrjbVarIobyxmoadg6 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(eablkybsjgVar.ppxfxbqfkf(), iobyxmoadgVar.gtknphoqwx(), draadjrbmkVar2, 6);
                iHashCode3 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt9 = draadjrbmkVar2.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg9 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarPpxfxbqfkf3);
                iobyxmoadgVarIobyxmoadg3 = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVar2.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar2.pkzmftpjix();
                if (draadjrbmkVar2.lqeggnwhkg()) {
                    draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg3);
                } else {
                    draadjrbmkVar2.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg3 = m1.iobyxmoadg(draadjrbmkVar2);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, zynmafqrjbVarIobyxmoadg6, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wwaezpbzknVarKcexrzcfyt9, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow3 = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg3.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg3.jyumaefscl(Integer.valueOf(iHashCode3));
                    draadjrbmkVarIobyxmoadg3.zdlpuopuiu(Integer.valueOf(iHashCode3), rgvfuqvkyqVarZoijcleaow3);
                } else {
                    draadjrbmkVarIobyxmoadg3.jyumaefscl(Integer.valueOf(iHashCode3));
                    draadjrbmkVarIobyxmoadg3.zdlpuopuiu(Integer.valueOf(iHashCode3), rgvfuqvkyqVarZoijcleaow3);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg3, wkgbmnqykcVarEablkybsjg9, iobyxmoadgVar2.wkgbmnqykc());
                if (state.iobyxmoadg().isEmpty()) {
                    draadjrbmkVar2.sopmlzcsov(-1050440029);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq3 = esjtqupxsv.rgvfuqvkyq(czzsidtyhn.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar, w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar3, "rvLists", null, null, false, 14, null), 1.0f, false, 2, null), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 1, null);
                    draadjrbmkVar2.sopmlzcsov(1351597716);
                    boolean zLmojexxdyd3 = draadjrbmkVar2.lmojexxdyd(state);
                    if (i16 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zLmojexxdyd3 | z14;
                    objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                    if (z15) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: uj1.wflxmlrfwp
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return vdvldrhtss.nufgyqmvbu(state, dispatch, (jpowsppfya) obj2);
                            }
                        };
                        draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                    } else {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: uj1.wflxmlrfwp
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return vdvldrhtss.nufgyqmvbu(state, dispatch, (jpowsppfya) obj2);
                            }
                        };
                        draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVar2.stevsuqkhv();
                    i17 = i16;
                    yfnezrywwk.wkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVarRgvfuqvkyq3, null, null, false, null, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 0, 510);
                    draadjrbmkVar2.stevsuqkhv();
                    i18 = 16;
                    i23 = 1;
                    i19 = 2;
                    f13 = 0.0f;
                    obj = null;
                } else {
                    i17 = i16;
                    draadjrbmkVar2.sopmlzcsov(-1049650087);
                    i18 = 16;
                    float f16 = 16;
                    i19 = 2;
                    f13 = 0.0f;
                    obj = null;
                    uj1.ppxfxbqfkf.zoijcleaow(esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f16), 0.0f, 2, null), draadjrbmkVar2, 6, 0);
                    t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f16), draadjrbmkVar2, 6);
                    draadjrbmkVar2.stevsuqkhv();
                    i23 = 1;
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn6 = w31.nufgyqmvbu.ojitshcjhn(esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar3, f13, i23, obj), w0.nufgyqmvbu.lqeggnwhkg(i18), f13, i19, obj), "btnCreateList", null, null, false, 14, null);
                String strPpxfxbqfkf6 = e0.gxszxtbevo.ppxfxbqfkf(ti1.nufgyqmvbu.proloyalty_purchases_lists_new_list_button, draadjrbmkVar2, 0);
                i31.nufgyqmvbu nufgyqmvbuVar3 = i31.nufgyqmvbu.LARGE;
                draadjrbmkVar2.sopmlzcsov(1351637988);
                if (i17 == 32) {
                    i24 = i23;
                } else {
                    i24 = 0;
                }
                objYadqdtsiqt2 = draadjrbmkVar2.yadqdtsiqt();
                if (i24 == 0) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: uj1.agtfadlqog
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return vdvldrhtss.btonecajqb(dispatch);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: uj1.agtfadlqog
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return vdvldrhtss.btonecajqb(dispatch);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar2.stevsuqkhv();
                i31.wkgbmnqykc.wkgbmnqykc(strPpxfxbqfkf6, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVarOjitshcjhn6, nufgyqmvbuVar3, false, null, null, false, draadjrbmkVar2, 3072, 240);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(20), draadjrbmkVar2, 6);
                draadjrbmkVar2.cqumvgiudr();
            }
            draadjrbmkVar2.stevsuqkhv();
            o31.wkgbmnqykc.eablkybsjg(null, state.ppxfxbqfkf(), false, null, draadjrbmkVar2, 0, 13);
            draadjrbmkVar2.cqumvgiudr();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: uj1.ojitshcjhn
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return vdvldrhtss.gtknphoqwx(state, dispatch, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg.C2397iobyxmoadg.f99825iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tj1.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, jpowsppfya LazyColumn) {
        zdlpuopuiu.btonecajqb(LazyColumn, "$this$LazyColumn");
        List listIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        LazyColumn.nufgyqmvbu(listIobyxmoadg.size(), new wkgbmnqykc(new tg.draadjrbmk() { // from class: uj1.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return vdvldrhtss.dxjokdxxww((PurchaseListUiModel) obj);
            }
        }, listIobyxmoadg), new eablkybsjg(ppxfxbqfkf.f113737zdlpuopuiu, listIobyxmoadg), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new gxszxtbevo(listIobyxmoadg, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
