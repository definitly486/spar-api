package ru.myspar.scango.impl.screens.scan.shop.presentation;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.ui.platform.ComposeView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import kotlin.jvm.internal.zdlpuopuiu;
import r32.cdpycssgdh;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f103701jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f103701jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: r32.yadqdtsiqt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.scan.shop.presentation.eablkybsjg.ojitshcjhn(this.f81604zdlpuopuiu);
            }
        });
        k22.eablkybsjg eablkybsjgVar = (k22.eablkybsjg) binding.invoke();
        ComposeView cvActionBar = eablkybsjgVar.f53563zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, null, null, false, new tg.iobyxmoadg() { // from class: r32.iozdgvuglv
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.scan.shop.presentation.eablkybsjg.draadjrbmk(this.f81588zdlpuopuiu);
            }
        }, oipsdeybqn.dxjokdxxww(bfopjjpdmp.zoijcleaow(c60.zoijcleaow.ppxfxbqfkf(wkgbmnqykc(), s40.ppxfxbqfkf.colorTextStaticWhite1))), null, 79, null);
        eablkybsjgVar.f53562wkgbmnqykc.f53583ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: r32.lmojexxdyd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.scango.impl.screens.scan.shop.presentation.eablkybsjg.wflxmlrfwp(this.f81593zdlpuopuiu, view);
            }
        });
        eablkybsjgVar.f53562wkgbmnqykc.f53585zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: r32.wwaezpbzkn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.scango.impl.screens.scan.shop.presentation.eablkybsjg.agtfadlqog(this.f81603zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wflxmlrfwp.f103720iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f103722iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final l22.zoijcleaow gtknphoqwx() {
        return (l22.zoijcleaow) this.f103701jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l22.zoijcleaow ojitshcjhn(eablkybsjg eablkybsjgVar) {
        return new l22.zoijcleaow(eablkybsjgVar.wkgbmnqykc());
    }

    private final void vdvldrhtss(boolean z13) {
        if (z13) {
            gtknphoqwx().show();
        } else {
            gtknphoqwx().dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.ojitshcjhn.f103716iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(k22.eablkybsjg binding, cdpycssgdh model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        vdvldrhtss(model.ppxfxbqfkf());
        AppCompatImageButton btnToggleFlash = binding.f53562wkgbmnqykc.f53583ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnToggleFlash, "btnToggleFlash");
        btnToggleFlash.setVisibility(model.zoijcleaow() ? 0 : 8);
        binding.f53562wkgbmnqykc.f53583ppxfxbqfkf.setImageResource(model.iobyxmoadg());
    }
}
