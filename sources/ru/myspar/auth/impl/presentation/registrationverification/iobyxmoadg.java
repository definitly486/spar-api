package ru.myspar.auth.impl.presentation.registrationverification;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import gp.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.auth.api.model.AuthorizationArgs;
import ru.myspar.auth.impl.domain.registrationverification.store.State;
import sp.dxjokdxxww;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final nz1.iobyxmoadg f84734btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f84735draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f84736gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(nz1.iobyxmoadg getDefaultFeedbackPhoneUseCase, lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f84734btonecajqb = getDefaultFeedbackPhoneUseCase;
        this.f84736gtknphoqwx = new draadjrbmk() { // from class: sp.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registrationverification.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f84735draadjrbmk = new draadjrbmk() { // from class: sp.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registrationverification.iobyxmoadg.ntlheqmsrt((ru.myspar.auth.impl.presentation.registrationverification.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gp.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        gp.wkgbmnqykc gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f84739iobyxmoadg)) {
            return gp.wkgbmnqykc.iobyxmoadg.f38160iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f84742iobyxmoadg)) {
            return gp.wkgbmnqykc.zoijcleaow.f38163iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C1918ppxfxbqfkf.f84740iobyxmoadg)) {
            return gp.wkgbmnqykc.ppxfxbqfkf.f38161iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            gxszxtbevoVar = new gp.wkgbmnqykc.C0866wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f84737iobyxmoadg)) {
                return gp.wkgbmnqykc.eablkybsjg.f38158iobyxmoadg;
            }
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo)) {
                throw new NoWhenBranchMatchedException();
            }
            gxszxtbevoVar = new gp.wkgbmnqykc.gxszxtbevo(((ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        }
        return gxszxtbevoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new dxjokdxxww(state.getPhoneNumber(), null, state.getIsLoading(), state.getPhoneNumberErrorIsVisible(), state.getEmailError(), 2, null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84736gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84735draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(gp.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof gp.eablkybsjg.C0864eablkybsjg) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((gp.eablkybsjg.C0864eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, gp.eablkybsjg.iobyxmoadg.f38131iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, gp.eablkybsjg.zoijcleaow.f38135iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.dxjokdxxww((String) this.f84734btonecajqb.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
        } else if (eablkybsjgVar instanceof gp.eablkybsjg.ppxfxbqfkf) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().btonecajqb(ru.myspar.auth.impl.presentation.authorization.zoijcleaow.zoijcleaow(new AuthorizationArgs(((gp.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg(), null, 2, null)));
        } else {
            if (!(eablkybsjgVar instanceof gp.eablkybsjg.wkgbmnqykc)) {
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, gp.eablkybsjg.gxszxtbevo.f38130iobyxmoadg)) {
                    Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f84745iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, gp.eablkybsjg.lqeggnwhkg.f38132iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.ppxfxbqfkf.f84744iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.auth.impl.presentation.registration.zoijcleaow.zoijcleaow(((gp.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
