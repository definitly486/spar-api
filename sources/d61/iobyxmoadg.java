package d61;

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
import ru.myspar.proloyalty.core.domain.models.product.FilterSection;
import ru.myspar.proloyalty.core.domain.models.product.FilterValue;
import ru.myspar.proloyalty.domain.feature.filtersall.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final i01.zoijcleaow f27102ppxfxbqfkf;

    /* JADX INFO: renamed from: d61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0497iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f27103iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f27105yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f27106zdlpuopuiu;

        C0497iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f27105yggfygwlhe = obj;
            this.f27103iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ikoacuggdj(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f27107jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f27108yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f27109zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f27108yggfygwlhe = ppxfxbqfkfVar;
            this.f27107jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f27108yggfygwlhe, this.f27107jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f27109zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = this.f27108yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f27112iobyxmoadg)) {
                    this.f27107jyumaefscl.crxdokpmqz(wkgbmnqykc.iobyxmoadg.f27113iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f27110iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f27107jyumaefscl;
                    this.f27109zdlpuopuiu = 1;
                    if (iobyxmoadgVar.ikoacuggdj(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.C0498ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f27107jyumaefscl.jztzpxfvev(((ppxfxbqfkf.C0498ppxfxbqfkf) this.f27108yggfygwlhe).iobyxmoadg());
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
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, i01.zoijcleaow changeFiltersObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFiltersObserver, "changeFiltersObserver");
        this.f27102ppxfxbqfkf = changeFiltersObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object ikoacuggdj(lg.gxszxtbevo gxszxtbevoVar) {
        C0497iobyxmoadg c0497iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C0497iobyxmoadg) {
            c0497iobyxmoadg = (C0497iobyxmoadg) gxszxtbevoVar;
            int i13 = c0497iobyxmoadg.f27103iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0497iobyxmoadg.f27103iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0497iobyxmoadg = new C0497iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0497iobyxmoadg = new C0497iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c0497iobyxmoadg.f27105yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0497iobyxmoadg.f27103iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Set checkedFilterIds = ((State) jlmebxxoox()).getCheckedFilterIds();
            List<FilterValue> filterValues = ((State) jlmebxxoox()).getFilterValues();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(filterValues, 10));
            for (FilterValue filterValue : filterValues) {
                arrayList.add(FilterValue.ppxfxbqfkf(filterValue, null, null, checkedFilterIds.contains(filterValue.getId()), false, 11, null));
            }
            FilterSection filterSectionPpxfxbqfkf = FilterSection.ppxfxbqfkf(((State) jlmebxxoox()).getArgs().getFilterSection(), null, null, arrayList, 3, null);
            i01.zoijcleaow zoijcleaowVar = this.f27102ppxfxbqfkf;
            c0497iobyxmoadg.f27106zdlpuopuiu = this;
            c0497iobyxmoadg.f27103iwizpuwonk = 1;
            if (zoijcleaowVar.btonecajqb(filterSectionPpxfxbqfkf, c0497iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c0497iobyxmoadg.f27106zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        iobyxmoadgVar.crxdokpmqz(wkgbmnqykc.iobyxmoadg.f27113iobyxmoadg);
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
