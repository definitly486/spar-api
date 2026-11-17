package vh0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import oa0.dxjokdxxww;
import pj.cllcsxoeiz;
import pj.pkzmftpjix;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final z10.ppxfxbqfkf f116793eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final pkzmftpjix f116794gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f116795iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final z10.zoijcleaow f116796ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final z10.eablkybsjg f116797wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vh0.iobyxmoadg f116798zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f116799cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f116801jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f116802yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f116803zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116801jyumaefscl = obj;
            this.f116799cqumvgiudr |= Integer.MIN_VALUE;
            return eablkybsjg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f116804cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f116806iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f116807jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f116808lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f116809yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116810zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116804cqumvgiudr = obj;
            this.f116808lereixgezr |= Integer.MIN_VALUE;
            return eablkybsjg.this.wkgbmnqykc(null, 0, null, null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116812zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return eablkybsjg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116812zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                dxjokdxxww dxjokdxxwwVar = eablkybsjg.this.f116795iobyxmoadg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f116812zdlpuopuiu = 1;
                obj = dxjokdxxwwVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public eablkybsjg(dxjokdxxww isChatFeatureEnabledUseCase, vh0.iobyxmoadg bannerListToUiModelList, z10.zoijcleaow getFeatureChatIdUseCase, z10.eablkybsjg getFeatureRestaurantIdUseCase, z10.ppxfxbqfkf getFeatureFastDeliveryIdUseCase, pkzmftpjix coroutineDispatcher) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isChatFeatureEnabledUseCase, "isChatFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bannerListToUiModelList, "bannerListToUiModelList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getFeatureChatIdUseCase, "getFeatureChatIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getFeatureRestaurantIdUseCase, "getFeatureRestaurantIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getFeatureFastDeliveryIdUseCase, "getFeatureFastDeliveryIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f116795iobyxmoadg = isChatFeatureEnabledUseCase;
        this.f116798zoijcleaow = bannerListToUiModelList;
        this.f116796ppxfxbqfkf = getFeatureChatIdUseCase;
        this.f116797wkgbmnqykc = getFeatureRestaurantIdUseCase;
        this.f116793eablkybsjg = getFeatureFastDeliveryIdUseCase;
        this.f116794gxszxtbevo = coroutineDispatcher;
    }

    private final List eablkybsjg(List list, int i13, String str, String str2) {
        return this.f116798zoijcleaow.zoijcleaow(i13, list, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ppxfxbqfkf(List list, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f116799cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f116799cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = iobyxmoadgVar.f116801jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f116799cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            pkzmftpjix pkzmftpjixVar = this.f116794gxszxtbevo;
            zoijcleaow zoijcleaowVar = new zoijcleaow(null);
            iobyxmoadgVar.f116803zdlpuopuiu = this;
            iobyxmoadgVar.f116802yggfygwlhe = list;
            iobyxmoadgVar.f116799cqumvgiudr = 1;
            objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar, zoijcleaowVar, iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) iobyxmoadgVar.f116802yggfygwlhe;
            eablkybsjgVar = (eablkybsjg) iobyxmoadgVar.f116803zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        boolean zBooleanValue = ((Boolean) objLqeggnwhkg).booleanValue();
        z10.zoijcleaow zoijcleaowVar2 = eablkybsjgVar.f116796ppxfxbqfkf;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        String str = (String) zoijcleaowVar2.zoijcleaow(wwaezpbzknVar);
        String str2 = (String) eablkybsjgVar.f116797wkgbmnqykc.zoijcleaow(wwaezpbzknVar);
        String str3 = (String) eablkybsjgVar.f116793eablkybsjg.zoijcleaow(wwaezpbzknVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String strBtonecajqb = ((q00.zoijcleaow) obj).btonecajqb();
            boolean z13 = false;
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strBtonecajqb, str2) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strBtonecajqb, str3)) {
                z13 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strBtonecajqb, str) ? zBooleanValue : true;
            }
            if (z13) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wkgbmnqykc(List list, int i13, String str, String str2, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i14 = ppxfxbqfkfVar.f116808lereixgezr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f116808lereixgezr = i14 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f116804cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = ppxfxbqfkfVar.f116808lereixgezr;
        if (i15 == 0) {
            zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ppxfxbqfkfVar.f116809yggfygwlhe = str;
            ppxfxbqfkfVar.f116807jyumaefscl = str2;
            ppxfxbqfkfVar.f116806iwizpuwonk = this;
            ppxfxbqfkfVar.f116810zdlpuopuiu = i13;
            ppxfxbqfkfVar.f116808lereixgezr = 1;
            objPpxfxbqfkf = ppxfxbqfkf(list, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = ppxfxbqfkfVar.f116810zdlpuopuiu;
            eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar.f116806iwizpuwonk;
            str2 = (String) ppxfxbqfkfVar.f116807jyumaefscl;
            str = (String) ppxfxbqfkfVar.f116809yggfygwlhe;
            zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return eablkybsjgVar.eablkybsjg((List) objPpxfxbqfkf, i13, str, str2);
    }
}
