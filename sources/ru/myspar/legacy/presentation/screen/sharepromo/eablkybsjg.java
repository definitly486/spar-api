package ru.myspar.legacy.presentation.screen.sharepromo;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.hkdspvbjdz;
import nd0.nufgyqmvbu;
import pm.dxjokdxxww;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f89691jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f89691jyumaefscl = draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: nd0.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.sharepromo.eablkybsjg.kcexrzcfyt(this.f69755zdlpuopuiu);
            }
        });
        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) binding.invoke();
        hkdspvbjdzVar.f65562zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: nd0.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.sharepromo.eablkybsjg.agtfadlqog(this.f69753zdlpuopuiu, view);
            }
        });
        hkdspvbjdzVar.f65558lqeggnwhkg.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: nd0.gtknphoqwx
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.legacy.presentation.screen.sharepromo.eablkybsjg.ojitshcjhn(this.f69756iobyxmoadg);
            }
        });
        ComposeView cvActionBar = hkdspvbjdzVar.f65554eablkybsjg;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, null, null, false, new tg.iobyxmoadg() { // from class: nd0.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.sharepromo.eablkybsjg.rgvfuqvkyq(this.f69754zdlpuopuiu);
            }
        }, null, null, 111, null);
        hkdspvbjdzVar.f65560ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: nd0.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.sharepromo.eablkybsjg.vdvldrhtss(this.f69763zdlpuopuiu, view);
            }
        });
        hkdspvbjdzVar.f65553dxjokdxxww.setOnClickListener(new View.OnClickListener() { // from class: nd0.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.sharepromo.eablkybsjg.oxmwwwfdhm(this.f69752zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.C2057ppxfxbqfkf.f89696iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String kcexrzcfyt(eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.wkgbmnqykc().getString(dxjokdxxww.learn_more_link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f89694iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(eablkybsjgVar.wflxmlrfwp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f89695iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f89698iobyxmoadg);
    }

    private final String wflxmlrfwp() {
        return (String) this.f89691jyumaefscl.getValue();
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(hkdspvbjdz binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65558lqeggnwhkg.setRefreshing(model.wkgbmnqykc());
        ConstraintLayout contentContainer = binding.f65561wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(contentContainer, "contentContainer");
        contentContainer.setVisibility(!model.wkgbmnqykc() ? 0 : 8);
        AppCompatImageView ivBanner = binding.f65556gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(ivBanner, "ivBanner");
        c60.wkgbmnqykc.zoijcleaow(ivBanner, model.iobyxmoadg());
        binding.f65552draadjrbmk.setText(t1.zoijcleaow.iobyxmoadg(model.ppxfxbqfkf(), 0, null, null));
        binding.f65551btonecajqb.setText(model.zoijcleaow());
    }
}
