package z10;

import c20.dxjokdxxww;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.pkzmftpjix;
import ru.myspar.components.geo.api.models.City;
import tg.oxmwwwfdhm;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final s20.zoijcleaow f127575eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final s20.ppxfxbqfkf f127576ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f20.lqeggnwhkg f127577wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f127578zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements oxmwwwfdhm {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f127580iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f127581jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f127582yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f127583zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), (y00.iobyxmoadg) obj2, (City) obj3, (lg.gxszxtbevo) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f127583zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = this.f127582yggfygwlhe;
            y00.iobyxmoadg iobyxmoadgVar = (y00.iobyxmoadg) this.f127581jyumaefscl;
            City city = (City) this.f127580iwizpuwonk;
            if (z13) {
                return iobyxmoadgVar == null ? y00.zoijcleaow.iobyxmoadg(nufgyqmvbu.this.nufgyqmvbu()) : iobyxmoadgVar;
            }
            return y00.zoijcleaow.iobyxmoadg(city);
        }

        public final Object ojitshcjhn(boolean z13, y00.iobyxmoadg iobyxmoadgVar, City city, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar2 = nufgyqmvbu.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar2.f127582yggfygwlhe = z13;
            iobyxmoadgVar2.f127581jyumaefscl = iobyxmoadgVar;
            iobyxmoadgVar2.f127580iwizpuwonk = city;
            return iobyxmoadgVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f127584yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f127585zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f127586yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f127587zdlpuopuiu;

            /* JADX INFO: renamed from: z10.nufgyqmvbu$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C3258iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f127589yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f127590zdlpuopuiu;

                public C3258iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f127590zdlpuopuiu = obj;
                    this.f127589yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2) {
                this.f127587zdlpuopuiu = nufgyqmvbuVar;
                this.f127586yggfygwlhe = nufgyqmvbuVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C3258iobyxmoadg c3258iobyxmoadg;
                if (gxszxtbevoVar instanceof C3258iobyxmoadg) {
                    c3258iobyxmoadg = (C3258iobyxmoadg) gxszxtbevoVar;
                    int i13 = c3258iobyxmoadg.f127589yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c3258iobyxmoadg.f127589yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c3258iobyxmoadg = new C3258iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c3258iobyxmoadg = new C3258iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c3258iobyxmoadg.f127590zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c3258iobyxmoadg.f127589yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f127587zdlpuopuiu;
                    City cityNufgyqmvbu = (City) obj;
                    if (cityNufgyqmvbu == null) {
                        cityNufgyqmvbu = this.f127586yggfygwlhe.nufgyqmvbu();
                        this.f127586yggfygwlhe.f127575eablkybsjg.zoijcleaow(new s20.zoijcleaow.iobyxmoadg(cityNufgyqmvbu));
                    }
                    c3258iobyxmoadg.f127589yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(cityNufgyqmvbu, c3258iobyxmoadg) == objGxszxtbevo) {
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
            this.f127585zdlpuopuiu = lqeggnwhkgVar;
            this.f127584yggfygwlhe = nufgyqmvbuVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f127585zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f127584yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(dxjokdxxww subscribeToLoggedInUseCase, s20.ppxfxbqfkf subscribeToChosenCityUseCase, f20.lqeggnwhkg subscribeToCartDeliveryDataUseCase, s20.zoijcleaow setChosenCityUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToChosenCityUseCase, "subscribeToChosenCityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartDeliveryDataUseCase, "subscribeToCartDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setChosenCityUseCase, "setChosenCityUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f127578zoijcleaow = subscribeToLoggedInUseCase;
        this.f127576ppxfxbqfkf = subscribeToChosenCityUseCase;
        this.f127577wkgbmnqykc = subscribeToCartDeliveryDataUseCase;
        this.f127575eablkybsjg = setChosenCityUseCase;
    }

    private final sj.lqeggnwhkg dxjokdxxww() {
        return this.f127578zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
    }

    private final sj.lqeggnwhkg gxszxtbevo() {
        return this.f127577wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
    }

    private final sj.lqeggnwhkg lqeggnwhkg() {
        return new zoijcleaow(this.f127576ppxfxbqfkf.wkgbmnqykc(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final City nufgyqmvbu() {
        return City.INSTANCE.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return sj.dxjokdxxww.vdvldrhtss(sj.dxjokdxxww.draadjrbmk(dxjokdxxww(), gxszxtbevo(), lqeggnwhkg(), new iobyxmoadg(null)));
    }
}
