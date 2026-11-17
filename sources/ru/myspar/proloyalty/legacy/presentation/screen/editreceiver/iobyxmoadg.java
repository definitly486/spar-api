package ru.myspar.proloyalty.legacy.presentation.screen.editreceiver;

import androidx.lifecycle.pkzmftpjix;
import b61.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.domain.feature.editreceiver.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f96962btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96963gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f96962btonecajqb = new draadjrbmk() { // from class: ia1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f96963gtknphoqwx = new draadjrbmk() { // from class: ia1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b61.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        b61.wkgbmnqykc c0260wkgbmnqykc;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f96965iobyxmoadg)) {
            return b61.wkgbmnqykc.iobyxmoadg.f15405iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            c0260wkgbmnqykc = new b61.wkgbmnqykc.zoijcleaow(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2287ppxfxbqfkf) {
            c0260wkgbmnqykc = new b61.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2287ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc)) {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f96964iobyxmoadg)) {
                    return b61.wkgbmnqykc.eablkybsjg.f15404iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            c0260wkgbmnqykc = new b61.wkgbmnqykc.C0260wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        }
        return c0260wkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ia1.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new ia1.lqeggnwhkg(state.getFirstName(), state.getFirstNameError(), state.getLastName(), state.getLastNameError(), state.getPhone(), state.getPhoneError(), state.getSaveIsVisible(), state.getIsLoading());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96962btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96963gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(b61.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof b61.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((b61.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, b61.eablkybsjg.iobyxmoadg.f15370iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
