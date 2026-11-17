package androidx.collection;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zynmafqrjb implements Map.Entry, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f4419yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f4420zdlpuopuiu;

    public zynmafqrjb(Object obj, Object obj2) {
        this.f4420zdlpuopuiu = obj;
        this.f4419yggfygwlhe = obj2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f4420zdlpuopuiu;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f4419yggfygwlhe;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
