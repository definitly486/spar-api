package jrbgnlbqoe;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f52248jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Map f52249yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Object f52250zdlpuopuiu;

    public wkgbmnqykc(Object obj, Map map) {
        this.f52250zdlpuopuiu = obj;
        this.f52249yggfygwlhe = map;
    }

    private final void iobyxmoadg() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52248jyumaefscl < this.f52249yggfygwlhe.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        iobyxmoadg();
        Object obj = this.f52250zdlpuopuiu;
        this.f52248jyumaefscl++;
        Object obj2 = this.f52249yggfygwlhe.get(obj);
        if (obj2 != null) {
            this.f52250zdlpuopuiu = ((iobyxmoadg) obj2).ppxfxbqfkf();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    public final void ppxfxbqfkf(int i13) {
        this.f52248jyumaefscl = i13;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int zoijcleaow() {
        return this.f52248jyumaefscl;
    }
}
