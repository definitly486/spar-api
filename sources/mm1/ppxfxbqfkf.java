package mm1;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f67521btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f67522draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f67523gtknphoqwx;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f67524iobyxmoadg;

        static {
            int[] iArr = new int[om1.zoijcleaow.values().length];
            try {
                iArr[om1.zoijcleaow.SEND_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[om1.zoijcleaow.REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67524iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ru.myspar.proloyalty.rate.rate_product.impl.domain.store.lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f67521btonecajqb = resourcesManager;
        this.f67523gtknphoqwx = new draadjrbmk() { // from class: mm1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov(this.f67509zdlpuopuiu, (State) obj);
            }
        };
        this.f67522draadjrbmk = new draadjrbmk() { // from class: mm1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc ntlheqmsrt(lqeggnwhkg lqeggnwhkgVar) {
        ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc zoijcleaowVar;
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (lqeggnwhkgVar instanceof lqeggnwhkg.iobyxmoadg) {
            int i13 = iobyxmoadg.f67524iobyxmoadg[((lqeggnwhkg.iobyxmoadg) lqeggnwhkgVar).iobyxmoadg().ordinal()];
            if (i13 == 1) {
                return ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.C2411wkgbmnqykc.f100303iobyxmoadg;
            }
            if (i13 == 2) {
                return ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f100302iobyxmoadg;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.zoijcleaow) {
            zoijcleaowVar = new ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg.C2410iobyxmoadg(((lqeggnwhkg.zoijcleaow) lqeggnwhkgVar).iobyxmoadg());
        } else {
            if (!(lqeggnwhkgVar instanceof lqeggnwhkg.ppxfxbqfkf)) {
                if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.wkgbmnqykc.f67512iobyxmoadg)) {
                    return ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.zoijcleaow.f100304iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = new ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg.zoijcleaow(((lqeggnwhkg.ppxfxbqfkf) lqeggnwhkgVar).iobyxmoadg(), null);
        }
        return zoijcleaowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(ppxfxbqfkf ppxfxbqfkfVar, State state) {
        nufgyqmvbu.iobyxmoadg c1397zoijcleaow;
        String text;
        zdlpuopuiu.btonecajqb(state, "<this>");
        State.Content content = state.getContent();
        if (zdlpuopuiu.eablkybsjg(content, State.Content.Loading.f100240zdlpuopuiu)) {
            c1397zoijcleaow = nufgyqmvbu.iobyxmoadg.C1395iobyxmoadg.f67516iobyxmoadg;
        } else {
            if (content instanceof State.Content.Error) {
                c1397zoijcleaow = new nufgyqmvbu.iobyxmoadg.zoijcleaow.C1396iobyxmoadg(new om1.iobyxmoadg(((State.Content.Error) state.getContent()).getIsLoading(), true, om1.zoijcleaow.REFRESH), ((State.Content.Error) state.getContent()).getMessage());
            } else {
                if (!(content instanceof State.Content.Product)) {
                    throw new NoWhenBranchMatchedException();
                }
                c1397zoijcleaow = new nufgyqmvbu.iobyxmoadg.zoijcleaow.C1397zoijcleaow(new om1.ppxfxbqfkf(((State.Content.Product) state.getContent()).getProductName(), ((State.Content.Product) state.getContent()).getImageUrl(), ((State.Content.Product) state.getContent()).getRating(), ((State.Content.Product) state.getContent()).getComment(), (((State.Content.Product) state.getContent()).getIsLoading() || (state.getMessage() instanceof State.Message.Success)) ? false : true, null), new om1.iobyxmoadg(((State.Content.Product) state.getContent()).getIsLoading(), (((State.Content.Product) state.getContent()).getRating() == 0 || (state.getMessage() instanceof State.Message.Success)) ? false : true, om1.zoijcleaow.SEND_REVIEW));
            }
        }
        State.Message message = state.getMessage();
        if (message instanceof State.Message.Error.Init) {
            String message2 = ((State.Message.Error.Init) state.getMessage()).getMessage();
            if (message2 == null || (text = q11.dxjokdxxww.wkgbmnqykc(message2)) == null) {
                text = ppxfxbqfkfVar.f67521btonecajqb.getString(cm1.zoijcleaow.proloyalty_error_init_screen);
            }
        } else if (message instanceof State.Message.Error.Send) {
            text = ((State.Message.Error.Send) state.getMessage()).getText();
            if (text == null) {
                text = ppxfxbqfkfVar.f67521btonecajqb.getString(cm1.zoijcleaow.proloyalty_error_submit_review);
            }
        } else if (message instanceof State.Message.Success) {
            text = ((State.Message.Success) state.getMessage()).getText();
        } else {
            if (message != null) {
                throw new NoWhenBranchMatchedException();
            }
            text = null;
        }
        return new nufgyqmvbu(c1397zoijcleaow, text);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f67523gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f67522draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.rate.rate_product.impl.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.rate.rate_product.impl.domain.store.eablkybsjg.iobyxmoadg.f100250iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(dxjokdxxww.iobyxmoadg.f67504iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.rate.rate_product.impl.domain.store.eablkybsjg.zoijcleaow.f100251iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(dxjokdxxww.zoijcleaow.f67505iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
