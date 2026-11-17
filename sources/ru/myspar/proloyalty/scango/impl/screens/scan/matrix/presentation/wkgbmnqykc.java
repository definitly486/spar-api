package ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import hp1.vdvldrhtss;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends sw0.eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ip1.iobyxmoadg f100883btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ur0.iobyxmoadg f100884draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final fp1.iobyxmoadg f100885dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final gp1.iobyxmoadg f100886gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final eo1.iobyxmoadg f100887lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final eo1.zoijcleaow f100888nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ScanGoScanMatrixPayload f100889wflxmlrfwp;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f100890iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f100892yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f100893zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f100890iwizpuwonk = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new eablkybsjg(this.f100890iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            String str;
            Throwable th2;
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100892yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                String strIobyxmoadg = wkgbmnqykc.this.f100883btonecajqb.iobyxmoadg(this.f100890iwizpuwonk);
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    gp1.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykcVar.f100886gtknphoqwx;
                    gp1.iobyxmoadg.C0869iobyxmoadg c0869iobyxmoadg = new gp1.iobyxmoadg.C0869iobyxmoadg(wkgbmnqykcVar.f100889wflxmlrfwp.getBarcode(), strIobyxmoadg);
                    this.f100893zdlpuopuiu = strIobyxmoadg;
                    this.f100892yggfygwlhe = 1;
                    Object objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c0869iobyxmoadg, this);
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
                str = (String) this.f100893zdlpuopuiu;
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
        public static final /* synthetic */ int[] f100894iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f100895ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f100896zoijcleaow;

        static {
            int[] iArr = new int[bo1.iobyxmoadg.values().length];
            try {
                iArr[bo1.iobyxmoadg.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bo1.iobyxmoadg.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100894iobyxmoadg = iArr;
            int[] iArr2 = new int[bo1.zoijcleaow.values().length];
            try {
                iArr2[bo1.zoijcleaow.MARK_IS_INCORRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[bo1.zoijcleaow.MARK_IS_DUPLICATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[bo1.zoijcleaow.PRODUCT_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[bo1.zoijcleaow.PRODUCT_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f100896zoijcleaow = iArr2;
            int[] iArr3 = new int[bo1.ppxfxbqfkf.values().length];
            try {
                iArr3[bo1.ppxfxbqfkf.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[bo1.ppxfxbqfkf.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f100895ppxfxbqfkf = iArr3;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ double f100897cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f100898iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f100899jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100901zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, List list, double d13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f100899jyumaefscl = str;
            this.f100898iwizpuwonk = list;
            this.f100897cqumvgiudr = d13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new ppxfxbqfkf(this.f100899jyumaefscl, this.f100898iwizpuwonk, this.f100897cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100901zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    wkgbmnqykc.this.lrnfpwlwnk();
                    wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                    String str = this.f100899jyumaefscl;
                    List list = this.f100898iwizpuwonk;
                    double d13 = this.f100897cqumvgiudr;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    eo1.zoijcleaow zoijcleaowVar = wkgbmnqykcVar.f100888nufgyqmvbu;
                    eo1.zoijcleaow.C0679zoijcleaow c0679zoijcleaow = new eo1.zoijcleaow.C0679zoijcleaow(str, list, d13);
                    this.f100901zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(c0679zoijcleaow, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((co1.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
            String str2 = this.f100899jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                wkgbmnqykcVar2.nufgyqmvbu(str2, (co1.iobyxmoadg) objWkgbmnqykc, true);
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

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C2430wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100903zdlpuopuiu;

        C2430wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new C2430wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100903zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ur0.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.this.f100884draadjrbmk;
                String name = wkgbmnqykc.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                this.f100903zdlpuopuiu = 1;
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
            ur0.ppxfxbqfkf ppxfxbqfkfVar = (ur0.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.zoijcleaow) {
                wkgbmnqykc.this.yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.btonecajqb.f100872iobyxmoadg);
            } else {
                if (!(ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                wkgbmnqykc.this.yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.wkgbmnqykc.f100881iobyxmoadg);
                wkgbmnqykc.this.jlmebxxoox();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C2430wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ List f100904cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f100905iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f100906jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100908zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, boolean z13, List list, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f100906jyumaefscl = str;
            this.f100905iwizpuwonk = z13;
            this.f100904cqumvgiudr = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new zoijcleaow(this.f100906jyumaefscl, this.f100905iwizpuwonk, this.f100904cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100908zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    wkgbmnqykc.this.lrnfpwlwnk();
                    wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                    String str = this.f100906jyumaefscl;
                    boolean z13 = this.f100905iwizpuwonk;
                    List list = this.f100904cqumvgiudr;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    eo1.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykcVar.f100887lqeggnwhkg;
                    eo1.iobyxmoadg.C0678iobyxmoadg c0678iobyxmoadg = new eo1.iobyxmoadg.C0678iobyxmoadg(str, z13, list);
                    this.f100908zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.zoijcleaow(c0678iobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((co1.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
            String str2 = this.f100906jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                wkgbmnqykc.ydmasvzmpa(wkgbmnqykcVar2, str2, (co1.iobyxmoadg) objWkgbmnqykc, false, 4, null);
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
    public wkgbmnqykc(eo1.iobyxmoadg addToCartByBarcodeUseCase, eo1.zoijcleaow changeProductQuantityUseCase, fp1.iobyxmoadg scanGoMatrixController, ip1.iobyxmoadg matrixCodeFormatter, gp1.iobyxmoadg isContainsMarkCodeScanGoUseCase, ur0.iobyxmoadg permissionManager, ScanGoScanMatrixPayload payload) {
        super(new vdvldrhtss(null, false, false, false, 15, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addToCartByBarcodeUseCase, "addToCartByBarcodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductQuantityUseCase, "changeProductQuantityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoMatrixController, "scanGoMatrixController");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(matrixCodeFormatter, "matrixCodeFormatter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isContainsMarkCodeScanGoUseCase, "isContainsMarkCodeScanGoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        this.f100887lqeggnwhkg = addToCartByBarcodeUseCase;
        this.f100888nufgyqmvbu = changeProductQuantityUseCase;
        this.f100885dxjokdxxww = scanGoMatrixController;
        this.f100883btonecajqb = matrixCodeFormatter;
        this.f100886gtknphoqwx = isContainsMarkCodeScanGoUseCase;
        this.f100884draadjrbmk = permissionManager;
        this.f100889wflxmlrfwp = payload;
        opjhrmiecq();
    }

    private final void bfopjjpdmp() {
        int i13 = iobyxmoadg.f100894iobyxmoadg[this.f100889wflxmlrfwp.getScanGoAmountMode().ordinal()];
        if (i13 == 1) {
            czzsidtyhn(this, this.f100889wflxmlrfwp.getBarcode(), this.f100889wflxmlrfwp.getQuantity(), null, true, 4, null);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jlmebxxoox();
        }
    }

    private final boolean crxdokpmqz(boolean z13) {
        return this.f100889wflxmlrfwp.getScanGoAmountMode() == bo1.iobyxmoadg.DECREASE && this.f100889wflxmlrfwp.getScanGoProductType() == bo1.ppxfxbqfkf.AMOUNT && !z13;
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

    private final void ikoacuggdj() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.C2429ppxfxbqfkf.f100880iobyxmoadg);
        jlmebxxoox();
    }

    private final void iyctptxqzt() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.iobyxmoadg.f100877iobyxmoadg);
    }

    private final void jhduphickx() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.zoijcleaow.f100882iobyxmoadg);
        jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jlmebxxoox() {
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
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

    private final boolean ntlheqmsrt(co1.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.eablkybsjg()) {
            if (iobyxmoadgVar.wkgbmnqykc().isEmpty()) {
                ScanGoCartModel scanGoCartModelIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                return (scanGoCartModelIobyxmoadg != null ? scanGoCartModelIobyxmoadg.getActionedProduct() : null) != null;
            }
            ulzqkzuiru((co1.wkgbmnqykc) iobyxmoadgVar.wkgbmnqykc().get(0));
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
    public final void nufgyqmvbu(String str, co1.iobyxmoadg iobyxmoadgVar, boolean z13) {
        this.f100885dxjokdxxww.iobyxmoadg(str, iobyxmoadgVar, z13);
        if (ntlheqmsrt(iobyxmoadgVar)) {
            jlmebxxoox();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oipsdeybqn(String str, boolean z13) {
        if (!crxdokpmqz(z13)) {
            czzsidtyhn(this, this.f100889wflxmlrfwp.getBarcode(), this.f100889wflxmlrfwp.getQuantity(), str, false, 8, null);
        } else {
            yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.gxszxtbevo.f100876iobyxmoadg);
            iyctptxqzt();
        }
    }

    private final void opjhrmiecq() {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new C2430wkgbmnqykc(null), 3, null);
    }

    private final void ribwqtqdhb() {
        int i13 = iobyxmoadg.f100895ppxfxbqfkf[this.f100889wflxmlrfwp.getScanGoProductType().ordinal()];
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
        int i13 = iobyxmoadg.f100894iobyxmoadg[this.f100889wflxmlrfwp.getScanGoAmountMode().ordinal()];
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
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.eablkybsjg.f100874iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sopmlzcsov() {
        Object value;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, vdvldrhtss.zoijcleaow((vdvldrhtss) value, null, false, false, false, 7, null)));
    }

    private final void ulzqkzuiru(co1.wkgbmnqykc wkgbmnqykcVar) {
        int i13 = iobyxmoadg.f100896zoijcleaow[wkgbmnqykcVar.iobyxmoadg().ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            yggfygwlhe(new ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.lqeggnwhkg(wkgbmnqykcVar.zoijcleaow()));
            iyctptxqzt();
        } else if (i13 != 4) {
            zeieaojujs(wkgbmnqykcVar.zoijcleaow());
            iyctptxqzt();
        } else {
            yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.dxjokdxxww.f100873iobyxmoadg);
            iyctptxqzt();
        }
    }

    private final void uwvvkdfqfp() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.gtknphoqwx.f100875iobyxmoadg);
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

    static /* synthetic */ void ydmasvzmpa(wkgbmnqykc wkgbmnqykcVar, String str, co1.iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        wkgbmnqykcVar.nufgyqmvbu(str, iobyxmoadgVar, z13);
    }

    private final void yfnezrywwk(String str, List list, boolean z13) {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new zoijcleaow(str, z13, list, null), 3, null);
    }

    private final void zeieaojujs(String str) {
        yggfygwlhe(new ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.nufgyqmvbu(str));
    }

    private final void zfvoamnweg(String str, double d13, List list) {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(str, list, d13, null), 3, null);
    }

    public final void okpsazkaxt(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.wkgbmnqykc) {
            ikoacuggdj();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.ppxfxbqfkf) {
            jhduphickx();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.iobyxmoadg) {
            ribwqtqdhb();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.nufgyqmvbu) {
            uwvvkdfqfp();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.gxszxtbevo) {
            xrmfcynszj(((ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.gxszxtbevo) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.C2431zoijcleaow) {
            vipkmwdibw(((ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.C2431zoijcleaow) event).iobyxmoadg());
        } else if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.eablkybsjg) {
            jztzpxfvev(((ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.eablkybsjg) event).iobyxmoadg());
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.lqeggnwhkg.f100912iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            metgxyhuhe();
        }
    }
}
