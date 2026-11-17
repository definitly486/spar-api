package b9;

import g9.btonecajqb;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f15576iobyxmoadg = new AtomicReference();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.iobyxmoadg f15577zoijcleaow = new androidx.collection.iobyxmoadg();

    public List iobyxmoadg(Class cls, Class cls2, Class cls3) {
        List list;
        btonecajqb btonecajqbVar = (btonecajqb) this.f15576iobyxmoadg.getAndSet(null);
        if (btonecajqbVar == null) {
            btonecajqbVar = new btonecajqb(cls, cls2, cls3);
        } else {
            btonecajqbVar.iobyxmoadg(cls, cls2, cls3);
        }
        synchronized (this.f15577zoijcleaow) {
            list = (List) this.f15577zoijcleaow.get(btonecajqbVar);
        }
        this.f15576iobyxmoadg.set(btonecajqbVar);
        return list;
    }

    public void zoijcleaow(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f15577zoijcleaow) {
            this.f15577zoijcleaow.put(new btonecajqb(cls, cls2, cls3), list);
        }
    }
}
