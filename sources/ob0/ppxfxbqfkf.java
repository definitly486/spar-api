package ob0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSet;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements rgvfuqvkyq {
    private final qu.iobyxmoadg eablkybsjg(ComboSet comboSet) {
        return iobyxmoadg(comboSet, (ComboSetProduct) jyumaefscl.opjhrmiecq(comboSet.getProductsFirst()), (ComboSetProduct) jyumaefscl.opjhrmiecq(comboSet.getProductsSecond()));
    }

    private final qu.iobyxmoadg iobyxmoadg(ComboSet comboSet, ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        return new qu.iobyxmoadg(comboSet.getId(), comboSet.getName(), comboSet.getPrice(), new qu.wkgbmnqykc(comboSetProduct, comboSetProduct2), comboSet.getProductsFirst(), comboSet.getProductsSecond());
    }

    private final List zoijcleaow(ComboSet comboSet) {
        ArrayList arrayList = new ArrayList();
        for (ComboSetProduct comboSetProduct : comboSet.getProductsFirst()) {
            Iterator it = comboSet.getProductsSecond().iterator();
            while (it.hasNext()) {
                arrayList.add(iobyxmoadg(comboSet, comboSetProduct, (ComboSetProduct) it.next()));
            }
        }
        return arrayList;
    }

    @Override // tg.rgvfuqvkyq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ppxfxbqfkf((List) obj, ((Boolean) obj2).booleanValue());
    }

    public List ppxfxbqfkf(List comboList, boolean z13) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(comboList, "comboList");
        if (z13) {
            arrayList = new ArrayList();
            Iterator it = comboList.iterator();
            while (it.hasNext()) {
                jyumaefscl.istkbnxepw(arrayList, zoijcleaow((ComboSet) it.next()));
            }
        } else {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(comboList, 10));
            Iterator it2 = comboList.iterator();
            while (it2.hasNext()) {
                arrayList.add(eablkybsjg((ComboSet) it2.next()));
            }
        }
        return arrayList;
    }
}
