package kl0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.nufgyqmvbu;
import androidx.compose.runtime.wwaezpbzkn;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import metgxyhuhe.gtknphoqwx;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {
    public static final void eablkybsjg(final cl0.zoijcleaow currentAddressType, final boolean z13, final tg.iobyxmoadg onDeliveryClick, final tg.iobyxmoadg onAddressClick, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(currentAddressType, "currentAddressType");
        zdlpuopuiu.btonecajqb(onDeliveryClick, "onDeliveryClick");
        zdlpuopuiu.btonecajqb(onAddressClick, "onAddressClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(844193248);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(currentAddressType) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDeliveryClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onAddressClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i15 = i14;
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(844193248, i15, -1, "ru.myspar.proloyalty.address.impl.address_type_toggle.presentation.compose.AddressTypeItems (AddressTypeItems.kt:39)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = cdpycssgdh.wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            int iHashCode = Long.hashCode(nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarWkgbmnqykc);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            int i16 = 6 | ((i15 << 6) & 7168);
            ppxfxbqfkf(roivzttewhVar, null, currentAddressType == cl0.zoijcleaow.Delivery, z13, el0.gxszxtbevo.proloyalty_delivery_toggle_title, b31.gxszxtbevo.delivery_icon, onDeliveryClick, draadjrbmkVarBtonecajqb, i16 | ((i15 << 12) & 3670016), 1);
            ppxfxbqfkf(roivzttewhVar, null, currentAddressType == cl0.zoijcleaow.PickUp, z13, el0.gxszxtbevo.proloyalty_pickup_toggle_title, b31.gxszxtbevo.ic_spar_icon, onAddressClick, draadjrbmkVarBtonecajqb, i16 | ((i15 << 9) & 3670016), 1);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: kl0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.gxszxtbevo(currentAddressType, z13, onDeliveryClick, onAddressClick, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(cl0.zoijcleaow zoijcleaowVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, draadjrbmk draadjrbmkVar, int i14) {
        eablkybsjg(zoijcleaowVar, z13, iobyxmoadgVar, iobyxmoadgVar2, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final tbqsvytpvh tbqsvytpvhVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final boolean z13, final boolean z14, final int i13, final int i14, final tg.iobyxmoadg onClick, draadjrbmk draadjrbmkVar, final int i15, final int i16) {
        int i17;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        long jLereixgezr;
        draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        zdlpuopuiu.btonecajqb(tbqsvytpvhVar, "<this>");
        zdlpuopuiu.btonecajqb(onClick, "onClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-347119796);
        if ((i16 & Integer.MIN_VALUE) != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(tbqsvytpvhVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 |= 48;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            if ((i15 & 48) == 0) {
                i17 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
        }
        if ((i16 & 2) != 0) {
            i17 |= 384;
        } else if ((i15 & 384) == 0) {
            i17 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i16 & 4) != 0) {
            i17 |= 3072;
        } else if ((i15 & 3072) == 0) {
            i17 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i16 & 8) != 0) {
            i17 |= 24576;
        } else if ((i15 & 24576) == 0) {
            i17 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 16384 : 8192;
        }
        if ((i16 & 16) != 0) {
            i17 |= 196608;
        } else if ((i15 & 196608) == 0) {
            i17 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i14) ? 131072 : 65536;
        }
        if ((i16 & 32) != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            i17 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? 1048576 : 524288;
        }
        if ((599187 & i17) == 599186 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-347119796, i17, -1, "ru.myspar.proloyalty.address.impl.address_type_toggle.presentation.compose.AddressTypeItem (AddressTypeItems.kt:70)");
            }
            if (z13) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1554513855);
                jLereixgezr = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).eablkybsjg();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else if (z14) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1554512029);
                jLereixgezr = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).cqumvgiudr();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1554510301);
                jLereixgezr = l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).lereixgezr();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            long j13 = jLereixgezr;
            int i19 = i17;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(tbqsvytpvhVar, cdpycssgdh.gxszxtbevo(wkgbmnqykcVar2, 0.0f, 1, null), 1.0f, false, 2, null);
            boolean z15 = !z13 && z14;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1554501088);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar3 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar2;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarZoijcleaow, draadjrbmkVar3, null, z15, null, null, onClick, 24, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.ppxfxbqfkf(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVar2, 54);
            int iHashCode = Long.hashCode(nufgyqmvbu.zoijcleaow(draadjrbmkVar2, 0));
            wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar2.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar2, wkgbmnqykcVarGxszxtbevo);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (draadjrbmkVar2.draadjrbmk() == null) {
                nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar2.pkzmftpjix();
            if (draadjrbmkVar2.lqeggnwhkg()) {
                draadjrbmkVar2.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar2.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar2);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(i14, draadjrbmkVar2, (i19 >> 15) & 14), null, cdpycssgdh.vdvldrhtss(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(24)), j13, draadjrbmkVar2, 432, 0);
            t31.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(12), draadjrbmkVar2, 6);
            w6.btonecajqb(e0.gxszxtbevo.ppxfxbqfkf(i13, draadjrbmkVar2, (i19 >> 12) & 14), null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVar2, z.f44181zoijcleaow).nufgyqmvbu(), draadjrbmkVar2, 0, 0, 65530);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: kl0.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.wkgbmnqykc(tbqsvytpvhVar, wkgbmnqykcVar3, z13, z14, i13, i14, onClick, i15, i16, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc(tbqsvytpvh tbqsvytpvhVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, boolean z14, int i13, int i14, tg.iobyxmoadg iobyxmoadgVar, int i15, int i16, draadjrbmk draadjrbmkVar, int i17) {
        ppxfxbqfkf(tbqsvytpvhVar, wkgbmnqykcVar, z13, z14, i13, i14, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i15 | 1), i16);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
