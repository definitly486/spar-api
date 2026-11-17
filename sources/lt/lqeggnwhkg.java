package lt;

import android.content.Context;
import androidx.compose.foundation.layout.nufgyqmvbu;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import mt.dxjokdxxww;
import mt.ojitshcjhn;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f63996cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f63997esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f63998iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ColorsUiModel.Hex.Tints f63999jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f64000lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f64001pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ qt.zoijcleaow f64002yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ CounterModel f64003zdlpuopuiu;

        iobyxmoadg(CounterModel counterModel, qt.zoijcleaow zoijcleaowVar, ColorsUiModel.Hex.Tints tints, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.iobyxmoadg iobyxmoadgVar4, tg.iobyxmoadg iobyxmoadgVar5) {
            this.f64003zdlpuopuiu = counterModel;
            this.f64002yggfygwlhe = zoijcleaowVar;
            this.f63999jyumaefscl = tints;
            this.f63998iwizpuwonk = iobyxmoadgVar;
            this.f63996cqumvgiudr = iobyxmoadgVar2;
            this.f63997esjtqupxsv = iobyxmoadgVar3;
            this.f64000lereixgezr = iobyxmoadgVar4;
            this.f64001pmvmpeiblj = iobyxmoadgVar5;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1332728291, i13, -1, "ru.myspar.common.view.counter.compose.Counter.<anonymous>.<anonymous> (Counter.kt:77)");
            }
            dxjokdxxww.ppxfxbqfkf(this.f64003zdlpuopuiu, this.f64002yggfygwlhe, this.f63999jyumaefscl, this.f63998iwizpuwonk, draadjrbmkVar, 0, 0);
            if (this.f64003zdlpuopuiu.getIsExpand() && this.f64002yggfygwlhe.wkgbmnqykc()) {
                ojitshcjhn.gxszxtbevo(this.f64003zdlpuopuiu, this.f64002yggfygwlhe, this.f63999jyumaefscl, this.f63996cqumvgiudr, this.f63997esjtqupxsv, this.f64000lereixgezr, this.f64001pmvmpeiblj, draadjrbmkVar, 0, 0);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f64004iobyxmoadg;

        static {
            int[] iArr = new int[qt.zoijcleaow.values().length];
            try {
                iArr[qt.zoijcleaow.PRICE_AND_AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qt.zoijcleaow.LOCAL_SCREEN_CHANGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64004iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(CounterModel counterModel, qt.zoijcleaow zoijcleaowVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.iobyxmoadg iobyxmoadgVar4, tg.iobyxmoadg iobyxmoadgVar5, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        lqeggnwhkg(counterModel, zoijcleaowVar, wkgbmnqykcVar, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x0156  */
    /* JADX WARN: Code duplicated, block: B:105:0x0166  */
    /* JADX WARN: Code duplicated, block: B:107:0x016a  */
    /* JADX WARN: Code duplicated, block: B:109:0x017c  */
    /* JADX WARN: Code duplicated, block: B:112:0x018c  */
    /* JADX WARN: Code duplicated, block: B:114:0x019e  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:128:0x0203  */
    /* JADX WARN: Code duplicated, block: B:130:0x020b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0211  */
    /* JADX WARN: Code duplicated, block: B:133:0x021b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0239  */
    /* JADX WARN: Code duplicated, block: B:139:0x0241  */
    /* JADX WARN: Code duplicated, block: B:141:0x0247  */
    /* JADX WARN: Code duplicated, block: B:142:0x024a  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:155:0x0306  */
    /* JADX WARN: Code duplicated, block: B:158:0x0328  */
    /* JADX WARN: Code duplicated, block: B:160:0x032b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0337  */
    /* JADX WARN: Code duplicated, block: B:165:0x0342  */
    /* JADX WARN: Code duplicated, block: B:168:0x034b  */
    /* JADX WARN: Code duplicated, block: B:170:0x035a  */
    /* JADX WARN: Code duplicated, block: B:172:0x039b  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0134  */
    public static final void lqeggnwhkg(final CounterModel model, final qt.zoijcleaow counterStyle, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.iobyxmoadg iobyxmoadgVar4, tg.iobyxmoadg iobyxmoadgVar5, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        tg.iobyxmoadg iobyxmoadgVar6;
        int i17;
        int i18;
        int i19;
        int i23;
        tg.iobyxmoadg iobyxmoadgVar7;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        tg.iobyxmoadg iobyxmoadgVar8;
        tg.iobyxmoadg iobyxmoadgVar9;
        tg.iobyxmoadg iobyxmoadgVar10;
        Context context;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt;
        ColorsUiModel.Hex colorsModel;
        ColorsUiModel.Hex.Tints tints;
        boolean zIobyxmoadg;
        Object objYadqdtsiqt2;
        float f13;
        float fFloatValue;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        draadjrbmk draadjrbmkVarIobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        int i29;
        final tg.iobyxmoadg iobyxmoadgVar11;
        final tg.iobyxmoadg iobyxmoadgVar12;
        final tg.iobyxmoadg iobyxmoadgVar13;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        final tg.iobyxmoadg iobyxmoadgVar14;
        final tg.iobyxmoadg iobyxmoadgVar15;
        oipsdeybqn oipsdeybqnVarIobyxmoadg;
        long jIwizpuwonk;
        String primary;
        Object objYadqdtsiqt3;
        Object objYadqdtsiqt4;
        Object objYadqdtsiqt5;
        Object objYadqdtsiqt6;
        Object objYadqdtsiqt7;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(717517414);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(counterStyle) ? 32 : 16;
        }
        int i33 = 4 & i14;
        if (i33 == 0) {
            if ((i13 & 384) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    iobyxmoadgVar6 = iobyxmoadgVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar6)) {
                        i17 = 2048;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i17;
                }
                i18 = 16 & i14;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i15 |= i19;
                    }
                    i23 = 32 & i14;
                    if (i23 != 0) {
                        i15 |= 196608;
                        iobyxmoadgVar7 = iobyxmoadgVar3;
                    } else {
                        iobyxmoadgVar7 = iobyxmoadgVar3;
                        if ((i13 & 196608) == 0) {
                            if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i15 |= i24;
                        }
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = 128 & i14;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 4793491) == 4793490 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                        if (i33 != 0) {
                            wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                        } else {
                            wkgbmnqykcVar3 = wkgbmnqykcVar2;
                        }
                        if (i16 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                            objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return lqeggnwhkg.nufgyqmvbu();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                            objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return lqeggnwhkg.btonecajqb();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                        } else {
                            iobyxmoadgVar8 = iobyxmoadgVar2;
                        }
                        if (i23 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                            objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return lqeggnwhkg.gtknphoqwx();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                        }
                        if (i25 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return lqeggnwhkg.draadjrbmk();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                        } else {
                            iobyxmoadgVar9 = iobyxmoadgVar4;
                        }
                        if (i27 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return lqeggnwhkg.wflxmlrfwp();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                        } else {
                            iobyxmoadgVar10 = iobyxmoadgVar5;
                        }
                        if (jyumaefscl.jpowsppfya()) {
                            jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                        }
                        context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                        ColorsUiModel.Hex colorsModel2 = model.getColorsModel();
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                        zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel2);
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            colorsModel = model.getColorsModel();
                            if (colorsModel != null) {
                                objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                            } else {
                                objYadqdtsiqt = null;
                            }
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        boolean zEsjtqupxsv = model.esjtqupxsv();
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                        zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv);
                        objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (zIobyxmoadg || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            if (model.esjtqupxsv()) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.5f;
                            }
                            objYadqdtsiqt2 = Float.valueOf(f13);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                        }
                        fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                        zynmafqrjb zynmafqrjbVarDxjokdxxww = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                        androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm);
                        z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar16 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar16.iobyxmoadg();
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
                        m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar16.ppxfxbqfkf());
                        m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar16.eablkybsjg());
                        rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar16.zoijcleaow();
                        if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                            draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                            draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                        }
                        m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar16.wkgbmnqykc());
                        wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
                        i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                        if (i29 == 1) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                            ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        } else if (i29 != 2) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                            boolean isExpand = model.getIsExpand();
                            if (tints != null || (primary = tints.getPrimary()) == null) {
                                oipsdeybqnVarIobyxmoadg = null;
                            } else {
                                oipsdeybqnVarIobyxmoadg = w50.iobyxmoadg.iobyxmoadg(primary);
                            }
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                            if (oipsdeybqnVarIobyxmoadg == null) {
                                jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                            } else {
                                jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                            }
                            long j13 = jIwizpuwonk;
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            mt.wkgbmnqykc.ppxfxbqfkf(isExpand, fFloatValue, j13, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                        } else {
                            int i34 = i15;
                            draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                            nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i34 & 14) | ((i34 >> 15) & 112) | ((i34 >> 9) & 896), 0);
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                        }
                        draadjrbmkVarBtonecajqb.cqumvgiudr();
                        if (jyumaefscl.jpowsppfya()) {
                            jyumaefscl.mbcevpiqjq();
                        }
                        iobyxmoadgVar11 = iobyxmoadgVar7;
                        iobyxmoadgVar12 = iobyxmoadgVar6;
                        iobyxmoadgVar13 = iobyxmoadgVar9;
                        wkgbmnqykcVar4 = wkgbmnqykcVar3;
                        iobyxmoadgVar14 = iobyxmoadgVar8;
                        iobyxmoadgVar15 = iobyxmoadgVar10;
                    } else {
                        draadjrbmkVarBtonecajqb.hkdspvbjdz();
                        iobyxmoadgVar14 = iobyxmoadgVar2;
                        iobyxmoadgVar15 = iobyxmoadgVar5;
                        wkgbmnqykcVar4 = wkgbmnqykcVar2;
                        iobyxmoadgVar11 = iobyxmoadgVar7;
                        iobyxmoadgVar12 = iobyxmoadgVar6;
                        iobyxmoadgVar13 = iobyxmoadgVar4;
                    }
                    a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                    if (a0VarWflxmlrfwp != null) {
                        a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lt.gxszxtbevo
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return lqeggnwhkg.dxjokdxxww(model, counterStyle, wkgbmnqykcVar4, iobyxmoadgVar12, iobyxmoadgVar14, iobyxmoadgVar11, iobyxmoadgVar13, iobyxmoadgVar15, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 24576;
                i23 = 32 & i14;
                if (i23 != 0) {
                    i15 |= 196608;
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                } else {
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                    if ((i13 & 196608) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = 128 & i14;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i33 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.nufgyqmvbu();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    } else {
                        iobyxmoadgVar8 = iobyxmoadgVar2;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    }
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.draadjrbmk();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar4;
                    }
                    if (i27 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.wflxmlrfwp();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar5;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                    }
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    ColorsUiModel.Hex colorsModel3 = model.getColorsModel();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel3);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    boolean zEsjtqupxsv2 = model.esjtqupxsv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                    zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv2);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zIobyxmoadg) {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm2 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                    zynmafqrjb zynmafqrjbVarDxjokdxxww2 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm2);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar17 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar17.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar17.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar17.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar17.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar17.wkgbmnqykc());
                    wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwp.f4892iobyxmoadg;
                    i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                    if (i29 == 1) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                        ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
                    } else if (i29 != 2) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                        boolean isExpand2 = model.getIsExpand();
                        if (tints != null) {
                            oipsdeybqnVarIobyxmoadg = null;
                        } else {
                            oipsdeybqnVarIobyxmoadg = null;
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                        if (oipsdeybqnVarIobyxmoadg == null) {
                            jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                        } else {
                            jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                        }
                        long j14 = jIwizpuwonk;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        mt.wkgbmnqykc.ppxfxbqfkf(isExpand2, fFloatValue, j14, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        int i35 = i15;
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                        nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i35 & 14) | ((i35 >> 15) & 112) | ((i35 >> 9) & 896), 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar6 = wwaezpbzkn.f37140iobyxmoadg;
                    }
                    draadjrbmkVarBtonecajqb.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar11 = iobyxmoadgVar7;
                    iobyxmoadgVar12 = iobyxmoadgVar6;
                    iobyxmoadgVar13 = iobyxmoadgVar9;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    iobyxmoadgVar14 = iobyxmoadgVar8;
                    iobyxmoadgVar15 = iobyxmoadgVar10;
                } else {
                    if (i33 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.nufgyqmvbu();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    } else {
                        iobyxmoadgVar8 = iobyxmoadgVar2;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    }
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.draadjrbmk();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar4;
                    }
                    if (i27 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.wflxmlrfwp();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar5;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                    }
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    ColorsUiModel.Hex colorsModel4 = model.getColorsModel();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel4);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    boolean zEsjtqupxsv3 = model.esjtqupxsv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                    zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv3);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zIobyxmoadg) {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm3 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                    zynmafqrjb zynmafqrjbVarDxjokdxxww3 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm3);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar18 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar18.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar18.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar18.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar18.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar18.wkgbmnqykc());
                    wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwp.f4892iobyxmoadg;
                    i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                    if (i29 == 1) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                        ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar7 = wwaezpbzkn.f37140iobyxmoadg;
                    } else if (i29 != 2) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                        boolean isExpand3 = model.getIsExpand();
                        if (tints != null) {
                            oipsdeybqnVarIobyxmoadg = null;
                        } else {
                            oipsdeybqnVarIobyxmoadg = null;
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                        if (oipsdeybqnVarIobyxmoadg == null) {
                            jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                        } else {
                            jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                        }
                        long j15 = jIwizpuwonk;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        mt.wkgbmnqykc.ppxfxbqfkf(isExpand3, fFloatValue, j15, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar8 = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        int i36 = i15;
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                        nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i36 & 14) | ((i36 >> 15) & 112) | ((i36 >> 9) & 896), 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar9 = wwaezpbzkn.f37140iobyxmoadg;
                    }
                    draadjrbmkVarBtonecajqb.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar11 = iobyxmoadgVar7;
                    iobyxmoadgVar12 = iobyxmoadgVar6;
                    iobyxmoadgVar13 = iobyxmoadgVar9;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    iobyxmoadgVar14 = iobyxmoadgVar8;
                    iobyxmoadgVar15 = iobyxmoadgVar10;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lt.gxszxtbevo
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return lqeggnwhkg.dxjokdxxww(model, counterStyle, wkgbmnqykcVar4, iobyxmoadgVar12, iobyxmoadgVar14, iobyxmoadgVar11, iobyxmoadgVar13, iobyxmoadgVar15, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            iobyxmoadgVar6 = iobyxmoadgVar;
            i18 = 16 & i14;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i15 |= i19;
                }
                i23 = 32 & i14;
                if (i23 != 0) {
                    i15 |= 196608;
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                } else {
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                    if ((i13 & 196608) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = 128 & i14;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i33 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.nufgyqmvbu();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    } else {
                        iobyxmoadgVar8 = iobyxmoadgVar2;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    }
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.draadjrbmk();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar4;
                    }
                    if (i27 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.wflxmlrfwp();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar5;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                    }
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    ColorsUiModel.Hex colorsModel5 = model.getColorsModel();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel5);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    boolean zEsjtqupxsv4 = model.esjtqupxsv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                    zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv4);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zIobyxmoadg) {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm4 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                    zynmafqrjb zynmafqrjbVarDxjokdxxww4 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm4);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar19 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar19.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww4, iobyxmoadgVar19.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar19.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar19.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar19.wkgbmnqykc());
                    wflxmlrfwp wflxmlrfwpVar4 = wflxmlrfwp.f4892iobyxmoadg;
                    i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                    if (i29 == 1) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                        ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar10 = wwaezpbzkn.f37140iobyxmoadg;
                    } else if (i29 != 2) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                        boolean isExpand4 = model.getIsExpand();
                        if (tints != null) {
                            oipsdeybqnVarIobyxmoadg = null;
                        } else {
                            oipsdeybqnVarIobyxmoadg = null;
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                        if (oipsdeybqnVarIobyxmoadg == null) {
                            jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                        } else {
                            jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                        }
                        long j16 = jIwizpuwonk;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        mt.wkgbmnqykc.ppxfxbqfkf(isExpand4, fFloatValue, j16, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar11 = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        int i37 = i15;
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                        nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i37 & 14) | ((i37 >> 15) & 112) | ((i37 >> 9) & 896), 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar12 = wwaezpbzkn.f37140iobyxmoadg;
                    }
                    draadjrbmkVarBtonecajqb.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar11 = iobyxmoadgVar7;
                    iobyxmoadgVar12 = iobyxmoadgVar6;
                    iobyxmoadgVar13 = iobyxmoadgVar9;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    iobyxmoadgVar14 = iobyxmoadgVar8;
                    iobyxmoadgVar15 = iobyxmoadgVar10;
                } else {
                    if (i33 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.nufgyqmvbu();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    } else {
                        iobyxmoadgVar8 = iobyxmoadgVar2;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    }
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.draadjrbmk();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar4;
                    }
                    if (i27 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.wflxmlrfwp();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar5;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                    }
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    ColorsUiModel.Hex colorsModel6 = model.getColorsModel();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel6);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    boolean zEsjtqupxsv5 = model.esjtqupxsv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                    zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv5);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zIobyxmoadg) {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm5 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                    zynmafqrjb zynmafqrjbVarDxjokdxxww5 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm5);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar110 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar110.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww5, iobyxmoadgVar110.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar110.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar110.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar110.wkgbmnqykc());
                    wflxmlrfwp wflxmlrfwpVar5 = wflxmlrfwp.f4892iobyxmoadg;
                    i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                    if (i29 == 1) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                        ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar13 = wwaezpbzkn.f37140iobyxmoadg;
                    } else if (i29 != 2) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                        boolean isExpand5 = model.getIsExpand();
                        if (tints != null) {
                            oipsdeybqnVarIobyxmoadg = null;
                        } else {
                            oipsdeybqnVarIobyxmoadg = null;
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                        if (oipsdeybqnVarIobyxmoadg == null) {
                            jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                        } else {
                            jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                        }
                        long j17 = jIwizpuwonk;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        mt.wkgbmnqykc.ppxfxbqfkf(isExpand5, fFloatValue, j17, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar14 = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        int i38 = i15;
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                        nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i38 & 14) | ((i38 >> 15) & 112) | ((i38 >> 9) & 896), 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar15 = wwaezpbzkn.f37140iobyxmoadg;
                    }
                    draadjrbmkVarBtonecajqb.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar11 = iobyxmoadgVar7;
                    iobyxmoadgVar12 = iobyxmoadgVar6;
                    iobyxmoadgVar13 = iobyxmoadgVar9;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    iobyxmoadgVar14 = iobyxmoadgVar8;
                    iobyxmoadgVar15 = iobyxmoadgVar10;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lt.gxszxtbevo
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return lqeggnwhkg.dxjokdxxww(model, counterStyle, wkgbmnqykcVar4, iobyxmoadgVar12, iobyxmoadgVar14, iobyxmoadgVar11, iobyxmoadgVar13, iobyxmoadgVar15, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            i23 = 32 & i14;
            if (i23 != 0) {
                i15 |= 196608;
                iobyxmoadgVar7 = iobyxmoadgVar3;
            } else {
                iobyxmoadgVar7 = iobyxmoadgVar3;
                if ((i13 & 196608) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = 128 & i14;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            if ((i15 & 4793491) == 4793490) {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.nufgyqmvbu();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar2;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                }
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.draadjrbmk();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar4;
                }
                if (i27 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.wflxmlrfwp();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar5;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                ColorsUiModel.Hex colorsModel7 = model.getColorsModel();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel7);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                boolean zEsjtqupxsv6 = model.esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv6);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zIobyxmoadg) {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm6 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                zynmafqrjb zynmafqrjbVarDxjokdxxww6 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm6);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar111 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar111.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww6, iobyxmoadgVar111.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar111.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar111.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar111.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar6 = wflxmlrfwp.f4892iobyxmoadg;
                i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                if (i29 == 1) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                    ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar16 = wwaezpbzkn.f37140iobyxmoadg;
                } else if (i29 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                    boolean isExpand6 = model.getIsExpand();
                    if (tints != null) {
                        oipsdeybqnVarIobyxmoadg = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg = null;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                    if (oipsdeybqnVarIobyxmoadg == null) {
                        jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                    } else {
                        jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                    }
                    long j18 = jIwizpuwonk;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    mt.wkgbmnqykc.ppxfxbqfkf(isExpand6, fFloatValue, j18, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar17 = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    int i39 = i15;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                    nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i39 & 14) | ((i39 >> 15) & 112) | ((i39 >> 9) & 896), 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar18 = wwaezpbzkn.f37140iobyxmoadg;
                }
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar11 = iobyxmoadgVar7;
                iobyxmoadgVar12 = iobyxmoadgVar6;
                iobyxmoadgVar13 = iobyxmoadgVar9;
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                iobyxmoadgVar14 = iobyxmoadgVar8;
                iobyxmoadgVar15 = iobyxmoadgVar10;
            } else {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.nufgyqmvbu();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar2;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                }
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.draadjrbmk();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar4;
                }
                if (i27 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.wflxmlrfwp();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar5;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                ColorsUiModel.Hex colorsModel8 = model.getColorsModel();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel8);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                boolean zEsjtqupxsv7 = model.esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv7);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zIobyxmoadg) {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm7 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                zynmafqrjb zynmafqrjbVarDxjokdxxww7 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt7 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg7 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm7);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar112 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar112.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww7, iobyxmoadgVar112.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt7, iobyxmoadgVar112.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar112.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg7, iobyxmoadgVar112.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar7 = wflxmlrfwp.f4892iobyxmoadg;
                i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                if (i29 == 1) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                    ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar19 = wwaezpbzkn.f37140iobyxmoadg;
                } else if (i29 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                    boolean isExpand7 = model.getIsExpand();
                    if (tints != null) {
                        oipsdeybqnVarIobyxmoadg = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg = null;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                    if (oipsdeybqnVarIobyxmoadg == null) {
                        jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                    } else {
                        jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                    }
                    long j19 = jIwizpuwonk;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    mt.wkgbmnqykc.ppxfxbqfkf(isExpand7, fFloatValue, j19, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar110 = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    int i310 = i15;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                    nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i310 & 14) | ((i310 >> 15) & 112) | ((i310 >> 9) & 896), 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar111 = wwaezpbzkn.f37140iobyxmoadg;
                }
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar11 = iobyxmoadgVar7;
                iobyxmoadgVar12 = iobyxmoadgVar6;
                iobyxmoadgVar13 = iobyxmoadgVar9;
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                iobyxmoadgVar14 = iobyxmoadgVar8;
                iobyxmoadgVar15 = iobyxmoadgVar10;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lt.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return lqeggnwhkg.dxjokdxxww(model, counterStyle, wkgbmnqykcVar4, iobyxmoadgVar12, iobyxmoadgVar14, iobyxmoadgVar11, iobyxmoadgVar13, iobyxmoadgVar15, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                iobyxmoadgVar6 = iobyxmoadgVar;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar6)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            i18 = 16 & i14;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i15 |= i19;
                }
                i23 = 32 & i14;
                if (i23 != 0) {
                    i15 |= 196608;
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                } else {
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                    if ((i13 & 196608) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = 128 & i14;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 4793491) == 4793490) {
                    if (i33 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.nufgyqmvbu();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    } else {
                        iobyxmoadgVar8 = iobyxmoadgVar2;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    }
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.draadjrbmk();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar4;
                    }
                    if (i27 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.wflxmlrfwp();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar5;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                    }
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    ColorsUiModel.Hex colorsModel9 = model.getColorsModel();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel9);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    boolean zEsjtqupxsv8 = model.esjtqupxsv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                    zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv8);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zIobyxmoadg) {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm8 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                    zynmafqrjb zynmafqrjbVarDxjokdxxww8 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt8 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg8 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm8);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar113 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar113.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww8, iobyxmoadgVar113.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt8, iobyxmoadgVar113.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar113.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg8, iobyxmoadgVar113.wkgbmnqykc());
                    wflxmlrfwp wflxmlrfwpVar8 = wflxmlrfwp.f4892iobyxmoadg;
                    i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                    if (i29 == 1) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                        ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar112 = wwaezpbzkn.f37140iobyxmoadg;
                    } else if (i29 != 2) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                        boolean isExpand8 = model.getIsExpand();
                        if (tints != null) {
                            oipsdeybqnVarIobyxmoadg = null;
                        } else {
                            oipsdeybqnVarIobyxmoadg = null;
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                        if (oipsdeybqnVarIobyxmoadg == null) {
                            jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                        } else {
                            jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                        }
                        long j110 = jIwizpuwonk;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        mt.wkgbmnqykc.ppxfxbqfkf(isExpand8, fFloatValue, j110, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar113 = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        int i311 = i15;
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                        nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i311 & 14) | ((i311 >> 15) & 112) | ((i311 >> 9) & 896), 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar114 = wwaezpbzkn.f37140iobyxmoadg;
                    }
                    draadjrbmkVarBtonecajqb.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar11 = iobyxmoadgVar7;
                    iobyxmoadgVar12 = iobyxmoadgVar6;
                    iobyxmoadgVar13 = iobyxmoadgVar9;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    iobyxmoadgVar14 = iobyxmoadgVar8;
                    iobyxmoadgVar15 = iobyxmoadgVar10;
                } else {
                    if (i33 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.nufgyqmvbu();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    } else {
                        iobyxmoadgVar8 = iobyxmoadgVar2;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    }
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.draadjrbmk();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar4;
                    }
                    if (i27 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return lqeggnwhkg.wflxmlrfwp();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar5;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                    }
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    ColorsUiModel.Hex colorsModel10 = model.getColorsModel();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel10);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru) {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        colorsModel = model.getColorsModel();
                        if (colorsModel != null) {
                            objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                        } else {
                            objYadqdtsiqt = null;
                        }
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    boolean zEsjtqupxsv9 = model.esjtqupxsv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                    zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv9);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zIobyxmoadg) {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        if (model.esjtqupxsv()) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.5f;
                        }
                        objYadqdtsiqt2 = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm9 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                    zynmafqrjb zynmafqrjbVarDxjokdxxww9 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt9 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg9 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm9);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar114 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar114.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww9, iobyxmoadgVar114.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt9, iobyxmoadgVar114.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar114.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg9, iobyxmoadgVar114.wkgbmnqykc());
                    wflxmlrfwp wflxmlrfwpVar9 = wflxmlrfwp.f4892iobyxmoadg;
                    i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                    if (i29 == 1) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                        ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar115 = wwaezpbzkn.f37140iobyxmoadg;
                    } else if (i29 != 2) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                        boolean isExpand9 = model.getIsExpand();
                        if (tints != null) {
                            oipsdeybqnVarIobyxmoadg = null;
                        } else {
                            oipsdeybqnVarIobyxmoadg = null;
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                        if (oipsdeybqnVarIobyxmoadg == null) {
                            jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                        } else {
                            jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                        }
                        long j111 = jIwizpuwonk;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        mt.wkgbmnqykc.ppxfxbqfkf(isExpand9, fFloatValue, j111, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar116 = wwaezpbzkn.f37140iobyxmoadg;
                    } else {
                        int i312 = i15;
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                        nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i312 & 14) | ((i312 >> 15) & 112) | ((i312 >> 9) & 896), 0);
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        wwaezpbzkn wwaezpbzknVar117 = wwaezpbzkn.f37140iobyxmoadg;
                    }
                    draadjrbmkVarBtonecajqb.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar11 = iobyxmoadgVar7;
                    iobyxmoadgVar12 = iobyxmoadgVar6;
                    iobyxmoadgVar13 = iobyxmoadgVar9;
                    wkgbmnqykcVar4 = wkgbmnqykcVar3;
                    iobyxmoadgVar14 = iobyxmoadgVar8;
                    iobyxmoadgVar15 = iobyxmoadgVar10;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lt.gxszxtbevo
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return lqeggnwhkg.dxjokdxxww(model, counterStyle, wkgbmnqykcVar4, iobyxmoadgVar12, iobyxmoadgVar14, iobyxmoadgVar11, iobyxmoadgVar13, iobyxmoadgVar15, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            i23 = 32 & i14;
            if (i23 != 0) {
                i15 |= 196608;
                iobyxmoadgVar7 = iobyxmoadgVar3;
            } else {
                iobyxmoadgVar7 = iobyxmoadgVar3;
                if ((i13 & 196608) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = 128 & i14;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            if ((i15 & 4793491) == 4793490) {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.nufgyqmvbu();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar2;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                }
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.draadjrbmk();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar4;
                }
                if (i27 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.wflxmlrfwp();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar5;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                ColorsUiModel.Hex colorsModel11 = model.getColorsModel();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel11);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                boolean zEsjtqupxsv10 = model.esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv10);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zIobyxmoadg) {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm10 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                zynmafqrjb zynmafqrjbVarDxjokdxxww10 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt10 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg10 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm10);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar115 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar115.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww10, iobyxmoadgVar115.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt10, iobyxmoadgVar115.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar115.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg10, iobyxmoadgVar115.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar10 = wflxmlrfwp.f4892iobyxmoadg;
                i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                if (i29 == 1) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                    ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar118 = wwaezpbzkn.f37140iobyxmoadg;
                } else if (i29 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                    boolean isExpand10 = model.getIsExpand();
                    if (tints != null) {
                        oipsdeybqnVarIobyxmoadg = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg = null;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                    if (oipsdeybqnVarIobyxmoadg == null) {
                        jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                    } else {
                        jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                    }
                    long j112 = jIwizpuwonk;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    mt.wkgbmnqykc.ppxfxbqfkf(isExpand10, fFloatValue, j112, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar119 = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    int i313 = i15;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                    nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i313 & 14) | ((i313 >> 15) & 112) | ((i313 >> 9) & 896), 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1110 = wwaezpbzkn.f37140iobyxmoadg;
                }
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar11 = iobyxmoadgVar7;
                iobyxmoadgVar12 = iobyxmoadgVar6;
                iobyxmoadgVar13 = iobyxmoadgVar9;
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                iobyxmoadgVar14 = iobyxmoadgVar8;
                iobyxmoadgVar15 = iobyxmoadgVar10;
            } else {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.nufgyqmvbu();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar2;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                }
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.draadjrbmk();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar4;
                }
                if (i27 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.wflxmlrfwp();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar5;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                ColorsUiModel.Hex colorsModel12 = model.getColorsModel();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel12);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                boolean zEsjtqupxsv11 = model.esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv11);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zIobyxmoadg) {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm11 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                zynmafqrjb zynmafqrjbVarDxjokdxxww11 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt11 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg11 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm11);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar116 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar116.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww11, iobyxmoadgVar116.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt11, iobyxmoadgVar116.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar116.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg11, iobyxmoadgVar116.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar11 = wflxmlrfwp.f4892iobyxmoadg;
                i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                if (i29 == 1) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                    ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1111 = wwaezpbzkn.f37140iobyxmoadg;
                } else if (i29 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                    boolean isExpand11 = model.getIsExpand();
                    if (tints != null) {
                        oipsdeybqnVarIobyxmoadg = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg = null;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                    if (oipsdeybqnVarIobyxmoadg == null) {
                        jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                    } else {
                        jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                    }
                    long j113 = jIwizpuwonk;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    mt.wkgbmnqykc.ppxfxbqfkf(isExpand11, fFloatValue, j113, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1112 = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    int i314 = i15;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                    nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i314 & 14) | ((i314 >> 15) & 112) | ((i314 >> 9) & 896), 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1113 = wwaezpbzkn.f37140iobyxmoadg;
                }
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar11 = iobyxmoadgVar7;
                iobyxmoadgVar12 = iobyxmoadgVar6;
                iobyxmoadgVar13 = iobyxmoadgVar9;
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                iobyxmoadgVar14 = iobyxmoadgVar8;
                iobyxmoadgVar15 = iobyxmoadgVar10;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lt.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return lqeggnwhkg.dxjokdxxww(model, counterStyle, wkgbmnqykcVar4, iobyxmoadgVar12, iobyxmoadgVar14, iobyxmoadgVar11, iobyxmoadgVar13, iobyxmoadgVar15, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        iobyxmoadgVar6 = iobyxmoadgVar;
        i18 = 16 & i14;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i15 |= i19;
            }
            i23 = 32 & i14;
            if (i23 != 0) {
                i15 |= 196608;
                iobyxmoadgVar7 = iobyxmoadgVar3;
            } else {
                iobyxmoadgVar7 = iobyxmoadgVar3;
                if ((i13 & 196608) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = 128 & i14;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            if ((i15 & 4793491) == 4793490) {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.nufgyqmvbu();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar2;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                }
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.draadjrbmk();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar4;
                }
                if (i27 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.wflxmlrfwp();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar5;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                ColorsUiModel.Hex colorsModel13 = model.getColorsModel();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel13);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                boolean zEsjtqupxsv12 = model.esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv12);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zIobyxmoadg) {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm12 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                zynmafqrjb zynmafqrjbVarDxjokdxxww12 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt12 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg12 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm12);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar117 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar117.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww12, iobyxmoadgVar117.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt12, iobyxmoadgVar117.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar117.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg12, iobyxmoadgVar117.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar12 = wflxmlrfwp.f4892iobyxmoadg;
                i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                if (i29 == 1) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                    ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1114 = wwaezpbzkn.f37140iobyxmoadg;
                } else if (i29 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                    boolean isExpand12 = model.getIsExpand();
                    if (tints != null) {
                        oipsdeybqnVarIobyxmoadg = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg = null;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                    if (oipsdeybqnVarIobyxmoadg == null) {
                        jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                    } else {
                        jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                    }
                    long j114 = jIwizpuwonk;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    mt.wkgbmnqykc.ppxfxbqfkf(isExpand12, fFloatValue, j114, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1115 = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    int i315 = i15;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                    nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i315 & 14) | ((i315 >> 15) & 112) | ((i315 >> 9) & 896), 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1116 = wwaezpbzkn.f37140iobyxmoadg;
                }
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar11 = iobyxmoadgVar7;
                iobyxmoadgVar12 = iobyxmoadgVar6;
                iobyxmoadgVar13 = iobyxmoadgVar9;
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                iobyxmoadgVar14 = iobyxmoadgVar8;
                iobyxmoadgVar15 = iobyxmoadgVar10;
            } else {
                if (i33 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.nufgyqmvbu();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar2;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
                }
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.draadjrbmk();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar4;
                }
                if (i27 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return lqeggnwhkg.wflxmlrfwp();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar5;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                ColorsUiModel.Hex colorsModel14 = model.getColorsModel();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel14);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    colorsModel = model.getColorsModel();
                    if (colorsModel != null) {
                        objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                    } else {
                        objYadqdtsiqt = null;
                    }
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                boolean zEsjtqupxsv13 = model.esjtqupxsv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
                zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv13);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zIobyxmoadg) {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    if (model.esjtqupxsv()) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.5f;
                    }
                    objYadqdtsiqt2 = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm13 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
                zynmafqrjb zynmafqrjbVarDxjokdxxww13 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt13 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg13 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm13);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar118 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar118.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww13, iobyxmoadgVar118.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt13, iobyxmoadgVar118.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar118.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg13, iobyxmoadgVar118.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar13 = wflxmlrfwp.f4892iobyxmoadg;
                i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
                if (i29 == 1) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                    ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1117 = wwaezpbzkn.f37140iobyxmoadg;
                } else if (i29 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                    boolean isExpand13 = model.getIsExpand();
                    if (tints != null) {
                        oipsdeybqnVarIobyxmoadg = null;
                    } else {
                        oipsdeybqnVarIobyxmoadg = null;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                    if (oipsdeybqnVarIobyxmoadg == null) {
                        jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                    } else {
                        jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                    }
                    long j115 = jIwizpuwonk;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    mt.wkgbmnqykc.ppxfxbqfkf(isExpand13, fFloatValue, j115, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1118 = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    int i316 = i15;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                    nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i316 & 14) | ((i316 >> 15) & 112) | ((i316 >> 9) & 896), 0);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    wwaezpbzkn wwaezpbzknVar1119 = wwaezpbzkn.f37140iobyxmoadg;
                }
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar11 = iobyxmoadgVar7;
                iobyxmoadgVar12 = iobyxmoadgVar6;
                iobyxmoadgVar13 = iobyxmoadgVar9;
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
                iobyxmoadgVar14 = iobyxmoadgVar8;
                iobyxmoadgVar15 = iobyxmoadgVar10;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lt.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return lqeggnwhkg.dxjokdxxww(model, counterStyle, wkgbmnqykcVar4, iobyxmoadgVar12, iobyxmoadgVar14, iobyxmoadgVar11, iobyxmoadgVar13, iobyxmoadgVar15, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        i23 = 32 & i14;
        if (i23 != 0) {
            i15 |= 196608;
            iobyxmoadgVar7 = iobyxmoadgVar3;
        } else {
            iobyxmoadgVar7 = iobyxmoadgVar3;
            if ((i13 & 196608) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
        }
        i25 = i14 & 64;
        if (i25 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar4)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        i27 = 128 & i14;
        if (i27 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i15 |= i28;
        }
        if ((i15 & 4793491) == 4793490) {
            if (i33 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.nufgyqmvbu();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.btonecajqb();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
            } else {
                iobyxmoadgVar8 = iobyxmoadgVar2;
            }
            if (i23 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.gtknphoqwx();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
            }
            if (i25 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.draadjrbmk();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
            } else {
                iobyxmoadgVar9 = iobyxmoadgVar4;
            }
            if (i27 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.wflxmlrfwp();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
            } else {
                iobyxmoadgVar10 = iobyxmoadgVar5;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
            }
            context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            ColorsUiModel.Hex colorsModel15 = model.getColorsModel();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel15);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                colorsModel = model.getColorsModel();
                if (colorsModel != null) {
                    objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                } else {
                    objYadqdtsiqt = null;
                }
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                colorsModel = model.getColorsModel();
                if (colorsModel != null) {
                    objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                } else {
                    objYadqdtsiqt = null;
                }
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            boolean zEsjtqupxsv14 = model.esjtqupxsv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
            zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv14);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zIobyxmoadg) {
                if (model.esjtqupxsv()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                objYadqdtsiqt2 = Float.valueOf(f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                if (model.esjtqupxsv()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                objYadqdtsiqt2 = Float.valueOf(f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm14 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
            zynmafqrjb zynmafqrjbVarDxjokdxxww14 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt14 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg14 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm14);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar119 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar119.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww14, iobyxmoadgVar119.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt14, iobyxmoadgVar119.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar119.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg14, iobyxmoadgVar119.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar14 = wflxmlrfwp.f4892iobyxmoadg;
            i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
            if (i29 == 1) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wwaezpbzkn wwaezpbzknVar11110 = wwaezpbzkn.f37140iobyxmoadg;
            } else if (i29 != 2) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                boolean isExpand14 = model.getIsExpand();
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg = null;
                } else {
                    oipsdeybqnVarIobyxmoadg = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                if (oipsdeybqnVarIobyxmoadg == null) {
                    jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                } else {
                    jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                }
                long j116 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                mt.wkgbmnqykc.ppxfxbqfkf(isExpand14, fFloatValue, j116, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wwaezpbzkn wwaezpbzknVar11111 = wwaezpbzkn.f37140iobyxmoadg;
            } else {
                int i317 = i15;
                draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i317 & 14) | ((i317 >> 15) & 112) | ((i317 >> 9) & 896), 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wwaezpbzkn wwaezpbzknVar11112 = wwaezpbzkn.f37140iobyxmoadg;
            }
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar11 = iobyxmoadgVar7;
            iobyxmoadgVar12 = iobyxmoadgVar6;
            iobyxmoadgVar13 = iobyxmoadgVar9;
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
            iobyxmoadgVar14 = iobyxmoadgVar8;
            iobyxmoadgVar15 = iobyxmoadgVar10;
        } else {
            if (i33 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890193313);
                objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt7 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: lt.iobyxmoadg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.nufgyqmvbu();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar6 = (tg.iobyxmoadg) objYadqdtsiqt7;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890194689);
                objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt6 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: lt.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.btonecajqb();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar8 = (tg.iobyxmoadg) objYadqdtsiqt6;
            } else {
                iobyxmoadgVar8 = iobyxmoadgVar2;
            }
            if (i23 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890195969);
                objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: lt.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.gtknphoqwx();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar7 = (tg.iobyxmoadg) objYadqdtsiqt5;
            }
            if (i25 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890197249);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: lt.wkgbmnqykc
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.draadjrbmk();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt4;
            } else {
                iobyxmoadgVar9 = iobyxmoadgVar4;
            }
            if (i27 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1890198337);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: lt.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return lqeggnwhkg.wflxmlrfwp();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt3;
            } else {
                iobyxmoadgVar10 = iobyxmoadgVar5;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(717517414, i15, -1, "ru.myspar.common.view.counter.compose.Counter (Counter.kt:40)");
            }
            context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            ColorsUiModel.Hex colorsModel16 = model.getColorsModel();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1890200487);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsModel16);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                colorsModel = model.getColorsModel();
                if (colorsModel != null) {
                    objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                } else {
                    objYadqdtsiqt = null;
                }
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                colorsModel = model.getColorsModel();
                if (colorsModel != null) {
                    objYadqdtsiqt = colorsModel.ppxfxbqfkf(c60.zoijcleaow.eablkybsjg(context));
                } else {
                    objYadqdtsiqt = null;
                }
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            boolean zEsjtqupxsv15 = model.esjtqupxsv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1890204399);
            zIobyxmoadg = draadjrbmkVarBtonecajqb.iobyxmoadg(zEsjtqupxsv15);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zIobyxmoadg) {
                if (model.esjtqupxsv()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                objYadqdtsiqt2 = Float.valueOf(f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                if (model.esjtqupxsv()) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                objYadqdtsiqt2 = Float.valueOf(f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            fFloatValue = ((Number) objYadqdtsiqt2).floatValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm15 = l50.draadjrbmk.oxmwwwfdhm(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "COUNTER", null, null, false, 14, null), model.getPriceModel().getPriceDouble(), model.getMeasureType().getBasketDefault(), model.getMeasureType().getRatio(), model.getAvgWeight(), model.getMeasureType().getMinAvailable(), model.getMeasureType().getValue(), model.getQuantity());
            zynmafqrjb zynmafqrjbVarDxjokdxxww15 = nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt15 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg15 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarOxmwwwfdhm15);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar1110 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar1110.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww15, iobyxmoadgVar1110.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt15, iobyxmoadgVar1110.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar1110.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg15, iobyxmoadgVar1110.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar15 = wflxmlrfwp.f4892iobyxmoadg;
            i29 = zoijcleaow.f64004iobyxmoadg[counterStyle.ordinal()];
            if (i29 == 1) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1991339576);
                ot.dxjokdxxww.zoijcleaow(model, draadjrbmkVarBtonecajqb, i15 & 14);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wwaezpbzkn wwaezpbzknVar11113 = wwaezpbzkn.f37140iobyxmoadg;
            } else if (i29 != 2) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1602288545);
                boolean isExpand15 = model.getIsExpand();
                if (tints != null) {
                    oipsdeybqnVarIobyxmoadg = null;
                } else {
                    oipsdeybqnVarIobyxmoadg = null;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1991354099);
                if (oipsdeybqnVarIobyxmoadg == null) {
                    jIwizpuwonk = z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).btonecajqb();
                } else {
                    jIwizpuwonk = oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                }
                long j117 = jIwizpuwonk;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                mt.wkgbmnqykc.ppxfxbqfkf(isExpand15, fFloatValue, j117, counterStyle, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1332728291, true, new iobyxmoadg(model, counterStyle, tints, iobyxmoadgVar8, iobyxmoadgVar6, iobyxmoadgVar9, iobyxmoadgVar7, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 << 6) & 7168) | 24576, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wwaezpbzkn wwaezpbzknVar11114 = wwaezpbzkn.f37140iobyxmoadg;
            } else {
                int i318 = i15;
                draadjrbmkVarBtonecajqb.sopmlzcsov(1991342159);
                nt.rgvfuqvkyq.wkgbmnqykc(model, iobyxmoadgVar9, iobyxmoadgVar7, draadjrbmkVarBtonecajqb, (i318 & 14) | ((i318 >> 15) & 112) | ((i318 >> 9) & 896), 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                wwaezpbzkn wwaezpbzknVar11115 = wwaezpbzkn.f37140iobyxmoadg;
            }
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar11 = iobyxmoadgVar7;
            iobyxmoadgVar12 = iobyxmoadgVar6;
            iobyxmoadgVar13 = iobyxmoadgVar9;
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
            iobyxmoadgVar14 = iobyxmoadgVar8;
            iobyxmoadgVar15 = iobyxmoadgVar10;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: lt.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.dxjokdxxww(model, counterStyle, wkgbmnqykcVar4, iobyxmoadgVar12, iobyxmoadgVar14, iobyxmoadgVar11, iobyxmoadgVar13, iobyxmoadgVar15, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
