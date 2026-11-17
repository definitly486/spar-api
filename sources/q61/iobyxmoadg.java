package q61;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.domain.models.shop.ShopService;
import ru.myspar.proloyalty.domain.feature.shopfilters.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n11.eablkybsjg f77995ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final i01.lqeggnwhkg f77996wkgbmnqykc;

    /* JADX INFO: renamed from: q61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1743iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f77997jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f77999zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1743iobyxmoadg(List list, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f77997jyumaefscl = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C1743iobyxmoadg(this.f77997jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f77999zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                i01.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.this.f77996wkgbmnqykc;
                List list = this.f77997jyumaefscl;
                ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ShopService) it.next()).getName());
                }
                this.f77999zdlpuopuiu = 1;
                if (lqeggnwhkgVar.btonecajqb(arrayList, this) == objGxszxtbevo) {
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
            return ((C1743iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f78000jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ q61.ppxfxbqfkf f78001yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f78002zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(q61.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f78001yggfygwlhe = ppxfxbqfkfVar;
            this.f78000jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f78001yggfygwlhe, this.f78000jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f78002zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                q61.ppxfxbqfkf ppxfxbqfkfVar = this.f78001yggfygwlhe;
                if (!(ppxfxbqfkfVar instanceof q61.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f78000jyumaefscl;
                List listIobyxmoadg = ((q61.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg();
                this.f78002zdlpuopuiu = 1;
                if (iobyxmoadgVar.rlfsiqarku(listIobyxmoadg, this) == objGxszxtbevo) {
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
        int f78003cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f78005jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f78006yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f78007zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f78005jyumaefscl = obj;
            this.f78003cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f78009zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f78009zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                i01.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.this.f77996wkgbmnqykc;
                this.f78009zdlpuopuiu = 1;
                if (i01.lqeggnwhkg.gtknphoqwx(lqeggnwhkgVar, null, this, 1, null) == objGxszxtbevo) {
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, n11.eablkybsjg getShopServicesUseCase, i01.lqeggnwhkg changeShopFiltersObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getShopServicesUseCase, "getShopServicesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeShopFiltersObserver, "changeShopFiltersObserver");
        this.f77995ppxfxbqfkf = getShopServicesUseCase;
        this.f77996wkgbmnqykc = changeShopFiltersObserver;
    }

    private final List czzsidtyhn(List list, List list2) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShopService shopService = (ShopService) it.next();
            arrayList.add(ShopService.ppxfxbqfkf(shopService, null, null, null, list2.contains(shopService.getName()), 7, null));
        }
        return arrayList;
    }

    private final void ikoacuggdj(String str) {
        Object next;
        ArrayList arrayList;
        List filterValues = ((State) jlmebxxoox()).getFilterValues();
        Iterator it = filterValues.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ShopService) next).getName(), str));
        ShopService shopService = (ShopService) next;
        if (shopService == null) {
            return;
        }
        if (shopService.getIsChecked()) {
            arrayList = new ArrayList();
            for (Object obj : filterValues) {
                ShopService shopService2 = (ShopService) obj;
                if (shopService2.getIsChecked() && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(shopService2, shopService)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : filterValues) {
                ShopService shopService3 = (ShopService) obj2;
                if (shopService3.getIsChecked() || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(shopService3, shopService)) {
                    arrayList.add(obj2);
                }
            }
        }
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1743iobyxmoadg(arrayList, null), 3, null);
        List<ShopService> filterValues2 = ((State) jlmebxxoox()).getFilterValues();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(filterValues2, 10));
        for (ShopService shopService4 : filterValues2) {
            arrayList2.add(ShopService.ppxfxbqfkf(shopService4, null, null, null, arrayList.contains(shopService4), 7, null));
        }
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void metgxyhuhe(List list) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(list));
    }

    private final void okpsazkaxt() {
        List filterValues = ((State) jlmebxxoox()).getFilterValues();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(filterValues, 10));
        Iterator it = filterValues.iterator();
        while (it.hasNext()) {
            arrayList.add(ShopService.ppxfxbqfkf((ShopService) it.next(), null, null, null, false, 7, null));
        }
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(arrayList));
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(List list, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f78003cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f78003cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f78005jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f78003cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                n11.eablkybsjg eablkybsjgVar = this.f77995ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                wkgbmnqykcVar.f78007zdlpuopuiu = this;
                wkgbmnqykcVar.f78006yggfygwlhe = list;
                wkgbmnqykcVar.f78003cqumvgiudr = 1;
                objZoijcleaow = eablkybsjgVar.zoijcleaow(wwaezpbzknVar, wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) wkgbmnqykcVar.f78006yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f78007zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        List list2 = (List) objZoijcleaow;
        if (list == null) {
            list = jyumaefscl.wflxmlrfwp();
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(iobyxmoadgVar.czzsidtyhn(list2, list));
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.metgxyhuhe((List) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.uwvvkdfqfp(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(q61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(action, this, null), 3, null);
    }

    public final void uwvvkdfqfp(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(false));
        crxdokpmqz(new eablkybsjg.zoijcleaow(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(q61.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, q61.wkgbmnqykc.iobyxmoadg.f78013iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f77991iobyxmoadg);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, q61.wkgbmnqykc.zoijcleaow.f78015iobyxmoadg)) {
            okpsazkaxt();
        } else {
            if (!(intent instanceof q61.wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ikoacuggdj(((q61.wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
        }
    }
}
