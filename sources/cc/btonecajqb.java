package cc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f19565iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f19566zoijcleaow;

    public btonecajqb(int i13) {
        this.f19566zoijcleaow = i13;
    }

    public List iobyxmoadg() {
        List listZoijcleaow = zoijcleaow();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < listZoijcleaow.size(); i13++) {
            arrayList.add(((dxjokdxxww) listZoijcleaow.get(i13)).nufgyqmvbu());
        }
        return arrayList;
    }

    public synchronized boolean ppxfxbqfkf(List list) {
        this.f19565iobyxmoadg.clear();
        if (list.size() <= this.f19566zoijcleaow) {
            return this.f19565iobyxmoadg.addAll(list);
        }
        xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f19566zoijcleaow);
        return this.f19565iobyxmoadg.addAll(list.subList(0, this.f19566zoijcleaow));
    }

    public synchronized List zoijcleaow() {
        return Collections.unmodifiableList(new ArrayList(this.f19565iobyxmoadg));
    }
}
