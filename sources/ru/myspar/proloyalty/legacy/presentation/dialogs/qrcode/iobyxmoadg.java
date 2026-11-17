package ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode;

import androidx.lifecycle.pkzmftpjix;
import d91.nufgyqmvbu;
import gg.wwaezpbzkn;
import j61.eablkybsjg;
import j61.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.domain.feature.qrcode.store.State;
import ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode.models.QrcodeDialogButtonUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f96445btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96446gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f96445btonecajqb = new draadjrbmk() { // from class: d91.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f96446gtknphoqwx = new draadjrbmk() { // from class: d91.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j61.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f96456iobyxmoadg)) {
            return j61.wkgbmnqykc.iobyxmoadg.f50811iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2278zoijcleaow.f96457iobyxmoadg)) {
            return j61.wkgbmnqykc.zoijcleaow.f50812iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getTitle(), state.getDesc(), state.getQrCode(), state.getProductTitle(), state.getImage(), state.getProductPrice(), state.getOldPrice(), state.getButton() != null ? new QrcodeDialogButtonUiModel(state.getButton().getTitle(), state.getButton().getColorButton(), state.getButton().getColorText(), state.getButton().getNavLink(), state.getButton().getReference()) : null, state.getMeasure(), state.getUnit(), state.getUseUnit());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96445btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96446gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f50806iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f96452iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f50807iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f96453iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
