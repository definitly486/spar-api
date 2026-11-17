package ro0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import czzsidtyhn.uawqvzlxes;
import gg.wwaezpbzkn;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.z;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jyumaefscl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(boolean z13, boolean z14, String str, String str2, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        ppxfxbqfkf(z13, z14, str, str2, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0310  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x0156  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x024b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0305  */
    public static final void ppxfxbqfkf(final boolean z13, final boolean z14, final String balance, final String tooltip, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        tg.draadjrbmk draadjrbmkVar3;
        int i16;
        tg.draadjrbmk draadjrbmkVar4;
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        int iHashCode2;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar5;
        final tg.draadjrbmk draadjrbmkVar6;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(balance, "balance");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tooltip, "tooltip");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-1424354058);
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
            i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z14) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(balance) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(tooltip) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i17 = i14 & 16;
        if (i17 == 0) {
            if ((i13 & 24576) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3) ? 16384 : 8192;
            }
            i16 = i15;
            if ((i16 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(504359826);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: ro0.zdlpuopuiu
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return jyumaefscl.wkgbmnqykc(((Boolean) obj).booleanValue());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1424354058, i16, -1, "ru.myspar.proloyalty.cart.impl.presentation.compose.paymentbonuses.components.PaymentBonusesSwitch (PaymentBonusesSwitch.kt:37)");
                }
                iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
                a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = iobyxmoadgVar2.dxjokdxxww();
                czzsidtyhn.eablkybsjg eablkybsjgVar = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
                zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(eablkybsjgVar.nufgyqmvbu(), ppxfxbqfkfVarDxjokdxxww, draadjrbmkVarBtonecajqb, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow = tbqsvytpvh.zoijcleaow(roivzttewhVar, iobyxmoadgVar, 1.0f, false, 2, null);
                zynmafqrjb zynmafqrjbVarZoijcleaow2 = lrnfpwlwnk.zoijcleaow(eablkybsjgVar.nufgyqmvbu(), iobyxmoadgVar2.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow);
                iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar3.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow2, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = roivzttewhVar.ppxfxbqfkf(iobyxmoadgVar, iobyxmoadgVar2.dxjokdxxww());
                String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(fo0.ppxfxbqfkf.proloyalty_write_off_bonuses, draadjrbmkVarBtonecajqb, 0);
                z zVar = z.f44180iobyxmoadg;
                int i18 = z.f44181zoijcleaow;
                w6.btonecajqb(strPpxfxbqfkf, wkgbmnqykcVarPpxfxbqfkf, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).iobyxmoadg(), draadjrbmkVarBtonecajqb, 0, 0, 65528);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1749026397);
                if (!mj.kcexrzcfyt.zfvoamnweg(tooltip)) {
                    uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(6)), draadjrbmkVarBtonecajqb, 6);
                    rt0.ppxfxbqfkf.zoijcleaow(tooltip, draadjrbmkVarBtonecajqb, (i16 >> 9) & 14);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.ic_spar_green, draadjrbmkVarBtonecajqb, 0), null, null, zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i18).btonecajqb(), draadjrbmkVarBtonecajqb, 48, 4);
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(balance, esjtqupxsv.oxmwwwfdhm(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(4), 0.0f, 0.0f, 0.0f, 14, null), l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).dxjokdxxww(), draadjrbmkVar5, ((i16 >> 6) & 14) | 48, 0, 65528);
                u31.zoijcleaow.zoijcleaow(z14, draadjrbmkVar4, null, z13, null, null, draadjrbmkVar5, ((i16 >> 3) & 14) | ((i16 >> 9) & 112) | ((i16 << 9) & 7168), 52);
                draadjrbmkVar5.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                draadjrbmkVar6 = draadjrbmkVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar6 = draadjrbmkVar3;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ro0.yggfygwlhe
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return jyumaefscl.eablkybsjg(z13, z14, balance, tooltip, draadjrbmkVar6, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        draadjrbmkVar3 = draadjrbmkVar;
        i16 = i15;
        if ((i16 & 9363) == 9362) {
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(504359826);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ro0.zdlpuopuiu
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jyumaefscl.wkgbmnqykc(((Boolean) obj).booleanValue());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1424354058, i16, -1, "ru.myspar.proloyalty.cart.impl.presentation.compose.paymentbonuses.components.PaymentBonusesSwitch (PaymentBonusesSwitch.kt:37)");
            }
            iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu2 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar4 = a.eablkybsjg.f20iobyxmoadg;
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww2 = iobyxmoadgVar4.dxjokdxxww();
            czzsidtyhn.eablkybsjg eablkybsjgVar2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow3 = lrnfpwlwnk.zoijcleaow(eablkybsjgVar2.nufgyqmvbu(), ppxfxbqfkfVarDxjokdxxww2, draadjrbmkVarBtonecajqb, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu2);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow3, iobyxmoadgVar5.ppxfxbqfkf());
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
            roivzttewh roivzttewhVar2 = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow2 = tbqsvytpvh.zoijcleaow(roivzttewhVar2, iobyxmoadgVar, 1.0f, false, 2, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow4 = lrnfpwlwnk.zoijcleaow(eablkybsjgVar2.nufgyqmvbu(), iobyxmoadgVar4.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow4, iobyxmoadgVar5.ppxfxbqfkf());
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
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = roivzttewhVar2.ppxfxbqfkf(iobyxmoadgVar, iobyxmoadgVar4.dxjokdxxww());
            String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(fo0.ppxfxbqfkf.proloyalty_write_off_bonuses, draadjrbmkVarBtonecajqb, 0);
            z zVar2 = z.f44180iobyxmoadg;
            int i19 = z.f44181zoijcleaow;
            w6.btonecajqb(strPpxfxbqfkf2, wkgbmnqykcVarPpxfxbqfkf2, l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar2.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i19).iobyxmoadg(), draadjrbmkVarBtonecajqb, 0, 0, 65528);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1749026397);
            if (!mj.kcexrzcfyt.zfvoamnweg(tooltip)) {
                uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(6)), draadjrbmkVarBtonecajqb, 6);
                rt0.ppxfxbqfkf.zoijcleaow(tooltip, draadjrbmkVarBtonecajqb, (i16 >> 9) & 14);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.ic_spar_green, draadjrbmkVarBtonecajqb, 0), null, null, zVar2.iobyxmoadg(draadjrbmkVarBtonecajqb, i19).btonecajqb(), draadjrbmkVarBtonecajqb, 48, 4);
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(balance, esjtqupxsv.oxmwwwfdhm(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(4), 0.0f, 0.0f, 0.0f, 14, null), l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar2.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i19).dxjokdxxww(), draadjrbmkVar5, ((i16 >> 6) & 14) | 48, 0, 65528);
            u31.zoijcleaow.zoijcleaow(z14, draadjrbmkVar4, null, z13, null, null, draadjrbmkVar5, ((i16 >> 3) & 14) | ((i16 >> 9) & 112) | ((i16 << 9) & 7168), 52);
            draadjrbmkVar5.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar6 = draadjrbmkVar4;
        } else {
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(504359826);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ro0.zdlpuopuiu
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jyumaefscl.wkgbmnqykc(((Boolean) obj).booleanValue());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1424354058, i16, -1, "ru.myspar.proloyalty.cart.impl.presentation.compose.paymentbonuses.components.PaymentBonusesSwitch (PaymentBonusesSwitch.kt:37)");
            }
            iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu3 = cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
            a.eablkybsjg.iobyxmoadg iobyxmoadgVar6 = a.eablkybsjg.f20iobyxmoadg;
            a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww3 = iobyxmoadgVar6.dxjokdxxww();
            czzsidtyhn.eablkybsjg eablkybsjgVar3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg;
            zynmafqrjb zynmafqrjbVarZoijcleaow5 = lrnfpwlwnk.zoijcleaow(eablkybsjgVar3.nufgyqmvbu(), ppxfxbqfkfVarDxjokdxxww3, draadjrbmkVarBtonecajqb, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow5, iobyxmoadgVar7.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar7.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar7.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar7.wkgbmnqykc());
            roivzttewh roivzttewhVar3 = roivzttewh.f26469iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarZoijcleaow3 = tbqsvytpvh.zoijcleaow(roivzttewhVar3, iobyxmoadgVar, 1.0f, false, 2, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow6 = lrnfpwlwnk.zoijcleaow(eablkybsjgVar3.nufgyqmvbu(), iobyxmoadgVar6.draadjrbmk(), draadjrbmkVarBtonecajqb, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarZoijcleaow3);
            iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar7.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarZoijcleaow6, iobyxmoadgVar7.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar7.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar7.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            } else {
                draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar7.wkgbmnqykc());
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf3 = roivzttewhVar3.ppxfxbqfkf(iobyxmoadgVar, iobyxmoadgVar6.dxjokdxxww());
            String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(fo0.ppxfxbqfkf.proloyalty_write_off_bonuses, draadjrbmkVarBtonecajqb, 0);
            z zVar3 = z.f44180iobyxmoadg;
            int i110 = z.f44181zoijcleaow;
            w6.btonecajqb(strPpxfxbqfkf3, wkgbmnqykcVarPpxfxbqfkf3, l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar3.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i110).iobyxmoadg(), draadjrbmkVarBtonecajqb, 0, 0, 65528);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1749026397);
            if (!mj.kcexrzcfyt.zfvoamnweg(tooltip)) {
                uawqvzlxes.iobyxmoadg(cdpycssgdh.yggfygwlhe(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(6)), draadjrbmkVarBtonecajqb, 6);
                rt0.ppxfxbqfkf.zoijcleaow(tooltip, draadjrbmkVarBtonecajqb, (i16 >> 9) & 14);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(b31.gxszxtbevo.ic_spar_green, draadjrbmkVarBtonecajqb, 0), null, null, zVar3.iobyxmoadg(draadjrbmkVarBtonecajqb, i110).btonecajqb(), draadjrbmkVarBtonecajqb, 48, 4);
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(balance, esjtqupxsv.oxmwwwfdhm(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(4), 0.0f, 0.0f, 0.0f, 14, null), l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar3.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i110).dxjokdxxww(), draadjrbmkVar5, ((i16 >> 6) & 14) | 48, 0, 65528);
            u31.zoijcleaow.zoijcleaow(z14, draadjrbmkVar4, null, z13, null, null, draadjrbmkVar5, ((i16 >> 3) & 14) | ((i16 >> 9) & 112) | ((i16 << 9) & 7168), 52);
            draadjrbmkVar5.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar6 = draadjrbmkVar4;
        }
        a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ro0.yggfygwlhe
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return jyumaefscl.eablkybsjg(z13, z14, balance, tooltip, draadjrbmkVar6, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(boolean z13) {
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
