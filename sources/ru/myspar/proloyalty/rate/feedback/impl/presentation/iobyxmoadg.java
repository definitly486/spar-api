package ru.myspar.proloyalty.rate.feedback.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ll1.eablkybsjg;
import ll1.lqeggnwhkg;
import m21.dxjokdxxww;
import ml1.btonecajqb;
import ru.myspar.proloyalty.rate.feedback.impl.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final el1.iobyxmoadg f100011btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f100012draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f100013gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, el1.iobyxmoadg getDefaultFeedbackPhoneUseCase) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        this.f100011btonecajqb = getDefaultFeedbackPhoneUseCase;
        this.f100013gtknphoqwx = new draadjrbmk() { // from class: ml1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.rate.feedback.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f100012draadjrbmk = new draadjrbmk() { // from class: ml1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.rate.feedback.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.rate.feedback.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ll1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        ll1.wkgbmnqykc nufgyqmvbuVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2402zoijcleaow.f100030iobyxmoadg)) {
            return ll1.wkgbmnqykc.zoijcleaow.f63406iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f100025iobyxmoadg)) {
            return ll1.wkgbmnqykc.iobyxmoadg.f63401iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f100028iobyxmoadg)) {
            return ll1.wkgbmnqykc.ppxfxbqfkf.f63404iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f100029iobyxmoadg)) {
            return ll1.wkgbmnqykc.C1292wkgbmnqykc.f63405iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.eablkybsjg) {
            nufgyqmvbuVar = new ll1.wkgbmnqykc.eablkybsjg(((zoijcleaow.eablkybsjg) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
            nufgyqmvbuVar = new ll1.wkgbmnqykc.gxszxtbevo(((zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
        } else if (zoijcleaowVar instanceof zoijcleaow.lqeggnwhkg) {
            nufgyqmvbuVar = new ll1.wkgbmnqykc.lqeggnwhkg(((zoijcleaow.lqeggnwhkg) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.nufgyqmvbu)) {
                if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.dxjokdxxww.f100022iobyxmoadg)) {
                    return ll1.wkgbmnqykc.dxjokdxxww.f63398iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.btonecajqb.f100021iobyxmoadg)) {
                    return ll1.wkgbmnqykc.btonecajqb.f63397iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            nufgyqmvbuVar = new ll1.wkgbmnqykc.nufgyqmvbu(((zoijcleaow.nufgyqmvbu) zoijcleaowVar).iobyxmoadg());
        }
        return nufgyqmvbuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final btonecajqb sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new btonecajqb(state.getPhone(), state.getUserName(), state.getReason(), state.getFileName(), !state.getReasonIsValid(), !state.getPhoneIsValid(), !state.getIsLoggedIn(), state.getIsLoading());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f100013gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f100012draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f63356iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f63359iobyxmoadg)) {
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f63357iobyxmoadg)) {
                    Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f100014iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.C1289eablkybsjg.f63354iobyxmoadg)) {
                    Object objCllcsxoeiz3 = cllcsxoeiz(ppxfxbqfkf.C2401ppxfxbqfkf.f100015iobyxmoadg, gxszxtbevoVar);
                    return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.gxszxtbevo.f63355iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz4 = cllcsxoeiz(ppxfxbqfkf.wkgbmnqykc.f100016iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.dxjokdxxww((String) this.f100011btonecajqb.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
