package kk;

import spay.sdk.domain.model.response.bnpl.ButtonBnpl;
import spay.sdk.view.BnplButtonCompositeView;
import spay.sdk.view.SpayBnplGraphCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class tzroggbefp implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ u00 f58733zdlpuopuiu;

    public tzroggbefp(u00 u00Var) {
        this.f58733zdlpuopuiu = u00Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        kn knVar = (kn) obj;
        ButtonBnpl buttonBnpl = knVar.f57330eablkybsjg;
        if (buttonBnpl != null) {
            this.f58733zdlpuopuiu.f58747ppxfxbqfkf.b(buttonBnpl);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(knVar.f57332ppxfxbqfkf, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
            ButtonBnpl buttonBnpl2 = knVar.f57330eablkybsjg;
            if (buttonBnpl2 != null) {
                BnplButtonCompositeView bnplButtonCompositeView = this.f58733zdlpuopuiu.f58747ppxfxbqfkf;
                String str = knVar.f57331iobyxmoadg;
                if (str == null) {
                    str = "";
                }
                bnplButtonCompositeView.a(str, buttonBnpl2);
            }
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(knVar.f57332ppxfxbqfkf, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false))) {
            ButtonBnpl buttonBnpl3 = knVar.f57330eablkybsjg;
            if (buttonBnpl3 != null) {
                this.f58733zdlpuopuiu.f58747ppxfxbqfkf.a(buttonBnpl3);
            }
        } else if (!knVar.f57333wkgbmnqykc) {
            this.f58733zdlpuopuiu.f58747ppxfxbqfkf.a();
            SpayBnplGraphCompositeView spaySloSbgcvGraph = this.f58733zdlpuopuiu.f58738btonecajqb;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySloSbgcvGraph, "spaySloSbgcvGraph");
            spaySloSbgcvGraph.setVisibility(8);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
