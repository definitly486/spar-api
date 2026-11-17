package istkbnxepw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class wypolnanlu implements lereixgezr.wflxmlrfwp {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f49443zoijcleaow;

    public wypolnanlu(int i13) {
        this.f49443zoijcleaow = i13;
    }

    @Override // lereixgezr.wflxmlrfwp
    public List iobyxmoadg(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lereixgezr.agtfadlqog agtfadlqogVar = (lereixgezr.agtfadlqog) it.next();
            u1.nufgyqmvbu.zoijcleaow(agtfadlqogVar instanceof jyumaefscl, "The camera info doesn't contain internal implementation.");
            if (agtfadlqogVar.ppxfxbqfkf() == this.f49443zoijcleaow) {
                arrayList.add(agtfadlqogVar);
            }
        }
        return arrayList;
    }

    public int zoijcleaow() {
        return this.f49443zoijcleaow;
    }
}
