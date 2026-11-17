package tm;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressListArgs;
import ru.myspar.address.api.model.AddressMapScreenArgs;
import ru.myspar.address.api.model.AddressMapScreenFlow;
import ru.myspar.address.api.model.AddressSearchArgs;
import ru.myspar.address.api.model.ShopSearchArgs;
import ru.myspar.address.impl.address_search.presentation.AddressSearchFragment;
import ru.myspar.address.impl.addresslist.presentation.AddressListFragment;
import ru.myspar.address.impl.map.presentation.AddressMapFragment;
import ru.myspar.address.impl.shop_search.presentation.ShopSearchFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg implements qm.iobyxmoadg {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f111049iobyxmoadg;

        static {
            int[] iArr = new int[rm.zoijcleaow.values().length];
            try {
                iArr[rm.zoijcleaow.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rm.zoijcleaow.PickUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f111049iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment agtfadlqog(ShopSearchArgs shopSearchArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return b40.iobyxmoadg.zoijcleaow(new ShopSearchFragment(), shopSearchArgs, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment draadjrbmk(AddressMapScreenArgs addressMapScreenArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return AddressMapFragment.INSTANCE.iobyxmoadg(addressMapScreenArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment gtknphoqwx(AddressListArgs addressListArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return AddressListFragment.INSTANCE.iobyxmoadg(addressListArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wflxmlrfwp(AddressSearchArgs addressSearchArgs, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return AddressSearchFragment.INSTANCE.iobyxmoadg(addressSearchArgs);
    }

    @Override // qm.iobyxmoadg
    public m9.wkgbmnqykc gxszxtbevo(final AddressListArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: tm.zoijcleaow
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return eablkybsjg.gtknphoqwx(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // qm.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg(final AddressMapScreenArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: tm.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return eablkybsjg.draadjrbmk(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // qm.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf(rm.wkgbmnqykc args) {
        AddressMapScreenFlow addressMapScreenFlowIobyxmoadg;
        zdlpuopuiu.btonecajqb(args, "args");
        if (args.iobyxmoadg()) {
            return gxszxtbevo(new AddressListArgs(args.zoijcleaow(), args.ppxfxbqfkf()));
        }
        int i13 = iobyxmoadg.f111049iobyxmoadg[args.zoijcleaow().ordinal()];
        if (i13 == 1) {
            addressMapScreenFlowIobyxmoadg = AddressMapScreenFlow.INSTANCE.iobyxmoadg();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            addressMapScreenFlowIobyxmoadg = AddressMapScreenFlow.INSTANCE.zoijcleaow();
        }
        return iobyxmoadg(new AddressMapScreenArgs(addressMapScreenFlowIobyxmoadg, rm.iobyxmoadg.CREATE_FIRST_ADDRESS, args.ppxfxbqfkf()));
    }

    @Override // qm.iobyxmoadg
    public m9.wkgbmnqykc wkgbmnqykc(final AddressSearchArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: tm.wkgbmnqykc
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return eablkybsjg.wflxmlrfwp(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // qm.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow(final ShopSearchArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: tm.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return eablkybsjg.agtfadlqog(args, (jyumaefscl) obj);
            }
        }, 3, null);
    }
}
