package m01;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.ylkuphrtab;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.geo.api.models.City;
import ru.myspar.proloyalty.core.domain.models.cart.DeliveryInfo;
import ru.myspar.proloyalty.core.domain.models.delivery.CatalogPagerAddressData;
import sj.dxjokdxxww;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends zr0.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y01.ppxfxbqfkf f64876ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p01.nufgyqmvbu f64877wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ylkuphrtab f64878zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f64879iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f64880jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f64881yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64882zdlpuopuiu;

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
            if (this.f64882zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return this.f64881yggfygwlhe ? (CatalogPagerAddressData) this.f64880jyumaefscl : new CatalogPagerAddressData(((City) this.f64879iwizpuwonk).getName());
        }

        public final Object ojitshcjhn(boolean z13, CatalogPagerAddressData catalogPagerAddressData, City city, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f64881yggfygwlhe = z13;
            iobyxmoadgVar.f64880jyumaefscl = catalogPagerAddressData;
            iobyxmoadgVar.f64879iwizpuwonk = city;
            return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f64883zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f64884zdlpuopuiu;

            /* JADX INFO: renamed from: m01.lqeggnwhkg$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1349iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f64886yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f64887zdlpuopuiu;

                public C1349iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f64887zdlpuopuiu = obj;
                    this.f64886yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f64884zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1349iobyxmoadg c1349iobyxmoadg;
                if (gxszxtbevoVar instanceof C1349iobyxmoadg) {
                    c1349iobyxmoadg = (C1349iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1349iobyxmoadg.f64886yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1349iobyxmoadg.f64886yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1349iobyxmoadg = new C1349iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1349iobyxmoadg = new C1349iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1349iobyxmoadg.f64887zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1349iobyxmoadg.f64886yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f64884zdlpuopuiu;
                    City cityIobyxmoadg = (City) obj;
                    if (cityIobyxmoadg == null) {
                        cityIobyxmoadg = City.INSTANCE.iobyxmoadg();
                    }
                    c1349iobyxmoadg.f64886yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(cityIobyxmoadg, c1349iobyxmoadg) == objGxszxtbevo) {
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
            this.f64883zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f64883zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f64888zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f64889zdlpuopuiu;

            /* JADX INFO: renamed from: m01.lqeggnwhkg$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1350iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f64891yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f64892zdlpuopuiu;

                public C1350iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f64892zdlpuopuiu = obj;
                    this.f64891yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f64889zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1350iobyxmoadg c1350iobyxmoadg;
                if (gxszxtbevoVar instanceof C1350iobyxmoadg) {
                    c1350iobyxmoadg = (C1350iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1350iobyxmoadg.f64891yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1350iobyxmoadg.f64891yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1350iobyxmoadg = new C1350iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1350iobyxmoadg = new C1350iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1350iobyxmoadg.f64892zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1350iobyxmoadg.f64891yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f64889zdlpuopuiu;
                    DeliveryInfo deliveryInfo = (DeliveryInfo) obj;
                    CatalogPagerAddressData catalogPagerAddressData = new CatalogPagerAddressData(deliveryInfo.getTitle(), deliveryInfo.getSubtitle(), deliveryInfo.nufgyqmvbu());
                    c1350iobyxmoadg.f64891yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(catalogPagerAddressData, c1350iobyxmoadg) == objGxszxtbevo) {
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
            this.f64888zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f64888zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(ylkuphrtab subscribeUserIsAuthUseCase, y01.ppxfxbqfkf subscribeToChosenCityUseCase, p01.nufgyqmvbu subscribeToCartDeliveryInfoUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserIsAuthUseCase, "subscribeUserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToChosenCityUseCase, "subscribeToChosenCityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartDeliveryInfoUseCase, "subscribeToCartDeliveryInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f64878zoijcleaow = subscribeUserIsAuthUseCase;
        this.f64876ppxfxbqfkf = subscribeToChosenCityUseCase;
        this.f64877wkgbmnqykc = subscribeToCartDeliveryInfoUseCase;
    }

    private final sj.lqeggnwhkg eablkybsjg() {
        return new ppxfxbqfkf(this.f64876ppxfxbqfkf.wkgbmnqykc());
    }

    private final sj.lqeggnwhkg wkgbmnqykc() {
        return dxjokdxxww.vdvldrhtss(new zoijcleaow(this.f64877wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.iobyxmoadg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return dxjokdxxww.draadjrbmk((sj.lqeggnwhkg) this.f64878zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), wkgbmnqykc(), eablkybsjg(), new iobyxmoadg(null));
    }
}
