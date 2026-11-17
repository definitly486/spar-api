package ru.myspar.rate.feedback.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.rate.feedback.impl.domain.store.State;
import tg.draadjrbmk;
import uz1.eablkybsjg;
import uz1.lqeggnwhkg;
import vz1.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final nz1.iobyxmoadg f102723btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f102724draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f102725gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, nz1.iobyxmoadg getDefaultFeedbackPhoneUseCase) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        this.f102723btonecajqb = getDefaultFeedbackPhoneUseCase;
        this.f102725gtknphoqwx = new draadjrbmk() { // from class: vz1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.rate.feedback.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f102724draadjrbmk = new draadjrbmk() { // from class: vz1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.rate.feedback.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.rate.feedback.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uz1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        uz1.wkgbmnqykc nufgyqmvbuVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2484zoijcleaow.f102742iobyxmoadg)) {
            return uz1.wkgbmnqykc.zoijcleaow.f114921iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f102737iobyxmoadg)) {
            return uz1.wkgbmnqykc.iobyxmoadg.f114916iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f102740iobyxmoadg)) {
            return uz1.wkgbmnqykc.ppxfxbqfkf.f114919iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f102741iobyxmoadg)) {
            return uz1.wkgbmnqykc.C2859wkgbmnqykc.f114920iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            nufgyqmvbuVar = new uz1.wkgbmnqykc.eablkybsjg(((zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
            nufgyqmvbuVar = new uz1.wkgbmnqykc.gxszxtbevo(((zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.lqeggnwhkg) {
            nufgyqmvbuVar = new uz1.wkgbmnqykc.lqeggnwhkg(((zoijcleaow.lqeggnwhkg) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.nufgyqmvbu)) {
                if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.dxjokdxxww.f102734iobyxmoadg)) {
                    return uz1.wkgbmnqykc.dxjokdxxww.f114913iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.btonecajqb.f102733iobyxmoadg)) {
                    return uz1.wkgbmnqykc.btonecajqb.f114912iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            nufgyqmvbuVar = new uz1.wkgbmnqykc.nufgyqmvbu(((zoijcleaow.nufgyqmvbu) zoijcleaowVar).iobyxmoadg());
        }
        return nufgyqmvbuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new dxjokdxxww(state.getPhone(), state.getUserName(), state.getReason(), state.getFileName(), !state.getReasonIsValid(), !state.getPhoneIsValid(), !state.getIsLoggedIn(), state.getIsLoading());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102725gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102724draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f114871iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f114874iobyxmoadg)) {
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f114872iobyxmoadg)) {
                    Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f102726iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.C2856eablkybsjg.f114869iobyxmoadg)) {
                    Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.C2483ppxfxbqfkf.f102727iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.gxszxtbevo.f114870iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz4 = cllcsxoeiz(ppxfxbqfkf.wkgbmnqykc.f102728iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(h40.dxjokdxxww.f39382iobyxmoadg.dxjokdxxww((String) this.f102723btonecajqb.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
