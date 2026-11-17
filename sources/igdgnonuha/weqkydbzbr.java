package igdgnonuha;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class weqkydbzbr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, long j13, float f13, float f14, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        zoijcleaow(wkgbmnqykcVar, j13, f13, f14, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111  */
    /* JADX WARN: Code duplicated, block: B:80:0x0130  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, long j13, float f13, float f14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        long jWflxmlrfwp;
        float fLqeggnwhkg;
        int i16;
        float fLqeggnwhkg2;
        int i17;
        boolean z13;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final float f15;
        final float f16;
        androidx.compose.runtime.a0 a0VarWflxmlrfwp;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm;
        float fLqeggnwhkg3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1249392198);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            jWflxmlrfwp = j13;
            i15 |= ((i14 & 2) == 0 && draadjrbmkVarBtonecajqb.wkgbmnqykc(jWflxmlrfwp)) ? 32 : 16;
        } else {
            jWflxmlrfwp = j13;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                fLqeggnwhkg = f13;
                i15 |= draadjrbmkVarBtonecajqb.zoijcleaow(fLqeggnwhkg) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    fLqeggnwhkg2 = f14;
                    if (draadjrbmkVarBtonecajqb.zoijcleaow(fLqeggnwhkg2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (draadjrbmkVarBtonecajqb.vdvldrhtss(z13, i15 & 1)) {
                    draadjrbmkVarBtonecajqb.wwaezpbzkn();
                    if ((i13 & 1) != 0 || draadjrbmkVarBtonecajqb.dsvhmnatus()) {
                        if (i18 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if ((i14 & 2) != 0) {
                            jWflxmlrfwp = h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).dxjokdxxww(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                            i15 &= -113;
                        }
                        if (i19 != 0) {
                            fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(1);
                        }
                        if (i16 != 0) {
                            fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(0);
                        }
                    } else {
                        draadjrbmkVarBtonecajqb.hkdspvbjdz();
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                        }
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1249392198, i15, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                    }
                    if (fLqeggnwhkg2 == 0.0f) {
                        wkgbmnqykcVarOxmwwwfdhm = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVarOxmwwwfdhm = androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fLqeggnwhkg2, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if (w0.nufgyqmvbu.dxjokdxxww(fLqeggnwhkg, w0.nufgyqmvbu.f118267yggfygwlhe.iobyxmoadg())) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-455967894);
                        fLqeggnwhkg3 = w0.nufgyqmvbu.lqeggnwhkg(1.0f / ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo())).getDensity());
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-455901337);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        fLqeggnwhkg3 = fLqeggnwhkg;
                    }
                    androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(androidx.compose.foundation.layout.cdpycssgdh.dxjokdxxww(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3.eablkybsjg(wkgbmnqykcVarOxmwwwfdhm), 0.0f, 1, null), fLqeggnwhkg3), jWflxmlrfwp, null, 2, null), draadjrbmkVarBtonecajqb, 0);
                    if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                        androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                    }
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                f15 = fLqeggnwhkg;
                f16 = fLqeggnwhkg2;
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    final long j14 = jWflxmlrfwp;
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.iyctptxqzt
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return weqkydbzbr.ppxfxbqfkf(wkgbmnqykcVar4, j14, f15, f16, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            fLqeggnwhkg2 = f14;
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (draadjrbmkVarBtonecajqb.vdvldrhtss(z13, i15 & 1)) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i18 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 2) != 0) {
                        jWflxmlrfwp = h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).dxjokdxxww(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(1);
                    }
                    if (i16 != 0) {
                        fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(0);
                    }
                } else {
                    if (i18 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 2) != 0) {
                        jWflxmlrfwp = h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).dxjokdxxww(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(1);
                    }
                    if (i16 != 0) {
                        fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(0);
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1249392198, i15, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                }
                if (fLqeggnwhkg2 == 0.0f) {
                    wkgbmnqykcVarOxmwwwfdhm = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVarOxmwwwfdhm = androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fLqeggnwhkg2, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (w0.nufgyqmvbu.dxjokdxxww(fLqeggnwhkg, w0.nufgyqmvbu.f118267yggfygwlhe.iobyxmoadg())) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-455967894);
                    fLqeggnwhkg3 = w0.nufgyqmvbu.lqeggnwhkg(1.0f / ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo())).getDensity());
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-455901337);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    fLqeggnwhkg3 = fLqeggnwhkg;
                }
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(androidx.compose.foundation.layout.cdpycssgdh.dxjokdxxww(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3.eablkybsjg(wkgbmnqykcVarOxmwwwfdhm), 0.0f, 1, null), fLqeggnwhkg3), jWflxmlrfwp, null, 2, null), draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            f15 = fLqeggnwhkg;
            f16 = fLqeggnwhkg2;
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
                final long j15 = jWflxmlrfwp;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.iyctptxqzt
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return weqkydbzbr.ppxfxbqfkf(wkgbmnqykcVar5, j15, f15, f16, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        fLqeggnwhkg = f13;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                fLqeggnwhkg2 = f14;
                if (draadjrbmkVarBtonecajqb.zoijcleaow(fLqeggnwhkg2)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (draadjrbmkVarBtonecajqb.vdvldrhtss(z13, i15 & 1)) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0) {
                    if (i18 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 2) != 0) {
                        jWflxmlrfwp = h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).dxjokdxxww(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(1);
                    }
                    if (i16 != 0) {
                        fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(0);
                    }
                } else {
                    if (i18 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if ((i14 & 2) != 0) {
                        jWflxmlrfwp = h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).dxjokdxxww(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i15 &= -113;
                    }
                    if (i19 != 0) {
                        fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(1);
                    }
                    if (i16 != 0) {
                        fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(0);
                    }
                }
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1249392198, i15, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                }
                if (fLqeggnwhkg2 == 0.0f) {
                    wkgbmnqykcVarOxmwwwfdhm = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVarOxmwwwfdhm = androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fLqeggnwhkg2, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if (w0.nufgyqmvbu.dxjokdxxww(fLqeggnwhkg, w0.nufgyqmvbu.f118267yggfygwlhe.iobyxmoadg())) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-455967894);
                    fLqeggnwhkg3 = w0.nufgyqmvbu.lqeggnwhkg(1.0f / ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo())).getDensity());
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-455901337);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    fLqeggnwhkg3 = fLqeggnwhkg;
                }
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(androidx.compose.foundation.layout.cdpycssgdh.dxjokdxxww(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3.eablkybsjg(wkgbmnqykcVarOxmwwwfdhm), 0.0f, 1, null), fLqeggnwhkg3), jWflxmlrfwp, null, 2, null), draadjrbmkVarBtonecajqb, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            f15 = fLqeggnwhkg;
            f16 = fLqeggnwhkg2;
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar3;
                final long j16 = jWflxmlrfwp;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.iyctptxqzt
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return weqkydbzbr.ppxfxbqfkf(wkgbmnqykcVar6, j16, f15, f16, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        fLqeggnwhkg2 = f14;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss(z13, i15 & 1)) {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) != 0) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if ((i14 & 2) != 0) {
                    jWflxmlrfwp = h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).dxjokdxxww(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i15 &= -113;
                }
                if (i19 != 0) {
                    fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(1);
                }
                if (i16 != 0) {
                    fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(0);
                }
            } else {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if ((i14 & 2) != 0) {
                    jWflxmlrfwp = h.oipsdeybqn.wflxmlrfwp(z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, 6).dxjokdxxww(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i15 &= -113;
                }
                if (i19 != 0) {
                    fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(1);
                }
                if (i16 != 0) {
                    fLqeggnwhkg2 = w0.nufgyqmvbu.lqeggnwhkg(0);
                }
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1249392198, i15, -1, "androidx.compose.material.Divider (Divider.kt:50)");
            }
            if (fLqeggnwhkg2 == 0.0f) {
                wkgbmnqykcVarOxmwwwfdhm = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVarOxmwwwfdhm = androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fLqeggnwhkg2, 0.0f, 0.0f, 0.0f, 14, null);
            }
            if (w0.nufgyqmvbu.dxjokdxxww(fLqeggnwhkg, w0.nufgyqmvbu.f118267yggfygwlhe.iobyxmoadg())) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-455967894);
                fLqeggnwhkg3 = w0.nufgyqmvbu.lqeggnwhkg(1.0f / ((w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo())).getDensity());
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-455901337);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                fLqeggnwhkg3 = fLqeggnwhkg;
            }
            androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(androidx.compose.foundation.zoijcleaow.wkgbmnqykc(androidx.compose.foundation.layout.cdpycssgdh.dxjokdxxww(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3.eablkybsjg(wkgbmnqykcVarOxmwwwfdhm), 0.0f, 1, null), fLqeggnwhkg3), jWflxmlrfwp, null, 2, null), draadjrbmkVarBtonecajqb, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        }
        f15 = fLqeggnwhkg;
        f16 = fLqeggnwhkg2;
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar3;
            final long j17 = jWflxmlrfwp;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.iyctptxqzt
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return weqkydbzbr.ppxfxbqfkf(wkgbmnqykcVar7, j17, f15, f16, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
