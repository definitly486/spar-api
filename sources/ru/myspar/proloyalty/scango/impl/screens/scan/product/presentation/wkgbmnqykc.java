package ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import eo1.nufgyqmvbu;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import jp1.cqumvgiudr;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanProductPayload;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.zynmafqrjb;
import sw0.eablkybsjg;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends eablkybsjg implements fp1.iobyxmoadg.InterfaceC0763iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ur0.iobyxmoadg f100980btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final fp1.iobyxmoadg f100981dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ScanGoScanProductPayload f100982gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final eo1.iobyxmoadg f100983lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final nufgyqmvbu f100984nufgyqmvbu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f100985iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f100986ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f100987zoijcleaow;

        static {
            int[] iArr = new int[bo1.ppxfxbqfkf.values().length];
            try {
                iArr[bo1.ppxfxbqfkf.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bo1.ppxfxbqfkf.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100985iobyxmoadg = iArr;
            int[] iArr2 = new int[bo1.zoijcleaow.values().length];
            try {
                iArr2[bo1.zoijcleaow.MARK_PIECE_IS_EMPTY_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[bo1.zoijcleaow.MARK_WEIGHT_IS_EMPTY_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[bo1.zoijcleaow.MARK_IS_INCORRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[bo1.zoijcleaow.MARK_IS_DUPLICATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[bo1.zoijcleaow.PRODUCT_UNAVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[bo1.zoijcleaow.PRODUCT_NOT_FOUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f100987zoijcleaow = iArr2;
            int[] iArr3 = new int[c21.iobyxmoadg.values().length];
            try {
                iArr3[c21.iobyxmoadg.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[c21.iobyxmoadg.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f100986ppxfxbqfkf = iArr3;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100989zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object value;
            cqumvgiudr cqumvgiudrVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100989zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVarZoijcleaow = wkgbmnqykc.this.f100984nufgyqmvbu.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
                this.f100989zdlpuopuiu = 1;
                obj = dxjokdxxww.istkbnxepw(lqeggnwhkgVarZoijcleaow, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
            ScanGoCartModel scanGoCartModel = (ScanGoCartModel) obj;
            if (scanGoCartModel != null) {
                co1.zoijcleaow zoijcleaowVar = scanGoCartModel.getProducts().isEmpty() ? co1.zoijcleaow.EMPTY : co1.zoijcleaow.CONTINUE;
                zynmafqrjb zynmafqrjbVarOjitshcjhn = wkgbmnqykcVar.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                    cqumvgiudrVar = (cqumvgiudr) value;
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : zoijcleaowVar, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C2433wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100991zdlpuopuiu;

        C2433wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new C2433wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100991zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ur0.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.this.f100980btonecajqb;
                String name = wkgbmnqykc.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                this.f100991zdlpuopuiu = 1;
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
            if (ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.iobyxmoadg) {
                wkgbmnqykc.this.yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.agtfadlqog.f100963iobyxmoadg);
            } else {
                if (!(ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                wkgbmnqykc.this.yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.lqeggnwhkg.f100971iobyxmoadg);
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C2433wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f100992iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f100993jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100995zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f100993jyumaefscl = str;
            this.f100992iwizpuwonk = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new zoijcleaow(this.f100993jyumaefscl, this.f100992iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100995zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    wkgbmnqykc.this.zfvoamnweg();
                    wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                    String str = this.f100993jyumaefscl;
                    boolean z13 = this.f100992iwizpuwonk;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    eo1.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykcVar.f100983lqeggnwhkg;
                    eo1.iobyxmoadg.C0678iobyxmoadg c0678iobyxmoadg = new eo1.iobyxmoadg.C0678iobyxmoadg(str, z13, null, 4, null);
                    this.f100995zdlpuopuiu = 1;
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
            String str2 = this.f100993jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                fp1.iobyxmoadg.InterfaceC0763iobyxmoadg.btonecajqb(wkgbmnqykcVar2, str2, (co1.iobyxmoadg) objWkgbmnqykc, false, 4, null);
            }
            if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                wkgbmnqykcVar2.uwvvkdfqfp();
            }
            wkgbmnqykc.this.kegysxyocb();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(eo1.iobyxmoadg addToCartByBarcodeUseCase, nufgyqmvbu subscribeToCartUpdatesUseCase, fp1.iobyxmoadg scanGoMatrixController, ur0.iobyxmoadg permissionManager, ScanGoScanProductPayload payload) {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        super(new cqumvgiudr(null, false, false, false, 0, false, null, false, KotlinVersion.MAX_COMPONENT_VALUE, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addToCartByBarcodeUseCase, "addToCartByBarcodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartUpdatesUseCase, "subscribeToCartUpdatesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoMatrixController, "scanGoMatrixController");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        this.f100983lqeggnwhkg = addToCartByBarcodeUseCase;
        this.f100984nufgyqmvbu = subscribeToCartUpdatesUseCase;
        this.f100981dxjokdxxww = scanGoMatrixController;
        this.f100980btonecajqb = permissionManager;
        this.f100982gtknphoqwx = payload;
        scanGoMatrixController.zoijcleaow(this);
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : this.f100982gtknphoqwx.getState(), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
        ydmasvzmpa();
    }

    static /* synthetic */ void cllcsxoeiz(wkgbmnqykc wkgbmnqykcVar, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        wkgbmnqykcVar.jpowsppfya(str, z13);
    }

    private final void crxdokpmqz() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gxszxtbevo.f100969iobyxmoadg);
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
    }

    private final void czzsidtyhn(ScanGoProductModel scanGoProductModel) {
        int i13 = iobyxmoadg.f100986ppxfxbqfkf[scanGoProductModel.getMeasure().ordinal()];
        if (i13 == 1) {
            oipsdeybqn(scanGoProductModel.getId(), co1.zoijcleaow.AMOUNT);
            yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.iobyxmoadg.f100970iobyxmoadg);
        } else if (i13 != 2) {
            yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.btonecajqb.f100964iobyxmoadg);
        } else {
            oipsdeybqn(scanGoProductModel.getId(), co1.zoijcleaow.WEIGHT);
            yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.iobyxmoadg.f100970iobyxmoadg);
        }
    }

    private final void ikoacuggdj() {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        if (((cqumvgiudr) ojitshcjhn().getValue()).dxjokdxxww()) {
            zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
                cqumvgiudrVar = (cqumvgiudr) value;
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
            sflfametgt();
        }
    }

    private final void jhduphickx(boolean z13) {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : z13, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
    }

    private final void jlmebxxoox() {
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
    }

    private final void jpowsppfya(String str, boolean z13) {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new zoijcleaow(str, z13, null), 3, null);
    }

    private final void jztzpxfvev() {
        sflfametgt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kegysxyocb() {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
    }

    private final void mbcevpiqjq(String str) {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, ((cqumvgiudr) ojitshcjhn().getValue()).ppxfxbqfkf())) {
            return;
        }
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : str, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : str.length() > 0, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
    }

    private final void metgxyhuhe() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.ojitshcjhn.f100973iobyxmoadg);
    }

    private final void ntlheqmsrt(String str) {
        cllcsxoeiz(this, str, false, 2, null);
    }

    private final void oipsdeybqn(int i13, co1.zoijcleaow zoijcleaowVar) {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : i13, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : zoijcleaowVar, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
    }

    private final void okpsazkaxt() {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        if (((cqumvgiudr) ojitshcjhn().getValue()).dxjokdxxww()) {
            return;
        }
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : true, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.C2432ppxfxbqfkf.f100974iobyxmoadg);
    }

    private final void ribwqtqdhb() {
        cllcsxoeiz(this, ((cqumvgiudr) ojitshcjhn().getValue()).ppxfxbqfkf(), false, 2, null);
    }

    private final void rlfsiqarku(String str, bo1.ppxfxbqfkf ppxfxbqfkfVar) {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.iobyxmoadg.zoijcleaow(new ScanGoScanMatrixPayload(str, 0.0d, null, ppxfxbqfkfVar, 6, null)));
    }

    private final void sflfametgt() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.wkgbmnqykc.f100978iobyxmoadg);
    }

    private final void sopmlzcsov() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.eablkybsjg.f100967iobyxmoadg);
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
    }

    private final void stevsuqkhv(String str, boolean z13, co1.wkgbmnqykc wkgbmnqykcVar) {
        switch (iobyxmoadg.f100987zoijcleaow[wkgbmnqykcVar.iobyxmoadg().ordinal()]) {
            case 1:
            case 2:
                bo1.ppxfxbqfkf ppxfxbqfkfVar = wkgbmnqykcVar.iobyxmoadg() == bo1.zoijcleaow.MARK_WEIGHT_IS_EMPTY_CODE ? bo1.ppxfxbqfkf.WEIGHT : bo1.ppxfxbqfkf.AMOUNT;
                yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.C2432ppxfxbqfkf.f100974iobyxmoadg);
                yggfygwlhe(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.wflxmlrfwp(ppxfxbqfkfVar, str, z13));
                break;
            case 3:
            case 4:
            case 5:
                yggfygwlhe(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.dxjokdxxww(wkgbmnqykcVar.zoijcleaow()));
                sflfametgt();
                break;
            case 6:
                yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.draadjrbmk.f100965iobyxmoadg);
                sflfametgt();
                break;
            default:
                yggfygwlhe(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gtknphoqwx(wkgbmnqykcVar.zoijcleaow()));
                sflfametgt();
                break;
        }
    }

    private final void ulzqkzuiru(boolean z13) {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : z13, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp() {
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow.f100979iobyxmoadg);
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.nufgyqmvbu.f100972iobyxmoadg);
    }

    private final boolean wypolnanlu(String str, co1.iobyxmoadg iobyxmoadgVar, boolean z13) {
        if (!iobyxmoadgVar.eablkybsjg()) {
            String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            if (strPpxfxbqfkf == null) {
                return false;
            }
            yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow.f100979iobyxmoadg);
            yggfygwlhe(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gtknphoqwx(strPpxfxbqfkf));
            return false;
        }
        if (!iobyxmoadgVar.wkgbmnqykc().isEmpty()) {
            if (((cqumvgiudr) ojitshcjhn().getValue()).ppxfxbqfkf().length() > 0) {
                yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow.f100979iobyxmoadg);
            }
            stevsuqkhv(str, z13, (co1.wkgbmnqykc) iobyxmoadgVar.wkgbmnqykc().get(0));
            return false;
        }
        ScanGoCartModel scanGoCartModelIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if ((scanGoCartModelIobyxmoadg != null ? scanGoCartModelIobyxmoadg.getActionedProduct() : null) != null) {
            return true;
        }
        yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow.f100979iobyxmoadg);
        return false;
    }

    private final void xrmfcynszj() {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    private final void ydmasvzmpa() {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new C2433wkgbmnqykc(null), 3, null);
    }

    private final void yfnezrywwk(bo1.ppxfxbqfkf ppxfxbqfkfVar, String str) {
        int i13 = iobyxmoadg.f100985iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == 1) {
            yggfygwlhe(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.iobyxmoadg.f100970iobyxmoadg);
            sflfametgt();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jpowsppfya(str, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg() {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f51914iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f51919zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f51917ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f51918wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f51912eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f51913gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f51915lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f51916nufgyqmvbu : true)));
    }

    @Override // fp1.iobyxmoadg.InterfaceC0763iobyxmoadg
    public void nufgyqmvbu(String barcode, co1.iobyxmoadg model, boolean z13) {
        ScanGoProductModel actionedProduct;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(barcode, "barcode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        if (wypolnanlu(barcode, model, z13)) {
            ScanGoCartModel scanGoCartModelIobyxmoadg = model.iobyxmoadg();
            if (scanGoCartModelIobyxmoadg != null && (actionedProduct = scanGoCartModelIobyxmoadg.getActionedProduct()) != null) {
                czzsidtyhn(actionedProduct);
            }
            sflfametgt();
        }
    }

    @Override // sw0.eablkybsjg, androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        this.f100981dxjokdxxww.ppxfxbqfkf(this);
        super.onCleared();
    }

    public final void vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.dxjokdxxww) {
            ribwqtqdhb();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.wflxmlrfwp) {
            jztzpxfvev();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.gxszxtbevo) {
            crxdokpmqz();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.eablkybsjg) {
            sopmlzcsov();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.lqeggnwhkg) {
            jlmebxxoox();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.ojitshcjhn) {
            metgxyhuhe();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.draadjrbmk) {
            okpsazkaxt();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.gtknphoqwx) {
            ikoacuggdj();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.ppxfxbqfkf) {
            ntlheqmsrt(((ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.ppxfxbqfkf) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.C2434zoijcleaow) {
            mbcevpiqjq(((ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.C2434zoijcleaow) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.wkgbmnqykc) {
            ulzqkzuiru(((ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.wkgbmnqykc) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.btonecajqb) {
            jhduphickx(((ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.btonecajqb) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.agtfadlqog) {
            xrmfcynszj();
            return;
        }
        if (event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.iobyxmoadg) {
            ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.iobyxmoadg iobyxmoadgVar = (ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.iobyxmoadg) event;
            rlfsiqarku(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
        } else {
            if (!(event instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.nufgyqmvbu)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.nufgyqmvbu nufgyqmvbuVar = (ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.nufgyqmvbu) event;
            yfnezrywwk(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg());
        }
    }
}
