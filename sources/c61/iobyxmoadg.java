package c61;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.vdvldrhtss;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import r01.btonecajqb;
import ru.myspar.proloyalty.core.domain.models.product.FilterSection;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.models.paging.Paging;
import ru.myspar.proloyalty.domain.feature.filters.store.State;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final i01.iobyxmoadg f19083eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final m01.iobyxmoadg f19084gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final btonecajqb f19085ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final i01.zoijcleaow f19086wkgbmnqykc;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f19087iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f19089yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f19090zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f19089yggfygwlhe = obj;
            this.f19087iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(this);
        }
    }

    /* JADX INFO: renamed from: c61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0345iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f19091jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ c61.ppxfxbqfkf f19092yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f19093zdlpuopuiu;

        /* JADX INFO: renamed from: c61.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        /* synthetic */ class C0346iobyxmoadg extends vdvldrhtss implements rgvfuqvkyq {
            C0346iobyxmoadg(Object obj) {
                super(2, obj, iobyxmoadg.class, "onFilterChanged", "onFilterChanged(Lru/myspar/proloyalty/core/domain/models/product/FilterSection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FilterSection filterSection, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) this.receiver).bfopjjpdmp(filterSection, gxszxtbevoVar);
            }
        }

        /* JADX INFO: renamed from: c61.iobyxmoadg$iobyxmoadg$zoijcleaow */
        static final class zoijcleaow extends draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f19094yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f19095zdlpuopuiu;

            zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f19095zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f19094yggfygwlhe, new CrashlyticsKey[0]);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
                zoijcleaowVar.f19094yggfygwlhe = th2;
                return zoijcleaowVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0345iobyxmoadg(c61.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f19092yggfygwlhe = ppxfxbqfkfVar;
            this.f19091jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C0345iobyxmoadg(this.f19092yggfygwlhe, this.f19091jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f19093zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                c61.ppxfxbqfkf ppxfxbqfkfVar = this.f19092yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, c61.ppxfxbqfkf.iobyxmoadg.f19110iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f19091jyumaefscl;
                    this.f19093zdlpuopuiu = 1;
                    if (iobyxmoadgVar.yfnezrywwk(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, c61.ppxfxbqfkf.zoijcleaow.f19111iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dxjokdxxww.hkdspvbjdz(dxjokdxxww.gxszxtbevo(dxjokdxxww.kegysxyocb(this.f19091jyumaefscl.f19086wkgbmnqykc.nufgyqmvbu(), new C0346iobyxmoadg(this.f19091jyumaefscl)), new zoijcleaow(null)), this.f19091jyumaefscl.sopmlzcsov());
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
            return ((C0345iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f19096cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f19098jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f19099yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f19100zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f19098jyumaefscl = obj;
            this.f19096cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.yfnezrywwk(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f19101iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f19103yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f19104zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f19103yggfygwlhe = obj;
            this.f19101iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zfvoamnweg(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f19105jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ c61.wkgbmnqykc f19106yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f19107zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(c61.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f19106yggfygwlhe = wkgbmnqykcVar;
            this.f19105jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f19106yggfygwlhe, this.f19105jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f19107zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                c61.wkgbmnqykc wkgbmnqykcVar = this.f19106yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, c61.wkgbmnqykc.zoijcleaow.f19116iobyxmoadg)) {
                    this.f19105jyumaefscl.crxdokpmqz(c61.eablkybsjg.iobyxmoadg.f19075iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, c61.wkgbmnqykc.iobyxmoadg.f19113iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f19105jyumaefscl;
                    this.f19107zdlpuopuiu = 1;
                    if (iobyxmoadgVar.zfvoamnweg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, c61.wkgbmnqykc.ppxfxbqfkf.f19114iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar2 = this.f19105jyumaefscl;
                    this.f19107zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.oipsdeybqn(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof c61.wkgbmnqykc.C0347wkgbmnqykc) {
                    iobyxmoadg iobyxmoadgVar3 = this.f19105jyumaefscl;
                    FilterSection filterSectionIobyxmoadg = ((c61.wkgbmnqykc.C0347wkgbmnqykc) this.f19106yggfygwlhe).iobyxmoadg();
                    this.f19107zdlpuopuiu = 3;
                    if (iobyxmoadgVar3.bfopjjpdmp(filterSectionIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(wkgbmnqykcVar instanceof c61.wkgbmnqykc.eablkybsjg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f19105jyumaefscl.crxdokpmqz(new c61.eablkybsjg.zoijcleaow(((c61.wkgbmnqykc.eablkybsjg) this.f19106yggfygwlhe).iobyxmoadg(), iobyxmoadg.rlfsiqarku(this.f19105jyumaefscl).getColorsModel()));
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(btonecajqb getProductsUseCase, i01.zoijcleaow changeFiltersObserver, i01.iobyxmoadg changeCatalogFiltersObserver, m01.iobyxmoadg getCurrentDeliveryDataUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductsUseCase, "getProductsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFiltersObserver, "changeFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCatalogFiltersObserver, "changeCatalogFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f19085ppxfxbqfkf = getProductsUseCase;
        this.f19086wkgbmnqykc = changeFiltersObserver;
        this.f19083eablkybsjg = changeCatalogFiltersObserver;
        this.f19084gxszxtbevo = getCurrentDeliveryDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bfopjjpdmp(FilterSection filterSection, lg.gxszxtbevo gxszxtbevoVar) {
        List<FilterSection> filterSections = ((State) jlmebxxoox()).getFilterSections();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(filterSections, 10));
        for (FilterSection filterSection2 : filterSections) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(filterSection2.getCode(), filterSection.getCode())) {
                filterSection2 = filterSection;
            }
            arrayList.add(filterSection2);
        }
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(arrayList));
        Object objYfnezrywwk = yfnezrywwk(gxszxtbevoVar);
        return objYfnezrywwk == mg.zoijcleaow.gxszxtbevo() ? objYfnezrywwk : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object oipsdeybqn(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f19087iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f19087iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f19089yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f19087iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f19090zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(obj);
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(jyumaefscl.wflxmlrfwp()));
        i01.iobyxmoadg iobyxmoadgVar2 = this.f19083eablkybsjg;
        String strYdmasvzmpa = ydmasvzmpa();
        eablkybsjgVar.f19090zdlpuopuiu = this;
        eablkybsjgVar.f19087iwizpuwonk = 1;
        if (i01.iobyxmoadg.gtknphoqwx(iobyxmoadgVar2, strYdmasvzmpa, null, eablkybsjgVar, 2, null) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        eablkybsjgVar.f19090zdlpuopuiu = null;
        eablkybsjgVar.f19087iwizpuwonk = 2;
        if (iobyxmoadgVar.yfnezrywwk(eablkybsjgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final /* synthetic */ State rlfsiqarku(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sflfametgt(ProductListData productListData) {
        List filterSections = productListData.getFilterSections();
        if (filterSections == null) {
            filterSections = jyumaefscl.wflxmlrfwp();
        }
        List listYggfygwlhe = mk.rgvfuqvkyq.yggfygwlhe(filterSections);
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(listYggfygwlhe));
        Paging paging = productListData.getPaging();
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(listYggfygwlhe, paging != null ? paging.getItemsCount() : 0));
    }

    private final String ydmasvzmpa() {
        State state = (State) jlmebxxoox();
        String sectionId = state.getSectionId();
        return (sectionId == null || sectionId.length() == 0) ? state.getBrandId() : state.getSectionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object yfnezrywwk(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        State state;
        iobyxmoadg iobyxmoadgVar;
        btonecajqb.iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        Object objWkgbmnqykc;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f19096cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f19096cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f19098jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f19096cqumvgiudr;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
                state = (State) jlmebxxoox();
                m01.iobyxmoadg iobyxmoadgVar4 = this.f19084gxszxtbevo;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f19100zdlpuopuiu = this;
                ppxfxbqfkfVar.f19099yggfygwlhe = state;
                ppxfxbqfkfVar.f19096cqumvgiudr = 1;
                objZoijcleaow = iobyxmoadgVar4.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadgVar3 = (iobyxmoadg) ppxfxbqfkfVar.f19100zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(objZoijcleaow);
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow);
                    } catch (Throwable th2) {
                        th = th2;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    }
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        iobyxmoadgVar3.sflfametgt((ProductListData) objWkgbmnqykc);
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar3.opjhrmiecq(thDxjokdxxww);
                    }
                    iobyxmoadgVar3.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                state = (State) ppxfxbqfkfVar.f19099yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f19100zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
            btonecajqb btonecajqbVar = iobyxmoadgVar.f19085ppxfxbqfkf;
            ppxfxbqfkfVar.f19100zdlpuopuiu = iobyxmoadgVar;
            ppxfxbqfkfVar.f19099yggfygwlhe = null;
            ppxfxbqfkfVar.f19096cqumvgiudr = 2;
            objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar2, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar3 = iobyxmoadgVar;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow);
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar3.sflfametgt((ProductListData) objWkgbmnqykc);
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar3.opjhrmiecq(thDxjokdxxww);
            }
            iobyxmoadgVar3.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th3) {
            th = th3;
            iobyxmoadgVar3 = iobyxmoadgVar;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        pz0.iobyxmoadg iobyxmoadgVar8 = (pz0.iobyxmoadg) objZoijcleaow;
        iobyxmoadgVar2 = new btonecajqb.iobyxmoadg(iobyxmoadgVar8.wkgbmnqykc(), iobyxmoadgVar8.ppxfxbqfkf(), state.getSectionId(), state.getBrandId(), state.getQuery(), null, null, state.getFilterSections(), state.getSelectionId(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), null, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zfvoamnweg(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f19101iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f19101iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f19103yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f19101iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            i01.iobyxmoadg iobyxmoadgVar2 = this.f19083eablkybsjg;
            String strYdmasvzmpa = ydmasvzmpa();
            List filterSections = ((State) jlmebxxoox()).getFilterSections();
            wkgbmnqykcVar.f19104zdlpuopuiu = this;
            wkgbmnqykcVar.f19101iwizpuwonk = 1;
            if (iobyxmoadgVar2.btonecajqb(strYdmasvzmpa, filterSections, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f19104zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.crxdokpmqz(c61.eablkybsjg.iobyxmoadg.f19075iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(c61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0345iobyxmoadg(action, this, null), 3, null);
    }

    public final void opjhrmiecq(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new c61.eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(c61.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }
}
