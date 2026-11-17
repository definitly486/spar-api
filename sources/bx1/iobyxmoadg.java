package bx1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.jyumaefscl;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jyumaefscl f17339ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final vm0.zoijcleaow f17340wkgbmnqykc;

    /* JADX INFO: renamed from: bx1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0315iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f17341iobyxmoadg;

        static {
            int[] iArr = new int[ww1.iobyxmoadg.values().length];
            try {
                iArr[ww1.iobyxmoadg.SURVEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f17341iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f17342cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f17344jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f17345yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17346zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17344jyumaefscl = obj;
            this.f17342cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ikoacuggdj(null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ bx1.ppxfxbqfkf f17347jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f17349zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(bx1.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f17347jyumaefscl = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(this.f17347jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f17349zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String strIobyxmoadg = ((bx1.ppxfxbqfkf.iobyxmoadg) this.f17347jyumaefscl).iobyxmoadg();
                this.f17349zdlpuopuiu = 1;
                if (iobyxmoadgVar.ikoacuggdj(strIobyxmoadg, this) == objGxszxtbevo) {
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
    public iobyxmoadg(jyumaefscl getWebViewTokenUseCase, vm0.zoijcleaow analyticsTracker, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getWebViewTokenUseCase, "getWebViewTokenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f17339ppxfxbqfkf = getWebViewTokenUseCase;
        this.f17340wkgbmnqykc = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ikoacuggdj(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        String str2;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f17342cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f17342cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f17344jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f17342cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            if (C0315iobyxmoadg.f17341iobyxmoadg[((State) jlmebxxoox()).getScenario().ordinal()] == 1) {
                jyumaefscl jyumaefsclVar = this.f17339ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f17346zdlpuopuiu = this;
                ppxfxbqfkfVar.f17345yggfygwlhe = str;
                ppxfxbqfkfVar.f17342cqumvgiudr = 1;
                objZoijcleaow = jyumaefsclVar.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } else {
                str2 = null;
                iobyxmoadgVar = this;
            }
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(str, str2));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) ppxfxbqfkfVar.f17345yggfygwlhe;
        iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f17346zdlpuopuiu;
        zdlpuopuiu.zoijcleaow(objZoijcleaow);
        str2 = (String) objZoijcleaow;
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(str, str2));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void okpsazkaxt(AnalyticsPage analyticsPage) {
        this.f17340wkgbmnqykc.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(analyticsPage, AnalyticsPage.External.f92323iwizpuwonk, null, null, null, 28, null)));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f17354iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f17333iobyxmoadg);
        } else if (intent instanceof wkgbmnqykc.zoijcleaow) {
            crxdokpmqz(new eablkybsjg.zoijcleaow(((wkgbmnqykc.zoijcleaow) intent).iobyxmoadg()));
        } else {
            if (!(intent instanceof wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.ppxfxbqfkf(((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg()));
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(bx1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (action instanceof bx1.ppxfxbqfkf.iobyxmoadg) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, null), 3, null);
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, bx1.ppxfxbqfkf.zoijcleaow.f17353iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsPage fromPage = ((State) jlmebxxoox()).getFromPage();
            if (fromPage != null) {
                okpsazkaxt(fromPage);
            }
        }
    }
}
