package ql0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenArgs;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow;
import ru.myspar.proloyalty.address.impl.addresslist.store.State;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vt0.ppxfxbqfkf f79109eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final vt0.wkgbmnqykc f79110ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final v01.iobyxmoadg f79111wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f79112iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f79113jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f79115zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f79113jyumaefscl = str;
            this.f79112iwizpuwonk = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f79113jyumaefscl, this.f79112iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f79115zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ql0.gxszxtbevo.eablkybsjg(true));
                    iobyxmoadg.this.ulzqkzuiru(new ql0.gxszxtbevo.ppxfxbqfkf(this.f79113jyumaefscl));
                    v01.iobyxmoadg.InterfaceC2862iobyxmoadg.C2863iobyxmoadg c2863iobyxmoadg = new v01.iobyxmoadg.InterfaceC2862iobyxmoadg.C2863iobyxmoadg(this.f79113jyumaefscl);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    v01.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f79111wkgbmnqykc;
                    this.f79115zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(c2863iobyxmoadg, this);
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
            String str = this.f79112iwizpuwonk;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.crxdokpmqz(ql0.eablkybsjg.iobyxmoadg.f79098iobyxmoadg);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ulzqkzuiru(new ql0.gxszxtbevo.ppxfxbqfkf(str));
                iobyxmoadgVar5.opjhrmiecq(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ql0.gxszxtbevo.eablkybsjg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f79116cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ UserAddress.PickUp f79117iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f79118jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f79120zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(String str, UserAddress.PickUp pickUp, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f79118jyumaefscl = str;
            this.f79117iwizpuwonk = pickUp;
            this.f79116cqumvgiudr = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(this.f79118jyumaefscl, this.f79117iwizpuwonk, this.f79116cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f79120zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ql0.gxszxtbevo.eablkybsjg(true));
                    iobyxmoadg.this.ulzqkzuiru(new ql0.gxszxtbevo.ppxfxbqfkf(this.f79118jyumaefscl));
                    v01.iobyxmoadg.InterfaceC2862iobyxmoadg.zoijcleaow zoijcleaowVar = new v01.iobyxmoadg.InterfaceC2862iobyxmoadg.zoijcleaow(this.f79117iwizpuwonk.ppxfxbqfkf());
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    v01.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f79111wkgbmnqykc;
                    this.f79120zdlpuopuiu = 1;
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
            String str = this.f79116cqumvgiudr;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.crxdokpmqz(ql0.eablkybsjg.iobyxmoadg.f79098iobyxmoadg);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ulzqkzuiru(new ql0.gxszxtbevo.ppxfxbqfkf(str));
                iobyxmoadgVar5.opjhrmiecq(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ql0.gxszxtbevo.eablkybsjg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ql0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1770iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f79121iobyxmoadg;

        static {
            int[] iArr = new int[cl0.zoijcleaow.values().length];
            try {
                iArr[cl0.zoijcleaow.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cl0.zoijcleaow.PickUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79121iobyxmoadg = iArr;
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f79123zdlpuopuiu;

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
            int i13 = this.f79123zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f79123zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(2750L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(ql0.eablkybsjg.lqeggnwhkg.f79099iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f79124jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f79126zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f79124jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f79124jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f79126zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ql0.gxszxtbevo.eablkybsjg(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    vt0.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar.f79110ppxfxbqfkf;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f79126zdlpuopuiu = 1;
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
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ru.myspar.proloyalty.components.address.api.model.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                ru.myspar.proloyalty.components.address.api.model.iobyxmoadg iobyxmoadgVar5 = (ru.myspar.proloyalty.components.address.api.model.iobyxmoadg) objWkgbmnqykc;
                iobyxmoadgVar4.ulzqkzuiru(new ql0.gxszxtbevo.wkgbmnqykc(iobyxmoadgVar5.ppxfxbqfkf(), iobyxmoadgVar5.wkgbmnqykc()));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar4.opjhrmiecq(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ql0.gxszxtbevo.eablkybsjg(false));
            if (this.f79124jyumaefscl) {
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
        int f79127cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f79129jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f79130yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f79131zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f79129jyumaefscl = obj;
            this.f79127cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.sflfametgt(null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ql0.wkgbmnqykc f79132jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f79134zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ql0.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f79132jyumaefscl = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f79132jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f79134zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((ql0.wkgbmnqykc.ppxfxbqfkf) this.f79132jyumaefscl).iobyxmoadg();
                this.f79134zdlpuopuiu = 1;
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
    public iobyxmoadg(vt0.wkgbmnqykc fetchAddressesUseCase, v01.iobyxmoadg changeCartAddressUseCase, vt0.ppxfxbqfkf deleteAddressUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fetchAddressesUseCase, "fetchAddressesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartAddressUseCase, "changeCartAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteAddressUseCase, "deleteAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f79110ppxfxbqfkf = fetchAddressesUseCase;
        this.f79111wkgbmnqykc = changeCartAddressUseCase;
        this.f79109eablkybsjg = deleteAddressUseCase;
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
        crxdokpmqz(ql0.eablkybsjg.gxszxtbevo.f79097iobyxmoadg);
        State state = (State) jlmebxxoox();
        if (state.getTypeSelectionEnable() || state.getCurrentAddressType() != cl0.zoijcleaow.PickUp) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(null), 3, null);
    }

    private final void metgxyhuhe(cl0.zoijcleaow zoijcleaowVar) {
        if (!((State) jlmebxxoox()).getTypeSelectionEnable() || ((State) jlmebxxoox()).getCurrentAddressType() == zoijcleaowVar) {
            return;
        }
        ulzqkzuiru(new ql0.gxszxtbevo.iobyxmoadg(zoijcleaowVar));
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
        crxdokpmqz(new ql0.eablkybsjg.ppxfxbqfkf(delivery));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void opjhrmiecq(Throwable th2) {
        crxdokpmqz(new ql0.eablkybsjg.wkgbmnqykc(th2));
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
            int i13 = wkgbmnqykcVar.f79127cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f79127cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f79129jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f79127cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, ((State) jlmebxxoox()).getSelectedAddressId())) {
                crxdokpmqz(ql0.eablkybsjg.C1769eablkybsjg.f79096iobyxmoadg);
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
            ulzqkzuiru(new ql0.gxszxtbevo.eablkybsjg(true));
            vt0.ppxfxbqfkf.zoijcleaow zoijcleaowVar = new vt0.ppxfxbqfkf.zoijcleaow(str, vt0.ppxfxbqfkf.iobyxmoadg.PICKUP);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                vt0.ppxfxbqfkf ppxfxbqfkfVar = this.f79109eablkybsjg;
                wkgbmnqykcVar.f79131zdlpuopuiu = this;
                wkgbmnqykcVar.f79130yggfygwlhe = pickUp2;
                wkgbmnqykcVar.f79127cqumvgiudr = 1;
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
            pickUp = (UserAddress.PickUp) wkgbmnqykcVar.f79130yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f79131zdlpuopuiu;
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
            iobyxmoadgVar.ulzqkzuiru(new ql0.gxszxtbevo.zoijcleaow(pickUp.ppxfxbqfkf()));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.opjhrmiecq(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ql0.gxszxtbevo.eablkybsjg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void uwvvkdfqfp(boolean z13) {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(z13, null), 3, null);
    }

    private final void ydmasvzmpa() {
        AddressMapScreenFlow addressMapScreenFlowIobyxmoadg;
        int i13 = C1770iobyxmoadg.f79121iobyxmoadg[((State) jlmebxxoox()).getCurrentAddressType().ordinal()];
        if (i13 == 1) {
            addressMapScreenFlowIobyxmoadg = AddressMapScreenFlow.INSTANCE.iobyxmoadg();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            addressMapScreenFlowIobyxmoadg = AddressMapScreenFlow.INSTANCE.zoijcleaow();
        }
        crxdokpmqz(new ql0.eablkybsjg.zoijcleaow(new AddressMapScreenArgs(addressMapScreenFlowIobyxmoadg, cl0.iobyxmoadg.ADD_NEW, ((State) jlmebxxoox()).getTypeSelectionEnable())));
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
    public void zynmafqrjb(ql0.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ql0.wkgbmnqykc.iobyxmoadg) {
            crxdokpmqz(ql0.eablkybsjg.iobyxmoadg.f79098iobyxmoadg);
            return;
        }
        if (intent instanceof ql0.wkgbmnqykc.zoijcleaow) {
            ydmasvzmpa();
            return;
        }
        if (intent instanceof ql0.wkgbmnqykc.eablkybsjg) {
            metgxyhuhe(cl0.zoijcleaow.Delivery);
            return;
        }
        if (intent instanceof ql0.wkgbmnqykc.lqeggnwhkg) {
            metgxyhuhe(cl0.zoijcleaow.PickUp);
            return;
        }
        if (intent instanceof ql0.wkgbmnqykc.C1771wkgbmnqykc) {
            zfvoamnweg(((ql0.wkgbmnqykc.C1771wkgbmnqykc) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof ql0.wkgbmnqykc.gxszxtbevo) {
            oipsdeybqn(((ql0.wkgbmnqykc.gxszxtbevo) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof ql0.wkgbmnqykc.nufgyqmvbu) {
            bfopjjpdmp(((ql0.wkgbmnqykc.nufgyqmvbu) intent).iobyxmoadg());
        } else if (intent instanceof ql0.wkgbmnqykc.ppxfxbqfkf) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, null), 3, null);
        } else {
            if (!(intent instanceof ql0.wkgbmnqykc.dxjokdxxww)) {
                throw new NoWhenBranchMatchedException();
            }
            yfnezrywwk(this, false, 1, null);
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ql0.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof ql0.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        uwvvkdfqfp(true);
    }
}
