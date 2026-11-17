package g61;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.esjtqupxsv;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;
import ru.myspar.proloyalty.domain.feature.promocatalog.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final i01.eablkybsjg f36510eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final h11.zoijcleaow f36511ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final esjtqupxsv f36512wkgbmnqykc;

    /* JADX INFO: renamed from: g61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0819iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f36513iobyxmoadg;

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
            f36513iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f36514jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f36516zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f36514jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f36514jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f36516zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    String str = this.f36514jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    h11.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f36511ppxfxbqfkf;
                    h11.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new h11.zoijcleaow.iobyxmoadg(false, str);
                    this.f36516zdlpuopuiu = 1;
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
            String str2 = this.f36514jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.metgxyhuhe((Promotion) objWkgbmnqykc, str2);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.yfnezrywwk(thDxjokdxxww);
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
        int f36518zdlpuopuiu;

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
            int i13 = this.f36518zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                i01.eablkybsjg eablkybsjgVar = iobyxmoadg.this.f36510eablkybsjg;
                this.f36518zdlpuopuiu = 1;
                if (eablkybsjgVar.btonecajqb(this) == objGxszxtbevo) {
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
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, h11.zoijcleaow getPromoUseCase, esjtqupxsv isAuthUseCase, i01.eablkybsjg changePromotionObserver) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromoUseCase, "getPromoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changePromotionObserver, "changePromotionObserver");
        this.f36511ppxfxbqfkf = getPromoUseCase;
        this.f36512wkgbmnqykc = isAuthUseCase;
        this.f36510eablkybsjg = changePromotionObserver;
    }

    static /* synthetic */ void czzsidtyhn(iobyxmoadg iobyxmoadgVar, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        iobyxmoadgVar.rlfsiqarku(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void metgxyhuhe(Promotion promotion, String str) {
        if (str != null && str.length() != 0) {
            gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
        }
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(((Boolean) this.f36512wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue(), promotion));
    }

    private final void rlfsiqarku(String str) {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(str, null), 3, null);
    }

    private final void uwvvkdfqfp(State state, String str, String str2) {
        int i13 = C0819iobyxmoadg.f36513iobyxmoadg[state.getPromoModel().getType().ordinal()];
        if (i13 == 1) {
            rlfsiqarku(str);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.wkgbmnqykc(str2));
        }
    }

    private final void ydmasvzmpa(String str, String str2, String str3, boolean z13) {
        if (z13) {
            crxdokpmqz(new eablkybsjg.ppxfxbqfkf(new vz0.iobyxmoadg(str, str2, str3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yfnezrywwk(Throwable th2) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        crxdokpmqz(new eablkybsjg.zoijcleaow(th2));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(g61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, g61.ppxfxbqfkf.iobyxmoadg.f36521iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        czzsidtyhn(this, null, 1, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f36529iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f36503iobyxmoadg);
            return;
        }
        if (intent instanceof wkgbmnqykc.iobyxmoadg) {
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (wkgbmnqykc.iobyxmoadg) intent;
            uwvvkdfqfp((State) jlmebxxoox(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
        } else if (!(intent instanceof wkgbmnqykc.ppxfxbqfkf)) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.C0820wkgbmnqykc.f36528iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            czzsidtyhn(this, null, 1, null);
        } else {
            wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (wkgbmnqykc.ppxfxbqfkf) intent;
            ydmasvzmpa(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.wkgbmnqykc());
        }
    }
}
