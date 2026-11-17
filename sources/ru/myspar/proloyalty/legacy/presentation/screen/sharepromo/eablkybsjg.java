package ru.myspar.proloyalty.legacy.presentation.screen.sharepromo;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import jb1.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;
import vk0.lqeggnwhkg;
import z41.iozdgvuglv;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f97321jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f97321jyumaefscl = draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: jb1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.sharepromo.eablkybsjg.kcexrzcfyt(this.f51054zdlpuopuiu);
            }
        });
        iozdgvuglv iozdgvuglvVar = (iozdgvuglv) binding.invoke();
        iozdgvuglvVar.f128112zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: jb1.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.sharepromo.eablkybsjg.agtfadlqog(this.f51052zdlpuopuiu, view);
            }
        });
        iozdgvuglvVar.f128108lqeggnwhkg.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: jb1.gtknphoqwx
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.proloyalty.legacy.presentation.screen.sharepromo.eablkybsjg.ojitshcjhn(this.f51055iobyxmoadg);
            }
        });
        ComposeView cvActionBar = iozdgvuglvVar.f128104eablkybsjg;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, null, null, false, new tg.iobyxmoadg() { // from class: jb1.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.sharepromo.eablkybsjg.rgvfuqvkyq(this.f51053zdlpuopuiu);
            }
        }, null, null, 111, null);
        iozdgvuglvVar.f128110ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: jb1.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.sharepromo.eablkybsjg.vdvldrhtss(this.f51062zdlpuopuiu, view);
            }
        });
        iozdgvuglvVar.f128103dxjokdxxww.setOnClickListener(new View.OnClickListener() { // from class: jb1.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.sharepromo.eablkybsjg.oxmwwwfdhm(this.f51051zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.C2297ppxfxbqfkf.f97326iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String kcexrzcfyt(eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.wkgbmnqykc().getString(lqeggnwhkg.proloyalty_learn_more_link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f97324iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(eablkybsjgVar.wflxmlrfwp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f97325iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f97328iobyxmoadg);
    }

    private final String wflxmlrfwp() {
        return (String) this.f97321jyumaefscl.getValue();
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(iozdgvuglv binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f128108lqeggnwhkg.setRefreshing(model.wkgbmnqykc());
        ConstraintLayout contentContainer = binding.f128111wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(contentContainer, "contentContainer");
        contentContainer.setVisibility(!model.wkgbmnqykc() ? 0 : 8);
        AppCompatImageView ivBanner = binding.f128106gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(ivBanner, "ivBanner");
        p41.eablkybsjg.zoijcleaow(ivBanner, model.iobyxmoadg());
        binding.f128102draadjrbmk.setText(t1.zoijcleaow.iobyxmoadg(model.ppxfxbqfkf(), 0, null, null));
        binding.f128101btonecajqb.setText(model.zoijcleaow());
    }
}
