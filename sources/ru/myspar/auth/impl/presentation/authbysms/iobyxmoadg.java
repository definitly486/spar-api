package ru.myspar.auth.impl.presentation.authbysms;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hp.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.auth.impl.domain.authbysms.store.State;
import tg.draadjrbmk;
import zo.eablkybsjg;
import zo.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f84527btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f84528gtknphoqwx;

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.authbysms.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1910iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f84529iobyxmoadg;

        static {
            int[] iArr = new int[NonAuthorizedPayload.zoijcleaow.values().length];
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NonAuthorizedPayload.zoijcleaow.CATALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84529iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f84527btonecajqb = new draadjrbmk() { // from class: hp.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.authbysms.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f84528gtknphoqwx = new draadjrbmk() { // from class: hp.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.authbysms.iobyxmoadg.ntlheqmsrt((ru.myspar.auth.impl.presentation.authbysms.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zo.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zo.wkgbmnqykc eablkybsjgVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f84531iobyxmoadg)) {
            return zo.wkgbmnqykc.iobyxmoadg.f130600iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f84534iobyxmoadg)) {
            return zo.wkgbmnqykc.zoijcleaow.f130603iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C1911ppxfxbqfkf.f84532iobyxmoadg)) {
            return zo.wkgbmnqykc.ppxfxbqfkf.f130601iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            eablkybsjgVar = new zo.wkgbmnqykc.C3335wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            eablkybsjgVar = new zo.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        }
        return eablkybsjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new dxjokdxxww(state.getPhoneNumber(), state.getSmsCode(), state.getIsError(), state.getErrorText(), state.getTimerValue(), state.getContinueBtnIsEnabled(), state.getIsLoading());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84527btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84528gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f130535iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.wkgbmnqykc.f130537iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f84536iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
            if (zoijcleaowVar.zoijcleaow() != null) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().ppxfxbqfkf(zoijcleaowVar.zoijcleaow().getResultKey(), zoijcleaowVar.zoijcleaow());
            }
            NonAuthorizedPayload.zoijcleaow zoijcleaowVarIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            int i13 = zoijcleaowVarIobyxmoadg == null ? -1 : C1910iobyxmoadg.f84529iobyxmoadg[zoijcleaowVarIobyxmoadg.ordinal()];
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().gtknphoqwx(ru.myspar.auth.impl.presentation.nonauthorized.zoijcleaow.ppxfxbqfkf(null, 1, null), (i13 == 1 || i13 == 2) ? false : true);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
