package ru.myspar.proloyalty.legacy.presentation.screen.shops;

import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ulzqkzuiru;
import com.yandex.mapkit.map.VisibleRegion;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m21.dxjokdxxww;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.CameraPosition;
import ru.myspar.proloyalty.domain.feature.shops.store.State;
import ru.myspar.proloyalty.domain.feature.shops.store.lqeggnwhkg;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final rb1.iobyxmoadg f97400agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final el1.iobyxmoadg f97401btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final n91.wkgbmnqykc f97402draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final qb1.iobyxmoadg f97403gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final rb1.ppxfxbqfkf f97404ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final draadjrbmk f97405oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final vm0.zoijcleaow f97406rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final draadjrbmk f97407vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final rb1.zoijcleaow f97408wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.shops.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2301iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f97409iobyxmoadg;

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
            f97409iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f97410jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97412zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97410jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f97410jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97412zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gtknphoqwx gtknphoqwxVar = new ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gtknphoqwx(this.f97410jyumaefscl);
                this.f97412zdlpuopuiu = 1;
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
        final /* synthetic */ boolean f97413jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f97415zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f97413jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f97413jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f97415zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.eablkybsjg eablkybsjgVar = new ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.eablkybsjg(this.f97413jyumaefscl);
                this.f97415zdlpuopuiu = 1;
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
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, el1.iobyxmoadg getDefaultFeedbackPhoneUseCase, qb1.iobyxmoadg shopUiMapper, n91.wkgbmnqykc serviceUiMapper, rb1.zoijcleaow domainCameraPositionMapper, rb1.iobyxmoadg cameraPositionToDomainMapper, rb1.ppxfxbqfkf visibleRegionToDomainMapper, vm0.zoijcleaow analyticsTracker) {
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
        this.f97401btonecajqb = getDefaultFeedbackPhoneUseCase;
        this.f97403gtknphoqwx = shopUiMapper;
        this.f97402draadjrbmk = serviceUiMapper;
        this.f97408wflxmlrfwp = domainCameraPositionMapper;
        this.f97400agtfadlqog = cameraPositionToDomainMapper;
        this.f97404ojitshcjhn = visibleRegionToDomainMapper;
        this.f97406rgvfuqvkyq = analyticsTracker;
        this.f97407vdvldrhtss = new draadjrbmk() { // from class: mb1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.shops.iobyxmoadg.ribwqtqdhb(this.f66761zdlpuopuiu, (State) obj);
            }
        };
        this.f97405oxmwwwfdhm = new draadjrbmk() { // from class: mb1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.shops.iobyxmoadg.ntlheqmsrt(this.f66773zdlpuopuiu, (ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc ntlheqmsrt(iobyxmoadg iobyxmoadgVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf ppxfxbqfkfVar) {
        ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc gxszxtbevoVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.zoijcleaow.f97433iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.zoijcleaow.f95859iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.wkgbmnqykc.f97432iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.C2252wkgbmnqykc.f95858iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.lqeggnwhkg.f97428iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.nufgyqmvbu.f95853iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.gtknphoqwx.f97424iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.wflxmlrfwp.f95857iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.btonecajqb.f97417iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.draadjrbmk.f95843iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.C2302ppxfxbqfkf.f97430iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.ppxfxbqfkf.f95855iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.draadjrbmk.f97418iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.agtfadlqog.f95840iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.gxszxtbevo.f97425iobyxmoadg)) {
            return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.lqeggnwhkg.f95852iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.wflxmlrfwp) {
            gxszxtbevoVar = new ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.ojitshcjhn(iobyxmoadgVar.f97404ojitshcjhn.invoke(((ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.wflxmlrfwp) ppxfxbqfkfVar).iobyxmoadg()));
        } else {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.agtfadlqog.f97416iobyxmoadg)) {
                return ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.rgvfuqvkyq.f95856iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.iobyxmoadg) {
                ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = (ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar;
                CameraPosition cameraPositionInvoke = iobyxmoadgVar.f97400agtfadlqog.invoke(iobyxmoadgVar2.iobyxmoadg());
                VisibleRegion visibleRegionZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                return new ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.iobyxmoadg(cameraPositionInvoke, visibleRegionZoijcleaow != null ? iobyxmoadgVar.f97404ojitshcjhn.invoke(visibleRegionZoijcleaow) : null);
            }
            if (!(ppxfxbqfkfVar instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.eablkybsjg)) {
                if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.nufgyqmvbu) {
                    return new ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.dxjokdxxww(s11.zoijcleaow.iobyxmoadg(((ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg()));
                }
                if (!(ppxfxbqfkfVar instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.dxjokdxxww)) {
                    throw new NoWhenBranchMatchedException();
                }
                ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.dxjokdxxww dxjokdxxwwVar = (ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.dxjokdxxww) ppxfxbqfkfVar;
                return new ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.btonecajqb(dxjokdxxwwVar.iobyxmoadg(), dxjokdxxwwVar.zoijcleaow());
            }
            ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.eablkybsjg eablkybsjgVar = (ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar;
            VisibleRegion visibleRegionIobyxmoadg = eablkybsjgVar.iobyxmoadg();
            gxszxtbevoVar = new ru.myspar.proloyalty.domain.feature.shops.store.wkgbmnqykc.gxszxtbevo(visibleRegionIobyxmoadg != null ? iobyxmoadgVar.f97404ojitshcjhn.invoke(visibleRegionIobyxmoadg) : null, s11.zoijcleaow.iobyxmoadg(eablkybsjgVar.zoijcleaow().eablkybsjg()), eablkybsjgVar.ppxfxbqfkf());
        }
        return gxszxtbevoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ribwqtqdhb(iobyxmoadg iobyxmoadgVar, State state) {
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "<this>");
        boolean zSopmlzcsov = iobyxmoadgVar.sopmlzcsov(state, iobyxmoadgVar.f97402draadjrbmk.invoke(state.getServices()));
        List listInvoke = iobyxmoadgVar.f97403gtknphoqwx.invoke(state.getMapShops());
        List listInvoke2 = iobyxmoadgVar.f97403gtknphoqwx.invoke(state.getVisibleShops());
        boolean isLoading = state.getIsLoading();
        if (listInvoke == null) {
            listInvoke = jyumaefscl.wflxmlrfwp();
        }
        List list = listInvoke;
        if (listInvoke2 == null) {
            listInvoke2 = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listInvoke2;
        int i13 = C2301iobyxmoadg.f97409iobyxmoadg[state.getPageType().ordinal()];
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
        return new wkgbmnqykc(isLoading, list2, list, iobyxmoadgVar3, z13, userLocation != null ? s11.zoijcleaow.zoijcleaow(userLocation) : null, zSopmlzcsov, state.getIsNeedScrollToTop());
    }

    private final boolean sopmlzcsov(State state, List list) {
        if (state.getSelectedServices().isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (state.getSelectedServices().contains(((q91.zoijcleaow) obj).getItemId())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((q91.zoijcleaow) it.next()).dxjokdxxww()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void vipkmwdibw(AnalyticsPage analyticsPage) {
        this.f97406rgvfuqvkyq.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Shops.f92379iwizpuwonk, analyticsPage, null, null, null, 28, null)));
    }

    public final void crxdokpmqz(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new zoijcleaow(z13, null), 3, null);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97407vdvldrhtss;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97405oxmwwwfdhm;
    }

    public final void jlmebxxoox(boolean z13) {
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new ppxfxbqfkf(z13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.iobyxmoadg.f95704iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.lqeggnwhkg) {
                Object objCllcsxoeiz = cllcsxoeiz(new eablkybsjg.wkgbmnqykc(((ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.nufgyqmvbu) {
                Object objCllcsxoeiz2 = cllcsxoeiz(new eablkybsjg.C2300eablkybsjg(((ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg().getMessage()), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.zoijcleaow) {
                Object objCllcsxoeiz3 = cllcsxoeiz(new eablkybsjg.iobyxmoadg(((ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.ppxfxbqfkf) {
                ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
                Object objCllcsxoeiz4 = cllcsxoeiz(new eablkybsjg.zoijcleaow(s11.zoijcleaow.zoijcleaow(ppxfxbqfkfVar.zoijcleaow()), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf()), gxszxtbevoVar);
                if (objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo()) {
                    return objCllcsxoeiz4;
                }
            } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.wkgbmnqykc) {
                Object objCllcsxoeiz5 = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(this.f97408wflxmlrfwp.invoke(((ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg())), gxszxtbevoVar);
                if (objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo()) {
                    return objCllcsxoeiz5;
                }
            } else {
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.gtknphoqwx) {
                    Object objCllcsxoeiz6 = cllcsxoeiz(new eablkybsjg.lqeggnwhkg(s11.zoijcleaow.zoijcleaow(((ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg())), gxszxtbevoVar);
                    return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.btonecajqb) {
                    vipkmwdibw(AnalyticsPage.ShopsDetail.f92380iwizpuwonk);
                    ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.btonecajqb btonecajqbVar = (ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.btonecajqb) eablkybsjgVar;
                    Object objCllcsxoeiz7 = cllcsxoeiz(new eablkybsjg.gxszxtbevo(btonecajqbVar.zoijcleaow(), this.f97402draadjrbmk.invoke(btonecajqbVar.iobyxmoadg()), btonecajqbVar.ppxfxbqfkf()), gxszxtbevoVar);
                    return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.C2242eablkybsjg.f95701iobyxmoadg)) {
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.dxjokdxxww((String) this.f97401btonecajqb.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
                } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.gxszxtbevo) {
                    vipkmwdibw(AnalyticsPage.ShopsFilter.f92381iwizpuwonk);
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.zoijcleaow.zoijcleaow(((ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()));
                } else {
                    if (!(eablkybsjgVar instanceof ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.dxjokdxxww)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.dxjokdxxww dxjokdxxwwVar = (ru.myspar.proloyalty.domain.feature.shops.store.eablkybsjg.dxjokdxxww) eablkybsjgVar;
                    i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.gtknphoqwx(dxjokdxxwwVar.iobyxmoadg().getLatitude(), dxjokdxxwwVar.iobyxmoadg().getLongitude()));
                }
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
