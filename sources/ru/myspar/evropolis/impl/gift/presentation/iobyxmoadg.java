package ru.myspar.evropolis.impl.gift.presentation;

import aa0.eablkybsjg;
import aa0.lqeggnwhkg;
import androidx.lifecycle.pkzmftpjix;
import ca0.btonecajqb;
import ca0.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.evropolis.impl.gift.domain.mvi.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final draadjrbmk f88324agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final btonecajqb f88325btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final qm.iobyxmoadg f88326draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ro.iobyxmoadg f88327gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f88328wflxmlrfwp;

    /* JADX INFO: renamed from: ru.myspar.evropolis.impl.gift.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    /* synthetic */ class C2024iobyxmoadg extends vdvldrhtss implements draadjrbmk {
        C2024iobyxmoadg(Object obj) {
            super(1, obj, btonecajqb.class, "map", "map(Lru/myspar/evropolis/impl/gift/domain/mvi/EvropolisDialogStore$State;)Lru/myspar/evropolis/impl/gift/presentation/EvropolisDialogView$Model;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final gtknphoqwx invoke(State p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ((btonecajqb) this.receiver).ppxfxbqfkf(p13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, btonecajqb uiMapper, ro.iobyxmoadg authFeatureApi, qm.iobyxmoadg addressFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(uiMapper, "uiMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        this.f88325btonecajqb = uiMapper;
        this.f88327gtknphoqwx = authFeatureApi;
        this.f88326draadjrbmk = addressFeatureApi;
        this.f88328wflxmlrfwp = new C2024iobyxmoadg(uiMapper);
        this.f88324agtfadlqog = new draadjrbmk() { // from class: ca0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.evropolis.impl.gift.presentation.iobyxmoadg.mbcevpiqjq((ru.myspar.evropolis.impl.gift.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aa0.wkgbmnqykc mbcevpiqjq(zoijcleaow zoijcleaowVar) {
        aa0.wkgbmnqykc iobyxmoadgVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2026zoijcleaow.f88349iobyxmoadg)) {
            return aa0.wkgbmnqykc.zoijcleaow.f1246iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.eablkybsjg.f88344iobyxmoadg)) {
            return aa0.wkgbmnqykc.eablkybsjg.f1241iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            iobyxmoadgVar = new aa0.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f88348iobyxmoadg)) {
                return aa0.wkgbmnqykc.C0023wkgbmnqykc.f1245iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
                iobyxmoadgVar = new aa0.wkgbmnqykc.gxszxtbevo(((zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadgVar = new aa0.wkgbmnqykc.iobyxmoadg(((zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg());
            }
        }
        return iobyxmoadgVar;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f88328wflxmlrfwp;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f88324agtfadlqog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f88336iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.ppxfxbqfkf.f1210iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f88327gtknphoqwx.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.C0021eablkybsjg) {
                Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.wkgbmnqykc(((eablkybsjg.C0021eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.gxszxtbevo) {
                eablkybsjg.gxszxtbevo gxszxtbevoVar2 = (eablkybsjg.gxszxtbevo) eablkybsjgVar;
                Object objCllcsxoeiz4 = cllcsxoeiz(new ppxfxbqfkf.C2025ppxfxbqfkf(gxszxtbevoVar2.zoijcleaow(), gxszxtbevoVar2.iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.lqeggnwhkg) {
                Object objCllcsxoeiz5 = cllcsxoeiz(new ppxfxbqfkf.eablkybsjg(((eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.nufgyqmvbu.f1209iobyxmoadg)) {
                Object objCllcsxoeiz6 = cllcsxoeiz(ppxfxbqfkf.gxszxtbevo.f88330iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.dxjokdxxww.f1203iobyxmoadg)) {
                Object objCllcsxoeiz7 = cllcsxoeiz(ppxfxbqfkf.lqeggnwhkg.f88332iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (!(eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f88326draadjrbmk.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg())));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
