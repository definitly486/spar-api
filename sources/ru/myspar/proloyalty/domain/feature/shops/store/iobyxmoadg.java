package ru.myspar.proloyalty.domain.feature.shops.store;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.CameraPosition;
import ru.myspar.proloyalty.core.domain.models.VisibleRegion;
import ru.myspar.proloyalty.core.domain.models.shop.Shop;
import ru.myspar.proloyalty.core.domain.models.shop.ShopService;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final C2244iobyxmoadg f95729agtfadlqog = new C2244iobyxmoadg(null);

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final int f95730ojitshcjhn = 8;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final zg.btonecajqb f95731rgvfuqvkyq = new zg.btonecajqb(0, 4);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final n11.wkgbmnqykc f95732btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final n01.zoijcleaow f95733draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final n11.lqeggnwhkg f95734dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final n01.iobyxmoadg f95735eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final i01.lqeggnwhkg f95736gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final n01.ppxfxbqfkf f95737gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final n11.gxszxtbevo f95738lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final n11.eablkybsjg f95739nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f95740ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ur0.iobyxmoadg f95741wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final eq1.zoijcleaow f95742wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f95743iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95745yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95746zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95745yggfygwlhe = obj;
            this.f95743iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rhgxfdycjh(this);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f95747cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f95749jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f95750yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95751zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95749jyumaefscl = obj;
            this.f95747cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.grlcpdaxtj(this);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95752yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95753zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95753zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f95752yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar);
            cqumvgiudrVar.f95752yggfygwlhe = th2;
            return cqumvgiudrVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f95754iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95756yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95757zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95756yggfygwlhe = obj;
            this.f95754iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jrbgnlbqoe(this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Exception f95758jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95760zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(Exception exc, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f95758jyumaefscl = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new dxjokdxxww(this.f95758jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95760zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.eablkybsjg(false));
            iobyxmoadg.this.crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.nufgyqmvbu(this.f95758jyumaefscl));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95762zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f95762zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f95762zdlpuopuiu = 1;
                if (iobyxmoadgVar.yzdjzghtvl(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f95763cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f95765jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f95766yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95767zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95765jyumaefscl = obj;
            this.f95763cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.v(null, null, null, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f95768cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f95770iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f95771jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f95772lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f95773yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95774zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95768cqumvgiudr = obj;
            this.f95772lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.mhtqkkgtqm(false, null, null, null, null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f95775jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc f95776yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95777zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f95776yggfygwlhe = wkgbmnqykcVar;
            this.f95775jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f95776yggfygwlhe, this.f95775jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f95777zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc wkgbmnqykcVar = this.f95776yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.zoijcleaow.f95859iobyxmoadg)) {
                    this.f95775jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.iobyxmoadg.f95704iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.C2252wkgbmnqykc.f95858iobyxmoadg)) {
                    this.f95775jyumaefscl.c();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.nufgyqmvbu.f95853iobyxmoadg)) {
                    this.f95775jyumaefscl.f();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.wflxmlrfwp.f95857iobyxmoadg)) {
                    this.f95775jyumaefscl.h(true);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.draadjrbmk.f95843iobyxmoadg)) {
                    iobyxmoadg.i(this.f95775jyumaefscl, false, 1, null);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.ppxfxbqfkf.f95855iobyxmoadg)) {
                    this.f95775jyumaefscl.crxdokpmqz(ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.C2242eablkybsjg.f95701iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.agtfadlqog.f95840iobyxmoadg)) {
                    this.f95775jyumaefscl.ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.dxjokdxxww(false));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.lqeggnwhkg.f95852iobyxmoadg)) {
                    this.f95775jyumaefscl.p();
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo) {
                    iobyxmoadg iobyxmoadgVar = this.f95775jyumaefscl;
                    VisibleRegion visibleRegionIobyxmoadg = ((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo) this.f95776yggfygwlhe).iobyxmoadg();
                    LocationData locationDataZoijcleaow = ((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo) this.f95776yggfygwlhe).zoijcleaow();
                    boolean zPpxfxbqfkf = ((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo) this.f95776yggfygwlhe).ppxfxbqfkf();
                    this.f95777zdlpuopuiu = 1;
                    if (iobyxmoadgVar.e(visibleRegionIobyxmoadg, locationDataZoijcleaow, zPpxfxbqfkf, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.dxjokdxxww) {
                    this.f95775jyumaefscl.crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.dxjokdxxww(((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.dxjokdxxww) this.f95776yggfygwlhe).iobyxmoadg()));
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.btonecajqb) {
                    this.f95775jyumaefscl.g(((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.btonecajqb) this.f95776yggfygwlhe).iobyxmoadg(), ((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.btonecajqb) this.f95776yggfygwlhe).zoijcleaow());
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.iobyxmoadg) {
                    this.f95775jyumaefscl.d(((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.iobyxmoadg) this.f95776yggfygwlhe).iobyxmoadg(), ((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.iobyxmoadg) this.f95776yggfygwlhe).zoijcleaow());
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.ojitshcjhn) {
                    iobyxmoadg iobyxmoadgVar2 = this.f95775jyumaefscl;
                    VisibleRegion visibleRegionIobyxmoadg2 = ((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.ojitshcjhn) this.f95776yggfygwlhe).iobyxmoadg();
                    this.f95777zdlpuopuiu = 2;
                    if (iobyxmoadg.x(iobyxmoadgVar2, visibleRegionIobyxmoadg2, null, null, this, 6, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.rgvfuqvkyq) {
                    this.f95775jyumaefscl.w(State.zoijcleaow.MAP);
                } else if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.eablkybsjg) {
                    this.f95775jyumaefscl.r(((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.eablkybsjg) this.f95776yggfygwlhe).iobyxmoadg());
                } else {
                    if (!(wkgbmnqykcVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gtknphoqwx)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f95775jyumaefscl.s(((ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gtknphoqwx) this.f95776yggfygwlhe).iobyxmoadg());
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2244iobyxmoadg {
        public /* synthetic */ C2244iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2244iobyxmoadg() {
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95779yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95780zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iwizpuwonk iwizpuwonkVar = iobyxmoadg.this.new iwizpuwonk(gxszxtbevoVar);
            iwizpuwonkVar.f95779yggfygwlhe = obj;
            return iwizpuwonkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f95780zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            i01.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = (i01.lqeggnwhkg.iobyxmoadg) ((gg.vdvldrhtss) this.f95779yggfygwlhe).wkgbmnqykc();
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
            List listIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (listIobyxmoadg == null) {
                listIobyxmoadg = hg.jyumaefscl.wflxmlrfwp();
            }
            iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.btonecajqb(listIobyxmoadg));
            iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
            this.f95780zdlpuopuiu = 1;
            if (iobyxmoadgVar3.grlcpdaxtj(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
            this.f95780zdlpuopuiu = 2;
            if (iobyxmoadgVar4.ixidwrxhsl(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iwizpuwonk) create(vdvldrhtssVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f95781jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f95782yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95783zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), (i01.lqeggnwhkg.iobyxmoadg) obj2, (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95783zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = this.f95782yggfygwlhe;
            return gg.cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13), (i01.lqeggnwhkg.iobyxmoadg) this.f95781jyumaefscl);
        }

        public final Object ojitshcjhn(boolean z13, i01.lqeggnwhkg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f95782yggfygwlhe = z13;
            jyumaefsclVar.f95781jyumaefscl = iobyxmoadgVar;
            return jyumaefsclVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class kcexrzcfyt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f95784zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg$kcexrzcfyt$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2245iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f95785zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg$kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2246iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f95787yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f95788zdlpuopuiu;

                public C2246iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f95788zdlpuopuiu = obj;
                    this.f95787yggfygwlhe |= Integer.MIN_VALUE;
                    return C2245iobyxmoadg.this.emit(null, this);
                }
            }

            public C2245iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f95785zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2246iobyxmoadg c2246iobyxmoadg;
                if (gxszxtbevoVar instanceof C2246iobyxmoadg) {
                    c2246iobyxmoadg = (C2246iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2246iobyxmoadg.f95787yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2246iobyxmoadg.f95787yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2246iobyxmoadg = new C2246iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2246iobyxmoadg = new C2246iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2246iobyxmoadg.f95788zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2246iobyxmoadg.f95787yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f95785zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c2246iobyxmoadg.f95787yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2246iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
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

        public kcexrzcfyt(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f95784zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f95784zdlpuopuiu.collect(new C2245iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f95789cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f95791jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f95792yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95793zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95791jyumaefscl = obj;
            this.f95789cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.hszhottldk(this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f95794jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ LocationData f95795yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95796zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(LocationData locationData, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f95795yggfygwlhe = locationData;
            this.f95794jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f95795yggfygwlhe, this.f95794jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f95796zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                LocationData locationData = this.f95795yggfygwlhe;
                if (locationData != null) {
                    this.f95794jyumaefscl.m(locationData);
                } else {
                    iobyxmoadg iobyxmoadgVar = this.f95794jyumaefscl;
                    this.f95796zdlpuopuiu = 1;
                    if (iobyxmoadgVar.fmlbqenlif(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f95797cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f95799iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f95800jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f95801lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f95802yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95803zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95797cqumvgiudr = obj;
            this.f95801lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.yzdjzghtvl(this);
        }
    }

    static final class oxmwwwfdhm implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ h01.eablkybsjg f95804yggfygwlhe;

        oxmwwwfdhm(h01.eablkybsjg eablkybsjgVar) {
            this.f95804yggfygwlhe = eablkybsjgVar;
        }

        @Override // sj.nufgyqmvbu
        public /* bridge */ /* synthetic */ Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow(((Boolean) obj).booleanValue(), gxszxtbevoVar);
        }

        public final Object zoijcleaow(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            if (iobyxmoadg.iwxlajgraz(iobyxmoadg.this).getFlow() == ShopsArgs.zoijcleaow.SPECIAL_BANNER) {
                iobyxmoadg.this.b(this.f95804yggfygwlhe);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f95806iobyxmoadg;

        static {
            int[] iArr = new int[ShopsArgs.zoijcleaow.values().length];
            try {
                iArr[ShopsArgs.zoijcleaow.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopsArgs.zoijcleaow.SPECIAL_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f95806iobyxmoadg = iArr;
        }
    }

    public static final class rgvfuqvkyq implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f95807zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg$rgvfuqvkyq$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2247iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f95808zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg$rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2248iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f95810yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f95811zdlpuopuiu;

                public C2248iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f95811zdlpuopuiu = obj;
                    this.f95810yggfygwlhe |= Integer.MIN_VALUE;
                    return C2247iobyxmoadg.this.emit(null, this);
                }
            }

            public C2247iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f95808zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2248iobyxmoadg c2248iobyxmoadg;
                if (gxszxtbevoVar instanceof C2248iobyxmoadg) {
                    c2248iobyxmoadg = (C2248iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2248iobyxmoadg.f95810yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2248iobyxmoadg.f95810yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2248iobyxmoadg = new C2248iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2248iobyxmoadg = new C2248iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2248iobyxmoadg.f95811zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2248iobyxmoadg.f95810yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f95808zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c2248iobyxmoadg.f95810yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2248iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
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

        public rgvfuqvkyq(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f95807zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f95807zdlpuopuiu.collect(new C2247iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f95812cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f95814jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f95815yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95816zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95814jyumaefscl = obj;
            this.f95812cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.j(null, this);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f95817iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f95819yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f95820zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f95819yggfygwlhe = obj;
            this.f95817iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.fmlbqenlif(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95822zdlpuopuiu;

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
            int i13 = this.f95822zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ur0.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f95741wflxmlrfwp;
                String name = iobyxmoadg.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                List listI = hg.agtfadlqog.i(iobyxmoadg.this.f95742wkgbmnqykc.zoijcleaow());
                this.f95822zdlpuopuiu = 1;
                obj = iobyxmoadgVar.ppxfxbqfkf(name, listI, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            ur0.ppxfxbqfkf ppxfxbqfkfVar = (ur0.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.zoijcleaow) {
                iobyxmoadg.this.fiwbwshyhd();
            } else {
                if (!(ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.n(iobyxmoadg.this, null, 1, null);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f95823yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f95824zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg$yggfygwlhe$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2249iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f95825yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f95826zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2250iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f95828yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f95829zdlpuopuiu;

                public C2250iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f95829zdlpuopuiu = obj;
                    this.f95828yggfygwlhe |= Integer.MIN_VALUE;
                    return C2249iobyxmoadg.this.emit(null, this);
                }
            }

            public C2249iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f95826zdlpuopuiu = nufgyqmvbuVar;
                this.f95825yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2250iobyxmoadg c2250iobyxmoadg;
                if (gxszxtbevoVar instanceof C2250iobyxmoadg) {
                    c2250iobyxmoadg = (C2250iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2250iobyxmoadg.f95828yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2250iobyxmoadg.f95828yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2250iobyxmoadg = new C2250iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2250iobyxmoadg = new C2250iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2250iobyxmoadg.f95829zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2250iobyxmoadg.f95828yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f95826zdlpuopuiu;
                    gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) obj;
                    boolean zBooleanValue = ((Boolean) vdvldrhtssVar.iobyxmoadg()).booleanValue();
                    i01.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = (i01.lqeggnwhkg.iobyxmoadg) vdvldrhtssVar.wkgbmnqykc();
                    if (zBooleanValue && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg.iwxlajgraz(this.f95825yggfygwlhe).getSelectedServices(), iobyxmoadgVar.iobyxmoadg())) {
                        c2250iobyxmoadg.f95828yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2250iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
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

        public yggfygwlhe(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f95824zdlpuopuiu = lqeggnwhkgVar;
            this.f95823yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f95824zdlpuopuiu.collect(new C2249iobyxmoadg(nufgyqmvbuVar, this.f95823yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f95831zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zdlpuopuiu(gxszxtbevoVar);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f95831zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            CameraPosition lastCameraPosition = iobyxmoadg.iwxlajgraz(iobyxmoadg.this).getLastCameraPosition();
            if (lastCameraPosition != null) {
                iobyxmoadg.this.krqnebusok(lastCameraPosition);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f95832iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f95833zoijcleaow;

        public zoijcleaow(LocationData locationData, List shops) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shops, "shops");
            this.f95832iobyxmoadg = locationData;
            this.f95833zoijcleaow = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f95832iobyxmoadg, zoijcleaowVar.f95832iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f95833zoijcleaow, zoijcleaowVar.f95833zoijcleaow);
        }

        public int hashCode() {
            LocationData locationData = this.f95832iobyxmoadg;
            return ((locationData == null ? 0 : locationData.hashCode()) * 31) + this.f95833zoijcleaow.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f95832iobyxmoadg;
        }

        public String toString() {
            return "FetchedShopsData(centerLocation=" + this.f95832iobyxmoadg + ", shops=" + this.f95833zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f95833zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, eq1.zoijcleaow locationProvider, n01.iobyxmoadg getCenterPositionUseCase, n01.ppxfxbqfkf getMaxDistanceByPointUseCase, n11.gxszxtbevo getShopsUseCase, n11.eablkybsjg getShopServicesUseCase, n11.lqeggnwhkg getShopsWithServicesUseCase, n11.wkgbmnqykc getShopByVisibleRectUseCase, i01.lqeggnwhkg changeShopFiltersObserver, n01.zoijcleaow getMapSpecialBannerUseCase, ur0.iobyxmoadg permissionManager) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(locationProvider, "locationProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCenterPositionUseCase, "getCenterPositionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getMaxDistanceByPointUseCase, "getMaxDistanceByPointUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getShopsUseCase, "getShopsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getShopServicesUseCase, "getShopServicesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getShopsWithServicesUseCase, "getShopsWithServicesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getShopByVisibleRectUseCase, "getShopByVisibleRectUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeShopFiltersObserver, "changeShopFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getMapSpecialBannerUseCase, "getMapSpecialBannerUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        this.f95740ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f95742wkgbmnqykc = locationProvider;
        this.f95735eablkybsjg = getCenterPositionUseCase;
        this.f95737gxszxtbevo = getMaxDistanceByPointUseCase;
        this.f95738lqeggnwhkg = getShopsUseCase;
        this.f95739nufgyqmvbu = getShopServicesUseCase;
        this.f95734dxjokdxxww = getShopsWithServicesUseCase;
        this.f95732btonecajqb = getShopByVisibleRectUseCase;
        this.f95736gtknphoqwx = changeShopFiltersObserver;
        this.f95733draadjrbmk = getMapSpecialBannerUseCase;
        this.f95741wflxmlrfwp = permissionManager;
    }

    static /* synthetic */ void a(iobyxmoadg iobyxmoadgVar, LocationData locationData, double d13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            d13 = 10.0d;
        }
        iobyxmoadgVar.eslsurpljm(locationData, d13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ageimvtcrz(iobyxmoadg iobyxmoadgVar, LocationData locationData) {
        pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, new nufgyqmvbu(locationData, iobyxmoadgVar, null), 3, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(h01.eablkybsjg eablkybsjgVar) {
        Double dZoijcleaow = eablkybsjgVar.zoijcleaow();
        double dDoubleValue = dZoijcleaow != null ? dZoijcleaow.doubleValue() : 10.0d;
        LocationData locationDataIobyxmoadg = eablkybsjgVar.iobyxmoadg();
        if (locationDataIobyxmoadg != null) {
            eslsurpljm(locationDataIobyxmoadg, dDoubleValue);
        }
        if (eablkybsjgVar.iobyxmoadg() == null) {
            Shop shop = (Shop) hg.jyumaefscl.weqkydbzbr(eablkybsjgVar.wkgbmnqykc());
            LocationData locationData = shop != null ? new LocationData(shop.getLat(), shop.getLng()) : null;
            if (locationData != null) {
                eslsurpljm(locationData, dDoubleValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        boolean isPositionCentered = ((State) jlmebxxoox()).getIsPositionCentered();
        if (((State) jlmebxxoox()).getLastFocusRegion() != null) {
            ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.wkgbmnqykc(null));
        }
        if (isPositionCentered) {
            ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.nufgyqmvbu(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(CameraPosition cameraPosition, VisibleRegion visibleRegion) {
        q(visibleRegion);
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.ppxfxbqfkf(cameraPosition));
        crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.gxszxtbevo(((State) jlmebxxoox()).getSelectedServices()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(VisibleRegion visibleRegion, LocationData locationData, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        if (z13) {
            w(State.zoijcleaow.MAP);
            crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.gtknphoqwx(locationData));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.gtknphoqwx(locationData));
        q(visibleRegion);
        Object objX = x(this, ((State) jlmebxxoox()).getLastFocusRegion(), null, locationData, gxszxtbevoVar, 2, null);
        return objX == mg.zoijcleaow.gxszxtbevo() ? objX : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void eslsurpljm(LocationData locationData, double d13) {
        crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.ppxfxbqfkf(locationData, d13, ((State) jlmebxxoox()).getFlow()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        fiwbwshyhd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd() {
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.ppxfxbqfkf(null));
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.nufgyqmvbu(true));
        this.f95742wkgbmnqykc.iobyxmoadg(new tg.draadjrbmk() { // from class: r61.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg.ageimvtcrz(this.f81849zdlpuopuiu, (LocationData) obj);
            }
        }, new tg.draadjrbmk() { // from class: r61.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg.fyldjkxazc(this.f81850zdlpuopuiu, (Exception) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fmlbqenlif(lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar;
            int i13 = wflxmlrfwpVar.f95817iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f95817iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
        }
        wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwpVar;
        Object obj = wflxmlrfwpVar2.f95819yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wflxmlrfwpVar2.f95817iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            eq1.zoijcleaow zoijcleaowVar = this.f95742wkgbmnqykc;
            wflxmlrfwpVar2.f95820zdlpuopuiu = this;
            wflxmlrfwpVar2.f95817iwizpuwonk = 1;
            objWkgbmnqykc = eq1.zoijcleaow.wkgbmnqykc(zoijcleaowVar, 0L, null, wflxmlrfwpVar2, 3, null);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) wflxmlrfwpVar2.f95820zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objWkgbmnqykc = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.m((LocationData) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.eablkybsjg(false));
            iobyxmoadgVar.crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.nufgyqmvbu(thDxjokdxxww));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn fyldjkxazc(iobyxmoadg iobyxmoadgVar, Exception it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        pj.gtknphoqwx.wkgbmnqykc(iobyxmoadgVar.sopmlzcsov(), null, null, iobyxmoadgVar.new dxjokdxxww(it, null), 3, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(l91.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.btonecajqb(wkgbmnqykcVar, ipoelvxyzq(wkgbmnqykcVar.lqeggnwhkg()), z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object grlcpdaxtj(lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        iobyxmoadg iobyxmoadgVar;
        LocationData userLocation;
        LocationData locationData;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f95747cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f95747cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object obj = btonecajqbVar.f95749jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f95747cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                int i15 = ppxfxbqfkf.f95806iobyxmoadg[((State) jlmebxxoox()).getFlow().ordinal()];
                if (i15 == 1) {
                    userLocation = ((State) jlmebxxoox()).getUserLocation();
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userLocation = ((State) jlmebxxoox()).getCentralPosition();
                }
                btonecajqbVar.f95751zdlpuopuiu = this;
                btonecajqbVar.f95750yggfygwlhe = userLocation;
                btonecajqbVar.f95747cqumvgiudr = 1;
                Object objHszhottldk = hszhottldk(btonecajqbVar);
                if (objHszhottldk == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                locationData = userLocation;
                obj = objHszhottldk;
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locationData = (LocationData) btonecajqbVar.f95750yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) btonecajqbVar.f95751zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new zoijcleaow(locationData, (List) obj));
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.l((zoijcleaow) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.k(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(boolean z13) {
        c();
        crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.zoijcleaow(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object hszhottldk(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        n11.lqeggnwhkg lqeggnwhkgVar2;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f95789cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f95789cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objJrbgnlbqoe = lqeggnwhkgVar.f95791jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f95789cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                lqeggnwhkgVar2 = (n11.lqeggnwhkg) lqeggnwhkgVar.f95792yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f95793zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objJrbgnlbqoe);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objJrbgnlbqoe);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objJrbgnlbqoe);
        lqeggnwhkgVar2 = this.f95734dxjokdxxww;
        lqeggnwhkgVar.f95793zdlpuopuiu = this;
        lqeggnwhkgVar.f95792yggfygwlhe = lqeggnwhkgVar2;
        lqeggnwhkgVar.f95789cqumvgiudr = 1;
        objJrbgnlbqoe = jrbgnlbqoe(lqeggnwhkgVar);
        if (objJrbgnlbqoe == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        n11.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = new n11.lqeggnwhkg.iobyxmoadg((List) objJrbgnlbqoe, ((State) iobyxmoadgVar.jlmebxxoox()).getSelectedServices());
        lqeggnwhkgVar.f95793zdlpuopuiu = null;
        lqeggnwhkgVar.f95792yggfygwlhe = null;
        lqeggnwhkgVar.f95789cqumvgiudr = 2;
        objJrbgnlbqoe = lqeggnwhkgVar2.zoijcleaow(iobyxmoadgVar2, lqeggnwhkgVar);
        return objJrbgnlbqoe == objGxszxtbevo ? objGxszxtbevo : objJrbgnlbqoe;
    }

    static /* synthetic */ void i(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.h(z13);
    }

    private final void igdgnonuha() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
    }

    private final List ipoelvxyzq(List list) {
        List services = ((State) jlmebxxoox()).getServices();
        ArrayList arrayList = new ArrayList();
        for (Object obj : services) {
            if (list.contains(((ShopService) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ State iwxlajgraz(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ixidwrxhsl(lg.gxszxtbevo gxszxtbevoVar) {
        Object objV = v(((State) jlmebxxoox()).getLastFocusRegion(), ((State) jlmebxxoox()).getPageType(), ((State) jlmebxxoox()).getSortingPoint(), gxszxtbevoVar);
        return objV == mg.zoijcleaow.gxszxtbevo() ? objV : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(h01.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        vdvldrhtss vdvldrhtssVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof vdvldrhtss) {
            vdvldrhtssVar = (vdvldrhtss) gxszxtbevoVar;
            int i13 = vdvldrhtssVar.f95812cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vdvldrhtssVar.f95812cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar);
            }
        } else {
            vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar);
        }
        Object obj = vdvldrhtssVar.f95814jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = vdvldrhtssVar.f95812cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                eablkybsjgVar = (h01.eablkybsjg) vdvldrhtssVar.f95815yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) vdvldrhtssVar.f95816zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.zoijcleaow(eablkybsjgVar.wkgbmnqykc(), eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.iobyxmoadg(), eablkybsjgVar.zoijcleaow()));
        vdvldrhtssVar.f95816zdlpuopuiu = this;
        vdvldrhtssVar.f95815yggfygwlhe = eablkybsjgVar;
        vdvldrhtssVar.f95812cqumvgiudr = 1;
        if (grlcpdaxtj(vdvldrhtssVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(iobyxmoadgVar.ezmngbhpjk());
        oxmwwwfdhm oxmwwwfdhmVar = iobyxmoadgVar.new oxmwwwfdhm(eablkybsjgVar);
        vdvldrhtssVar.f95816zdlpuopuiu = null;
        vdvldrhtssVar.f95815yggfygwlhe = null;
        vdvldrhtssVar.f95812cqumvgiudr = 2;
        if (rgvfuqvkyqVar.collect(oxmwwwfdhmVar, vdvldrhtssVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jrbgnlbqoe(lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f95754iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f95754iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object objRhgxfdycjh = draadjrbmkVar.f95756yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f95754iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
            List allShops = ((State) jlmebxxoox()).getAllShops();
            if (!allShops.isEmpty()) {
                return allShops;
            }
            draadjrbmkVar.f95757zdlpuopuiu = this;
            draadjrbmkVar.f95754iwizpuwonk = 1;
            objRhgxfdycjh = rhgxfdycjh(draadjrbmkVar);
            if (objRhgxfdycjh == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) draadjrbmkVar.f95757zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
        }
        List list = (List) objRhgxfdycjh;
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.iobyxmoadg(list));
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void krqnebusok(CameraPosition cameraPosition) {
        crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.wkgbmnqykc(cameraPosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(zoijcleaow zoijcleaowVar) {
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.C2243gxszxtbevo(zoijcleaowVar.zoijcleaow()));
        if (zoijcleaowVar.iobyxmoadg() != null) {
            eslsurpljm(zoijcleaowVar.iobyxmoadg(), 10.0d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(LocationData locationData) {
        CameraPosition lastCameraPosition = ((State) jlmebxxoox()).getLastCameraPosition();
        if (lastCameraPosition != null) {
            krqnebusok(lastCameraPosition);
        } else if (locationData == null) {
            o();
        } else {
            a(this, locationData, 0.0d, 2, null);
            ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.draadjrbmk(locationData));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object mhtqkkgtqm(boolean z13, LocationData locationData, LocationData locationData2, LocationData locationData3, State.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        State.zoijcleaow zoijcleaowVar2;
        iobyxmoadg iobyxmoadgVar;
        LocationData locationData4;
        State.zoijcleaow zoijcleaowVar3;
        boolean z14;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f95772lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f95772lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objZoijcleaow = gtknphoqwxVar.f95768cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f95772lereixgezr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            List allShops = ((State) jlmebxxoox()).getAllShops();
            List selectedServices = ((State) jlmebxxoox()).getSelectedServices();
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                n11.wkgbmnqykc wkgbmnqykcVar = this.f95732btonecajqb;
                n11.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = new n11.wkgbmnqykc.iobyxmoadg(allShops, locationData, locationData2, locationData3, selectedServices);
                gtknphoqwxVar.f95774zdlpuopuiu = this;
                gtknphoqwxVar.f95773yggfygwlhe = locationData;
                zoijcleaowVar2 = zoijcleaowVar;
                try {
                    gtknphoqwxVar.f95771jyumaefscl = zoijcleaowVar2;
                    gtknphoqwxVar.f95770iwizpuwonk = z13;
                    gtknphoqwxVar.f95772lereixgezr = 1;
                    objZoijcleaow = wkgbmnqykcVar.zoijcleaow(iobyxmoadgVar3, gtknphoqwxVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar = this;
                    locationData4 = locationData;
                    zoijcleaowVar3 = zoijcleaowVar2;
                    z14 = z13;
                } catch (Throwable th2) {
                    th = th2;
                    iobyxmoadgVar = this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    zoijcleaowVar3 = zoijcleaowVar2;
                }
            } catch (Throwable th3) {
                th = th3;
                zoijcleaowVar2 = zoijcleaowVar;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z14 = gtknphoqwxVar.f95770iwizpuwonk;
            zoijcleaowVar3 = (State.zoijcleaow) gtknphoqwxVar.f95771jyumaefscl;
            locationData4 = (LocationData) gtknphoqwxVar.f95773yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) gtknphoqwxVar.f95774zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th4) {
                th = th4;
                zoijcleaowVar2 = zoijcleaowVar3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                zoijcleaowVar3 = zoijcleaowVar2;
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(iobyxmoadgVar.y((List) objZoijcleaow, z14, locationData4));
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.wflxmlrfwp((List) objWkgbmnqykc, zoijcleaowVar3));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.k(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ void n(iobyxmoadg iobyxmoadgVar, LocationData locationData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            locationData = null;
        }
        iobyxmoadgVar.m(locationData);
    }

    private final void o() {
        int i13 = ppxfxbqfkf.f95806iobyxmoadg[((State) jlmebxxoox()).getFlow().ordinal()];
        if (i13 == 1) {
            a(this, cl0.ppxfxbqfkf.iobyxmoadg(), 0.0d, 2, null);
            return;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        State state = (State) jlmebxxoox();
        Double maxDistance = state.getMaxDistance();
        double dDoubleValue = maxDistance != null ? maxDistance.doubleValue() : 10.0d;
        if (state.getCentralPosition() != null) {
            eslsurpljm(state.getCentralPosition(), dDoubleValue);
            return;
        }
        Shop shop = (Shop) hg.jyumaefscl.weqkydbzbr(state.getAllShops());
        if (shop != null) {
            eslsurpljm(new LocationData(shop.getLat(), shop.getLng()), dDoubleValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.dxjokdxxww(true));
    }

    private final wwaezpbzkn q(VisibleRegion visibleRegion) {
        if (visibleRegion == null) {
            return null;
        }
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.wkgbmnqykc(visibleRegion));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rhgxfdycjh(lg.gxszxtbevo gxszxtbevoVar) {
        agtfadlqog agtfadlqogVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof agtfadlqog) {
            agtfadlqogVar = (agtfadlqog) gxszxtbevoVar;
            int i13 = agtfadlqogVar.f95743iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                agtfadlqogVar.f95743iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            }
        } else {
            agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
        }
        Object objZoijcleaow = agtfadlqogVar.f95745yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = agtfadlqogVar.f95743iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            int i15 = ppxfxbqfkf.f95806iobyxmoadg[((State) jlmebxxoox()).getFlow().ordinal()];
            if (i15 == 1) {
                n11.gxszxtbevo gxszxtbevoVar2 = this.f95738lqeggnwhkg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                agtfadlqogVar.f95743iwizpuwonk = 1;
                objZoijcleaow = gxszxtbevoVar2.zoijcleaow(wwaezpbzknVar, agtfadlqogVar);
                return objZoijcleaow == objGxszxtbevo ? objGxszxtbevo : objZoijcleaow;
            }
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                n01.zoijcleaow zoijcleaowVar = this.f95733draadjrbmk;
                n01.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new n01.zoijcleaow.iobyxmoadg(((State) jlmebxxoox()).getBannerId(), Integer.parseInt(((State) jlmebxxoox()).getBlockId()));
                agtfadlqogVar.f95746zdlpuopuiu = this;
                agtfadlqogVar.f95743iwizpuwonk = 2;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar3, agtfadlqogVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((iz0.iobyxmoadg) objZoijcleaow);
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) agtfadlqogVar.f95746zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((iz0.iobyxmoadg) objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.k(thDxjokdxxww);
            objWkgbmnqykc = new iz0.iobyxmoadg(null, null, null, null, 15, null);
        }
        return ((iz0.iobyxmoadg) objWkgbmnqykc).iobyxmoadg();
    }

    private final void t() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new kcexrzcfyt(ezmngbhpjk()), new zdlpuopuiu(null)), sopmlzcsov());
    }

    private final void u() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new yggfygwlhe(sj.dxjokdxxww.wflxmlrfwp(ezmngbhpjk(), this.f95736gtknphoqwx.nufgyqmvbu(), new jyumaefscl(null)), this), new iwizpuwonk(null)), new cqumvgiudr(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object v(VisibleRegion visibleRegion, State.zoijcleaow zoijcleaowVar, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        esjtqupxsv esjtqupxsvVar;
        if (gxszxtbevoVar instanceof esjtqupxsv) {
            esjtqupxsvVar = (esjtqupxsv) gxszxtbevoVar;
            int i13 = esjtqupxsvVar.f95763cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                esjtqupxsvVar.f95763cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
            }
        } else {
            esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
        }
        esjtqupxsv esjtqupxsvVar2 = esjtqupxsvVar;
        Object obj = esjtqupxsvVar2.f95765jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = esjtqupxsvVar2.f95763cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            LocationData userLocation = ((State) jlmebxxoox()).getUserLocation();
            ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.gtknphoqwx(locationData));
            if (visibleRegion != null) {
                q(visibleRegion);
                LocationData locationData2 = locationData == null ? userLocation : locationData;
                LocationData topLeft = visibleRegion.getTopLeft();
                LocationData bottomRight = visibleRegion.getBottomRight();
                esjtqupxsvVar2.f95767zdlpuopuiu = this;
                esjtqupxsvVar2.f95766yggfygwlhe = zoijcleaowVar;
                esjtqupxsvVar2.f95763cqumvgiudr = 1;
                if (mhtqkkgtqm(false, locationData2, topLeft, bottomRight, zoijcleaowVar, esjtqupxsvVar2) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                w(zoijcleaowVar);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(State.zoijcleaow zoijcleaowVar) {
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.lqeggnwhkg(zoijcleaowVar));
    }

    static /* synthetic */ Object x(iobyxmoadg iobyxmoadgVar, VisibleRegion visibleRegion, State.zoijcleaow zoijcleaowVar, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            visibleRegion = null;
        }
        if ((i13 & 2) != 0) {
            zoijcleaowVar = State.zoijcleaow.LIST;
        }
        if ((i13 & 4) != 0) {
            locationData = null;
        }
        return iobyxmoadgVar.v(visibleRegion, zoijcleaowVar, locationData, gxszxtbevoVar);
    }

    private final List y(List list, boolean z13, LocationData locationData) {
        if (locationData == null || !z13) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            zg.btonecajqb btonecajqbVar = f95731rgvfuqvkyq;
            int iWkgbmnqykc = btonecajqbVar.wkgbmnqykc();
            if (i13 <= btonecajqbVar.eablkybsjg() && iWkgbmnqykc <= i13) {
                arrayList.add(obj);
            }
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ru.myspar.proloyalty.domain.feature.shops.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final Object yzdjzghtvl(lg.gxszxtbevo gxszxtbevoVar) {
        ojitshcjhn ojitshcjhnVar;
        Object objWkgbmnqykc;
        ?? r13;
        Object obj;
        ?? r14;
        ?? r15;
        Throwable thDxjokdxxww;
        iobyxmoadg iobyxmoadgVar;
        List list;
        iobyxmoadg iobyxmoadgVar2;
        List list2;
        Object objZoijcleaow;
        List list3;
        List list4;
        iobyxmoadg iobyxmoadgVar3;
        LocationData locationData;
        Object objZoijcleaow2;
        LocationData locationData2;
        List list5;
        if (gxszxtbevoVar instanceof ojitshcjhn) {
            ojitshcjhnVar = (ojitshcjhn) gxszxtbevoVar;
            int i13 = ojitshcjhnVar.f95801lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ojitshcjhnVar.f95801lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
            }
        } else {
            ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
        }
        Object objRhgxfdycjh = ojitshcjhnVar.f95797cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ojitshcjhnVar.f95801lereixgezr;
        ?? r16 = 2;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iobyxmoadgVar = (iobyxmoadg) ojitshcjhnVar.f95803zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
                    } catch (Throwable th2) {
                        th = th2;
                        r16 = iobyxmoadgVar;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                        r13 = r16;
                    }
                } else {
                    if (i14 == 2) {
                        list = (List) ojitshcjhnVar.f95802yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar5 = (iobyxmoadg) ojitshcjhnVar.f95803zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
                        iobyxmoadgVar2 = iobyxmoadgVar5;
                        list2 = (List) objRhgxfdycjh;
                        n01.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar2.f95735eablkybsjg;
                        n01.iobyxmoadg.zoijcleaow zoijcleaowVar = new n01.iobyxmoadg.zoijcleaow(list);
                        ojitshcjhnVar.f95803zdlpuopuiu = iobyxmoadgVar2;
                        ojitshcjhnVar.f95802yggfygwlhe = list;
                        ojitshcjhnVar.f95800jyumaefscl = list2;
                        ojitshcjhnVar.f95801lereixgezr = 3;
                        objZoijcleaow = iobyxmoadgVar6.zoijcleaow(zoijcleaowVar, ojitshcjhnVar);
                        if (objZoijcleaow == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        List list6 = list;
                        list3 = list2;
                        objRhgxfdycjh = objZoijcleaow;
                        list4 = list6;
                        iobyxmoadgVar3 = iobyxmoadgVar2;
                        locationData = (LocationData) objRhgxfdycjh;
                        n01.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar3.f95737gxszxtbevo;
                        n01.ppxfxbqfkf.zoijcleaow zoijcleaowVar2 = new n01.ppxfxbqfkf.zoijcleaow(list4, locationData);
                        ojitshcjhnVar.f95803zdlpuopuiu = iobyxmoadgVar3;
                        ojitshcjhnVar.f95802yggfygwlhe = list4;
                        ojitshcjhnVar.f95800jyumaefscl = list3;
                        ojitshcjhnVar.f95799iwizpuwonk = locationData;
                        ojitshcjhnVar.f95801lereixgezr = 4;
                        objZoijcleaow2 = ppxfxbqfkfVar.zoijcleaow(zoijcleaowVar2, ojitshcjhnVar);
                        if (objZoijcleaow2 == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        List list7 = list3;
                        locationData2 = locationData;
                        objRhgxfdycjh = objZoijcleaow2;
                        list5 = list7;
                        r16 = iobyxmoadgVar3;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new h01.eablkybsjg(list4, list5, locationData2, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((Number) objRhgxfdycjh).doubleValue() * 0.001d)));
                        r13 = r16;
                        r15 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            ojitshcjhnVar.f95803zdlpuopuiu = r13;
                            ojitshcjhnVar.f95802yggfygwlhe = objWkgbmnqykc;
                            ojitshcjhnVar.f95800jyumaefscl = null;
                            ojitshcjhnVar.f95799iwizpuwonk = null;
                            ojitshcjhnVar.f95801lereixgezr = 5;
                            if (r13.j((h01.eablkybsjg) objWkgbmnqykc, ojitshcjhnVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj = objWkgbmnqykc;
                            r14 = r13;
                        }
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            r15.k(thDxjokdxxww);
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i14 == 3) {
                        list3 = (List) ojitshcjhnVar.f95800jyumaefscl;
                        list4 = (List) ojitshcjhnVar.f95802yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar7 = (iobyxmoadg) ojitshcjhnVar.f95803zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
                        iobyxmoadgVar3 = iobyxmoadgVar7;
                        locationData = (LocationData) objRhgxfdycjh;
                        n01.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVar3.f95737gxszxtbevo;
                        n01.ppxfxbqfkf.zoijcleaow zoijcleaowVar3 = new n01.ppxfxbqfkf.zoijcleaow(list4, locationData);
                        ojitshcjhnVar.f95803zdlpuopuiu = iobyxmoadgVar3;
                        ojitshcjhnVar.f95802yggfygwlhe = list4;
                        ojitshcjhnVar.f95800jyumaefscl = list3;
                        ojitshcjhnVar.f95799iwizpuwonk = locationData;
                        ojitshcjhnVar.f95801lereixgezr = 4;
                        objZoijcleaow2 = ppxfxbqfkfVar2.zoijcleaow(zoijcleaowVar3, ojitshcjhnVar);
                        if (objZoijcleaow2 == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        List list8 = list3;
                        locationData2 = locationData;
                        objRhgxfdycjh = objZoijcleaow2;
                        list5 = list8;
                        r16 = iobyxmoadgVar3;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new h01.eablkybsjg(list4, list5, locationData2, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((Number) objRhgxfdycjh).doubleValue() * 0.001d)));
                        r13 = r16;
                        r15 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            ojitshcjhnVar.f95803zdlpuopuiu = r13;
                            ojitshcjhnVar.f95802yggfygwlhe = objWkgbmnqykc;
                            ojitshcjhnVar.f95800jyumaefscl = null;
                            ojitshcjhnVar.f95799iwizpuwonk = null;
                            ojitshcjhnVar.f95801lereixgezr = 5;
                            if (r13.j((h01.eablkybsjg) objWkgbmnqykc, ojitshcjhnVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj = objWkgbmnqykc;
                            r14 = r13;
                        }
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            r15.k(thDxjokdxxww);
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i14 == 4) {
                        locationData2 = (LocationData) ojitshcjhnVar.f95799iwizpuwonk;
                        list5 = (List) ojitshcjhnVar.f95800jyumaefscl;
                        list4 = (List) ojitshcjhnVar.f95802yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar8 = (iobyxmoadg) ojitshcjhnVar.f95803zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
                        r16 = iobyxmoadgVar8;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new h01.eablkybsjg(list4, list5, locationData2, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((Number) objRhgxfdycjh).doubleValue() * 0.001d)));
                        r13 = r16;
                        r15 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            ojitshcjhnVar.f95803zdlpuopuiu = r13;
                            ojitshcjhnVar.f95802yggfygwlhe = objWkgbmnqykc;
                            ojitshcjhnVar.f95800jyumaefscl = null;
                            ojitshcjhnVar.f95799iwizpuwonk = null;
                            ojitshcjhnVar.f95801lereixgezr = 5;
                            if (r13.j((h01.eablkybsjg) objWkgbmnqykc, ojitshcjhnVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            obj = objWkgbmnqykc;
                            r14 = r13;
                        }
                        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                        if (thDxjokdxxww != null) {
                            r15.k(thDxjokdxxww);
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i14 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = ojitshcjhnVar.f95802yggfygwlhe;
                    iobyxmoadg iobyxmoadgVar9 = (iobyxmoadg) ojitshcjhnVar.f95803zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
                    r14 = iobyxmoadgVar9;
                }
                r15 = r14;
                objWkgbmnqykc = obj;
                thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    r15.k(thDxjokdxxww);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
            ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.eablkybsjg(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = gg.kcexrzcfyt.f37117yggfygwlhe;
                ojitshcjhnVar.f95803zdlpuopuiu = this;
                ojitshcjhnVar.f95801lereixgezr = 1;
                objRhgxfdycjh = rhgxfdycjh(ojitshcjhnVar);
                if (objRhgxfdycjh == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th3) {
                th = th3;
                r16 = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar11 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                r13 = r16;
            }
            List list9 = (List) objRhgxfdycjh;
            n11.eablkybsjg eablkybsjgVar = iobyxmoadgVar.f95739nufgyqmvbu;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            ojitshcjhnVar.f95803zdlpuopuiu = iobyxmoadgVar;
            ojitshcjhnVar.f95802yggfygwlhe = list9;
            ojitshcjhnVar.f95801lereixgezr = 2;
            Object objZoijcleaow3 = eablkybsjgVar.zoijcleaow(wwaezpbzknVar, ojitshcjhnVar);
            if (objZoijcleaow3 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg iobyxmoadgVar12 = iobyxmoadgVar;
            list = list9;
            objRhgxfdycjh = objZoijcleaow3;
            iobyxmoadgVar2 = iobyxmoadgVar12;
            list2 = (List) objRhgxfdycjh;
            n01.iobyxmoadg iobyxmoadgVar13 = iobyxmoadgVar2.f95735eablkybsjg;
            n01.iobyxmoadg.zoijcleaow zoijcleaowVar4 = new n01.iobyxmoadg.zoijcleaow(list);
            ojitshcjhnVar.f95803zdlpuopuiu = iobyxmoadgVar2;
            ojitshcjhnVar.f95802yggfygwlhe = list;
            ojitshcjhnVar.f95800jyumaefscl = list2;
            ojitshcjhnVar.f95801lereixgezr = 3;
            objZoijcleaow = iobyxmoadgVar13.zoijcleaow(zoijcleaowVar4, ojitshcjhnVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            List list10 = list;
            list3 = list2;
            objRhgxfdycjh = objZoijcleaow;
            list4 = list10;
            iobyxmoadgVar3 = iobyxmoadgVar2;
            locationData = (LocationData) objRhgxfdycjh;
            n01.ppxfxbqfkf ppxfxbqfkfVar3 = iobyxmoadgVar3.f95737gxszxtbevo;
            n01.ppxfxbqfkf.zoijcleaow zoijcleaowVar5 = new n01.ppxfxbqfkf.zoijcleaow(list4, locationData);
            ojitshcjhnVar.f95803zdlpuopuiu = iobyxmoadgVar3;
            ojitshcjhnVar.f95802yggfygwlhe = list4;
            ojitshcjhnVar.f95800jyumaefscl = list3;
            ojitshcjhnVar.f95799iwizpuwonk = locationData;
            ojitshcjhnVar.f95801lereixgezr = 4;
            objZoijcleaow2 = ppxfxbqfkfVar3.zoijcleaow(zoijcleaowVar5, ojitshcjhnVar);
            if (objZoijcleaow2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            List list11 = list3;
            locationData2 = locationData;
            objRhgxfdycjh = objZoijcleaow2;
            list5 = list11;
            r16 = iobyxmoadgVar3;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new h01.eablkybsjg(list4, list5, locationData2, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((Number) objRhgxfdycjh).doubleValue() * 0.001d)));
            r13 = r16;
            r15 = r13;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                ojitshcjhnVar.f95803zdlpuopuiu = r13;
                ojitshcjhnVar.f95802yggfygwlhe = objWkgbmnqykc;
                ojitshcjhnVar.f95800jyumaefscl = null;
                ojitshcjhnVar.f95799iwizpuwonk = null;
                ojitshcjhnVar.f95801lereixgezr = 5;
                if (r13.j((h01.eablkybsjg) objWkgbmnqykc, ojitshcjhnVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj = objWkgbmnqykc;
                r14 = r13;
                r15 = r14;
                objWkgbmnqykc = obj;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                r15.k(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public sj.lqeggnwhkg ezmngbhpjk() {
        return this.f95740ppxfxbqfkf.ppxfxbqfkf();
    }

    public final void k(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new ru.myspar.proloyalty.domain.feature.shops.store.gxszxtbevo.eablkybsjg(false));
        crxdokpmqz(new ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.lqeggnwhkg(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: lxfrhoxuzk, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.domain.feature.shops.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.proloyalty.domain.feature.shops.store.ppxfxbqfkf.zoijcleaow.f95839iobyxmoadg)) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.proloyalty.domain.feature.shops.store.ppxfxbqfkf.wkgbmnqykc.f95838iobyxmoadg)) {
            u();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.proloyalty.domain.feature.shops.store.ppxfxbqfkf.C2251ppxfxbqfkf.f95837iobyxmoadg)) {
            t();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.proloyalty.domain.feature.shops.store.ppxfxbqfkf.iobyxmoadg.f95836iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            igdgnonuha();
        }
    }

    public void r(boolean z13) {
        this.f95740ppxfxbqfkf.eablkybsjg(z13);
    }

    public void s(boolean z13) {
        this.f95740ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: wizcaqwiak, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(intent, this, null), 3, null);
    }
}
