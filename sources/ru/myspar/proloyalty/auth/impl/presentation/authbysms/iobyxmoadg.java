package ru.myspar.proloyalty.auth.impl.presentation.authbysms;

import androidx.lifecycle.pkzmftpjix;
import dn0.eablkybsjg;
import dn0.lqeggnwhkg;
import gg.wwaezpbzkn;
import jn0.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.auth.api.model.RegistrationArgs;
import ru.myspar.proloyalty.auth.impl.domain.authbysms.store.State;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f92523btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f92524gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f92523btonecajqb = new draadjrbmk() { // from class: jn0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.auth.impl.presentation.authbysms.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f92524gtknphoqwx = new draadjrbmk() { // from class: jn0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.auth.impl.presentation.authbysms.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.auth.impl.presentation.authbysms.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dn0.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        dn0.wkgbmnqykc gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f92530iobyxmoadg)) {
            return dn0.wkgbmnqykc.zoijcleaow.f29246iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2153ppxfxbqfkf.f92528iobyxmoadg)) {
            return dn0.wkgbmnqykc.ppxfxbqfkf.f29244iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wkgbmnqykc.f92529iobyxmoadg)) {
            return dn0.wkgbmnqykc.C0591wkgbmnqykc.f29245iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg) {
            gxszxtbevoVar = new dn0.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo)) {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f92527iobyxmoadg)) {
                    return dn0.wkgbmnqykc.iobyxmoadg.f29243iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            gxszxtbevoVar = new dn0.wkgbmnqykc.gxszxtbevo(((ppxfxbqfkf.gxszxtbevo) ppxfxbqfkfVar).iobyxmoadg());
        }
        return gxszxtbevoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new dxjokdxxww(state.getPhoneNumber(), state.getSmsCode(), state.getSmsCodeInputEnabled(), state.getSmsInputError(), state.getTimerValue(), state.getIsResendSmsButtonEnabled(), state.getIsAcceptButtonEnabled() && !state.getSmsInputError(), state.getIsLoading());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f92523btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f92524gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f29183iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f29187iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.yadqdtsiqt(MainTab.MY_SPAR, true);
        } else {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.C0584eablkybsjg.f29182iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f92532iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.auth.impl.presentation.registration.zoijcleaow.zoijcleaow(new RegistrationArgs(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg())));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
