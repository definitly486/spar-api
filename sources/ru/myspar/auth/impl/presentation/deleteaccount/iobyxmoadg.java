package ru.myspar.auth.impl.presentation.deleteaccount;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import np.wflxmlrfwp;
import ru.myspar.auth.impl.domain.deleteaccount.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f84591btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f84592draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f84593gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(bp.zoijcleaow store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f84591btonecajqb = resourcesManager;
        this.f84593gtknphoqwx = new draadjrbmk() { // from class: np.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.deleteaccount.iobyxmoadg.sopmlzcsov(this.f70480zdlpuopuiu, (State) obj);
            }
        };
        this.f84592draadjrbmk = new draadjrbmk() { // from class: np.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.deleteaccount.iobyxmoadg.ntlheqmsrt((ru.myspar.auth.impl.presentation.deleteaccount.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf eablkybsjgVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f84595iobyxmoadg)) {
            return ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.iobyxmoadg.f84466iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C1913ppxfxbqfkf.f84596iobyxmoadg)) {
            return ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.C1908ppxfxbqfkf.f84467iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f84598iobyxmoadg)) {
            return ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.zoijcleaow.f84469iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            eablkybsjgVar = new ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            eablkybsjgVar = new ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.eablkybsjg(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg());
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
        String string = iobyxmoadgVar.f84591btonecajqb.getString(uo.wkgbmnqykc.delete_account_sms_repeat_hint, state.getTimerValue());
        if (state.getTimerValue().length() <= 0) {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        return new wflxmlrfwp(phoneNumber, null, smsFieldIsVisible, smsErrorIsVisible, z13, string, state.getSmsRepeatRequestIsVisible(), buttonTitleRes, hintRes, 2, null);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84593gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84592draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.iobyxmoadg) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (!(wkgbmnqykcVar instanceof ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.C1909wkgbmnqykc)) {
                if (wkgbmnqykcVar instanceof ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.zoijcleaow) {
                    Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (wkgbmnqykcVar instanceof ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.ppxfxbqfkf) {
                    Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
                    return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!(wkgbmnqykcVar instanceof ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.eablkybsjg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.ppxfxbqfkf.f84600iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.auth.impl.presentation.deleteaccountfinish.iobyxmoadg.zoijcleaow());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
