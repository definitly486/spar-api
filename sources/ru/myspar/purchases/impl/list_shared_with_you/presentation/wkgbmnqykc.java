package ru.myspar.purchases.impl.list_shared_with_you.presentation;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.aitsuki.swipe.SwipeLayout;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.zdlpuopuiu;
import nx1.nufgyqmvbu;
import sx1.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        sx1.zoijcleaow zoijcleaowVar = (sx1.zoijcleaow) binding.invoke();
        zoijcleaowVar.f108703ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ly1.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.purchases.impl.list_shared_with_you.presentation.wkgbmnqykc.btonecajqb(this.f64531zdlpuopuiu, view);
            }
        });
        zoijcleaowVar.f108705zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ly1.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.purchases.impl.list_shared_with_you.presentation.wkgbmnqykc.gtknphoqwx(this.f64530zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2478zoijcleaow.f102517iobyxmoadg);
    }

    private final int dxjokdxxww(boolean z13) {
        return z13 ? nufgyqmvbu.purchases_list_shared_with_you_message_when_feature_enabled : nufgyqmvbu.purchases_list_shared_with_you_message_when_feature_disabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f102516iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(sx1.zoijcleaow binding, ly1.nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f108704wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.zoijcleaow());
        lqeggnwhkg lqeggnwhkgVar = binding.f108697eablkybsjg;
        SwipeLayout root = lqeggnwhkgVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
        lqeggnwhkgVar.f108660gxszxtbevo.setText(model.iobyxmoadg().getName());
        lqeggnwhkgVar.f108659eablkybsjg.setText(wkgbmnqykc().getResources().getQuantityString(nx1.lqeggnwhkg.plural_purchase_product, model.iobyxmoadg().getProductCount(), Integer.valueOf(model.iobyxmoadg().getProductCount())));
        LinearLayout containerWarning = binding.f108699gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(containerWarning, "containerWarning");
        containerWarning.setVisibility(model.wkgbmnqykc() ? 0 : 8);
        binding.f108696dxjokdxxww.setText(dxjokdxxww(model.ppxfxbqfkf()));
        MaterialButton btnSavePurchaseList = binding.f108703ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnSavePurchaseList, "btnSavePurchaseList");
        btnSavePurchaseList.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
    }
}
