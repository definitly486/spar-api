package ixidwrxhsl;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow implements Map.Entry, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f50018yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f50019zdlpuopuiu;

    public zoijcleaow(Object obj, Object obj2) {
        this.f50019zdlpuopuiu = obj;
        this.f50018yggfygwlhe = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(entry.getKey(), getKey()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f50019zdlpuopuiu;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f50018yggfygwlhe;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getKey());
        sb3.append('=');
        sb3.append(getValue());
        return sb3.toString();
    }
}
