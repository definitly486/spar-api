package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class btonecajqb implements Iterator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Iterator f60048zdlpuopuiu;

    public btonecajqb(Iterator it) {
        this.f60048zdlpuopuiu = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f60048zdlpuopuiu.hasNext();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f60048zdlpuopuiu.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f60048zdlpuopuiu.remove();
    }
}
