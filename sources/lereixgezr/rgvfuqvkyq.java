package lereixgezr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final rgvfuqvkyq f62356ppxfxbqfkf = new iobyxmoadg().zoijcleaow(0).iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final rgvfuqvkyq f62357wkgbmnqykc = new iobyxmoadg().zoijcleaow(1).iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinkedHashSet f62358iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f62359zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LinkedHashSet f62360iobyxmoadg = new LinkedHashSet();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f62361zoijcleaow;

        public rgvfuqvkyq iobyxmoadg() {
            return new rgvfuqvkyq(this.f62360iobyxmoadg, this.f62361zoijcleaow);
        }

        public iobyxmoadg zoijcleaow(int i13) {
            u1.nufgyqmvbu.dxjokdxxww(i13 != -1, "The specified lens facing is invalid.");
            this.f62360iobyxmoadg.add(new istkbnxepw.wypolnanlu(i13));
            return this;
        }
    }

    rgvfuqvkyq(LinkedHashSet linkedHashSet, String str) {
        this.f62358iobyxmoadg = linkedHashSet;
        this.f62359zoijcleaow = str;
    }

    public istkbnxepw.iwizpuwonk eablkybsjg(LinkedHashSet linkedHashSet) {
        Iterator it = iobyxmoadg(linkedHashSet).iterator();
        if (it.hasNext()) {
            return (istkbnxepw.iwizpuwonk) it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    public LinkedHashSet iobyxmoadg(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((istkbnxepw.iwizpuwonk) it.next()).zoijcleaow());
        }
        List listZoijcleaow = zoijcleaow(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            istkbnxepw.iwizpuwonk iwizpuwonkVar = (istkbnxepw.iwizpuwonk) it2.next();
            if (listZoijcleaow.contains(iwizpuwonkVar.zoijcleaow())) {
                linkedHashSet2.add(iwizpuwonkVar);
            }
        }
        return linkedHashSet2;
    }

    public LinkedHashSet ppxfxbqfkf() {
        return this.f62358iobyxmoadg;
    }

    public Integer wkgbmnqykc() {
        Integer num = null;
        for (wflxmlrfwp wflxmlrfwpVar : this.f62358iobyxmoadg) {
            if (wflxmlrfwpVar instanceof istkbnxepw.wypolnanlu) {
                Integer numValueOf = Integer.valueOf(((istkbnxepw.wypolnanlu) wflxmlrfwpVar).zoijcleaow());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public List zoijcleaow(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f62358iobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList = ((wflxmlrfwp) it.next()).iobyxmoadg(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }
}
