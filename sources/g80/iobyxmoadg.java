package g80;

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
import ru.myspar.core.domain.models.shop.ShopService;
import ru.myspar.domain.feature.shopfilters.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final h30.eablkybsjg f36621ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u10.lqeggnwhkg f36622wkgbmnqykc;

    /* JADX INFO: renamed from: g80.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0824iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f36623jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f36625zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0824iobyxmoadg(List list, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f36623jyumaefscl = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C0824iobyxmoadg(this.f36623jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f36625zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                u10.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.this.f36622wkgbmnqykc;
                List list = this.f36623jyumaefscl;
                ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ShopService) it.next()).getName());
                }
                this.f36625zdlpuopuiu = 1;
                if (lqeggnwhkgVar.gtknphoqwx(arrayList, this) == objGxszxtbevo) {
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
            return ((C0824iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f36626jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ g80.ppxfxbqfkf f36627yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f36628zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(g80.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f36627yggfygwlhe = ppxfxbqfkfVar;
            this.f36626jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f36627yggfygwlhe, this.f36626jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f36628zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                g80.ppxfxbqfkf ppxfxbqfkfVar = this.f36627yggfygwlhe;
                if (!(ppxfxbqfkfVar instanceof g80.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f36626jyumaefscl;
                List listIobyxmoadg = ((g80.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg();
                this.f36628zdlpuopuiu = 1;
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
        int f36629cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f36631jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f36632yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f36633zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f36631jyumaefscl = obj;
            this.f36629cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f36635zdlpuopuiu;

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
            int i13 = this.f36635zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                u10.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.this.f36622wkgbmnqykc;
                this.f36635zdlpuopuiu = 1;
                if (u10.lqeggnwhkg.draadjrbmk(lqeggnwhkgVar, null, this, 1, null) == objGxszxtbevo) {
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
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, h30.eablkybsjg getShopServicesUseCase, u10.lqeggnwhkg changeShopFiltersObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getShopServicesUseCase, "getShopServicesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeShopFiltersObserver, "changeShopFiltersObserver");
        this.f36621ppxfxbqfkf = getShopServicesUseCase;
        this.f36622wkgbmnqykc = changeShopFiltersObserver;
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
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0824iobyxmoadg(arrayList, null), 3, null);
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
            int i13 = wkgbmnqykcVar.f36629cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f36629cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f36631jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f36629cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                h30.eablkybsjg eablkybsjgVar = this.f36621ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                wkgbmnqykcVar.f36633zdlpuopuiu = this;
                wkgbmnqykcVar.f36632yggfygwlhe = list;
                wkgbmnqykcVar.f36629cqumvgiudr = 1;
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
            list = (List) wkgbmnqykcVar.f36632yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f36633zdlpuopuiu;
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
    public void pmvmpeiblj(g80.ppxfxbqfkf action) {
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
    public void zynmafqrjb(g80.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, g80.wkgbmnqykc.iobyxmoadg.f36639iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f36617iobyxmoadg);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, g80.wkgbmnqykc.zoijcleaow.f36641iobyxmoadg)) {
            okpsazkaxt();
        } else {
            if (!(intent instanceof g80.wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ikoacuggdj(((g80.wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
        }
    }
}
