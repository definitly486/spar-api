package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class jyumaefscl implements Iterator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Iterator f8681zdlpuopuiu;

    public jyumaefscl(Iterator it) {
        this.f8681zdlpuopuiu = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8681zdlpuopuiu.hasNext();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f8681zdlpuopuiu.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f8681zdlpuopuiu.remove();
    }
}
