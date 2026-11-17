package z10;

import c20.dxjokdxxww;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.pkzmftpjix;
import ru.myspar.components.geo.api.models.City;
import ru.myspar.core.domain.models.cart.DeliveryInfo;
import ru.myspar.core.domain.models.delivery.CatalogPagerAddressData;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final s20.ppxfxbqfkf f127558ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f20.nufgyqmvbu f127559wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f127560zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f127561iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f127562jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f127563yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f127564zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), (CatalogPagerAddressData) obj2, (City) obj3, (lg.gxszxtbevo) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f127564zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return this.f127563yggfygwlhe ? (CatalogPagerAddressData) this.f127562jyumaefscl : new CatalogPagerAddressData(((City) this.f127561iwizpuwonk).getName());
        }

        public final Object ojitshcjhn(boolean z13, CatalogPagerAddressData catalogPagerAddressData, City city, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f127563yggfygwlhe = z13;
            iobyxmoadgVar.f127562jyumaefscl = catalogPagerAddressData;
            iobyxmoadgVar.f127561iwizpuwonk = city;
            return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f127565zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f127566zdlpuopuiu;

            /* JADX INFO: renamed from: z10.lqeggnwhkg$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C3256iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f127568yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f127569zdlpuopuiu;

                public C3256iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f127569zdlpuopuiu = obj;
                    this.f127568yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f127566zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C3256iobyxmoadg c3256iobyxmoadg;
                if (gxszxtbevoVar instanceof C3256iobyxmoadg) {
                    c3256iobyxmoadg = (C3256iobyxmoadg) gxszxtbevoVar;
                    int i13 = c3256iobyxmoadg.f127568yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c3256iobyxmoadg.f127568yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c3256iobyxmoadg = new C3256iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c3256iobyxmoadg = new C3256iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c3256iobyxmoadg.f127569zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c3256iobyxmoadg.f127568yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f127566zdlpuopuiu;
                    City cityIobyxmoadg = (City) obj;
                    if (cityIobyxmoadg == null) {
                        cityIobyxmoadg = City.INSTANCE.iobyxmoadg();
                    }
                    c3256iobyxmoadg.f127568yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(cityIobyxmoadg, c3256iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f127565zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f127565zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f127570zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f127571zdlpuopuiu;

            /* JADX INFO: renamed from: z10.lqeggnwhkg$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C3257iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f127573yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f127574zdlpuopuiu;

                public C3257iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f127574zdlpuopuiu = obj;
                    this.f127573yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f127571zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C3257iobyxmoadg c3257iobyxmoadg;
                if (gxszxtbevoVar instanceof C3257iobyxmoadg) {
                    c3257iobyxmoadg = (C3257iobyxmoadg) gxszxtbevoVar;
                    int i13 = c3257iobyxmoadg.f127573yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c3257iobyxmoadg.f127573yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c3257iobyxmoadg = new C3257iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c3257iobyxmoadg = new C3257iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c3257iobyxmoadg.f127574zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c3257iobyxmoadg.f127573yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f127571zdlpuopuiu;
                    DeliveryInfo deliveryInfo = (DeliveryInfo) obj;
                    CatalogPagerAddressData catalogPagerAddressData = new CatalogPagerAddressData(deliveryInfo.getTitle(), deliveryInfo.getSubtitle(), deliveryInfo.nufgyqmvbu());
                    c3257iobyxmoadg.f127573yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(catalogPagerAddressData, c3257iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f127570zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f127570zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(dxjokdxxww loggedInUseCase, s20.ppxfxbqfkf subscribeToChosenCityUseCase, f20.nufgyqmvbu subscribeToCartDeliveryInfoUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggedInUseCase, "loggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToChosenCityUseCase, "subscribeToChosenCityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartDeliveryInfoUseCase, "subscribeToCartDeliveryInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f127560zoijcleaow = loggedInUseCase;
        this.f127558ppxfxbqfkf = subscribeToChosenCityUseCase;
        this.f127559wkgbmnqykc = subscribeToCartDeliveryInfoUseCase;
    }

    private final sj.lqeggnwhkg eablkybsjg() {
        return new ppxfxbqfkf(this.f127558ppxfxbqfkf.wkgbmnqykc());
    }

    private final sj.lqeggnwhkg wkgbmnqykc() {
        return sj.dxjokdxxww.vdvldrhtss(new zoijcleaow(this.f127559wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return sj.dxjokdxxww.draadjrbmk(this.f127560zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), wkgbmnqykc(), eablkybsjg(), new iobyxmoadg(null));
    }
}
