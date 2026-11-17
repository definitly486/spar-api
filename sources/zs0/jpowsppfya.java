package zs0;

import androidx.compose.runtime.a0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.f;
import j0.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jpowsppfya {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(int i13) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, f it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(Integer.valueOf(it.agtfadlqog()));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(String str, int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i16) {
        wkgbmnqykc(str, i13, wkgbmnqykcVar, draadjrbmkVar, draadjrbmkVar2, androidx.compose.runtime.f.iobyxmoadg(i14 | 1), i15);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0115  */
    /* JADX WARN: Code duplicated, block: B:74:0x0157  */
    /* JADX WARN: Code duplicated, block: B:78:0x0164  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(final String name, final int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i14, final int i15) {
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i17;
        tg.draadjrbmk draadjrbmkVar3;
        int i18;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final tg.draadjrbmk draadjrbmkVar4;
        boolean z13;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar5;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        final tg.draadjrbmk draadjrbmkVar6;
        Object objYadqdtsiqt2;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(965982964);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(name) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    draadjrbmkVar3 = draadjrbmkVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                        i18 = 2048;
                    } else {
                        i18 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i16 |= i18;
                }
                if ((i16 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    if (i19 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i17 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-242536458);
                        objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: zs0.ylkuphrtab
                                @Override // tg.draadjrbmk
                                public final Object invoke(Object obj) {
                                    return jpowsppfya.eablkybsjg(((Integer) obj).intValue());
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
                    } else {
                        draadjrbmkVar4 = draadjrbmkVar3;
                    }
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(965982964, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardName (ProductCardName.kt:20)");
                    }
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "PRODUCT_CARD_NAME", null, null, false, 14, null);
                    z zVar = z.f44180iobyxmoadg;
                    int i23 = z.f44181zoijcleaow;
                    n nVarWkgbmnqykc = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i23).zoijcleaow().wkgbmnqykc();
                    long jCqumvgiudr = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i23).cqumvgiudr();
                    int iZoijcleaow = v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-242525594);
                    if ((i16 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    tg.draadjrbmk draadjrbmkVar7 = draadjrbmkVar4;
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    w6.btonecajqb(name, wkgbmnqykcVarOjitshcjhn, jCqumvgiudr, 0L, null, null, null, 0L, null, null, 0L, iZoijcleaow, false, i13, 0, (tg.draadjrbmk) objYadqdtsiqt, nVarWkgbmnqykc, draadjrbmkVar5, i16 & 14, ((i16 << 6) & 7168) | 48, 22520);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    draadjrbmkVar6 = draadjrbmkVar7;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                    wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    draadjrbmkVar6 = draadjrbmkVar3;
                }
                a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zs0.hcddaimhww
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return jpowsppfya.lqeggnwhkg(name, i13, wkgbmnqykcVar4, draadjrbmkVar6, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 |= 3072;
            draadjrbmkVar3 = draadjrbmkVar;
            if ((i16 & 1171) == 1170) {
                if (i19 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-242536458);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: zs0.ylkuphrtab
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return jpowsppfya.eablkybsjg(((Integer) obj).intValue());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(965982964, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardName (ProductCardName.kt:20)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn2 = w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "PRODUCT_CARD_NAME", null, null, false, 14, null);
                z zVar2 = z.f44180iobyxmoadg;
                int i24 = z.f44181zoijcleaow;
                n nVarWkgbmnqykc2 = l41.ppxfxbqfkf.zoijcleaow(zVar2, draadjrbmkVarBtonecajqb, i24).zoijcleaow().wkgbmnqykc();
                long jCqumvgiudr2 = l41.ppxfxbqfkf.iobyxmoadg(zVar2, draadjrbmkVarBtonecajqb, i24).cqumvgiudr();
                int iZoijcleaow2 = v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-242525594);
                if ((i16 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar8 = draadjrbmkVar4;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(name, wkgbmnqykcVarOjitshcjhn2, jCqumvgiudr2, 0L, null, null, null, 0L, null, null, 0L, iZoijcleaow2, false, i13, 0, (tg.draadjrbmk) objYadqdtsiqt, nVarWkgbmnqykc2, draadjrbmkVar5, i16 & 14, ((i16 << 6) & 7168) | 48, 22520);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                draadjrbmkVar6 = draadjrbmkVar8;
            } else {
                if (i19 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-242536458);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: zs0.ylkuphrtab
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return jpowsppfya.eablkybsjg(((Integer) obj).intValue());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(965982964, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardName (ProductCardName.kt:20)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn3 = w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "PRODUCT_CARD_NAME", null, null, false, 14, null);
                z zVar3 = z.f44180iobyxmoadg;
                int i25 = z.f44181zoijcleaow;
                n nVarWkgbmnqykc3 = l41.ppxfxbqfkf.zoijcleaow(zVar3, draadjrbmkVarBtonecajqb, i25).zoijcleaow().wkgbmnqykc();
                long jCqumvgiudr3 = l41.ppxfxbqfkf.iobyxmoadg(zVar3, draadjrbmkVarBtonecajqb, i25).cqumvgiudr();
                int iZoijcleaow3 = v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-242525594);
                if ((i16 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar9 = draadjrbmkVar4;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(name, wkgbmnqykcVarOjitshcjhn3, jCqumvgiudr3, 0L, null, null, null, 0L, null, null, 0L, iZoijcleaow3, false, i13, 0, (tg.draadjrbmk) objYadqdtsiqt, nVarWkgbmnqykc3, draadjrbmkVar5, i16 & 14, ((i16 << 6) & 7168) | 48, 22520);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                draadjrbmkVar6 = draadjrbmkVar9;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zs0.hcddaimhww
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return jpowsppfya.lqeggnwhkg(name, i13, wkgbmnqykcVar4, draadjrbmkVar6, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                draadjrbmkVar3 = draadjrbmkVar;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar3)) {
                    i18 = 2048;
                } else {
                    i18 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i16 |= i18;
            }
            if ((i16 & 1171) == 1170) {
                if (i19 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-242536458);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: zs0.ylkuphrtab
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return jpowsppfya.eablkybsjg(((Integer) obj).intValue());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(965982964, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardName (ProductCardName.kt:20)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn4 = w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "PRODUCT_CARD_NAME", null, null, false, 14, null);
                z zVar4 = z.f44180iobyxmoadg;
                int i26 = z.f44181zoijcleaow;
                n nVarWkgbmnqykc4 = l41.ppxfxbqfkf.zoijcleaow(zVar4, draadjrbmkVarBtonecajqb, i26).zoijcleaow().wkgbmnqykc();
                long jCqumvgiudr4 = l41.ppxfxbqfkf.iobyxmoadg(zVar4, draadjrbmkVarBtonecajqb, i26).cqumvgiudr();
                int iZoijcleaow4 = v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-242525594);
                if ((i16 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar10 = draadjrbmkVar4;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(name, wkgbmnqykcVarOjitshcjhn4, jCqumvgiudr4, 0L, null, null, null, 0L, null, null, 0L, iZoijcleaow4, false, i13, 0, (tg.draadjrbmk) objYadqdtsiqt, nVarWkgbmnqykc4, draadjrbmkVar5, i16 & 14, ((i16 << 6) & 7168) | 48, 22520);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                draadjrbmkVar6 = draadjrbmkVar10;
            } else {
                if (i19 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-242536458);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: zs0.ylkuphrtab
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return jpowsppfya.eablkybsjg(((Integer) obj).intValue());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
                } else {
                    draadjrbmkVar4 = draadjrbmkVar3;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(965982964, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardName (ProductCardName.kt:20)");
                }
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn5 = w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "PRODUCT_CARD_NAME", null, null, false, 14, null);
                z zVar5 = z.f44180iobyxmoadg;
                int i27 = z.f44181zoijcleaow;
                n nVarWkgbmnqykc5 = l41.ppxfxbqfkf.zoijcleaow(zVar5, draadjrbmkVarBtonecajqb, i27).zoijcleaow().wkgbmnqykc();
                long jCqumvgiudr5 = l41.ppxfxbqfkf.iobyxmoadg(zVar5, draadjrbmkVarBtonecajqb, i27).cqumvgiudr();
                int iZoijcleaow5 = v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-242525594);
                if ((i16 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar11 = draadjrbmkVar4;
                draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
                w6.btonecajqb(name, wkgbmnqykcVarOjitshcjhn5, jCqumvgiudr5, 0L, null, null, null, 0L, null, null, 0L, iZoijcleaow5, false, i13, 0, (tg.draadjrbmk) objYadqdtsiqt, nVarWkgbmnqykc5, draadjrbmkVar5, i16 & 14, ((i16 << 6) & 7168) | 48, 22520);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                draadjrbmkVar6 = draadjrbmkVar11;
            }
            a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zs0.hcddaimhww
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return jpowsppfya.lqeggnwhkg(name, i13, wkgbmnqykcVar4, draadjrbmkVar6, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 3072;
        draadjrbmkVar3 = draadjrbmkVar;
        if ((i16 & 1171) == 1170) {
            if (i19 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-242536458);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: zs0.ylkuphrtab
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.eablkybsjg(((Integer) obj).intValue());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(965982964, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardName (ProductCardName.kt:20)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn6 = w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "PRODUCT_CARD_NAME", null, null, false, 14, null);
            z zVar6 = z.f44180iobyxmoadg;
            int i28 = z.f44181zoijcleaow;
            n nVarWkgbmnqykc6 = l41.ppxfxbqfkf.zoijcleaow(zVar6, draadjrbmkVarBtonecajqb, i28).zoijcleaow().wkgbmnqykc();
            long jCqumvgiudr6 = l41.ppxfxbqfkf.iobyxmoadg(zVar6, draadjrbmkVarBtonecajqb, i28).cqumvgiudr();
            int iZoijcleaow6 = v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-242525594);
            if ((i16 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.draadjrbmk draadjrbmkVar12 = draadjrbmkVar4;
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(name, wkgbmnqykcVarOjitshcjhn6, jCqumvgiudr6, 0L, null, null, null, 0L, null, null, 0L, iZoijcleaow6, false, i13, 0, (tg.draadjrbmk) objYadqdtsiqt, nVarWkgbmnqykc6, draadjrbmkVar5, i16 & 14, ((i16 << 6) & 7168) | 48, 22520);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
            draadjrbmkVar6 = draadjrbmkVar12;
        } else {
            if (i19 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-242536458);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: zs0.ylkuphrtab
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jpowsppfya.eablkybsjg(((Integer) obj).intValue());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt2;
            } else {
                draadjrbmkVar4 = draadjrbmkVar3;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(965982964, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardName (ProductCardName.kt:20)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn7 = w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "PRODUCT_CARD_NAME", null, null, false, 14, null);
            z zVar7 = z.f44180iobyxmoadg;
            int i29 = z.f44181zoijcleaow;
            n nVarWkgbmnqykc7 = l41.ppxfxbqfkf.zoijcleaow(zVar7, draadjrbmkVarBtonecajqb, i29).zoijcleaow().wkgbmnqykc();
            long jCqumvgiudr7 = l41.ppxfxbqfkf.iobyxmoadg(zVar7, draadjrbmkVarBtonecajqb, i29).cqumvgiudr();
            int iZoijcleaow7 = v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-242525594);
            if ((i16 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.pkzmftpjix
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return jpowsppfya.gxszxtbevo(draadjrbmkVar4, (f) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tg.draadjrbmk draadjrbmkVar13 = draadjrbmkVar4;
            draadjrbmkVar5 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(name, wkgbmnqykcVarOjitshcjhn7, jCqumvgiudr7, 0L, null, null, null, 0L, null, null, 0L, iZoijcleaow7, false, i13, 0, (tg.draadjrbmk) objYadqdtsiqt, nVarWkgbmnqykc7, draadjrbmkVar5, i16 & 14, ((i16 << 6) & 7168) | 48, 22520);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
            draadjrbmkVar6 = draadjrbmkVar13;
        }
        a0VarWflxmlrfwp = draadjrbmkVar5.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zs0.hcddaimhww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return jpowsppfya.lqeggnwhkg(name, i13, wkgbmnqykcVar4, draadjrbmkVar6, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
