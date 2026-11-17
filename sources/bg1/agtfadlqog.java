package bg1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import igdgnonuha.weqkydbzbr;
import igdgnonuha.z;
import java.util.Iterator;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class agtfadlqog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(tg.draadjrbmk draadjrbmkVar, dg1.wkgbmnqykc wkgbmnqykcVar) {
        draadjrbmkVar.invoke(wkgbmnqykcVar.zoijcleaow());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(dg1.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar) {
        String strEablkybsjg = wkgbmnqykcVar.eablkybsjg();
        if (wkgbmnqykcVar.nufgyqmvbu() && strEablkybsjg != null) {
            draadjrbmkVar.invoke(strEablkybsjg);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(tg.draadjrbmk draadjrbmkVar, dg1.wkgbmnqykc wkgbmnqykcVar) {
        draadjrbmkVar.invoke(wkgbmnqykcVar.iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(tg.draadjrbmk draadjrbmkVar, dg1.wkgbmnqykc wkgbmnqykcVar) {
        draadjrbmkVar.invoke(wkgbmnqykcVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void lqeggnwhkg(final dg1.wkgbmnqykc item, final tg.draadjrbmk onClick, final tg.draadjrbmk onCallClick, final tg.draadjrbmk onOrderNumberCopyClick, final tg.draadjrbmk onRateOrderClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        boolean z13;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int i16;
        boolean z14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClick, "onClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onCallClick, "onCallClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onOrderNumberCopyClick, "onOrderNumberCopyClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onRateOrderClick, "onRateOrderClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1614175735);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onCallClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onOrderNumberCopyClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onRateOrderClick) ? 16384 : 8192;
        }
        int i17 = i14 & 32;
        if (i17 != 0) {
            i15 |= 196608;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            if ((i13 & 196608) == 0) {
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 131072 : 65536;
            }
        }
        if ((i15 & 74899) == 74898 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1614175735, i15, -1, "ru.myspar.proloyalty.orders.impl.screens.orders.presentation.compose.OrdersListItem (OrdersListItem.kt:42)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar2, "rvOrders", null, null, false, 14, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1812287443);
            int i18 = i15 & 112;
            int i19 = i15 & 14;
            boolean z15 = (i18 == 32) | (i19 == 4);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: bg1.nufgyqmvbu
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return agtfadlqog.nufgyqmvbu(onClick, item);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f13 = 8;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(androidx.compose.foundation.eablkybsjg.nufgyqmvbu(wkgbmnqykcVarOjitshcjhn, false, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt, 15, null), w0.nufgyqmvbu.lqeggnwhkg(20), w0.nufgyqmvbu.lqeggnwhkg(f13)), 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(f13)), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 6);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            boolean zGxszxtbevo = item.gxszxtbevo();
            String strPpxfxbqfkf = item.ppxfxbqfkf();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-614304708);
            boolean z16 = ((i15 & 7168) == 2048) | (i19 == 4);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z16 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: bg1.dxjokdxxww
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return agtfadlqog.btonecajqb(onOrderNumberCopyClick, item);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i23 = i15;
            int i24 = 1;
            cqumvgiudr.zoijcleaow(zGxszxtbevo, strPpxfxbqfkf, (tg.iobyxmoadg) objYadqdtsiqt2, cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), draadjrbmkVarBtonecajqb, 3072, 0);
            weqkydbzbr.zoijcleaow(null, l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).rgvfuqvkyq(), w0.nufgyqmvbu.lqeggnwhkg(1), 0.0f, draadjrbmkVarBtonecajqb, 384, 9);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            draadjrbmkVar2.sopmlzcsov(-614295999);
            Iterator it = item.wkgbmnqykc().iobyxmoadg().iterator();
            while (it.hasNext()) {
                ppxfxbqfkf.zoijcleaow((dg1.ppxfxbqfkf) it.next(), cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, i24, null), draadjrbmkVar2, 48, 0);
                i24 = 1;
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.sopmlzcsov(-614290077);
            if (item.lqeggnwhkg()) {
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu2 = cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(vk0.lqeggnwhkg.proloyalty_qr_code_for_order_receipt, draadjrbmkVar2, 0);
                draadjrbmkVar2.sopmlzcsov(-614283220);
                if (i18 == 32) {
                    i16 = 4;
                    z14 = true;
                } else {
                    i16 = 4;
                    z14 = false;
                }
                boolean z17 = (i19 == i16) | z14;
                Object objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                if (z17 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: bg1.btonecajqb
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return agtfadlqog.gtknphoqwx(onClick, item);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVar2.stevsuqkhv();
                i31.wkgbmnqykc.wkgbmnqykc(strPpxfxbqfkf2, (tg.iobyxmoadg) objYadqdtsiqt3, wkgbmnqykcVarNufgyqmvbu2, null, false, null, null, false, draadjrbmkVar2, 384, 248);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.sopmlzcsov(-614280949);
            if (item.dxjokdxxww()) {
                z13 = true;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu3 = cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
                String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(vk0.lqeggnwhkg.proloyalty_order_call_to_market, draadjrbmkVar2, 0);
                draadjrbmkVar2.sopmlzcsov(-614274122);
                boolean z18 = (i19 == 4) | ((i23 & 896) == 256);
                Object objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
                if (z18 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: bg1.gtknphoqwx
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return agtfadlqog.draadjrbmk(item, onCallClick);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVar2.stevsuqkhv();
                i31.lqeggnwhkg.wkgbmnqykc((tg.iobyxmoadg) objYadqdtsiqt4, strPpxfxbqfkf3, wkgbmnqykcVarNufgyqmvbu3, false, null, null, null, null, draadjrbmkVar2, 384, 248);
            } else {
                z13 = true;
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.sopmlzcsov(-614266768);
            if (!mj.kcexrzcfyt.zfvoamnweg(item.iobyxmoadg())) {
                String strPpxfxbqfkf4 = e0.gxszxtbevo.ppxfxbqfkf(b31.wflxmlrfwp.proloyalty_rate_purchase, draadjrbmkVar2, 0);
                draadjrbmkVar2.sopmlzcsov(-614261540);
                boolean z19 = (57344 & i23) == 16384 ? z13 : false;
                if (i19 != 4) {
                    z13 = false;
                }
                boolean z23 = z19 | z13;
                Object objYadqdtsiqt5 = draadjrbmkVar2.yadqdtsiqt();
                if (z23 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: bg1.draadjrbmk
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return agtfadlqog.dxjokdxxww(onRateOrderClick, item);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVar2.stevsuqkhv();
                i31.draadjrbmk.ppxfxbqfkf(strPpxfxbqfkf4, (tg.iobyxmoadg) objYadqdtsiqt5, null, null, i31.nufgyqmvbu.SMALL, draadjrbmkVar2, 24576, 12);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bg1.wflxmlrfwp
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return agtfadlqog.wflxmlrfwp(item, onClick, onCallClick, onOrderNumberCopyClick, onRateOrderClick, wkgbmnqykcVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, dg1.wkgbmnqykc wkgbmnqykcVar) {
        draadjrbmkVar.invoke(wkgbmnqykcVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(dg1.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, tg.draadjrbmk draadjrbmkVar4, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar5, int i15) {
        lqeggnwhkg(wkgbmnqykcVar, draadjrbmkVar, draadjrbmkVar2, draadjrbmkVar3, draadjrbmkVar4, wkgbmnqykcVar2, draadjrbmkVar5, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
