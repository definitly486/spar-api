package bg1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import ikoacuggdj.dsvhmnatus;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cqumvgiudr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(boolean z13, String str, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(z13, str, iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x020a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0215  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final boolean z13, final String orderIdFormatted, final tg.iobyxmoadg onOrderNumberCopyClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        int i17;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderIdFormatted, "orderIdFormatted");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onOrderNumberCopyClick, "onOrderNumberCopyClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1449824841);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(orderIdFormatted) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onOrderNumberCopyClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i16 = i15;
            if ((i16 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1449824841, i16, -1, "ru.myspar.proloyalty.orders.impl.screens.orders.presentation.compose.OrdersTitleItem (OrdersTitleItem.kt:35)");
                }
                czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg interfaceC0470eablkybsjgNufgyqmvbu = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu();
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(interfaceC0470eablkybsjgNufgyqmvbu, iobyxmoadgVar.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                float f13 = 20;
                n31.gxszxtbevo.wkgbmnqykc(onOrderNumberCopyClick, cdpycssgdh.wflxmlrfwp(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar3, "lvCopyToCheck", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f13)), draadjrbmkVarBtonecajqb, (i16 >> 6) & 14, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = roivzttewhVar.ppxfxbqfkf(tbqsvytpvh.zoijcleaow(roivzttewhVar, androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar3, "tvOrderId", null, null, false, 14, null), 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, 2, null), 1.0f, false, 2, null), iobyxmoadgVar.iobyxmoadg());
                int iGxszxtbevo = v0.btonecajqb.f114934zoijcleaow.gxszxtbevo();
                z zVar = z.f44180iobyxmoadg;
                int i19 = z.f44181zoijcleaow;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                w6.btonecajqb(orderIdFormatted, wkgbmnqykcVarPpxfxbqfkf, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).iwizpuwonk(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iGxszxtbevo), 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i19).zoijcleaow().draadjrbmk(), draadjrbmkVarBtonecajqb, (i16 >> 3) & 14, 0, 65016);
                if (z13) {
                    i17 = b31.gxszxtbevo.ic_attention_error;
                } else {
                    i17 = b31.gxszxtbevo.ic_arrow_right_green;
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                dsvhmnatus.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(i17, draadjrbmkVar2, 0), null, cdpycssgdh.wflxmlrfwp(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar3, "ivArrow", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f13)), null, null, 0.0f, null, draadjrbmkVar2, 48, 120);
                draadjrbmkVar2.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar5;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bg1.iwizpuwonk
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return cqumvgiudr.ppxfxbqfkf(z13, orderIdFormatted, onOrderNumberCopyClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i15;
        if ((i16 & 1171) == 1170) {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1449824841, i16, -1, "ru.myspar.proloyalty.orders.impl.screens.orders.presentation.compose.OrdersTitleItem (OrdersTitleItem.kt:35)");
            }
            czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg interfaceC0470eablkybsjgNufgyqmvbu2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar4 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow2 = lrnfpwlwnk.zoijcleaow(interfaceC0470eablkybsjgNufgyqmvbu2, iobyxmoadgVar4.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow2, iobyxmoadgVar5.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar5.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar5.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar5.wkgbmnqykc());
            roivzttewh roivzttewhVar2 = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f14 = 20;
            n31.gxszxtbevo.wkgbmnqykc(onOrderNumberCopyClick, cdpycssgdh.wflxmlrfwp(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar6, "lvCopyToCheck", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f14)), draadjrbmkVarBtonecajqb, (i16 >> 6) & 14, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = roivzttewhVar2.ppxfxbqfkf(tbqsvytpvh.zoijcleaow(roivzttewhVar2, androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar6, "tvOrderId", null, null, false, 14, null), 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, 2, null), 1.0f, false, 2, null), iobyxmoadgVar4.iobyxmoadg());
            int iGxszxtbevo2 = v0.btonecajqb.f114934zoijcleaow.gxszxtbevo();
            z zVar2 = z.f44180iobyxmoadg;
            int i110 = z.f44181zoijcleaow;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            w6.btonecajqb(orderIdFormatted, wkgbmnqykcVarPpxfxbqfkf2, l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i110).iwizpuwonk(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iGxszxtbevo2), 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i110).zoijcleaow().draadjrbmk(), draadjrbmkVarBtonecajqb, (i16 >> 3) & 14, 0, 65016);
            if (z13) {
                i17 = b31.gxszxtbevo.ic_attention_error;
            } else {
                i17 = b31.gxszxtbevo.ic_arrow_right_green;
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            dsvhmnatus.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(i17, draadjrbmkVar2, 0), null, cdpycssgdh.wflxmlrfwp(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar6, "ivArrow", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f14)), null, null, 0.0f, null, draadjrbmkVar2, 48, 120);
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar6;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1449824841, i16, -1, "ru.myspar.proloyalty.orders.impl.screens.orders.presentation.compose.OrdersTitleItem (OrdersTitleItem.kt:35)");
            }
            czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg interfaceC0470eablkybsjgNufgyqmvbu3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu();
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar7 = a.eablkybsjg.f20iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow3 = lrnfpwlwnk.zoijcleaow(interfaceC0470eablkybsjgNufgyqmvbu3, iobyxmoadgVar7.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow3, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar8.wkgbmnqykc());
            roivzttewh roivzttewhVar3 = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar9 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            float f15 = 20;
            n31.gxszxtbevo.wkgbmnqykc(onOrderNumberCopyClick, cdpycssgdh.wflxmlrfwp(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar9, "lvCopyToCheck", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f15)), draadjrbmkVarBtonecajqb, (i16 >> 6) & 14, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf3 = roivzttewhVar3.ppxfxbqfkf(tbqsvytpvh.zoijcleaow(roivzttewhVar3, androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(cdpycssgdh.nufgyqmvbu(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar9, "tvOrderId", null, null, false, 14, null), 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, 2, null), 1.0f, false, 2, null), iobyxmoadgVar7.iobyxmoadg());
            int iGxszxtbevo3 = v0.btonecajqb.f114934zoijcleaow.gxszxtbevo();
            z zVar3 = z.f44180iobyxmoadg;
            int i111 = z.f44181zoijcleaow;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            w6.btonecajqb(orderIdFormatted, wkgbmnqykcVarPpxfxbqfkf3, l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i111).iwizpuwonk(), 0L, null, null, null, 0L, null, v0.btonecajqb.nufgyqmvbu(iGxszxtbevo3), 0L, 0, false, 0, 0, null, l41.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i111).zoijcleaow().draadjrbmk(), draadjrbmkVarBtonecajqb, (i16 >> 3) & 14, 0, 65016);
            if (z13) {
                i17 = b31.gxszxtbevo.ic_attention_error;
            } else {
                i17 = b31.gxszxtbevo.ic_arrow_right_green;
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            dsvhmnatus.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(i17, draadjrbmkVar2, 0), null, cdpycssgdh.wflxmlrfwp(w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar9, "ivArrow", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f15)), null, null, 0.0f, null, draadjrbmkVar2, 48, 120);
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar7;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bg1.iwizpuwonk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return cqumvgiudr.ppxfxbqfkf(z13, orderIdFormatted, onOrderNumberCopyClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
