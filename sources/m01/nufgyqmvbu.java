package m01;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.ylkuphrtab;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.geo.api.models.City;
import sj.dxjokdxxww;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends zr0.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final y01.zoijcleaow f64893eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y01.ppxfxbqfkf f64894ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p01.lqeggnwhkg f64895wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ylkuphrtab f64896zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f64898iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f64899jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f64900yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f64901zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), (pz0.iobyxmoadg) obj2, (City) obj3, (lg.gxszxtbevo) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f64901zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = this.f64900yggfygwlhe;
            pz0.iobyxmoadg iobyxmoadgVar = (pz0.iobyxmoadg) this.f64899jyumaefscl;
            City city = (City) this.f64898iwizpuwonk;
            if (z13) {
                return iobyxmoadgVar == null ? pz0.zoijcleaow.iobyxmoadg(nufgyqmvbu.this.nufgyqmvbu()) : iobyxmoadgVar;
            }
            return pz0.zoijcleaow.iobyxmoadg(city);
        }

        public final Object ojitshcjhn(boolean z13, pz0.iobyxmoadg iobyxmoadgVar, City city, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar2 = nufgyqmvbu.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar2.f64900yggfygwlhe = z13;
            iobyxmoadgVar2.f64899jyumaefscl = iobyxmoadgVar;
            iobyxmoadgVar2.f64898iwizpuwonk = city;
            return iobyxmoadgVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f64902yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f64903zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f64904yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f64905zdlpuopuiu;

            /* JADX INFO: renamed from: m01.nufgyqmvbu$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1351iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f64907yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f64908zdlpuopuiu;

                public C1351iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f64908zdlpuopuiu = obj;
                    this.f64907yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2) {
                this.f64905zdlpuopuiu = nufgyqmvbuVar;
                this.f64904yggfygwlhe = nufgyqmvbuVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1351iobyxmoadg c1351iobyxmoadg;
                if (gxszxtbevoVar instanceof C1351iobyxmoadg) {
                    c1351iobyxmoadg = (C1351iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1351iobyxmoadg.f64907yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1351iobyxmoadg.f64907yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1351iobyxmoadg = new C1351iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1351iobyxmoadg = new C1351iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1351iobyxmoadg.f64908zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1351iobyxmoadg.f64907yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f64905zdlpuopuiu;
                    City cityNufgyqmvbu = (City) obj;
                    if (cityNufgyqmvbu == null) {
                        cityNufgyqmvbu = this.f64904yggfygwlhe.nufgyqmvbu();
                        this.f64904yggfygwlhe.f64893eablkybsjg.zoijcleaow(new y01.zoijcleaow.iobyxmoadg(cityNufgyqmvbu));
                    }
                    c1351iobyxmoadg.f64907yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(cityNufgyqmvbu, c1351iobyxmoadg) == objGxszxtbevo) {
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

        public zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar, nufgyqmvbu nufgyqmvbuVar) {
            this.f64903zdlpuopuiu = lqeggnwhkgVar;
            this.f64902yggfygwlhe = nufgyqmvbuVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f64903zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f64902yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(ylkuphrtab subscribeUserIsAuthUseCase, y01.ppxfxbqfkf subscribeToChosenCityUseCase, p01.lqeggnwhkg subscribeToCartDeliveryDataUseCase, y01.zoijcleaow setChosenCityUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserIsAuthUseCase, "subscribeUserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToChosenCityUseCase, "subscribeToChosenCityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartDeliveryDataUseCase, "subscribeToCartDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setChosenCityUseCase, "setChosenCityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f64896zoijcleaow = subscribeUserIsAuthUseCase;
        this.f64894ppxfxbqfkf = subscribeToChosenCityUseCase;
        this.f64895wkgbmnqykc = subscribeToCartDeliveryDataUseCase;
        this.f64893eablkybsjg = setChosenCityUseCase;
    }

    private final sj.lqeggnwhkg dxjokdxxww() {
        return (sj.lqeggnwhkg) this.f64896zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
    }

    private final sj.lqeggnwhkg gxszxtbevo() {
        return this.f64895wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
    }

    private final sj.lqeggnwhkg lqeggnwhkg() {
        return new zoijcleaow(this.f64894ppxfxbqfkf.wkgbmnqykc(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final City nufgyqmvbu() {
        return City.INSTANCE.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.iobyxmoadg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return dxjokdxxww.vdvldrhtss(dxjokdxxww.draadjrbmk(dxjokdxxww(), gxszxtbevo(), lqeggnwhkg(), new iobyxmoadg(null)));
    }
}
