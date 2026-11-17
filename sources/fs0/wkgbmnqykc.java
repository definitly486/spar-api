package fs0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import vipkmwdibw.lmojexxdyd;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f34964iobyxmoadg;

        static {
            int[] iArr = new int[js0.zoijcleaow.values().length];
            try {
                iArr[js0.zoijcleaow.HALF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[js0.zoijcleaow.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[js0.zoijcleaow.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[js0.zoijcleaow.PRICE_AND_AMOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[js0.zoijcleaow.LOCAL_SCREEN_CHANGES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f34964iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(boolean z13, float f13, long j13, js0.zoijcleaow zoijcleaowVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(z13, f13, j13, zoijcleaowVar, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final androidx.compose.ui.wkgbmnqykc gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, js0.zoijcleaow zoijcleaowVar, boolean z13, float f13, int i13) {
        int i14 = iobyxmoadg.f34964iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            return z13 ? cdpycssgdh.lqeggnwhkg(wkgbmnqykcVar, f13) : cdpycssgdh.yggfygwlhe(wkgbmnqykcVar, w0.nufgyqmvbu.lqeggnwhkg(i13));
        }
        if (i14 != 4 && i14 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return cdpycssgdh.yggfygwlhe(wkgbmnqykcVar, w0.nufgyqmvbu.lqeggnwhkg(i13));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0153  */
    /* JADX WARN: Code duplicated, block: B:102:0x0156  */
    /* JADX WARN: Code duplicated, block: B:106:0x0170  */
    /* JADX WARN: Code duplicated, block: B:107:0x0172  */
    /* JADX WARN: Code duplicated, block: B:110:0x0179  */
    /* JADX WARN: Code duplicated, block: B:112:0x0181  */
    /* JADX WARN: Code duplicated, block: B:114:0x018b  */
    /* JADX WARN: Code duplicated, block: B:115:0x018e  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:122:0x020e  */
    /* JADX WARN: Code duplicated, block: B:125:0x021a  */
    /* JADX WARN: Code duplicated, block: B:126:0x021e  */
    /* JADX WARN: Code duplicated, block: B:129:0x023f  */
    /* JADX WARN: Code duplicated, block: B:131:0x024d  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3 A[PHI: r6 r7
      0x00c3: PHI (r6v27 int) = (r6v16 int), (r6v15 int), (r6v28 int) binds: [B:73:0x00db, B:67:0x00bf, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r7v19 long) = (r7v9 long), (r7v8 long), (r7v8 long) binds: [B:73:0x00db, B:67:0x00bf, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x0109  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x011b  */
    /* JADX WARN: Code duplicated, block: B:89:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0138  */
    /* JADX WARN: Code duplicated, block: B:94:0x013a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0141  */
    /* JADX WARN: Code duplicated, block: B:99:0x0149  */
    public static final void ppxfxbqfkf(final boolean z13, final float f13, long j13, final js0.zoijcleaow counterStyle, tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        long jBtonecajqb;
        tg.rgvfuqvkyq rgvfuqvkyqVar2;
        tg.rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg;
        int i16;
        long j14;
        int i17;
        boolean z14;
        Object objYadqdtsiqt;
        float f14;
        boolean z15;
        Object objYadqdtsiqt2;
        int i18;
        boolean z16;
        Object objYadqdtsiqt3;
        int i19;
        Object objYadqdtsiqt4;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        final tg.rgvfuqvkyq rgvfuqvkyqVar3;
        final long j15;
        a0 a0VarWflxmlrfwp;
        int i23;
        zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(752515459);
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
            i15 |= draadjrbmkVarBtonecajqb.zoijcleaow(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                jBtonecajqb = j13;
                if (draadjrbmkVarBtonecajqb.wkgbmnqykc(jBtonecajqb)) {
                    i23 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                }
                i15 |= i23;
            } else {
                jBtonecajqb = j13;
            }
            i23 = UserVerificationMethods.USER_VERIFY_PATTERN;
            i15 |= i23;
        } else {
            jBtonecajqb = j13;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(counterStyle) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i24 = i14 & 16;
        if (i24 == 0) {
            if ((i13 & 24576) == 0) {
                rgvfuqvkyqVar2 = rgvfuqvkyqVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar2) ? 16384 : 8192;
            }
            if ((i15 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                draadjrbmkVarBtonecajqb.wwaezpbzkn();
                if ((i13 & 1) != 0 || draadjrbmkVarBtonecajqb.dsvhmnatus()) {
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                        jBtonecajqb = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                    }
                    if (i24 != 0) {
                        rgvfuqvkyqVarIobyxmoadg = fs0.iobyxmoadg.f34930iobyxmoadg.iobyxmoadg();
                        i16 = i15;
                        j14 = jBtonecajqb;
                    }
                    draadjrbmkVarBtonecajqb.esjtqupxsv();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(752515459, i16, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.CounterContainer (CounterContainer.kt:40)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(524986276);
                    i17 = i16 & 7168;
                    if (i17 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f14 = 0.5f;
                        } else {
                            f14 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f14);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    float fFloatValue = ((Number) objYadqdtsiqt).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(524992451);
                    if (i17 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                            i18 = 44;
                        } else {
                            i18 = 36;
                        }
                        objYadqdtsiqt2 = Integer.valueOf(i18);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    int iIntValue = ((Number) objYadqdtsiqt2).intValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(524998577);
                    if (i17 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z16 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                            i19 = 60;
                        } else {
                            i19 = 48;
                        }
                        objYadqdtsiqt3 = Integer.valueOf(i19);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    int iIntValue2 = ((Number) objYadqdtsiqt3).intValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(525018207);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return wkgbmnqykc.wkgbmnqykc();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    float f15 = iIntValue;
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(e.iobyxmoadg.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.foundation.eablkybsjg.nufgyqmvbu(iobyxmoadgVar, false, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt4, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f15)), f13), 0.0f, 1, null);
                    zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.gxszxtbevo(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(gxszxtbevo(androidx.compose.animation.iobyxmoadg.zoijcleaow(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(cdpycssgdh.dxjokdxxww(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(f15)), oipsdeybqn.wflxmlrfwp(j14, f13, 0.0f, 0.0f, 0.0f, 14, null), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(40))), vipkmwdibw.draadjrbmk.draadjrbmk(300, 0, lmojexxdyd.wkgbmnqykc(), 2, null), null, 2, null), counterStyle, z13, fFloatValue, iIntValue2), draadjrbmkVarBtonecajqb, 0);
                    rgvfuqvkyqVarIobyxmoadg.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i16 >> 12) & 14));
                    draadjrbmkVarBtonecajqb.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    rgvfuqvkyqVar3 = rgvfuqvkyqVarIobyxmoadg;
                    j15 = j14;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                }
                i16 = i15;
                j14 = jBtonecajqb;
                rgvfuqvkyqVarIobyxmoadg = rgvfuqvkyqVar2;
                draadjrbmkVarBtonecajqb.esjtqupxsv();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(752515459, i16, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.CounterContainer (CounterContainer.kt:40)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(524986276);
                i17 = i16 & 7168;
                if (i17 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14) {
                    if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f14 = 0.5f;
                    } else {
                        f14 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f14);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f14 = 0.5f;
                    } else {
                        f14 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f14);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                float fFloatValue2 = ((Number) objYadqdtsiqt).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(524992451);
                if (i17 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15) {
                    if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                        i18 = 44;
                    } else {
                        i18 = 36;
                    }
                    objYadqdtsiqt2 = Integer.valueOf(i18);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                        i18 = 44;
                    } else {
                        i18 = 36;
                    }
                    objYadqdtsiqt2 = Integer.valueOf(i18);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                int iIntValue3 = ((Number) objYadqdtsiqt2).intValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(524998577);
                if (i17 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z16) {
                    if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                        i19 = 60;
                    } else {
                        i19 = 48;
                    }
                    objYadqdtsiqt3 = Integer.valueOf(i19);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                } else {
                    if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                        i19 = 60;
                    } else {
                        i19 = 48;
                    }
                    objYadqdtsiqt3 = Integer.valueOf(i19);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                int iIntValue4 = ((Number) objYadqdtsiqt3).intValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(525018207);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return wkgbmnqykc.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                float f16 = iIntValue3;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu2 = cdpycssgdh.nufgyqmvbu(e.iobyxmoadg.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.foundation.eablkybsjg.nufgyqmvbu(iobyxmoadgVar3, false, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt4, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f16)), f13), 0.0f, 1, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.gxszxtbevo(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu2);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar4.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar4.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar4.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(gxszxtbevo(androidx.compose.animation.iobyxmoadg.zoijcleaow(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(cdpycssgdh.dxjokdxxww(iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f16)), oipsdeybqn.wflxmlrfwp(j14, f13, 0.0f, 0.0f, 0.0f, 14, null), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(40))), vipkmwdibw.draadjrbmk.draadjrbmk(300, 0, lmojexxdyd.wkgbmnqykc(), 2, null), null, 2, null), counterStyle, z13, fFloatValue2, iIntValue4), draadjrbmkVarBtonecajqb, 0);
                rgvfuqvkyqVarIobyxmoadg.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i16 >> 12) & 14));
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                rgvfuqvkyqVar3 = rgvfuqvkyqVarIobyxmoadg;
                j15 = j14;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                j15 = jBtonecajqb;
                rgvfuqvkyqVar3 = rgvfuqvkyqVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.eablkybsjg(z13, f13, j15, counterStyle, rgvfuqvkyqVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        rgvfuqvkyqVar2 = rgvfuqvkyqVar;
        if ((i15 & 9363) == 9362) {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) != 0) {
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                    jBtonecajqb = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                }
                if (i24 != 0) {
                    rgvfuqvkyqVarIobyxmoadg = fs0.iobyxmoadg.f34930iobyxmoadg.iobyxmoadg();
                    i16 = i15;
                    j14 = jBtonecajqb;
                } else {
                    i16 = i15;
                    j14 = jBtonecajqb;
                    rgvfuqvkyqVarIobyxmoadg = rgvfuqvkyqVar2;
                }
            } else {
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                    jBtonecajqb = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                }
                if (i24 != 0) {
                    rgvfuqvkyqVarIobyxmoadg = fs0.iobyxmoadg.f34930iobyxmoadg.iobyxmoadg();
                    i16 = i15;
                    j14 = jBtonecajqb;
                } else {
                    i16 = i15;
                    j14 = jBtonecajqb;
                    rgvfuqvkyqVarIobyxmoadg = rgvfuqvkyqVar2;
                }
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(752515459, i16, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.CounterContainer (CounterContainer.kt:40)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(524986276);
            i17 = i16 & 7168;
            if (i17 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                objYadqdtsiqt = Float.valueOf(f14);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                objYadqdtsiqt = Float.valueOf(f14);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            float fFloatValue3 = ((Number) objYadqdtsiqt).floatValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(524992451);
            if (i17 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15) {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    i18 = 44;
                } else {
                    i18 = 36;
                }
                objYadqdtsiqt2 = Integer.valueOf(i18);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    i18 = 44;
                } else {
                    i18 = 36;
                }
                objYadqdtsiqt2 = Integer.valueOf(i18);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            int iIntValue5 = ((Number) objYadqdtsiqt2).intValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(524998577);
            if (i17 == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z16) {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    i19 = 60;
                } else {
                    i19 = 48;
                }
                objYadqdtsiqt3 = Integer.valueOf(i19);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    i19 = 60;
                } else {
                    i19 = 48;
                }
                objYadqdtsiqt3 = Integer.valueOf(i19);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            int iIntValue6 = ((Number) objYadqdtsiqt3).intValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar5 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(525018207);
            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.wkgbmnqykc();
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f17 = iIntValue5;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu3 = cdpycssgdh.nufgyqmvbu(e.iobyxmoadg.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.foundation.eablkybsjg.nufgyqmvbu(iobyxmoadgVar5, false, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt4, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f17)), f13), 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.gxszxtbevo(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar6 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar6.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar6.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar6.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar6.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar6.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(gxszxtbevo(androidx.compose.animation.iobyxmoadg.zoijcleaow(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(cdpycssgdh.dxjokdxxww(iobyxmoadgVar5, w0.nufgyqmvbu.lqeggnwhkg(f17)), oipsdeybqn.wflxmlrfwp(j14, f13, 0.0f, 0.0f, 0.0f, 14, null), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(40))), vipkmwdibw.draadjrbmk.draadjrbmk(300, 0, lmojexxdyd.wkgbmnqykc(), 2, null), null, 2, null), counterStyle, z13, fFloatValue3, iIntValue6), draadjrbmkVarBtonecajqb, 0);
            rgvfuqvkyqVarIobyxmoadg.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i16 >> 12) & 14));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            rgvfuqvkyqVar3 = rgvfuqvkyqVarIobyxmoadg;
            j15 = j14;
        } else {
            draadjrbmkVarBtonecajqb.wwaezpbzkn();
            if ((i13 & 1) != 0) {
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                    jBtonecajqb = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                }
                if (i24 != 0) {
                    rgvfuqvkyqVarIobyxmoadg = fs0.iobyxmoadg.f34930iobyxmoadg.iobyxmoadg();
                    i16 = i15;
                    j14 = jBtonecajqb;
                } else {
                    i16 = i15;
                    j14 = jBtonecajqb;
                    rgvfuqvkyqVarIobyxmoadg = rgvfuqvkyqVar2;
                }
            } else {
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                    jBtonecajqb = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                }
                if (i24 != 0) {
                    rgvfuqvkyqVarIobyxmoadg = fs0.iobyxmoadg.f34930iobyxmoadg.iobyxmoadg();
                    i16 = i15;
                    j14 = jBtonecajqb;
                } else {
                    i16 = i15;
                    j14 = jBtonecajqb;
                    rgvfuqvkyqVarIobyxmoadg = rgvfuqvkyqVar2;
                }
            }
            draadjrbmkVarBtonecajqb.esjtqupxsv();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(752515459, i16, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.CounterContainer (CounterContainer.kt:40)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(524986276);
            i17 = i16 & 7168;
            if (i17 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                objYadqdtsiqt = Float.valueOf(f14);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                objYadqdtsiqt = Float.valueOf(f14);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            float fFloatValue4 = ((Number) objYadqdtsiqt).floatValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(524992451);
            if (i17 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15) {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    i18 = 44;
                } else {
                    i18 = 36;
                }
                objYadqdtsiqt2 = Integer.valueOf(i18);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    i18 = 44;
                } else {
                    i18 = 36;
                }
                objYadqdtsiqt2 = Integer.valueOf(i18);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            int iIntValue7 = ((Number) objYadqdtsiqt2).intValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(524998577);
            if (i17 == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z16) {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    i19 = 60;
                } else {
                    i19 = 48;
                }
                objYadqdtsiqt3 = Integer.valueOf(i19);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                if (iobyxmoadg.f34964iobyxmoadg[counterStyle.ordinal()] == 1) {
                    i19 = 60;
                } else {
                    i19 = 48;
                }
                objYadqdtsiqt3 = Integer.valueOf(i19);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            int iIntValue8 = ((Number) objYadqdtsiqt3).intValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar7 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(525018207);
            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.wkgbmnqykc();
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f18 = iIntValue7;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu4 = cdpycssgdh.nufgyqmvbu(e.iobyxmoadg.iobyxmoadg(cdpycssgdh.dxjokdxxww(androidx.compose.foundation.eablkybsjg.nufgyqmvbu(iobyxmoadgVar7, false, null, null, null, (tg.iobyxmoadg) objYadqdtsiqt4, 14, null), w0.nufgyqmvbu.lqeggnwhkg(f18)), f13), 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarDxjokdxxww4 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.gxszxtbevo(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu4);
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww4, iobyxmoadgVar8.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar8.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar8.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar8.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar4 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            androidx.compose.foundation.layout.nufgyqmvbu.zoijcleaow(gxszxtbevo(androidx.compose.animation.iobyxmoadg.zoijcleaow(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(cdpycssgdh.dxjokdxxww(iobyxmoadgVar7, w0.nufgyqmvbu.lqeggnwhkg(f18)), oipsdeybqn.wflxmlrfwp(j14, f13, 0.0f, 0.0f, 0.0f, 14, null), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(40))), vipkmwdibw.draadjrbmk.draadjrbmk(300, 0, lmojexxdyd.wkgbmnqykc(), 2, null), null, 2, null), counterStyle, z13, fFloatValue4, iIntValue8), draadjrbmkVarBtonecajqb, 0);
            rgvfuqvkyqVarIobyxmoadg.invoke(draadjrbmkVarBtonecajqb, Integer.valueOf((i16 >> 12) & 14));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            rgvfuqvkyqVar3 = rgvfuqvkyqVarIobyxmoadg;
            j15 = j14;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.eablkybsjg(z13, f13, j15, counterStyle, rgvfuqvkyqVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
