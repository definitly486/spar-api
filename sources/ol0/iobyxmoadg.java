package ol0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pl0.wkgbmnqykc;
import ru.myspar.proloyalty.address.impl.addresslist.store.State;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: ol0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1596iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f73158iobyxmoadg;

        static {
            int[] iArr = new int[cl0.zoijcleaow.values().length];
            try {
                iArr[cl0.zoijcleaow.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cl0.zoijcleaow.PickUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f73158iobyxmoadg = iArr;
        }
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc invoke(State state) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(state, "state");
        boolean isLoading = state.getIsLoading();
        cl0.zoijcleaow currentAddressType = state.getCurrentAddressType();
        int i13 = C1596iobyxmoadg.f73158iobyxmoadg[state.getCurrentAddressType().ordinal()];
        if (i13 == 1) {
            List deliveryAddresses = state.getDeliveryAddresses();
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(deliveryAddresses, 10));
            Iterator it = deliveryAddresses.iterator();
            while (it.hasNext()) {
                arrayList.add(zoijcleaow.ppxfxbqfkf((UserAddress.Delivery) it.next(), state.getSelectedAddressId()));
            }
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List pickUpAddresses = state.getPickUpAddresses();
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(pickUpAddresses, 10));
            Iterator it2 = pickUpAddresses.iterator();
            while (it2.hasNext()) {
                arrayList.add(zoijcleaow.wkgbmnqykc((UserAddress.PickUp) it2.next(), state.getSelectedAddressId()));
            }
        }
        return new wkgbmnqykc(isLoading, currentAddressType, arrayList, state.getTypeSelectionEnable());
    }
}
