package v70;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.core.domain.models.promo.Promotion;
import ru.myspar.domain.feature.promocatalog.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final c20.eablkybsjg f116284eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final u10.eablkybsjg f116285gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f116286ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c30.zoijcleaow f116287wkgbmnqykc;

    /* JADX INFO: renamed from: v70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2893iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f116288iobyxmoadg;

        static {
            int[] iArr = new int[Promotion.zoijcleaow.values().length];
            try {
                iArr[Promotion.zoijcleaow.CARD_OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Promotion.zoijcleaow.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f116288iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f116289jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116291zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116289jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f116289jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116291zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    String str = this.f116289jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    c30.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f116287wkgbmnqykc;
                    c30.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new c30.zoijcleaow.iobyxmoadg(false, str);
                    this.f116291zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(iobyxmoadgVar3, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Promotion) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            String str2 = this.f116289jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.xrmfcynszj((Promotion) objWkgbmnqykc, str2);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.uwvvkdfqfp(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116293zdlpuopuiu;

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
            int i13 = this.f116293zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                u10.eablkybsjg eablkybsjgVar = iobyxmoadg.this.f116285gxszxtbevo;
                this.f116293zdlpuopuiu = 1;
                if (eablkybsjgVar.gtknphoqwx(this) == objGxszxtbevo) {
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
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, c30.zoijcleaow getPromoUseCase, c20.eablkybsjg isLoggedInUseCase, u10.eablkybsjg changePromotionObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromoUseCase, "getPromoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changePromotionObserver, "changePromotionObserver");
        this.f116286ppxfxbqfkf = dispatchersProvider;
        this.f116287wkgbmnqykc = getPromoUseCase;
        this.f116284eablkybsjg = isLoggedInUseCase;
        this.f116285gxszxtbevo = changePromotionObserver;
    }

    private final void czzsidtyhn(State state, String str, String str2) {
        int i13 = C2893iobyxmoadg.f116288iobyxmoadg[state.getPromoModel().getType().ordinal()];
        if (i13 == 1) {
            metgxyhuhe(str);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.wkgbmnqykc(str2));
        }
    }

    private final void metgxyhuhe(String str) {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(str, null), 3, null);
    }

    static /* synthetic */ void rlfsiqarku(iobyxmoadg iobyxmoadgVar, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        iobyxmoadgVar.metgxyhuhe(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj(Promotion promotion, String str) {
        if (str != null && str.length() != 0) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
        }
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(((Boolean) this.f116284eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue(), promotion));
    }

    private final void yfnezrywwk(String str, String str2, String str3, boolean z13) {
        if (z13) {
            crxdokpmqz(new eablkybsjg.ppxfxbqfkf(new f10.iobyxmoadg(str, str2, str3)));
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f116304iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f116277iobyxmoadg);
            return;
        }
        if (intent instanceof wkgbmnqykc.iobyxmoadg) {
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (wkgbmnqykc.iobyxmoadg) intent;
            czzsidtyhn((State) jlmebxxoox(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
        } else if (!(intent instanceof wkgbmnqykc.ppxfxbqfkf)) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.C2894wkgbmnqykc.f116303iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            rlfsiqarku(this, null, 1, null);
        } else {
            wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (wkgbmnqykc.ppxfxbqfkf) intent;
            yfnezrywwk(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.wkgbmnqykc());
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(v70.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, v70.ppxfxbqfkf.iobyxmoadg.f116296iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        rlfsiqarku(this, null, 1, null);
    }

    public final void uwvvkdfqfp(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        crxdokpmqz(new eablkybsjg.zoijcleaow(error));
    }
}
