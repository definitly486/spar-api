package ru.myspar.legacy.presentation.screen.scanproduct;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.jpowsppfya;
import md0.jyumaefscl;
import md0.kcexrzcfyt;
import s40.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        jpowsppfya jpowsppfyaVar = (jpowsppfya) binding.invoke();
        ComposeView cvActionBar = jpowsppfyaVar.f65659wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        jyumaefscl.zoijcleaow(cvActionBar);
        jpowsppfyaVar.f65660zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: md0.zdlpuopuiu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.scanproduct.eablkybsjg.dxjokdxxww(this.f66864zdlpuopuiu, view);
            }
        });
        jpowsppfyaVar.f65658ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: md0.yggfygwlhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.scanproduct.eablkybsjg.btonecajqb(this.f66863zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.lqeggnwhkg.f89660iobyxmoadg);
    }

    private final void draadjrbmk(jpowsppfya jpowsppfyaVar, boolean z13) {
        jpowsppfyaVar.f65658ppxfxbqfkf.setImageResource(z13 ? gxszxtbevo.ic_flash_on : gxszxtbevo.ic_flash_off);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f89659iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(jpowsppfya binding, kcexrzcfyt model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        AppCompatImageView btnToggleFlash = binding.f65658ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnToggleFlash, "btnToggleFlash");
        btnToggleFlash.setVisibility(model.zoijcleaow() ? 0 : 8);
        draadjrbmk(binding, model.iobyxmoadg());
    }
}
