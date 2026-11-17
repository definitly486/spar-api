package bl0;

import m9.wkgbmnqykc;
import ru.myspar.proloyalty.address.api.model.AddressListArgs;
import ru.myspar.proloyalty.address.api.model.AddressMapScreenArgs;
import ru.myspar.proloyalty.address.api.model.AddressSearchArgs;
import ru.myspar.proloyalty.address.api.model.ShopSearchArgs;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {
    static /* synthetic */ wkgbmnqykc iobyxmoadg(iobyxmoadg iobyxmoadgVar, AddressListArgs addressListArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addressListScreen");
        }
        if ((i13 & 1) != 0) {
            addressListArgs = new AddressListArgs(null, false, 3, null);
        }
        return iobyxmoadgVar.eablkybsjg(addressListArgs);
    }

    wkgbmnqykc eablkybsjg(AddressListArgs addressListArgs);

    wkgbmnqykc gxszxtbevo(ShopSearchArgs shopSearchArgs);

    wkgbmnqykc ppxfxbqfkf(cl0.wkgbmnqykc wkgbmnqykcVar);

    wkgbmnqykc wkgbmnqykc(AddressSearchArgs addressSearchArgs);

    wkgbmnqykc zoijcleaow(AddressMapScreenArgs addressMapScreenArgs);
}
