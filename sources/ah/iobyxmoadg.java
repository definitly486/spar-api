package ah;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
final class iobyxmoadg implements GenericArrayType, Type {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Type f1881zdlpuopuiu;

    public iobyxmoadg(Type elementType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elementType, "elementType");
        this.f1881zdlpuopuiu = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f1881zdlpuopuiu;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return jyumaefscl.nufgyqmvbu(this.f1881zdlpuopuiu) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
