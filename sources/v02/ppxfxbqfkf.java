package v02;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.rate_product.impl.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f115072btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f115073draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f115074gtknphoqwx;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f115075iobyxmoadg;

        static {
            int[] iArr = new int[x02.zoijcleaow.values().length];
            try {
                iArr[x02.zoijcleaow.SEND_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x02.zoijcleaow.REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f115075iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ru.myspar.rate.rate_product.impl.domain.store.lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f115072btonecajqb = resourcesManager;
        this.f115074gtknphoqwx = new draadjrbmk() { // from class: v02.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov(this.f115060zdlpuopuiu, (State) obj);
            }
        };
        this.f115073draadjrbmk = new draadjrbmk() { // from class: v02.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc ntlheqmsrt(lqeggnwhkg lqeggnwhkgVar) {
        ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc zoijcleaowVar;
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (lqeggnwhkgVar instanceof lqeggnwhkg.iobyxmoadg) {
            int i13 = iobyxmoadg.f115075iobyxmoadg[((lqeggnwhkg.iobyxmoadg) lqeggnwhkgVar).iobyxmoadg().ordinal()];
            if (i13 == 1) {
                return ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc.C2493wkgbmnqykc.f103015iobyxmoadg;
            }
            if (i13 == 2) {
                return ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f103014iobyxmoadg;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.zoijcleaow) {
            zoijcleaowVar = new ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg.C2492iobyxmoadg(((lqeggnwhkg.zoijcleaow) lqeggnwhkgVar).iobyxmoadg());
        } else {
            if (!(lqeggnwhkgVar instanceof lqeggnwhkg.ppxfxbqfkf)) {
                if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.wkgbmnqykc.f115063iobyxmoadg)) {
                    return ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc.zoijcleaow.f103016iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = new ru.myspar.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg.zoijcleaow(((lqeggnwhkg.ppxfxbqfkf) lqeggnwhkgVar).iobyxmoadg(), null);
        }
        return zoijcleaowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(ppxfxbqfkf ppxfxbqfkfVar, State state) {
        nufgyqmvbu.iobyxmoadg c2866zoijcleaow;
        String text;
        zdlpuopuiu.btonecajqb(state, "<this>");
        State.Content content = state.getContent();
        if (zdlpuopuiu.eablkybsjg(content, State.Content.Loading.f102952zdlpuopuiu)) {
            c2866zoijcleaow = nufgyqmvbu.iobyxmoadg.C2864iobyxmoadg.f115067iobyxmoadg;
        } else {
            if (content instanceof State.Content.Error) {
                c2866zoijcleaow = new nufgyqmvbu.iobyxmoadg.zoijcleaow.C2865iobyxmoadg(new x02.iobyxmoadg(((State.Content.Error) state.getContent()).getIsLoading(), true, x02.zoijcleaow.REFRESH), ((State.Content.Error) state.getContent()).getMessage());
            } else {
                if (!(content instanceof State.Content.Product)) {
                    throw new NoWhenBranchMatchedException();
                }
                c2866zoijcleaow = new nufgyqmvbu.iobyxmoadg.zoijcleaow.C2866zoijcleaow(new x02.ppxfxbqfkf(((State.Content.Product) state.getContent()).getProductName(), ((State.Content.Product) state.getContent()).getImageUrl(), ((State.Content.Product) state.getContent()).getRating(), ((State.Content.Product) state.getContent()).getComment(), (((State.Content.Product) state.getContent()).getIsLoading() || (state.getMessage() instanceof State.Message.Success)) ? false : true, null), new x02.iobyxmoadg(((State.Content.Product) state.getContent()).getIsLoading(), (((State.Content.Product) state.getContent()).getRating() == 0 || (state.getMessage() instanceof State.Message.Success)) ? false : true, x02.zoijcleaow.SEND_REVIEW));
            }
        }
        State.Message message = state.getMessage();
        if (message instanceof State.Message.Error.Init) {
            String message2 = ((State.Message.Error.Init) state.getMessage()).getMessage();
            if (message2 == null || (text = k30.draadjrbmk.wkgbmnqykc(message2)) == null) {
                text = ppxfxbqfkfVar.f115072btonecajqb.getString(l02.zoijcleaow.error_init_screen);
            }
        } else if (message instanceof State.Message.Error.Send) {
            text = ((State.Message.Error.Send) state.getMessage()).getText();
            if (text == null) {
                text = ppxfxbqfkfVar.f115072btonecajqb.getString(l02.zoijcleaow.error_submit_review);
            }
        } else if (message instanceof State.Message.Success) {
            text = ((State.Message.Success) state.getMessage()).getText();
        } else {
            if (message != null) {
                throw new NoWhenBranchMatchedException();
            }
            text = null;
        }
        return new nufgyqmvbu(c2866zoijcleaow, text);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f115074gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f115073draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.rate.rate_product.impl.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.rate.rate_product.impl.domain.store.eablkybsjg.iobyxmoadg.f102962iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(dxjokdxxww.iobyxmoadg.f115055iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.rate.rate_product.impl.domain.store.eablkybsjg.zoijcleaow.f102963iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(dxjokdxxww.zoijcleaow.f115056iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
