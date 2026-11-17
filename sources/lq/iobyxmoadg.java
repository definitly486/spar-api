package lq;

import m9.wkgbmnqykc;
import ru.myspar.catalog.api.model.CatalogArgs;
import ru.myspar.catalog.api.model.HintDialogArgs;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SearchPayload;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C1312iobyxmoadg f63845iobyxmoadg = C1312iobyxmoadg.f63846iobyxmoadg;

    /* JADX INFO: renamed from: lq.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1312iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ C1312iobyxmoadg f63846iobyxmoadg = new C1312iobyxmoadg();

        private C1312iobyxmoadg() {
        }
    }

    static /* synthetic */ wkgbmnqykc iobyxmoadg(iobyxmoadg iobyxmoadgVar, SubCatalogArgs subCatalogArgs, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subCatalog");
        }
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return iobyxmoadgVar.nufgyqmvbu(subCatalogArgs, z13);
    }

    static /* synthetic */ wkgbmnqykc ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, CatalogArgs catalogArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pager");
        }
        if ((i13 & 1) != 0) {
            catalogArgs = new CatalogArgs(null, null, 3, null);
        }
        return iobyxmoadgVar.eablkybsjg(catalogArgs);
    }

    wkgbmnqykc eablkybsjg(CatalogArgs catalogArgs);

    wkgbmnqykc gxszxtbevo(ProductPayload productPayload);

    wkgbmnqykc lqeggnwhkg(ProductListPayload productListPayload);

    wkgbmnqykc nufgyqmvbu(SubCatalogArgs subCatalogArgs, boolean z13);

    wkgbmnqykc wkgbmnqykc(SearchPayload searchPayload);

    BaseMviBottomSheetDialogFragment zoijcleaow(HintDialogArgs hintDialogArgs);
}
