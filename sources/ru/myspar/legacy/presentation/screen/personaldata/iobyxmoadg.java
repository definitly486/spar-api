package ru.myspar.legacy.presentation.screen.personaldata;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pm.dxjokdxxww;
import ru.myspar.domain.feature.personaldata.store.State;
import tg.draadjrbmk;
import u70.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f89362btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f89363draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f89364gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f89362btonecajqb = resourcesManager;
        this.f89364gtknphoqwx = new draadjrbmk() { // from class: qc0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.personaldata.iobyxmoadg.jlmebxxoox(this.f78498zdlpuopuiu, (State) obj);
            }
        };
        this.f89363draadjrbmk = new draadjrbmk() { // from class: qc0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.personaldata.iobyxmoadg.ntlheqmsrt(this.f78504zdlpuopuiu, (ru.myspar.legacy.presentation.screen.personaldata.ppxfxbqfkf) obj);
            }
        };
    }

    private final b10.iobyxmoadg crxdokpmqz(String str) {
        b10.iobyxmoadg iobyxmoadgVar = b10.iobyxmoadg.MALE;
        return (zdlpuopuiu.eablkybsjg(str, iobyxmoadgVar.wkgbmnqykc()) || zdlpuopuiu.eablkybsjg(str, this.f89362btonecajqb.getString(dxjokdxxww.male_gender_russian))) ? iobyxmoadgVar : b10.iobyxmoadg.FEMALE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qc0.dxjokdxxww jlmebxxoox(iobyxmoadg iobyxmoadgVar, State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new qc0.dxjokdxxww(state.getPhone(), state.getBirthDate(), state.getCardNumber(), iobyxmoadgVar.sopmlzcsov(state.getGender()), state.getFirstName(), state.getLastName(), state.getEmail(), state.getFirstNameError(), state.getLastNameError(), state.getEmailError(), state.getGenderError(), state.getIsEmailVerified(), state.getIsLoading());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u70.wkgbmnqykc ntlheqmsrt(iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f89368iobyxmoadg)) {
            return u70.wkgbmnqykc.gxszxtbevo.f112952iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f89373iobyxmoadg)) {
            return u70.wkgbmnqykc.iobyxmoadg.f112953iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.nufgyqmvbu.f89370iobyxmoadg)) {
            return u70.wkgbmnqykc.nufgyqmvbu.f112955iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.dxjokdxxww.f89365iobyxmoadg)) {
            return u70.wkgbmnqykc.dxjokdxxww.f112950iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f89367iobyxmoadg)) {
            return u70.wkgbmnqykc.lqeggnwhkg.f112954iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2046ppxfxbqfkf) {
            return new u70.wkgbmnqykc.zoijcleaow(((ppxfxbqfkf.C2046ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            return new u70.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.eablkybsjg) {
            return new u70.wkgbmnqykc.C2797wkgbmnqykc(iobyxmoadgVar.crxdokpmqz(((ppxfxbqfkf.eablkybsjg) ppxfxbqfkfVar).iobyxmoadg()));
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg) {
            return new u70.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.lqeggnwhkg) ppxfxbqfkfVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String sopmlzcsov(b10.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar == b10.iobyxmoadg.MALE ? this.f89362btonecajqb.getString(dxjokdxxww.male_gender_russian) : this.f89362btonecajqb.getString(dxjokdxxww.female_gender_russian);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89364gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89363draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(u70.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof u70.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((u70.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof u70.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((u70.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof u70.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz3 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((u70.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, u70.eablkybsjg.iobyxmoadg.f112900iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, u70.eablkybsjg.C2794eablkybsjg.f112899iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz4 = cllcsxoeiz(wkgbmnqykc.C2047wkgbmnqykc.f89378iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
