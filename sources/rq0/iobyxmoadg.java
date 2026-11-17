package rq0;

import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import hh1.gtknphoqwx;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.hkdspvbjdz;
import m01.nufgyqmvbu;
import ow1.iwizpuwonk;
import ow1.ylkuphrtab;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.impl.subcatalog.domain.store.State;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogBanner;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StoryNavLink;
import sj.dxjokdxxww;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private pz0.iobyxmoadg f83607agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ut1.iobyxmoadg f83608btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final iwizpuwonk f83609draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final nufgyqmvbu f83610dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ylkuphrtab f83611eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ow1.zoijcleaow f83612gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final r01.ppxfxbqfkf f83613gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final vm0.zoijcleaow f83614lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ah1.iobyxmoadg f83615nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f83616ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final m01.iobyxmoadg f83617wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final r01.eablkybsjg f83618wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f83619iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f83620jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83622zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83620jyumaefscl = str;
            this.f83619iwizpuwonk = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f83620jyumaefscl, this.f83619iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83622zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ah1.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f83615nufgyqmvbu;
                gtknphoqwx.wkgbmnqykc wkgbmnqykcVar = new gtknphoqwx.wkgbmnqykc(this.f83620jyumaefscl);
                AnalyticsPage.SubCatalog subCatalog = new AnalyticsPage.SubCatalog(this.f83619iwizpuwonk, this.f83620jyumaefscl);
                this.f83622zdlpuopuiu = 1;
                if (iobyxmoadgVar.gxszxtbevo(wkgbmnqykcVar, subCatalog, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: rq0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1880iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f83623jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ rq0.wkgbmnqykc f83624yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83625zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1880iobyxmoadg(rq0.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83624yggfygwlhe = wkgbmnqykcVar;
            this.f83623jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1880iobyxmoadg(this.f83624yggfygwlhe, this.f83623jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83625zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rq0.wkgbmnqykc wkgbmnqykcVar = this.f83624yggfygwlhe;
                if (wkgbmnqykcVar instanceof rq0.wkgbmnqykc.eablkybsjg) {
                    this.f83623jyumaefscl.tbqsvytpvh(((rq0.wkgbmnqykc.eablkybsjg) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof rq0.wkgbmnqykc.nufgyqmvbu) {
                    this.f83623jyumaefscl.roivzttewh(((rq0.wkgbmnqykc.nufgyqmvbu) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof rq0.wkgbmnqykc.C1885wkgbmnqykc) {
                    this.f83623jyumaefscl.weqkydbzbr(((rq0.wkgbmnqykc.C1885wkgbmnqykc) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof rq0.wkgbmnqykc.gxszxtbevo) {
                    iobyxmoadg.iwxlajgraz(this.f83623jyumaefscl, AnalyticsPage.Scan.f92372iwizpuwonk, null, null, 6, null);
                    this.f83623jyumaefscl.crxdokpmqz(rq0.eablkybsjg.C1879eablkybsjg.f83589iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof rq0.wkgbmnqykc.lqeggnwhkg) {
                    iobyxmoadg.iwxlajgraz(this.f83623jyumaefscl, AnalyticsPage.Search.f92373iwizpuwonk, null, null, 6, null);
                    this.f83623jyumaefscl.crxdokpmqz(new rq0.eablkybsjg.gxszxtbevo(iobyxmoadg.ydmasvzmpa(this.f83623jyumaefscl).getArgs()));
                } else if (wkgbmnqykcVar instanceof rq0.wkgbmnqykc.dxjokdxxww) {
                    iobyxmoadg iobyxmoadgVar = this.f83623jyumaefscl;
                    this.f83625zdlpuopuiu = 1;
                    if (iobyxmoadgVar.oipsdeybqn(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof rq0.wkgbmnqykc.btonecajqb) {
                    String orderEditId = iobyxmoadg.ydmasvzmpa(this.f83623jyumaefscl).getArgs().getOrderEditId();
                    if (orderEditId != null) {
                        this.f83623jyumaefscl.crxdokpmqz(new rq0.eablkybsjg.dxjokdxxww(orderEditId));
                    }
                } else if (wkgbmnqykcVar instanceof rq0.wkgbmnqykc.ppxfxbqfkf) {
                    iobyxmoadg iobyxmoadgVar2 = this.f83623jyumaefscl;
                    String strIobyxmoadg = ((rq0.wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg();
                    this.f83625zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.zeieaojujs(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, rq0.wkgbmnqykc.zoijcleaow.f83665iobyxmoadg)) {
                    this.f83623jyumaefscl.crxdokpmqz(rq0.eablkybsjg.iobyxmoadg.f83593iobyxmoadg);
                } else {
                    if (!(wkgbmnqykcVar instanceof rq0.wkgbmnqykc.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f83623jyumaefscl.lrnfpwlwnk(((rq0.wkgbmnqykc.iobyxmoadg) this.f83624yggfygwlhe).zoijcleaow(), ((rq0.wkgbmnqykc.iobyxmoadg) this.f83624yggfygwlhe).iobyxmoadg());
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1880iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83627zdlpuopuiu;

        /* JADX INFO: renamed from: rq0.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        static final class C1881iobyxmoadg extends draadjrbmk implements oxmwwwfdhm {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            /* synthetic */ boolean f83628iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f83629jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ boolean f83630yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f83631zdlpuopuiu;

            C1881iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(4, gxszxtbevoVar);
            }

            @Override // tg.oxmwwwfdhm
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ojitshcjhn(((Boolean) obj).booleanValue(), (pz0.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f83631zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                boolean z13 = this.f83630yggfygwlhe;
                return new gg.iwizpuwonk(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13), (pz0.iobyxmoadg) this.f83629jyumaefscl, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f83628iwizpuwonk));
            }

            public final Object ojitshcjhn(boolean z13, pz0.iobyxmoadg iobyxmoadgVar, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
                C1881iobyxmoadg c1881iobyxmoadg = new C1881iobyxmoadg(gxszxtbevoVar);
                c1881iobyxmoadg.f83630yggfygwlhe = z13;
                c1881iobyxmoadg.f83629jyumaefscl = iobyxmoadgVar;
                c1881iobyxmoadg.f83628iwizpuwonk = z14;
                return c1881iobyxmoadg.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: rq0.iobyxmoadg$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C1882ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f83632zdlpuopuiu;

            /* JADX INFO: renamed from: rq0.iobyxmoadg$ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1883iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f83633zdlpuopuiu;

                /* JADX INFO: renamed from: rq0.iobyxmoadg$ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C1884iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f83635yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f83636zdlpuopuiu;

                    public C1884iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f83636zdlpuopuiu = obj;
                        this.f83635yggfygwlhe |= Integer.MIN_VALUE;
                        return C1883iobyxmoadg.this.emit(null, this);
                    }
                }

                public C1883iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f83633zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C1884iobyxmoadg c1884iobyxmoadg;
                    if (gxszxtbevoVar instanceof C1884iobyxmoadg) {
                        c1884iobyxmoadg = (C1884iobyxmoadg) gxszxtbevoVar;
                        int i13 = c1884iobyxmoadg.f83635yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c1884iobyxmoadg.f83635yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c1884iobyxmoadg = new C1884iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c1884iobyxmoadg = new C1884iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c1884iobyxmoadg.f83636zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c1884iobyxmoadg.f83635yggfygwlhe;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f83633zdlpuopuiu;
                        if (((Boolean) ((gg.iwizpuwonk) obj).lqeggnwhkg()).booleanValue()) {
                            c1884iobyxmoadg.f83635yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c1884iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
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

            public C1882ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f83632zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f83632zdlpuopuiu.collect(new C1883iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f83637yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f83638zdlpuopuiu;

            zoijcleaow(hkdspvbjdz hkdspvbjdzVar, iobyxmoadg iobyxmoadgVar) {
                this.f83638zdlpuopuiu = hkdspvbjdzVar;
                this.f83637yggfygwlhe = iobyxmoadgVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(gg.iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
                boolean z13;
                Object objOipsdeybqn;
                boolean zBooleanValue = ((Boolean) iwizpuwonkVar.iobyxmoadg()).booleanValue();
                pz0.iobyxmoadg iobyxmoadgVar = (pz0.iobyxmoadg) iwizpuwonkVar.wkgbmnqykc();
                boolean z14 = true;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue), this.f83638zdlpuopuiu.f60015zdlpuopuiu)) {
                    z13 = false;
                } else {
                    this.f83638zdlpuopuiu.f60015zdlpuopuiu = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue);
                    z13 = true;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f83637yggfygwlhe.f83607agtfadlqog, iobyxmoadgVar)) {
                    z14 = z13;
                } else {
                    this.f83637yggfygwlhe.f83607agtfadlqog = iobyxmoadgVar;
                }
                return (z14 && (objOipsdeybqn = this.f83637yggfygwlhe.oipsdeybqn(gxszxtbevoVar)) == mg.zoijcleaow.gxszxtbevo()) ? objOipsdeybqn : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83627zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
                ylkuphrtab ylkuphrtabVar = iobyxmoadg.this.f83611eablkybsjg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                C1882ppxfxbqfkf c1882ppxfxbqfkf = new C1882ppxfxbqfkf(dxjokdxxww.draadjrbmk((sj.lqeggnwhkg) ylkuphrtabVar.zoijcleaow(wwaezpbzknVar), iobyxmoadg.this.f83610dxjokdxxww.zoijcleaow(wwaezpbzknVar), iobyxmoadg.this.bfopjjpdmp(), new C1881iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(hkdspvbjdzVar, iobyxmoadg.this);
                this.f83627zdlpuopuiu = 1;
                if (c1882ppxfxbqfkf.collect(zoijcleaowVar, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f83639cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f83641iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f83642jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f83643lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f83644yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83645zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83639cqumvgiudr = obj;
            this.f83643lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zeieaojujs(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f83646cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f83648jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f83649yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83650zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83648jyumaefscl = obj;
            this.f83646cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, r01.eablkybsjg getCatalogWithChildUseCase, ylkuphrtab subscribeuserIsAuthUseCase, r01.ppxfxbqfkf getCatalogBannersUseCase, vm0.zoijcleaow analyticsTracker, ah1.iobyxmoadg popupsObserver, nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, ut1.iobyxmoadg getOnboardingStoryUseCase, ow1.zoijcleaow changeAdultCheckedUseCase, iwizpuwonk isAdultCheckedUseCase, m01.iobyxmoadg getCurrentDeliveryDataUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogWithChildUseCase, "getCatalogWithChildUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeuserIsAuthUseCase, "subscribeuserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogBannersUseCase, "getCatalogBannersUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popupsObserver, "popupsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOnboardingStoryUseCase, "getOnboardingStoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        this.f83616ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f83618wkgbmnqykc = getCatalogWithChildUseCase;
        this.f83611eablkybsjg = subscribeuserIsAuthUseCase;
        this.f83613gxszxtbevo = getCatalogBannersUseCase;
        this.f83614lqeggnwhkg = analyticsTracker;
        this.f83615nufgyqmvbu = popupsObserver;
        this.f83610dxjokdxxww = subscribeToCurrentDeliveryDataUseCase;
        this.f83608btonecajqb = getOnboardingStoryUseCase;
        this.f83612gtknphoqwx = changeAdultCheckedUseCase;
        this.f83609draadjrbmk = isAdultCheckedUseCase;
        this.f83617wflxmlrfwp = getCurrentDeliveryDataUseCase;
    }

    private final void auzgnhcxok(AnalyticsPage analyticsPage, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement) {
        this.f83614lqeggnwhkg.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.SubCatalog(((State) jlmebxxoox()).getTitle(), ((State) jlmebxxoox()).getArgs().getParentId()), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void iwxlajgraz(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticsLocation = null;
        }
        if ((i13 & 4) != 0) {
            analyticElement = null;
        }
        iobyxmoadgVar.auzgnhcxok(analyticsPage, analyticsLocation, analyticElement);
    }

    private final void iyctptxqzt(uq0.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        iwxlajgraz(this, new AnalyticsPage.ProductList(zoijcleaowVar.wkgbmnqykc(), zoijcleaowVar.getId()), null, null, 6, null);
        crxdokpmqz(new rq0.eablkybsjg.wkgbmnqykc(((State) jlmebxxoox()).getArgs(), zoijcleaowVar.getId(), ((State) jlmebxxoox()).getTitle(), zoijcleaowVar.ppxfxbqfkf()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lrnfpwlwnk(boolean z13, uq0.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        if (z13) {
            this.f83612gtknphoqwx.zoijcleaow(Boolean.TRUE);
            iyctptxqzt(zoijcleaowVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nuxfzjnpeb(Throwable th2) {
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(false));
        crxdokpmqz(new rq0.eablkybsjg.lqeggnwhkg(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:49:0x00f3, B:53:0x00fe, B:52:0x00fa, B:21:0x004c), top: B:73:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object oipsdeybqn(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        r01.eablkybsjg.iobyxmoadg iobyxmoadgVar2;
        r01.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3;
        iobyxmoadg iobyxmoadgVar4;
        CatalogWithSubCatalogs catalogWithSubCatalogs;
        CatalogWithSubCatalogs catalogWithSubCatalogs2;
        Throwable th2;
        iobyxmoadg iobyxmoadgVar5;
        Object objZoijcleaow;
        Object objWkgbmnqykc;
        Object objWkgbmnqykc2;
        Throwable thDxjokdxxww;
        CatalogWithSubCatalogs catalogWithSubCatalogs3;
        List list;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f83646cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f83646cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow2 = zoijcleaowVar.f83648jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f83646cqumvgiudr;
        try {
            try {
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                    ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
                    m01.iobyxmoadg iobyxmoadgVar6 = this.f83617wflxmlrfwp;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaowVar.f83650zdlpuopuiu = this;
                    zoijcleaowVar.f83646cqumvgiudr = 1;
                    objZoijcleaow2 = iobyxmoadgVar6.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
                    if (objZoijcleaow2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar = this;
                } else if (i14 == 1) {
                    iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f83650zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                } else {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        catalogWithSubCatalogs2 = (CatalogWithSubCatalogs) zoijcleaowVar.f83649yggfygwlhe;
                        iobyxmoadgVar5 = (iobyxmoadg) zoijcleaowVar.f83650zdlpuopuiu;
                        try {
                            zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                            } catch (Throwable th4) {
                                th = th4;
                                iobyxmoadgVar4 = iobyxmoadgVar5;
                                kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = kcexrzcfyt.f37117yggfygwlhe;
                                objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                            }
                        }
                        iobyxmoadgVar4 = iobyxmoadgVar5;
                        if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                            objWkgbmnqykc = jyumaefscl.wflxmlrfwp();
                        }
                        objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(cqumvgiudr.iobyxmoadg(catalogWithSubCatalogs2, (List) objWkgbmnqykc));
                        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc2)) {
                            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) objWkgbmnqykc2;
                            catalogWithSubCatalogs3 = (CatalogWithSubCatalogs) vdvldrhtssVar.iobyxmoadg();
                            list = (List) vdvldrhtssVar.wkgbmnqykc();
                            if (catalogWithSubCatalogs3.getChildCatalogSections().isEmpty() || !list.isEmpty()) {
                                iobyxmoadgVar4.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(catalogWithSubCatalogs3, list));
                            } else {
                                iobyxmoadgVar4.crxdokpmqz(rq0.eablkybsjg.nufgyqmvbu.f83595iobyxmoadg);
                            }
                        }
                        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                        if (thDxjokdxxww != null) {
                            iobyxmoadgVar4.nuxfzjnpeb(thDxjokdxxww);
                            iobyxmoadgVar4.crxdokpmqz(rq0.eablkybsjg.nufgyqmvbu.f83595iobyxmoadg);
                        }
                        iobyxmoadgVar4.f83614lqeggnwhkg.zoijcleaow(new ym0.gtknphoqwx.iobyxmoadg((Map) null, 1, (kotlin.jvm.internal.gtknphoqwx) null));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    r01.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar9 = (r01.ppxfxbqfkf.iobyxmoadg) zoijcleaowVar.f83649yggfygwlhe;
                    iobyxmoadgVar4 = (iobyxmoadg) zoijcleaowVar.f83650zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                        iobyxmoadgVar3 = iobyxmoadgVar9;
                        iobyxmoadgVar = iobyxmoadgVar4;
                        catalogWithSubCatalogs = (CatalogWithSubCatalogs) objZoijcleaow2;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = kcexrzcfyt.f37117yggfygwlhe;
                        r01.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f83613gxszxtbevo;
                        zoijcleaowVar.f83650zdlpuopuiu = iobyxmoadgVar;
                        zoijcleaowVar.f83649yggfygwlhe = catalogWithSubCatalogs;
                        zoijcleaowVar.f83646cqumvgiudr = 3;
                        objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
                        if (objZoijcleaow == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        catalogWithSubCatalogs2 = catalogWithSubCatalogs;
                        objZoijcleaow2 = objZoijcleaow;
                        iobyxmoadgVar5 = iobyxmoadgVar;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow2);
                        iobyxmoadgVar4 = iobyxmoadgVar5;
                        if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                            objWkgbmnqykc = jyumaefscl.wflxmlrfwp();
                        }
                        objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(cqumvgiudr.iobyxmoadg(catalogWithSubCatalogs2, (List) objWkgbmnqykc));
                        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc2)) {
                            vdvldrhtss vdvldrhtssVar2 = (vdvldrhtss) objWkgbmnqykc2;
                            catalogWithSubCatalogs3 = (CatalogWithSubCatalogs) vdvldrhtssVar2.iobyxmoadg();
                            list = (List) vdvldrhtssVar2.wkgbmnqykc();
                            if (catalogWithSubCatalogs3.getChildCatalogSections().isEmpty()) {
                                iobyxmoadgVar4.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(catalogWithSubCatalogs3, list));
                            } else {
                                iobyxmoadgVar4.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(catalogWithSubCatalogs3, list));
                            }
                        }
                        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                        if (thDxjokdxxww != null) {
                            iobyxmoadgVar4.nuxfzjnpeb(thDxjokdxxww);
                            iobyxmoadgVar4.crxdokpmqz(rq0.eablkybsjg.nufgyqmvbu.f83595iobyxmoadg);
                        }
                        iobyxmoadgVar4.f83614lqeggnwhkg.zoijcleaow(new ym0.gtknphoqwx.iobyxmoadg((Map) null, 1, (kotlin.jvm.internal.gtknphoqwx) null));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th5) {
                        th = th5;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar11 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    }
                }
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar12 = kcexrzcfyt.f37117yggfygwlhe;
                r01.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVar.f83613gxszxtbevo;
                zoijcleaowVar.f83650zdlpuopuiu = iobyxmoadgVar;
                zoijcleaowVar.f83649yggfygwlhe = catalogWithSubCatalogs;
                zoijcleaowVar.f83646cqumvgiudr = 3;
                objZoijcleaow = ppxfxbqfkfVar2.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                catalogWithSubCatalogs2 = catalogWithSubCatalogs;
                objZoijcleaow2 = objZoijcleaow;
                iobyxmoadgVar5 = iobyxmoadgVar;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow2);
                iobyxmoadgVar4 = iobyxmoadgVar5;
                if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                    objWkgbmnqykc = jyumaefscl.wflxmlrfwp();
                }
                objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(cqumvgiudr.iobyxmoadg(catalogWithSubCatalogs2, (List) objWkgbmnqykc));
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc2)) {
                    vdvldrhtss vdvldrhtssVar3 = (vdvldrhtss) objWkgbmnqykc2;
                    catalogWithSubCatalogs3 = (CatalogWithSubCatalogs) vdvldrhtssVar3.iobyxmoadg();
                    list = (List) vdvldrhtssVar3.wkgbmnqykc();
                    if (catalogWithSubCatalogs3.getChildCatalogSections().isEmpty()) {
                        iobyxmoadgVar4.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(catalogWithSubCatalogs3, list));
                    } else {
                        iobyxmoadgVar4.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(catalogWithSubCatalogs3, list));
                    }
                }
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                if (thDxjokdxxww != null) {
                    iobyxmoadgVar4.nuxfzjnpeb(thDxjokdxxww);
                    iobyxmoadgVar4.crxdokpmqz(rq0.eablkybsjg.nufgyqmvbu.f83595iobyxmoadg);
                }
                iobyxmoadgVar4.f83614lqeggnwhkg.zoijcleaow(new ym0.gtknphoqwx.iobyxmoadg((Map) null, 1, (kotlin.jvm.internal.gtknphoqwx) null));
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th6) {
                catalogWithSubCatalogs2 = catalogWithSubCatalogs;
                th2 = th6;
                iobyxmoadgVar5 = iobyxmoadgVar;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar13 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar14 = kcexrzcfyt.f37117yggfygwlhe;
            r01.eablkybsjg eablkybsjgVar = iobyxmoadgVar.f83618wkgbmnqykc;
            zoijcleaowVar.f83650zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f83649yggfygwlhe = iobyxmoadgVar3;
            zoijcleaowVar.f83646cqumvgiudr = 2;
            objZoijcleaow2 = eablkybsjgVar.zoijcleaow(iobyxmoadgVar2, zoijcleaowVar);
            if (objZoijcleaow2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            catalogWithSubCatalogs = (CatalogWithSubCatalogs) objZoijcleaow2;
        } catch (Throwable th7) {
            th = th7;
            iobyxmoadgVar4 = iobyxmoadgVar;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar15 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        pz0.iobyxmoadg iobyxmoadgVar16 = (pz0.iobyxmoadg) objZoijcleaow2;
        String parentId = ((State) iobyxmoadgVar.jlmebxxoox()).getArgs().getParentId();
        vm0.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar.f83614lqeggnwhkg;
        String strWkgbmnqykc = iobyxmoadgVar16.wkgbmnqykc();
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar16.ppxfxbqfkf();
        zoijcleaowVar2.eablkybsjg(new ym0.gtknphoqwx.iobyxmoadg(strWkgbmnqykc, deliveryCodePpxfxbqfkf != null ? deliveryCodePpxfxbqfkf.name() : null, parentId));
        iobyxmoadgVar2 = new r01.eablkybsjg.iobyxmoadg(parentId, iobyxmoadgVar16.wkgbmnqykc());
        iobyxmoadgVar3 = new r01.ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar16.wkgbmnqykc(), parentId);
    }

    private final void opjhrmiecq() {
        this.f83614lqeggnwhkg.ppxfxbqfkf(new ym0.gtknphoqwx.iobyxmoadg((Map) null, 1, (kotlin.jvm.internal.gtknphoqwx) null));
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    private final void uawqvzlxes() {
        State state = (State) jlmebxxoox();
        String parentId = state.getArgs().getParentId();
        String title = state.getArgs().getTitle();
        if (title == null) {
            title = "";
        }
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(parentId, title, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr(uq0.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        Object next;
        Iterator it = ((State) jlmebxxoox()).getItems().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CatalogSection) next).getId(), zoijcleaowVar.getId()));
        CatalogSection catalogSection = (CatalogSection) next;
        boolean ageCheckedNeeded = catalogSection != null ? catalogSection.getAgeCheckedNeeded() : false;
        boolean zBooleanValue = ((Boolean) this.f83609draadjrbmk.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        if (!ageCheckedNeeded || zBooleanValue) {
            iyctptxqzt(zoijcleaowVar);
        } else {
            crxdokpmqz(new rq0.eablkybsjg.btonecajqb(zoijcleaowVar));
        }
    }

    public static final /* synthetic */ State ydmasvzmpa(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zeieaojujs(String str, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        State state;
        Object next;
        CatalogBanner catalogBanner;
        String strValueOf;
        CatalogBanner catalogBanner2;
        String str2;
        Throwable th2;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f83643lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f83643lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f83639cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f83643lereixgezr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            state = (State) jlmebxxoox();
            Iterator it = state.getBanners().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CatalogBanner) next).getId(), str));
            catalogBanner = (CatalogBanner) next;
            if (catalogBanner == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            strValueOf = String.valueOf(state.getBanners().indexOf(catalogBanner) + 1);
            if (!catalogBanner.getNavigationLink().nufgyqmvbu()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            String onboardingId = catalogBanner.getOnboardingId();
            if (onboardingId != null) {
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    ut1.iobyxmoadg iobyxmoadgVar4 = this.f83608btonecajqb;
                    ut1.iobyxmoadg.C2836iobyxmoadg c2836iobyxmoadg = new ut1.iobyxmoadg.C2836iobyxmoadg(onboardingId);
                    wkgbmnqykcVar.f83645zdlpuopuiu = this;
                    wkgbmnqykcVar.f83644yggfygwlhe = state;
                    wkgbmnqykcVar.f83642jyumaefscl = catalogBanner;
                    wkgbmnqykcVar.f83641iwizpuwonk = strValueOf;
                    wkgbmnqykcVar.f83643lereixgezr = 1;
                    Object objZoijcleaow = iobyxmoadgVar4.zoijcleaow(c2836iobyxmoadg, wkgbmnqykcVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    catalogBanner2 = catalogBanner;
                    str2 = strValueOf;
                    obj = objZoijcleaow;
                    iobyxmoadgVar = this;
                } catch (Throwable th3) {
                    catalogBanner2 = catalogBanner;
                    str2 = strValueOf;
                    th2 = th3;
                    iobyxmoadgVar = this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
            } else {
                iobyxmoadgVar2 = this;
            }
            iobyxmoadgVar2.crxdokpmqz(new rq0.eablkybsjg.ppxfxbqfkf(catalogBanner, new AnalyticsPage.SubCatalog(state.getTitle(), state.getArgs().getParentId()), strValueOf));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) wkgbmnqykcVar.f83641iwizpuwonk;
        catalogBanner2 = (CatalogBanner) wkgbmnqykcVar.f83642jyumaefscl;
        state = (State) wkgbmnqykcVar.f83644yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f83645zdlpuopuiu;
        try {
            zdlpuopuiu.zoijcleaow(obj);
        } catch (Throwable th4) {
            th2 = th4;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((StoryItem) obj);
        iobyxmoadg iobyxmoadgVar7 = iobyxmoadgVar;
        String str3 = str2;
        catalogBanner = catalogBanner2;
        iobyxmoadgVar2 = iobyxmoadgVar7;
        StoryItem storyItem = (StoryItem) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        if (storyItem != null) {
            iobyxmoadgVar2.crxdokpmqz(new rq0.eablkybsjg.gtknphoqwx(storyItem, new StoryNavLink(catalogBanner.getNavigationLink().btonecajqb(), catalogBanner.getReference())));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        strValueOf = str3;
        iobyxmoadgVar2.crxdokpmqz(new rq0.eablkybsjg.ppxfxbqfkf(catalogBanner, new AnalyticsPage.SubCatalog(state.getTitle(), state.getArgs().getParentId()), strValueOf));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public sj.lqeggnwhkg bfopjjpdmp() {
        return this.f83616ppxfxbqfkf.ppxfxbqfkf();
    }

    public void roivzttewh(boolean z13) {
        this.f83616ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(rq0.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, rq0.ppxfxbqfkf.iobyxmoadg.f83653iobyxmoadg)) {
            opjhrmiecq();
        } else {
            if (!(action instanceof rq0.ppxfxbqfkf.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((rq0.ppxfxbqfkf.zoijcleaow) action).iobyxmoadg()) {
                return;
            }
            uawqvzlxes();
        }
    }

    public void tbqsvytpvh(boolean z13) {
        this.f83616ppxfxbqfkf.eablkybsjg(z13);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(rq0.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1880iobyxmoadg(intent, this, null), 3, null);
    }
}
