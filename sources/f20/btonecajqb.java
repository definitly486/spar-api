package f20;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.pkzmftpjix;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Double f32598ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f32599zoijcleaow;

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f32600zdlpuopuiu;

        /* JADX INFO: renamed from: f20.btonecajqb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0709iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f32601zdlpuopuiu;

            /* JADX INFO: renamed from: f20.btonecajqb$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0710iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f32603yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f32604zdlpuopuiu;

                public C0710iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f32604zdlpuopuiu = obj;
                    this.f32603yggfygwlhe |= Integer.MIN_VALUE;
                    return C0709iobyxmoadg.this.emit(null, this);
                }
            }

            public C0709iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f32601zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0710iobyxmoadg c0710iobyxmoadg;
                if (gxszxtbevoVar instanceof C0710iobyxmoadg) {
                    c0710iobyxmoadg = (C0710iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0710iobyxmoadg.f32603yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0710iobyxmoadg.f32603yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0710iobyxmoadg = new C0710iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0710iobyxmoadg = new C0710iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0710iobyxmoadg.f32604zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0710iobyxmoadg.f32603yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f32601zdlpuopuiu;
                    Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((e10.iobyxmoadg) obj).rgvfuqvkyq().ppxfxbqfkf());
                    c0710iobyxmoadg.f32603yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(dZoijcleaow, c0710iobyxmoadg) == objGxszxtbevo) {
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

        public iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f32600zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f32600zdlpuopuiu.collect(new C0709iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ btonecajqb f32605iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f32606jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f32607yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f32608zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ btonecajqb f32609yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f32610zdlpuopuiu;

            /* JADX INFO: renamed from: f20.btonecajqb$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0711iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f32612yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f32613zdlpuopuiu;

                public C0711iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f32613zdlpuopuiu = obj;
                    this.f32612yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, btonecajqb btonecajqbVar) {
                this.f32609yggfygwlhe = btonecajqbVar;
                this.f32610zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0711iobyxmoadg c0711iobyxmoadg;
                if (gxszxtbevoVar instanceof C0711iobyxmoadg) {
                    c0711iobyxmoadg = (C0711iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0711iobyxmoadg.f32612yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0711iobyxmoadg.f32612yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0711iobyxmoadg = new C0711iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0711iobyxmoadg = new C0711iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0711iobyxmoadg.f32613zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0711iobyxmoadg.f32612yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f32610zdlpuopuiu;
                    double dDoubleValue = ((Number) obj).doubleValue();
                    if (this.f32609yggfygwlhe.f32598ppxfxbqfkf == null) {
                        this.f32609yggfygwlhe.f32598ppxfxbqfkf = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(dDoubleValue);
                    } else {
                        Double d13 = this.f32609yggfygwlhe.f32598ppxfxbqfkf;
                        if (dDoubleValue > (d13 != null ? d13.doubleValue() : 0.0d)) {
                            Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(dDoubleValue);
                            c0711iobyxmoadg.f32612yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(dZoijcleaow, c0711iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar, btonecajqb btonecajqbVar) {
            super(2, gxszxtbevoVar);
            this.f32606jyumaefscl = lqeggnwhkgVar;
            this.f32605iwizpuwonk = btonecajqbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f32606jyumaefscl, gxszxtbevoVar, this.f32605iwizpuwonk);
            zoijcleaowVar.f32607yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f32608zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f32607yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVar = this.f32606jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(nufgyqmvbuVar, this.f32605iwizpuwonk);
                this.f32608zdlpuopuiu = 1;
                if (lqeggnwhkgVar.collect(iobyxmoadgVar, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(w10.nufgyqmvbu orderLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f32599zoijcleaow = orderLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(String orderId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
        return sj.dxjokdxxww.vdvldrhtss(sj.dxjokdxxww.wwaezpbzkn(new zoijcleaow(new iobyxmoadg(this.f32599zoijcleaow.eablkybsjg(orderId)), null, this)));
    }
}
