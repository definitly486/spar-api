package ru.myspar.legacy.presentation.screen.shops;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import com.yandex.mapkit.map.VisibleRegion;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import h40.dxjokdxxww;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.CameraPosition;
import ru.myspar.domain.feature.shops.store.State;
import ru.myspar.domain.feature.shops.store.lqeggnwhkg;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final vd0.iobyxmoadg f89770agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final nz1.iobyxmoadg f89771btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ob0.wkgbmnqykc f89772draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ud0.iobyxmoadg f89773gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final vd0.ppxfxbqfkf f89774ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final draadjrbmk f89775oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final lo.zoijcleaow f89776rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final draadjrbmk f89777vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final vd0.zoijcleaow f89778wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.shops.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2061iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f89779iobyxmoadg;

        static {
            int[] iArr = new int[State.zoijcleaow.values().length];
            try {
                iArr[State.zoijcleaow.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.zoijcleaow.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f89779iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f89780jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89782zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f89780jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f89780jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89782zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.domain.feature.shops.store.wkgbmnqykc.gtknphoqwx gtknphoqwxVar = new ru.myspar.domain.feature.shops.store.wkgbmnqykc.gtknphoqwx(this.f89780jyumaefscl);
                this.f89782zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(gtknphoqwxVar, this) == objGxszxtbevo) {
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

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f89783jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89785zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f89783jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f89783jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89785zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.domain.feature.shops.store.wkgbmnqykc.eablkybsjg eablkybsjgVar = new ru.myspar.domain.feature.shops.store.wkgbmnqykc.eablkybsjg(this.f89783jyumaefscl);
                this.f89785zdlpuopuiu = 1;
                if (iobyxmoadgVar.jpowsppfya(eablkybsjgVar, this) == objGxszxtbevo) {
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
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, nz1.iobyxmoadg getDefaultFeedbackPhoneUseCase, ud0.iobyxmoadg shopUiMapper, ob0.wkgbmnqykc serviceUiMapper, vd0.zoijcleaow domainCameraPositionMapper, vd0.iobyxmoadg cameraPositionToDomainMapper, vd0.ppxfxbqfkf visibleRegionToDomainMapper, lo.zoijcleaow analyticsTracker) {
        super(store, dispatchersProvider, savedStateHandle);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(store, "store");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopUiMapper, "shopUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serviceUiMapper, "serviceUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(domainCameraPositionMapper, "domainCameraPositionMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cameraPositionToDomainMapper, "cameraPositionToDomainMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(visibleRegionToDomainMapper, "visibleRegionToDomainMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f89771btonecajqb = getDefaultFeedbackPhoneUseCase;
        this.f89773gtknphoqwx = shopUiMapper;
        this.f89772draadjrbmk = serviceUiMapper;
        this.f89778wflxmlrfwp = domainCameraPositionMapper;
        this.f89770agtfadlqog = cameraPositionToDomainMapper;
        this.f89774ojitshcjhn = visibleRegionToDomainMapper;
        this.f89776rgvfuqvkyq = analyticsTracker;
        this.f89777vdvldrhtss = new draadjrbmk() { // from class: qd0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.shops.iobyxmoadg.ribwqtqdhb(this.f78604zdlpuopuiu, (State) obj);
            }
        };
        this.f89775oxmwwwfdhm = new draadjrbmk() { // from class: qd0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.shops.iobyxmoadg.ntlheqmsrt(this.f78616zdlpuopuiu, (ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.domain.feature.shops.store.wkgbmnqykc ntlheqmsrt(iobyxmoadg iobyxmoadgVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf ppxfxbqfkfVar) {
        ru.myspar.domain.feature.shops.store.wkgbmnqykc gxszxtbevoVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.zoijcleaow.f89803iobyxmoadg)) {
            return ru.myspar.domain.feature.shops.store.wkgbmnqykc.zoijcleaow.f88082iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.wkgbmnqykc.f89802iobyxmoadg)) {
            return ru.myspar.domain.feature.shops.store.wkgbmnqykc.C2015wkgbmnqykc.f88081iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.lqeggnwhkg.f89798iobyxmoadg)) {
            return ru.myspar.domain.feature.shops.store.wkgbmnqykc.nufgyqmvbu.f88076iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.gtknphoqwx.f89794iobyxmoadg)) {
            return ru.myspar.domain.feature.shops.store.wkgbmnqykc.wflxmlrfwp.f88080iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.btonecajqb.f89787iobyxmoadg)) {
            return ru.myspar.domain.feature.shops.store.wkgbmnqykc.draadjrbmk.f88066iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.C2062ppxfxbqfkf.f89800iobyxmoadg)) {
            return ru.myspar.domain.feature.shops.store.wkgbmnqykc.ppxfxbqfkf.f88078iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.draadjrbmk.f89788iobyxmoadg)) {
            return ru.myspar.domain.feature.shops.store.wkgbmnqykc.agtfadlqog.f88063iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.gxszxtbevo.f89795iobyxmoadg)) {
            return ru.myspar.domain.feature.shops.store.wkgbmnqykc.lqeggnwhkg.f88075iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.wflxmlrfwp) {
            gxszxtbevoVar = new ru.myspar.domain.feature.shops.store.wkgbmnqykc.ojitshcjhn(iobyxmoadgVar.f89774ojitshcjhn.invoke(((ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.wflxmlrfwp) ppxfxbqfkfVar).iobyxmoadg()));
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.agtfadlqog.f89786iobyxmoadg)) {
                return ru.myspar.domain.feature.shops.store.wkgbmnqykc.rgvfuqvkyq.f88079iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.iobyxmoadg) {
                ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = (ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar;
                CameraPosition cameraPositionInvoke = iobyxmoadgVar.f89770agtfadlqog.invoke(iobyxmoadgVar2.iobyxmoadg());
                VisibleRegion visibleRegionZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                return new ru.myspar.domain.feature.shops.store.wkgbmnqykc.iobyxmoadg(cameraPositionInvoke, visibleRegionZoijcleaow != null ? iobyxmoadgVar.f89774ojitshcjhn.invoke(visibleRegionZoijcleaow) : null);
            }
            if (!(ppxfxbqfkfVar instanceof ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.eablkybsjg)) {
                if (ppxfxbqfkfVar instanceof ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.nufgyqmvbu) {
                    return new ru.myspar.domain.feature.shops.store.wkgbmnqykc.dxjokdxxww(m30.zoijcleaow.iobyxmoadg(((ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg()));
                }
                if (!(ppxfxbqfkfVar instanceof ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.dxjokdxxww)) {
                    throw new NoWhenBranchMatchedException();
                }
                ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.dxjokdxxww dxjokdxxwwVar = (ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.dxjokdxxww) ppxfxbqfkfVar;
                return new ru.myspar.domain.feature.shops.store.wkgbmnqykc.btonecajqb(dxjokdxxwwVar.iobyxmoadg(), dxjokdxxwwVar.zoijcleaow());
            }
            ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.eablkybsjg eablkybsjgVar = (ru.myspar.legacy.presentation.screen.shops.ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar;
            VisibleRegion visibleRegionIobyxmoadg = eablkybsjgVar.iobyxmoadg();
            gxszxtbevoVar = new ru.myspar.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo(visibleRegionIobyxmoadg != null ? iobyxmoadgVar.f89774ojitshcjhn.invoke(visibleRegionIobyxmoadg) : null, m30.zoijcleaow.iobyxmoadg(eablkybsjgVar.zoijcleaow().eablkybsjg()), eablkybsjgVar.ppxfxbqfkf());
        }
        return gxszxtbevoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ribwqtqdhb(iobyxmoadg iobyxmoadgVar, State state) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        boolean zSopmlzcsov = iobyxmoadgVar.sopmlzcsov(state, iobyxmoadgVar.f89772draadjrbmk.invoke(state.getServices()));
        List listInvoke = iobyxmoadgVar.f89773gtknphoqwx.invoke(state.getMapShops());
        List listInvoke2 = iobyxmoadgVar.f89773gtknphoqwx.invoke(state.getVisibleShops());
        boolean isLoading = state.getIsLoading();
        if (listInvoke == null) {
            listInvoke = jyumaefscl.wflxmlrfwp();
        }
        List list = listInvoke;
        if (listInvoke2 == null) {
            listInvoke2 = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listInvoke2;
        int i13 = C2061iobyxmoadg.f89779iobyxmoadg[state.getPageType().ordinal()];
        if (i13 == 1) {
            iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.MAP;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.LIST;
        }
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar2;
        boolean z13 = !state.getSelectedServices().isEmpty();
        LocationData userLocation = state.getUserLocation();
        return new wkgbmnqykc(isLoading, list2, list, iobyxmoadgVar3, z13, userLocation != null ? m30.zoijcleaow.zoijcleaow(userLocation) : null, zSopmlzcsov, state.getIsNeedScrollToTop());
    }

    private final boolean sopmlzcsov(State state, List list) {
        if (state.getSelectedServices().isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (state.getSelectedServices().contains(((rb0.zoijcleaow) obj).getItemId())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((rb0.zoijcleaow) it.next()).dxjokdxxww()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void vipkmwdibw(AnalyticsPage analyticsPage) {
        this.f89776rgvfuqvkyq.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Shops.f84351iwizpuwonk, analyticsPage, null, null, null, 28, null)));
    }

    public final void crxdokpmqz(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new zoijcleaow(z13, null), 3, null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89777vdvldrhtss;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89775oxmwwwfdhm;
    }

    public final void jlmebxxoox(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new ppxfxbqfkf(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.domain.feature.shops.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.domain.feature.shops.store.eablkybsjg.iobyxmoadg.f87927iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.lqeggnwhkg) {
                Object objCllcsxoeiz = cllcsxoeiz(new eablkybsjg.wkgbmnqykc(((ru.myspar.domain.feature.shops.store.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.nufgyqmvbu) {
                Object objCllcsxoeiz2 = cllcsxoeiz(new eablkybsjg.C2060eablkybsjg(((ru.myspar.domain.feature.shops.store.eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg().getMessage()), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.zoijcleaow) {
                Object objCllcsxoeiz3 = cllcsxoeiz(new eablkybsjg.iobyxmoadg(((ru.myspar.domain.feature.shops.store.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.ppxfxbqfkf) {
                ru.myspar.domain.feature.shops.store.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.domain.feature.shops.store.eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
                Object objCllcsxoeiz4 = cllcsxoeiz(new eablkybsjg.zoijcleaow(m30.zoijcleaow.zoijcleaow(ppxfxbqfkfVar.zoijcleaow()), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf()), gxszxtbevoVar);
                if (objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo()) {
                    return objCllcsxoeiz4;
                }
            } else if (eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.wkgbmnqykc) {
                Object objCllcsxoeiz5 = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(this.f89778wflxmlrfwp.invoke(((ru.myspar.domain.feature.shops.store.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg())), gxszxtbevoVar);
                if (objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo()) {
                    return objCllcsxoeiz5;
                }
            } else {
                if (eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.gtknphoqwx) {
                    Object objCllcsxoeiz6 = cllcsxoeiz(new eablkybsjg.lqeggnwhkg(m30.zoijcleaow.zoijcleaow(((ru.myspar.domain.feature.shops.store.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg())), gxszxtbevoVar);
                    return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.btonecajqb) {
                    vipkmwdibw(AnalyticsPage.ShopsDetail.f84352iwizpuwonk);
                    ru.myspar.domain.feature.shops.store.eablkybsjg.btonecajqb btonecajqbVar = (ru.myspar.domain.feature.shops.store.eablkybsjg.btonecajqb) eablkybsjgVar;
                    Object objCllcsxoeiz7 = cllcsxoeiz(new eablkybsjg.gxszxtbevo(btonecajqbVar.zoijcleaow(), this.f89772draadjrbmk.invoke(btonecajqbVar.iobyxmoadg()), btonecajqbVar.ppxfxbqfkf()), gxszxtbevoVar);
                    return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.domain.feature.shops.store.eablkybsjg.C2005eablkybsjg.f87924iobyxmoadg)) {
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.dxjokdxxww((String) this.f89771btonecajqb.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
                } else if (eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.gxszxtbevo) {
                    vipkmwdibw(AnalyticsPage.ShopsFilter.f84353iwizpuwonk);
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.shopfilters.zoijcleaow.zoijcleaow(((ru.myspar.domain.feature.shops.store.eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()));
                } else {
                    if (!(eablkybsjgVar instanceof ru.myspar.domain.feature.shops.store.eablkybsjg.dxjokdxxww)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ru.myspar.domain.feature.shops.store.eablkybsjg.dxjokdxxww dxjokdxxwwVar = (ru.myspar.domain.feature.shops.store.eablkybsjg.dxjokdxxww) eablkybsjgVar;
                    d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.gtknphoqwx(dxjokdxxwwVar.iobyxmoadg().getLatitude(), dxjokdxxwwVar.iobyxmoadg().getLongitude()));
                }
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
