package pk0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m9.ppxfxbqfkf;
import m9.wkgbmnqykc;
import ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;
import ru.myspar.products_from_banner.impl.presentation.product_set.ProductsFromBannerFragment;
import ru.myspar.products_from_banner.impl.presentation.product_set_counter.ProductSetCounterDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static final wkgbmnqykc ppxfxbqfkf(final ProductsFromBannerScreenArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return wkgbmnqykc.iobyxmoadg.zoijcleaow(wkgbmnqykc.f66572zoijcleaow, "PRODUCTS_FROM_BANNER_FRAGMENT_KEY", false, new ppxfxbqfkf() { // from class: pk0.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return zoijcleaow.wkgbmnqykc(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(ProductsFromBannerScreenArgs productsFromBannerScreenArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return ProductsFromBannerFragment.INSTANCE.iobyxmoadg(productsFromBannerScreenArgs);
    }

    public static final BaseBottomSheetDialogFragment zoijcleaow(ProductSetCounterArgs arguments, draadjrbmk onChangeCountListener) {
        zdlpuopuiu.btonecajqb(arguments, "arguments");
        zdlpuopuiu.btonecajqb(onChangeCountListener, "onChangeCountListener");
        return ProductSetCounterDialogFragment.INSTANCE.iobyxmoadg(arguments).bfopjjpdmp(onChangeCountListener);
    }
}
