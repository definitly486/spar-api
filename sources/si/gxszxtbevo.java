package si;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh.crxdokpmqz;
import jh.jztzpxfvev;
import jh.lereixgezr;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.yadqdtsiqt;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo extends draadjrbmk {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f106715wkgbmnqykc = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(cllcsxoeiz.zoijcleaow(gxszxtbevo.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yi.dxjokdxxww f106716ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jh.eablkybsjg f106717zoijcleaow;

    public static final class iobyxmoadg extends li.wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ArrayList f106718iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f106719zoijcleaow;

        iobyxmoadg(ArrayList arrayList, gxszxtbevo gxszxtbevoVar) {
            this.f106718iobyxmoadg = arrayList;
            this.f106719zoijcleaow = gxszxtbevoVar;
        }

        @Override // li.wflxmlrfwp
        protected void eablkybsjg(jh.zoijcleaow fromSuper, jh.zoijcleaow fromCurrent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fromSuper, "fromSuper");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f106719zoijcleaow.wflxmlrfwp() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }

        @Override // li.agtfadlqog
        public void iobyxmoadg(jh.zoijcleaow fakeOverride) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fakeOverride, "fakeOverride");
            li.ojitshcjhn.hcddaimhww(fakeOverride, null);
            this.f106718iobyxmoadg.add(fakeOverride);
        }
    }

    public gxszxtbevo(yi.agtfadlqog storageManager, jh.eablkybsjg containingClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(containingClass, "containingClass");
        this.f106717zoijcleaow = containingClass;
        this.f106716ppxfxbqfkf = storageManager.wkgbmnqykc(new eablkybsjg(this));
    }

    private final List draadjrbmk() {
        return (List) yi.wflxmlrfwp.iobyxmoadg(this.f106716ppxfxbqfkf, this, f106715wkgbmnqykc[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        List listBtonecajqb = gxszxtbevoVar.btonecajqb();
        return hg.jyumaefscl.ixidwrxhsl(listBtonecajqb, gxszxtbevoVar.gtknphoqwx(listBtonecajqb));
    }

    private final List gtknphoqwx(List list) {
        Collection collectionWflxmlrfwp;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionZoijcleaow = this.f106717zoijcleaow.btonecajqb().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionZoijcleaow.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList2, agtfadlqog.iobyxmoadg.iobyxmoadg(((kegysxyocb) it.next()).agtfadlqog(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof jh.zoijcleaow) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            ii.gxszxtbevo name = ((jh.zoijcleaow) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(key, "component1(...)");
            ii.gxszxtbevo gxszxtbevoVar = (ii.gxszxtbevo) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((jh.zoijcleaow) obj3) instanceof lereixgezr);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                li.ojitshcjhn ojitshcjhnVar = li.ojitshcjhn.f62605gxszxtbevo;
                if (zBooleanValue) {
                    collectionWflxmlrfwp = new ArrayList();
                    for (Object obj4 : list) {
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((lereixgezr) obj4).getName(), gxszxtbevoVar)) {
                            collectionWflxmlrfwp.add(obj4);
                        }
                    }
                } else {
                    collectionWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                }
                ojitshcjhnVar.jyumaefscl(gxszxtbevoVar, list3, collectionWflxmlrfwp, this.f106717zoijcleaow, new iobyxmoadg(arrayList, this));
            }
        }
        return jj.iobyxmoadg.ppxfxbqfkf(arrayList);
    }

    protected abstract List btonecajqb();

    @Override // si.draadjrbmk, si.agtfadlqog
    public Collection gxszxtbevo(wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return !kindFilter.iobyxmoadg(wkgbmnqykc.f106754rgvfuqvkyq.wflxmlrfwp()) ? hg.jyumaefscl.wflxmlrfwp() : draadjrbmk();
    }

    protected final jh.eablkybsjg wflxmlrfwp() {
        return this.f106717zoijcleaow;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        List listDraadjrbmk = draadjrbmk();
        if (listDraadjrbmk.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        jj.gtknphoqwx gtknphoqwxVar = new jj.gtknphoqwx();
        for (Object obj : listDraadjrbmk) {
            if ((obj instanceof jztzpxfvev) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((jztzpxfvev) obj).getName(), name)) {
                gtknphoqwxVar.add(obj);
            }
        }
        return gtknphoqwxVar;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        List listDraadjrbmk = draadjrbmk();
        if (listDraadjrbmk.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        jj.gtknphoqwx gtknphoqwxVar = new jj.gtknphoqwx();
        for (Object obj : listDraadjrbmk) {
            if ((obj instanceof crxdokpmqz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((crxdokpmqz) obj).getName(), name)) {
                gtknphoqwxVar.add(obj);
            }
        }
        return gtknphoqwxVar;
    }
}
