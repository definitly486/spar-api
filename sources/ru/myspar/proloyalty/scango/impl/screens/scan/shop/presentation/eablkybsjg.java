package ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.ui.platform.ComposeView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import kotlin.jvm.internal.zdlpuopuiu;
import np1.cdpycssgdh;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f101044jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f101044jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: np1.yadqdtsiqt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.eablkybsjg.ojitshcjhn(this.f70534zdlpuopuiu);
            }
        });
        go1.eablkybsjg eablkybsjgVar = (go1.eablkybsjg) binding.invoke();
        ComposeView cvActionBar = eablkybsjgVar.f38030zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, null, null, false, new tg.iobyxmoadg() { // from class: np1.iozdgvuglv
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.eablkybsjg.draadjrbmk(this.f70517zdlpuopuiu);
            }
        }, oipsdeybqn.dxjokdxxww(bfopjjpdmp.zoijcleaow(p41.ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykc(), b31.ppxfxbqfkf.colorTextStaticWhite1))), null, 79, null);
        eablkybsjgVar.f38029wkgbmnqykc.f38050ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: np1.lmojexxdyd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.eablkybsjg.wflxmlrfwp(this.f70522zdlpuopuiu, view);
            }
        });
        eablkybsjgVar.f38029wkgbmnqykc.f38052zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: np1.wwaezpbzkn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.eablkybsjg.agtfadlqog(this.f70533zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wflxmlrfwp.f101063iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f101065iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final ho1.zoijcleaow gtknphoqwx() {
        return (ho1.zoijcleaow) this.f101044jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho1.zoijcleaow ojitshcjhn(eablkybsjg eablkybsjgVar) {
        return new ho1.zoijcleaow(eablkybsjgVar.wkgbmnqykc());
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
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.ojitshcjhn.f101059iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(go1.eablkybsjg binding, cdpycssgdh model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        vdvldrhtss(model.ppxfxbqfkf());
        AppCompatImageButton btnToggleFlash = binding.f38029wkgbmnqykc.f38050ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnToggleFlash, "btnToggleFlash");
        btnToggleFlash.setVisibility(model.zoijcleaow() ? 0 : 8);
        binding.f38029wkgbmnqykc.f38050ppxfxbqfkf.setImageResource(model.iobyxmoadg());
    }
}
