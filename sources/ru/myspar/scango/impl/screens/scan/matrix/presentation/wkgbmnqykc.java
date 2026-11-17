package ru.myspar.scango.impl.screens.scan.matrix.presentation;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import l32.vdvldrhtss;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends vx.eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final m32.iobyxmoadg f103540btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final at.iobyxmoadg f103541draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final j32.iobyxmoadg f103542dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final k32.iobyxmoadg f103543gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final i22.iobyxmoadg f103544lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final i22.zoijcleaow f103545nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ScanGoScanMatrixPayload f103546wflxmlrfwp;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f103547iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f103549yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f103550zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f103547iwizpuwonk = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new eablkybsjg(this.f103547iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            String str;
            Throwable th2;
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103549yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                String strIobyxmoadg = wkgbmnqykc.this.f103540btonecajqb.iobyxmoadg(this.f103547iwizpuwonk);
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    k32.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykcVar.f103543gtknphoqwx;
                    k32.iobyxmoadg.C1147iobyxmoadg c1147iobyxmoadg = new k32.iobyxmoadg.C1147iobyxmoadg(wkgbmnqykcVar.f103546wflxmlrfwp.getBarcode(), strIobyxmoadg);
                    this.f103550zdlpuopuiu = strIobyxmoadg;
                    this.f103549yggfygwlhe = 1;
                    Object objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c1147iobyxmoadg, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    str = strIobyxmoadg;
                    obj = objZoijcleaow;
                } catch (Throwable th3) {
                    str = strIobyxmoadg;
                    th2 = th3;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f103550zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) obj).booleanValue()));
            wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                wkgbmnqykcVar2.oipsdeybqn(str, ((Boolean) objWkgbmnqykc).booleanValue());
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                wkgbmnqykcVar2.zdlpuopuiu(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f103551iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f103552ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f103553zoijcleaow;

        static {
            int[] iArr = new int[f22.iobyxmoadg.values().length];
            try {
                iArr[f22.iobyxmoadg.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f22.iobyxmoadg.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103551iobyxmoadg = iArr;
            int[] iArr2 = new int[f22.zoijcleaow.values().length];
            try {
                iArr2[f22.zoijcleaow.MARK_IS_INCORRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f22.zoijcleaow.MARK_IS_DUPLICATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f22.zoijcleaow.PRODUCT_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f22.zoijcleaow.PRODUCT_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f103553zoijcleaow = iArr2;
            int[] iArr3 = new int[f22.ppxfxbqfkf.values().length];
            try {
                iArr3[f22.ppxfxbqfkf.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[f22.ppxfxbqfkf.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f103552ppxfxbqfkf = iArr3;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ double f103554cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f103555iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f103556jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103558zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, List list, double d13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f103556jyumaefscl = str;
            this.f103555iwizpuwonk = list;
            this.f103554cqumvgiudr = d13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new ppxfxbqfkf(this.f103556jyumaefscl, this.f103555iwizpuwonk, this.f103554cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103558zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    wkgbmnqykc.this.lrnfpwlwnk();
                    wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                    String str = this.f103556jyumaefscl;
                    List list = this.f103555iwizpuwonk;
                    double d13 = this.f103554cqumvgiudr;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    i22.zoijcleaow zoijcleaowVar = wkgbmnqykcVar.f103545nufgyqmvbu;
                    i22.zoijcleaow.C0983zoijcleaow c0983zoijcleaow = new i22.zoijcleaow.C0983zoijcleaow(str, list, d13);
                    this.f103558zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(c0983zoijcleaow, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((g22.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
            String str2 = this.f103556jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                wkgbmnqykcVar2.dxjokdxxww(str2, (g22.iobyxmoadg) objWkgbmnqykc, true);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                wkgbmnqykcVar2.sflfametgt(thDxjokdxxww);
            }
            wkgbmnqykc.this.sopmlzcsov();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C2509wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103560zdlpuopuiu;

        C2509wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new C2509wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103560zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                at.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.this.f103541draadjrbmk;
                String name = wkgbmnqykc.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                this.f103560zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(name, "android.permission.CAMERA", this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            at.ppxfxbqfkf ppxfxbqfkfVar = (at.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar instanceof at.ppxfxbqfkf.zoijcleaow) {
                wkgbmnqykc.this.yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.btonecajqb.f103529iobyxmoadg);
            } else {
                if (!(ppxfxbqfkfVar instanceof at.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                wkgbmnqykc.this.yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.wkgbmnqykc.f103538iobyxmoadg);
                wkgbmnqykc.this.jlmebxxoox();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C2509wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ List f103561cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f103562iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f103563jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103565zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, boolean z13, List list, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f103563jyumaefscl = str;
            this.f103562iwizpuwonk = z13;
            this.f103561cqumvgiudr = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new zoijcleaow(this.f103563jyumaefscl, this.f103562iwizpuwonk, this.f103561cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103565zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    wkgbmnqykc.this.lrnfpwlwnk();
                    wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                    String str = this.f103563jyumaefscl;
                    boolean z13 = this.f103562iwizpuwonk;
                    List list = this.f103561cqumvgiudr;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    i22.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykcVar.f103544lqeggnwhkg;
                    i22.iobyxmoadg.C0982iobyxmoadg c0982iobyxmoadg = new i22.iobyxmoadg.C0982iobyxmoadg(str, z13, list);
                    this.f103565zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.zoijcleaow(c0982iobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((g22.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
            String str2 = this.f103563jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                wkgbmnqykc.ydmasvzmpa(wkgbmnqykcVar2, str2, (g22.iobyxmoadg) objWkgbmnqykc, false, 4, null);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                wkgbmnqykcVar2.sflfametgt(thDxjokdxxww);
            }
            wkgbmnqykc.this.sopmlzcsov();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(i22.iobyxmoadg addToCartByBarcodeUseCase, i22.zoijcleaow changeProductQuantityUseCase, j32.iobyxmoadg scanGoMatrixController, m32.iobyxmoadg matrixCodeFormatter, k32.iobyxmoadg isContainsMarkCodeScanGoUseCase, at.iobyxmoadg permissionManager, ScanGoScanMatrixPayload payload) {
        super(new vdvldrhtss(null, false, false, false, 15, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addToCartByBarcodeUseCase, "addToCartByBarcodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductQuantityUseCase, "changeProductQuantityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoMatrixController, "scanGoMatrixController");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(matrixCodeFormatter, "matrixCodeFormatter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isContainsMarkCodeScanGoUseCase, "isContainsMarkCodeScanGoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        this.f103544lqeggnwhkg = addToCartByBarcodeUseCase;
        this.f103545nufgyqmvbu = changeProductQuantityUseCase;
        this.f103542dxjokdxxww = scanGoMatrixController;
        this.f103540btonecajqb = matrixCodeFormatter;
        this.f103543gtknphoqwx = isContainsMarkCodeScanGoUseCase;
        this.f103541draadjrbmk = permissionManager;
        this.f103546wflxmlrfwp = payload;
        opjhrmiecq();
    }

    private final void bfopjjpdmp() {
        int i13 = iobyxmoadg.f103551iobyxmoadg[this.f103546wflxmlrfwp.getScanGoAmountMode().ordinal()];
        if (i13 == 1) {
            czzsidtyhn(this, this.f103546wflxmlrfwp.getBarcode(), this.f103546wflxmlrfwp.getQuantity(), null, true, 4, null);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jlmebxxoox();
        }
    }

    private final boolean crxdokpmqz(boolean z13) {
        return this.f103546wflxmlrfwp.getScanGoAmountMode() == f22.iobyxmoadg.DECREASE && this.f103546wflxmlrfwp.getScanGoProductType() == f22.ppxfxbqfkf.AMOUNT && !z13;
    }

    static /* synthetic */ void czzsidtyhn(wkgbmnqykc wkgbmnqykcVar, String str, double d13, String str2, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        wkgbmnqykcVar.rlfsiqarku(str, d13, str3, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dxjokdxxww(String str, g22.iobyxmoadg iobyxmoadgVar, boolean z13) {
        this.f103542dxjokdxxww.iobyxmoadg(str, iobyxmoadgVar, z13);
        if (ntlheqmsrt(iobyxmoadgVar)) {
            jlmebxxoox();
        }
    }

    private final void ikoacuggdj() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.C2508ppxfxbqfkf.f103537iobyxmoadg);
        jlmebxxoox();
    }

    private final void iyctptxqzt() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.iobyxmoadg.f103534iobyxmoadg);
    }

    private final void jhduphickx() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.zoijcleaow.f103539iobyxmoadg);
        jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jlmebxxoox() {
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    private final void jztzpxfvev(boolean z13) {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, vdvldrhtss.zoijcleaow((vdvldrhtss) value, null, false, z13, false, 11, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lrnfpwlwnk() {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, vdvldrhtss.zoijcleaow((vdvldrhtss) value, null, false, false, true, 7, null)));
    }

    private final void metgxyhuhe() {
        iyctptxqzt();
    }

    private final boolean ntlheqmsrt(g22.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.eablkybsjg()) {
            if (iobyxmoadgVar.wkgbmnqykc().isEmpty()) {
                ScanGoCartModel scanGoCartModelIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                return (scanGoCartModelIobyxmoadg != null ? scanGoCartModelIobyxmoadg.getActionedProduct() : null) != null;
            }
            ulzqkzuiru((g22.wkgbmnqykc) iobyxmoadgVar.wkgbmnqykc().get(0));
            return false;
        }
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (strPpxfxbqfkf == null) {
            return false;
        }
        zeieaojujs(strPpxfxbqfkf);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oipsdeybqn(String str, boolean z13) {
        if (!crxdokpmqz(z13)) {
            czzsidtyhn(this, this.f103546wflxmlrfwp.getBarcode(), this.f103546wflxmlrfwp.getQuantity(), str, false, 8, null);
        } else {
            yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.gxszxtbevo.f103533iobyxmoadg);
            iyctptxqzt();
        }
    }

    private final void opjhrmiecq() {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new C2509wkgbmnqykc(null), 3, null);
    }

    private final void ribwqtqdhb() {
        int i13 = iobyxmoadg.f103552ppxfxbqfkf[this.f103546wflxmlrfwp.getScanGoProductType().ordinal()];
        if (i13 == 1) {
            jlmebxxoox();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bfopjjpdmp();
        }
    }

    private final void rlfsiqarku(String str, double d13, String str2, boolean z13) {
        List listEablkybsjg = str2.length() > 0 ? jyumaefscl.eablkybsjg(str2) : jyumaefscl.wflxmlrfwp();
        int i13 = iobyxmoadg.f103551iobyxmoadg[this.f103546wflxmlrfwp.getScanGoAmountMode().ordinal()];
        if (i13 == 1) {
            yfnezrywwk(str, listEablkybsjg, z13);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zfvoamnweg(str, d13, listEablkybsjg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sflfametgt(Throwable th2) {
        zdlpuopuiu(th2);
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.eablkybsjg.f103531iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sopmlzcsov() {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, vdvldrhtss.zoijcleaow((vdvldrhtss) value, null, false, false, false, 7, null)));
    }

    private final void ulzqkzuiru(g22.wkgbmnqykc wkgbmnqykcVar) {
        int i13 = iobyxmoadg.f103553zoijcleaow[wkgbmnqykcVar.iobyxmoadg().ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            yggfygwlhe(new ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.lqeggnwhkg(wkgbmnqykcVar.zoijcleaow()));
            iyctptxqzt();
        } else if (i13 != 4) {
            zeieaojujs(wkgbmnqykcVar.zoijcleaow());
            iyctptxqzt();
        } else {
            yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.dxjokdxxww.f103530iobyxmoadg);
            iyctptxqzt();
        }
    }

    private final void uwvvkdfqfp() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.gtknphoqwx.f103532iobyxmoadg);
    }

    private final void vipkmwdibw(boolean z13) {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, vdvldrhtss.zoijcleaow((vdvldrhtss) value, null, z13, false, false, 13, null)));
    }

    private final void weqkydbzbr(String str) {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new eablkybsjg(str, null), 3, null);
    }

    private final void xrmfcynszj(String str) {
        weqkydbzbr(str);
    }

    static /* synthetic */ void ydmasvzmpa(wkgbmnqykc wkgbmnqykcVar, String str, g22.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        wkgbmnqykcVar.dxjokdxxww(str, iobyxmoadgVar, z13);
    }

    private final void yfnezrywwk(String str, List list, boolean z13) {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new zoijcleaow(str, z13, list, null), 3, null);
    }

    private final void zeieaojujs(String str) {
        yggfygwlhe(new ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.nufgyqmvbu(str));
    }

    private final void zfvoamnweg(String str, double d13, List list) {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(str, list, d13, null), 3, null);
    }

    public final void okpsazkaxt(ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.wkgbmnqykc) {
            ikoacuggdj();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.ppxfxbqfkf) {
            jhduphickx();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.iobyxmoadg) {
            ribwqtqdhb();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.nufgyqmvbu) {
            uwvvkdfqfp();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.gxszxtbevo) {
            xrmfcynszj(((ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.gxszxtbevo) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.C2510zoijcleaow) {
            vipkmwdibw(((ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.C2510zoijcleaow) event).iobyxmoadg());
        } else if (event instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.eablkybsjg) {
            jztzpxfvev(((ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.eablkybsjg) event).iobyxmoadg());
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.lqeggnwhkg.f103569iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            metgxyhuhe();
        }
    }
}
