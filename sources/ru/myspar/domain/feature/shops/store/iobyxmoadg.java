package ru.myspar.domain.feature.shops.store;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.CameraPosition;
import ru.myspar.core.domain.models.VisibleRegion;
import ru.myspar.core.domain.models.shop.Shop;
import ru.myspar.core.domain.models.shop.ShopService;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final C2007iobyxmoadg f87952agtfadlqog = new C2007iobyxmoadg(null);

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final int f87953ojitshcjhn = 8;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final zg.btonecajqb f87954rgvfuqvkyq = new zg.btonecajqb(0, 4);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final h30.wkgbmnqykc f87955btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final d20.zoijcleaow f87956draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final h30.lqeggnwhkg f87957dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final d20.iobyxmoadg f87958eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final u10.lqeggnwhkg f87959gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final d20.ppxfxbqfkf f87960gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final h30.gxszxtbevo f87961lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final h30.eablkybsjg f87962nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f87963ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final at.iobyxmoadg f87964wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final j42.zoijcleaow f87965wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f87966iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f87968yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f87969zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f87968yggfygwlhe = obj;
            this.f87966iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rhgxfdycjh(this);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f87970cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f87972jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f87973yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f87974zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f87972jyumaefscl = obj;
            this.f87970cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.grlcpdaxtj(this);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f87975yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f87976zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f87976zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f87975yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar);
            cqumvgiudrVar.f87975yggfygwlhe = th2;
            return cqumvgiudrVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f87977iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f87979yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f87980zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f87979yggfygwlhe = obj;
            this.f87977iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jrbgnlbqoe(this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Exception f87981jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f87983zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(Exception exc, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f87981jyumaefscl = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new dxjokdxxww(this.f87981jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f87983zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.eablkybsjg(false));
            iobyxmoadg.this.crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.nufgyqmvbu(this.f87981jyumaefscl));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f87985zdlpuopuiu;

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
            int i13 = this.f87985zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                this.f87985zdlpuopuiu = 1;
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
        int f87986cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f87988jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f87989yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f87990zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f87988jyumaefscl = obj;
            this.f87986cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.v(null, null, null, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f87991cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f87993iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f87994jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f87995lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f87996yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f87997zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f87991cqumvgiudr = obj;
            this.f87995lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.mhtqkkgtqm(false, null, null, null, null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f87998jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.domain.feature.shops.store.wkgbmnqykc f87999yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88000zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(ru.myspar.domain.feature.shops.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f87999yggfygwlhe = wkgbmnqykcVar;
            this.f87998jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f87999yggfygwlhe, this.f87998jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88000zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.domain.feature.shops.store.wkgbmnqykc wkgbmnqykcVar = this.f87999yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.shops.store.wkgbmnqykc.zoijcleaow.f88082iobyxmoadg)) {
                    this.f87998jyumaefscl.crxdokpmqz(ru.myspar.domain.feature.shops.store.eablkybsjg.iobyxmoadg.f87927iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.shops.store.wkgbmnqykc.C2015wkgbmnqykc.f88081iobyxmoadg)) {
                    this.f87998jyumaefscl.c();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.shops.store.wkgbmnqykc.nufgyqmvbu.f88076iobyxmoadg)) {
                    this.f87998jyumaefscl.f();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.shops.store.wkgbmnqykc.wflxmlrfwp.f88080iobyxmoadg)) {
                    this.f87998jyumaefscl.h(true);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.shops.store.wkgbmnqykc.draadjrbmk.f88066iobyxmoadg)) {
                    iobyxmoadg.i(this.f87998jyumaefscl, false, 1, null);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.shops.store.wkgbmnqykc.ppxfxbqfkf.f88078iobyxmoadg)) {
                    this.f87998jyumaefscl.crxdokpmqz(ru.myspar.domain.feature.shops.store.eablkybsjg.C2005eablkybsjg.f87924iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.shops.store.wkgbmnqykc.agtfadlqog.f88063iobyxmoadg)) {
                    this.f87998jyumaefscl.ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.dxjokdxxww(false));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.domain.feature.shops.store.wkgbmnqykc.lqeggnwhkg.f88075iobyxmoadg)) {
                    this.f87998jyumaefscl.p();
                } else if (wkgbmnqykcVar instanceof ru.myspar.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo) {
                    iobyxmoadg iobyxmoadgVar = this.f87998jyumaefscl;
                    VisibleRegion visibleRegionIobyxmoadg = ((ru.myspar.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo) this.f87999yggfygwlhe).iobyxmoadg();
                    LocationData locationDataZoijcleaow = ((ru.myspar.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo) this.f87999yggfygwlhe).zoijcleaow();
                    boolean zPpxfxbqfkf = ((ru.myspar.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo) this.f87999yggfygwlhe).ppxfxbqfkf();
                    this.f88000zdlpuopuiu = 1;
                    if (iobyxmoadgVar.e(visibleRegionIobyxmoadg, locationDataZoijcleaow, zPpxfxbqfkf, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof ru.myspar.domain.feature.shops.store.wkgbmnqykc.dxjokdxxww) {
                    this.f87998jyumaefscl.crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.dxjokdxxww(((ru.myspar.domain.feature.shops.store.wkgbmnqykc.dxjokdxxww) this.f87999yggfygwlhe).iobyxmoadg()));
                } else if (wkgbmnqykcVar instanceof ru.myspar.domain.feature.shops.store.wkgbmnqykc.btonecajqb) {
                    this.f87998jyumaefscl.g(((ru.myspar.domain.feature.shops.store.wkgbmnqykc.btonecajqb) this.f87999yggfygwlhe).iobyxmoadg(), ((ru.myspar.domain.feature.shops.store.wkgbmnqykc.btonecajqb) this.f87999yggfygwlhe).zoijcleaow());
                } else if (wkgbmnqykcVar instanceof ru.myspar.domain.feature.shops.store.wkgbmnqykc.iobyxmoadg) {
                    this.f87998jyumaefscl.d(((ru.myspar.domain.feature.shops.store.wkgbmnqykc.iobyxmoadg) this.f87999yggfygwlhe).iobyxmoadg(), ((ru.myspar.domain.feature.shops.store.wkgbmnqykc.iobyxmoadg) this.f87999yggfygwlhe).zoijcleaow());
                } else if (wkgbmnqykcVar instanceof ru.myspar.domain.feature.shops.store.wkgbmnqykc.ojitshcjhn) {
                    iobyxmoadg iobyxmoadgVar2 = this.f87998jyumaefscl;
                    VisibleRegion visibleRegionIobyxmoadg2 = ((ru.myspar.domain.feature.shops.store.wkgbmnqykc.ojitshcjhn) this.f87999yggfygwlhe).iobyxmoadg();
                    this.f88000zdlpuopuiu = 2;
                    if (iobyxmoadg.x(iobyxmoadgVar2, visibleRegionIobyxmoadg2, null, null, this, 6, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof ru.myspar.domain.feature.shops.store.wkgbmnqykc.rgvfuqvkyq) {
                    this.f87998jyumaefscl.w(State.zoijcleaow.MAP);
                } else if (wkgbmnqykcVar instanceof ru.myspar.domain.feature.shops.store.wkgbmnqykc.eablkybsjg) {
                    this.f87998jyumaefscl.r(((ru.myspar.domain.feature.shops.store.wkgbmnqykc.eablkybsjg) this.f87999yggfygwlhe).iobyxmoadg());
                } else {
                    if (!(wkgbmnqykcVar instanceof ru.myspar.domain.feature.shops.store.wkgbmnqykc.gtknphoqwx)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f87998jyumaefscl.s(((ru.myspar.domain.feature.shops.store.wkgbmnqykc.gtknphoqwx) this.f87999yggfygwlhe).iobyxmoadg());
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

    /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2007iobyxmoadg {
        public /* synthetic */ C2007iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2007iobyxmoadg() {
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f88002yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88003zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iwizpuwonk iwizpuwonkVar = iobyxmoadg.this.new iwizpuwonk(gxszxtbevoVar);
            iwizpuwonkVar.f88002yggfygwlhe = obj;
            return iwizpuwonkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88003zdlpuopuiu;
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
            u10.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = (u10.lqeggnwhkg.iobyxmoadg) ((gg.vdvldrhtss) this.f88002yggfygwlhe).wkgbmnqykc();
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
            List listIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (listIobyxmoadg == null) {
                listIobyxmoadg = hg.jyumaefscl.wflxmlrfwp();
            }
            iobyxmoadgVar2.ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.btonecajqb(listIobyxmoadg));
            iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
            this.f88003zdlpuopuiu = 1;
            if (iobyxmoadgVar3.grlcpdaxtj(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
            this.f88003zdlpuopuiu = 2;
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
        /* synthetic */ Object f88004jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f88005yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88006zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), (u10.lqeggnwhkg.iobyxmoadg) obj2, (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f88006zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = this.f88005yggfygwlhe;
            return gg.cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13), (u10.lqeggnwhkg.iobyxmoadg) this.f88004jyumaefscl);
        }

        public final Object ojitshcjhn(boolean z13, u10.lqeggnwhkg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f88005yggfygwlhe = z13;
            jyumaefsclVar.f88004jyumaefscl = iobyxmoadgVar;
            return jyumaefsclVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class kcexrzcfyt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f88007zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.iobyxmoadg$kcexrzcfyt$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2008iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f88008zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.iobyxmoadg$kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2009iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f88010yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f88011zdlpuopuiu;

                public C2009iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f88011zdlpuopuiu = obj;
                    this.f88010yggfygwlhe |= Integer.MIN_VALUE;
                    return C2008iobyxmoadg.this.emit(null, this);
                }
            }

            public C2008iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f88008zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2009iobyxmoadg c2009iobyxmoadg;
                if (gxszxtbevoVar instanceof C2009iobyxmoadg) {
                    c2009iobyxmoadg = (C2009iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2009iobyxmoadg.f88010yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2009iobyxmoadg.f88010yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2009iobyxmoadg = new C2009iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2009iobyxmoadg = new C2009iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2009iobyxmoadg.f88011zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2009iobyxmoadg.f88010yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f88008zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c2009iobyxmoadg.f88010yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2009iobyxmoadg) == objGxszxtbevo) {
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
            this.f88007zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f88007zdlpuopuiu.collect(new C2008iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f88012cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f88014jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f88015yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f88016zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f88014jyumaefscl = obj;
            this.f88012cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.hszhottldk(this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f88017jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ LocationData f88018yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88019zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(LocationData locationData, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f88018yggfygwlhe = locationData;
            this.f88017jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f88018yggfygwlhe, this.f88017jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f88019zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                LocationData locationData = this.f88018yggfygwlhe;
                if (locationData != null) {
                    this.f88017jyumaefscl.m(locationData);
                } else {
                    iobyxmoadg iobyxmoadgVar = this.f88017jyumaefscl;
                    this.f88019zdlpuopuiu = 1;
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
        /* synthetic */ Object f88020cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f88022iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f88023jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f88024lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f88025yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f88026zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f88020cqumvgiudr = obj;
            this.f88024lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.yzdjzghtvl(this);
        }
    }

    static final class oxmwwwfdhm implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ s10.eablkybsjg f88027yggfygwlhe;

        oxmwwwfdhm(s10.eablkybsjg eablkybsjgVar) {
            this.f88027yggfygwlhe = eablkybsjgVar;
        }

        @Override // sj.nufgyqmvbu
        public /* bridge */ /* synthetic */ Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow(((Boolean) obj).booleanValue(), gxszxtbevoVar);
        }

        public final Object zoijcleaow(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            if (iobyxmoadg.iwxlajgraz(iobyxmoadg.this).getFlow() == ShopsArgs.zoijcleaow.SPECIAL_BANNER) {
                iobyxmoadg.this.b(this.f88027yggfygwlhe);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f88029iobyxmoadg;

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
            f88029iobyxmoadg = iArr;
        }
    }

    public static final class rgvfuqvkyq implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f88030zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.iobyxmoadg$rgvfuqvkyq$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2010iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f88031zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.iobyxmoadg$rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2011iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f88033yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f88034zdlpuopuiu;

                public C2011iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f88034zdlpuopuiu = obj;
                    this.f88033yggfygwlhe |= Integer.MIN_VALUE;
                    return C2010iobyxmoadg.this.emit(null, this);
                }
            }

            public C2010iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f88031zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2011iobyxmoadg c2011iobyxmoadg;
                if (gxszxtbevoVar instanceof C2011iobyxmoadg) {
                    c2011iobyxmoadg = (C2011iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2011iobyxmoadg.f88033yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2011iobyxmoadg.f88033yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2011iobyxmoadg = new C2011iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2011iobyxmoadg = new C2011iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2011iobyxmoadg.f88034zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2011iobyxmoadg.f88033yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f88031zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c2011iobyxmoadg.f88033yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2011iobyxmoadg) == objGxszxtbevo) {
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
            this.f88030zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f88030zdlpuopuiu.collect(new C2010iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f88035cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f88037jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f88038yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f88039zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f88037jyumaefscl = obj;
            this.f88035cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.j(null, this);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f88040iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f88042yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f88043zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f88042yggfygwlhe = obj;
            this.f88040iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.fmlbqenlif(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88045zdlpuopuiu;

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
            int i13 = this.f88045zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                at.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f87964wflxmlrfwp;
                String name = iobyxmoadg.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                List listI = hg.agtfadlqog.i(iobyxmoadg.this.f87965wkgbmnqykc.zoijcleaow());
                this.f88045zdlpuopuiu = 1;
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
            at.ppxfxbqfkf ppxfxbqfkfVar = (at.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar instanceof at.ppxfxbqfkf.zoijcleaow) {
                iobyxmoadg.this.fiwbwshyhd();
            } else {
                if (!(ppxfxbqfkfVar instanceof at.ppxfxbqfkf.iobyxmoadg)) {
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
        final /* synthetic */ iobyxmoadg f88046yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f88047zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.iobyxmoadg$yggfygwlhe$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2012iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f88048yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f88049zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.iobyxmoadg$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2013iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f88051yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f88052zdlpuopuiu;

                public C2013iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f88052zdlpuopuiu = obj;
                    this.f88051yggfygwlhe |= Integer.MIN_VALUE;
                    return C2012iobyxmoadg.this.emit(null, this);
                }
            }

            public C2012iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f88049zdlpuopuiu = nufgyqmvbuVar;
                this.f88048yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2013iobyxmoadg c2013iobyxmoadg;
                if (gxszxtbevoVar instanceof C2013iobyxmoadg) {
                    c2013iobyxmoadg = (C2013iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2013iobyxmoadg.f88051yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2013iobyxmoadg.f88051yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2013iobyxmoadg = new C2013iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2013iobyxmoadg = new C2013iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2013iobyxmoadg.f88052zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2013iobyxmoadg.f88051yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f88049zdlpuopuiu;
                    gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) obj;
                    boolean zBooleanValue = ((Boolean) vdvldrhtssVar.iobyxmoadg()).booleanValue();
                    u10.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = (u10.lqeggnwhkg.iobyxmoadg) vdvldrhtssVar.wkgbmnqykc();
                    if (zBooleanValue && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg.iwxlajgraz(this.f88048yggfygwlhe).getSelectedServices(), iobyxmoadgVar.iobyxmoadg())) {
                        c2013iobyxmoadg.f88051yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2013iobyxmoadg) == objGxszxtbevo) {
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
            this.f88047zdlpuopuiu = lqeggnwhkgVar;
            this.f88046yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f88047zdlpuopuiu.collect(new C2012iobyxmoadg(nufgyqmvbuVar, this.f88046yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f88054zdlpuopuiu;

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
            if (this.f88054zdlpuopuiu != 0) {
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
        private final LocationData f88055iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f88056zoijcleaow;

        public zoijcleaow(LocationData locationData, List shops) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shops, "shops");
            this.f88055iobyxmoadg = locationData;
            this.f88056zoijcleaow = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f88055iobyxmoadg, zoijcleaowVar.f88055iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f88056zoijcleaow, zoijcleaowVar.f88056zoijcleaow);
        }

        public int hashCode() {
            LocationData locationData = this.f88055iobyxmoadg;
            return ((locationData == null ? 0 : locationData.hashCode()) * 31) + this.f88056zoijcleaow.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f88055iobyxmoadg;
        }

        public String toString() {
            return "FetchedShopsData(centerLocation=" + this.f88055iobyxmoadg + ", shops=" + this.f88056zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f88056zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, j42.zoijcleaow locationProvider, d20.iobyxmoadg getCenterPositionUseCase, d20.ppxfxbqfkf getMaxDistanceByPointUseCase, h30.gxszxtbevo getShopsUseCase, h30.eablkybsjg getShopServicesUseCase, h30.lqeggnwhkg getShopsWithServicesUseCase, h30.wkgbmnqykc getShopByVisibleRectUseCase, u10.lqeggnwhkg changeShopFiltersObserver, d20.zoijcleaow getMapSpecialBannerUseCase, at.iobyxmoadg permissionManager) {
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
        this.f87963ppxfxbqfkf = new sx.ppxfxbqfkf();
        this.f87965wkgbmnqykc = locationProvider;
        this.f87958eablkybsjg = getCenterPositionUseCase;
        this.f87960gxszxtbevo = getMaxDistanceByPointUseCase;
        this.f87961lqeggnwhkg = getShopsUseCase;
        this.f87962nufgyqmvbu = getShopServicesUseCase;
        this.f87957dxjokdxxww = getShopsWithServicesUseCase;
        this.f87955btonecajqb = getShopByVisibleRectUseCase;
        this.f87959gtknphoqwx = changeShopFiltersObserver;
        this.f87956draadjrbmk = getMapSpecialBannerUseCase;
        this.f87964wflxmlrfwp = permissionManager;
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
    public final void b(s10.eablkybsjg eablkybsjgVar) {
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
            ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.wkgbmnqykc(null));
        }
        if (isPositionCentered) {
            ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.nufgyqmvbu(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(CameraPosition cameraPosition, VisibleRegion visibleRegion) {
        q(visibleRegion);
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.ppxfxbqfkf(cameraPosition));
        crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.gxszxtbevo(((State) jlmebxxoox()).getSelectedServices()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(VisibleRegion visibleRegion, LocationData locationData, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        if (z13) {
            w(State.zoijcleaow.MAP);
            crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.gtknphoqwx(locationData));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.gtknphoqwx(locationData));
        q(visibleRegion);
        Object objX = x(this, ((State) jlmebxxoox()).getLastFocusRegion(), null, locationData, gxszxtbevoVar, 2, null);
        return objX == mg.zoijcleaow.gxszxtbevo() ? objX : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void eslsurpljm(LocationData locationData, double d13) {
        crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.ppxfxbqfkf(locationData, d13, ((State) jlmebxxoox()).getFlow()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        fiwbwshyhd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fiwbwshyhd() {
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.ppxfxbqfkf(null));
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.nufgyqmvbu(true));
        this.f87965wkgbmnqykc.iobyxmoadg(new tg.draadjrbmk() { // from class: h80.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.domain.feature.shops.store.iobyxmoadg.ageimvtcrz(this.f39829zdlpuopuiu, (LocationData) obj);
            }
        }, new tg.draadjrbmk() { // from class: h80.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.domain.feature.shops.store.iobyxmoadg.fyldjkxazc(this.f39830zdlpuopuiu, (Exception) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fmlbqenlif(lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar;
        Object objGxszxtbevo;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar;
            int i13 = wflxmlrfwpVar.f88040iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f88040iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
        }
        wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwpVar;
        Object obj = wflxmlrfwpVar2.f88042yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = wflxmlrfwpVar2.f88040iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            j42.zoijcleaow zoijcleaowVar = this.f87965wkgbmnqykc;
            wflxmlrfwpVar2.f88043zdlpuopuiu = this;
            wflxmlrfwpVar2.f88040iwizpuwonk = 1;
            objGxszxtbevo = j42.zoijcleaow.gxszxtbevo(zoijcleaowVar, 0L, null, wflxmlrfwpVar2, 3, null);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) wflxmlrfwpVar2.f88043zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objGxszxtbevo = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objGxszxtbevo)) {
            iobyxmoadgVar.m((LocationData) objGxszxtbevo);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objGxszxtbevo);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.eablkybsjg(false));
            iobyxmoadgVar.crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.nufgyqmvbu(thDxjokdxxww));
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
    public final void g(mb0.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.btonecajqb(wkgbmnqykcVar, ipoelvxyzq(wkgbmnqykcVar.lqeggnwhkg()), z13));
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
            int i13 = btonecajqbVar.f87970cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f87970cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object obj = btonecajqbVar.f87972jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f87970cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                int i15 = ppxfxbqfkf.f88029iobyxmoadg[((State) jlmebxxoox()).getFlow().ordinal()];
                if (i15 == 1) {
                    userLocation = ((State) jlmebxxoox()).getUserLocation();
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userLocation = ((State) jlmebxxoox()).getCentralPosition();
                }
                btonecajqbVar.f87974zdlpuopuiu = this;
                btonecajqbVar.f87973yggfygwlhe = userLocation;
                btonecajqbVar.f87970cqumvgiudr = 1;
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
            locationData = (LocationData) btonecajqbVar.f87973yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) btonecajqbVar.f87974zdlpuopuiu;
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
        crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.zoijcleaow(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object hszhottldk(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        h30.lqeggnwhkg lqeggnwhkgVar2;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f88012cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f88012cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objJrbgnlbqoe = lqeggnwhkgVar.f88014jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f88012cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                lqeggnwhkgVar2 = (h30.lqeggnwhkg) lqeggnwhkgVar.f88015yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) lqeggnwhkgVar.f88016zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objJrbgnlbqoe);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objJrbgnlbqoe);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objJrbgnlbqoe);
        lqeggnwhkgVar2 = this.f87957dxjokdxxww;
        lqeggnwhkgVar.f88016zdlpuopuiu = this;
        lqeggnwhkgVar.f88015yggfygwlhe = lqeggnwhkgVar2;
        lqeggnwhkgVar.f88012cqumvgiudr = 1;
        objJrbgnlbqoe = jrbgnlbqoe(lqeggnwhkgVar);
        if (objJrbgnlbqoe == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        h30.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = new h30.lqeggnwhkg.iobyxmoadg((List) objJrbgnlbqoe, ((State) iobyxmoadgVar.jlmebxxoox()).getSelectedServices());
        lqeggnwhkgVar.f88016zdlpuopuiu = null;
        lqeggnwhkgVar.f88015yggfygwlhe = null;
        lqeggnwhkgVar.f88012cqumvgiudr = 2;
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
    public final Object j(s10.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        vdvldrhtss vdvldrhtssVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof vdvldrhtss) {
            vdvldrhtssVar = (vdvldrhtss) gxszxtbevoVar;
            int i13 = vdvldrhtssVar.f88035cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vdvldrhtssVar.f88035cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar);
            }
        } else {
            vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar);
        }
        Object obj = vdvldrhtssVar.f88037jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = vdvldrhtssVar.f88035cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                eablkybsjgVar = (s10.eablkybsjg) vdvldrhtssVar.f88038yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) vdvldrhtssVar.f88039zdlpuopuiu;
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
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.zoijcleaow(eablkybsjgVar.wkgbmnqykc(), eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.iobyxmoadg(), eablkybsjgVar.zoijcleaow()));
        vdvldrhtssVar.f88039zdlpuopuiu = this;
        vdvldrhtssVar.f88038yggfygwlhe = eablkybsjgVar;
        vdvldrhtssVar.f88035cqumvgiudr = 1;
        if (grlcpdaxtj(vdvldrhtssVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(iobyxmoadgVar.ezmngbhpjk());
        oxmwwwfdhm oxmwwwfdhmVar = iobyxmoadgVar.new oxmwwwfdhm(eablkybsjgVar);
        vdvldrhtssVar.f88039zdlpuopuiu = null;
        vdvldrhtssVar.f88038yggfygwlhe = null;
        vdvldrhtssVar.f88035cqumvgiudr = 2;
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
            int i13 = draadjrbmkVar.f87977iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f87977iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object objRhgxfdycjh = draadjrbmkVar.f87979yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f87977iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
            List allShops = ((State) jlmebxxoox()).getAllShops();
            if (!allShops.isEmpty()) {
                return allShops;
            }
            draadjrbmkVar.f87980zdlpuopuiu = this;
            draadjrbmkVar.f87977iwizpuwonk = 1;
            objRhgxfdycjh = rhgxfdycjh(draadjrbmkVar);
            if (objRhgxfdycjh == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) draadjrbmkVar.f87980zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
        }
        List list = (List) objRhgxfdycjh;
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.iobyxmoadg(list));
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void krqnebusok(CameraPosition cameraPosition) {
        crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.wkgbmnqykc(cameraPosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(zoijcleaow zoijcleaowVar) {
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.C2006gxszxtbevo(zoijcleaowVar.zoijcleaow()));
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
            ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.draadjrbmk(locationData));
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
            int i13 = gtknphoqwxVar.f87995lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f87995lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objZoijcleaow = gtknphoqwxVar.f87991cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f87995lereixgezr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            List allShops = ((State) jlmebxxoox()).getAllShops();
            List selectedServices = ((State) jlmebxxoox()).getSelectedServices();
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                h30.wkgbmnqykc wkgbmnqykcVar = this.f87955btonecajqb;
                h30.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = new h30.wkgbmnqykc.iobyxmoadg(allShops, locationData, locationData2, locationData3, selectedServices);
                gtknphoqwxVar.f87997zdlpuopuiu = this;
                gtknphoqwxVar.f87996yggfygwlhe = locationData;
                zoijcleaowVar2 = zoijcleaowVar;
                try {
                    gtknphoqwxVar.f87994jyumaefscl = zoijcleaowVar2;
                    gtknphoqwxVar.f87993iwizpuwonk = z13;
                    gtknphoqwxVar.f87995lereixgezr = 1;
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
            z14 = gtknphoqwxVar.f87993iwizpuwonk;
            zoijcleaowVar3 = (State.zoijcleaow) gtknphoqwxVar.f87994jyumaefscl;
            locationData4 = (LocationData) gtknphoqwxVar.f87996yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) gtknphoqwxVar.f87997zdlpuopuiu;
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
            iobyxmoadgVar.ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.wflxmlrfwp((List) objWkgbmnqykc, zoijcleaowVar3));
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
        int i13 = ppxfxbqfkf.f88029iobyxmoadg[((State) jlmebxxoox()).getFlow().ordinal()];
        if (i13 == 1) {
            a(this, rm.ppxfxbqfkf.iobyxmoadg(), 0.0d, 2, null);
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
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.dxjokdxxww(true));
    }

    private final wwaezpbzkn q(VisibleRegion visibleRegion) {
        if (visibleRegion == null) {
            return null;
        }
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.wkgbmnqykc(visibleRegion));
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
            int i13 = agtfadlqogVar.f87966iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                agtfadlqogVar.f87966iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            }
        } else {
            agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
        }
        Object objZoijcleaow = agtfadlqogVar.f87968yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = agtfadlqogVar.f87966iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            int i15 = ppxfxbqfkf.f88029iobyxmoadg[((State) jlmebxxoox()).getFlow().ordinal()];
            if (i15 == 1) {
                h30.gxszxtbevo gxszxtbevoVar2 = this.f87961lqeggnwhkg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                agtfadlqogVar.f87966iwizpuwonk = 1;
                objZoijcleaow = gxszxtbevoVar2.zoijcleaow(wwaezpbzknVar, agtfadlqogVar);
                return objZoijcleaow == objGxszxtbevo ? objGxszxtbevo : objZoijcleaow;
            }
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                d20.zoijcleaow zoijcleaowVar = this.f87956draadjrbmk;
                d20.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new d20.zoijcleaow.iobyxmoadg(((State) jlmebxxoox()).getBannerId(), Integer.parseInt(((State) jlmebxxoox()).getBlockId()));
                agtfadlqogVar.f87969zdlpuopuiu = this;
                agtfadlqogVar.f87966iwizpuwonk = 2;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar3, agtfadlqogVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((r00.iobyxmoadg) objZoijcleaow);
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
            iobyxmoadgVar = (iobyxmoadg) agtfadlqogVar.f87969zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((r00.iobyxmoadg) objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.k(thDxjokdxxww);
            objWkgbmnqykc = new r00.iobyxmoadg(null, null, null, null, 15, null);
        }
        return ((r00.iobyxmoadg) objWkgbmnqykc).iobyxmoadg();
    }

    private final void t() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new kcexrzcfyt(ezmngbhpjk()), new zdlpuopuiu(null)), sopmlzcsov());
    }

    private final void u() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new yggfygwlhe(sj.dxjokdxxww.wflxmlrfwp(ezmngbhpjk(), this.f87959gtknphoqwx.btonecajqb(), new jyumaefscl(null)), this), new iwizpuwonk(null)), new cqumvgiudr(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object v(VisibleRegion visibleRegion, State.zoijcleaow zoijcleaowVar, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) {
        esjtqupxsv esjtqupxsvVar;
        if (gxszxtbevoVar instanceof esjtqupxsv) {
            esjtqupxsvVar = (esjtqupxsv) gxszxtbevoVar;
            int i13 = esjtqupxsvVar.f87986cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                esjtqupxsvVar.f87986cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
            }
        } else {
            esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
        }
        esjtqupxsv esjtqupxsvVar2 = esjtqupxsvVar;
        Object obj = esjtqupxsvVar2.f87988jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = esjtqupxsvVar2.f87986cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            LocationData userLocation = ((State) jlmebxxoox()).getUserLocation();
            ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.gtknphoqwx(locationData));
            if (visibleRegion != null) {
                q(visibleRegion);
                LocationData locationData2 = locationData == null ? userLocation : locationData;
                LocationData topLeft = visibleRegion.getTopLeft();
                LocationData bottomRight = visibleRegion.getBottomRight();
                esjtqupxsvVar2.f87990zdlpuopuiu = this;
                esjtqupxsvVar2.f87989yggfygwlhe = zoijcleaowVar;
                esjtqupxsvVar2.f87986cqumvgiudr = 1;
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
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.lqeggnwhkg(zoijcleaowVar));
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
            zg.btonecajqb btonecajqbVar = f87954rgvfuqvkyq;
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
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ru.myspar.domain.feature.shops.store.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ru.myspar.domain.feature.shops.store.iobyxmoadg] */
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
            int i13 = ojitshcjhnVar.f88024lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ojitshcjhnVar.f88024lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
            }
        } else {
            ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
        }
        Object objRhgxfdycjh = ojitshcjhnVar.f88020cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ojitshcjhnVar.f88024lereixgezr;
        ?? r16 = 2;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iobyxmoadgVar = (iobyxmoadg) ojitshcjhnVar.f88026zdlpuopuiu;
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
                        list = (List) ojitshcjhnVar.f88025yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar5 = (iobyxmoadg) ojitshcjhnVar.f88026zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
                        iobyxmoadgVar2 = iobyxmoadgVar5;
                        list2 = (List) objRhgxfdycjh;
                        d20.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar2.f87958eablkybsjg;
                        d20.iobyxmoadg.zoijcleaow zoijcleaowVar = new d20.iobyxmoadg.zoijcleaow(list);
                        ojitshcjhnVar.f88026zdlpuopuiu = iobyxmoadgVar2;
                        ojitshcjhnVar.f88025yggfygwlhe = list;
                        ojitshcjhnVar.f88023jyumaefscl = list2;
                        ojitshcjhnVar.f88024lereixgezr = 3;
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
                        d20.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar3.f87960gxszxtbevo;
                        d20.ppxfxbqfkf.zoijcleaow zoijcleaowVar2 = new d20.ppxfxbqfkf.zoijcleaow(list4, locationData);
                        ojitshcjhnVar.f88026zdlpuopuiu = iobyxmoadgVar3;
                        ojitshcjhnVar.f88025yggfygwlhe = list4;
                        ojitshcjhnVar.f88023jyumaefscl = list3;
                        ojitshcjhnVar.f88022iwizpuwonk = locationData;
                        ojitshcjhnVar.f88024lereixgezr = 4;
                        objZoijcleaow2 = ppxfxbqfkfVar.zoijcleaow(zoijcleaowVar2, ojitshcjhnVar);
                        if (objZoijcleaow2 == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        List list7 = list3;
                        locationData2 = locationData;
                        objRhgxfdycjh = objZoijcleaow2;
                        list5 = list7;
                        r16 = iobyxmoadgVar3;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new s10.eablkybsjg(list4, list5, locationData2, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((Number) objRhgxfdycjh).doubleValue() * 0.001d)));
                        r13 = r16;
                        r15 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            ojitshcjhnVar.f88026zdlpuopuiu = r13;
                            ojitshcjhnVar.f88025yggfygwlhe = objWkgbmnqykc;
                            ojitshcjhnVar.f88023jyumaefscl = null;
                            ojitshcjhnVar.f88022iwizpuwonk = null;
                            ojitshcjhnVar.f88024lereixgezr = 5;
                            if (r13.j((s10.eablkybsjg) objWkgbmnqykc, ojitshcjhnVar) == objGxszxtbevo) {
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
                        list3 = (List) ojitshcjhnVar.f88023jyumaefscl;
                        list4 = (List) ojitshcjhnVar.f88025yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar7 = (iobyxmoadg) ojitshcjhnVar.f88026zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
                        iobyxmoadgVar3 = iobyxmoadgVar7;
                        locationData = (LocationData) objRhgxfdycjh;
                        d20.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVar3.f87960gxszxtbevo;
                        d20.ppxfxbqfkf.zoijcleaow zoijcleaowVar3 = new d20.ppxfxbqfkf.zoijcleaow(list4, locationData);
                        ojitshcjhnVar.f88026zdlpuopuiu = iobyxmoadgVar3;
                        ojitshcjhnVar.f88025yggfygwlhe = list4;
                        ojitshcjhnVar.f88023jyumaefscl = list3;
                        ojitshcjhnVar.f88022iwizpuwonk = locationData;
                        ojitshcjhnVar.f88024lereixgezr = 4;
                        objZoijcleaow2 = ppxfxbqfkfVar2.zoijcleaow(zoijcleaowVar3, ojitshcjhnVar);
                        if (objZoijcleaow2 == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        List list8 = list3;
                        locationData2 = locationData;
                        objRhgxfdycjh = objZoijcleaow2;
                        list5 = list8;
                        r16 = iobyxmoadgVar3;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new s10.eablkybsjg(list4, list5, locationData2, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((Number) objRhgxfdycjh).doubleValue() * 0.001d)));
                        r13 = r16;
                        r15 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            ojitshcjhnVar.f88026zdlpuopuiu = r13;
                            ojitshcjhnVar.f88025yggfygwlhe = objWkgbmnqykc;
                            ojitshcjhnVar.f88023jyumaefscl = null;
                            ojitshcjhnVar.f88022iwizpuwonk = null;
                            ojitshcjhnVar.f88024lereixgezr = 5;
                            if (r13.j((s10.eablkybsjg) objWkgbmnqykc, ojitshcjhnVar) == objGxszxtbevo) {
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
                        locationData2 = (LocationData) ojitshcjhnVar.f88022iwizpuwonk;
                        list5 = (List) ojitshcjhnVar.f88023jyumaefscl;
                        list4 = (List) ojitshcjhnVar.f88025yggfygwlhe;
                        iobyxmoadg iobyxmoadgVar8 = (iobyxmoadg) ojitshcjhnVar.f88026zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(objRhgxfdycjh);
                        r16 = iobyxmoadgVar8;
                        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new s10.eablkybsjg(list4, list5, locationData2, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((Number) objRhgxfdycjh).doubleValue() * 0.001d)));
                        r13 = r16;
                        r15 = r13;
                        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                            ojitshcjhnVar.f88026zdlpuopuiu = r13;
                            ojitshcjhnVar.f88025yggfygwlhe = objWkgbmnqykc;
                            ojitshcjhnVar.f88023jyumaefscl = null;
                            ojitshcjhnVar.f88022iwizpuwonk = null;
                            ojitshcjhnVar.f88024lereixgezr = 5;
                            if (r13.j((s10.eablkybsjg) objWkgbmnqykc, ojitshcjhnVar) == objGxszxtbevo) {
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
                    obj = ojitshcjhnVar.f88025yggfygwlhe;
                    iobyxmoadg iobyxmoadgVar9 = (iobyxmoadg) ojitshcjhnVar.f88026zdlpuopuiu;
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
            ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.eablkybsjg(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = gg.kcexrzcfyt.f37117yggfygwlhe;
                ojitshcjhnVar.f88026zdlpuopuiu = this;
                ojitshcjhnVar.f88024lereixgezr = 1;
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
            h30.eablkybsjg eablkybsjgVar = iobyxmoadgVar.f87962nufgyqmvbu;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            ojitshcjhnVar.f88026zdlpuopuiu = iobyxmoadgVar;
            ojitshcjhnVar.f88025yggfygwlhe = list9;
            ojitshcjhnVar.f88024lereixgezr = 2;
            Object objZoijcleaow3 = eablkybsjgVar.zoijcleaow(wwaezpbzknVar, ojitshcjhnVar);
            if (objZoijcleaow3 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg iobyxmoadgVar12 = iobyxmoadgVar;
            list = list9;
            objRhgxfdycjh = objZoijcleaow3;
            iobyxmoadgVar2 = iobyxmoadgVar12;
            list2 = (List) objRhgxfdycjh;
            d20.iobyxmoadg iobyxmoadgVar13 = iobyxmoadgVar2.f87958eablkybsjg;
            d20.iobyxmoadg.zoijcleaow zoijcleaowVar4 = new d20.iobyxmoadg.zoijcleaow(list);
            ojitshcjhnVar.f88026zdlpuopuiu = iobyxmoadgVar2;
            ojitshcjhnVar.f88025yggfygwlhe = list;
            ojitshcjhnVar.f88023jyumaefscl = list2;
            ojitshcjhnVar.f88024lereixgezr = 3;
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
            d20.ppxfxbqfkf ppxfxbqfkfVar3 = iobyxmoadgVar3.f87960gxszxtbevo;
            d20.ppxfxbqfkf.zoijcleaow zoijcleaowVar5 = new d20.ppxfxbqfkf.zoijcleaow(list4, locationData);
            ojitshcjhnVar.f88026zdlpuopuiu = iobyxmoadgVar3;
            ojitshcjhnVar.f88025yggfygwlhe = list4;
            ojitshcjhnVar.f88023jyumaefscl = list3;
            ojitshcjhnVar.f88022iwizpuwonk = locationData;
            ojitshcjhnVar.f88024lereixgezr = 4;
            objZoijcleaow2 = ppxfxbqfkfVar3.zoijcleaow(zoijcleaowVar5, ojitshcjhnVar);
            if (objZoijcleaow2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            List list11 = list3;
            locationData2 = locationData;
            objRhgxfdycjh = objZoijcleaow2;
            list5 = list11;
            r16 = iobyxmoadgVar3;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new s10.eablkybsjg(list4, list5, locationData2, kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(((Number) objRhgxfdycjh).doubleValue() * 0.001d)));
            r13 = r16;
            r15 = r13;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                ojitshcjhnVar.f88026zdlpuopuiu = r13;
                ojitshcjhnVar.f88025yggfygwlhe = objWkgbmnqykc;
                ojitshcjhnVar.f88023jyumaefscl = null;
                ojitshcjhnVar.f88022iwizpuwonk = null;
                ojitshcjhnVar.f88024lereixgezr = 5;
                if (r13.j((s10.eablkybsjg) objWkgbmnqykc, ojitshcjhnVar) == objGxszxtbevo) {
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
        return this.f87963ppxfxbqfkf.ppxfxbqfkf();
    }

    public final void k(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new ru.myspar.domain.feature.shops.store.gxszxtbevo.eablkybsjg(false));
        crxdokpmqz(new ru.myspar.domain.feature.shops.store.eablkybsjg.lqeggnwhkg(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: lxfrhoxuzk, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.domain.feature.shops.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.domain.feature.shops.store.ppxfxbqfkf.zoijcleaow.f88062iobyxmoadg)) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.domain.feature.shops.store.ppxfxbqfkf.wkgbmnqykc.f88061iobyxmoadg)) {
            u();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.domain.feature.shops.store.ppxfxbqfkf.C2014ppxfxbqfkf.f88060iobyxmoadg)) {
            t();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.domain.feature.shops.store.ppxfxbqfkf.iobyxmoadg.f88059iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            igdgnonuha();
        }
    }

    public void r(boolean z13) {
        this.f87963ppxfxbqfkf.eablkybsjg(z13);
    }

    public void s(boolean z13) {
        this.f87963ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: wizcaqwiak, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.domain.feature.shops.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(intent, this, null), 3, null);
    }
}
