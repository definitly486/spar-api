package xl0;

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
import ru.myspar.proloyalty.address.api.model.AddressMapScreenFlow;
import ru.myspar.proloyalty.address.impl.map.domain.State;
import ru.myspar.proloyalty.address.impl.map.domain.models.AddressMapShop;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f122771btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final List f122772draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final vt0.zoijcleaow f122773dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final eu0.iobyxmoadg f122774eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private auzgnhcxok f122775gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final eu0.ppxfxbqfkf f122776gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final r11.iobyxmoadg f122777lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final v01.iobyxmoadg f122778nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ur0.iobyxmoadg f122779ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final eq1.zoijcleaow f122780wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122782zdlpuopuiu;

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
            int i13 = this.f122782zdlpuopuiu;
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
            this.f122782zdlpuopuiu = 1;
            obj = iobyxmoadgVar.nuxfzjnpeb(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            if (!((Boolean) obj).booleanValue()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            iobyxmoadg.this.f122771btonecajqb = true;
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
            this.f122782zdlpuopuiu = 2;
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
        int f122784zdlpuopuiu;

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
            if (this.f122784zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.crxdokpmqz(xl0.eablkybsjg.dxjokdxxww.f122750iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122786zdlpuopuiu;

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
            int i13 = this.f122786zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f122786zdlpuopuiu = 1;
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
        int f122787cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f122789jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f122790yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122791zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122789jyumaefscl = obj;
            this.f122787cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.fiwbwshyhd(this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f122793esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f122794iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f122795jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f122796yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122797zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122794iwizpuwonk = obj;
            this.f122793esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.uawqvzlxes(false, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122799zdlpuopuiu;

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
            int i13 = this.f122799zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f122799zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(2750L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(xl0.eablkybsjg.btonecajqb.f122749iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f122800cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f122802iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f122803jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f122804lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f122805yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122806zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122800cqumvgiudr = obj;
            this.f122804lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.auzgnhcxok(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: xl0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C3090iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f122807iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f122808zoijcleaow;

        static {
            int[] iArr = new int[cl0.iobyxmoadg.values().length];
            try {
                iArr[cl0.iobyxmoadg.CREATE_FIRST_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cl0.iobyxmoadg.ADD_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cl0.iobyxmoadg.EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f122807iobyxmoadg = iArr;
            int[] iArr2 = new int[cl0.zoijcleaow.values().length];
            try {
                iArr2[cl0.zoijcleaow.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[cl0.zoijcleaow.PickUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f122808zoijcleaow = iArr2;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f122809cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f122811jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f122812yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122813zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122811jyumaefscl = obj;
            this.f122809cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.skhdrjzrfn(null, null, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ LocationData f122814jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122816zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f122814jyumaefscl = locationData;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new nufgyqmvbu(this.f122814jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f122816zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                LocationData locationData = this.f122814jyumaefscl;
                this.f122816zdlpuopuiu = 1;
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
        int f122818yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122819zdlpuopuiu;

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
            int i13 = this.f122818yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                State stateOpjhrmiecq = iobyxmoadg.opjhrmiecq(iobyxmoadg.this);
                deliveryFlow = stateOpjhrmiecq.getDeliveryFlow();
                if (stateOpjhrmiecq.getCurrentFlow() instanceof AddressMapScreenFlow.PickUp) {
                    iobyxmoadg.this.ulzqkzuiru(new xl0.gxszxtbevo.zoijcleaow(deliveryFlow));
                }
                LocationData location = deliveryFlow.getLocation();
                LocationData userLocation = stateOpjhrmiecq.getUserLocation();
                if (location == null && userLocation != null) {
                    iobyxmoadg.this.b();
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    this.f122819zdlpuopuiu = deliveryFlow;
                    this.f122818yggfygwlhe = 1;
                    obj = iobyxmoadg.iwxlajgraz(iobyxmoadgVar, deliveryFlow, userLocation, null, this, 4, null);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    delivery = deliveryFlow;
                    deliveryFlow = (AddressMapScreenFlow.Delivery) obj;
                } else if (location == null) {
                    iobyxmoadg.this.b();
                    iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                    LocationData locationDataIobyxmoadg = cl0.ppxfxbqfkf.iobyxmoadg();
                    this.f122819zdlpuopuiu = deliveryFlow;
                    this.f122818yggfygwlhe = 2;
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
                delivery = (AddressMapScreenFlow.Delivery) this.f122819zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                deliveryFlow = (AddressMapScreenFlow.Delivery) obj;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                delivery = (AddressMapScreenFlow.Delivery) this.f122819zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                deliveryFlow = (AddressMapScreenFlow.Delivery) obj;
            }
            iobyxmoadg.this.wizcaqwiak();
            iobyxmoadg.this.ulzqkzuiru(new xl0.gxszxtbevo.zoijcleaow(deliveryFlow));
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
        int f122820cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f122822jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f122823yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122824zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122822jyumaefscl = obj;
            this.f122820cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.e(null, false, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f122825jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f122827zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122827zdlpuopuiu = obj;
            this.f122825jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.nuxfzjnpeb(this);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f122829yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122830zdlpuopuiu;

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
            int i13 = this.f122829yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.b();
                State stateOpjhrmiecq = iobyxmoadg.opjhrmiecq(iobyxmoadg.this);
                pickUpFlow = stateOpjhrmiecq.getPickUpFlow();
                if (iobyxmoadg.this.ageimvtcrz()) {
                    iobyxmoadg.this.ulzqkzuiru(new xl0.gxszxtbevo.zoijcleaow(pickUpFlow));
                }
                LocationData userLocation = stateOpjhrmiecq.getUserLocation();
                LocationData location = pickUpFlow.getLocation();
                if (location == null && userLocation != null) {
                    iobyxmoadg.this.c();
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    this.f122830zdlpuopuiu = pickUpFlow;
                    this.f122829yggfygwlhe = 1;
                    obj = iobyxmoadgVar.skhdrjzrfn(pickUpFlow, userLocation, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    pickUp = pickUpFlow;
                    pickUpFlow = (AddressMapScreenFlow.PickUp) obj;
                } else if (location == null) {
                    iobyxmoadg.this.c();
                    iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                    LocationData locationDataIobyxmoadg = cl0.ppxfxbqfkf.iobyxmoadg();
                    this.f122830zdlpuopuiu = pickUpFlow;
                    this.f122829yggfygwlhe = 2;
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
                pickUp = (AddressMapScreenFlow.PickUp) this.f122830zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                pickUpFlow = (AddressMapScreenFlow.PickUp) obj;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pickUp = (AddressMapScreenFlow.PickUp) this.f122830zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                pickUpFlow = (AddressMapScreenFlow.PickUp) obj;
            }
            iobyxmoadg.this.hszhottldk();
            iobyxmoadg.this.wizcaqwiak();
            iobyxmoadg.this.ulzqkzuiru(new xl0.gxszxtbevo.zoijcleaow(pickUpFlow));
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
        final /* synthetic */ LocationData f122831jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f122833zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        vdvldrhtss(LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f122831jyumaefscl = locationData;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new vdvldrhtss(this.f122831jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f122833zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                LocationData locationData = this.f122831jyumaefscl;
                this.f122833zdlpuopuiu = 1;
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
        final /* synthetic */ String f122834cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f122836jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f122837yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122838zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f122834cqumvgiudr = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wflxmlrfwp(this.f122834cqumvgiudr, gxszxtbevoVar);
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
            int i13 = this.f122836jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        iobyxmoadgVar2 = (iobyxmoadg) this.f122837yggfygwlhe;
                        str = (String) this.f122838zdlpuopuiu;
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
                        iobyxmoadgVar.crxdokpmqz(xl0.eablkybsjg.iobyxmoadg.f122753iobyxmoadg);
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.crxdokpmqz(new xl0.eablkybsjg.lqeggnwhkg(thDxjokdxxww));
                    }
                    iobyxmoadg.this.hszhottldk();
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.c();
                String str2 = this.f122834cqumvgiudr;
                iobyxmoadgVar2 = iobyxmoadg.this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                vt0.zoijcleaow.iobyxmoadg iobyxmoadgVar4 = new vt0.zoijcleaow.iobyxmoadg(str2);
                vt0.zoijcleaow zoijcleaowVar = iobyxmoadgVar2.f122773dxjokdxxww;
                this.f122838zdlpuopuiu = str2;
                this.f122837yggfygwlhe = iobyxmoadgVar2;
                this.f122836jyumaefscl = 1;
                if (zoijcleaowVar.zoijcleaow(iobyxmoadgVar4, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str = str2;
                v01.iobyxmoadg.InterfaceC2862iobyxmoadg.zoijcleaow zoijcleaowVar2 = new v01.iobyxmoadg.InterfaceC2862iobyxmoadg.zoijcleaow(str);
                v01.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar2.f122778nufgyqmvbu;
                this.f122838zdlpuopuiu = null;
                this.f122837yggfygwlhe = null;
                this.f122836jyumaefscl = 2;
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
                iobyxmoadgVar.crxdokpmqz(xl0.eablkybsjg.iobyxmoadg.f122753iobyxmoadg);
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.crxdokpmqz(new xl0.eablkybsjg.lqeggnwhkg(thDxjokdxxww));
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
        int f122840zdlpuopuiu;

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
            int i13 = this.f122840zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f122840zdlpuopuiu = 1;
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
        int f122841cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f122843jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f122844yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122845zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122843jyumaefscl = obj;
            this.f122841cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.weqkydbzbr(null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, ur0.iobyxmoadg permissionManager, eq1.zoijcleaow locationProvider, eu0.iobyxmoadg getAddressByLocationUseCase, eu0.ppxfxbqfkf getShopsByLocationUseCase, r11.iobyxmoadg distanceCalculator, v01.iobyxmoadg changeCartAddressUseCase, vt0.zoijcleaow createPickUpAddressUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(locationProvider, "locationProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getAddressByLocationUseCase, "getAddressByLocationUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getShopsByLocationUseCase, "getShopsByLocationUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(distanceCalculator, "distanceCalculator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartAddressUseCase, "changeCartAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createPickUpAddressUseCase, "createPickUpAddressUseCase");
        this.f122779ppxfxbqfkf = permissionManager;
        this.f122780wkgbmnqykc = locationProvider;
        this.f122774eablkybsjg = getAddressByLocationUseCase;
        this.f122776gxszxtbevo = getShopsByLocationUseCase;
        this.f122777lqeggnwhkg = distanceCalculator;
        this.f122778nufgyqmvbu = changeCartAddressUseCase;
        this.f122773dxjokdxxww = createPickUpAddressUseCase;
        this.f122772draadjrbmk = hg.agtfadlqog.i(locationProvider.zoijcleaow());
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
            int i13 = gxszxtbevoVar2.f122804lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f122804lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f122800cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f122804lereixgezr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            eu0.iobyxmoadg.C0692iobyxmoadg c0692iobyxmoadg = new eu0.iobyxmoadg.C0692iobyxmoadg(locationData);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                eu0.iobyxmoadg iobyxmoadgVar4 = this.f122774eablkybsjg;
                gxszxtbevoVar2.f122806zdlpuopuiu = this;
                gxszxtbevoVar2.f122805yggfygwlhe = delivery;
                gxszxtbevoVar2.f122803jyumaefscl = locationData;
                gxszxtbevoVar2.f122802iwizpuwonk = iobyxmoadgVar;
                gxszxtbevoVar2.f122804lereixgezr = 1;
                objZoijcleaow = iobyxmoadgVar4.zoijcleaow(c0692iobyxmoadg, gxszxtbevoVar2);
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
            iobyxmoadgVar = (tg.iobyxmoadg) gxszxtbevoVar2.f122802iwizpuwonk;
            locationData = (LocationData) gxszxtbevoVar2.f122803jyumaefscl;
            delivery = (AddressMapScreenFlow.Delivery) gxszxtbevoVar2.f122805yggfygwlhe;
            iobyxmoadgVar2 = (iobyxmoadg) gxszxtbevoVar2.f122806zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((cu0.iobyxmoadg) objZoijcleaow);
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar2.crxdokpmqz(new xl0.eablkybsjg.lqeggnwhkg(thDxjokdxxww));
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        cu0.iobyxmoadg iobyxmoadgVar7 = (cu0.iobyxmoadg) objWkgbmnqykc;
        if (iobyxmoadgVar7 instanceof cu0.iobyxmoadg.C0456iobyxmoadg) {
            return delivery.zoijcleaow(((cu0.iobyxmoadg.C0456iobyxmoadg) iobyxmoadgVar7).iobyxmoadg(), q11.dxjokdxxww.ppxfxbqfkf(), locationData, false);
        }
        if (iobyxmoadgVar7 instanceof cu0.iobyxmoadg.zoijcleaow) {
            cu0.iobyxmoadg.zoijcleaow zoijcleaowVar = (cu0.iobyxmoadg.zoijcleaow) iobyxmoadgVar7;
            return delivery.zoijcleaow(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow(), true);
        }
        if (iobyxmoadgVar7 == null) {
            return delivery;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        ulzqkzuiru(new xl0.gxszxtbevo.iobyxmoadg(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        ulzqkzuiru(new xl0.gxszxtbevo.ppxfxbqfkf(true));
    }

    private final void d(LocationData locationData) {
        auzgnhcxok auzgnhcxokVar = this.f122775gtknphoqwx;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f122775gtknphoqwx = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new vdvldrhtss(locationData, null), 3, null);
    }

    private final cu0.zoijcleaow dvvnrvtcbc(cu0.ppxfxbqfkf ppxfxbqfkfVar) {
        Object next;
        Iterator it = ppxfxbqfkfVar.zoijcleaow().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((cu0.zoijcleaow) next).zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg())) {
                return (cu0.zoijcleaow) next;
            }
        }
        next = null;
        return (cu0.zoijcleaow) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(LocationData locationData, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        oxmwwwfdhm oxmwwwfdhmVar;
        iobyxmoadg iobyxmoadgVar;
        LocationData location;
        if (gxszxtbevoVar instanceof oxmwwwfdhm) {
            oxmwwwfdhmVar = (oxmwwwfdhm) gxszxtbevoVar;
            int i13 = oxmwwwfdhmVar.f122820cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oxmwwwfdhmVar.f122820cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            }
        } else {
            oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
        }
        oxmwwwfdhm oxmwwwfdhmVar2 = oxmwwwfdhmVar;
        Object objIwxlajgraz = oxmwwwfdhmVar2.f122822jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = oxmwwwfdhmVar2.f122820cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                locationData = (LocationData) oxmwwwfdhmVar2.f122823yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) oxmwwwfdhmVar2.f122824zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIwxlajgraz);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                locationData = (LocationData) oxmwwwfdhmVar2.f122823yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) oxmwwwfdhmVar2.f122824zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIwxlajgraz);
            }
            iobyxmoadgVar.ulzqkzuiru(new xl0.gxszxtbevo.zoijcleaow((AddressMapScreenFlow.Delivery) objIwxlajgraz));
            iobyxmoadgVar.wizcaqwiak();
            zeieaojujs(iobyxmoadgVar, locationData, null, 2, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objIwxlajgraz);
        if (z13) {
            oxmwwwfdhmVar2.f122824zdlpuopuiu = this;
            oxmwwwfdhmVar2.f122823yggfygwlhe = locationData;
            oxmwwwfdhmVar2.f122820cqumvgiudr = 1;
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
            oxmwwwfdhmVar2.f122824zdlpuopuiu = iobyxmoadgVar;
            oxmwwwfdhmVar2.f122823yggfygwlhe = locationData;
            oxmwwwfdhmVar2.f122820cqumvgiudr = 2;
            objIwxlajgraz = iwxlajgraz(iobyxmoadgVar, delivery, locationData, null, oxmwwwfdhmVar2, 4, null);
            if (objIwxlajgraz == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar.ulzqkzuiru(new xl0.gxszxtbevo.zoijcleaow((AddressMapScreenFlow.Delivery) objIwxlajgraz));
            iobyxmoadgVar.wizcaqwiak();
            zeieaojujs(iobyxmoadgVar, locationData, null, 2, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void eslsurpljm() {
        if (ageimvtcrz()) {
            cr0.iobyxmoadg.iobyxmoadg(this.f122775gtknphoqwx);
        }
    }

    private final void ezmngbhpjk(String str, String str2, LocationData locationData) {
        AddressMapScreenFlow currentFlow = ((State) jlmebxxoox()).getCurrentFlow();
        AddressMapScreenFlow.PickUp pickUp = currentFlow instanceof AddressMapScreenFlow.PickUp ? (AddressMapScreenFlow.PickUp) currentFlow : null;
        if (pickUp == null) {
            return;
        }
        ulzqkzuiru(new xl0.gxszxtbevo.zoijcleaow(pickUp.zoijcleaow(str, str2, locationData)));
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
            int i14 = dxjokdxxwwVar.f122787cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f122787cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objNuxfzjnpeb = dxjokdxxwwVar.f122789jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = dxjokdxxwwVar.f122787cqumvgiudr;
        if (i15 != 0) {
            if (i15 == 1) {
                iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) dxjokdxxwwVar.f122791zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objNuxfzjnpeb);
                iobyxmoadgVar = iobyxmoadgVar3;
            } else {
                if (i15 == 2) {
                    zBooleanValue = dxjokdxxwwVar.f122790yggfygwlhe;
                    iobyxmoadgVar = (iobyxmoadg) dxjokdxxwwVar.f122791zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objNuxfzjnpeb);
                    if ((((State) iobyxmoadgVar.jlmebxxoox()).getCurrentFlow() instanceof AddressMapScreenFlow.PickUp) && !((State) iobyxmoadgVar.jlmebxxoox()).getIsAddressTypeSelectionEnabled()) {
                        pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new gtknphoqwx(null), 3, null);
                    }
                    i13 = C3090iobyxmoadg.f122807iobyxmoadg[((State) iobyxmoadgVar.jlmebxxoox()).getMode().ordinal()];
                    if (i13 != 1 || i13 == 2) {
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
                    } else {
                        if (i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                    }
                    boolean zBooleanValue2 = ((Boolean) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).booleanValue();
                    iobyxmoadgVar.f122771btonecajqb = ((Boolean) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).booleanValue();
                    if (!zBooleanValue && zBooleanValue2) {
                        dxjokdxxwwVar.f122791zdlpuopuiu = iobyxmoadgVar;
                        dxjokdxxwwVar.f122787cqumvgiudr = 3;
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
                iobyxmoadgVar2 = (iobyxmoadg) dxjokdxxwwVar.f122791zdlpuopuiu;
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
        dxjokdxxwwVar.f122791zdlpuopuiu = this;
        dxjokdxxwwVar.f122787cqumvgiudr = 1;
        objNuxfzjnpeb = nuxfzjnpeb(dxjokdxxwwVar);
        if (objNuxfzjnpeb == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        zBooleanValue = ((Boolean) objNuxfzjnpeb).booleanValue();
        if (((State) iobyxmoadgVar.jlmebxxoox()).getMode() == cl0.iobyxmoadg.CREATE_FIRST_ADDRESS) {
            ageimvtcrz ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
            btonecajqb btonecajqbVar = iobyxmoadgVar.new btonecajqb(null);
            dxjokdxxwwVar.f122791zdlpuopuiu = iobyxmoadgVar;
            dxjokdxxwwVar.f122790yggfygwlhe = zBooleanValue;
            dxjokdxxwwVar.f122787cqumvgiudr = 2;
            if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarPpxfxbqfkf, btonecajqbVar, dxjokdxxwwVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            if (((State) iobyxmoadgVar.jlmebxxoox()).getCurrentFlow() instanceof AddressMapScreenFlow.PickUp) {
                pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new gtknphoqwx(null), 3, null);
            }
            i13 = C3090iobyxmoadg.f122807iobyxmoadg[((State) iobyxmoadgVar.jlmebxxoox()).getMode().ordinal()];
            if (i13 != 1) {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
            } else {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
            }
            boolean zBooleanValue3 = ((Boolean) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).booleanValue();
            iobyxmoadgVar.f122771btonecajqb = ((Boolean) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).booleanValue();
            if (!zBooleanValue) {
            }
            if (zBooleanValue) {
                pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new draadjrbmk(null), 3, null);
            }
        } else {
            i13 = C3090iobyxmoadg.f122807iobyxmoadg[((State) iobyxmoadgVar.jlmebxxoox()).getMode().ordinal()];
            if (i13 != 1) {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
            } else {
                vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(iobyxmoadgVar.ageimvtcrz()));
            }
            boolean zBooleanValue4 = ((Boolean) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).booleanValue();
            iobyxmoadgVar.f122771btonecajqb = ((Boolean) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).booleanValue();
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

    private final void fmlbqenlif(AddressMapScreenFlow.Delivery delivery, cl0.iobyxmoadg iobyxmoadgVar) {
        String strWkgbmnqykc;
        Object wkgbmnqykcVar;
        LocationData location = delivery.getLocation();
        if (location == null || (strWkgbmnqykc = q11.dxjokdxxww.wkgbmnqykc(delivery.getShortAddress())) == null) {
            return;
        }
        String fullAddress = delivery.getFullAddress();
        int i13 = C3090iobyxmoadg.f122807iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            wkgbmnqykcVar = new xl0.eablkybsjg.wkgbmnqykc(strWkgbmnqykc, fullAddress, location);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            wkgbmnqykcVar = new xl0.eablkybsjg.ppxfxbqfkf(strWkgbmnqykc, fullAddress, location);
        }
        crxdokpmqz(wkgbmnqykcVar);
    }

    private final boolean fyldjkxazc(LocationData locationData, LocationData locationData2) {
        return ((rz0.iobyxmoadg) this.f122777lqeggnwhkg.iobyxmoadg(locationData, locationData2)).iobyxmoadg().doubleValue() <= 10.0d;
    }

    private final void grlcpdaxtj() {
        Object gxszxtbevoVar;
        State state = (State) jlmebxxoox();
        AddressMapScreenFlow currentFlow = state.getCurrentFlow();
        if (currentFlow instanceof AddressMapScreenFlow.Delivery) {
            LocationData userLocation = state.getUserLocation();
            if (userLocation == null) {
                userLocation = cl0.ppxfxbqfkf.iobyxmoadg();
            }
            gxszxtbevoVar = new xl0.eablkybsjg.C3088eablkybsjg(userLocation);
        } else {
            if (!(currentFlow instanceof AddressMapScreenFlow.PickUp)) {
                throw new NoWhenBranchMatchedException();
            }
            LocationData userLocation2 = state.getUserLocation();
            if (userLocation2 == null) {
                userLocation2 = cl0.ppxfxbqfkf.iobyxmoadg();
            }
            gxszxtbevoVar = new xl0.eablkybsjg.gxszxtbevo(userLocation2);
        }
        crxdokpmqz(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hszhottldk() {
        ulzqkzuiru(new xl0.gxszxtbevo.ppxfxbqfkf(false));
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

    private final List ipoelvxyzq(cu0.ppxfxbqfkf ppxfxbqfkfVar) {
        List<cu0.zoijcleaow> listZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        for (cu0.zoijcleaow zoijcleaowVar : listZoijcleaow) {
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

    private final void ixidwrxhsl(cl0.zoijcleaow zoijcleaowVar) {
        int i13 = C3090iobyxmoadg.f122808zoijcleaow[zoijcleaowVar.ordinal()];
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
        ulzqkzuiru(new xl0.gxszxtbevo.eablkybsjg(zg.gtknphoqwx.wflxmlrfwp(z13 ? f13 + 1.0f : f13 - 1.0f, 1.0f, 21.0f)));
    }

    private final void krqnebusok() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lrnfpwlwnk(LocationData locationData, Float f13) {
        ulzqkzuiru(new xl0.gxszxtbevo.wkgbmnqykc(locationData, f13));
    }

    private final void lxfrhoxuzk(String str, String str2, LocationData locationData) {
        AddressMapScreenFlow currentFlow = ((State) jlmebxxoox()).getCurrentFlow();
        AddressMapScreenFlow.PickUp pickUp = currentFlow instanceof AddressMapScreenFlow.PickUp ? (AddressMapScreenFlow.PickUp) currentFlow : null;
        if (pickUp == null) {
            return;
        }
        ulzqkzuiru(new xl0.gxszxtbevo.zoijcleaow(pickUp.zoijcleaow(str, str2, locationData)));
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
            int i13 = ppxfxbqfkfVar.f122825jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f122825jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f122827zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f122825jyumaefscl;
        boolean z13 = true;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ur0.iobyxmoadg iobyxmoadgVar = this.f122779ppxfxbqfkf;
            String name = iobyxmoadg.class.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            List list = this.f122772draadjrbmk;
            ppxfxbqfkfVar.f122825jyumaefscl = 1;
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
        ur0.ppxfxbqfkf ppxfxbqfkfVar2 = (ur0.ppxfxbqfkf) objPpxfxbqfkf;
        if (!(ppxfxbqfkfVar2 instanceof ur0.ppxfxbqfkf.zoijcleaow)) {
            if (!(ppxfxbqfkfVar2 instanceof ur0.ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            z13 = false;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }

    public static final /* synthetic */ State opjhrmiecq(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    private final void rhgxfdycjh(AddressMapScreenFlow.PickUp pickUp, cl0.iobyxmoadg iobyxmoadgVar) {
        String strWkgbmnqykc;
        if (iobyxmoadgVar == cl0.iobyxmoadg.EDIT || (strWkgbmnqykc = q11.dxjokdxxww.wkgbmnqykc(pickUp.getShopId())) == null || pickUp.getLocation() == null) {
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
            int i13 = lqeggnwhkgVar.f122809cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f122809cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objZoijcleaow = lqeggnwhkgVar.f122811jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f122809cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            eu0.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new eu0.ppxfxbqfkf.iobyxmoadg(locationData);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                eu0.ppxfxbqfkf ppxfxbqfkfVar = this.f122776gxszxtbevo;
                lqeggnwhkgVar.f122813zdlpuopuiu = this;
                lqeggnwhkgVar.f122812yggfygwlhe = pickUp;
                lqeggnwhkgVar.f122809cqumvgiudr = 1;
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
            pickUp = (AddressMapScreenFlow.PickUp) lqeggnwhkgVar.f122812yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f122813zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((cu0.ppxfxbqfkf) objZoijcleaow);
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.crxdokpmqz(new xl0.eablkybsjg.lqeggnwhkg(thDxjokdxxww));
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        cu0.ppxfxbqfkf ppxfxbqfkfVar2 = (cu0.ppxfxbqfkf) objWkgbmnqykc;
        if (ppxfxbqfkfVar2 == null) {
            return pickUp;
        }
        cu0.zoijcleaow zoijcleaowVarDvvnrvtcbc = iobyxmoadgVar.dvvnrvtcbc(ppxfxbqfkfVar2);
        iobyxmoadgVar.ulzqkzuiru(new xl0.gxszxtbevo.C3089gxszxtbevo(iobyxmoadgVar.ipoelvxyzq(ppxfxbqfkfVar2)));
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
            int i13 = eablkybsjgVar.f122793esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f122793esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj2 = eablkybsjgVar.f122794iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f122793esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                z13 = eablkybsjgVar.f122795jyumaefscl;
                iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f122797zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj2);
                objPpxfxbqfkf = ((kcexrzcfyt) obj2).rgvfuqvkyq();
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z13 = eablkybsjgVar.f122795jyumaefscl;
                obj = eablkybsjgVar.f122796yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) eablkybsjgVar.f122797zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj2);
            }
            objPpxfxbqfkf = obj;
            iobyxmoadgVar = iobyxmoadgVar2;
            if (kcexrzcfyt.dxjokdxxww(objPpxfxbqfkf) != null) {
                if (z13) {
                    iobyxmoadgVar.hszhottldk();
                }
                iobyxmoadgVar.crxdokpmqz(xl0.eablkybsjg.nufgyqmvbu.f122755iobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj2);
        if (z13) {
            c();
        }
        eq1.zoijcleaow zoijcleaowVar = this.f122780wkgbmnqykc;
        nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
        nj.wkgbmnqykc wkgbmnqykcVar = nj.wkgbmnqykc.SECONDS;
        long jKcexrzcfyt = nj.ppxfxbqfkf.kcexrzcfyt(2, wkgbmnqykcVar);
        long jKcexrzcfyt2 = nj.ppxfxbqfkf.kcexrzcfyt(5, wkgbmnqykcVar);
        eablkybsjgVar.f122797zdlpuopuiu = this;
        eablkybsjgVar.f122795jyumaefscl = z13;
        eablkybsjgVar.f122793esjtqupxsv = 1;
        objPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(jKcexrzcfyt, jKcexrzcfyt2, eablkybsjgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        if (kcexrzcfyt.agtfadlqog(objPpxfxbqfkf)) {
            LocationData locationData = (LocationData) objPpxfxbqfkf;
            if (locationData != null) {
                eablkybsjgVar.f122797zdlpuopuiu = iobyxmoadgVar;
                eablkybsjgVar.f122796yggfygwlhe = objPpxfxbqfkf;
                eablkybsjgVar.f122795jyumaefscl = z13;
                eablkybsjgVar.f122793esjtqupxsv = 2;
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
                iobyxmoadgVar.crxdokpmqz(xl0.eablkybsjg.nufgyqmvbu.f122755iobyxmoadg);
            }
        }
        if (kcexrzcfyt.dxjokdxxww(objPpxfxbqfkf) != null) {
            if (z13) {
                iobyxmoadgVar.hszhottldk();
            }
            iobyxmoadgVar.crxdokpmqz(xl0.eablkybsjg.nufgyqmvbu.f122755iobyxmoadg);
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
            int i13 = zoijcleaowVar.f122841cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f122841cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f122843jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f122841cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new xl0.gxszxtbevo.lqeggnwhkg(locationData));
            if (this.f122771btonecajqb) {
                lrnfpwlwnk(locationData, kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(((State) jlmebxxoox()).getCurrentFlow().cdpycssgdh()));
                if (ageimvtcrz()) {
                    zoijcleaowVar.f122845zdlpuopuiu = this;
                    zoijcleaowVar.f122844yggfygwlhe = z13;
                    zoijcleaowVar.f122841cqumvgiudr = 1;
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
            z13 = zoijcleaowVar.f122844yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f122845zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        if (z13) {
            iobyxmoadgVar.hszhottldk();
        }
        iobyxmoadgVar.f122771btonecajqb = false;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak() {
        ulzqkzuiru(new xl0.gxszxtbevo.iobyxmoadg(false));
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
    public void zynmafqrjb(xl0.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, xl0.wkgbmnqykc.lqeggnwhkg.f122859iobyxmoadg)) {
            crxdokpmqz(xl0.eablkybsjg.zoijcleaow.f122762iobyxmoadg);
            return;
        }
        if (intent instanceof xl0.wkgbmnqykc.eablkybsjg) {
            jrbgnlbqoe(((State) jlmebxxoox()).getMapCameraState().getCameraZoom(), true);
            return;
        }
        if (intent instanceof xl0.wkgbmnqykc.gxszxtbevo) {
            jrbgnlbqoe(((State) jlmebxxoox()).getMapCameraState().getCameraZoom(), false);
            return;
        }
        if (intent instanceof xl0.wkgbmnqykc.C3091wkgbmnqykc) {
            ulzqkzuiru(new xl0.gxszxtbevo.eablkybsjg(((xl0.wkgbmnqykc.C3091wkgbmnqykc) intent).iobyxmoadg()));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, xl0.wkgbmnqykc.ppxfxbqfkf.f122861iobyxmoadg)) {
            yzdjzghtvl();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, xl0.wkgbmnqykc.wflxmlrfwp.f122862iobyxmoadg)) {
            eslsurpljm();
            return;
        }
        if (intent instanceof xl0.wkgbmnqykc.gtknphoqwx) {
            d(((xl0.wkgbmnqykc.gtknphoqwx) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof xl0.wkgbmnqykc.btonecajqb) {
            ixidwrxhsl(((xl0.wkgbmnqykc.btonecajqb) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof xl0.wkgbmnqykc.draadjrbmk) {
            xl0.wkgbmnqykc.draadjrbmk draadjrbmkVar = (xl0.wkgbmnqykc.draadjrbmk) intent;
            ezmngbhpjk(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg(), draadjrbmkVar.ppxfxbqfkf());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, xl0.wkgbmnqykc.nufgyqmvbu.f122860iobyxmoadg)) {
            grlcpdaxtj();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, xl0.wkgbmnqykc.dxjokdxxww.f122854iobyxmoadg)) {
            mhtqkkgtqm();
            return;
        }
        if (intent instanceof xl0.wkgbmnqykc.iobyxmoadg) {
            igdgnonuha(((xl0.wkgbmnqykc.iobyxmoadg) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof xl0.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            xl0.wkgbmnqykc.zoijcleaow zoijcleaowVar = (xl0.wkgbmnqykc.zoijcleaow) intent;
            lxfrhoxuzk(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow());
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(xl0.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, xl0.ppxfxbqfkf.iobyxmoadg.f122849iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
    }
}
