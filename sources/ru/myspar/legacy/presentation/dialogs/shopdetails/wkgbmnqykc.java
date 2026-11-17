package ru.myspar.legacy.presentation.dialogs.shopdetails;

import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import gb0.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.jyumaefscl;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((jyumaefscl) binding.invoke()).f65681zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: gb0.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.dialogs.shopdetails.wkgbmnqykc.dxjokdxxww(this.f36742zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f88731iobyxmoadg);
    }

    private final void nufgyqmvbu(jyumaefscl jyumaefsclVar, String str) {
        MaterialTextView materialTextView = jyumaefsclVar.f65674gtknphoqwx;
        materialTextView.setText(str);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(kcexrzcfyt.zfvoamnweg(str) ? 8 : 0);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(jyumaefscl binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65672dxjokdxxww.setText(model.zoijcleaow());
        nufgyqmvbu(binding, model.eablkybsjg());
        binding.f65678nufgyqmvbu.setText(model.ppxfxbqfkf());
        binding.f65670btonecajqb.setText(model.wkgbmnqykc());
        binding.f65681zoijcleaow.setText(model.iobyxmoadg());
    }
}
