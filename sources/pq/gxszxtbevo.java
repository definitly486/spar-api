package pq;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.api.model.CatalogArgs;
import ru.myspar.catalog.api.model.HintDialogArgs;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SearchPayload;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.catalog.impl.hint.dialog.presentation.HintDialogFragment;
import ru.myspar.catalog.impl.pager.presentation.CatalogPagerFragment;
import ru.myspar.catalog.impl.product_list.presentation.ProductListMviFragment;
import ru.myspar.catalog.impl.search.SearchFragment;
import ru.myspar.catalog.impl.specific_product.presentation.SpecificProductFragment;
import ru.myspar.catalog.impl.subcatalog.presentation.SubCatalogFragment;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo implements lq.iobyxmoadg {
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

    @Override // lq.iobyxmoadg
    public m9.wkgbmnqykc eablkybsjg(final CatalogArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "CATALOG_PAGER_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: pq.eablkybsjg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.agtfadlqog(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // lq.iobyxmoadg
    public m9.wkgbmnqykc gxszxtbevo(final ProductPayload args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "SPECIFIC_PRODUCT_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: pq.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.vdvldrhtss(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // lq.iobyxmoadg
    public m9.wkgbmnqykc lqeggnwhkg(final ProductListPayload args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "PRODUCT_LIST_PAGER_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: pq.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.ojitshcjhn(args, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // lq.iobyxmoadg
    public m9.wkgbmnqykc nufgyqmvbu(final SubCatalogArgs args, final boolean z13) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, "SUB_CATALOG_PAGER_SCREEN_KEY", false, new m9.ppxfxbqfkf() { // from class: pq.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.oxmwwwfdhm(args, z13, (jyumaefscl) obj);
            }
        }, 2, null);
    }

    @Override // lq.iobyxmoadg
    public m9.wkgbmnqykc wkgbmnqykc(final SearchPayload payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: pq.wkgbmnqykc
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return gxszxtbevo.rgvfuqvkyq(payload, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // lq.iobyxmoadg
    public BaseMviBottomSheetDialogFragment zoijcleaow(HintDialogArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return HintDialogFragment.INSTANCE.iobyxmoadg(args);
    }
}
