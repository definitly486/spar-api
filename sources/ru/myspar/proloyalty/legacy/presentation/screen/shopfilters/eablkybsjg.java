package ru.myspar.proloyalty.legacy.presentation.screen.shopfilters;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.button.MaterialButton;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import vk0.lqeggnwhkg;
import z41.lmojexxdyd;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f97350jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f97350jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: kb1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.eablkybsjg.draadjrbmk(this.f54402zdlpuopuiu);
            }
        });
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) binding.invoke();
        ComposeView cvActionBar = lmojexxdydVar.f128235wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(lqeggnwhkg.proloyalty_title_filters);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: kb1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.eablkybsjg.ojitshcjhn(this.f54395zdlpuopuiu);
            }
        }, null, null, 109, null);
        lmojexxdydVar.f128236zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kb1.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.eablkybsjg.rgvfuqvkyq(this.f54393zdlpuopuiu, view);
            }
        });
        lmojexxdydVar.f128232eablkybsjg.setLayoutManager(new FlexboxLayoutManager(wkgbmnqykc()));
        RecyclerView rvFilters = lmojexxdydVar.f128232eablkybsjg;
        zdlpuopuiu.dxjokdxxww(rvFilters, "rvFilters");
        r41.zoijcleaow.ppxfxbqfkf(rvFilters, agtfadlqog(), lmojexxdydVar);
    }

    private final lb1.ppxfxbqfkf agtfadlqog() {
        return (lb1.ppxfxbqfkf) this.f97350jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lb1.ppxfxbqfkf draadjrbmk(final eablkybsjg eablkybsjgVar) {
        return new lb1.ppxfxbqfkf(new tg.draadjrbmk() { // from class: kb1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.eablkybsjg.wflxmlrfwp(this.f54394zdlpuopuiu, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f97355iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(lmojexxdyd lmojexxdydVar, kb1.lqeggnwhkg lqeggnwhkgVar) {
        MaterialButton btnClearFilters = lmojexxdydVar.f128236zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnClearFilters, "btnClearFilters");
        btnClearFilters.setVisibility(!lqeggnwhkgVar.iobyxmoadg().isEmpty() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f97357iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar, String serviceName) {
        zdlpuopuiu.btonecajqb(serviceName, "serviceName");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2299ppxfxbqfkf(serviceName));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(final lmojexxdyd binding, final kb1.lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f128234ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.zoijcleaow());
        agtfadlqog().eablkybsjg(model.iobyxmoadg(), new Runnable() { // from class: kb1.gtknphoqwx
            @Override // java.lang.Runnable
            public final void run() {
                ru.myspar.proloyalty.legacy.presentation.screen.shopfilters.eablkybsjg.oxmwwwfdhm(binding, model);
            }
        });
    }
}
