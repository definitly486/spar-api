package ru.myspar.scango.impl.screens.scan.product.presentation;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import i22.nufgyqmvbu;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import n32.cqumvgiudr;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoScanProductPayload;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;
import vx.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends eablkybsjg implements j32.iobyxmoadg.InterfaceC1088iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final at.iobyxmoadg f103637btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final j32.iobyxmoadg f103638dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ScanGoScanProductPayload f103639gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final i22.iobyxmoadg f103640lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final nufgyqmvbu f103641nufgyqmvbu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f103642iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f103643ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f103644zoijcleaow;

        static {
            int[] iArr = new int[f22.ppxfxbqfkf.values().length];
            try {
                iArr[f22.ppxfxbqfkf.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f22.ppxfxbqfkf.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103642iobyxmoadg = iArr;
            int[] iArr2 = new int[f22.zoijcleaow.values().length];
            try {
                iArr2[f22.zoijcleaow.MARK_PIECE_IS_EMPTY_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f22.zoijcleaow.MARK_WEIGHT_IS_EMPTY_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f22.zoijcleaow.MARK_IS_INCORRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f22.zoijcleaow.MARK_IS_DUPLICATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f22.zoijcleaow.PRODUCT_UNAVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f22.zoijcleaow.PRODUCT_NOT_FOUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f103644zoijcleaow = iArr2;
            int[] iArr3 = new int[x30.iobyxmoadg.values().length];
            try {
                iArr3[x30.iobyxmoadg.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[x30.iobyxmoadg.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f103643ppxfxbqfkf = iArr3;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103646zdlpuopuiu;

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
            int i13 = this.f103646zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVarZoijcleaow = wkgbmnqykc.this.f103641nufgyqmvbu.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
                this.f103646zdlpuopuiu = 1;
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
                g22.zoijcleaow zoijcleaowVar = scanGoCartModel.getProducts().isEmpty() ? g22.zoijcleaow.EMPTY : g22.zoijcleaow.CONTINUE;
                zynmafqrjb zynmafqrjbVarOjitshcjhn = wkgbmnqykcVar.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                    cqumvgiudrVar = (cqumvgiudr) value;
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : zoijcleaowVar, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.scan.product.presentation.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C2512wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103648zdlpuopuiu;

        C2512wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new C2512wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103648zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                at.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.this.f103637btonecajqb;
                String name = wkgbmnqykc.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                this.f103648zdlpuopuiu = 1;
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
            if (ppxfxbqfkfVar instanceof at.ppxfxbqfkf.iobyxmoadg) {
                wkgbmnqykc.this.yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.agtfadlqog.f103620iobyxmoadg);
            } else {
                if (!(ppxfxbqfkfVar instanceof at.ppxfxbqfkf.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                wkgbmnqykc.this.yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.lqeggnwhkg.f103628iobyxmoadg);
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C2512wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f103649iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f103650jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103652zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, boolean z13, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f103650jyumaefscl = str;
            this.f103649iwizpuwonk = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new zoijcleaow(this.f103650jyumaefscl, this.f103649iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103652zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    wkgbmnqykc.this.zfvoamnweg();
                    wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                    String str = this.f103650jyumaefscl;
                    boolean z13 = this.f103649iwizpuwonk;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    i22.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykcVar.f103640lqeggnwhkg;
                    i22.iobyxmoadg.C0982iobyxmoadg c0982iobyxmoadg = new i22.iobyxmoadg.C0982iobyxmoadg(str, z13, null, 4, null);
                    this.f103652zdlpuopuiu = 1;
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
            String str2 = this.f103650jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                j32.iobyxmoadg.InterfaceC1088iobyxmoadg.iobyxmoadg(wkgbmnqykcVar2, str2, (g22.iobyxmoadg) objWkgbmnqykc, false, 4, null);
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
    public wkgbmnqykc(i22.iobyxmoadg addToCartByBarcodeUseCase, nufgyqmvbu subscribeToCartUpdatesUseCase, j32.iobyxmoadg scanGoMatrixController, at.iobyxmoadg permissionManager, ScanGoScanProductPayload payload) {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        super(new cqumvgiudr(null, false, false, false, 0, false, null, false, KotlinVersion.MAX_COMPONENT_VALUE, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addToCartByBarcodeUseCase, "addToCartByBarcodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartUpdatesUseCase, "subscribeToCartUpdatesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoMatrixController, "scanGoMatrixController");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        this.f103640lqeggnwhkg = addToCartByBarcodeUseCase;
        this.f103641nufgyqmvbu = subscribeToCartUpdatesUseCase;
        this.f103638dxjokdxxww = scanGoMatrixController;
        this.f103637btonecajqb = permissionManager;
        this.f103639gtknphoqwx = payload;
        scanGoMatrixController.zoijcleaow(this);
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : this.f103639gtknphoqwx.getState(), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
        ydmasvzmpa();
    }

    static /* synthetic */ void cllcsxoeiz(wkgbmnqykc wkgbmnqykcVar, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        wkgbmnqykcVar.jpowsppfya(str, z13);
    }

    private final void crxdokpmqz() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gxszxtbevo.f103626iobyxmoadg);
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    private final void czzsidtyhn(ScanGoProductModel scanGoProductModel) {
        int i13 = iobyxmoadg.f103643ppxfxbqfkf[scanGoProductModel.getMeasure().ordinal()];
        if (i13 == 1) {
            oipsdeybqn(scanGoProductModel.getId(), g22.zoijcleaow.AMOUNT);
            yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.iobyxmoadg.f103627iobyxmoadg);
        } else if (i13 != 2) {
            yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.btonecajqb.f103621iobyxmoadg);
        } else {
            oipsdeybqn(scanGoProductModel.getId(), g22.zoijcleaow.WEIGHT);
            yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.iobyxmoadg.f103627iobyxmoadg);
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
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
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
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : z13, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
    }

    private final void jlmebxxoox() {
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
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
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
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
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : str, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : str.length() > 0, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
    }

    private final void metgxyhuhe() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.ojitshcjhn.f103630iobyxmoadg);
    }

    private final void ntlheqmsrt(String str) {
        cllcsxoeiz(this, str, false, 2, null);
    }

    private final void oipsdeybqn(int i13, g22.zoijcleaow zoijcleaowVar) {
        Object value;
        cqumvgiudr cqumvgiudrVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            cqumvgiudrVar = (cqumvgiudr) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : i13, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : zoijcleaowVar, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
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
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : true, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.C2511ppxfxbqfkf.f103631iobyxmoadg);
    }

    private final void ribwqtqdhb() {
        cllcsxoeiz(this, ((cqumvgiudr) ojitshcjhn().getValue()).ppxfxbqfkf(), false, 2, null);
    }

    private final void rlfsiqarku(String str, f22.ppxfxbqfkf ppxfxbqfkfVar) {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.scango.impl.screens.scan.matrix.presentation.iobyxmoadg.zoijcleaow(new ScanGoScanMatrixPayload(str, 0.0d, null, ppxfxbqfkfVar, 6, null)));
    }

    private final void sflfametgt() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.wkgbmnqykc.f103635iobyxmoadg);
    }

    private final void sopmlzcsov() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.eablkybsjg.f103624iobyxmoadg);
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    private final void stevsuqkhv(String str, boolean z13, g22.wkgbmnqykc wkgbmnqykcVar) {
        switch (iobyxmoadg.f103644zoijcleaow[wkgbmnqykcVar.iobyxmoadg().ordinal()]) {
            case 1:
            case 2:
                f22.ppxfxbqfkf ppxfxbqfkfVar = wkgbmnqykcVar.iobyxmoadg() == f22.zoijcleaow.MARK_WEIGHT_IS_EMPTY_CODE ? f22.ppxfxbqfkf.WEIGHT : f22.ppxfxbqfkf.AMOUNT;
                yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.C2511ppxfxbqfkf.f103631iobyxmoadg);
                yggfygwlhe(new ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.wflxmlrfwp(ppxfxbqfkfVar, str, z13));
                break;
            case 3:
            case 4:
            case 5:
                yggfygwlhe(new ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.dxjokdxxww(wkgbmnqykcVar.zoijcleaow()));
                sflfametgt();
                break;
            case 6:
                yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.draadjrbmk.f103622iobyxmoadg);
                sflfametgt();
                break;
            default:
                yggfygwlhe(new ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gtknphoqwx(wkgbmnqykcVar.zoijcleaow()));
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
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : z13, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp() {
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow.f103636iobyxmoadg);
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.nufgyqmvbu.f103629iobyxmoadg);
    }

    private final boolean wypolnanlu(String str, g22.iobyxmoadg iobyxmoadgVar, boolean z13) {
        if (!iobyxmoadgVar.eablkybsjg()) {
            String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            if (strPpxfxbqfkf == null) {
                return false;
            }
            yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow.f103636iobyxmoadg);
            yggfygwlhe(new ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gtknphoqwx(strPpxfxbqfkf));
            return false;
        }
        if (!iobyxmoadgVar.wkgbmnqykc().isEmpty()) {
            if (((cqumvgiudr) ojitshcjhn().getValue()).ppxfxbqfkf().length() > 0) {
                yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow.f103636iobyxmoadg);
            }
            stevsuqkhv(str, z13, (g22.wkgbmnqykc) iobyxmoadgVar.wkgbmnqykc().get(0));
            return false;
        }
        ScanGoCartModel scanGoCartModelIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if ((scanGoCartModelIobyxmoadg != null ? scanGoCartModelIobyxmoadg.getActionedProduct() : null) != null) {
            return true;
        }
        yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow.f103636iobyxmoadg);
        return false;
    }

    private final void xrmfcynszj() {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    private final void ydmasvzmpa() {
        gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new C2512wkgbmnqykc(null), 3, null);
    }

    private final void yfnezrywwk(f22.ppxfxbqfkf ppxfxbqfkfVar, String str) {
        int i13 = iobyxmoadg.f103642iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == 1) {
            yggfygwlhe(ru.myspar.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.iobyxmoadg.f103627iobyxmoadg);
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
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, cqumvgiudrVar.iobyxmoadg((191 & 1) != 0 ? cqumvgiudrVar.f68526iobyxmoadg : null, (191 & 2) != 0 ? cqumvgiudrVar.f68531zoijcleaow : false, (191 & 4) != 0 ? cqumvgiudrVar.f68529ppxfxbqfkf : false, (191 & 8) != 0 ? cqumvgiudrVar.f68530wkgbmnqykc : false, (191 & 16) != 0 ? cqumvgiudrVar.f68524eablkybsjg : 0, (191 & 32) != 0 ? cqumvgiudrVar.f68525gxszxtbevo : false, (191 & 64) != 0 ? cqumvgiudrVar.f68527lqeggnwhkg : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cqumvgiudrVar.f68528nufgyqmvbu : true)));
    }

    @Override // j32.iobyxmoadg.InterfaceC1088iobyxmoadg
    public void dxjokdxxww(String barcode, g22.iobyxmoadg model, boolean z13) {
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

    @Override // vx.eablkybsjg, androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        this.f103638dxjokdxxww.ppxfxbqfkf(this);
        super.onCleared();
    }

    public final void vipkmwdibw(ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.dxjokdxxww) {
            ribwqtqdhb();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.wflxmlrfwp) {
            jztzpxfvev();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.gxszxtbevo) {
            crxdokpmqz();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.eablkybsjg) {
            sopmlzcsov();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.lqeggnwhkg) {
            jlmebxxoox();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.ojitshcjhn) {
            metgxyhuhe();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.draadjrbmk) {
            okpsazkaxt();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.gtknphoqwx) {
            ikoacuggdj();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.ppxfxbqfkf) {
            ntlheqmsrt(((ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.ppxfxbqfkf) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.C2513zoijcleaow) {
            mbcevpiqjq(((ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.C2513zoijcleaow) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.wkgbmnqykc) {
            ulzqkzuiru(((ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.wkgbmnqykc) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.btonecajqb) {
            jhduphickx(((ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.btonecajqb) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.agtfadlqog) {
            xrmfcynszj();
            return;
        }
        if (event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.iobyxmoadg) {
            ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.iobyxmoadg iobyxmoadgVar = (ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.iobyxmoadg) event;
            rlfsiqarku(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
        } else {
            if (!(event instanceof ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.nufgyqmvbu)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.nufgyqmvbu nufgyqmvbuVar = (ru.myspar.scango.impl.screens.scan.product.presentation.zoijcleaow.nufgyqmvbu) event;
            yfnezrywwk(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg());
        }
    }
}
