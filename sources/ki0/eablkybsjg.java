package ki0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.networkpanel.impl.domain.model.NetworkItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f55686iobyxmoadg;

        static {
            int[] iArr = new int[ei0.iobyxmoadg.values().length];
            try {
                iArr[ei0.iobyxmoadg.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ei0.iobyxmoadg.GROUP_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ei0.iobyxmoadg.GROUP_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55686iobyxmoadg = iArr;
        }
    }

    public static final class zoijcleaow implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((List) ((Map.Entry) obj2).getValue()).size()), Integer.valueOf(((List) ((Map.Entry) obj).getValue()).size()));
        }
    }

    private static final List iobyxmoadg(List list) {
        if (list.isEmpty()) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(jyumaefscl.opjhrmiecq(list));
        int size = list.size();
        for (int i13 = 1; i13 < size; i13++) {
            if (((NetworkItem) list.get(i13)).getRequestTime() - ((NetworkItem) list.get(i13 - 1)).getRequestTime() > 1000000000) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            }
            arrayList2.add(list.get(i13));
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public static final List ppxfxbqfkf(List list, ei0.iobyxmoadg type, Set selectedItems) {
        Long lValueOf;
        Long lValueOf2;
        zdlpuopuiu.btonecajqb(list, "<this>");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(selectedItems, "selectedItems");
        int i13 = iobyxmoadg.f55686iobyxmoadg[type.ordinal()];
        if (i13 == 1) {
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zoijcleaow((NetworkItem) it.next()));
            }
            return jyumaefscl.ezmngbhpjk(arrayList);
        }
        int i14 = 0;
        if (i13 == 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String url = ((NetworkItem) obj).getUrl();
                Object arrayList2 = linkedHashMap.get(url);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(url, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            List listD = jyumaefscl.d(linkedHashMap.entrySet(), new zoijcleaow());
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(listD, 10));
            for (Object obj2 : listD) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    jyumaefscl.iwizpuwonk();
                }
                Map.Entry entry = (Map.Entry) obj2;
                String str = type.name() + i14;
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(str, selectedItems.contains(str), ((List) entry.getValue()).size(), (String) entry.getKey());
                List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
                listPpxfxbqfkf.add(ppxfxbqfkfVar);
                if (ppxfxbqfkfVar.ppxfxbqfkf()) {
                    Iterable iterable = (Iterable) entry.getValue();
                    ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(zoijcleaow((NetworkItem) it2.next()));
                    }
                    listPpxfxbqfkf.addAll(arrayList4);
                }
                arrayList3.add(jyumaefscl.iobyxmoadg(listPpxfxbqfkf));
                i14 = i15;
            }
            return jyumaefscl.lereixgezr(arrayList3);
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        List listEzmngbhpjk = jyumaefscl.ezmngbhpjk(iobyxmoadg(list));
        ArrayList arrayList5 = new ArrayList(jyumaefscl.cqumvgiudr(listEzmngbhpjk, 10));
        for (Object obj3 : listEzmngbhpjk) {
            int i16 = i14 + 1;
            if (i14 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            List list2 = (List) obj3;
            String str2 = type.name() + i14;
            Iterator it3 = list2.iterator();
            if (it3.hasNext()) {
                lValueOf = Long.valueOf(((NetworkItem) it3.next()).getRequestTime());
                while (it3.hasNext()) {
                    Long lValueOf3 = Long.valueOf(((NetworkItem) it3.next()).getRequestTime());
                    if (lValueOf.compareTo(lValueOf3) > 0) {
                        lValueOf = lValueOf3;
                    }
                }
            } else {
                lValueOf = null;
            }
            Iterator it4 = list2.iterator();
            if (it4.hasNext()) {
                Long responseTime = ((NetworkItem) it4.next()).getResponseTime();
                lValueOf2 = Long.valueOf(responseTime != null ? responseTime.longValue() : 0L);
                while (it4.hasNext()) {
                    Long responseTime2 = ((NetworkItem) it4.next()).getResponseTime();
                    Long lValueOf4 = Long.valueOf(responseTime2 != null ? responseTime2.longValue() : 0L);
                    if (lValueOf2.compareTo(lValueOf4) < 0) {
                        lValueOf2 = lValueOf4;
                    }
                }
            } else {
                lValueOf2 = null;
            }
            ki0.zoijcleaow zoijcleaowVar = new ki0.zoijcleaow(str2, selectedItems.contains(str2), list2.size(), lValueOf2 != null ? Long.valueOf((lValueOf2.longValue() - (lValueOf != null ? lValueOf.longValue() : 0L)) / ((long) 1000000)) : null);
            List listPpxfxbqfkf2 = jyumaefscl.ppxfxbqfkf();
            listPpxfxbqfkf2.add(zoijcleaowVar);
            if (zoijcleaowVar.ppxfxbqfkf()) {
                ArrayList arrayList6 = new ArrayList(jyumaefscl.cqumvgiudr(list2, 10));
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(zoijcleaow((NetworkItem) it5.next()));
                }
                listPpxfxbqfkf2.addAll(arrayList6);
            }
            arrayList5.add(jyumaefscl.iobyxmoadg(listPpxfxbqfkf2));
            i14 = i16;
        }
        return jyumaefscl.lereixgezr(arrayList5);
    }

    private static final wkgbmnqykc.iobyxmoadg zoijcleaow(NetworkItem networkItem) {
        return new wkgbmnqykc.iobyxmoadg(networkItem.getId(), networkItem.getUrl(), networkItem.getDuration());
    }
}
