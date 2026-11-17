package xo0;

import m9.wkgbmnqykc;
import ru.myspar.proloyalty.catalog.api.model.CatalogArgs;
import ru.myspar.proloyalty.catalog.api.model.HintDialogArgs;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C3102iobyxmoadg f122961iobyxmoadg = C3102iobyxmoadg.f122962iobyxmoadg;

    /* JADX INFO: renamed from: xo0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3102iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ C3102iobyxmoadg f122962iobyxmoadg = new C3102iobyxmoadg();

        private C3102iobyxmoadg() {
        }
    }

    static /* synthetic */ wkgbmnqykc eablkybsjg(iobyxmoadg iobyxmoadgVar, SubCatalogArgs subCatalogArgs, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subCatalog");
        }
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return iobyxmoadgVar.ppxfxbqfkf(subCatalogArgs, z13);
    }

    static /* synthetic */ wkgbmnqykc wkgbmnqykc(iobyxmoadg iobyxmoadgVar, CatalogArgs catalogArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pager");
        }
        if ((i13 & 1) != 0) {
            catalogArgs = new CatalogArgs(null, null, 3, null);
        }
        return iobyxmoadgVar.zoijcleaow(catalogArgs);
    }

    wkgbmnqykc gxszxtbevo(ProductPayload productPayload);

    wkgbmnqykc iobyxmoadg(SearchPayload searchPayload);

    BaseMviBottomSheetDialogFragment lqeggnwhkg(HintDialogArgs hintDialogArgs, tg.iobyxmoadg iobyxmoadgVar);

    wkgbmnqykc nufgyqmvbu(ProductListPayload productListPayload);

    wkgbmnqykc ppxfxbqfkf(SubCatalogArgs subCatalogArgs, boolean z13);

    wkgbmnqykc zoijcleaow(CatalogArgs catalogArgs);
}
