package s70;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.core.domain.models.product.FilterSection;
import ru.myspar.core.domain.models.product.FilterValue;
import ru.myspar.domain.feature.filtersall.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final u10.zoijcleaow f105634ppxfxbqfkf;

    /* JADX INFO: renamed from: s70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2571iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f105635iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f105637yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f105638zdlpuopuiu;

        C2571iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f105637yggfygwlhe = obj;
            this.f105635iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ikoacuggdj(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f105639jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f105640yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f105641zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f105640yggfygwlhe = ppxfxbqfkfVar;
            this.f105639jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f105640yggfygwlhe, this.f105639jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f105641zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = this.f105640yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f105644iobyxmoadg)) {
                    this.f105639jyumaefscl.crxdokpmqz(wkgbmnqykc.iobyxmoadg.f105645iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f105642iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f105639jyumaefscl;
                    this.f105641zdlpuopuiu = 1;
                    if (iobyxmoadgVar.ikoacuggdj(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.C2572ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f105639jyumaefscl.jztzpxfvev(((ppxfxbqfkf.C2572ppxfxbqfkf) this.f105640yggfygwlhe).iobyxmoadg());
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, u10.zoijcleaow changeFiltersObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFiltersObserver, "changeFiltersObserver");
        this.f105634ppxfxbqfkf = changeFiltersObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object ikoacuggdj(lg.gxszxtbevo gxszxtbevoVar) {
        C2571iobyxmoadg c2571iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C2571iobyxmoadg) {
            c2571iobyxmoadg = (C2571iobyxmoadg) gxszxtbevoVar;
            int i13 = c2571iobyxmoadg.f105635iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2571iobyxmoadg.f105635iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2571iobyxmoadg = new C2571iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2571iobyxmoadg = new C2571iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2571iobyxmoadg.f105637yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2571iobyxmoadg.f105635iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Set checkedFilterIds = ((State) jlmebxxoox()).getCheckedFilterIds();
            List<FilterValue> filterValues = ((State) jlmebxxoox()).getFilterValues();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(filterValues, 10));
            for (FilterValue filterValue : filterValues) {
                arrayList.add(FilterValue.ppxfxbqfkf(filterValue, null, null, checkedFilterIds.contains(filterValue.getId()), false, 11, null));
            }
            FilterSection filterSectionPpxfxbqfkf = FilterSection.ppxfxbqfkf(((State) jlmebxxoox()).getArgs().getFilterSection(), null, null, arrayList, 3, null);
            u10.zoijcleaow zoijcleaowVar = this.f105634ppxfxbqfkf;
            c2571iobyxmoadg.f105638zdlpuopuiu = this;
            c2571iobyxmoadg.f105635iwizpuwonk = 1;
            if (zoijcleaowVar.gtknphoqwx(filterSectionPpxfxbqfkf, c2571iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c2571iobyxmoadg.f105638zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.crxdokpmqz(wkgbmnqykc.iobyxmoadg.f105645iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jztzpxfvev(String str) {
        ulzqkzuiru(new eablkybsjg.iobyxmoadg(str, !((State) jlmebxxoox()).getCheckedFilterIds().contains(str)));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }
}
