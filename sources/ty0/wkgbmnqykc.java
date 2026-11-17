package ty0;

import gg.wwaezpbzkn;
import java.util.List;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.DeliveryInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements k01.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yw0.iobyxmoadg f112101iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hx0.zoijcleaow f112102zoijcleaow;

    public static final class eablkybsjg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f112103yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f112104zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f112105yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f112106zdlpuopuiu;

            /* JADX INFO: renamed from: ty0.wkgbmnqykc$eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2757iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f112108yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f112109zdlpuopuiu;

                public C2757iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f112109zdlpuopuiu = obj;
                    this.f112108yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, wkgbmnqykc wkgbmnqykcVar) {
                this.f112106zdlpuopuiu = nufgyqmvbuVar;
                this.f112105yggfygwlhe = wkgbmnqykcVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2757iobyxmoadg c2757iobyxmoadg;
                if (gxszxtbevoVar instanceof C2757iobyxmoadg) {
                    c2757iobyxmoadg = (C2757iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2757iobyxmoadg.f112108yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2757iobyxmoadg.f112108yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2757iobyxmoadg = new C2757iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2757iobyxmoadg = new C2757iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2757iobyxmoadg.f112109zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2757iobyxmoadg.f112108yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f112106zdlpuopuiu;
                    pz0.iobyxmoadg iobyxmoadgVarAgtfadlqog = this.f112105yggfygwlhe.agtfadlqog((bx0.zoijcleaow) obj);
                    c2757iobyxmoadg.f112108yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVarAgtfadlqog, c2757iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public eablkybsjg(sj.lqeggnwhkg lqeggnwhkgVar, wkgbmnqykc wkgbmnqykcVar) {
            this.f112104zdlpuopuiu = lqeggnwhkgVar;
            this.f112103yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f112104zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f112103yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f112110yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f112111zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f112112yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f112113zdlpuopuiu;

            /* JADX INFO: renamed from: ty0.wkgbmnqykc$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2758iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f112115yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f112116zdlpuopuiu;

                public C2758iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f112116zdlpuopuiu = obj;
                    this.f112115yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, wkgbmnqykc wkgbmnqykcVar) {
                this.f112113zdlpuopuiu = nufgyqmvbuVar;
                this.f112112yggfygwlhe = wkgbmnqykcVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2758iobyxmoadg c2758iobyxmoadg;
                if (gxszxtbevoVar instanceof C2758iobyxmoadg) {
                    c2758iobyxmoadg = (C2758iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2758iobyxmoadg.f112115yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2758iobyxmoadg.f112115yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2758iobyxmoadg = new C2758iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2758iobyxmoadg = new C2758iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2758iobyxmoadg.f112116zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2758iobyxmoadg.f112115yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f112113zdlpuopuiu;
                    DeliveryInfo deliveryInfoOjitshcjhn = this.f112112yggfygwlhe.ojitshcjhn((bx0.zoijcleaow) obj);
                    c2758iobyxmoadg.f112115yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(deliveryInfoOjitshcjhn, c2758iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, wkgbmnqykc wkgbmnqykcVar) {
            this.f112111zdlpuopuiu = lqeggnwhkgVar;
            this.f112110yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f112111zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f112110yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112117iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112119yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112120zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112119yggfygwlhe = obj;
            this.f112117iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(this);
        }
    }

    public static final class lqeggnwhkg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f112121yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f112122zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f112123yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f112124zdlpuopuiu;

            /* JADX INFO: renamed from: ty0.wkgbmnqykc$lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2759iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f112126yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f112127zdlpuopuiu;

                public C2759iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f112127zdlpuopuiu = obj;
                    this.f112126yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, wkgbmnqykc wkgbmnqykcVar) {
                this.f112124zdlpuopuiu = nufgyqmvbuVar;
                this.f112123yggfygwlhe = wkgbmnqykcVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2759iobyxmoadg c2759iobyxmoadg;
                if (gxszxtbevoVar instanceof C2759iobyxmoadg) {
                    c2759iobyxmoadg = (C2759iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2759iobyxmoadg.f112126yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2759iobyxmoadg.f112126yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2759iobyxmoadg = new C2759iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2759iobyxmoadg = new C2759iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2759iobyxmoadg.f112127zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2759iobyxmoadg.f112126yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f112124zdlpuopuiu;
                    kz0.eablkybsjg eablkybsjgVarRgvfuqvkyq = this.f112123yggfygwlhe.rgvfuqvkyq((bx0.zoijcleaow) obj);
                    c2759iobyxmoadg.f112126yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(eablkybsjgVarRgvfuqvkyq, c2759iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public lqeggnwhkg(sj.lqeggnwhkg lqeggnwhkgVar, wkgbmnqykc wkgbmnqykcVar) {
            this.f112122zdlpuopuiu = lqeggnwhkgVar;
            this.f112121yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f112122zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f112121yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112128iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112130yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112131zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112130yggfygwlhe = obj;
            this.f112128iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.eablkybsjg(this);
        }
    }

    /* JADX INFO: renamed from: ty0.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2760wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f112132yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f112133zdlpuopuiu;

        /* JADX INFO: renamed from: ty0.wkgbmnqykc$wkgbmnqykc$iobyxmoadg */
        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f112134yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f112135zdlpuopuiu;

            /* JADX INFO: renamed from: ty0.wkgbmnqykc$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2761iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f112137yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f112138zdlpuopuiu;

                public C2761iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f112138zdlpuopuiu = obj;
                    this.f112137yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, wkgbmnqykc wkgbmnqykcVar) {
                this.f112135zdlpuopuiu = nufgyqmvbuVar;
                this.f112134yggfygwlhe = wkgbmnqykcVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2761iobyxmoadg c2761iobyxmoadg;
                if (gxszxtbevoVar instanceof C2761iobyxmoadg) {
                    c2761iobyxmoadg = (C2761iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2761iobyxmoadg.f112137yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2761iobyxmoadg.f112137yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2761iobyxmoadg = new C2761iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2761iobyxmoadg = new C2761iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2761iobyxmoadg.f112138zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2761iobyxmoadg.f112137yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f112135zdlpuopuiu;
                    List listZoijcleaow = this.f112134yggfygwlhe.f112102zoijcleaow.zoijcleaow((bx0.zoijcleaow) obj);
                    c2761iobyxmoadg.f112137yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listZoijcleaow, c2761iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public C2760wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar, wkgbmnqykc wkgbmnqykcVar) {
            this.f112133zdlpuopuiu = lqeggnwhkgVar;
            this.f112132yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f112133zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f112132yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112139iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112141yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112142zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112141yggfygwlhe = obj;
            this.f112139iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.nufgyqmvbu(this);
        }
    }

    public wkgbmnqykc(yw0.iobyxmoadg cartDao, hx0.zoijcleaow cartEntityToDomainMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartDao, "cartDao");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartEntityToDomainMapper, "cartEntityToDomainMapper");
        this.f112101iobyxmoadg = cartDao;
        this.f112102zoijcleaow = cartEntityToDomainMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pz0.iobyxmoadg agtfadlqog(bx0.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar != null) {
            return this.f112102zoijcleaow.ppxfxbqfkf(zoijcleaowVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryInfo ojitshcjhn(bx0.zoijcleaow zoijcleaowVar) {
        DeliveryInfo deliveryInfoEablkybsjg;
        return (zoijcleaowVar == null || (deliveryInfoEablkybsjg = this.f112102zoijcleaow.eablkybsjg(zoijcleaowVar)) == null) ? DeliveryInfo.INSTANCE.iobyxmoadg() : deliveryInfoEablkybsjg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kz0.eablkybsjg rgvfuqvkyq(bx0.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar != null ? new kz0.eablkybsjg.zoijcleaow(this.f112102zoijcleaow.invoke(zoijcleaowVar)) : kz0.eablkybsjg.iobyxmoadg.f61162iobyxmoadg;
    }

    private final sj.lqeggnwhkg vdvldrhtss() {
        return this.f112101iobyxmoadg.wkgbmnqykc();
    }

    @Override // k01.ppxfxbqfkf
    public Object dxjokdxxww(Cart cart, lg.gxszxtbevo gxszxtbevoVar) {
        Object objPpxfxbqfkf = this.f112101iobyxmoadg.ppxfxbqfkf(hx0.iobyxmoadg.ppxfxbqfkf(cart), gxszxtbevoVar);
        return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.ppxfxbqfkf
    public Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        wkgbmnqykc wkgbmnqykcVar;
        DeliveryInfo deliveryInfoEablkybsjg;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f112128iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f112128iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f112130yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f112128iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            yw0.iobyxmoadg iobyxmoadgVar = this.f112101iobyxmoadg;
            ppxfxbqfkfVar.f112131zdlpuopuiu = this;
            ppxfxbqfkfVar.f112128iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wkgbmnqykcVar = (wkgbmnqykc) ppxfxbqfkfVar.f112131zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        bx0.zoijcleaow zoijcleaowVar = (bx0.zoijcleaow) objIobyxmoadg;
        return (zoijcleaowVar == null || (deliveryInfoEablkybsjg = wkgbmnqykcVar.f112102zoijcleaow.eablkybsjg(zoijcleaowVar)) == null) ? DeliveryInfo.INSTANCE.iobyxmoadg() : deliveryInfoEablkybsjg;
    }

    @Override // k01.ppxfxbqfkf
    public sj.lqeggnwhkg gxszxtbevo() {
        return sj.dxjokdxxww.vdvldrhtss(new eablkybsjg(vdvldrhtss(), this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // k01.ppxfxbqfkf
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        wkgbmnqykc wkgbmnqykcVar;
        Cart cart;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f112117iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112117iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f112119yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f112117iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            yw0.iobyxmoadg iobyxmoadgVar2 = this.f112101iobyxmoadg;
            iobyxmoadgVar.f112120zdlpuopuiu = this;
            iobyxmoadgVar.f112117iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVar.f112120zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        bx0.zoijcleaow zoijcleaowVar = (bx0.zoijcleaow) objIobyxmoadg;
        return (zoijcleaowVar == null || (cart = (Cart) wkgbmnqykcVar.f112102zoijcleaow.invoke(zoijcleaowVar)) == null) ? new Cart(0L, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, 16776191, null) : cart;
    }

    @Override // k01.ppxfxbqfkf
    public sj.lqeggnwhkg lqeggnwhkg() {
        return sj.dxjokdxxww.vdvldrhtss(new C2760wkgbmnqykc(vdvldrhtss(), this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.ppxfxbqfkf
    public Object nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112139iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112139iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f112141yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112139iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            yw0.iobyxmoadg iobyxmoadgVar = this.f112101iobyxmoadg;
            zoijcleaowVar.f112142zdlpuopuiu = this;
            zoijcleaowVar.f112139iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wkgbmnqykcVar = (wkgbmnqykc) zoijcleaowVar.f112142zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return wkgbmnqykcVar.agtfadlqog((bx0.zoijcleaow) objIobyxmoadg);
    }

    @Override // k01.ppxfxbqfkf
    public sj.lqeggnwhkg ppxfxbqfkf() {
        return sj.dxjokdxxww.vdvldrhtss(new gxszxtbevo(vdvldrhtss(), this));
    }

    @Override // k01.ppxfxbqfkf
    public sj.lqeggnwhkg wkgbmnqykc() {
        return sj.dxjokdxxww.vdvldrhtss(new lqeggnwhkg(vdvldrhtss(), this));
    }

    @Override // k01.ppxfxbqfkf
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f112101iobyxmoadg.zoijcleaow(gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }
}
