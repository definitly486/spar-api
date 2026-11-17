package bp0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.CatalogArgs;
import ru.myspar.proloyalty.catalog.api.model.HintDialogArgs;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.catalog.impl.hint.dialog.presentation.HintDialogFragment;
import ru.myspar.proloyalty.catalog.impl.pager.presentation.CatalogPagerFragment;
import ru.myspar.proloyalty.catalog.impl.product_list.presentation.ProductListMviFragment;
import ru.myspar.proloyalty.catalog.impl.search.SearchFragment;
import ru.myspar.proloyalty.catalog.impl.specific_product.presentation.SpecificProductFragment;
import ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.SubCatalogFragment;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo implements xo0.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment agtfadlqog(CatalogArgs catalogArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return CatalogPagerFragment.INSTANCE.iobyxmoadg(catalogArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment ojitshcjhn(ProductListPayload productListPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return ProductListMviFragment.INSTANCE.iobyxmoadg(productListPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment oxmwwwfdhm(SubCatalogArgs subCatalogArgs, boolean z13, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SubCatalogFragment.INSTANCE.iobyxmoadg(subCatalogArgs, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment rgvfuqvkyq(SearchPayload searchPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SearchFragment.INSTANCE.iobyxmoadg(searchPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment vdvldrhtss(ProductPayload productPayload, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return SpecificProductFragment.INSTANCE.iobyxmoadg(productPayload);
    }

    @Override // xo0.iobyxmoadg
    public m9.wkgbmnqykc gxszxtbevo(final ProductPayload args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "SPECIFIC_PRODUCT_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: bp0.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.vdvldrhtss(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // xo0.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final SearchPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: bp0.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.rgvfuqvkyq(payload, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // xo0.iobyxmoadg
    public BaseMviBottomSheetDialogFragment lqeggnwhkg(HintDialogArgs args, tg.iobyxmoadg navLinkClickCallback) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(navLinkClickCallback, "navLinkClickCallback");
        return HintDialogFragment.INSTANCE.iobyxmoadg(args, navLinkClickCallback);
    }

    @Override // xo0.iobyxmoadg
    public m9.wkgbmnqykc nufgyqmvbu(final ProductListPayload args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "PRODUCT_LIST_PAGER_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: bp0.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.ojitshcjhn(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // xo0.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf(final SubCatalogArgs args, final boolean z13) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "SUB_CATALOG_PAGER_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: bp0.wkgbmnqykc
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.oxmwwwfdhm(args, z13, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // xo0.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final CatalogArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "CATALOG_PAGER_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: bp0.eablkybsjg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.agtfadlqog(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }
}
