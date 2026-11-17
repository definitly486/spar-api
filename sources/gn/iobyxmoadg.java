package gn;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.address.api.model.AddressDetailScreenMode;
import ru.myspar.address.impl.detail.domain.State;
import ru.myspar.address.impl.detail.domain.models.AddressDetailInputState;
import ru.myspar.components.address.api.model.UserAddress;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final n20.iobyxmoadg f37930eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bv.iobyxmoadg f37931ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final bv.ppxfxbqfkf f37932wkgbmnqykc;

    /* JADX INFO: renamed from: gn.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0860iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f37934zdlpuopuiu;

        C0860iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C0860iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f37934zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f37934zdlpuopuiu = 1;
                if (iobyxmoadgVar.uwvvkdfqfp(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C0860iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f37935iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f37937yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f37938zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f37937yggfygwlhe = obj;
            this.f37935iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.czzsidtyhn(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f37939cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f37941jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f37942yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f37943zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f37941jyumaefscl = obj;
            this.f37939cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uwvvkdfqfp(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f37945zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f37945zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f37945zdlpuopuiu = 1;
                if (iobyxmoadgVar.czzsidtyhn(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(bv.iobyxmoadg createOrUpdateDeliveryAddressUseCase, bv.ppxfxbqfkf deleteAddressUseCase, n20.iobyxmoadg changeCartAddressUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createOrUpdateDeliveryAddressUseCase, "createOrUpdateDeliveryAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteAddressUseCase, "deleteAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartAddressUseCase, "changeCartAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f37931ppxfxbqfkf = createOrUpdateDeliveryAddressUseCase;
        this.f37932wkgbmnqykc = deleteAddressUseCase;
        this.f37930eablkybsjg = changeCartAddressUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object czzsidtyhn(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f37935iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f37935iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f37937yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f37935iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            AddressDetailScreenMode mode = ((State) jlmebxxoox()).getMode();
            AddressDetailScreenMode.EditExisted editExisted = mode instanceof AddressDetailScreenMode.EditExisted ? (AddressDetailScreenMode.EditExisted) mode : null;
            if (editExisted != null) {
                AddressDetailScreenMode.EditExisted editExisted2 = editExisted.zynmafqrjb() ? editExisted : null;
                if (editExisted2 != null) {
                    ydmasvzmpa();
                    bv.ppxfxbqfkf.zoijcleaow zoijcleaowVar = new bv.ppxfxbqfkf.zoijcleaow(editExisted2.getUserAddress().getAddressId(), bv.ppxfxbqfkf.iobyxmoadg.DELIVERY);
                    try {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                        bv.ppxfxbqfkf ppxfxbqfkfVar2 = this.f37932wkgbmnqykc;
                        ppxfxbqfkfVar.f37938zdlpuopuiu = this;
                        ppxfxbqfkfVar.f37935iwizpuwonk = 1;
                        if (ppxfxbqfkfVar2.zoijcleaow(zoijcleaowVar, ppxfxbqfkfVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        iobyxmoadgVar = this;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    }
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f37938zdlpuopuiu;
        try {
            zdlpuopuiu.zoijcleaow(obj);
        } catch (Throwable th3) {
            th = th3;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.ppxfxbqfkf(true));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.gxszxtbevo(thDxjokdxxww));
        }
        iobyxmoadgVar.jztzpxfvev();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void jztzpxfvev() {
        ulzqkzuiru(new gxszxtbevo.btonecajqb(false));
    }

    private final void metgxyhuhe(hn.iobyxmoadg iobyxmoadgVar, String str) {
        if (((State) jlmebxxoox()).getTypesState().getSelectedType() == iobyxmoadgVar) {
            return;
        }
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(iobyxmoadgVar, str));
    }

    private final void okpsazkaxt() {
        if (((State) jlmebxxoox()).getMode().zynmafqrjb()) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
        } else {
            crxdokpmqz(eablkybsjg.C0858eablkybsjg.f37908iobyxmoadg);
        }
    }

    private final void rlfsiqarku() {
        State state = (State) jlmebxxoox();
        hn.iobyxmoadg selectedType = state.getTypesState().getSelectedType();
        if (selectedType == null || mj.kcexrzcfyt.zfvoamnweg(state.getInputCustomName().getInput().draadjrbmk())) {
            selectedType = null;
        }
        if (selectedType == null) {
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(null, k30.draadjrbmk.ppxfxbqfkf()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:61:0x018b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:64:0x0195  */
    /* JADX WARN: Code duplicated, block: B:66:0x0199  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object uwvvkdfqfp(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        AddressDetailScreenMode mode;
        UserAddress.Delivery deliveryZoijcleaow;
        iobyxmoadg iobyxmoadgVar;
        AddressDetailScreenMode addressDetailScreenMode;
        iobyxmoadg iobyxmoadgVar2;
        Object objWkgbmnqykc;
        Throwable thDxjokdxxww;
        Object ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f37939cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f37939cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f37941jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f37939cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ydmasvzmpa();
            State state = (State) jlmebxxoox();
            mode = state.getMode();
            if (mode instanceof AddressDetailScreenMode.CreateNew) {
                deliveryZoijcleaow = new UserAddress.Delivery(k30.draadjrbmk.ppxfxbqfkf(), state.getShortAddressText(), state.getFullAddressText(), state.getInputCustomName().getInput().draadjrbmk(), yfnezrywwk(state.getInputFlat(), state), yfnezrywwk(state.getInputEntrance(), state), yfnezrywwk(state.getInputFloor(), state), state.getInputIntercom().getInput().draadjrbmk(), state.getIsPrivateHouseChecked(), state.getHasGateChecked(), state.getAddressLocation(), false);
            } else {
                if (!(mode instanceof AddressDetailScreenMode.EditExisted)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserAddress.Delivery userAddress = ((AddressDetailScreenMode.EditExisted) mode).getUserAddress();
                deliveryZoijcleaow = userAddress.zoijcleaow((1 & 1) != 0 ? userAddress.addressId : null, (1 & 2) != 0 ? userAddress.shortAddress : state.getShortAddressText(), (1 & 4) != 0 ? userAddress.fullAddress : state.getFullAddressText(), (1 & 8) != 0 ? userAddress.customName : state.getInputCustomName().getInput().draadjrbmk(), (1 & 16) != 0 ? userAddress.flat : yfnezrywwk(state.getInputFlat(), state), (1 & 32) != 0 ? userAddress.entrance : yfnezrywwk(state.getInputEntrance(), state), (1 & 64) != 0 ? userAddress.floor : yfnezrywwk(state.getInputFloor(), state), (1 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? userAddress.intercom : state.getInputIntercom().getInput().draadjrbmk(), (1 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? userAddress.isPrivateHouse : state.getIsPrivateHouseChecked(), (1 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? userAddress.hasGate : state.getHasGateChecked(), (1 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? userAddress.location : state.getAddressLocation(), (1 & 2048) != 0 ? userAddress.isSelected : false);
            }
            AddressDetailScreenMode.EditExisted editExisted = mode instanceof AddressDetailScreenMode.EditExisted ? (AddressDetailScreenMode.EditExisted) mode : null;
            if (editExisted != null) {
                if ((kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(editExisted.getUserAddress(), deliveryZoijcleaow) ? editExisted : null) != null) {
                    crxdokpmqz(eablkybsjg.zoijcleaow.f37915iobyxmoadg);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                bv.iobyxmoadg.C0307iobyxmoadg c0307iobyxmoadg = new bv.iobyxmoadg.C0307iobyxmoadg(deliveryZoijcleaow);
                bv.iobyxmoadg iobyxmoadgVar4 = this.f37931ppxfxbqfkf;
                wkgbmnqykcVar.f37943zdlpuopuiu = this;
                wkgbmnqykcVar.f37942yggfygwlhe = mode;
                wkgbmnqykcVar.f37939cqumvgiudr = 1;
                objZoijcleaow = iobyxmoadgVar4.zoijcleaow(c0307iobyxmoadg, wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                addressDetailScreenMode = mode;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                addressDetailScreenMode = (AddressDetailScreenMode) wkgbmnqykcVar.f37942yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f37943zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                } catch (Throwable th3) {
                    th = th3;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    if (addressDetailScreenMode instanceof AddressDetailScreenMode.CreateNew) {
                        ppxfxbqfkfVar = eablkybsjg.iobyxmoadg.f37910iobyxmoadg;
                    } else {
                        if (addressDetailScreenMode instanceof AddressDetailScreenMode.EditExisted) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ppxfxbqfkfVar = new eablkybsjg.ppxfxbqfkf(false);
                    }
                    iobyxmoadgVar.crxdokpmqz(ppxfxbqfkfVar);
                }
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    iobyxmoadgVar.crxdokpmqz(new eablkybsjg.gxszxtbevo(thDxjokdxxww));
                }
                iobyxmoadgVar.jztzpxfvev();
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            mode = (AddressDetailScreenMode) wkgbmnqykcVar.f37942yggfygwlhe;
            iobyxmoadgVar2 = (iobyxmoadg) wkgbmnqykcVar.f37943zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th4) {
                th = th4;
                addressDetailScreenMode = mode;
                iobyxmoadgVar = iobyxmoadgVar2;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        String str = (String) objZoijcleaow;
        if ((mode instanceof AddressDetailScreenMode.CreateNew) || mode.wkgbmnqykc()) {
            n20.iobyxmoadg.InterfaceC1474iobyxmoadg.C1475iobyxmoadg c1475iobyxmoadg = new n20.iobyxmoadg.InterfaceC1474iobyxmoadg.C1475iobyxmoadg(str);
            n20.iobyxmoadg iobyxmoadgVar8 = iobyxmoadgVar2.f37930eablkybsjg;
            wkgbmnqykcVar.f37943zdlpuopuiu = iobyxmoadgVar2;
            wkgbmnqykcVar.f37942yggfygwlhe = mode;
            wkgbmnqykcVar.f37939cqumvgiudr = 2;
            if (iobyxmoadgVar8.zoijcleaow(c1475iobyxmoadg, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        addressDetailScreenMode = mode;
        iobyxmoadgVar = iobyxmoadgVar2;
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            if (addressDetailScreenMode instanceof AddressDetailScreenMode.CreateNew) {
                ppxfxbqfkfVar = eablkybsjg.iobyxmoadg.f37910iobyxmoadg;
            } else {
                if (addressDetailScreenMode instanceof AddressDetailScreenMode.EditExisted) {
                    throw new NoWhenBranchMatchedException();
                }
                ppxfxbqfkfVar = new eablkybsjg.ppxfxbqfkf(false);
            }
            iobyxmoadgVar.crxdokpmqz(ppxfxbqfkfVar);
        }
        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.gxszxtbevo(thDxjokdxxww));
        }
        iobyxmoadgVar.jztzpxfvev();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void xrmfcynszj() {
        AddressDetailScreenMode mode = ((State) jlmebxxoox()).getMode();
        AddressDetailScreenMode.EditExisted editExisted = mode instanceof AddressDetailScreenMode.EditExisted ? (AddressDetailScreenMode.EditExisted) mode : null;
        if (editExisted == null) {
            return;
        }
        crxdokpmqz(new eablkybsjg.wkgbmnqykc(editExisted.getShortAddress(), editExisted.getFullAddress(), editExisted.getLocation()));
    }

    private final void ydmasvzmpa() {
        ulzqkzuiru(new gxszxtbevo.btonecajqb(true));
    }

    private static final String yfnezrywwk(AddressDetailInputState addressDetailInputState, State state) {
        String strDraadjrbmk = addressDetailInputState.getInput().draadjrbmk();
        if (state.getIsPrivateHouseChecked()) {
            strDraadjrbmk = null;
        }
        return strDraadjrbmk == null ? "" : strDraadjrbmk;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(gn.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, gn.wkgbmnqykc.ppxfxbqfkf.f37964iobyxmoadg)) {
            okpsazkaxt();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, gn.wkgbmnqykc.iobyxmoadg.f37960iobyxmoadg)) {
            xrmfcynszj();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, gn.wkgbmnqykc.C0861wkgbmnqykc.f37966iobyxmoadg)) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0860iobyxmoadg(null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, gn.wkgbmnqykc.zoijcleaow.f37967iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.zoijcleaow.f37915iobyxmoadg);
            return;
        }
        if (intent instanceof gn.wkgbmnqykc.eablkybsjg) {
            gn.wkgbmnqykc.eablkybsjg eablkybsjgVar = (gn.wkgbmnqykc.eablkybsjg) intent;
            metgxyhuhe(eablkybsjgVar.zoijcleaow(), eablkybsjgVar.iobyxmoadg());
            return;
        }
        if (intent instanceof gn.wkgbmnqykc.gxszxtbevo) {
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(((gn.wkgbmnqykc.gxszxtbevo) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof gn.wkgbmnqykc.lqeggnwhkg) {
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(((gn.wkgbmnqykc.lqeggnwhkg) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof gn.wkgbmnqykc.nufgyqmvbu) {
            gn.wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = (gn.wkgbmnqykc.nufgyqmvbu) intent;
            ulzqkzuiru(new gxszxtbevo.eablkybsjg(nufgyqmvbuVar.iobyxmoadg(), nufgyqmvbuVar.zoijcleaow()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, gn.wkgbmnqykc.wflxmlrfwp.f37965iobyxmoadg)) {
            rlfsiqarku();
            return;
        }
        if (intent instanceof gn.wkgbmnqykc.dxjokdxxww) {
            ulzqkzuiru(new gxszxtbevo.C0859gxszxtbevo(((gn.wkgbmnqykc.dxjokdxxww) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof gn.wkgbmnqykc.btonecajqb) {
            ulzqkzuiru(new gxszxtbevo.lqeggnwhkg(((gn.wkgbmnqykc.btonecajqb) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof gn.wkgbmnqykc.gtknphoqwx) {
            ulzqkzuiru(new gxszxtbevo.nufgyqmvbu(((gn.wkgbmnqykc.gtknphoqwx) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof gn.wkgbmnqykc.draadjrbmk) {
            ulzqkzuiru(new gxszxtbevo.dxjokdxxww(((gn.wkgbmnqykc.draadjrbmk) intent).iobyxmoadg()));
        } else {
            if (!(intent instanceof gn.wkgbmnqykc.agtfadlqog)) {
                throw new NoWhenBranchMatchedException();
            }
            gn.wkgbmnqykc.agtfadlqog agtfadlqogVar = (gn.wkgbmnqykc.agtfadlqog) intent;
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(agtfadlqogVar.ppxfxbqfkf(), agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.zoijcleaow()));
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(gn.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof gn.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
