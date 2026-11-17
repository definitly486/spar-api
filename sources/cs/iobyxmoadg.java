package cs;

import c20.dxjokdxxww;
import gg.cqumvgiudr;
import gg.iwizpuwonk;
import gg.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.hkdspvbjdz;
import oo.gtknphoqwx;
import pj.cllcsxoeiz;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.catalog.impl.subcatalog.domain.store.State;
import ru.myspar.core.domain.models.catalog.CatalogBanner;
import ru.myspar.core.domain.models.catalog.CatalogSection;
import ru.myspar.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StoryNavLink;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import z10.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private y00.iobyxmoadg f25584agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final b82.iobyxmoadg f25585btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final a20.zoijcleaow f25586draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final nufgyqmvbu f25587dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dxjokdxxww f25588eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final a20.iobyxmoadg f25589gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final h20.gxszxtbevo f25590gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final lo.zoijcleaow f25591lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ye0.iobyxmoadg f25592nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f25593ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final z10.iobyxmoadg f25594wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final h20.nufgyqmvbu f25595wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f25596iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f25597jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f25599zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f25597jyumaefscl = str;
            this.f25596iwizpuwonk = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f25597jyumaefscl, this.f25596iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f25599zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ye0.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f25592nufgyqmvbu;
                ze0.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = new ze0.iobyxmoadg.ppxfxbqfkf(this.f25597jyumaefscl);
                AnalyticsPage.SubCatalog subCatalog = new AnalyticsPage.SubCatalog(this.f25596iwizpuwonk, this.f25597jyumaefscl);
                this.f25599zdlpuopuiu = 1;
                if (iobyxmoadgVar.lqeggnwhkg(ppxfxbqfkfVar, subCatalog, this) == objGxszxtbevo) {
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

    /* JADX INFO: renamed from: cs.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0446iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f25600jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ cs.wkgbmnqykc f25601yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f25602zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0446iobyxmoadg(cs.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f25601yggfygwlhe = wkgbmnqykcVar;
            this.f25600jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C0446iobyxmoadg(this.f25601yggfygwlhe, this.f25600jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f25602zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                cs.wkgbmnqykc wkgbmnqykcVar = this.f25601yggfygwlhe;
                if (wkgbmnqykcVar instanceof cs.wkgbmnqykc.eablkybsjg) {
                    this.f25600jyumaefscl.nuxfzjnpeb(((cs.wkgbmnqykc.eablkybsjg) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof cs.wkgbmnqykc.nufgyqmvbu) {
                    this.f25600jyumaefscl.tbqsvytpvh(((cs.wkgbmnqykc.nufgyqmvbu) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof cs.wkgbmnqykc.C0451wkgbmnqykc) {
                    this.f25600jyumaefscl.iyctptxqzt(((cs.wkgbmnqykc.C0451wkgbmnqykc) wkgbmnqykcVar).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, cs.wkgbmnqykc.gxszxtbevo.f25635iobyxmoadg)) {
                    iobyxmoadg.auzgnhcxok(this.f25600jyumaefscl, AnalyticsPage.Scan.f84344iwizpuwonk, null, null, 6, null);
                    this.f25600jyumaefscl.crxdokpmqz(cs.eablkybsjg.C0445eablkybsjg.f25566iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, cs.wkgbmnqykc.lqeggnwhkg.f25638iobyxmoadg)) {
                    iobyxmoadg.auzgnhcxok(this.f25600jyumaefscl, AnalyticsPage.Search.f84345iwizpuwonk, null, null, 6, null);
                    this.f25600jyumaefscl.crxdokpmqz(new cs.eablkybsjg.gxszxtbevo(iobyxmoadg.yfnezrywwk(this.f25600jyumaefscl).getArgs()));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, cs.wkgbmnqykc.dxjokdxxww.f25633iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f25600jyumaefscl;
                    this.f25602zdlpuopuiu = 1;
                    if (iobyxmoadgVar.zfvoamnweg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, cs.wkgbmnqykc.btonecajqb.f25632iobyxmoadg)) {
                    String orderEditId = iobyxmoadg.yfnezrywwk(this.f25600jyumaefscl).getArgs().getOrderEditId();
                    if (orderEditId != null) {
                        this.f25600jyumaefscl.crxdokpmqz(new cs.eablkybsjg.dxjokdxxww(orderEditId));
                    }
                } else if (wkgbmnqykcVar instanceof cs.wkgbmnqykc.ppxfxbqfkf) {
                    iobyxmoadg iobyxmoadgVar2 = this.f25600jyumaefscl;
                    String strIobyxmoadg = ((cs.wkgbmnqykc.ppxfxbqfkf) this.f25601yggfygwlhe).iobyxmoadg();
                    this.f25602zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.lrnfpwlwnk(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, cs.wkgbmnqykc.zoijcleaow.f25642iobyxmoadg)) {
                    this.f25600jyumaefscl.crxdokpmqz(cs.eablkybsjg.zoijcleaow.f25580iobyxmoadg);
                } else {
                    if (!(wkgbmnqykcVar instanceof cs.wkgbmnqykc.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f25600jyumaefscl.weqkydbzbr(((cs.wkgbmnqykc.iobyxmoadg) this.f25601yggfygwlhe).zoijcleaow(), ((cs.wkgbmnqykc.iobyxmoadg) this.f25601yggfygwlhe).iobyxmoadg());
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
            return ((C0446iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f25604zdlpuopuiu;

        /* JADX INFO: renamed from: cs.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        static final class C0447iobyxmoadg extends draadjrbmk implements oxmwwwfdhm {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            /* synthetic */ boolean f25605iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f25606jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f25607yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f25608zdlpuopuiu;

            C0447iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(4, gxszxtbevoVar);
            }

            @Override // tg.oxmwwwfdhm
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ojitshcjhn((vdvldrhtss) obj, (y00.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f25608zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                return new iwizpuwonk((vdvldrhtss) this.f25607yggfygwlhe, (y00.iobyxmoadg) this.f25606jyumaefscl, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f25605iwizpuwonk));
            }

            public final Object ojitshcjhn(vdvldrhtss vdvldrhtssVar, y00.iobyxmoadg iobyxmoadgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                C0447iobyxmoadg c0447iobyxmoadg = new C0447iobyxmoadg(gxszxtbevoVar);
                c0447iobyxmoadg.f25607yggfygwlhe = vdvldrhtssVar;
                c0447iobyxmoadg.f25606jyumaefscl = iobyxmoadgVar;
                c0447iobyxmoadg.f25605iwizpuwonk = z13;
                return c0447iobyxmoadg.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: cs.iobyxmoadg$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C0448ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f25609zdlpuopuiu;

            /* JADX INFO: renamed from: cs.iobyxmoadg$ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0449iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f25610zdlpuopuiu;

                /* JADX INFO: renamed from: cs.iobyxmoadg$ppxfxbqfkf$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C0450iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f25612yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f25613zdlpuopuiu;

                    public C0450iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f25613zdlpuopuiu = obj;
                        this.f25612yggfygwlhe |= Integer.MIN_VALUE;
                        return C0449iobyxmoadg.this.emit(null, this);
                    }
                }

                public C0449iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f25610zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C0450iobyxmoadg c0450iobyxmoadg;
                    if (gxszxtbevoVar instanceof C0450iobyxmoadg) {
                        c0450iobyxmoadg = (C0450iobyxmoadg) gxszxtbevoVar;
                        int i13 = c0450iobyxmoadg.f25612yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c0450iobyxmoadg.f25612yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c0450iobyxmoadg = new C0450iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c0450iobyxmoadg = new C0450iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c0450iobyxmoadg.f25613zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c0450iobyxmoadg.f25612yggfygwlhe;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f25610zdlpuopuiu;
                        if (((Boolean) ((iwizpuwonk) obj).lqeggnwhkg()).booleanValue()) {
                            c0450iobyxmoadg.f25612yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c0450iobyxmoadg) == objGxszxtbevo) {
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

            public C0448ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f25609zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f25609zdlpuopuiu.collect(new C0449iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f25614yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f25615zdlpuopuiu;

            zoijcleaow(hkdspvbjdz hkdspvbjdzVar, iobyxmoadg iobyxmoadgVar) {
                this.f25615zdlpuopuiu = hkdspvbjdzVar;
                this.f25614yggfygwlhe = iobyxmoadgVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
                boolean z13;
                Object objZfvoamnweg;
                vdvldrhtss vdvldrhtssVar = (vdvldrhtss) iwizpuwonkVar.iobyxmoadg();
                y00.iobyxmoadg iobyxmoadgVar = (y00.iobyxmoadg) iwizpuwonkVar.wkgbmnqykc();
                boolean z14 = true;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVar, this.f25615zdlpuopuiu.f60015zdlpuopuiu)) {
                    z13 = false;
                } else {
                    this.f25615zdlpuopuiu.f60015zdlpuopuiu = vdvldrhtssVar;
                    z13 = true;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f25614yggfygwlhe.f25584agtfadlqog, iobyxmoadgVar)) {
                    z14 = z13;
                } else {
                    this.f25614yggfygwlhe.f25584agtfadlqog = iobyxmoadgVar;
                }
                return (z14 && (objZfvoamnweg = this.f25614yggfygwlhe.zfvoamnweg(gxszxtbevoVar)) == mg.zoijcleaow.gxszxtbevo()) ? objZfvoamnweg : wwaezpbzkn.f37140iobyxmoadg;
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
            int i13 = this.f25604zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
                C0448ppxfxbqfkf c0448ppxfxbqfkf = new C0448ppxfxbqfkf(sj.dxjokdxxww.draadjrbmk(sj.dxjokdxxww.vdvldrhtss(iobyxmoadg.this.f25588eablkybsjg.wkgbmnqykc()), iobyxmoadg.this.f25587dxjokdxxww.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), iobyxmoadg.this.oipsdeybqn(), new C0447iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(hkdspvbjdzVar, iobyxmoadg.this);
                this.f25604zdlpuopuiu = 1;
                if (c0448ppxfxbqfkf.collect(zoijcleaowVar, this) == objGxszxtbevo) {
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
        /* synthetic */ Object f25616cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f25618iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f25619jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f25620lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f25621yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f25622zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f25616cqumvgiudr = obj;
            this.f25620lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lrnfpwlwnk(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f25623cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f25625jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f25626yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f25627zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f25625jyumaefscl = obj;
            this.f25623cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zfvoamnweg(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, h20.nufgyqmvbu getCatalogWithChildUseCase, dxjokdxxww subscribeToLoggedInUseCase, h20.gxszxtbevo getCatalogBannersUseCase, lo.zoijcleaow analyticsTracker, ye0.iobyxmoadg loymaxPopupsObserver, nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, b82.iobyxmoadg getOnboardingStoryUseCase, a20.iobyxmoadg changeAdultCheckedUseCase, a20.zoijcleaow isAdultCheckedUseCase, z10.iobyxmoadg getCurrentDeliveryDataUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogWithChildUseCase, "getCatalogWithChildUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogBannersUseCase, "getCatalogBannersUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loymaxPopupsObserver, "loymaxPopupsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOnboardingStoryUseCase, "getOnboardingStoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        this.f25593ppxfxbqfkf = new sx.ppxfxbqfkf();
        this.f25595wkgbmnqykc = getCatalogWithChildUseCase;
        this.f25588eablkybsjg = subscribeToLoggedInUseCase;
        this.f25590gxszxtbevo = getCatalogBannersUseCase;
        this.f25591lqeggnwhkg = analyticsTracker;
        this.f25592nufgyqmvbu = loymaxPopupsObserver;
        this.f25587dxjokdxxww = subscribeToCurrentDeliveryDataUseCase;
        this.f25585btonecajqb = getOnboardingStoryUseCase;
        this.f25589gtknphoqwx = changeAdultCheckedUseCase;
        this.f25586draadjrbmk = isAdultCheckedUseCase;
        this.f25594wflxmlrfwp = getCurrentDeliveryDataUseCase;
    }

    static /* synthetic */ void auzgnhcxok(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticsLocation = null;
        }
        if ((i13 & 4) != 0) {
            analyticElement = null;
        }
        iobyxmoadgVar.uawqvzlxes(analyticsPage, analyticsLocation, analyticElement);
    }

    private final void bfopjjpdmp() {
        this.f25591lqeggnwhkg.wkgbmnqykc(new gtknphoqwx.iobyxmoadg((Map) null, 1, (kotlin.jvm.internal.gtknphoqwx) null));
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iyctptxqzt(es.draadjrbmk.ppxfxbqfkf ppxfxbqfkfVar) {
        Object next;
        Iterator it = ((State) jlmebxxoox()).getItems().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CatalogSection) next).getId(), ppxfxbqfkfVar.getId()));
        CatalogSection catalogSection = (CatalogSection) next;
        boolean ageCheckedNeeded = catalogSection != null ? catalogSection.getAgeCheckedNeeded() : false;
        boolean zBooleanValue = ((Boolean) this.f25586draadjrbmk.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        if (!ageCheckedNeeded || zBooleanValue) {
            opjhrmiecq(ppxfxbqfkfVar);
        } else {
            crxdokpmqz(new cs.eablkybsjg.btonecajqb(ppxfxbqfkfVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lrnfpwlwnk(String str, lg.gxszxtbevo gxszxtbevoVar) {
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
            int i13 = wkgbmnqykcVar.f25620lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f25620lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f25616cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f25620lereixgezr;
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
            if (!catalogBanner.getNavigationLink().lqeggnwhkg()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            String onboardingId = catalogBanner.getOnboardingId();
            if (onboardingId != null) {
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    b82.iobyxmoadg iobyxmoadgVar4 = this.f25585btonecajqb;
                    b82.iobyxmoadg.C0266iobyxmoadg c0266iobyxmoadg = new b82.iobyxmoadg.C0266iobyxmoadg(onboardingId);
                    wkgbmnqykcVar.f25622zdlpuopuiu = this;
                    wkgbmnqykcVar.f25621yggfygwlhe = state;
                    wkgbmnqykcVar.f25619jyumaefscl = catalogBanner;
                    wkgbmnqykcVar.f25618iwizpuwonk = strValueOf;
                    wkgbmnqykcVar.f25620lereixgezr = 1;
                    Object objZoijcleaow = iobyxmoadgVar4.zoijcleaow(c0266iobyxmoadg, wkgbmnqykcVar);
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
            iobyxmoadgVar2.crxdokpmqz(new cs.eablkybsjg.ppxfxbqfkf(catalogBanner, new AnalyticsPage.SubCatalog(state.getTitle(), state.getArgs().getParentId()), strValueOf));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) wkgbmnqykcVar.f25618iwizpuwonk;
        catalogBanner2 = (CatalogBanner) wkgbmnqykcVar.f25619jyumaefscl;
        state = (State) wkgbmnqykcVar.f25621yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f25622zdlpuopuiu;
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
            iobyxmoadgVar2.crxdokpmqz(new cs.eablkybsjg.gtknphoqwx(storyItem, new StoryNavLink(catalogBanner.getNavigationLink().dxjokdxxww(), catalogBanner.getReference())));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        strValueOf = str3;
        iobyxmoadgVar2.crxdokpmqz(new cs.eablkybsjg.ppxfxbqfkf(catalogBanner, new AnalyticsPage.SubCatalog(state.getTitle(), state.getArgs().getParentId()), strValueOf));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void opjhrmiecq(es.draadjrbmk.ppxfxbqfkf ppxfxbqfkfVar) {
        auzgnhcxok(this, new AnalyticsPage.ProductList(ppxfxbqfkfVar.wkgbmnqykc(), ppxfxbqfkfVar.getId()), null, null, 6, null);
        crxdokpmqz(new cs.eablkybsjg.wkgbmnqykc(((State) jlmebxxoox()).getArgs(), ppxfxbqfkfVar.getId(), ((State) jlmebxxoox()).getTitle(), ppxfxbqfkfVar.ppxfxbqfkf()));
    }

    private final void roivzttewh() {
        State state = (State) jlmebxxoox();
        String parentId = state.getArgs().getParentId();
        String title = state.getArgs().getTitle();
        if (title == null) {
            title = "";
        }
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(parentId, title, null), 3, null);
    }

    private final void uawqvzlxes(AnalyticsPage analyticsPage, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement) {
        this.f25591lqeggnwhkg.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.SubCatalog(((State) jlmebxxoox()).getTitle(), ((State) jlmebxxoox()).getArgs().getParentId()), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr(boolean z13, es.draadjrbmk.ppxfxbqfkf ppxfxbqfkfVar) {
        if (z13) {
            this.f25589gtknphoqwx.zoijcleaow(Boolean.TRUE);
            opjhrmiecq(ppxfxbqfkfVar);
        }
    }

    public static final /* synthetic */ State yfnezrywwk(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
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
    public final Object zfvoamnweg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        h20.nufgyqmvbu.iobyxmoadg iobyxmoadgVar2;
        h20.gxszxtbevo.iobyxmoadg iobyxmoadgVar3;
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
            int i13 = zoijcleaowVar.f25623cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f25623cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow2 = zoijcleaowVar.f25625jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f25623cqumvgiudr;
        try {
            try {
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                    ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
                    z10.iobyxmoadg iobyxmoadgVar6 = this.f25594wflxmlrfwp;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaowVar.f25627zdlpuopuiu = this;
                    zoijcleaowVar.f25623cqumvgiudr = 1;
                    objZoijcleaow2 = iobyxmoadgVar6.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
                    if (objZoijcleaow2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar = this;
                } else if (i14 == 1) {
                    iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f25627zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                } else {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        catalogWithSubCatalogs2 = (CatalogWithSubCatalogs) zoijcleaowVar.f25626yggfygwlhe;
                        iobyxmoadgVar5 = (iobyxmoadg) zoijcleaowVar.f25627zdlpuopuiu;
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
                                iobyxmoadgVar4.crxdokpmqz(cs.eablkybsjg.nufgyqmvbu.f25572iobyxmoadg);
                            }
                        }
                        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                        if (thDxjokdxxww != null) {
                            iobyxmoadgVar4.zeieaojujs(thDxjokdxxww);
                            iobyxmoadgVar4.crxdokpmqz(cs.eablkybsjg.nufgyqmvbu.f25572iobyxmoadg);
                        }
                        iobyxmoadgVar4.f25591lqeggnwhkg.zoijcleaow(new gtknphoqwx.iobyxmoadg((Map) null, 1, (kotlin.jvm.internal.gtknphoqwx) null));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    h20.gxszxtbevo.iobyxmoadg iobyxmoadgVar9 = (h20.gxszxtbevo.iobyxmoadg) zoijcleaowVar.f25626yggfygwlhe;
                    iobyxmoadgVar4 = (iobyxmoadg) zoijcleaowVar.f25627zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(objZoijcleaow2);
                        iobyxmoadgVar3 = iobyxmoadgVar9;
                        iobyxmoadgVar = iobyxmoadgVar4;
                        catalogWithSubCatalogs = (CatalogWithSubCatalogs) objZoijcleaow2;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = kcexrzcfyt.f37117yggfygwlhe;
                        h20.gxszxtbevo gxszxtbevoVar2 = iobyxmoadgVar.f25590gxszxtbevo;
                        zoijcleaowVar.f25627zdlpuopuiu = iobyxmoadgVar;
                        zoijcleaowVar.f25626yggfygwlhe = catalogWithSubCatalogs;
                        zoijcleaowVar.f25623cqumvgiudr = 3;
                        objZoijcleaow = gxszxtbevoVar2.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
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
                            iobyxmoadgVar4.zeieaojujs(thDxjokdxxww);
                            iobyxmoadgVar4.crxdokpmqz(cs.eablkybsjg.nufgyqmvbu.f25572iobyxmoadg);
                        }
                        iobyxmoadgVar4.f25591lqeggnwhkg.zoijcleaow(new gtknphoqwx.iobyxmoadg((Map) null, 1, (kotlin.jvm.internal.gtknphoqwx) null));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th5) {
                        th = th5;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar11 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    }
                }
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar12 = kcexrzcfyt.f37117yggfygwlhe;
                h20.gxszxtbevo gxszxtbevoVar3 = iobyxmoadgVar.f25590gxszxtbevo;
                zoijcleaowVar.f25627zdlpuopuiu = iobyxmoadgVar;
                zoijcleaowVar.f25626yggfygwlhe = catalogWithSubCatalogs;
                zoijcleaowVar.f25623cqumvgiudr = 3;
                objZoijcleaow = gxszxtbevoVar3.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
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
                    iobyxmoadgVar4.zeieaojujs(thDxjokdxxww);
                    iobyxmoadgVar4.crxdokpmqz(cs.eablkybsjg.nufgyqmvbu.f25572iobyxmoadg);
                }
                iobyxmoadgVar4.f25591lqeggnwhkg.zoijcleaow(new gtknphoqwx.iobyxmoadg((Map) null, 1, (kotlin.jvm.internal.gtknphoqwx) null));
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th6) {
                catalogWithSubCatalogs2 = catalogWithSubCatalogs;
                th2 = th6;
                iobyxmoadgVar5 = iobyxmoadgVar;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar13 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar14 = kcexrzcfyt.f37117yggfygwlhe;
            h20.nufgyqmvbu nufgyqmvbuVar = iobyxmoadgVar.f25595wkgbmnqykc;
            zoijcleaowVar.f25627zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f25626yggfygwlhe = iobyxmoadgVar3;
            zoijcleaowVar.f25623cqumvgiudr = 2;
            objZoijcleaow2 = nufgyqmvbuVar.zoijcleaow(iobyxmoadgVar2, zoijcleaowVar);
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
        y00.iobyxmoadg iobyxmoadgVar16 = (y00.iobyxmoadg) objZoijcleaow2;
        String parentId = ((State) iobyxmoadgVar.jlmebxxoox()).getArgs().getParentId();
        lo.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar.f25591lqeggnwhkg;
        String strWkgbmnqykc = iobyxmoadgVar16.wkgbmnqykc();
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar16.ppxfxbqfkf();
        zoijcleaowVar2.eablkybsjg(new gtknphoqwx.iobyxmoadg(strWkgbmnqykc, deliveryCodePpxfxbqfkf != null ? deliveryCodePpxfxbqfkf.name() : null, parentId));
        iobyxmoadgVar2 = new h20.nufgyqmvbu.iobyxmoadg(parentId, iobyxmoadgVar16.wkgbmnqykc());
        iobyxmoadgVar3 = new h20.gxszxtbevo.iobyxmoadg(iobyxmoadgVar16.wkgbmnqykc(), parentId);
    }

    public void nuxfzjnpeb(boolean z13) {
        this.f25593ppxfxbqfkf.eablkybsjg(z13);
    }

    public sj.lqeggnwhkg oipsdeybqn() {
        return this.f25593ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(cs.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0446iobyxmoadg(intent, this, null), 3, null);
    }

    public void tbqsvytpvh(boolean z13) {
        this.f25593ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(cs.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, cs.ppxfxbqfkf.iobyxmoadg.f25630iobyxmoadg)) {
            bfopjjpdmp();
        } else {
            if (!(action instanceof cs.ppxfxbqfkf.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((cs.ppxfxbqfkf.zoijcleaow) action).iobyxmoadg()) {
                return;
            }
            roivzttewh();
        }
    }

    public final void zeieaojujs(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(false));
        crxdokpmqz(new cs.eablkybsjg.lqeggnwhkg(error));
    }
}
