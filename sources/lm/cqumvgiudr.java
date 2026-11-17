package lm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import lk.yadqdtsiqt;

/* JADX INFO: loaded from: classes3.dex */
abstract class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final Type[] f63416iobyxmoadg = new Type[0];

    private static final class iobyxmoadg implements GenericArrayType {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Type f63417zdlpuopuiu;

        iobyxmoadg(Type type) {
            this.f63417zdlpuopuiu = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && cqumvgiudr.wkgbmnqykc(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f63417zdlpuopuiu;
        }

        public int hashCode() {
            return this.f63417zdlpuopuiu.hashCode();
        }

        public String toString() {
            return cqumvgiudr.zdlpuopuiu(this.f63417zdlpuopuiu) + "[]";
        }
    }

    private static final class ppxfxbqfkf implements WildcardType {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Type f63418yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Type f63419zdlpuopuiu;

        ppxfxbqfkf(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                cqumvgiudr.zoijcleaow(typeArr[0]);
                this.f63418yggfygwlhe = null;
                this.f63419zdlpuopuiu = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            cqumvgiudr.zoijcleaow(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f63418yggfygwlhe = typeArr2[0];
            this.f63419zdlpuopuiu = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && cqumvgiudr.wkgbmnqykc(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f63418yggfygwlhe;
            return type != null ? new Type[]{type} : cqumvgiudr.f63416iobyxmoadg;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f63419zdlpuopuiu};
        }

        public int hashCode() {
            Type type = this.f63418yggfygwlhe;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f63419zdlpuopuiu.hashCode() + 31);
        }

        public String toString() {
            if (this.f63418yggfygwlhe != null) {
                return "? super " + cqumvgiudr.zdlpuopuiu(this.f63418yggfygwlhe);
            }
            if (this.f63419zdlpuopuiu == Object.class) {
                return "?";
            }
            return "? extends " + cqumvgiudr.zdlpuopuiu(this.f63419zdlpuopuiu);
        }
    }

    static final class zoijcleaow implements ParameterizedType {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final Type[] f63420jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Type f63421yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Type f63422zdlpuopuiu;

        zoijcleaow(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                cqumvgiudr.zoijcleaow(type3);
            }
            this.f63422zdlpuopuiu = type;
            this.f63421yggfygwlhe = type2;
            this.f63420jyumaefscl = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && cqumvgiudr.wkgbmnqykc(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f63420jyumaefscl.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f63422zdlpuopuiu;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f63421yggfygwlhe;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f63420jyumaefscl) ^ this.f63421yggfygwlhe.hashCode();
            Type type = this.f63422zdlpuopuiu;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f63420jyumaefscl;
            if (typeArr.length == 0) {
                return cqumvgiudr.zdlpuopuiu(this.f63421yggfygwlhe);
            }
            StringBuilder sb3 = new StringBuilder((typeArr.length + 1) * 30);
            sb3.append(cqumvgiudr.zdlpuopuiu(this.f63421yggfygwlhe));
            sb3.append("<");
            sb3.append(cqumvgiudr.zdlpuopuiu(this.f63420jyumaefscl[0]));
            for (int i13 = 1; i13 < this.f63420jyumaefscl.length; i13++) {
                sb3.append(", ");
                sb3.append(cqumvgiudr.zdlpuopuiu(this.f63420jyumaefscl[i13]));
            }
            sb3.append(">");
            return sb3.toString();
        }
    }

    static RuntimeException agtfadlqog(Method method, Throwable th2, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th2);
    }

    static boolean btonecajqb(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (btonecajqb(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return btonecajqb(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static boolean draadjrbmk(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static Type dxjokdxxww(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return vdvldrhtss(type, cls, eablkybsjg(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static Type eablkybsjg(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i13 = 0; i13 < length; i13++) {
                Class<?> cls3 = interfaces[i13];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i13];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return eablkybsjg(cls.getGenericInterfaces()[i13], interfaces[i13], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return eablkybsjg(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static int gtknphoqwx(Object[] objArr, Object obj) {
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (obj.equals(objArr[i13])) {
                return i13;
            }
        }
        throw new NoSuchElementException();
    }

    static Type gxszxtbevo(int i13, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i13];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    static yadqdtsiqt iobyxmoadg(yadqdtsiqt yadqdtsiqtVar) {
        bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
        yadqdtsiqtVar.draadjrbmk().P(ppxfxbqfkfVar);
        return yadqdtsiqt.btonecajqb(yadqdtsiqtVar.dxjokdxxww(), yadqdtsiqtVar.nufgyqmvbu(), ppxfxbqfkfVar);
    }

    static void kcexrzcfyt(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    static Type lqeggnwhkg(int i13, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i13 >= 0 && i13 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i13];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i13 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    static Class nufgyqmvbu(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) nufgyqmvbu(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return nufgyqmvbu(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    static RuntimeException ojitshcjhn(Method method, int i13, String str, Object... objArr) {
        return wflxmlrfwp(method, str + " (parameter #" + (i13 + 1) + ")", objArr);
    }

    private static Type oxmwwwfdhm(Type type, Class cls, TypeVariable typeVariable) {
        Class clsPpxfxbqfkf = ppxfxbqfkf(typeVariable);
        if (clsPpxfxbqfkf == null) {
            return typeVariable;
        }
        Type typeEablkybsjg = eablkybsjg(type, cls, clsPpxfxbqfkf);
        if (!(typeEablkybsjg instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeEablkybsjg).getActualTypeArguments()[gtknphoqwx(clsPpxfxbqfkf.getTypeParameters(), typeVariable)];
    }

    private static Class ppxfxbqfkf(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static RuntimeException rgvfuqvkyq(Method method, Throwable th2, int i13, String str, Object... objArr) {
        return agtfadlqog(method, th2, str + " (parameter #" + (i13 + 1) + ")", objArr);
    }

    static Type vdvldrhtss(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeVdvldrhtss;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Type typeOxmwwwfdhm = oxmwwwfdhm(type, cls, typeVariable);
            if (typeOxmwwwfdhm == typeVariable) {
                return typeOxmwwwfdhm;
            }
            type4 = typeOxmwwwfdhm;
        }
        if (type4 instanceof Class) {
            Class cls2 = (Class) type4;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeVdvldrhtss2 = vdvldrhtss(type, cls, componentType);
                return componentType == typeVdvldrhtss2 ? cls2 : new iobyxmoadg(typeVdvldrhtss2);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeVdvldrhtss3 = vdvldrhtss(type, cls, genericComponentType);
            return genericComponentType == typeVdvldrhtss3 ? genericArrayType : new iobyxmoadg(typeVdvldrhtss3);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeVdvldrhtss4 = vdvldrhtss(type, cls, ownerType);
            boolean z13 = typeVdvldrhtss4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i13 = 0; i13 < length; i13++) {
                Type typeVdvldrhtss5 = vdvldrhtss(type, cls, actualTypeArguments[i13]);
                if (typeVdvldrhtss5 != actualTypeArguments[i13]) {
                    if (!z13) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z13 = true;
                    }
                    actualTypeArguments[i13] = typeVdvldrhtss5;
                }
            }
            return z13 ? new zoijcleaow(typeVdvldrhtss4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type4 instanceof WildcardType) {
            wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeVdvldrhtss6 = vdvldrhtss(type, cls, lowerBounds[0]);
                if (typeVdvldrhtss6 != lowerBounds[0]) {
                    type3 = type4;
                    type3 = wildcardType;
                    return new ppxfxbqfkf(new Type[]{Object.class}, new Type[]{typeVdvldrhtss6});
                }
            } else if (upperBounds.length == 1 && (typeVdvldrhtss = vdvldrhtss(type, cls, upperBounds[0])) != upperBounds[0]) {
                type3 = type4;
                type3 = wildcardType;
                type3 = wildcardType;
                return new ppxfxbqfkf(new Type[]{typeVdvldrhtss}, f63416iobyxmoadg);
            }
        }
        type3 = type4;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        return type3;
    }

    static RuntimeException wflxmlrfwp(Method method, String str, Object... objArr) {
        return agtfadlqog(method, null, str, objArr);
    }

    static boolean wkgbmnqykc(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return wkgbmnqykc(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static String zdlpuopuiu(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static void zoijcleaow(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }
}
