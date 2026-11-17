package androidx.coordinatorlayout.widget;

import androidx.collection.jztzpxfvev;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import u1.eablkybsjg;
import u1.gxszxtbevo;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f8337iobyxmoadg = new gxszxtbevo(10);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jztzpxfvev f8340zoijcleaow = new jztzpxfvev();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ArrayList f8338ppxfxbqfkf = new ArrayList();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final HashSet f8339wkgbmnqykc = new HashSet();

    private void eablkybsjg(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f8340zoijcleaow.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                eablkybsjg(arrayList2.get(i13), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private void gtknphoqwx(ArrayList arrayList) {
        arrayList.clear();
        this.f8337iobyxmoadg.iobyxmoadg(arrayList);
    }

    private ArrayList gxszxtbevo() {
        ArrayList arrayList = (ArrayList) this.f8337iobyxmoadg.zoijcleaow();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public boolean btonecajqb(Object obj) {
        int size = this.f8340zoijcleaow.size();
        for (int i13 = 0; i13 < size; i13++) {
            ArrayList arrayList = (ArrayList) this.f8340zoijcleaow.gtknphoqwx(i13);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList dxjokdxxww() {
        this.f8338ppxfxbqfkf.clear();
        this.f8339wkgbmnqykc.clear();
        int size = this.f8340zoijcleaow.size();
        for (int i13 = 0; i13 < size; i13++) {
            eablkybsjg(this.f8340zoijcleaow.gxszxtbevo(i13), this.f8338ppxfxbqfkf, this.f8339wkgbmnqykc);
        }
        return this.f8338ppxfxbqfkf;
    }

    public void iobyxmoadg(Object obj, Object obj2) {
        if (!this.f8340zoijcleaow.containsKey(obj) || !this.f8340zoijcleaow.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListGxszxtbevo = (ArrayList) this.f8340zoijcleaow.get(obj);
        if (arrayListGxszxtbevo == null) {
            arrayListGxszxtbevo = gxszxtbevo();
            this.f8340zoijcleaow.put(obj, arrayListGxszxtbevo);
        }
        arrayListGxszxtbevo.add(obj2);
    }

    public List lqeggnwhkg(Object obj) {
        return (List) this.f8340zoijcleaow.get(obj);
    }

    public List nufgyqmvbu(Object obj) {
        int size = this.f8340zoijcleaow.size();
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < size; i13++) {
            ArrayList arrayList2 = (ArrayList) this.f8340zoijcleaow.gtknphoqwx(i13);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f8340zoijcleaow.gxszxtbevo(i13));
            }
        }
        return arrayList;
    }

    public void ppxfxbqfkf() {
        int size = this.f8340zoijcleaow.size();
        for (int i13 = 0; i13 < size; i13++) {
            ArrayList arrayList = (ArrayList) this.f8340zoijcleaow.gtknphoqwx(i13);
            if (arrayList != null) {
                gtknphoqwx(arrayList);
            }
        }
        this.f8340zoijcleaow.clear();
    }

    public boolean wkgbmnqykc(Object obj) {
        return this.f8340zoijcleaow.containsKey(obj);
    }

    public void zoijcleaow(Object obj) {
        if (this.f8340zoijcleaow.containsKey(obj)) {
            return;
        }
        this.f8340zoijcleaow.put(obj, null);
    }
}
