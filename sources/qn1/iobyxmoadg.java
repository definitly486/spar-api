package qn1;

import ax0.ScanGoProductEntity;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import yw0.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements ao1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f79221iobyxmoadg;

    /* JADX INFO: renamed from: qn1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1773iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f79222jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f79224zdlpuopuiu;

        C1773iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f79224zdlpuopuiu = obj;
            this.f79222jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f79225zdlpuopuiu;

        /* JADX INFO: renamed from: qn1.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1774iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f79226zdlpuopuiu;

            /* JADX INFO: renamed from: qn1.iobyxmoadg$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1775iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f79228yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f79229zdlpuopuiu;

                public C1775iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f79229zdlpuopuiu = obj;
                    this.f79228yggfygwlhe |= Integer.MIN_VALUE;
                    return C1774iobyxmoadg.this.emit(null, this);
                }
            }

            public C1774iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f79226zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C1775iobyxmoadg c1775iobyxmoadg;
                if (gxszxtbevoVar instanceof C1775iobyxmoadg) {
                    c1775iobyxmoadg = (C1775iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1775iobyxmoadg.f79228yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1775iobyxmoadg.f79228yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1775iobyxmoadg = new C1775iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1775iobyxmoadg = new C1775iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1775iobyxmoadg.f79229zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1775iobyxmoadg.f79228yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f79226zdlpuopuiu;
                    ScanGoProductModel scanGoProductModelZoijcleaow = rn1.zoijcleaow.zoijcleaow((ScanGoProductEntity) obj);
                    c1775iobyxmoadg.f79228yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(scanGoProductModelZoijcleaow, c1775iobyxmoadg) == objGxszxtbevo) {
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
            this.f79225zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f79225zdlpuopuiu.collect(new C1774iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f79230zdlpuopuiu;

        /* JADX INFO: renamed from: qn1.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1776iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f79231zdlpuopuiu;

            /* JADX INFO: renamed from: qn1.iobyxmoadg$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1777iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f79233yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f79234zdlpuopuiu;

                public C1777iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f79234zdlpuopuiu = obj;
                    this.f79233yggfygwlhe |= Integer.MIN_VALUE;
                    return C1776iobyxmoadg.this.emit(null, this);
                }
            }

            public C1776iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f79231zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C1777iobyxmoadg c1777iobyxmoadg;
                if (gxszxtbevoVar instanceof C1777iobyxmoadg) {
                    c1777iobyxmoadg = (C1777iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1777iobyxmoadg.f79233yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1777iobyxmoadg.f79233yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1777iobyxmoadg = new C1777iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1777iobyxmoadg = new C1777iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1777iobyxmoadg.f79234zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1777iobyxmoadg.f79233yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f79231zdlpuopuiu;
                    ScanGoCartModel scanGoCartModelIobyxmoadg = rn1.zoijcleaow.iobyxmoadg((ax0.ppxfxbqfkf) obj);
                    c1777iobyxmoadg.f79233yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(scanGoCartModelIobyxmoadg, c1777iobyxmoadg) == objGxszxtbevo) {
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
            this.f79230zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f79230zdlpuopuiu.collect(new C1776iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public iobyxmoadg(dxjokdxxww scanGoDao) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoDao, "scanGoDao");
        this.f79221iobyxmoadg = scanGoDao;
    }

    @Override // ao1.iobyxmoadg
    public Object eablkybsjg(ScanGoCartModel scanGoCartModel, gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = sn1.iobyxmoadg.zoijcleaow(this.f79221iobyxmoadg, rn1.iobyxmoadg.iobyxmoadg(scanGoCartModel), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ao1.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        C1773iobyxmoadg c1773iobyxmoadg;
        if (gxszxtbevoVar instanceof C1773iobyxmoadg) {
            c1773iobyxmoadg = (C1773iobyxmoadg) gxszxtbevoVar;
            int i13 = c1773iobyxmoadg.f79222jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1773iobyxmoadg.f79222jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1773iobyxmoadg = new C1773iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1773iobyxmoadg = new C1773iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1773iobyxmoadg.f79224zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1773iobyxmoadg.f79222jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            dxjokdxxww dxjokdxxwwVar = this.f79221iobyxmoadg;
            c1773iobyxmoadg.f79222jyumaefscl = 1;
            objIobyxmoadg = dxjokdxxwwVar.iobyxmoadg(c1773iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        ax0.ppxfxbqfkf ppxfxbqfkfVar = (ax0.ppxfxbqfkf) objIobyxmoadg;
        if (ppxfxbqfkfVar == null) {
            ppxfxbqfkfVar = new ax0.ppxfxbqfkf(0, null, 0L, null, 0.0d, 0, null, null, null, 511, null);
        }
        return rn1.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar);
    }

    @Override // ao1.iobyxmoadg
    public lqeggnwhkg ppxfxbqfkf(int i13) {
        return new ppxfxbqfkf(sj.dxjokdxxww.lereixgezr(this.f79221iobyxmoadg.ppxfxbqfkf(i13)));
    }

    @Override // ao1.iobyxmoadg
    public lqeggnwhkg wkgbmnqykc() {
        return new zoijcleaow(this.f79221iobyxmoadg.wkgbmnqykc());
    }

    @Override // ao1.iobyxmoadg
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = sn1.iobyxmoadg.iobyxmoadg(this.f79221iobyxmoadg, gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
    }
}
