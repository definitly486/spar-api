package ru.myspar.auth.impl.presentation.nonauthorized;

import androidx.lifecycle.pkzmftpjix;
import dp.eablkybsjg;
import dp.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pm.dxjokdxxww;
import ru.myspar.auth.api.model.AuthorizationArgs;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.auth.api.model.RegistrationVerificationArgs;
import ru.myspar.auth.impl.domain.nonauthorized.State;
import ru.myspar.core.ui.model.MainTab;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ro.iobyxmoadg f84637btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f84638draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f84639gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.nonauthorized.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1914iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f84640iobyxmoadg;

        static {
            int[] iArr = new int[NonAuthorizedPayload.zoijcleaow.values().length];
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.FAST_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.PROMO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.BUY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.FAVORITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.PROFILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.CATALOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.DEFAULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f84640iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ro.iobyxmoadg authFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        this.f84637btonecajqb = authFeatureApi;
        this.f84639gtknphoqwx = new draadjrbmk() { // from class: pp.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.nonauthorized.iobyxmoadg.crxdokpmqz((State) obj);
            }
        };
        this.f84638draadjrbmk = new draadjrbmk() { // from class: pp.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.nonauthorized.iobyxmoadg.ulzqkzuiru((ru.myspar.auth.impl.presentation.nonauthorized.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pp.lqeggnwhkg crxdokpmqz(State state) {
        int i13;
        zdlpuopuiu.btonecajqb(state, "<this>");
        switch (C1914iobyxmoadg.f84640iobyxmoadg[state.getErrorType().ordinal()]) {
            case 1:
                i13 = dxjokdxxww.non_authorized_fast_delivery;
                break;
            case 2:
                i13 = dxjokdxxww.non_authorized_promo_title;
                break;
            case 3:
                i13 = dxjokdxxww.non_authorized_buy_title;
                break;
            case 4:
                i13 = dxjokdxxww.non_authorized_favorite_title;
                break;
            case 5:
            case 6:
                i13 = s40.draadjrbmk.non_authorized_title;
                break;
            case 7:
                i13 = dxjokdxxww.unauthorized_error_message;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new pp.lqeggnwhkg(state.getIsLoading(), i13);
    }

    private final void ntlheqmsrt(NonAuthorizedPayload.zoijcleaow zoijcleaowVar) {
        int i13 = C1914iobyxmoadg.f84640iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 5) {
            d40.iobyxmoadg.f26931iobyxmoadg.yadqdtsiqt(MainTab.MY_SPAR, true);
        } else {
            if (i13 != 6) {
                return;
            }
            d40.iobyxmoadg.f26931iobyxmoadg.yadqdtsiqt(MainTab.CATALOG, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dp.wkgbmnqykc ulzqkzuiru(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f84641iobyxmoadg)) {
            return dp.wkgbmnqykc.iobyxmoadg.f29283iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f84643iobyxmoadg)) {
            return dp.wkgbmnqykc.zoijcleaow.f29285iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C1915ppxfxbqfkf.f84642iobyxmoadg)) {
            return dp.wkgbmnqykc.ppxfxbqfkf.f29284iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84639gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84638draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            ntlheqmsrt(((eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
        } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f29271iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
        } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f84637btonecajqb.eablkybsjg(new AuthorizationArgs(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg())));
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f84637btonecajqb.gxszxtbevo(new RegistrationVerificationArgs(null, ((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg(), 1, null)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
