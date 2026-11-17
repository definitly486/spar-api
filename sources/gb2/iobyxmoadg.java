package gb2;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import mj.kcexrzcfyt;
import mj.rgvfuqvkyq;
import pj.cllcsxoeiz;
import ru.myspar.webview_screen.impl.trackingorder.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final C0832iobyxmoadg f36776eablkybsjg = new C0832iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f36777gxszxtbevo = 8;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final rgvfuqvkyq f36778lqeggnwhkg = new rgvfuqvkyq("^.+/personal/.*");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final rgvfuqvkyq f36779nufgyqmvbu = new rgvfuqvkyq("^tel:.*");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f36780ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final i30.iobyxmoadg f36781wkgbmnqykc;

    /* JADX INFO: renamed from: gb2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0832iobyxmoadg {
        public /* synthetic */ C0832iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0832iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f36782jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f36783yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f36784zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f36783yggfygwlhe = ppxfxbqfkfVar;
            this.f36782jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f36783yggfygwlhe, this.f36782jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f36784zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36783yggfygwlhe, ppxfxbqfkf.iobyxmoadg.f36787iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f36782jyumaefscl;
                this.f36784zdlpuopuiu = 1;
                if (iobyxmoadgVar.jztzpxfvev(this) == objGxszxtbevo) {
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
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, i30.iobyxmoadg getTrackingOrderUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getTrackingOrderUseCase, "getTrackingOrderUseCase");
        this.f36780ppxfxbqfkf = dispatchersProvider;
        this.f36781wkgbmnqykc = getTrackingOrderUseCase;
    }

    private final void czzsidtyhn(String str) {
        crxdokpmqz(new eablkybsjg.zoijcleaow(kcexrzcfyt.c(str, "tel:", null, 2, null)));
        crxdokpmqz(eablkybsjg.wkgbmnqykc.f36773iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object jztzpxfvev(lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((String) this.f36781wkgbmnqykc.zoijcleaow(((State) jlmebxxoox()).getOrderId()));
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            okpsazkaxt((String) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            uwvvkdfqfp(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean metgxyhuhe(String str) {
        return f36779nufgyqmvbu.wkgbmnqykc(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void okpsazkaxt(String str) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(str));
    }

    private final void rlfsiqarku() {
        crxdokpmqz(eablkybsjg.iobyxmoadg.f36771iobyxmoadg);
        crxdokpmqz(eablkybsjg.wkgbmnqykc.f36773iobyxmoadg);
    }

    private final boolean xrmfcynszj(String str) {
        return f36778lqeggnwhkg.wkgbmnqykc(str);
    }

    private final void yfnezrywwk(String str) {
        if (xrmfcynszj(str)) {
            rlfsiqarku();
        } else if (metgxyhuhe(str)) {
            czzsidtyhn(str);
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f36788iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f36771iobyxmoadg);
        } else if (intent instanceof wkgbmnqykc.zoijcleaow) {
            crxdokpmqz(new eablkybsjg.C0831eablkybsjg(((wkgbmnqykc.zoijcleaow) intent).iobyxmoadg()));
        } else {
            if (!(intent instanceof wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            yfnezrywwk(((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }

    public final void uwvvkdfqfp(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(error));
    }
}
