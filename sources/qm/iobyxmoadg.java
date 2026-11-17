package qm;

import m9.wkgbmnqykc;
import ru.myspar.address.api.model.AddressListArgs;
import ru.myspar.address.api.model.AddressMapScreenArgs;
import ru.myspar.address.api.model.AddressSearchArgs;
import ru.myspar.address.api.model.ShopSearchArgs;

/* JADX INFO: loaded from: classes3.dex */
public interface iobyxmoadg {
    static /* synthetic */ wkgbmnqykc eablkybsjg(iobyxmoadg iobyxmoadgVar, AddressListArgs addressListArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addressListScreen");
        }
        if ((i13 & 1) != 0) {
            addressListArgs = new AddressListArgs(null, false, 3, null);
        }
        return iobyxmoadgVar.gxszxtbevo(addressListArgs);
    }

    wkgbmnqykc gxszxtbevo(AddressListArgs addressListArgs);

    wkgbmnqykc iobyxmoadg(AddressMapScreenArgs addressMapScreenArgs);

    wkgbmnqykc ppxfxbqfkf(rm.wkgbmnqykc wkgbmnqykcVar);

    wkgbmnqykc wkgbmnqykc(AddressSearchArgs addressSearchArgs);

    wkgbmnqykc zoijcleaow(ShopSearchArgs shopSearchArgs);
}
