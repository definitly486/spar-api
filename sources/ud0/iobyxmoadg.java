package ud0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mb0.wkgbmnqykc;
import ru.myspar.core.domain.models.shop.Shop;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {
    private final wkgbmnqykc zoijcleaow(Shop shop) {
        return new wkgbmnqykc(shop.getXmlId(), shop.getName(), shop.getAddress(), shop.getHours(), shop.getType(), false, shop.btonecajqb(), shop.getDistanceFromUser(), shop.getServices(), null, UserVerificationMethods.USER_VERIFY_NONE, null);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public List invoke(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((Shop) it.next()));
        }
        return arrayList;
    }
}
