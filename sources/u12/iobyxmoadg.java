package u12;

import dy.dxjokdxxww;
import fy.ScanGoProductEntity;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements e22.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f112492iobyxmoadg;

    /* JADX INFO: renamed from: u12.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2775iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112493jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112495zdlpuopuiu;

        C2775iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112495zdlpuopuiu = obj;
            this.f112493jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f112496zdlpuopuiu;

        /* JADX INFO: renamed from: u12.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2776iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f112497zdlpuopuiu;

            /* JADX INFO: renamed from: u12.iobyxmoadg$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2777iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f112499yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f112500zdlpuopuiu;

                public C2777iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f112500zdlpuopuiu = obj;
                    this.f112499yggfygwlhe |= Integer.MIN_VALUE;
                    return C2776iobyxmoadg.this.emit(null, this);
                }
            }

            public C2776iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f112497zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C2777iobyxmoadg c2777iobyxmoadg;
                if (gxszxtbevoVar instanceof C2777iobyxmoadg) {
                    c2777iobyxmoadg = (C2777iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2777iobyxmoadg.f112499yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2777iobyxmoadg.f112499yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2777iobyxmoadg = new C2777iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2777iobyxmoadg = new C2777iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2777iobyxmoadg.f112500zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2777iobyxmoadg.f112499yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f112497zdlpuopuiu;
                    ScanGoProductModel scanGoProductModelZoijcleaow = v12.zoijcleaow.zoijcleaow((ScanGoProductEntity) obj);
                    c2777iobyxmoadg.f112499yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(scanGoProductModelZoijcleaow, c2777iobyxmoadg) == objGxszxtbevo) {
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

        public ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar) {
            this.f112496zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f112496zdlpuopuiu.collect(new C2776iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f112501zdlpuopuiu;

        /* JADX INFO: renamed from: u12.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2778iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f112502zdlpuopuiu;

            /* JADX INFO: renamed from: u12.iobyxmoadg$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2779iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f112504yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f112505zdlpuopuiu;

                public C2779iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f112505zdlpuopuiu = obj;
                    this.f112504yggfygwlhe |= Integer.MIN_VALUE;
                    return C2778iobyxmoadg.this.emit(null, this);
                }
            }

            public C2778iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f112502zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C2779iobyxmoadg c2779iobyxmoadg;
                if (gxszxtbevoVar instanceof C2779iobyxmoadg) {
                    c2779iobyxmoadg = (C2779iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2779iobyxmoadg.f112504yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2779iobyxmoadg.f112504yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2779iobyxmoadg = new C2779iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2779iobyxmoadg = new C2779iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2779iobyxmoadg.f112505zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2779iobyxmoadg.f112504yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f112502zdlpuopuiu;
                    ScanGoCartModel scanGoCartModelIobyxmoadg = v12.zoijcleaow.iobyxmoadg((fy.ppxfxbqfkf) obj);
                    c2779iobyxmoadg.f112504yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(scanGoCartModelIobyxmoadg, c2779iobyxmoadg) == objGxszxtbevo) {
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

        public zoijcleaow(lqeggnwhkg lqeggnwhkgVar) {
            this.f112501zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f112501zdlpuopuiu.collect(new C2778iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public iobyxmoadg(dxjokdxxww scanGoDao) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoDao, "scanGoDao");
        this.f112492iobyxmoadg = scanGoDao;
    }

    @Override // e22.iobyxmoadg
    public Object eablkybsjg(ScanGoCartModel scanGoCartModel, gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = w12.iobyxmoadg.zoijcleaow(this.f112492iobyxmoadg, v12.iobyxmoadg.iobyxmoadg(scanGoCartModel), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e22.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        C2775iobyxmoadg c2775iobyxmoadg;
        if (gxszxtbevoVar instanceof C2775iobyxmoadg) {
            c2775iobyxmoadg = (C2775iobyxmoadg) gxszxtbevoVar;
            int i13 = c2775iobyxmoadg.f112493jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2775iobyxmoadg.f112493jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2775iobyxmoadg = new C2775iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2775iobyxmoadg = new C2775iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2775iobyxmoadg.f112495zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2775iobyxmoadg.f112493jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            dxjokdxxww dxjokdxxwwVar = this.f112492iobyxmoadg;
            c2775iobyxmoadg.f112493jyumaefscl = 1;
            objIobyxmoadg = dxjokdxxwwVar.iobyxmoadg(c2775iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        fy.ppxfxbqfkf ppxfxbqfkfVar = (fy.ppxfxbqfkf) objIobyxmoadg;
        if (ppxfxbqfkfVar == null) {
            ppxfxbqfkfVar = new fy.ppxfxbqfkf(0, null, 0L, null, 0.0d, 0, null, null, null, 511, null);
        }
        return v12.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar);
    }

    @Override // e22.iobyxmoadg
    public lqeggnwhkg ppxfxbqfkf(int i13) {
        return new ppxfxbqfkf(sj.dxjokdxxww.lereixgezr(this.f112492iobyxmoadg.ppxfxbqfkf(i13)));
    }

    @Override // e22.iobyxmoadg
    public lqeggnwhkg wkgbmnqykc() {
        return new zoijcleaow(this.f112492iobyxmoadg.wkgbmnqykc());
    }

    @Override // e22.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = w12.iobyxmoadg.iobyxmoadg(this.f112492iobyxmoadg, gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
    }
}
