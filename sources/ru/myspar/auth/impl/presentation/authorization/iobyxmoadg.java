package ru.myspar.auth.impl.presentation.authorization;

import androidx.lifecycle.pkzmftpjix;
import ap.eablkybsjg;
import ap.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import kp.nufgyqmvbu;
import lg.gxszxtbevo;
import ru.myspar.auth.api.model.AuthBySmsArgs;
import ru.myspar.auth.api.model.RegistrationVerificationArgs;
import ru.myspar.auth.impl.domain.authorization.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ya2.iobyxmoadg f84553btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f84554draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f84555gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, ya2.iobyxmoadg webViewScreenFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(webViewScreenFeatureApi, "webViewScreenFeatureApi");
        this.f84553btonecajqb = webViewScreenFeatureApi;
        this.f84555gtknphoqwx = new draadjrbmk() { // from class: kp.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.authorization.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f84554draadjrbmk = new draadjrbmk() { // from class: kp.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.authorization.iobyxmoadg.ntlheqmsrt((ru.myspar.auth.impl.presentation.authorization.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ap.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        ap.wkgbmnqykc lqeggnwhkgVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f84558iobyxmoadg)) {
            return ap.wkgbmnqykc.iobyxmoadg.f14058iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C1912ppxfxbqfkf) {
            return ap.wkgbmnqykc.ppxfxbqfkf.f14060iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            lqeggnwhkgVar = new ap.wkgbmnqykc.zoijcleaow(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg)) {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f84557iobyxmoadg)) {
                    return ap.wkgbmnqykc.gxszxtbevo.f14057iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f84556iobyxmoadg)) {
                    return ap.wkgbmnqykc.eablkybsjg.f14056iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wkgbmnqykc.f84561iobyxmoadg)) {
                    return ap.wkgbmnqykc.C0215wkgbmnqykc.f14061iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            lqeggnwhkgVar = new ap.wkgbmnqykc.lqeggnwhkg(((ppxfxbqfkf.lqeggnwhkg) ppxfxbqfkfVar).iobyxmoadg());
        }
        return lqeggnwhkgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State authorizationStore$State) {
        zdlpuopuiu.btonecajqb(authorizationStore$State, "<this>");
        return new nufgyqmvbu(authorizationStore$State.getPhoneNumber(), authorizationStore$State.getPhoneNumberErrorIsVisible(), authorizationStore$State.getAgreementIsChecked(), authorizationStore$State.getAgreementErrorIsVisible(), authorizationStore$State.getShowAuthErrorDialog(), authorizationStore$State.getIsLoading());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84555gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84554draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.C0212eablkybsjg) {
            eablkybsjg.C0212eablkybsjg c0212eablkybsjg = (eablkybsjg.C0212eablkybsjg) eablkybsjgVar;
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.auth.impl.presentation.authbysms.zoijcleaow.zoijcleaow(new AuthBySmsArgs(c0212eablkybsjg.zoijcleaow(), c0212eablkybsjg.ppxfxbqfkf(), c0212eablkybsjg.iobyxmoadg())));
        } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (eablkybsjg.ppxfxbqfkf) eablkybsjgVar;
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.auth.impl.presentation.registrationverification.zoijcleaow.zoijcleaow(new RegistrationVerificationArgs(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow())));
        } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f14037iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f84553btonecajqb.zoijcleaow());
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f14033iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
