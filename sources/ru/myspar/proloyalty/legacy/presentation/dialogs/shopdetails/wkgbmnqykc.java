package ru.myspar.proloyalty.legacy.presentation.dialogs.shopdetails;

import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import f91.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import z41.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((vdvldrhtss) binding.invoke()).f128427zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: f91.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.dialogs.shopdetails.wkgbmnqykc.dxjokdxxww(this.f33342zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f96515iobyxmoadg);
    }

    private final void nufgyqmvbu(vdvldrhtss vdvldrhtssVar, String str) {
        MaterialTextView materialTextView = vdvldrhtssVar.f128420gtknphoqwx;
        materialTextView.setText(str);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(kcexrzcfyt.zfvoamnweg(str) ? 8 : 0);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(vdvldrhtss binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f128418dxjokdxxww.setText(model.zoijcleaow());
        nufgyqmvbu(binding, model.eablkybsjg());
        binding.f128424nufgyqmvbu.setText(model.ppxfxbqfkf());
        binding.f128416btonecajqb.setText(model.wkgbmnqykc());
        binding.f128427zoijcleaow.setText(model.iobyxmoadg());
    }
}
