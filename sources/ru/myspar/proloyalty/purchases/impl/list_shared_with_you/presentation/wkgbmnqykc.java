package ru.myspar.proloyalty.purchases.impl.list_shared_with_you.presentation;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.aitsuki.swipe.SwipeLayout;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.zdlpuopuiu;
import ti1.nufgyqmvbu;
import yi1.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        yi1.zoijcleaow zoijcleaowVar = (yi1.zoijcleaow) binding.invoke();
        zoijcleaowVar.f125474ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: rj1.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.purchases.impl.list_shared_with_you.presentation.wkgbmnqykc.btonecajqb(this.f82938zdlpuopuiu, view);
            }
        });
        zoijcleaowVar.f125476zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: rj1.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.purchases.impl.list_shared_with_you.presentation.wkgbmnqykc.gtknphoqwx(this.f82937zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2396zoijcleaow.f99803iobyxmoadg);
    }

    private final int dxjokdxxww(boolean z13) {
        return z13 ? nufgyqmvbu.proloyalty_purchases_list_shared_with_you_message_when_feature_enabled : nufgyqmvbu.proloyalty_purchases_list_shared_with_you_message_when_feature_disabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f99802iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yi1.zoijcleaow binding, rj1.nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f125475wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.zoijcleaow());
        lqeggnwhkg lqeggnwhkgVar = binding.f125468eablkybsjg;
        SwipeLayout root = lqeggnwhkgVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
        lqeggnwhkgVar.f125431gxszxtbevo.setText(model.iobyxmoadg().getName());
        lqeggnwhkgVar.f125430eablkybsjg.setText(wkgbmnqykc().getResources().getQuantityString(ti1.lqeggnwhkg.plural_purchase_product, model.iobyxmoadg().getProductCount(), Integer.valueOf(model.iobyxmoadg().getProductCount())));
        LinearLayout containerWarning = binding.f125470gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(containerWarning, "containerWarning");
        containerWarning.setVisibility(model.wkgbmnqykc() ? 0 : 8);
        binding.f125467dxjokdxxww.setText(dxjokdxxww(model.ppxfxbqfkf()));
        MaterialButton btnSavePurchaseList = binding.f125474ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnSavePurchaseList, "btnSavePurchaseList");
        btnSavePurchaseList.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
    }
}
