package v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class crxdokpmqz implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Iterator f115111jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f115112yggfygwlhe = new ArrayList();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.draadjrbmk f115113zdlpuopuiu;

    public crxdokpmqz(Iterator it, tg.draadjrbmk draadjrbmkVar) {
        this.f115113zdlpuopuiu = draadjrbmkVar;
        this.f115111jyumaefscl = it;
    }

    private final void iobyxmoadg(Object obj) {
        Iterator it = (Iterator) this.f115113zdlpuopuiu.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f115112yggfygwlhe.add(this.f115111jyumaefscl);
            this.f115111jyumaefscl = it;
        } else {
            while (!this.f115111jyumaefscl.hasNext() && !this.f115112yggfygwlhe.isEmpty()) {
                this.f115111jyumaefscl = (Iterator) hg.jyumaefscl.skhdrjzrfn(this.f115112yggfygwlhe);
                hg.jyumaefscl.hkdspvbjdz(this.f115112yggfygwlhe);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f115111jyumaefscl.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f115111jyumaefscl.next();
        iobyxmoadg(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
