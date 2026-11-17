package r70;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import h20.wflxmlrfwp;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.vdvldrhtss;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.core.domain.models.product.FilterSection;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.core.models.paging.Paging;
import ru.myspar.domain.feature.filters.store.State;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final u10.iobyxmoadg f81986eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final z10.iobyxmoadg f81987gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp f81988ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u10.zoijcleaow f81989wkgbmnqykc;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f81990iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f81992yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81993zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81992yggfygwlhe = obj;
            this.f81990iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(this);
        }
    }

    /* JADX INFO: renamed from: r70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1828iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f81994jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ r70.ppxfxbqfkf f81995yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f81996zdlpuopuiu;

        /* JADX INFO: renamed from: r70.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        /* synthetic */ class C1829iobyxmoadg extends vdvldrhtss implements rgvfuqvkyq {
            C1829iobyxmoadg(Object obj) {
                super(2, obj, iobyxmoadg.class, "onFilterChanged", "onFilterChanged(Lru/myspar/core/domain/models/product/FilterSection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FilterSection filterSection, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) this.receiver).bfopjjpdmp(filterSection, gxszxtbevoVar);
            }
        }

        /* JADX INFO: renamed from: r70.iobyxmoadg$iobyxmoadg$zoijcleaow */
        static final class zoijcleaow extends draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f81997yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f81998zdlpuopuiu;

            zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f81998zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f81997yggfygwlhe, new CrashlyticsKey[0]);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
                zoijcleaowVar.f81997yggfygwlhe = th2;
                return zoijcleaowVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1828iobyxmoadg(r70.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f81995yggfygwlhe = ppxfxbqfkfVar;
            this.f81994jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1828iobyxmoadg(this.f81995yggfygwlhe, this.f81994jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f81996zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                r70.ppxfxbqfkf ppxfxbqfkfVar = this.f81995yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, r70.ppxfxbqfkf.iobyxmoadg.f82013iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f81994jyumaefscl;
                    this.f81996zdlpuopuiu = 1;
                    if (iobyxmoadgVar.yfnezrywwk(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, r70.ppxfxbqfkf.zoijcleaow.f82014iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dxjokdxxww.hkdspvbjdz(dxjokdxxww.gxszxtbevo(dxjokdxxww.kegysxyocb(this.f81994jyumaefscl.f81989wkgbmnqykc.btonecajqb(), new C1829iobyxmoadg(this.f81994jyumaefscl)), new zoijcleaow(null)), this.f81994jyumaefscl.sopmlzcsov());
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
            return ((C1828iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f81999cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f82001jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f82002yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82003zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82001jyumaefscl = obj;
            this.f81999cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.yfnezrywwk(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f82004iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f82006yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82007zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82006yggfygwlhe = obj;
            this.f82004iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zfvoamnweg(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f82008jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ r70.wkgbmnqykc f82009yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f82010zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(r70.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f82009yggfygwlhe = wkgbmnqykcVar;
            this.f82008jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f82009yggfygwlhe, this.f82008jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f82010zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                r70.wkgbmnqykc wkgbmnqykcVar = this.f82009yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, r70.wkgbmnqykc.zoijcleaow.f82019iobyxmoadg)) {
                    this.f82008jyumaefscl.crxdokpmqz(r70.eablkybsjg.iobyxmoadg.f81978iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, r70.wkgbmnqykc.iobyxmoadg.f82016iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f82008jyumaefscl;
                    this.f82010zdlpuopuiu = 1;
                    if (iobyxmoadgVar.zfvoamnweg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, r70.wkgbmnqykc.ppxfxbqfkf.f82017iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar2 = this.f82008jyumaefscl;
                    this.f82010zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.oipsdeybqn(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof r70.wkgbmnqykc.C1830wkgbmnqykc) {
                    iobyxmoadg iobyxmoadgVar3 = this.f82008jyumaefscl;
                    FilterSection filterSectionIobyxmoadg = ((r70.wkgbmnqykc.C1830wkgbmnqykc) this.f82009yggfygwlhe).iobyxmoadg();
                    this.f82010zdlpuopuiu = 3;
                    if (iobyxmoadgVar3.bfopjjpdmp(filterSectionIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(wkgbmnqykcVar instanceof r70.wkgbmnqykc.eablkybsjg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f82008jyumaefscl.crxdokpmqz(new r70.eablkybsjg.zoijcleaow(((r70.wkgbmnqykc.eablkybsjg) this.f82009yggfygwlhe).iobyxmoadg(), iobyxmoadg.rlfsiqarku(this.f82008jyumaefscl).getColorsModel()));
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
    public iobyxmoadg(wflxmlrfwp getProductsUseCase, u10.zoijcleaow changeFiltersObserver, u10.iobyxmoadg changeCatalogFiltersObserver, z10.iobyxmoadg getCurrentDeliveryDataUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductsUseCase, "getProductsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFiltersObserver, "changeFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCatalogFiltersObserver, "changeCatalogFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f81988ppxfxbqfkf = getProductsUseCase;
        this.f81989wkgbmnqykc = changeFiltersObserver;
        this.f81986eablkybsjg = changeCatalogFiltersObserver;
        this.f81987gxszxtbevo = getCurrentDeliveryDataUseCase;
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
            int i13 = eablkybsjgVar.f81990iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f81990iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f81992yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f81990iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f81993zdlpuopuiu;
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
        u10.iobyxmoadg iobyxmoadgVar2 = this.f81986eablkybsjg;
        String strYdmasvzmpa = ydmasvzmpa();
        eablkybsjgVar.f81993zdlpuopuiu = this;
        eablkybsjgVar.f81990iwizpuwonk = 1;
        if (u10.iobyxmoadg.draadjrbmk(iobyxmoadgVar2, strYdmasvzmpa, null, eablkybsjgVar, 2, null) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        eablkybsjgVar.f81993zdlpuopuiu = null;
        eablkybsjgVar.f81990iwizpuwonk = 2;
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
        wflxmlrfwp.iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        Object objWkgbmnqykc;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f81999cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f81999cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f82001jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f81999cqumvgiudr;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
                state = (State) jlmebxxoox();
                z10.iobyxmoadg iobyxmoadgVar4 = this.f81987gxszxtbevo;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f82003zdlpuopuiu = this;
                ppxfxbqfkfVar.f82002yggfygwlhe = state;
                ppxfxbqfkfVar.f81999cqumvgiudr = 1;
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
                    iobyxmoadgVar3 = (iobyxmoadg) ppxfxbqfkfVar.f82003zdlpuopuiu;
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
                state = (State) ppxfxbqfkfVar.f82002yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f82003zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
            wflxmlrfwp wflxmlrfwpVar = iobyxmoadgVar.f81988ppxfxbqfkf;
            ppxfxbqfkfVar.f82003zdlpuopuiu = iobyxmoadgVar;
            ppxfxbqfkfVar.f82002yggfygwlhe = null;
            ppxfxbqfkfVar.f81999cqumvgiudr = 2;
            objZoijcleaow = wflxmlrfwpVar.zoijcleaow(iobyxmoadgVar2, ppxfxbqfkfVar);
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
        y00.iobyxmoadg iobyxmoadgVar8 = (y00.iobyxmoadg) objZoijcleaow;
        iobyxmoadgVar2 = new wflxmlrfwp.iobyxmoadg(iobyxmoadgVar8.wkgbmnqykc(), iobyxmoadgVar8.ppxfxbqfkf(), state.getSectionId(), state.getBrandId(), state.getQuery(), null, null, state.getFilterSections(), state.getSelectionId(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true), null, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zfvoamnweg(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f82004iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f82004iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f82006yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f82004iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            u10.iobyxmoadg iobyxmoadgVar2 = this.f81986eablkybsjg;
            String strYdmasvzmpa = ydmasvzmpa();
            List filterSections = ((State) jlmebxxoox()).getFilterSections();
            wkgbmnqykcVar.f82007zdlpuopuiu = this;
            wkgbmnqykcVar.f82004iwizpuwonk = 1;
            if (iobyxmoadgVar2.gtknphoqwx(strYdmasvzmpa, filterSections, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f82007zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.crxdokpmqz(r70.eablkybsjg.iobyxmoadg.f81978iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(r70.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1828iobyxmoadg(action, this, null), 3, null);
    }

    public final void opjhrmiecq(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new r70.eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(r70.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }
}
