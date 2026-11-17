package ru.myspar.legacy.presentation.dialogs.emailverify;

import android.view.View;
import cb0.gxszxtbevo;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.ojitshcjhn;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((ojitshcjhn) binding.invoke()).f65852zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: cb0.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.dialogs.emailverify.wkgbmnqykc.nufgyqmvbu(this.f19518zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f88621iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ojitshcjhn binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65844dxjokdxxww.setText(model.iobyxmoadg());
    }
}
