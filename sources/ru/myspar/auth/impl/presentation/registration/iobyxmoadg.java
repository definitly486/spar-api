package ru.myspar.auth.impl.presentation.registration;

import androidx.lifecycle.pkzmftpjix;
import ep.lqeggnwhkg;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import rp.gtknphoqwx;
import ru.myspar.auth.impl.domain.registration.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final nz1.iobyxmoadg f84676btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f84677draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f84678gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, nz1.iobyxmoadg getDefaultFeedbackPhoneUseCase) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        this.f84676btonecajqb = getDefaultFeedbackPhoneUseCase;
        this.f84678gtknphoqwx = new draadjrbmk() { // from class: rp.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registration.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f84677draadjrbmk = new draadjrbmk() { // from class: rp.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registration.iobyxmoadg.ntlheqmsrt((ru.myspar.auth.impl.presentation.registration.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ep.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        ep.wkgbmnqykc oxmwwwfdhmVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f84696iobyxmoadg)) {
            return ep.wkgbmnqykc.zoijcleaow.f31737iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f84686iobyxmoadg)) {
            return ep.wkgbmnqykc.iobyxmoadg.f31727iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C1916ppxfxbqfkf) {
            oxmwwwfdhmVar = new ep.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C1916ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            oxmwwwfdhmVar = new ep.wkgbmnqykc.C0683wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f84683iobyxmoadg)) {
                return ep.wkgbmnqykc.eablkybsjg.f31724iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f84685iobyxmoadg)) {
                return ep.wkgbmnqykc.gxszxtbevo.f31726iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg) {
                oxmwwwfdhmVar = new ep.wkgbmnqykc.lqeggnwhkg(((ppxfxbqfkf.lqeggnwhkg) ppxfxbqfkfVar).iobyxmoadg());
            } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.nufgyqmvbu) {
                oxmwwwfdhmVar = new ep.wkgbmnqykc.nufgyqmvbu(((ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg());
            } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.dxjokdxxww) {
                oxmwwwfdhmVar = new ep.wkgbmnqykc.dxjokdxxww(((ppxfxbqfkf.dxjokdxxww) ppxfxbqfkfVar).iobyxmoadg());
            } else {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.btonecajqb.f84680iobyxmoadg)) {
                    return ep.wkgbmnqykc.btonecajqb.f31721iobyxmoadg;
                }
                if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gtknphoqwx) {
                    oxmwwwfdhmVar = new ep.wkgbmnqykc.gtknphoqwx(((ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar).iobyxmoadg());
                } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.draadjrbmk) {
                    oxmwwwfdhmVar = new ep.wkgbmnqykc.draadjrbmk(((ppxfxbqfkf.draadjrbmk) ppxfxbqfkfVar).iobyxmoadg());
                } else {
                    if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wflxmlrfwp.f84694iobyxmoadg)) {
                        return ep.wkgbmnqykc.wflxmlrfwp.f31735iobyxmoadg;
                    }
                    if (ppxfxbqfkfVar instanceof ppxfxbqfkf.agtfadlqog) {
                        oxmwwwfdhmVar = new ep.wkgbmnqykc.agtfadlqog(((ppxfxbqfkf.agtfadlqog) ppxfxbqfkfVar).iobyxmoadg());
                    } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.ojitshcjhn) {
                        oxmwwwfdhmVar = new ep.wkgbmnqykc.ojitshcjhn(((ppxfxbqfkf.ojitshcjhn) ppxfxbqfkfVar).iobyxmoadg());
                    } else {
                        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.rgvfuqvkyq.f84692iobyxmoadg)) {
                            return ep.wkgbmnqykc.rgvfuqvkyq.f31733iobyxmoadg;
                        }
                        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.vdvldrhtss) {
                            oxmwwwfdhmVar = new ep.wkgbmnqykc.vdvldrhtss(((ppxfxbqfkf.vdvldrhtss) ppxfxbqfkfVar).iobyxmoadg());
                        } else {
                            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.oxmwwwfdhm)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oxmwwwfdhmVar = new ep.wkgbmnqykc.oxmwwwfdhm(((ppxfxbqfkf.oxmwwwfdhm) ppxfxbqfkfVar).iobyxmoadg());
                        }
                    }
                }
            }
        }
        return oxmwwwfdhmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gtknphoqwx sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new gtknphoqwx(state.getSmsCode(), state.getFirstName(), state.getLastName(), state.getGender(), state.getBirthDate(), state.getIsCardActivateNeeded(), state.getCardNumber(), state.getIsPolicyAccepted(), state.getSharePromo(), state.getPhoneNumber(), state.getEmail(), state.getSmsCodeError(), state.getFirstNameError(), state.getLastNameError(), state.getGenderError(), state.getBirthDateError(), state.getCardNumberError(), state.getCardNumberIsVisible(), state.getCardOptionsIsVisible(), state.getCardExistCaptionIsVisible(), state.getCardRegistrationCaptionIsVisible(), state.getHasPromo(), state.getIsLoading());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84678gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84677draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ep.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof ep.eablkybsjg.lqeggnwhkg) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.gxszxtbevo(((ep.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ep.eablkybsjg.iobyxmoadg.f31672iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ep.eablkybsjg.zoijcleaow.f31678iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f84701iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, ep.eablkybsjg.ppxfxbqfkf.f31675iobyxmoadg)) {
                if (eablkybsjgVar instanceof ep.eablkybsjg.wkgbmnqykc) {
                    Object objCllcsxoeiz3 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((ep.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ep.eablkybsjg.C0680eablkybsjg) {
                    Object objCllcsxoeiz4 = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((ep.eablkybsjg.C0680eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ep.eablkybsjg.gxszxtbevo.f31671iobyxmoadg)) {
                    Object objCllcsxoeiz5 = cllcsxoeiz(wkgbmnqykc.C1917wkgbmnqykc.f84704iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ep.eablkybsjg.dxjokdxxww.f31668iobyxmoadg)) {
                    Object objCllcsxoeiz6 = cllcsxoeiz(wkgbmnqykc.lqeggnwhkg.f84702iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ep.eablkybsjg.btonecajqb.f31667iobyxmoadg)) {
                    Object objCllcsxoeiz7 = cllcsxoeiz(wkgbmnqykc.dxjokdxxww.f84698iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (eablkybsjgVar instanceof ep.eablkybsjg.gtknphoqwx) {
                    Object objCllcsxoeiz8 = cllcsxoeiz(new wkgbmnqykc.btonecajqb(((ep.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!(eablkybsjgVar instanceof ep.eablkybsjg.nufgyqmvbu)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz9 = cllcsxoeiz(new wkgbmnqykc.eablkybsjg(((ep.eablkybsjg.nufgyqmvbu) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.dxjokdxxww((String) this.f84676btonecajqb.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
