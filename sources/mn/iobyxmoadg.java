package mn;

import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.ageimvtcrz;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.ikoacuggdj;
import ru.myspar.address.api.model.AddressMapScreenFlow;
import ru.myspar.address.impl.map.domain.State;
import ru.myspar.address.impl.map.domain.models.AddressMapShop;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.cart.Cart;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f67547btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final List f67548draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final bv.zoijcleaow f67549dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final kv.iobyxmoadg f67550eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private auzgnhcxok f67551gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final kv.ppxfxbqfkf f67552gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final l30.iobyxmoadg f67553lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final n20.iobyxmoadg f67554nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final at.iobyxmoadg f67555ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final j42.zoijcleaow f67556wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f67558zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new agtfadlqog(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67558zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            this.f67558zdlpuopuiu = 1;
            obj = iobyxmoadgVar.nuxfzjnpeb(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            if (!((Boolean) obj).booleanValue()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            iobyxmoadg.this.f67547btonecajqb = true;
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
            this.f67558zdlpuopuiu = 2;
            if (iobyxmoadgVar2.uawqvzlxes(true, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f67560zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new btonecajqb(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f67560zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(mn.eablkybsjg.dxjokdxxww.f67526iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f67562zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new draadjrbmk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67562zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f67562zdlpuopuiu = 1;
                if (iobyxmoadgVar.uawqvzlxes(false, this) == objGxszxtbevo) {
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
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f67563cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f67565jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f67566yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67567zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67565jyumaefscl = obj;
            this.f67563cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.fiwbwshyhd(this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f67569esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f67570iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f67571jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f67572yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67573zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67570iwizpuwonk = obj;
            this.f67569esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uawqvzlxes(false, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f67575zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gtknphoqwx(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67575zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f67575zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(2750L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(mn.eablkybsjg.btonecajqb.f67525iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f67576cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f67578iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f67579jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f67580lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f67581yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67582zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67576cqumvgiudr = obj;
            this.f67580lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.auzgnhcxok(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mn.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1400iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f67583iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f67584zoijcleaow;

        static {
            int[] iArr = new int[rm.iobyxmoadg.values().length];
            try {
                iArr[rm.iobyxmoadg.CREATE_FIRST_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rm.iobyxmoadg.ADD_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rm.iobyxmoadg.EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67583iobyxmoadg = iArr;
            int[] iArr2 = new int[rm.zoijcleaow.values().length];
            try {
                iArr2[rm.zoijcleaow.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[rm.zoijcleaow.PickUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f67584zoijcleaow = iArr2;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f67585cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f67587jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f67588yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67589zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67587jyumaefscl = obj;
            this.f67585cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.skhdrjzrfn(null, null, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ LocationData f67590jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f67592zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f67590jyumaefscl = locationData;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new nufgyqmvbu(this.f67590jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67592zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                LocationData locationData = this.f67590jyumaefscl;
                this.f67592zdlpuopuiu = 1;
                if (iobyxmoadgVar.e(locationData, false, this) == objGxszxtbevo) {
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
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f67594yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67595zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ojitshcjhn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            AddressMapScreenFlow.Delivery deliveryFlow;
            AddressMapScreenFlow.Delivery delivery;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67594yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                State stateOpjhrmiecq = iobyxmoadg.opjhrmiecq(iobyxmoadg.this);
                deliveryFlow = stateOpjhrmiecq.getDeliveryFlow();
                if (stateOpjhrmiecq.getCurrentFlow() instanceof AddressMapScreenFlow.PickUp) {
                    iobyxmoadg.this.ulzqkzuiru(new mn.gxszxtbevo.zoijcleaow(deliveryFlow));
                }
                LocationData location = deliveryFlow.getLocation();
                LocationData userLocation = stateOpjhrmiecq.getUserLocation();
                if (location == null && userLocation != null) {
                    iobyxmoadg.this.b();
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    this.f67595zdlpuopuiu = deliveryFlow;
                    this.f67594yggfygwlhe = 1;
                    obj = iobyxmoadg.iwxlajgraz(iobyxmoadgVar, deliveryFlow, userLocation, null, this, 4, null);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    delivery = deliveryFlow;
                    deliveryFlow = (AddressMapScreenFlow.Delivery) obj;
                } else if (location == null) {
                    iobyxmoadg.this.b();
                    iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                    LocationData locationDataIobyxmoadg = rm.ppxfxbqfkf.iobyxmoadg();
                    this.f67595zdlpuopuiu = deliveryFlow;
                    this.f67594yggfygwlhe = 2;
                    obj = iobyxmoadg.iwxlajgraz(iobyxmoadgVar2, deliveryFlow, locationDataIobyxmoadg, null, this, 4, null);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    delivery = deliveryFlow;
                    deliveryFlow = (AddressMapScreenFlow.Delivery) obj;
                } else {
                    delivery = deliveryFlow;
                }
            } else if (i13 == 1) {
                delivery = (AddressMapScreenFlow.Delivery) this.f67595zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                deliveryFlow = (AddressMapScreenFlow.Delivery) obj;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                delivery = (AddressMapScreenFlow.Delivery) this.f67595zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                deliveryFlow = (AddressMapScreenFlow.Delivery) obj;
            }
            iobyxmoadg.this.wizcaqwiak();
            iobyxmoadg.this.ulzqkzuiru(new mn.gxszxtbevo.zoijcleaow(deliveryFlow));
            LocationData location2 = deliveryFlow.getLocation();
            if (location2 != null) {
                iobyxmoadg.this.lrnfpwlwnk(location2, kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(delivery.cdpycssgdh()));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f67596cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f67598jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f67599yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67600zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67598jyumaefscl = obj;
            this.f67596cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.e(null, false, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f67601jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f67603zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67603zdlpuopuiu = obj;
            this.f67601jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.nuxfzjnpeb(this);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f67605yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67606zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new rgvfuqvkyq(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            AddressMapScreenFlow.PickUp pickUpFlow;
            AddressMapScreenFlow.PickUp pickUp;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67605yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.b();
                State stateOpjhrmiecq = iobyxmoadg.opjhrmiecq(iobyxmoadg.this);
                pickUpFlow = stateOpjhrmiecq.getPickUpFlow();
                if (iobyxmoadg.this.ageimvtcrz()) {
                    iobyxmoadg.this.ulzqkzuiru(new mn.gxszxtbevo.zoijcleaow(pickUpFlow));
                }
                LocationData userLocation = stateOpjhrmiecq.getUserLocation();
                LocationData location = pickUpFlow.getLocation();
                if (location == null && userLocation != null) {
                    iobyxmoadg.this.c();
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    this.f67606zdlpuopuiu = pickUpFlow;
                    this.f67605yggfygwlhe = 1;
                    obj = iobyxmoadgVar.skhdrjzrfn(pickUpFlow, userLocation, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    pickUp = pickUpFlow;
                    pickUpFlow = (AddressMapScreenFlow.PickUp) obj;
                } else if (location == null) {
                    iobyxmoadg.this.c();
                    iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                    LocationData locationDataIobyxmoadg = rm.ppxfxbqfkf.iobyxmoadg();
                    this.f67606zdlpuopuiu = pickUpFlow;
                    this.f67605yggfygwlhe = 2;
                    obj = iobyxmoadgVar2.skhdrjzrfn(pickUpFlow, locationDataIobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    pickUp = pickUpFlow;
                    pickUpFlow = (AddressMapScreenFlow.PickUp) obj;
                } else {
                    pickUp = pickUpFlow;
                }
            } else if (i13 == 1) {
                pickUp = (AddressMapScreenFlow.PickUp) this.f67606zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                pickUpFlow = (AddressMapScreenFlow.PickUp) obj;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pickUp = (AddressMapScreenFlow.PickUp) this.f67606zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                pickUpFlow = (AddressMapScreenFlow.PickUp) obj;
            }
            iobyxmoadg.this.hszhottldk();
            iobyxmoadg.this.wizcaqwiak();
            iobyxmoadg.this.ulzqkzuiru(new mn.gxszxtbevo.zoijcleaow(pickUpFlow));
            LocationData location2 = pickUpFlow.getLocation();
            if (location2 != null) {
                iobyxmoadg.this.lrnfpwlwnk(location2, kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(pickUp.cdpycssgdh()));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ LocationData f67607jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f67609zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        vdvldrhtss(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f67607jyumaefscl = locationData;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new vdvldrhtss(this.f67607jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67609zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                LocationData locationData = this.f67607jyumaefscl;
                this.f67609zdlpuopuiu = 1;
                if (iobyxmoadg.f(iobyxmoadgVar, locationData, false, this, 2, null) == objGxszxtbevo) {
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
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f67610cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f67612jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f67613yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67614zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f67610cqumvgiudr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wflxmlrfwp(this.f67610cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007d  */
        /* JADX WARN: Code duplicated, block: B:31:0x008b  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            iobyxmoadg iobyxmoadgVar2;
            String str;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67612jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        iobyxmoadgVar2 = (iobyxmoadg) this.f67613yggfygwlhe;
                        str = (String) this.f67614zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Cart) obj);
                    iobyxmoadgVar = iobyxmoadg.this;
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        iobyxmoadgVar.crxdokpmqz(mn.eablkybsjg.iobyxmoadg.f67529iobyxmoadg);
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.crxdokpmqz(new mn.eablkybsjg.lqeggnwhkg(thDxjokdxxww));
                    }
                    iobyxmoadg.this.hszhottldk();
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.c();
                String str2 = this.f67610cqumvgiudr;
                iobyxmoadgVar2 = iobyxmoadg.this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                bv.zoijcleaow.iobyxmoadg iobyxmoadgVar4 = new bv.zoijcleaow.iobyxmoadg(str2);
                bv.zoijcleaow zoijcleaowVar = iobyxmoadgVar2.f67549dxjokdxxww;
                this.f67614zdlpuopuiu = str2;
                this.f67613yggfygwlhe = iobyxmoadgVar2;
                this.f67612jyumaefscl = 1;
                if (zoijcleaowVar.zoijcleaow(iobyxmoadgVar4, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str = str2;
                n20.iobyxmoadg.InterfaceC1474iobyxmoadg.zoijcleaow zoijcleaowVar2 = new n20.iobyxmoadg.InterfaceC1474iobyxmoadg.zoijcleaow(str);
                n20.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar2.f67554nufgyqmvbu;
                this.f67614zdlpuopuiu = null;
                this.f67613yggfygwlhe = null;
                this.f67612jyumaefscl = 2;
                obj = iobyxmoadgVar5.zoijcleaow(zoijcleaowVar2, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Cart) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadgVar = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar.crxdokpmqz(mn.eablkybsjg.iobyxmoadg.f67529iobyxmoadg);
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.crxdokpmqz(new mn.eablkybsjg.lqeggnwhkg(thDxjokdxxww));
            }
            iobyxmoadg.this.hszhottldk();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f67616zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f67616zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f67616zdlpuopuiu = 1;
                if (iobyxmoadgVar.fiwbwshyhd(this) == objGxszxtbevo) {
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f67617cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f67619jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f67620yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f67621zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f67619jyumaefscl = obj;
            this.f67617cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.weqkydbzbr(null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, at.iobyxmoadg permissionManager, j42.zoijcleaow locationProvider, kv.iobyxmoadg getAddressByLocationUseCase, kv.ppxfxbqfkf getShopsByLocationUseCase, l30.iobyxmoadg distanceCalculator, n20.iobyxmoadg changeCartAddressUseCase, bv.zoijcleaow createPickUpAddressUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(locationProvider, "locationProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getAddressByLocationUseCase, "getAddressByLocationUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getShopsByLocationUseCase, "getShopsByLocationUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(distanceCalculator, "distanceCalculator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartAddressUseCase, "changeCartAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createPickUpAddressUseCase, "createPickUpAddressUseCase");
        this.f67555ppxfxbqfkf = permissionManager;
        this.f67556wkgbmnqykc = locationProvider;
        this.f67550eablkybsjg = getAddressByLocationUseCase;
        this.f67552gxszxtbevo = getShopsByLocationUseCase;
        this.f67553lqeggnwhkg = distanceCalculator;
        this.f67554nufgyqmvbu = changeCartAddressUseCase;
        this.f67549dxjokdxxww = createPickUpAddressUseCase;
        this.f67548draadjrbmk = hg.agtfadlqog.i(locationProvider.zoijcleaow());
    }

    private final void a() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new rgvfuqvkyq(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ageimvtcrz() {
        return ((State) jlmebxxoox()).getCurrentFlow() instanceof AddressMapScreenFlow.Delivery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object auzgnhcxok(AddressMapScreenFlow.Delivery delivery, LocationData locationData, tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar2;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f67580lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f67580lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f67576cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f67580lereixgezr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            kv.iobyxmoadg.C1217iobyxmoadg c1217iobyxmoadg = new kv.iobyxmoadg.C1217iobyxmoadg(locationData);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                kv.iobyxmoadg iobyxmoadgVar4 = this.f67550eablkybsjg;
                gxszxtbevoVar2.f67582zdlpuopuiu = this;
                gxszxtbevoVar2.f67581yggfygwlhe = delivery;
                gxszxtbevoVar2.f67579jyumaefscl = locationData;
                gxszxtbevoVar2.f67578iwizpuwonk = iobyxmoadgVar;
                gxszxtbevoVar2.f67580lereixgezr = 1;
                objZoijcleaow = iobyxmoadgVar4.zoijcleaow(c1217iobyxmoadg, gxszxtbevoVar2);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar2 = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (tg.iobyxmoadg) gxszxtbevoVar2.f67578iwizpuwonk;
            locationData = (LocationData) gxszxtbevoVar2.f67579jyumaefscl;
            delivery = (AddressMapScreenFlow.Delivery) gxszxtbevoVar2.f67581yggfygwlhe;
            iobyxmoadgVar2 = (iobyxmoadg) gxszxtbevoVar2.f67582zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((iv.iobyxmoadg) objZoijcleaow);
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar2.crxdokpmqz(new mn.eablkybsjg.lqeggnwhkg(thDxjokdxxww));
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        iv.iobyxmoadg iobyxmoadgVar7 = (iv.iobyxmoadg) objWkgbmnqykc;
        if (iobyxmoadgVar7 instanceof iv.iobyxmoadg.C1053iobyxmoadg) {
            return delivery.zoijcleaow(((iv.iobyxmoadg.C1053iobyxmoadg) iobyxmoadgVar7).iobyxmoadg(), k30.draadjrbmk.ppxfxbqfkf(), locationData, false);
        }
        if (iobyxmoadgVar7 instanceof iv.iobyxmoadg.zoijcleaow) {
            iv.iobyxmoadg.zoijcleaow zoijcleaowVar = (iv.iobyxmoadg.zoijcleaow) iobyxmoadgVar7;
            return delivery.zoijcleaow(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow(), true);
        }
        if (iobyxmoadgVar7 == null) {
            return delivery;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        ulzqkzuiru(new mn.gxszxtbevo.iobyxmoadg(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        ulzqkzuiru(new mn.gxszxtbevo.ppxfxbqfkf(true));
    }

    private final void d(LocationData locationData) {
        auzgnhcxok auzgnhcxokVar = this.f67551gtknphoqwx;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f67551gtknphoqwx = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new vdvldrhtss(locationData, null), 3, null);
    }

    private final iv.zoijcleaow dvvnrvtcbc(iv.ppxfxbqfkf ppxfxbqfkfVar) {
        Object next;
        Iterator it = ppxfxbqfkfVar.zoijcleaow().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((iv.zoijcleaow) next).zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg())) {
                return (iv.zoijcleaow) next;
            }
        }
        next = null;
        return (iv.zoijcleaow) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(LocationData locationData, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        oxmwwwfdhm oxmwwwfdhmVar;
        iobyxmoadg iobyxmoadgVar;
        LocationData location;
        if (gxszxtbevoVar instanceof oxmwwwfdhm) {
            oxmwwwfdhmVar = (oxmwwwfdhm) gxszxtbevoVar;
            int i13 = oxmwwwfdhmVar.f67596cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oxmwwwfdhmVar.f67596cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            }
        } else {
            oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
        }
        oxmwwwfdhm oxmwwwfdhmVar2 = oxmwwwfdhmVar;
        Object objIwxlajgraz = oxmwwwfdhmVar2.f67598jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = oxmwwwfdhmVar2.f67596cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                locationData = (LocationData) oxmwwwfdhmVar2.f67599yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) oxmwwwfdhmVar2.f67600zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIwxlajgraz);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                locationData = (LocationData) oxmwwwfdhmVar2.f67599yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) oxmwwwfdhmVar2.f67600zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIwxlajgraz);
            }
            iobyxmoadgVar.ulzqkzuiru(new mn.gxszxtbevo.zoijcleaow((AddressMapScreenFlow.Delivery) objIwxlajgraz));
            iobyxmoadgVar.wizcaqwiak();
            zeieaojujs(iobyxmoadgVar, locationData, null, 2, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objIwxlajgraz);
        if (z13) {
            oxmwwwfdhmVar2.f67600zdlpuopuiu = this;
            oxmwwwfdhmVar2.f67599yggfygwlhe = locationData;
            oxmwwwfdhmVar2.f67596cqumvgiudr = 1;
            if (crxdokpmqz.zoijcleaow(300L, oxmwwwfdhmVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        iobyxmoadgVar = this;
        AddressMapScreenFlow currentFlow = ((State) iobyxmoadgVar.jlmebxxoox()).getCurrentFlow();
        AddressMapScreenFlow.Delivery delivery = currentFlow instanceof AddressMapScreenFlow.Delivery ? (AddressMapScreenFlow.Delivery) currentFlow : null;
        if (delivery == null || (location = delivery.getLocation()) == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (mj.kcexrzcfyt.zfvoamnweg(delivery.getFullAddress()) || (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(location, locationData) && !iobyxmoadgVar.fyldjkxazc(locationData, location))) {
            iobyxmoadgVar.b();
            oxmwwwfdhmVar2.f67600zdlpuopuiu = iobyxmoadgVar;
            oxmwwwfdhmVar2.f67599yggfygwlhe = locationData;
            oxmwwwfdhmVar2.f67596cqumvgiudr = 2;
            objIwxlajgraz = iwxlajgraz(iobyxmoadgVar, delivery, locationData, null, oxmwwwfdhmVar2, 4, null);
            if (objIwxlajgraz == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar.ulzqkzuiru(new mn.gxszxtbevo.zoijcleaow((AddressMapScreenFlow.Delivery) objIwxlajgraz));
            iobyxmoadgVar.wizcaqwiak();
            zeieaojujs(iobyxmoadgVar, locationData, null, 2, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void eslsurpljm() {
        if (ageimvtcrz()) {
            ms.iobyxmoadg.iobyxmoadg(this.f67551gtknphoqwx);
        }
    }

    private final void ezmngbhpjk(String str, String str2, LocationData locationData) {
        AddressMapScreenFlow currentFlow = ((State) jlmebxxoox()).getCurrentFlow();
        AddressMapScreenFlow.PickUp pickUp = currentFlow instanceof AddressMapScreenFlow.PickUp ? (AddressMapScreenFlow.PickUp) currentFlow : null;
        if (pickUp == null) {
            return;
        }
        ulzqkzuiru(new mn.gxszxtbevo.zoijcleaow(pickUp.zoijcleaow(str, str2, locationData)));
        lrnfpwlwnk(locationData, Float.valueOf(pickUp.cdpycssgdh()));
    }

    static /* synthetic */ Object f(iobyxmoadg iobyxmoadgVar, LocationData locationData, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return iobyxmoadgVar.e(locationData, z13, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fiwbwshyhd(lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        iobyxmoadg iobyxmoadgVar;
        boolean zBooleanValue;
        int i13;
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        iobyxmoadg iobyxmoadgVar2;
        AddressMapScreenFlow currentFlow;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i14 = dxjokdxxwwVar.f67563cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f67563cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objNuxfzjnpeb = dxjokdxxwwVar.f67565jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = dxjokdxxwwVar.f67563cqumvgiudr;
        if (i15 != 0) {
            if (i15 == 1) {
                iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) dxjokdxxwwVar.f67567zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objNuxfzjnpeb);
                iobyxmoadgVar = iobyxmoadgVar3;
            } else {
                if (i15 == 2) {
                    zBooleanValue = dxjokdxxwwVar.f67566yggfygwlhe;
                    iobyxmoadgVar = (iobyxmoadg) dxjokdxxwwVar.f67567zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objNuxfzjnpeb);
                    if ((((State) iobyxmoadgVar.jlmebxxoox()).getCurrentFlow() instanceof AddressMapScreenFlow.PickUp) && !((State) iobyxmoadgVar.jlmebxxoox()).getIsAddressTypeSelectionEnabled()) {
                        pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new gtknphoqwx(null), 3, null);
                    }
                    i13 = C1400iobyxmoadg.f67583iobyxmoadg[((State) iobyxmoadgVar.jlmebxxoox()).getMode().ordinal()];
                    if (i13 != 1 || i13 == 2) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
                    } else {
                        if (i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                    }
                    boolean zBooleanValue2 = ((Boolean) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).booleanValue();
                    iobyxmoadgVar.f67547btonecajqb = ((Boolean) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).booleanValue();
                    if (!zBooleanValue && zBooleanValue2) {
                        dxjokdxxwwVar.f67567zdlpuopuiu = iobyxmoadgVar;
                        dxjokdxxwwVar.f67563cqumvgiudr = 3;
                        if (iobyxmoadgVar.uawqvzlxes(true, dxjokdxxwwVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar2 = iobyxmoadgVar;
                    } else if (zBooleanValue) {
                        pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new draadjrbmk(null), 3, null);
                    }
                    currentFlow = ((State) iobyxmoadgVar.jlmebxxoox()).getCurrentFlow();
                    if (currentFlow instanceof AddressMapScreenFlow.Delivery) {
                        iobyxmoadgVar.krqnebusok();
                    } else {
                        if (!(currentFlow instanceof AddressMapScreenFlow.PickUp)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iobyxmoadgVar.a();
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (iobyxmoadg) dxjokdxxwwVar.f67567zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objNuxfzjnpeb);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            currentFlow = ((State) iobyxmoadgVar.jlmebxxoox()).getCurrentFlow();
            if (currentFlow instanceof AddressMapScreenFlow.Delivery) {
                iobyxmoadgVar.krqnebusok();
            } else {
                if (!(currentFlow instanceof AddressMapScreenFlow.PickUp)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadgVar.a();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objNuxfzjnpeb);
        dxjokdxxwwVar.f67567zdlpuopuiu = this;
        dxjokdxxwwVar.f67563cqumvgiudr = 1;
        objNuxfzjnpeb = nuxfzjnpeb(dxjokdxxwwVar);
        if (objNuxfzjnpeb == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        zBooleanValue = ((Boolean) objNuxfzjnpeb).booleanValue();
        if (((State) iobyxmoadgVar.jlmebxxoox()).getMode() == rm.iobyxmoadg.CREATE_FIRST_ADDRESS) {
            ageimvtcrz ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
            btonecajqb btonecajqbVar = iobyxmoadgVar.new btonecajqb(null);
            dxjokdxxwwVar.f67567zdlpuopuiu = iobyxmoadgVar;
            dxjokdxxwwVar.f67566yggfygwlhe = zBooleanValue;
            dxjokdxxwwVar.f67563cqumvgiudr = 2;
            if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, btonecajqbVar, dxjokdxxwwVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            if (((State) iobyxmoadgVar.jlmebxxoox()).getCurrentFlow() instanceof AddressMapScreenFlow.PickUp) {
                pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new gtknphoqwx(null), 3, null);
            }
            i13 = C1400iobyxmoadg.f67583iobyxmoadg[((State) iobyxmoadgVar.jlmebxxoox()).getMode().ordinal()];
            if (i13 != 1) {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
            } else {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
            }
            boolean zBooleanValue3 = ((Boolean) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).booleanValue();
            iobyxmoadgVar.f67547btonecajqb = ((Boolean) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).booleanValue();
            if (!zBooleanValue) {
            }
            if (zBooleanValue) {
                pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new draadjrbmk(null), 3, null);
            }
        } else {
            i13 = C1400iobyxmoadg.f67583iobyxmoadg[((State) iobyxmoadgVar.jlmebxxoox()).getMode().ordinal()];
            if (i13 != 1) {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
            } else {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
            }
            boolean zBooleanValue4 = ((Boolean) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).booleanValue();
            iobyxmoadgVar.f67547btonecajqb = ((Boolean) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).booleanValue();
            if (!zBooleanValue) {
            }
            if (zBooleanValue) {
                pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new draadjrbmk(null), 3, null);
            }
        }
        currentFlow = ((State) iobyxmoadgVar.jlmebxxoox()).getCurrentFlow();
        if (currentFlow instanceof AddressMapScreenFlow.Delivery) {
            iobyxmoadgVar.krqnebusok();
        } else {
            if (!(currentFlow instanceof AddressMapScreenFlow.PickUp)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar.a();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void fmlbqenlif(AddressMapScreenFlow.Delivery delivery, rm.iobyxmoadg iobyxmoadgVar) {
        String strWkgbmnqykc;
        Object wkgbmnqykcVar;
        LocationData location = delivery.getLocation();
        if (location == null || (strWkgbmnqykc = k30.draadjrbmk.wkgbmnqykc(delivery.getShortAddress())) == null) {
            return;
        }
        String fullAddress = delivery.getFullAddress();
        int i13 = C1400iobyxmoadg.f67583iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            wkgbmnqykcVar = new mn.eablkybsjg.wkgbmnqykc(strWkgbmnqykc, fullAddress, location);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            wkgbmnqykcVar = new mn.eablkybsjg.ppxfxbqfkf(strWkgbmnqykc, fullAddress, location);
        }
        crxdokpmqz(wkgbmnqykcVar);
    }

    private final boolean fyldjkxazc(LocationData locationData, LocationData locationData2) {
        return ((a10.iobyxmoadg) this.f67553lqeggnwhkg.iobyxmoadg(locationData, locationData2)).iobyxmoadg().doubleValue() <= 10.0d;
    }

    private final void grlcpdaxtj() {
        Object gxszxtbevoVar;
        State state = (State) jlmebxxoox();
        AddressMapScreenFlow currentFlow = state.getCurrentFlow();
        if (currentFlow instanceof AddressMapScreenFlow.Delivery) {
            LocationData userLocation = state.getUserLocation();
            if (userLocation == null) {
                userLocation = rm.ppxfxbqfkf.iobyxmoadg();
            }
            gxszxtbevoVar = new mn.eablkybsjg.C1398eablkybsjg(userLocation);
        } else {
            if (!(currentFlow instanceof AddressMapScreenFlow.PickUp)) {
                throw new NoWhenBranchMatchedException();
            }
            LocationData userLocation2 = state.getUserLocation();
            if (userLocation2 == null) {
                userLocation2 = rm.ppxfxbqfkf.iobyxmoadg();
            }
            gxszxtbevoVar = new mn.eablkybsjg.gxszxtbevo(userLocation2);
        }
        crxdokpmqz(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hszhottldk() {
        ulzqkzuiru(new mn.gxszxtbevo.ppxfxbqfkf(false));
    }

    private final void igdgnonuha(LocationData locationData) {
        AddressMapScreenFlow currentFlow = ((State) jlmebxxoox()).getCurrentFlow();
        AddressMapScreenFlow.Delivery delivery = currentFlow instanceof AddressMapScreenFlow.Delivery ? (AddressMapScreenFlow.Delivery) currentFlow : null;
        if (delivery == null) {
            return;
        }
        lrnfpwlwnk(locationData, Float.valueOf(delivery.cdpycssgdh()));
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(locationData, null), 3, null);
    }

    private final List ipoelvxyzq(iv.ppxfxbqfkf ppxfxbqfkfVar) {
        List<iv.zoijcleaow> listZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        for (iv.zoijcleaow zoijcleaowVar : listZoijcleaow) {
            arrayList.add(new AddressMapShop(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg()));
        }
        return arrayList;
    }

    static /* synthetic */ Object iwxlajgraz(iobyxmoadg iobyxmoadgVar, AddressMapScreenFlow.Delivery delivery, LocationData locationData, tg.iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            iobyxmoadgVar2 = null;
        }
        return iobyxmoadgVar.auzgnhcxok(delivery, locationData, iobyxmoadgVar2, gxszxtbevoVar);
    }

    private final void ixidwrxhsl(rm.zoijcleaow zoijcleaowVar) {
        int i13 = C1400iobyxmoadg.f67584zoijcleaow[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            krqnebusok();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a();
        }
    }

    private final void jrbgnlbqoe(float f13, boolean z13) {
        ulzqkzuiru(new mn.gxszxtbevo.eablkybsjg(zg.gtknphoqwx.wflxmlrfwp(z13 ? f13 + 1.0f : f13 - 1.0f, 1.0f, 21.0f)));
    }

    private final void krqnebusok() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lrnfpwlwnk(LocationData locationData, Float f13) {
        ulzqkzuiru(new mn.gxszxtbevo.wkgbmnqykc(locationData, f13));
    }

    private final void lxfrhoxuzk(String str, String str2, LocationData locationData) {
        AddressMapScreenFlow currentFlow = ((State) jlmebxxoox()).getCurrentFlow();
        AddressMapScreenFlow.PickUp pickUp = currentFlow instanceof AddressMapScreenFlow.PickUp ? (AddressMapScreenFlow.PickUp) currentFlow : null;
        if (pickUp == null) {
            return;
        }
        ulzqkzuiru(new mn.gxszxtbevo.zoijcleaow(pickUp.zoijcleaow(str, str2, locationData)));
        lrnfpwlwnk(locationData, Float.valueOf(pickUp.cdpycssgdh()));
    }

    private final void mhtqkkgtqm() {
        State state = (State) jlmebxxoox();
        AddressMapScreenFlow currentFlow = state.getCurrentFlow();
        if (currentFlow instanceof AddressMapScreenFlow.Delivery) {
            fmlbqenlif((AddressMapScreenFlow.Delivery) currentFlow, state.getMode());
        } else {
            if (!(currentFlow instanceof AddressMapScreenFlow.PickUp)) {
                throw new NoWhenBranchMatchedException();
            }
            rhgxfdycjh((AddressMapScreenFlow.PickUp) currentFlow, state.getMode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object nuxfzjnpeb(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f67601jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f67601jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f67603zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f67601jyumaefscl;
        boolean z13 = true;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            at.iobyxmoadg iobyxmoadgVar = this.f67555ppxfxbqfkf;
            String name = iobyxmoadg.class.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            List list = this.f67548draadjrbmk;
            ppxfxbqfkfVar.f67601jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(name, list, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        at.ppxfxbqfkf ppxfxbqfkfVar2 = (at.ppxfxbqfkf) objPpxfxbqfkf;
        if (!(ppxfxbqfkfVar2 instanceof at.ppxfxbqfkf.zoijcleaow)) {
            if (!(ppxfxbqfkfVar2 instanceof at.ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            z13 = false;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }

    public static final /* synthetic */ State opjhrmiecq(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    private final void rhgxfdycjh(AddressMapScreenFlow.PickUp pickUp, rm.iobyxmoadg iobyxmoadgVar) {
        String strWkgbmnqykc;
        if (iobyxmoadgVar == rm.iobyxmoadg.EDIT || (strWkgbmnqykc = k30.draadjrbmk.wkgbmnqykc(pickUp.getShopId())) == null || pickUp.getLocation() == null) {
            return;
        }
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(strWkgbmnqykc, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object skhdrjzrfn(AddressMapScreenFlow.PickUp pickUp, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f67585cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f67585cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objZoijcleaow = lqeggnwhkgVar.f67587jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f67585cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            kv.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new kv.ppxfxbqfkf.iobyxmoadg(locationData);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                kv.ppxfxbqfkf ppxfxbqfkfVar = this.f67552gxszxtbevo;
                lqeggnwhkgVar.f67589zdlpuopuiu = this;
                lqeggnwhkgVar.f67588yggfygwlhe = pickUp;
                lqeggnwhkgVar.f67585cqumvgiudr = 1;
                objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar2, lqeggnwhkgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pickUp = (AddressMapScreenFlow.PickUp) lqeggnwhkgVar.f67588yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f67589zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((iv.ppxfxbqfkf) objZoijcleaow);
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.crxdokpmqz(new mn.eablkybsjg.lqeggnwhkg(thDxjokdxxww));
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        iv.ppxfxbqfkf ppxfxbqfkfVar2 = (iv.ppxfxbqfkf) objWkgbmnqykc;
        if (ppxfxbqfkfVar2 == null) {
            return pickUp;
        }
        iv.zoijcleaow zoijcleaowVarDvvnrvtcbc = iobyxmoadgVar.dvvnrvtcbc(ppxfxbqfkfVar2);
        iobyxmoadgVar.ulzqkzuiru(new mn.gxszxtbevo.C1399gxszxtbevo(iobyxmoadgVar.ipoelvxyzq(ppxfxbqfkfVar2)));
        String strZoijcleaow = zoijcleaowVarDvvnrvtcbc != null ? zoijcleaowVarDvvnrvtcbc.zoijcleaow() : null;
        String strPpxfxbqfkf = zoijcleaowVarDvvnrvtcbc != null ? zoijcleaowVarDvvnrvtcbc.ppxfxbqfkf() : null;
        if (strPpxfxbqfkf == null) {
            strPpxfxbqfkf = "";
        }
        return pickUp.zoijcleaow(strZoijcleaow, strPpxfxbqfkf, zoijcleaowVarDvvnrvtcbc != null ? zoijcleaowVarDvvnrvtcbc.iobyxmoadg() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object uawqvzlxes(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        Object objPpxfxbqfkf;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        Object obj;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f67569esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f67569esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj2 = eablkybsjgVar.f67570iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f67569esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                z13 = eablkybsjgVar.f67571jyumaefscl;
                iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f67573zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj2);
                objPpxfxbqfkf = ((kcexrzcfyt) obj2).rgvfuqvkyq();
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z13 = eablkybsjgVar.f67571jyumaefscl;
                obj = eablkybsjgVar.f67572yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) eablkybsjgVar.f67573zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj2);
            }
            objPpxfxbqfkf = obj;
            iobyxmoadgVar = iobyxmoadgVar2;
            if (kcexrzcfyt.dxjokdxxww(objPpxfxbqfkf) != null) {
                if (z13) {
                    iobyxmoadgVar.hszhottldk();
                }
                iobyxmoadgVar.crxdokpmqz(mn.eablkybsjg.nufgyqmvbu.f67531iobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj2);
        if (z13) {
            c();
        }
        j42.zoijcleaow zoijcleaowVar = this.f67556wkgbmnqykc;
        nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
        nj.wkgbmnqykc wkgbmnqykcVar = nj.wkgbmnqykc.SECONDS;
        long jKcexrzcfyt = nj.ppxfxbqfkf.kcexrzcfyt(2, wkgbmnqykcVar);
        long jKcexrzcfyt2 = nj.ppxfxbqfkf.kcexrzcfyt(5, wkgbmnqykcVar);
        eablkybsjgVar.f67573zdlpuopuiu = this;
        eablkybsjgVar.f67571jyumaefscl = z13;
        eablkybsjgVar.f67569esjtqupxsv = 1;
        objPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(jKcexrzcfyt, jKcexrzcfyt2, eablkybsjgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        if (kcexrzcfyt.agtfadlqog(objPpxfxbqfkf)) {
            LocationData locationData = (LocationData) objPpxfxbqfkf;
            if (locationData != null) {
                eablkybsjgVar.f67573zdlpuopuiu = iobyxmoadgVar;
                eablkybsjgVar.f67572yggfygwlhe = objPpxfxbqfkf;
                eablkybsjgVar.f67571jyumaefscl = z13;
                eablkybsjgVar.f67569esjtqupxsv = 2;
                if (iobyxmoadgVar.weqkydbzbr(locationData, z13, eablkybsjgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                obj = objPpxfxbqfkf;
                objPpxfxbqfkf = obj;
                iobyxmoadgVar = iobyxmoadgVar2;
            } else {
                if (z13) {
                    iobyxmoadgVar.hszhottldk();
                }
                iobyxmoadgVar.crxdokpmqz(mn.eablkybsjg.nufgyqmvbu.f67531iobyxmoadg);
            }
        }
        if (kcexrzcfyt.dxjokdxxww(objPpxfxbqfkf) != null) {
            if (z13) {
                iobyxmoadgVar.hszhottldk();
            }
            iobyxmoadgVar.crxdokpmqz(mn.eablkybsjg.nufgyqmvbu.f67531iobyxmoadg);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object weqkydbzbr(LocationData locationData, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f67617cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f67617cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f67619jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f67617cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new mn.gxszxtbevo.lqeggnwhkg(locationData));
            if (this.f67547btonecajqb) {
                lrnfpwlwnk(locationData, kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(((State) jlmebxxoox()).getCurrentFlow().cdpycssgdh()));
                if (ageimvtcrz()) {
                    zoijcleaowVar.f67621zdlpuopuiu = this;
                    zoijcleaowVar.f67620yggfygwlhe = z13;
                    zoijcleaowVar.f67617cqumvgiudr = 1;
                    if (e(locationData, false, zoijcleaowVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = zoijcleaowVar.f67620yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f67621zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        if (z13) {
            iobyxmoadgVar.hszhottldk();
        }
        iobyxmoadgVar.f67547btonecajqb = false;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak() {
        ulzqkzuiru(new mn.gxszxtbevo.iobyxmoadg(false));
    }

    private final void yzdjzghtvl() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(null), 3, null);
    }

    static /* synthetic */ void zeieaojujs(iobyxmoadg iobyxmoadgVar, LocationData locationData, Float f13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = null;
        }
        iobyxmoadgVar.lrnfpwlwnk(locationData, f13);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(mn.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, mn.wkgbmnqykc.lqeggnwhkg.f67635iobyxmoadg)) {
            crxdokpmqz(mn.eablkybsjg.zoijcleaow.f67538iobyxmoadg);
            return;
        }
        if (intent instanceof mn.wkgbmnqykc.eablkybsjg) {
            jrbgnlbqoe(((State) jlmebxxoox()).getMapCameraState().getCameraZoom(), true);
            return;
        }
        if (intent instanceof mn.wkgbmnqykc.gxszxtbevo) {
            jrbgnlbqoe(((State) jlmebxxoox()).getMapCameraState().getCameraZoom(), false);
            return;
        }
        if (intent instanceof mn.wkgbmnqykc.C1401wkgbmnqykc) {
            ulzqkzuiru(new mn.gxszxtbevo.eablkybsjg(((mn.wkgbmnqykc.C1401wkgbmnqykc) intent).iobyxmoadg()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, mn.wkgbmnqykc.ppxfxbqfkf.f67637iobyxmoadg)) {
            yzdjzghtvl();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, mn.wkgbmnqykc.wflxmlrfwp.f67638iobyxmoadg)) {
            eslsurpljm();
            return;
        }
        if (intent instanceof mn.wkgbmnqykc.gtknphoqwx) {
            d(((mn.wkgbmnqykc.gtknphoqwx) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof mn.wkgbmnqykc.btonecajqb) {
            ixidwrxhsl(((mn.wkgbmnqykc.btonecajqb) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof mn.wkgbmnqykc.draadjrbmk) {
            mn.wkgbmnqykc.draadjrbmk draadjrbmkVar = (mn.wkgbmnqykc.draadjrbmk) intent;
            ezmngbhpjk(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.ppxfxbqfkf());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, mn.wkgbmnqykc.nufgyqmvbu.f67636iobyxmoadg)) {
            grlcpdaxtj();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, mn.wkgbmnqykc.dxjokdxxww.f67630iobyxmoadg)) {
            mhtqkkgtqm();
            return;
        }
        if (intent instanceof mn.wkgbmnqykc.iobyxmoadg) {
            igdgnonuha(((mn.wkgbmnqykc.iobyxmoadg) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof mn.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            mn.wkgbmnqykc.zoijcleaow zoijcleaowVar = (mn.wkgbmnqykc.zoijcleaow) intent;
            lxfrhoxuzk(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow());
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(mn.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, mn.ppxfxbqfkf.iobyxmoadg.f67625iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
    }
}
