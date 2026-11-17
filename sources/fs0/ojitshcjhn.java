package fs0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import h.oipsdeybqn;
import igdgnonuha.z;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ojitshcjhn {

    public /* synthetic */ class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f34944iobyxmoadg;

        static {
            int[] iArr = new int[js0.zoijcleaow.values().length];
            try {
                iArr[js0.zoijcleaow.HALF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f34944iobyxmoadg = iArr;
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f34945jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ CounterModel f34946yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34947zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(CounterModel counterModel, tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34946yggfygwlhe = counterModel;
            this.f34945jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f34946yggfygwlhe, this.f34945jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34947zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (this.f34946yggfygwlhe.getAutoHideMessage() && this.f34946yggfygwlhe.getMessage() != null) {
                    this.f34947zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            this.f34945jyumaefscl.invoke();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ColorsUiModel.Hex.Tints f34948yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ CounterModel f34949zdlpuopuiu;

        ppxfxbqfkf(CounterModel counterModel, ColorsUiModel.Hex.Tints tints) {
            this.f34949zdlpuopuiu = counterModel;
            this.f34948yggfygwlhe = tints;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((ribwqtqdhb.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ribwqtqdhb.wkgbmnqykc AnimatedVisibility, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            String onPrimary;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(AnimatedVisibility, "$this$AnimatedVisibility");
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1253802115, i13, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent.<anonymous>.<anonymous> (LiveCounterContent.kt:87)");
            }
            String productLimitText = this.f34949zdlpuopuiu.getProductLimitText();
            if (productLimitText == null) {
                productLimitText = "";
            }
            ColorsUiModel.Hex.Tints tints = this.f34948yggfygwlhe;
            oipsdeybqn oipsdeybqnVarIobyxmoadg = (tints == null || (onPrimary = tints.getOnPrimary()) == null) ? null : j41.iobyxmoadg.iobyxmoadg(onPrimary);
            draadjrbmkVar.sopmlzcsov(-1781358779);
            long jYadqdtsiqt = oipsdeybqnVarIobyxmoadg == null ? l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVar, z.f44181zoijcleaow).yadqdtsiqt() : oipsdeybqnVarIobyxmoadg.iwizpuwonk();
            draadjrbmkVar.stevsuqkhv();
            gxszxtbevo.zoijcleaow(productLimitText, jYadqdtsiqt, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class wkgbmnqykc implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f34950iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f34951jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ColorsUiModel.Hex.Tints f34952yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ CounterModel f34953zdlpuopuiu;

        wkgbmnqykc(CounterModel counterModel, ColorsUiModel.Hex.Tints tints, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
            this.f34953zdlpuopuiu = counterModel;
            this.f34952yggfygwlhe = tints;
            this.f34951jyumaefscl = iobyxmoadgVar;
            this.f34950iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((ribwqtqdhb.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ribwqtqdhb.wkgbmnqykc AnimatedVisibility, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(AnimatedVisibility, "$this$AnimatedVisibility");
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-125983198, i13, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent.<anonymous>.<anonymous> (LiveCounterContent.kt:99)");
            }
            gs0.btonecajqb.wkgbmnqykc(null, this.f34953zdlpuopuiu, this.f34952yggfygwlhe, this.f34951jyumaefscl, this.f34950iwizpuwonk, draadjrbmkVar, 0, 1);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class zoijcleaow implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ColorsUiModel.Hex.Tints f34954yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ CounterModel f34955zdlpuopuiu;

        zoijcleaow(CounterModel counterModel, ColorsUiModel.Hex.Tints tints) {
            this.f34955zdlpuopuiu = counterModel;
            this.f34954yggfygwlhe = tints;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((ribwqtqdhb.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ribwqtqdhb.wkgbmnqykc AnimatedVisibility, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            String onPrimary;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(AnimatedVisibility, "$this$AnimatedVisibility");
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2062666906, i13, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent.<anonymous>.<anonymous> (LiveCounterContent.kt:75)");
            }
            String message = this.f34955zdlpuopuiu.getMessage();
            if (message == null) {
                message = "";
            }
            ColorsUiModel.Hex.Tints tints = this.f34954yggfygwlhe;
            oipsdeybqn oipsdeybqnVarIobyxmoadg = (tints == null || (onPrimary = tints.getOnPrimary()) == null) ? null : j41.iobyxmoadg.iobyxmoadg(onPrimary);
            draadjrbmkVar.sopmlzcsov(-1781371931);
            long jYadqdtsiqt = oipsdeybqnVarIobyxmoadg == null ? l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVar, z.f44181zoijcleaow).yadqdtsiqt() : oipsdeybqnVarIobyxmoadg.iwizpuwonk();
            draadjrbmkVar.stevsuqkhv();
            gxszxtbevo.zoijcleaow(message, jYadqdtsiqt, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0158  */
    /* JADX WARN: Code duplicated, block: B:102:0x016a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0178  */
    /* JADX WARN: Code duplicated, block: B:107:0x017f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0195  */
    /* JADX WARN: Code duplicated, block: B:111:0x0197  */
    /* JADX WARN: Code duplicated, block: B:114:0x019e  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01df  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:132:0x020e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0211  */
    /* JADX WARN: Code duplicated, block: B:136:0x0225  */
    /* JADX WARN: Code duplicated, block: B:139:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x0275  */
    /* JADX WARN: Code duplicated, block: B:143:0x0279  */
    /* JADX WARN: Code duplicated, block: B:146:0x0298  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:157:0x0301  */
    /* JADX WARN: Code duplicated, block: B:161:0x030b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0340  */
    /* JADX WARN: Code duplicated, block: B:171:0x0352  */
    /* JADX WARN: Code duplicated, block: B:174:0x0383  */
    /* JADX WARN: Code duplicated, block: B:178:0x0393  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:96:0x0147  */
    /* JADX WARN: Code duplicated, block: B:98:0x0155  */
    public static final void gxszxtbevo(final CounterModel model, final js0.zoijcleaow counterStyle, final ColorsUiModel.Hex.Tints tints, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.iobyxmoadg iobyxmoadgVar4, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        tg.iobyxmoadg iobyxmoadgVar5;
        int i16;
        tg.iobyxmoadg iobyxmoadgVar6;
        int i17;
        int i18;
        tg.iobyxmoadg iobyxmoadgVar7;
        int i19;
        int i23;
        tg.iobyxmoadg iobyxmoadgVar8;
        int i24;
        tg.iobyxmoadg iobyxmoadgVar9;
        tg.iobyxmoadg iobyxmoadgVar10;
        tg.iobyxmoadg iobyxmoadgVar11;
        boolean z13;
        Object objYadqdtsiqt;
        float f13;
        boolean z14;
        boolean z15;
        Object objYadqdtsiqt2;
        boolean z16;
        Object objYadqdtsiqt3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        boolean z17;
        boolean z18;
        boolean z19;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final tg.iobyxmoadg iobyxmoadgVar12;
        final tg.iobyxmoadg iobyxmoadgVar13;
        final tg.iobyxmoadg iobyxmoadgVar14;
        Object objYadqdtsiqt4;
        Object objYadqdtsiqt5;
        Object objYadqdtsiqt6;
        Object objYadqdtsiqt7;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(counterStyle, "counterStyle");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-117356104);
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
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(tints) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                iobyxmoadgVar5 = iobyxmoadgVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar5) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    iobyxmoadgVar6 = iobyxmoadgVar2;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar6)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        iobyxmoadgVar7 = iobyxmoadgVar3;
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i15 |= i19;
                    }
                    i23 = i14 & 64;
                    if (i23 != 0) {
                        i15 |= 1572864;
                        iobyxmoadgVar8 = iobyxmoadgVar4;
                    } else {
                        iobyxmoadgVar8 = iobyxmoadgVar4;
                        if ((i13 & 1572864) == 0) {
                            if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar8)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i15 |= i24;
                        }
                    }
                    if ((i15 & 599187) == 599186 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                        if (i25 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                            objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return ojitshcjhn.lqeggnwhkg();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                            }
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                            iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                        }
                        if (i16 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                            objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return ojitshcjhn.dxjokdxxww();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                            }
                            iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                        } else {
                            iobyxmoadgVar9 = iobyxmoadgVar6;
                        }
                        if (i18 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                            objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return ojitshcjhn.btonecajqb();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                            }
                            iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                        } else {
                            iobyxmoadgVar10 = iobyxmoadgVar7;
                        }
                        if (i23 != 0) {
                            draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                            objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                            if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                                    @Override // tg.iobyxmoadg
                                    public final Object invoke() {
                                        return ojitshcjhn.gtknphoqwx();
                                    }
                                };
                                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                            }
                            iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                            draadjrbmkVarBtonecajqb.stevsuqkhv();
                        } else {
                            iobyxmoadgVar11 = iobyxmoadgVar8;
                        }
                        if (jyumaefscl.jpowsppfya()) {
                            jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                                f13 = 0.5f;
                            } else {
                                f13 = 1.0f;
                            }
                            objYadqdtsiqt = Float.valueOf(f13);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                        }
                        float fFloatValue = ((Number) objYadqdtsiqt).floatValue();
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        Boolean boolValueOf = Boolean.valueOf(model.getAutoHideMessage());
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                        boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                        if ((i15 & 3670016) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | zLmojexxdyd;
                        objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (z15 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        jlmebxxoox.eablkybsjg(boolValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue);
                        if (model.getMessage() != null) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                        objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                        zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                        androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
                        z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar15 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar15.iobyxmoadg();
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
                        m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar15.ppxfxbqfkf());
                        m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar15.eablkybsjg());
                        rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar15.zoijcleaow();
                        if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                            draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                            draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                        }
                        m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar15.wkgbmnqykc());
                        androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                        if (!model.getIsLoading() || model.getMessage() == null) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                        if (!model.getIsLoading() || model.getProductLimitText() == null) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                        if (!model.getIsLoading() || (model.getProductLimitText() == null && model.getMessage() == null)) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                        ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                        draadjrbmkVar2.cqumvgiudr();
                        if (jyumaefscl.jpowsppfya()) {
                            jyumaefscl.mbcevpiqjq();
                        }
                        iobyxmoadgVar8 = iobyxmoadgVar11;
                        iobyxmoadgVar12 = iobyxmoadgVar9;
                        tg.iobyxmoadg iobyxmoadgVar16 = iobyxmoadgVar5;
                        iobyxmoadgVar13 = iobyxmoadgVar10;
                        iobyxmoadgVar14 = iobyxmoadgVar16;
                    } else {
                        draadjrbmkVarBtonecajqb.hkdspvbjdz();
                        iobyxmoadgVar14 = iobyxmoadgVar5;
                        iobyxmoadgVar12 = iobyxmoadgVar6;
                        iobyxmoadgVar13 = iobyxmoadgVar7;
                        draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    }
                    a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
                    if (a0VarWflxmlrfwp != null) {
                        final tg.iobyxmoadg iobyxmoadgVar17 = iobyxmoadgVar8;
                        a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.agtfadlqog
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return ojitshcjhn.nufgyqmvbu(model, counterStyle, tints, iobyxmoadgVar14, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar17, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i15 |= 196608;
                iobyxmoadgVar7 = iobyxmoadgVar3;
                i23 = i14 & 64;
                if (i23 != 0) {
                    i15 |= 1572864;
                    iobyxmoadgVar8 = iobyxmoadgVar4;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar4;
                    if ((i13 & 1572864) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar8)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i15 |= i24;
                    }
                }
                if ((i15 & 599187) == 599186) {
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.lqeggnwhkg();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.dxjokdxxww();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar6;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar7;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar11 = iobyxmoadgVar8;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13) {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    float fFloatValue2 = ((Number) objYadqdtsiqt).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    Boolean boolValueOf2 = Boolean.valueOf(model.getAutoHideMessage());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                    boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                    if ((i15 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zLmojexxdyd2;
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15) {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(boolValueOf2, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg2 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue2);
                    if (model.getMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg2, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                    zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo2);
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar18.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar18.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar18.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar18.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar2 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    if (model.getIsLoading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    draadjrbmkVar2.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar8 = iobyxmoadgVar11;
                    iobyxmoadgVar12 = iobyxmoadgVar9;
                    tg.iobyxmoadg iobyxmoadgVar19 = iobyxmoadgVar5;
                    iobyxmoadgVar13 = iobyxmoadgVar10;
                    iobyxmoadgVar14 = iobyxmoadgVar19;
                } else {
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.lqeggnwhkg();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.dxjokdxxww();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar6;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar7;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar11 = iobyxmoadgVar8;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13) {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    float fFloatValue3 = ((Number) objYadqdtsiqt).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    Boolean boolValueOf3 = Boolean.valueOf(model.getAutoHideMessage());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                    boolean zLmojexxdyd3 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                    if ((i15 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zLmojexxdyd3;
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15) {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(boolValueOf3, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg3 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue3);
                    if (model.getMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo3 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg3, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                    zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo3);
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar110.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar110.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar110.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar110.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar3 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    if (model.getIsLoading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    draadjrbmkVar2.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar8 = iobyxmoadgVar11;
                    iobyxmoadgVar12 = iobyxmoadgVar9;
                    tg.iobyxmoadg iobyxmoadgVar111 = iobyxmoadgVar5;
                    iobyxmoadgVar13 = iobyxmoadgVar10;
                    iobyxmoadgVar14 = iobyxmoadgVar111;
                }
                a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final tg.iobyxmoadg iobyxmoadgVar112 = iobyxmoadgVar8;
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.agtfadlqog
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ojitshcjhn.nufgyqmvbu(model, counterStyle, tints, iobyxmoadgVar14, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar112, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 24576;
            iobyxmoadgVar6 = iobyxmoadgVar2;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i15 |= i19;
                }
                i23 = i14 & 64;
                if (i23 != 0) {
                    i15 |= 1572864;
                    iobyxmoadgVar8 = iobyxmoadgVar4;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar4;
                    if ((i13 & 1572864) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar8)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i15 |= i24;
                    }
                }
                if ((i15 & 599187) == 599186) {
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.lqeggnwhkg();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.dxjokdxxww();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar6;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar7;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar11 = iobyxmoadgVar8;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13) {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    float fFloatValue4 = ((Number) objYadqdtsiqt).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    Boolean boolValueOf4 = Boolean.valueOf(model.getAutoHideMessage());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                    boolean zLmojexxdyd4 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                    if ((i15 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zLmojexxdyd4;
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15) {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(boolValueOf4, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg4 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue4);
                    if (model.getMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo4 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg4, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                    zynmafqrjb zynmafqrjbVarDxjokdxxww4 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt4 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg4 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo4);
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww4, iobyxmoadgVar113.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt4, iobyxmoadgVar113.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar113.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg4, iobyxmoadgVar113.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar4 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    if (model.getIsLoading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    draadjrbmkVar2.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar8 = iobyxmoadgVar11;
                    iobyxmoadgVar12 = iobyxmoadgVar9;
                    tg.iobyxmoadg iobyxmoadgVar114 = iobyxmoadgVar5;
                    iobyxmoadgVar13 = iobyxmoadgVar10;
                    iobyxmoadgVar14 = iobyxmoadgVar114;
                } else {
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.lqeggnwhkg();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.dxjokdxxww();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar6;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar7;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar11 = iobyxmoadgVar8;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13) {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    float fFloatValue5 = ((Number) objYadqdtsiqt).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    Boolean boolValueOf5 = Boolean.valueOf(model.getAutoHideMessage());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                    boolean zLmojexxdyd5 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                    if ((i15 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zLmojexxdyd5;
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15) {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(boolValueOf5, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg5 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue5);
                    if (model.getMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo5 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg5, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                    zynmafqrjb zynmafqrjbVarDxjokdxxww5 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt5 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg5 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo5);
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww5, iobyxmoadgVar115.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt5, iobyxmoadgVar115.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar115.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg5, iobyxmoadgVar115.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar5 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    if (model.getIsLoading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    draadjrbmkVar2.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar8 = iobyxmoadgVar11;
                    iobyxmoadgVar12 = iobyxmoadgVar9;
                    tg.iobyxmoadg iobyxmoadgVar116 = iobyxmoadgVar5;
                    iobyxmoadgVar13 = iobyxmoadgVar10;
                    iobyxmoadgVar14 = iobyxmoadgVar116;
                }
                a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final tg.iobyxmoadg iobyxmoadgVar117 = iobyxmoadgVar8;
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.agtfadlqog
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ojitshcjhn.nufgyqmvbu(model, counterStyle, tints, iobyxmoadgVar14, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar117, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 196608;
            iobyxmoadgVar7 = iobyxmoadgVar3;
            i23 = i14 & 64;
            if (i23 != 0) {
                i15 |= 1572864;
                iobyxmoadgVar8 = iobyxmoadgVar4;
            } else {
                iobyxmoadgVar8 = iobyxmoadgVar4;
                if ((i13 & 1572864) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar8)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
            }
            if ((i15 & 599187) == 599186) {
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.lqeggnwhkg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.dxjokdxxww();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar6;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar7;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar11 = iobyxmoadgVar8;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                float fFloatValue6 = ((Number) objYadqdtsiqt).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf6 = Boolean.valueOf(model.getAutoHideMessage());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                boolean zLmojexxdyd6 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                if ((i15 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zLmojexxdyd6;
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15) {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf6, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg6 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue6);
                if (model.getMessage() != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo6 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg6, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww6 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt6 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg6 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo6);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww6, iobyxmoadgVar118.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt6, iobyxmoadgVar118.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar118.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg6, iobyxmoadgVar118.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar6 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                if (model.getIsLoading()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar8 = iobyxmoadgVar11;
                iobyxmoadgVar12 = iobyxmoadgVar9;
                tg.iobyxmoadg iobyxmoadgVar119 = iobyxmoadgVar5;
                iobyxmoadgVar13 = iobyxmoadgVar10;
                iobyxmoadgVar14 = iobyxmoadgVar119;
            } else {
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.lqeggnwhkg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.dxjokdxxww();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar6;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar7;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar11 = iobyxmoadgVar8;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                float fFloatValue7 = ((Number) objYadqdtsiqt).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf7 = Boolean.valueOf(model.getAutoHideMessage());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                boolean zLmojexxdyd7 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                if ((i15 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zLmojexxdyd7;
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15) {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf7, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg7 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue7);
                if (model.getMessage() != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo7 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg7, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww7 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt7 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg7 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo7);
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww7, iobyxmoadgVar1110.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt7, iobyxmoadgVar1110.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar1110.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg7, iobyxmoadgVar1110.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar7 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                if (model.getIsLoading()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar8 = iobyxmoadgVar11;
                iobyxmoadgVar12 = iobyxmoadgVar9;
                tg.iobyxmoadg iobyxmoadgVar1111 = iobyxmoadgVar5;
                iobyxmoadgVar13 = iobyxmoadgVar10;
                iobyxmoadgVar14 = iobyxmoadgVar1111;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final tg.iobyxmoadg iobyxmoadgVar1112 = iobyxmoadgVar8;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.agtfadlqog
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ojitshcjhn.nufgyqmvbu(model, counterStyle, tints, iobyxmoadgVar14, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar1112, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        iobyxmoadgVar5 = iobyxmoadgVar;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                iobyxmoadgVar6 = iobyxmoadgVar2;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar6)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    iobyxmoadgVar7 = iobyxmoadgVar3;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i15 |= i19;
                }
                i23 = i14 & 64;
                if (i23 != 0) {
                    i15 |= 1572864;
                    iobyxmoadgVar8 = iobyxmoadgVar4;
                } else {
                    iobyxmoadgVar8 = iobyxmoadgVar4;
                    if ((i13 & 1572864) == 0) {
                        if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar8)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i15 |= i24;
                    }
                }
                if ((i15 & 599187) == 599186) {
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.lqeggnwhkg();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.dxjokdxxww();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar6;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar7;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar11 = iobyxmoadgVar8;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13) {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    float fFloatValue8 = ((Number) objYadqdtsiqt).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    Boolean boolValueOf8 = Boolean.valueOf(model.getAutoHideMessage());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                    boolean zLmojexxdyd8 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                    if ((i15 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zLmojexxdyd8;
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15) {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(boolValueOf8, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg8 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue8);
                    if (model.getMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo8 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg8, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                    zynmafqrjb zynmafqrjbVarDxjokdxxww8 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt8 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg8 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo8);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar1113 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar1113.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww8, iobyxmoadgVar1113.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt8, iobyxmoadgVar1113.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar1113.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg8, iobyxmoadgVar1113.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar8 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    if (model.getIsLoading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    draadjrbmkVar2.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar8 = iobyxmoadgVar11;
                    iobyxmoadgVar12 = iobyxmoadgVar9;
                    tg.iobyxmoadg iobyxmoadgVar1114 = iobyxmoadgVar5;
                    iobyxmoadgVar13 = iobyxmoadgVar10;
                    iobyxmoadgVar14 = iobyxmoadgVar1114;
                } else {
                    if (i25 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                        objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.lqeggnwhkg();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                        }
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                        iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                        objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.dxjokdxxww();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                        }
                        iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar9 = iobyxmoadgVar6;
                    }
                    if (i18 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.btonecajqb();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar10 = iobyxmoadgVar7;
                    }
                    if (i23 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                        objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return ojitshcjhn.gtknphoqwx();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                        }
                        iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar11 = iobyxmoadgVar8;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z13) {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    } else {
                        if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                            f13 = 0.5f;
                        } else {
                            f13 = 1.0f;
                        }
                        objYadqdtsiqt = Float.valueOf(f13);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    float fFloatValue9 = ((Number) objYadqdtsiqt).floatValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    Boolean boolValueOf9 = Boolean.valueOf(model.getAutoHideMessage());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                    boolean zLmojexxdyd9 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                    if ((i15 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zLmojexxdyd9;
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15) {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(boolValueOf9, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg9 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue9);
                    if (model.getMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                    objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo9 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg9, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                    zynmafqrjb zynmafqrjbVarDxjokdxxww9 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                    androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt9 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg9 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo9);
                    z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar1115 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                    iobyxmoadgVarIobyxmoadg = iobyxmoadgVar1115.iobyxmoadg();
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
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww9, iobyxmoadgVar1115.ppxfxbqfkf());
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt9, iobyxmoadgVar1115.eablkybsjg());
                    rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar1115.zoijcleaow();
                    if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    } else {
                        draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                        draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                    }
                    m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg9, iobyxmoadgVar1115.wkgbmnqykc());
                    androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar9 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                    if (model.getIsLoading()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    if (model.getIsLoading()) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                    draadjrbmkVar2.cqumvgiudr();
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar8 = iobyxmoadgVar11;
                    iobyxmoadgVar12 = iobyxmoadgVar9;
                    tg.iobyxmoadg iobyxmoadgVar1116 = iobyxmoadgVar5;
                    iobyxmoadgVar13 = iobyxmoadgVar10;
                    iobyxmoadgVar14 = iobyxmoadgVar1116;
                }
                a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final tg.iobyxmoadg iobyxmoadgVar1117 = iobyxmoadgVar8;
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.agtfadlqog
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return ojitshcjhn.nufgyqmvbu(model, counterStyle, tints, iobyxmoadgVar14, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar1117, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 196608;
            iobyxmoadgVar7 = iobyxmoadgVar3;
            i23 = i14 & 64;
            if (i23 != 0) {
                i15 |= 1572864;
                iobyxmoadgVar8 = iobyxmoadgVar4;
            } else {
                iobyxmoadgVar8 = iobyxmoadgVar4;
                if ((i13 & 1572864) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar8)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
            }
            if ((i15 & 599187) == 599186) {
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.lqeggnwhkg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.dxjokdxxww();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar6;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar7;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar11 = iobyxmoadgVar8;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                float fFloatValue10 = ((Number) objYadqdtsiqt).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf10 = Boolean.valueOf(model.getAutoHideMessage());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                boolean zLmojexxdyd10 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                if ((i15 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zLmojexxdyd10;
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15) {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf10, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg10 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue10);
                if (model.getMessage() != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo10 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg10, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww10 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt10 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg10 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo10);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar1118 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar1118.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww10, iobyxmoadgVar1118.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt10, iobyxmoadgVar1118.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar1118.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg10, iobyxmoadgVar1118.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar10 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                if (model.getIsLoading()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar8 = iobyxmoadgVar11;
                iobyxmoadgVar12 = iobyxmoadgVar9;
                tg.iobyxmoadg iobyxmoadgVar1119 = iobyxmoadgVar5;
                iobyxmoadgVar13 = iobyxmoadgVar10;
                iobyxmoadgVar14 = iobyxmoadgVar1119;
            } else {
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.lqeggnwhkg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.dxjokdxxww();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar6;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar7;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar11 = iobyxmoadgVar8;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                float fFloatValue11 = ((Number) objYadqdtsiqt).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf11 = Boolean.valueOf(model.getAutoHideMessage());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                boolean zLmojexxdyd11 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                if ((i15 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zLmojexxdyd11;
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15) {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf11, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg11 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue11);
                if (model.getMessage() != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo11 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg11, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww11 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt11 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg11 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo11);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar11110 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar11110.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww11, iobyxmoadgVar11110.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt11, iobyxmoadgVar11110.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar11110.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg11, iobyxmoadgVar11110.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar11 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                if (model.getIsLoading()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar8 = iobyxmoadgVar11;
                iobyxmoadgVar12 = iobyxmoadgVar9;
                tg.iobyxmoadg iobyxmoadgVar11111 = iobyxmoadgVar5;
                iobyxmoadgVar13 = iobyxmoadgVar10;
                iobyxmoadgVar14 = iobyxmoadgVar11111;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final tg.iobyxmoadg iobyxmoadgVar11112 = iobyxmoadgVar8;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.agtfadlqog
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ojitshcjhn.nufgyqmvbu(model, counterStyle, tints, iobyxmoadgVar14, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar11112, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        iobyxmoadgVar6 = iobyxmoadgVar2;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                iobyxmoadgVar7 = iobyxmoadgVar3;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar7)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i15 |= i19;
            }
            i23 = i14 & 64;
            if (i23 != 0) {
                i15 |= 1572864;
                iobyxmoadgVar8 = iobyxmoadgVar4;
            } else {
                iobyxmoadgVar8 = iobyxmoadgVar4;
                if ((i13 & 1572864) == 0) {
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar8)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                }
            }
            if ((i15 & 599187) == 599186) {
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.lqeggnwhkg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.dxjokdxxww();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar6;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar7;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar11 = iobyxmoadgVar8;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                float fFloatValue12 = ((Number) objYadqdtsiqt).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf12 = Boolean.valueOf(model.getAutoHideMessage());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                boolean zLmojexxdyd12 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                if ((i15 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zLmojexxdyd12;
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15) {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf12, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg12 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue12);
                if (model.getMessage() != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo12 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg12, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww12 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt12 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg12 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo12);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar11113 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar11113.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww12, iobyxmoadgVar11113.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt12, iobyxmoadgVar11113.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar11113.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg12, iobyxmoadgVar11113.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar12 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                if (model.getIsLoading()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar8 = iobyxmoadgVar11;
                iobyxmoadgVar12 = iobyxmoadgVar9;
                tg.iobyxmoadg iobyxmoadgVar11114 = iobyxmoadgVar5;
                iobyxmoadgVar13 = iobyxmoadgVar10;
                iobyxmoadgVar14 = iobyxmoadgVar11114;
            } else {
                if (i25 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                    objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.lqeggnwhkg();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                    objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.dxjokdxxww();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                    }
                    iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar9 = iobyxmoadgVar6;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.btonecajqb();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar10 = iobyxmoadgVar7;
                }
                if (i23 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                    objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.gtknphoqwx();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar11 = iobyxmoadgVar8;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13) {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                        f13 = 0.5f;
                    } else {
                        f13 = 1.0f;
                    }
                    objYadqdtsiqt = Float.valueOf(f13);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                float fFloatValue13 = ((Number) objYadqdtsiqt).floatValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf13 = Boolean.valueOf(model.getAutoHideMessage());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
                boolean zLmojexxdyd13 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
                if ((i15 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zLmojexxdyd13;
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15) {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf13, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg13 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue13);
                if (model.getMessage() != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo13 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg13, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
                zynmafqrjb zynmafqrjbVarDxjokdxxww13 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt13 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg13 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo13);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar11115 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar11115.iobyxmoadg();
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
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww13, iobyxmoadgVar11115.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt13, iobyxmoadgVar11115.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar11115.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                } else {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg13, iobyxmoadgVar11115.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar13 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                if (model.getIsLoading()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                if (model.getIsLoading()) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
                draadjrbmkVar2.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar8 = iobyxmoadgVar11;
                iobyxmoadgVar12 = iobyxmoadgVar9;
                tg.iobyxmoadg iobyxmoadgVar11116 = iobyxmoadgVar5;
                iobyxmoadgVar13 = iobyxmoadgVar10;
                iobyxmoadgVar14 = iobyxmoadgVar11116;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final tg.iobyxmoadg iobyxmoadgVar11117 = iobyxmoadgVar8;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.agtfadlqog
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ojitshcjhn.nufgyqmvbu(model, counterStyle, tints, iobyxmoadgVar14, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar11117, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 196608;
        iobyxmoadgVar7 = iobyxmoadgVar3;
        i23 = i14 & 64;
        if (i23 != 0) {
            i15 |= 1572864;
            iobyxmoadgVar8 = iobyxmoadgVar4;
        } else {
            iobyxmoadgVar8 = iobyxmoadgVar4;
            if ((i13 & 1572864) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar8)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            }
        }
        if ((i15 & 599187) == 599186) {
            if (i25 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.lqeggnwhkg();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.dxjokdxxww();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                }
                iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar9 = iobyxmoadgVar6;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.btonecajqb();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar10 = iobyxmoadgVar7;
            }
            if (i23 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.gtknphoqwx();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar11 = iobyxmoadgVar8;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                objYadqdtsiqt = Float.valueOf(f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                objYadqdtsiqt = Float.valueOf(f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            float fFloatValue14 = ((Number) objYadqdtsiqt).floatValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            Boolean boolValueOf14 = Boolean.valueOf(model.getAutoHideMessage());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
            boolean zLmojexxdyd14 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
            if ((i15 & 3670016) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | zLmojexxdyd14;
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15) {
                objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf14, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg14 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue14);
            if (model.getMessage() != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo14 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg14, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
            zynmafqrjb zynmafqrjbVarDxjokdxxww14 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt14 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg14 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo14);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar11118 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar11118.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww14, iobyxmoadgVar11118.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt14, iobyxmoadgVar11118.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar11118.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg14, iobyxmoadgVar11118.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar14 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            if (model.getIsLoading()) {
                z17 = false;
            } else {
                z17 = false;
            }
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
            if (model.getIsLoading()) {
                z18 = false;
            } else {
                z18 = false;
            }
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
            if (model.getIsLoading()) {
                z19 = true;
            } else {
                z19 = true;
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar8 = iobyxmoadgVar11;
            iobyxmoadgVar12 = iobyxmoadgVar9;
            tg.iobyxmoadg iobyxmoadgVar11119 = iobyxmoadgVar5;
            iobyxmoadgVar13 = iobyxmoadgVar10;
            iobyxmoadgVar14 = iobyxmoadgVar11119;
        } else {
            if (i25 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354856317);
                objYadqdtsiqt7 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt7 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt7 = new tg.iobyxmoadg() { // from class: fs0.btonecajqb
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.lqeggnwhkg();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt7);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar5 = (tg.iobyxmoadg) objYadqdtsiqt7;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354855101);
                objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt6 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt6 = new tg.iobyxmoadg() { // from class: fs0.gtknphoqwx
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.dxjokdxxww();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                }
                iobyxmoadgVar9 = (tg.iobyxmoadg) objYadqdtsiqt6;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar9 = iobyxmoadgVar6;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354853885);
                objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: fs0.draadjrbmk
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.btonecajqb();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                iobyxmoadgVar10 = (tg.iobyxmoadg) objYadqdtsiqt5;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar10 = iobyxmoadgVar7;
            }
            if (i23 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-354852797);
                objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: fs0.wflxmlrfwp
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.gtknphoqwx();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                iobyxmoadgVar11 = (tg.iobyxmoadg) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar11 = iobyxmoadgVar8;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-117356104, i15, -1, "ru.myspar.proloyalty.common.view.counter.compose.components.LiveCounterContent (LiveCounterContent.kt:44)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-354851544);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                objYadqdtsiqt = Float.valueOf(f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                if (eablkybsjg.f34944iobyxmoadg[counterStyle.ordinal()] == 1) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                objYadqdtsiqt = Float.valueOf(f13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            float fFloatValue15 = ((Number) objYadqdtsiqt).floatValue();
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            Boolean boolValueOf15 = Boolean.valueOf(model.getAutoHideMessage());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-354844813);
            boolean zLmojexxdyd15 = draadjrbmkVarBtonecajqb.lmojexxdyd(model);
            if ((i15 & 3670016) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | zLmojexxdyd15;
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15) {
                objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(model, iobyxmoadgVar11, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf15, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg15 = cdpycssgdh.lqeggnwhkg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, fFloatValue15);
            if (model.getMessage() != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-354831672);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo15 = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarLqeggnwhkg15, (metgxyhuhe.draadjrbmk) objYadqdtsiqt3, null, z16, null, null, iobyxmoadgVar5, 24, null);
            zynmafqrjb zynmafqrjbVarDxjokdxxww15 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt15 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg15 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo15);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar111110 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar111110.iobyxmoadg();
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
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww15, iobyxmoadgVar111110.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt15, iobyxmoadgVar111110.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar111110.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg15, iobyxmoadgVar111110.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar15 = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            if (model.getIsLoading()) {
                z17 = false;
            } else {
                z17 = false;
            }
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z17, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(2062666906, true, new zoijcleaow(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
            if (model.getIsLoading()) {
                z18 = false;
            } else {
                z18 = false;
            }
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z18, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1253802115, true, new ppxfxbqfkf(model, tints), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
            if (model.getIsLoading()) {
                z19 = true;
            } else {
                z19 = true;
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(z19, null, androidx.compose.animation.zoijcleaow.ojitshcjhn(null, 0.0f, 3, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(null, 0.0f, 3, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-125983198, true, new wkgbmnqykc(model, tints, iobyxmoadgVar9, iobyxmoadgVar10), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 200064, 18);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar8 = iobyxmoadgVar11;
            iobyxmoadgVar12 = iobyxmoadgVar9;
            tg.iobyxmoadg iobyxmoadgVar111111 = iobyxmoadgVar5;
            iobyxmoadgVar13 = iobyxmoadgVar10;
            iobyxmoadgVar14 = iobyxmoadgVar111111;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final tg.iobyxmoadg iobyxmoadgVar111112 = iobyxmoadgVar8;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: fs0.agtfadlqog
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ojitshcjhn.nufgyqmvbu(model, counterStyle, tints, iobyxmoadgVar14, iobyxmoadgVar12, iobyxmoadgVar13, iobyxmoadgVar111112, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(CounterModel counterModel, js0.zoijcleaow zoijcleaowVar, ColorsUiModel.Hex.Tints tints, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.iobyxmoadg iobyxmoadgVar4, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        gxszxtbevo(counterModel, zoijcleaowVar, tints, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
