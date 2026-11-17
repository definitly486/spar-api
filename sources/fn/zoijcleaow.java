package fn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.impl.addresslist.store.State;
import ru.myspar.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements a8.ppxfxbqfkf {
    private final State ppxfxbqfkf(State state, gxszxtbevo.zoijcleaow zoijcleaowVar) {
        List pickUpAddresses = state.getPickUpAddresses();
        ArrayList arrayList = new ArrayList();
        for (Object obj : pickUpAddresses) {
            if (!zdlpuopuiu.eablkybsjg(((UserAddress.PickUp) obj).ppxfxbqfkf(), zoijcleaowVar.iobyxmoadg())) {
                arrayList.add(obj);
            }
        }
        return State.ppxfxbqfkf(state, false, null, arrayList, null, null, false, 59, null);
    }

    private final String zoijcleaow(List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((UserAddress) next).getIsSelected());
        UserAddress userAddress = (UserAddress) next;
        if (userAddress != null) {
            return userAddress.getShopId();
        }
        return null;
    }

    @Override // a8.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public State iobyxmoadg(State state, gxszxtbevo msg) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        zdlpuopuiu.btonecajqb(msg, "msg");
        if (msg instanceof gxszxtbevo.eablkybsjg) {
            return State.ppxfxbqfkf(state, ((gxszxtbevo.eablkybsjg) msg).iobyxmoadg(), null, null, null, null, false, 62, null);
        }
        if (msg instanceof gxszxtbevo.wkgbmnqykc) {
            gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = (gxszxtbevo.wkgbmnqykc) msg;
            String strZoijcleaow = zoijcleaow(wkgbmnqykcVar.iobyxmoadg());
            if (strZoijcleaow == null) {
                strZoijcleaow = zoijcleaow(wkgbmnqykcVar.zoijcleaow());
            }
            return State.ppxfxbqfkf(state, false, wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow(), strZoijcleaow, null, false, 49, null);
        }
        if (msg instanceof gxszxtbevo.iobyxmoadg) {
            return State.ppxfxbqfkf(state, false, null, null, null, ((gxszxtbevo.iobyxmoadg) msg).iobyxmoadg(), false, 47, null);
        }
        if (msg instanceof gxszxtbevo.zoijcleaow) {
            return ppxfxbqfkf(state, (gxszxtbevo.zoijcleaow) msg);
        }
        if (msg instanceof gxszxtbevo.ppxfxbqfkf) {
            return State.ppxfxbqfkf(state, false, null, null, ((gxszxtbevo.ppxfxbqfkf) msg).iobyxmoadg(), null, false, 55, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
