package rl0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenMode;
import ru.myspar.proloyalty.address.impl.detail.domain.State;
import ru.myspar.proloyalty.address.impl.detail.domain.models.AddressDetailInputState;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final v01.iobyxmoadg f83044eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final vt0.iobyxmoadg f83045ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final vt0.ppxfxbqfkf f83046wkgbmnqykc;

    /* JADX INFO: renamed from: rl0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1863iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83048zdlpuopuiu;

        C1863iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C1863iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83048zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f83048zdlpuopuiu = 1;
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
            return ((C1863iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f83049iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83051yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83052zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83051yggfygwlhe = obj;
            this.f83049iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.czzsidtyhn(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f83053cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f83055jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f83056yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83057zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83055jyumaefscl = obj;
            this.f83053cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uwvvkdfqfp(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83059zdlpuopuiu;

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
            int i13 = this.f83059zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f83059zdlpuopuiu = 1;
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
    public iobyxmoadg(vt0.iobyxmoadg createOrUpdateDeliveryAddressUseCase, vt0.ppxfxbqfkf deleteAddressUseCase, v01.iobyxmoadg changeCartAddressUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createOrUpdateDeliveryAddressUseCase, "createOrUpdateDeliveryAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteAddressUseCase, "deleteAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartAddressUseCase, "changeCartAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f83045ppxfxbqfkf = createOrUpdateDeliveryAddressUseCase;
        this.f83046wkgbmnqykc = deleteAddressUseCase;
        this.f83044eablkybsjg = changeCartAddressUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object czzsidtyhn(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f83049iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f83049iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f83051yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f83049iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            AddressDetailScreenMode mode = ((State) jlmebxxoox()).getMode();
            AddressDetailScreenMode.EditExisted editExisted = mode instanceof AddressDetailScreenMode.EditExisted ? (AddressDetailScreenMode.EditExisted) mode : null;
            if (editExisted != null) {
                AddressDetailScreenMode.EditExisted editExisted2 = editExisted.zynmafqrjb() ? editExisted : null;
                if (editExisted2 != null) {
                    ydmasvzmpa();
                    vt0.ppxfxbqfkf.zoijcleaow zoijcleaowVar = new vt0.ppxfxbqfkf.zoijcleaow(editExisted2.getUserAddress().getAddressId(), vt0.ppxfxbqfkf.iobyxmoadg.DELIVERY);
                    try {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                        vt0.ppxfxbqfkf ppxfxbqfkfVar2 = this.f83046wkgbmnqykc;
                        ppxfxbqfkfVar.f83052zdlpuopuiu = this;
                        ppxfxbqfkfVar.f83049iwizpuwonk = 1;
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
        iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f83052zdlpuopuiu;
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

    private final void metgxyhuhe(sl0.iobyxmoadg iobyxmoadgVar, String str) {
        if (((State) jlmebxxoox()).getTypesState().getSelectedType() == iobyxmoadgVar) {
            return;
        }
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(iobyxmoadgVar, str));
    }

    private final void okpsazkaxt() {
        if (((State) jlmebxxoox()).getMode().zynmafqrjb()) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
        } else {
            crxdokpmqz(eablkybsjg.C1861eablkybsjg.f83022iobyxmoadg);
        }
    }

    private final void rlfsiqarku() {
        State state = (State) jlmebxxoox();
        sl0.iobyxmoadg selectedType = state.getTypesState().getSelectedType();
        if (selectedType == null || mj.kcexrzcfyt.zfvoamnweg(state.getInputCustomName().getInput().draadjrbmk())) {
            selectedType = null;
        }
        if (selectedType == null) {
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(null, dxjokdxxww.ppxfxbqfkf()));
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
            int i13 = wkgbmnqykcVar.f83053cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f83053cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f83055jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f83053cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ydmasvzmpa();
            State state = (State) jlmebxxoox();
            mode = state.getMode();
            if (mode instanceof AddressDetailScreenMode.CreateNew) {
                deliveryZoijcleaow = new UserAddress.Delivery(dxjokdxxww.ppxfxbqfkf(), state.getShortAddressText(), state.getFullAddressText(), state.getInputCustomName().getInput().draadjrbmk(), yfnezrywwk(state.getInputFlat(), state), yfnezrywwk(state.getInputEntrance(), state), yfnezrywwk(state.getInputFloor(), state), state.getInputIntercom().getInput().draadjrbmk(), state.getIsPrivateHouseChecked(), state.getHasGateChecked(), state.getAddressLocation(), false);
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
                    crxdokpmqz(eablkybsjg.zoijcleaow.f83029iobyxmoadg);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                vt0.iobyxmoadg.C2927iobyxmoadg c2927iobyxmoadg = new vt0.iobyxmoadg.C2927iobyxmoadg(deliveryZoijcleaow);
                vt0.iobyxmoadg iobyxmoadgVar4 = this.f83045ppxfxbqfkf;
                wkgbmnqykcVar.f83057zdlpuopuiu = this;
                wkgbmnqykcVar.f83056yggfygwlhe = mode;
                wkgbmnqykcVar.f83053cqumvgiudr = 1;
                objZoijcleaow = iobyxmoadgVar4.zoijcleaow(c2927iobyxmoadg, wkgbmnqykcVar);
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
                addressDetailScreenMode = (AddressDetailScreenMode) wkgbmnqykcVar.f83056yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f83057zdlpuopuiu;
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
                        ppxfxbqfkfVar = eablkybsjg.iobyxmoadg.f83024iobyxmoadg;
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
            mode = (AddressDetailScreenMode) wkgbmnqykcVar.f83056yggfygwlhe;
            iobyxmoadgVar2 = (iobyxmoadg) wkgbmnqykcVar.f83057zdlpuopuiu;
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
            v01.iobyxmoadg.InterfaceC2862iobyxmoadg.C2863iobyxmoadg c2863iobyxmoadg = new v01.iobyxmoadg.InterfaceC2862iobyxmoadg.C2863iobyxmoadg(str);
            v01.iobyxmoadg iobyxmoadgVar8 = iobyxmoadgVar2.f83044eablkybsjg;
            wkgbmnqykcVar.f83057zdlpuopuiu = iobyxmoadgVar2;
            wkgbmnqykcVar.f83056yggfygwlhe = mode;
            wkgbmnqykcVar.f83053cqumvgiudr = 2;
            if (iobyxmoadgVar8.zoijcleaow(c2863iobyxmoadg, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        addressDetailScreenMode = mode;
        iobyxmoadgVar = iobyxmoadgVar2;
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            if (addressDetailScreenMode instanceof AddressDetailScreenMode.CreateNew) {
                ppxfxbqfkfVar = eablkybsjg.iobyxmoadg.f83024iobyxmoadg;
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
    public void zynmafqrjb(rl0.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, rl0.wkgbmnqykc.ppxfxbqfkf.f83078iobyxmoadg)) {
            okpsazkaxt();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, rl0.wkgbmnqykc.iobyxmoadg.f83074iobyxmoadg)) {
            xrmfcynszj();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, rl0.wkgbmnqykc.C1864wkgbmnqykc.f83080iobyxmoadg)) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1863iobyxmoadg(null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, rl0.wkgbmnqykc.zoijcleaow.f83081iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.zoijcleaow.f83029iobyxmoadg);
            return;
        }
        if (intent instanceof rl0.wkgbmnqykc.eablkybsjg) {
            rl0.wkgbmnqykc.eablkybsjg eablkybsjgVar = (rl0.wkgbmnqykc.eablkybsjg) intent;
            metgxyhuhe(eablkybsjgVar.zoijcleaow(), eablkybsjgVar.iobyxmoadg());
            return;
        }
        if (intent instanceof rl0.wkgbmnqykc.gxszxtbevo) {
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(((rl0.wkgbmnqykc.gxszxtbevo) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof rl0.wkgbmnqykc.lqeggnwhkg) {
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(((rl0.wkgbmnqykc.lqeggnwhkg) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof rl0.wkgbmnqykc.nufgyqmvbu) {
            rl0.wkgbmnqykc.nufgyqmvbu nufgyqmvbuVar = (rl0.wkgbmnqykc.nufgyqmvbu) intent;
            ulzqkzuiru(new gxszxtbevo.eablkybsjg(nufgyqmvbuVar.iobyxmoadg(), nufgyqmvbuVar.zoijcleaow()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, rl0.wkgbmnqykc.wflxmlrfwp.f83079iobyxmoadg)) {
            rlfsiqarku();
            return;
        }
        if (intent instanceof rl0.wkgbmnqykc.dxjokdxxww) {
            ulzqkzuiru(new gxszxtbevo.C1862gxszxtbevo(((rl0.wkgbmnqykc.dxjokdxxww) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof rl0.wkgbmnqykc.btonecajqb) {
            ulzqkzuiru(new gxszxtbevo.lqeggnwhkg(((rl0.wkgbmnqykc.btonecajqb) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof rl0.wkgbmnqykc.gtknphoqwx) {
            ulzqkzuiru(new gxszxtbevo.nufgyqmvbu(((rl0.wkgbmnqykc.gtknphoqwx) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof rl0.wkgbmnqykc.draadjrbmk) {
            ulzqkzuiru(new gxszxtbevo.dxjokdxxww(((rl0.wkgbmnqykc.draadjrbmk) intent).iobyxmoadg()));
        } else {
            if (!(intent instanceof rl0.wkgbmnqykc.agtfadlqog)) {
                throw new NoWhenBranchMatchedException();
            }
            rl0.wkgbmnqykc.agtfadlqog agtfadlqogVar = (rl0.wkgbmnqykc.agtfadlqog) intent;
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(agtfadlqogVar.ppxfxbqfkf(), agtfadlqogVar.iobyxmoadg(), agtfadlqogVar.zoijcleaow()));
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(rl0.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof rl0.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
