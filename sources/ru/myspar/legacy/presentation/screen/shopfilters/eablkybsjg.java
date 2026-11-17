package ru.myspar.legacy.presentation.screen.shopfilters;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.button.MaterialButton;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.cllcsxoeiz;
import od0.lqeggnwhkg;
import pm.dxjokdxxww;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f89720jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f89720jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: od0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.shopfilters.eablkybsjg.draadjrbmk(this.f72624zdlpuopuiu);
            }
        });
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) binding.invoke();
        ComposeView cvActionBar = cllcsxoeizVar.f65411wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(dxjokdxxww.title_filters);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: od0.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.shopfilters.eablkybsjg.ojitshcjhn(this.f72617zdlpuopuiu);
            }
        }, null, null, 109, null);
        cllcsxoeizVar.f65412zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: od0.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.shopfilters.eablkybsjg.rgvfuqvkyq(this.f72615zdlpuopuiu, view);
            }
        });
        cllcsxoeizVar.f65408eablkybsjg.setLayoutManager(new FlexboxLayoutManager(wkgbmnqykc()));
        RecyclerView rvFilters = cllcsxoeizVar.f65408eablkybsjg;
        zdlpuopuiu.dxjokdxxww(rvFilters, "rvFilters");
        e60.zoijcleaow.ppxfxbqfkf(rvFilters, agtfadlqog(), cllcsxoeizVar);
    }

    private final pd0.ppxfxbqfkf agtfadlqog() {
        return (pd0.ppxfxbqfkf) this.f89720jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pd0.ppxfxbqfkf draadjrbmk(final eablkybsjg eablkybsjgVar) {
        return new pd0.ppxfxbqfkf(new tg.draadjrbmk() { // from class: od0.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.shopfilters.eablkybsjg.wflxmlrfwp(this.f72616zdlpuopuiu, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f89725iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(cllcsxoeiz cllcsxoeizVar, lqeggnwhkg lqeggnwhkgVar) {
        MaterialButton btnClearFilters = cllcsxoeizVar.f65412zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnClearFilters, "btnClearFilters");
        btnClearFilters.setVisibility(!lqeggnwhkgVar.iobyxmoadg().isEmpty() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f89727iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar, String serviceName) {
        zdlpuopuiu.btonecajqb(serviceName, "serviceName");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2059ppxfxbqfkf(serviceName));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(final cllcsxoeiz binding, final lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f65410ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.zoijcleaow());
        agtfadlqog().eablkybsjg(model.iobyxmoadg(), new Runnable() { // from class: od0.gtknphoqwx
            @Override // java.lang.Runnable
            public final void run() {
                ru.myspar.legacy.presentation.screen.shopfilters.eablkybsjg.oxmwwwfdhm(binding, model);
            }
        });
    }
}
