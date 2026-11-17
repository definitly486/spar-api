package ah;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class yggfygwlhe implements TypeVariable, Type {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final rgvfuqvkyq f1904zdlpuopuiu;

    public yggfygwlhe(rgvfuqvkyq typeParameter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeParameter, "typeParameter");
        this.f1904zdlpuopuiu = typeParameter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getName(), typeVariable.getName()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List upperBounds = this.f1904zdlpuopuiu.getUpperBounds();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(jyumaefscl.ppxfxbqfkf((ojitshcjhn) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new gg.rgvfuqvkyq("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f1904zdlpuopuiu));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f1904zdlpuopuiu.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
