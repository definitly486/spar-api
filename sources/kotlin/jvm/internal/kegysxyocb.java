package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class kegysxyocb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f60026iobyxmoadg;

    public kegysxyocb(int i13) {
        this.f60026iobyxmoadg = new ArrayList(i13);
    }

    public void iobyxmoadg(Object obj) {
        this.f60026iobyxmoadg.add(obj);
    }

    public int ppxfxbqfkf() {
        return this.f60026iobyxmoadg.size();
    }

    public Object[] wkgbmnqykc(Object[] objArr) {
        return this.f60026iobyxmoadg.toArray(objArr);
    }

    public void zoijcleaow(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f60026iobyxmoadg;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f60026iobyxmoadg, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f60026iobyxmoadg.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f60026iobyxmoadg.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f60026iobyxmoadg.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }
}
