package fn;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.address.api.model.AddressMapScreenArgs;
import ru.myspar.address.api.model.AddressMapScreenFlow;
import ru.myspar.address.impl.addresslist.store.State;
import ru.myspar.components.address.api.model.UserAddress;
import ru.myspar.core.domain.models.cart.Cart;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final bv.ppxfxbqfkf f34430eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bv.wkgbmnqykc f34431ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final n20.iobyxmoadg f34432wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f34433iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f34434jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34436zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34434jyumaefscl = str;
            this.f34433iwizpuwonk = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f34434jyumaefscl, this.f34433iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34436zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new fn.gxszxtbevo.eablkybsjg(true));
                    iobyxmoadg.this.ulzqkzuiru(new fn.gxszxtbevo.ppxfxbqfkf(this.f34434jyumaefscl));
                    n20.iobyxmoadg.InterfaceC1474iobyxmoadg.C1475iobyxmoadg c1475iobyxmoadg = new n20.iobyxmoadg.InterfaceC1474iobyxmoadg.C1475iobyxmoadg(this.f34434jyumaefscl);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    n20.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f34432wkgbmnqykc;
                    this.f34436zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(c1475iobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            String str = this.f34433iwizpuwonk;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.crxdokpmqz(fn.eablkybsjg.iobyxmoadg.f34419iobyxmoadg);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ulzqkzuiru(new fn.gxszxtbevo.ppxfxbqfkf(str));
                iobyxmoadgVar5.opjhrmiecq(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fn.gxszxtbevo.eablkybsjg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f34437cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ UserAddress.PickUp f34438iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f34439jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34441zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(String str, UserAddress.PickUp pickUp, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34439jyumaefscl = str;
            this.f34438iwizpuwonk = pickUp;
            this.f34437cqumvgiudr = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(this.f34439jyumaefscl, this.f34438iwizpuwonk, this.f34437cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34441zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new fn.gxszxtbevo.eablkybsjg(true));
                    iobyxmoadg.this.ulzqkzuiru(new fn.gxszxtbevo.ppxfxbqfkf(this.f34439jyumaefscl));
                    n20.iobyxmoadg.InterfaceC1474iobyxmoadg.zoijcleaow zoijcleaowVar = new n20.iobyxmoadg.InterfaceC1474iobyxmoadg.zoijcleaow(this.f34438iwizpuwonk.ppxfxbqfkf());
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    n20.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f34432wkgbmnqykc;
                    this.f34441zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            String str = this.f34437cqumvgiudr;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.crxdokpmqz(fn.eablkybsjg.iobyxmoadg.f34419iobyxmoadg);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ulzqkzuiru(new fn.gxszxtbevo.ppxfxbqfkf(str));
                iobyxmoadgVar5.opjhrmiecq(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fn.gxszxtbevo.eablkybsjg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: fn.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0758iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f34442iobyxmoadg;

        static {
            int[] iArr = new int[rm.zoijcleaow.values().length];
            try {
                iArr[rm.zoijcleaow.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rm.zoijcleaow.PickUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f34442iobyxmoadg = iArr;
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34444zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34444zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f34444zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(2750L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(fn.eablkybsjg.lqeggnwhkg.f34420iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f34445jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34447zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34445jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f34445jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34447zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new fn.gxszxtbevo.eablkybsjg(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    bv.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar.f34431ppxfxbqfkf;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f34447zdlpuopuiu = 1;
                    obj = wkgbmnqykcVar.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ru.myspar.components.address.api.model.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                ru.myspar.components.address.api.model.iobyxmoadg iobyxmoadgVar5 = (ru.myspar.components.address.api.model.iobyxmoadg) objWkgbmnqykc;
                iobyxmoadgVar4.ulzqkzuiru(new fn.gxszxtbevo.wkgbmnqykc(iobyxmoadgVar5.ppxfxbqfkf(), iobyxmoadgVar5.wkgbmnqykc()));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar4.opjhrmiecq(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new fn.gxszxtbevo.eablkybsjg(false));
            if (this.f34445jyumaefscl) {
                iobyxmoadg.this.iyctptxqzt();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f34448cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f34450jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f34451yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34452zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34450jyumaefscl = obj;
            this.f34448cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.sflfametgt(null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ fn.wkgbmnqykc f34453jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34455zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(fn.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34453jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f34453jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34455zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((fn.wkgbmnqykc.ppxfxbqfkf) this.f34453jyumaefscl).iobyxmoadg();
                this.f34455zdlpuopuiu = 1;
                if (iobyxmoadgVar.sflfametgt(strIobyxmoadg, this) == objGxszxtbevo) {
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
    public iobyxmoadg(bv.wkgbmnqykc fetchAddressesUseCase, n20.iobyxmoadg changeCartAddressUseCase, bv.ppxfxbqfkf deleteAddressUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fetchAddressesUseCase, "fetchAddressesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartAddressUseCase, "changeCartAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteAddressUseCase, "deleteAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f34431ppxfxbqfkf = fetchAddressesUseCase;
        this.f34432wkgbmnqykc = changeCartAddressUseCase;
        this.f34430eablkybsjg = deleteAddressUseCase;
    }

    private final void bfopjjpdmp(String str) {
        Object next;
        State state = (State) jlmebxxoox();
        String selectedAddressId = state.getSelectedAddressId();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(selectedAddressId, str)) {
            return;
        }
        Iterator it = state.getPickUpAddresses().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((UserAddress.PickUp) next).getShopId(), str));
        UserAddress.PickUp pickUp = (UserAddress.PickUp) next;
        if (pickUp == null) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(str, pickUp, selectedAddressId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iyctptxqzt() {
        crxdokpmqz(fn.eablkybsjg.gxszxtbevo.f34418iobyxmoadg);
        State state = (State) jlmebxxoox();
        if (state.getTypeSelectionEnable() || state.getCurrentAddressType() != rm.zoijcleaow.PickUp) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(null), 3, null);
    }

    private final void metgxyhuhe(rm.zoijcleaow zoijcleaowVar) {
        if (!((State) jlmebxxoox()).getTypeSelectionEnable() || ((State) jlmebxxoox()).getCurrentAddressType() == zoijcleaowVar) {
            return;
        }
        ulzqkzuiru(new fn.gxszxtbevo.iobyxmoadg(zoijcleaowVar));
    }

    private final void oipsdeybqn(String str) {
        Object next;
        Iterator it = ((State) jlmebxxoox()).getDeliveryAddresses().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((UserAddress.Delivery) next).getShopId(), str));
        UserAddress.Delivery delivery = (UserAddress.Delivery) next;
        if (delivery == null) {
            return;
        }
        crxdokpmqz(new fn.eablkybsjg.ppxfxbqfkf(delivery));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void opjhrmiecq(Throwable th2) {
        crxdokpmqz(new fn.eablkybsjg.wkgbmnqykc(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sflfametgt(String str, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        Object next;
        iobyxmoadg iobyxmoadgVar;
        Throwable th2;
        UserAddress.PickUp pickUp;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f34448cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f34448cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f34450jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f34448cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, ((State) jlmebxxoox()).getSelectedAddressId())) {
                crxdokpmqz(fn.eablkybsjg.C0757eablkybsjg.f34417iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            Iterator it = ((State) jlmebxxoox()).getPickUpAddresses().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((UserAddress.PickUp) next).getShopId(), str));
            UserAddress.PickUp pickUp2 = (UserAddress.PickUp) next;
            if (pickUp2 == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            ulzqkzuiru(new fn.gxszxtbevo.eablkybsjg(true));
            bv.ppxfxbqfkf.zoijcleaow zoijcleaowVar = new bv.ppxfxbqfkf.zoijcleaow(str, bv.ppxfxbqfkf.iobyxmoadg.PICKUP);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                bv.ppxfxbqfkf ppxfxbqfkfVar = this.f34430eablkybsjg;
                wkgbmnqykcVar.f34452zdlpuopuiu = this;
                wkgbmnqykcVar.f34451yggfygwlhe = pickUp2;
                wkgbmnqykcVar.f34448cqumvgiudr = 1;
                if (ppxfxbqfkfVar.zoijcleaow(zoijcleaowVar, wkgbmnqykcVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
                pickUp = pickUp2;
            } catch (Throwable th3) {
                iobyxmoadgVar = this;
                th2 = th3;
                pickUp = pickUp2;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pickUp = (UserAddress.PickUp) wkgbmnqykcVar.f34451yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f34452zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th4) {
                th2 = th4;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new fn.gxszxtbevo.zoijcleaow(pickUp.ppxfxbqfkf()));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.opjhrmiecq(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new fn.gxszxtbevo.eablkybsjg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void uwvvkdfqfp(boolean z13) {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(z13, null), 3, null);
    }

    private final void ydmasvzmpa() {
        AddressMapScreenFlow addressMapScreenFlowIobyxmoadg;
        int i13 = C0758iobyxmoadg.f34442iobyxmoadg[((State) jlmebxxoox()).getCurrentAddressType().ordinal()];
        if (i13 == 1) {
            addressMapScreenFlowIobyxmoadg = AddressMapScreenFlow.INSTANCE.iobyxmoadg();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            addressMapScreenFlowIobyxmoadg = AddressMapScreenFlow.INSTANCE.zoijcleaow();
        }
        crxdokpmqz(new fn.eablkybsjg.zoijcleaow(new AddressMapScreenArgs(addressMapScreenFlowIobyxmoadg, rm.iobyxmoadg.ADD_NEW, ((State) jlmebxxoox()).getTypeSelectionEnable())));
    }

    static /* synthetic */ void yfnezrywwk(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.uwvvkdfqfp(z13);
    }

    private final void zfvoamnweg(String str) {
        String selectedAddressId = ((State) jlmebxxoox()).getSelectedAddressId();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(selectedAddressId, str)) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(str, selectedAddressId, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(fn.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof fn.wkgbmnqykc.iobyxmoadg) {
            crxdokpmqz(fn.eablkybsjg.iobyxmoadg.f34419iobyxmoadg);
            return;
        }
        if (intent instanceof fn.wkgbmnqykc.zoijcleaow) {
            ydmasvzmpa();
            return;
        }
        if (intent instanceof fn.wkgbmnqykc.eablkybsjg) {
            metgxyhuhe(rm.zoijcleaow.Delivery);
            return;
        }
        if (intent instanceof fn.wkgbmnqykc.lqeggnwhkg) {
            metgxyhuhe(rm.zoijcleaow.PickUp);
            return;
        }
        if (intent instanceof fn.wkgbmnqykc.C0759wkgbmnqykc) {
            zfvoamnweg(((fn.wkgbmnqykc.C0759wkgbmnqykc) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof fn.wkgbmnqykc.gxszxtbevo) {
            oipsdeybqn(((fn.wkgbmnqykc.gxszxtbevo) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof fn.wkgbmnqykc.nufgyqmvbu) {
            bfopjjpdmp(((fn.wkgbmnqykc.nufgyqmvbu) intent).iobyxmoadg());
        } else if (intent instanceof fn.wkgbmnqykc.ppxfxbqfkf) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, null), 3, null);
        } else {
            if (!(intent instanceof fn.wkgbmnqykc.dxjokdxxww)) {
                throw new NoWhenBranchMatchedException();
            }
            yfnezrywwk(this, false, 1, null);
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(fn.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof fn.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        uwvvkdfqfp(true);
    }
}
