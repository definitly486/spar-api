package nr;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import czzsidtyhn.tbqsvytpvh;
import igdgnonuha.t;
import igdgnonuha.w6;
import igdgnonuha.z;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lereixgezr {
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:107:0x021e  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:76:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    /* JADX WARN: Code duplicated, block: B:85:0x0188  */
    /* JADX WARN: Code duplicated, block: B:88:0x0195  */
    /* JADX WARN: Code duplicated, block: B:90:0x019d  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ce  */
    public static final void btonecajqb(final List historyItems, final tg.draadjrbmk onHistoryClick, final tg.draadjrbmk onDeleteHistoryClick, final tg.iobyxmoadg onClearAllClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int i17;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        Iterator it;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final String str;
        int i18;
        int i19;
        Object objYadqdtsiqt;
        int i23;
        int i24;
        Object objYadqdtsiqt2;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(historyItems, "historyItems");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHistoryClick, "onHistoryClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteHistoryClick, "onDeleteHistoryClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClearAllClick, "onClearAllClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1478617873);
        int i25 = 1;
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(historyItems) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHistoryClick) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDeleteHistoryClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClearAllClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i26 = i14 & 16;
        if (i26 == 0) {
            if ((i13 & 24576) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 16384 : 8192;
            }
            i16 = i15;
            if ((i16 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i26 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1478617873, i16, -1, "ru.myspar.catalog.impl.search.compose.SearchHistory (SearchHistory.kt:35)");
                }
                x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(40)), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 6);
                i17 = 0;
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
                gxszxtbevo(onClearAllClick, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), draadjrbmkVarBtonecajqb, ((i16 >> 9) & 14) | 48, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(784149536);
                it = historyItems.iterator();
                while (it.hasNext()) {
                    str = (String) it.next();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-257197072);
                    if ((i16 & 112) == 32) {
                        i18 = i25;
                    } else {
                        i18 = i17;
                    }
                    i19 = i18 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 1 : 0);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (i19 == 0 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nr.yggfygwlhe
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lereixgezr.gtknphoqwx(onHistoryClick, str);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-257195210);
                    if ((i16 & 896) == 256) {
                        i23 = i25;
                    } else {
                        i23 = 0;
                    }
                    i24 = i23 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 1 : 0);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (i24 == 0 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: nr.jyumaefscl
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lereixgezr.draadjrbmk(onDeleteHistoryClick, str);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    nufgyqmvbu(str, iobyxmoadgVar2, (tg.iobyxmoadg) objYadqdtsiqt2, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, i25, null), draadjrbmkVarBtonecajqb, 3072, 0);
                    i25 = i25;
                    wkgbmnqykcVar3 = wkgbmnqykcVar3;
                    i16 = i16;
                    draadjrbmkVarBtonecajqb = draadjrbmkVarBtonecajqb;
                    i17 = 0;
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                draadjrbmkVar2.stevsuqkhv();
                draadjrbmkVar2.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: nr.iwizpuwonk
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return lereixgezr.wflxmlrfwp(historyItems, onHistoryClick, onDeleteHistoryClick, onClearAllClick, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i15;
        if ((i16 & 9363) == 9362) {
            if (i26 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1478617873, i16, -1, "ru.myspar.catalog.impl.search.compose.SearchHistory (SearchHistory.kt:35)");
            }
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(40)), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 6);
            i17 = 0;
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
            czzsidtyhn.vdvldrhtss vdvldrhtssVar2 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            gxszxtbevo(onClearAllClick, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), draadjrbmkVarBtonecajqb, ((i16 >> 9) & 14) | 48, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(784149536);
            it = historyItems.iterator();
            while (it.hasNext()) {
                str = (String) it.next();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-257197072);
                if ((i16 & 112) == 32) {
                    i18 = i25;
                } else {
                    i18 = i17;
                }
                i19 = i18 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 1 : 0);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (i19 == 0) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nr.yggfygwlhe
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lereixgezr.gtknphoqwx(onHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nr.yggfygwlhe
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lereixgezr.gtknphoqwx(onHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar4 = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-257195210);
                if ((i16 & 896) == 256) {
                    i23 = i25;
                } else {
                    i23 = 0;
                }
                i24 = i23 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 1 : 0);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (i24 == 0) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: nr.jyumaefscl
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lereixgezr.draadjrbmk(onDeleteHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: nr.jyumaefscl
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lereixgezr.draadjrbmk(onDeleteHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                nufgyqmvbu(str, iobyxmoadgVar4, (tg.iobyxmoadg) objYadqdtsiqt2, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, i25, null), draadjrbmkVarBtonecajqb, 3072, 0);
                i25 = i25;
                wkgbmnqykcVar3 = wkgbmnqykcVar3;
                i16 = i16;
                draadjrbmkVarBtonecajqb = draadjrbmkVarBtonecajqb;
                i17 = 0;
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar5;
        } else {
            if (i26 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1478617873, i16, -1, "ru.myspar.catalog.impl.search.compose.SearchHistory (SearchHistory.kt:35)");
            }
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(40)), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 6);
            i17 = 0;
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg3, iobyxmoadgVar5.ppxfxbqfkf());
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
            czzsidtyhn.vdvldrhtss vdvldrhtssVar3 = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            gxszxtbevo(onClearAllClick, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), draadjrbmkVarBtonecajqb, ((i16 >> 9) & 14) | 48, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(784149536);
            it = historyItems.iterator();
            while (it.hasNext()) {
                str = (String) it.next();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-257197072);
                if ((i16 & 112) == 32) {
                    i18 = i25;
                } else {
                    i18 = i17;
                }
                i19 = i18 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 1 : 0);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (i19 == 0) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nr.yggfygwlhe
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lereixgezr.gtknphoqwx(onHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: nr.yggfygwlhe
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lereixgezr.gtknphoqwx(onHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-257195210);
                if ((i16 & 896) == 256) {
                    i23 = i25;
                } else {
                    i23 = 0;
                }
                i24 = i23 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 1 : 0);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (i24 == 0) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: nr.jyumaefscl
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lereixgezr.draadjrbmk(onDeleteHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: nr.jyumaefscl
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lereixgezr.draadjrbmk(onDeleteHistoryClick, str);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                nufgyqmvbu(str, iobyxmoadgVar6, (tg.iobyxmoadg) objYadqdtsiqt2, androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, i25, null), draadjrbmkVarBtonecajqb, 3072, 0);
                i25 = i25;
                wkgbmnqykcVar3 = wkgbmnqykcVar3;
                i16 = i16;
                draadjrbmkVarBtonecajqb = draadjrbmkVarBtonecajqb;
                i17 = 0;
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar6;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: nr.iwizpuwonk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lereixgezr.wflxmlrfwp(historyItems, onHistoryClick, onDeleteHistoryClick, onClearAllClick, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(tg.draadjrbmk draadjrbmkVar, String str) {
        draadjrbmkVar.invoke(str);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(String str, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        nufgyqmvbu(str, iobyxmoadgVar, iobyxmoadgVar2, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(tg.draadjrbmk draadjrbmkVar, String str) {
        draadjrbmkVar.invoke(str);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0177  */
    /* JADX WARN: Code duplicated, block: B:54:0x0182  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void gxszxtbevo(final tg.iobyxmoadg onClearAllClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClearAllClick, "onClearAllClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1814441542);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(onClearAllClick) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = 2 & i14;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i15 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1814441542, i15, -1, "ru.myspar.catalog.impl.search.compose.HistoryHeader (SearchHistory.kt:59)");
                }
                x.zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.gxszxtbevo(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
                String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.history, draadjrbmkVarBtonecajqb, 0);
                z zVar = z.f44180iobyxmoadg;
                int i17 = z.f44181zoijcleaow;
                w6.btonecajqb(strPpxfxbqfkf, null, zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i17).dxjokdxxww(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i17).nufgyqmvbu(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.clear_history, draadjrbmkVarBtonecajqb, 0), androidx.compose.foundation.eablkybsjg.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, null, null, false, null, null, onClearAllClick, 28, null), zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i17).btonecajqb(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i17).nufgyqmvbu(), draadjrbmkVar2, 0, 0, 65528);
                draadjrbmkVar2.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: nr.esjtqupxsv
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return lereixgezr.lqeggnwhkg(onClearAllClick, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 19) == 18) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1814441542, i15, -1, "ru.myspar.catalog.impl.search.compose.HistoryHeader (SearchHistory.kt:59)");
            }
            x.zynmafqrjb zynmafqrjbVarZoijcleaow2 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.gxszxtbevo(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow2, iobyxmoadgVar2.ppxfxbqfkf());
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
            roivzttewh roivzttewhVar2 = roivzttewh.f26469iobyxmoadg;
            String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.history, draadjrbmkVarBtonecajqb, 0);
            z zVar2 = z.f44180iobyxmoadg;
            int i18 = z.f44181zoijcleaow;
            w6.btonecajqb(strPpxfxbqfkf2, null, zVar2.iobyxmoadg(draadjrbmkVarBtonecajqb, i18).dxjokdxxww(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar2.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).nufgyqmvbu(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.clear_history, draadjrbmkVarBtonecajqb, 0), androidx.compose.foundation.eablkybsjg.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, null, null, false, null, null, onClearAllClick, 28, null), zVar2.iobyxmoadg(draadjrbmkVarBtonecajqb, i18).btonecajqb(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar2.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i18).nufgyqmvbu(), draadjrbmkVar2, 0, 0, 65528);
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar5;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1814441542, i15, -1, "ru.myspar.catalog.impl.search.compose.HistoryHeader (SearchHistory.kt:59)");
            }
            x.zynmafqrjb zynmafqrjbVarZoijcleaow3 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.gxszxtbevo(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVar3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow3, iobyxmoadgVar3.ppxfxbqfkf());
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
            roivzttewh roivzttewhVar3 = roivzttewh.f26469iobyxmoadg;
            String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.history, draadjrbmkVarBtonecajqb, 0);
            z zVar3 = z.f44180iobyxmoadg;
            int i19 = z.f44181zoijcleaow;
            w6.btonecajqb(strPpxfxbqfkf3, null, zVar3.iobyxmoadg(draadjrbmkVarBtonecajqb, i19).dxjokdxxww(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar3.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i19).nufgyqmvbu(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(e0.gxszxtbevo.ppxfxbqfkf(pq.lqeggnwhkg.clear_history, draadjrbmkVarBtonecajqb, 0), androidx.compose.foundation.eablkybsjg.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, null, null, false, null, null, onClearAllClick, 28, null), zVar3.iobyxmoadg(draadjrbmkVarBtonecajqb, i19).btonecajqb(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar3.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i19).nufgyqmvbu(), draadjrbmkVar2, 0, 0, 65528);
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar6;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: nr.esjtqupxsv
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lereixgezr.lqeggnwhkg(onClearAllClick, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        gxszxtbevo(iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x0209  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void nufgyqmvbu(final String text, final tg.iobyxmoadg onClick, final tg.iobyxmoadg onDeleteClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClick, "onClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteClick, "onDeleteClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1364389083);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(text) ? 4 : 2) | i13;
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
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDeleteClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i16 = i15;
            if ((i16 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1364389083, i16, -1, "ru.myspar.catalog.impl.search.compose.HistoryItem (SearchHistory.kt:89)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null);
                x.zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
                roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
                l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_recent, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                t.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf, null, androidx.compose.foundation.layout.cdpycssgdh.vdvldrhtss(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(16)), 0L, draadjrbmkVarBtonecajqb, 432, 8);
                i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
                z zVar = z.f44180iobyxmoadg;
                int i18 = z.f44181zoijcleaow;
                w6.btonecajqb(text, androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(tbqsvytpvh.zoijcleaow(roivzttewhVar, iobyxmoadgVar2, 1.0f, false, 2, null), w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, 2, null), y50.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i18).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i18).iobyxmoadg()), draadjrbmkVarBtonecajqb, i16 & 14, 3120, 55288);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(iobyxmoadgVar2, null, null, false, null, null, onDeleteClick, 28, null);
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_close_delete_history, draadjrbmkVar2, 0), null, wkgbmnqykcVarGxszxtbevo2, 0L, draadjrbmkVar2, 48, 8);
                draadjrbmkVar2.cqumvgiudr();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: nr.cqumvgiudr
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return lereixgezr.dxjokdxxww(text, onClick, onDeleteClick, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i15;
        if ((i16 & 1171) == 1170) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1364389083, i16, -1, "ru.myspar.catalog.impl.search.compose.HistoryItem (SearchHistory.kt:89)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null);
            x.zynmafqrjb zynmafqrjbVarZoijcleaow2 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo3);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow2, iobyxmoadgVar3.ppxfxbqfkf());
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
            roivzttewh roivzttewhVar2 = roivzttewh.f26469iobyxmoadg;
            l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf2 = e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_recent, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar4 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            t.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf2, null, androidx.compose.foundation.layout.cdpycssgdh.vdvldrhtss(iobyxmoadgVar4, w0.nufgyqmvbu.lqeggnwhkg(16)), 0L, draadjrbmkVarBtonecajqb, 432, 8);
            i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
            z zVar2 = z.f44180iobyxmoadg;
            int i19 = z.f44181zoijcleaow;
            w6.btonecajqb(text, androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(tbqsvytpvh.zoijcleaow(roivzttewhVar2, iobyxmoadgVar4, 1.0f, false, 2, null), w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, 2, null), y50.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i19).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i19).iobyxmoadg()), draadjrbmkVarBtonecajqb, i16 & 14, 3120, 55288);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo4 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(iobyxmoadgVar4, null, null, false, null, null, onDeleteClick, 28, null);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_close_delete_history, draadjrbmkVar2, 0), null, wkgbmnqykcVarGxszxtbevo4, 0L, draadjrbmkVar2, 48, 8);
            draadjrbmkVar2.cqumvgiudr();
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1364389083, i16, -1, "ru.myspar.catalog.impl.search.compose.HistoryItem (SearchHistory.kt:89)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo5 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVar3, null, null, false, null, null, onClick, 28, null);
            x.zynmafqrjb zynmafqrjbVarZoijcleaow3 = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo5);
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
            roivzttewh roivzttewhVar3 = roivzttewh.f26469iobyxmoadg;
            l.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf3 = e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_recent, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            t.ppxfxbqfkf(ppxfxbqfkfVarPpxfxbqfkf3, null, androidx.compose.foundation.layout.cdpycssgdh.vdvldrhtss(iobyxmoadgVar6, w0.nufgyqmvbu.lqeggnwhkg(16)), 0L, draadjrbmkVarBtonecajqb, 432, 8);
            i50.zoijcleaow.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(4), draadjrbmkVarBtonecajqb, 6);
            z zVar3 = z.f44180iobyxmoadg;
            int i110 = z.f44181zoijcleaow;
            w6.btonecajqb(text, androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(tbqsvytpvh.zoijcleaow(roivzttewhVar3, iobyxmoadgVar6, 1.0f, false, 2, null), w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, 2, null), y50.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i110).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow(), false, 1, 0, null, u50.zoijcleaow.zoijcleaow(y50.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i110).iobyxmoadg()), draadjrbmkVarBtonecajqb, i16 & 14, 3120, 55288);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo6 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(iobyxmoadgVar6, null, null, false, null, null, onDeleteClick, 28, null);
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            t.ppxfxbqfkf(e0.wkgbmnqykc.ppxfxbqfkf(s40.gxszxtbevo.ic_close_delete_history, draadjrbmkVar2, 0), null, wkgbmnqykcVarGxszxtbevo6, 0L, draadjrbmkVar2, 48, 8);
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: nr.cqumvgiudr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lereixgezr.dxjokdxxww(text, onClick, onDeleteClick, wkgbmnqykcVar2, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(List list, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar3, int i15) {
        btonecajqb(list, draadjrbmkVar, draadjrbmkVar2, iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar3, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
