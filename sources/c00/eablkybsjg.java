package c00;

import gg.wwaezpbzkn;
import java.util.List;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.DeliveryInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements w10.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dy.iobyxmoadg f17902iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final my.zoijcleaow f17903zoijcleaow;

    /* JADX INFO: renamed from: c00.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0327eablkybsjg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f17904yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f17905zdlpuopuiu;

        /* JADX INFO: renamed from: c00.eablkybsjg$eablkybsjg$iobyxmoadg */
        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f17906yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f17907zdlpuopuiu;

            /* JADX INFO: renamed from: c00.eablkybsjg$eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0328iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f17909yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f17910zdlpuopuiu;

                public C0328iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f17910zdlpuopuiu = obj;
                    this.f17909yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, eablkybsjg eablkybsjgVar) {
                this.f17907zdlpuopuiu = nufgyqmvbuVar;
                this.f17906yggfygwlhe = eablkybsjgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0328iobyxmoadg c0328iobyxmoadg;
                if (gxszxtbevoVar instanceof C0328iobyxmoadg) {
                    c0328iobyxmoadg = (C0328iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0328iobyxmoadg.f17909yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0328iobyxmoadg.f17909yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0328iobyxmoadg = new C0328iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0328iobyxmoadg = new C0328iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0328iobyxmoadg.f17910zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0328iobyxmoadg.f17909yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f17907zdlpuopuiu;
                    y00.iobyxmoadg iobyxmoadgVarAgtfadlqog = this.f17906yggfygwlhe.agtfadlqog((gy.zoijcleaow) obj);
                    c0328iobyxmoadg.f17909yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVarAgtfadlqog, c0328iobyxmoadg) == objGxszxtbevo) {
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

        public C0327eablkybsjg(sj.lqeggnwhkg lqeggnwhkgVar, eablkybsjg eablkybsjgVar) {
            this.f17905zdlpuopuiu = lqeggnwhkgVar;
            this.f17904yggfygwlhe = eablkybsjgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f17905zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f17904yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class gxszxtbevo implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f17911yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f17912zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f17913yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f17914zdlpuopuiu;

            /* JADX INFO: renamed from: c00.eablkybsjg$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0329iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f17916yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f17917zdlpuopuiu;

                public C0329iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f17917zdlpuopuiu = obj;
                    this.f17916yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, eablkybsjg eablkybsjgVar) {
                this.f17914zdlpuopuiu = nufgyqmvbuVar;
                this.f17913yggfygwlhe = eablkybsjgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0329iobyxmoadg c0329iobyxmoadg;
                if (gxszxtbevoVar instanceof C0329iobyxmoadg) {
                    c0329iobyxmoadg = (C0329iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0329iobyxmoadg.f17916yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0329iobyxmoadg.f17916yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0329iobyxmoadg = new C0329iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0329iobyxmoadg = new C0329iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0329iobyxmoadg.f17917zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0329iobyxmoadg.f17916yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f17914zdlpuopuiu;
                    DeliveryInfo deliveryInfoOjitshcjhn = this.f17913yggfygwlhe.ojitshcjhn((gy.zoijcleaow) obj);
                    c0329iobyxmoadg.f17916yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(deliveryInfoOjitshcjhn, c0329iobyxmoadg) == objGxszxtbevo) {
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

        public gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, eablkybsjg eablkybsjgVar) {
            this.f17912zdlpuopuiu = lqeggnwhkgVar;
            this.f17911yggfygwlhe = eablkybsjgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f17912zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f17911yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17918iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17920yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17921zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17920yggfygwlhe = obj;
            this.f17918iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(this);
        }
    }

    public static final class lqeggnwhkg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f17922yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f17923zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f17924yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f17925zdlpuopuiu;

            /* JADX INFO: renamed from: c00.eablkybsjg$lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0330iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f17927yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f17928zdlpuopuiu;

                public C0330iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f17928zdlpuopuiu = obj;
                    this.f17927yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, eablkybsjg eablkybsjgVar) {
                this.f17925zdlpuopuiu = nufgyqmvbuVar;
                this.f17924yggfygwlhe = eablkybsjgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0330iobyxmoadg c0330iobyxmoadg;
                if (gxszxtbevoVar instanceof C0330iobyxmoadg) {
                    c0330iobyxmoadg = (C0330iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0330iobyxmoadg.f17927yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0330iobyxmoadg.f17927yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0330iobyxmoadg = new C0330iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0330iobyxmoadg = new C0330iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0330iobyxmoadg.f17928zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0330iobyxmoadg.f17927yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f17925zdlpuopuiu;
                    t00.eablkybsjg eablkybsjgVarRgvfuqvkyq = this.f17924yggfygwlhe.rgvfuqvkyq((gy.zoijcleaow) obj);
                    c0330iobyxmoadg.f17927yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(eablkybsjgVarRgvfuqvkyq, c0330iobyxmoadg) == objGxszxtbevo) {
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

        public lqeggnwhkg(sj.lqeggnwhkg lqeggnwhkgVar, eablkybsjg eablkybsjgVar) {
            this.f17923zdlpuopuiu = lqeggnwhkgVar;
            this.f17922yggfygwlhe = eablkybsjgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f17923zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f17922yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17929iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17931yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17932zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17931yggfygwlhe = obj;
            this.f17929iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.eablkybsjg(this);
        }
    }

    public static final class wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f17933yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f17934zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f17935yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f17936zdlpuopuiu;

            /* JADX INFO: renamed from: c00.eablkybsjg$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0331iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f17938yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f17939zdlpuopuiu;

                public C0331iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f17939zdlpuopuiu = obj;
                    this.f17938yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, eablkybsjg eablkybsjgVar) {
                this.f17936zdlpuopuiu = nufgyqmvbuVar;
                this.f17935yggfygwlhe = eablkybsjgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0331iobyxmoadg c0331iobyxmoadg;
                if (gxszxtbevoVar instanceof C0331iobyxmoadg) {
                    c0331iobyxmoadg = (C0331iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0331iobyxmoadg.f17938yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0331iobyxmoadg.f17938yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0331iobyxmoadg = new C0331iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0331iobyxmoadg = new C0331iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0331iobyxmoadg.f17939zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0331iobyxmoadg.f17938yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f17936zdlpuopuiu;
                    List listEablkybsjg = this.f17935yggfygwlhe.f17903zoijcleaow.eablkybsjg((gy.zoijcleaow) obj);
                    c0331iobyxmoadg.f17938yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(listEablkybsjg, c0331iobyxmoadg) == objGxszxtbevo) {
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

        public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar, eablkybsjg eablkybsjgVar) {
            this.f17934zdlpuopuiu = lqeggnwhkgVar;
            this.f17933yggfygwlhe = eablkybsjgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f17934zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f17933yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17940iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17942yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17943zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17942yggfygwlhe = obj;
            this.f17940iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.nufgyqmvbu(this);
        }
    }

    public eablkybsjg(dy.iobyxmoadg cartDao, my.zoijcleaow cartEntityToDomainMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartDao, "cartDao");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartEntityToDomainMapper, "cartEntityToDomainMapper");
        this.f17902iobyxmoadg = cartDao;
        this.f17903zoijcleaow = cartEntityToDomainMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y00.iobyxmoadg agtfadlqog(gy.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar != null) {
            return this.f17903zoijcleaow.gxszxtbevo(zoijcleaowVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryInfo ojitshcjhn(gy.zoijcleaow zoijcleaowVar) {
        DeliveryInfo deliveryInfoLqeggnwhkg;
        return (zoijcleaowVar == null || (deliveryInfoLqeggnwhkg = this.f17903zoijcleaow.lqeggnwhkg(zoijcleaowVar)) == null) ? DeliveryInfo.INSTANCE.iobyxmoadg() : deliveryInfoLqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t00.eablkybsjg rgvfuqvkyq(gy.zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar != null ? new t00.eablkybsjg.zoijcleaow(this.f17903zoijcleaow.invoke(zoijcleaowVar)) : t00.eablkybsjg.iobyxmoadg.f109220iobyxmoadg;
    }

    private final sj.lqeggnwhkg vdvldrhtss() {
        return this.f17902iobyxmoadg.wkgbmnqykc();
    }

    @Override // w10.ppxfxbqfkf
    public Object dxjokdxxww(Cart cart, lg.gxszxtbevo gxszxtbevoVar) {
        Object objEablkybsjg = this.f17902iobyxmoadg.eablkybsjg(my.iobyxmoadg.ppxfxbqfkf(cart), gxszxtbevoVar);
        return objEablkybsjg == mg.zoijcleaow.gxszxtbevo() ? objEablkybsjg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.ppxfxbqfkf
    public Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        eablkybsjg eablkybsjgVar;
        DeliveryInfo deliveryInfoLqeggnwhkg;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f17929iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f17929iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f17931yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f17929iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            dy.iobyxmoadg iobyxmoadgVar = this.f17902iobyxmoadg;
            ppxfxbqfkfVar.f17932zdlpuopuiu = this;
            ppxfxbqfkfVar.f17929iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f17932zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        gy.zoijcleaow zoijcleaowVar = (gy.zoijcleaow) objIobyxmoadg;
        return (zoijcleaowVar == null || (deliveryInfoLqeggnwhkg = eablkybsjgVar.f17903zoijcleaow.lqeggnwhkg(zoijcleaowVar)) == null) ? DeliveryInfo.INSTANCE.iobyxmoadg() : deliveryInfoLqeggnwhkg;
    }

    @Override // w10.ppxfxbqfkf
    public sj.lqeggnwhkg gxszxtbevo() {
        return sj.dxjokdxxww.vdvldrhtss(new C0327eablkybsjg(vdvldrhtss(), this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // w10.ppxfxbqfkf
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        eablkybsjg eablkybsjgVar;
        Cart cart;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f17918iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f17918iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f17920yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f17918iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            dy.iobyxmoadg iobyxmoadgVar2 = this.f17902iobyxmoadg;
            iobyxmoadgVar.f17921zdlpuopuiu = this;
            iobyxmoadgVar.f17918iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) iobyxmoadgVar.f17921zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        gy.zoijcleaow zoijcleaowVar = (gy.zoijcleaow) objIobyxmoadg;
        return (zoijcleaowVar == null || (cart = (Cart) eablkybsjgVar.f17903zoijcleaow.invoke(zoijcleaowVar)) == null) ? new Cart(0L, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, 16776191, null) : cart;
    }

    @Override // w10.ppxfxbqfkf
    public sj.lqeggnwhkg lqeggnwhkg() {
        return sj.dxjokdxxww.vdvldrhtss(new wkgbmnqykc(vdvldrhtss(), this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.ppxfxbqfkf
    public Object nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f17940iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f17940iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f17942yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f17940iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            dy.iobyxmoadg iobyxmoadgVar = this.f17902iobyxmoadg;
            zoijcleaowVar.f17943zdlpuopuiu = this;
            zoijcleaowVar.f17940iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) zoijcleaowVar.f17943zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return eablkybsjgVar.agtfadlqog((gy.zoijcleaow) objIobyxmoadg);
    }

    @Override // w10.ppxfxbqfkf
    public sj.lqeggnwhkg ppxfxbqfkf() {
        return sj.dxjokdxxww.vdvldrhtss(new gxszxtbevo(vdvldrhtss(), this));
    }

    @Override // w10.ppxfxbqfkf
    public sj.lqeggnwhkg wkgbmnqykc() {
        return sj.dxjokdxxww.vdvldrhtss(new lqeggnwhkg(vdvldrhtss(), this));
    }

    @Override // w10.ppxfxbqfkf
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f17902iobyxmoadg.zoijcleaow(gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }
}
