package ru.myspar.proloyalty.auth.impl.presentation.deleteaccount;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pn0.wflxmlrfwp;
import ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f92584btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f92585draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f92586gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(fn0.zoijcleaow store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f92584btonecajqb = resourcesManager;
        this.f92586gtknphoqwx = new draadjrbmk() { // from class: pn0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.iobyxmoadg.sopmlzcsov(this.f77004zdlpuopuiu, (State) obj);
            }
        };
        this.f92585draadjrbmk = new draadjrbmk() { // from class: pn0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf eablkybsjgVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f92588iobyxmoadg)) {
            return ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.iobyxmoadg.f92483iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2156ppxfxbqfkf.f92589iobyxmoadg)) {
            return ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.C2151ppxfxbqfkf.f92484iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f92591iobyxmoadg)) {
            return ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.zoijcleaow.f92486iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            eablkybsjgVar = new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            eablkybsjgVar = new ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
        }
        return eablkybsjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wflxmlrfwp sopmlzcsov(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        String phoneNumber = state.getPhoneNumber();
        boolean smsFieldIsVisible = state.getSmsFieldIsVisible();
        boolean smsErrorIsVisible = state.getSmsErrorIsVisible();
        int buttonTitleRes = state.getButtonTitleRes();
        int hintRes = state.getHintRes();
        boolean z13 = state.getTimerValue().length() > 0;
        String string = iobyxmoadgVar.f92584btonecajqb.getString(bn0.eablkybsjg.proloyalty_delete_account_sms_repeat_hint, state.getTimerValue());
        if (state.getTimerValue().length() <= 0) {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        return new wflxmlrfwp(phoneNumber, state.getSmsCode(), smsFieldIsVisible, smsErrorIsVisible, z13, string, state.getSmsRepeatRequestIsVisible(), buttonTitleRes, hintRes);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f92586gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f92585draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.iobyxmoadg) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.ppxfxbqfkf) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(wkgbmnqykcVar instanceof ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.wkgbmnqykc.C2152wkgbmnqykc)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.ppxfxbqfkf.f92593iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
