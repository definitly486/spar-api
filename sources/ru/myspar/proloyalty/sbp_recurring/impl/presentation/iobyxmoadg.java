package ru.myspar.proloyalty.sbp_recurring.impl.presentation;

import androidx.lifecycle.pkzmftpjix;
import dn1.eablkybsjg;
import dn1.lqeggnwhkg;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import m21.dxjokdxxww;
import ru.myspar.proloyalty.sbp_recurring.api.model.BankModel;
import ru.myspar.proloyalty.sbp_recurring.impl.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f100373btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f100374gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f100373btonecajqb = new draadjrbmk() { // from class: en1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.sbp_recurring.impl.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f100374gtknphoqwx = new draadjrbmk() { // from class: en1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.sbp_recurring.impl.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.sbp_recurring.impl.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dn1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.C2412zoijcleaow) {
            return new dn1.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2412zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f100378iobyxmoadg)) {
            return dn1.wkgbmnqykc.iobyxmoadg.f29254iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f100379iobyxmoadg)) {
            return dn1.wkgbmnqykc.ppxfxbqfkf.f29255iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final en1.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        vdvldrhtss vdvldrhtssVarIobyxmoadg = state.getBanks().isEmpty() ? cqumvgiudr.iobyxmoadg(Integer.valueOf(bn1.ppxfxbqfkf.proloyalty_title_payment_method_not_available), Integer.valueOf(bn1.ppxfxbqfkf.proloyalty_sbp_payment_method_not_available_message)) : cqumvgiudr.iobyxmoadg(Integer.valueOf(bn1.ppxfxbqfkf.proloyalty_sbp_select_bank_app_title), Integer.valueOf(bn1.ppxfxbqfkf.proloyalty_sbp_select_bank_app_message));
        int iIntValue = ((Number) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).intValue();
        int iIntValue2 = ((Number) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).intValue();
        List banks = state.getBanks();
        List arrayList = new ArrayList(jyumaefscl.cqumvgiudr(banks, 10));
        Iterator it = banks.iterator();
        while (it.hasNext()) {
            arrayList.add(gn1.zoijcleaow.iobyxmoadg((BankModel) it.next()));
        }
        if (arrayList.isEmpty()) {
            arrayList = jyumaefscl.eablkybsjg(gn1.iobyxmoadg.zoijcleaow.f37982zdlpuopuiu);
        }
        return new en1.lqeggnwhkg(iIntValue, iIntValue2, arrayList);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f100373btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f100374gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f29247iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f100375iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
