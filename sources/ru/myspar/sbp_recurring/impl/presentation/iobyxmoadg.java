package ru.myspar.sbp_recurring.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import m12.eablkybsjg;
import m12.lqeggnwhkg;
import ru.myspar.sbp_recurring.api.model.BankModel;
import ru.myspar.sbp_recurring.impl.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f103085btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f103086gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f103085btonecajqb = new draadjrbmk() { // from class: n12.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.sbp_recurring.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f103086gtknphoqwx = new draadjrbmk() { // from class: n12.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.sbp_recurring.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.sbp_recurring.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m12.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.C2494zoijcleaow) {
            return new m12.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2494zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f103090iobyxmoadg)) {
            return m12.wkgbmnqykc.iobyxmoadg.f64959iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f103091iobyxmoadg)) {
            return m12.wkgbmnqykc.ppxfxbqfkf.f64960iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n12.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        vdvldrhtss vdvldrhtssVarIobyxmoadg = state.getBanks().isEmpty() ? cqumvgiudr.iobyxmoadg(Integer.valueOf(k12.ppxfxbqfkf.title_payment_method_not_available), Integer.valueOf(k12.ppxfxbqfkf.sbp_payment_method_not_available_message)) : cqumvgiudr.iobyxmoadg(Integer.valueOf(k12.ppxfxbqfkf.sbp_select_bank_app_title), Integer.valueOf(k12.ppxfxbqfkf.sbp_select_bank_app_message));
        int iIntValue = ((Number) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).intValue();
        int iIntValue2 = ((Number) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).intValue();
        List banks = state.getBanks();
        List arrayList = new ArrayList(jyumaefscl.cqumvgiudr(banks, 10));
        Iterator it = banks.iterator();
        while (it.hasNext()) {
            arrayList.add(p12.zoijcleaow.iobyxmoadg((BankModel) it.next()));
        }
        if (arrayList.isEmpty()) {
            arrayList = jyumaefscl.eablkybsjg(p12.iobyxmoadg.zoijcleaow.f75407zdlpuopuiu);
        }
        return new n12.lqeggnwhkg(iIntValue, iIntValue2, arrayList);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f103085btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f103086gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f64952iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f103087iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.jyumaefscl(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
