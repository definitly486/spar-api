package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final Type[] f25178iobyxmoadg = new Type[0];

    private static final class iobyxmoadg implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Type f25179zdlpuopuiu;

        public iobyxmoadg(Type type) {
            Objects.requireNonNull(type);
            this.f25179zdlpuopuiu = zoijcleaow.zoijcleaow(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && zoijcleaow.gxszxtbevo(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f25179zdlpuopuiu;
        }

        public int hashCode() {
            return this.f25179zdlpuopuiu.hashCode();
        }

        public String toString() {
            return zoijcleaow.zdlpuopuiu(this.f25179zdlpuopuiu) + "[]";
        }
    }

    private static final class ppxfxbqfkf implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Type f25180yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Type f25181zdlpuopuiu;

        public ppxfxbqfkf(Type[] typeArr, Type[] typeArr2) {
            com.google.gson.internal.iobyxmoadg.iobyxmoadg(typeArr2.length <= 1);
            com.google.gson.internal.iobyxmoadg.iobyxmoadg(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                zoijcleaow.ppxfxbqfkf(typeArr[0]);
                this.f25180yggfygwlhe = null;
                this.f25181zdlpuopuiu = zoijcleaow.zoijcleaow(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            zoijcleaow.ppxfxbqfkf(typeArr2[0]);
            com.google.gson.internal.iobyxmoadg.iobyxmoadg(typeArr[0] == Object.class);
            this.f25180yggfygwlhe = zoijcleaow.zoijcleaow(typeArr2[0]);
            this.f25181zdlpuopuiu = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && zoijcleaow.gxszxtbevo(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f25180yggfygwlhe;
            return type != null ? new Type[]{type} : zoijcleaow.f25178iobyxmoadg;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f25181zdlpuopuiu};
        }

        public int hashCode() {
            Type type = this.f25180yggfygwlhe;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f25181zdlpuopuiu.hashCode() + 31);
        }

        public String toString() {
            if (this.f25180yggfygwlhe != null) {
                return "? super " + zoijcleaow.zdlpuopuiu(this.f25180yggfygwlhe);
            }
            if (this.f25181zdlpuopuiu == Object.class) {
                return "?";
            }
            return "? extends " + zoijcleaow.zdlpuopuiu(this.f25181zdlpuopuiu);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private static final class C0425zoijcleaow implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final Type[] f25182jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Type f25183yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Type f25184zdlpuopuiu;

        public C0425zoijcleaow(Type type, Type type2, Type... typeArr) {
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z13 = true;
                boolean z14 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z14) {
                    z13 = false;
                }
                com.google.gson.internal.iobyxmoadg.iobyxmoadg(z13);
            }
            this.f25184zdlpuopuiu = type == null ? null : zoijcleaow.zoijcleaow(type);
            this.f25183yggfygwlhe = zoijcleaow.zoijcleaow(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f25182jyumaefscl = typeArr2;
            int length = typeArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                Objects.requireNonNull(this.f25182jyumaefscl[i13]);
                zoijcleaow.ppxfxbqfkf(this.f25182jyumaefscl[i13]);
                Type[] typeArr3 = this.f25182jyumaefscl;
                typeArr3[i13] = zoijcleaow.zoijcleaow(typeArr3[i13]);
            }
        }

        private static int iobyxmoadg(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && zoijcleaow.gxszxtbevo(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f25182jyumaefscl.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f25184zdlpuopuiu;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f25183yggfygwlhe;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f25182jyumaefscl) ^ this.f25183yggfygwlhe.hashCode()) ^ iobyxmoadg(this.f25184zdlpuopuiu);
        }

        public String toString() {
            int length = this.f25182jyumaefscl.length;
            if (length == 0) {
                return zoijcleaow.zdlpuopuiu(this.f25183yggfygwlhe);
            }
            StringBuilder sb3 = new StringBuilder((length + 1) * 30);
            sb3.append(zoijcleaow.zdlpuopuiu(this.f25183yggfygwlhe));
            sb3.append("<");
            sb3.append(zoijcleaow.zdlpuopuiu(this.f25182jyumaefscl[0]));
            for (int i13 = 1; i13 < length; i13++) {
                sb3.append(", ");
                sb3.append(zoijcleaow.zdlpuopuiu(this.f25182jyumaefscl[i13]));
            }
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static ParameterizedType agtfadlqog(Type type, Type type2, Type... typeArr) {
        return new C0425zoijcleaow(type, type2, typeArr);
    }

    public static Type[] btonecajqb(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeDraadjrbmk = draadjrbmk(type, cls, Map.class);
        return typeDraadjrbmk instanceof ParameterizedType ? ((ParameterizedType) typeDraadjrbmk).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    private static Type draadjrbmk(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.iobyxmoadg.iobyxmoadg(cls2.isAssignableFrom(cls));
        return ojitshcjhn(type, cls, dxjokdxxww(type, cls, cls2));
    }

    private static Type dxjokdxxww(Type type, Class cls, Class cls2) {
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
                    return dxjokdxxww(cls.getGenericInterfaces()[i13], interfaces[i13], cls2);
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
                    return dxjokdxxww(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static boolean eablkybsjg(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static Class gtknphoqwx(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.google.gson.internal.iobyxmoadg.iobyxmoadg(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) gtknphoqwx(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return gtknphoqwx(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static boolean gxszxtbevo(Type type, Type type2) {
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
            return eablkybsjg(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return gxszxtbevo(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static GenericArrayType iobyxmoadg(Type type) {
        return new iobyxmoadg(type);
    }

    public static WildcardType kcexrzcfyt(Type type) {
        return new ppxfxbqfkf(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static Type lqeggnwhkg(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type nufgyqmvbu(Type type, Class cls) {
        Type typeDraadjrbmk = draadjrbmk(type, cls, Collection.class);
        return typeDraadjrbmk instanceof ParameterizedType ? ((ParameterizedType) typeDraadjrbmk).getActualTypeArguments()[0] : Object.class;
    }

    public static Type ojitshcjhn(Type type, Class cls, Type type2) {
        return rgvfuqvkyq(type, cls, type2, new HashMap());
    }

    public static WildcardType oxmwwwfdhm(Type type) {
        return new ppxfxbqfkf(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f25178iobyxmoadg);
    }

    static void ppxfxbqfkf(Type type) {
        com.google.gson.internal.iobyxmoadg.iobyxmoadg(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6 A[EDGE_INSN: B:51:0x00c6->B:57:0x00dc BREAK  A[LOOP:0: B:3:0x0001->B:63:?]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x009d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    private static Type rgvfuqvkyq(Type type, Class cls, Type type2, Map map) {
        int i13;
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeRgvfuqvkyq;
        Type typeRgvfuqvkyq2;
        Type typeRgvfuqvkyq3;
        boolean z13;
        Type[] actualTypeArguments;
        int length;
        Type typeAgtfadlqog;
        Type typeRgvfuqvkyq4;
        Type genericComponentType;
        Type typeRgvfuqvkyq5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                type2 = oxmwwwfdhm(typeRgvfuqvkyq);
                                break;
                            }
                            typeRgvfuqvkyq2 = rgvfuqvkyq(type, cls, lowerBounds[0], map);
                            if (typeRgvfuqvkyq2 != lowerBounds[0]) {
                                break;
                            }
                            type2 = kcexrzcfyt(typeRgvfuqvkyq2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeRgvfuqvkyq3 = rgvfuqvkyq(type, cls, ownerType, map);
                        z13 = !eablkybsjg(typeRgvfuqvkyq3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        for (i13 = 0; i13 < length; i13++) {
                            typeRgvfuqvkyq4 = rgvfuqvkyq(type, cls, actualTypeArguments[i13], map);
                            if (eablkybsjg(typeRgvfuqvkyq4, actualTypeArguments[i13])) {
                                if (!z13) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z13 = true;
                                }
                                actualTypeArguments[i13] = typeRgvfuqvkyq4;
                            }
                        }
                        if (z13) {
                            break;
                        }
                        typeAgtfadlqog = agtfadlqog(typeRgvfuqvkyq3, type2.getRawType(), actualTypeArguments);
                        type2 = typeAgtfadlqog;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeRgvfuqvkyq5 = rgvfuqvkyq(type, cls, genericComponentType, map);
                    if (eablkybsjg(genericComponentType, typeRgvfuqvkyq5)) {
                        typeAgtfadlqog = iobyxmoadg(typeRgvfuqvkyq5);
                        type2 = typeAgtfadlqog;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeRgvfuqvkyq = rgvfuqvkyq(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    type2 = oxmwwwfdhm(typeRgvfuqvkyq);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeRgvfuqvkyq2 = rgvfuqvkyq(type, cls, lowerBounds[0], map);
                            if (typeRgvfuqvkyq2 != lowerBounds[0]) {
                                break;
                            }
                            type2 = kcexrzcfyt(typeRgvfuqvkyq2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeRgvfuqvkyq3 = rgvfuqvkyq(type, cls, ownerType2, map);
                        z13 = !eablkybsjg(typeRgvfuqvkyq3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i13 < length) {
                            typeRgvfuqvkyq4 = rgvfuqvkyq(type, cls, actualTypeArguments[i13], map);
                            if (eablkybsjg(typeRgvfuqvkyq4, actualTypeArguments[i13])) {
                                if (!z13) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z13 = true;
                                }
                                actualTypeArguments[i13] = typeRgvfuqvkyq4;
                            }
                        }
                        if (z13) {
                            break;
                        }
                        typeAgtfadlqog = agtfadlqog(typeRgvfuqvkyq3, type2.getRawType(), actualTypeArguments);
                        type2 = typeAgtfadlqog;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeRgvfuqvkyq5 = rgvfuqvkyq(type, cls, genericComponentType, map);
                    if (eablkybsjg(genericComponentType, typeRgvfuqvkyq5)) {
                        break;
                    }
                    typeAgtfadlqog = iobyxmoadg(typeRgvfuqvkyq5);
                    type2 = typeAgtfadlqog;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeRgvfuqvkyq6 = rgvfuqvkyq(type, cls, componentType, map);
                if (!eablkybsjg(componentType, typeRgvfuqvkyq6)) {
                    typeAgtfadlqog = iobyxmoadg(typeRgvfuqvkyq6);
                    type2 = typeAgtfadlqog;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            if (type3 != null) {
                return type3 == Void.TYPE ? type2 : type3;
            }
            map.put(typeVariable, Void.TYPE);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            type2 = vdvldrhtss(type, cls, typeVariable);
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    private static Type vdvldrhtss(Type type, Class cls, TypeVariable typeVariable) {
        Class clsWkgbmnqykc = wkgbmnqykc(typeVariable);
        if (clsWkgbmnqykc == null) {
            return typeVariable;
        }
        Type typeDxjokdxxww = dxjokdxxww(type, cls, clsWkgbmnqykc);
        if (!(typeDxjokdxxww instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeDxjokdxxww).getActualTypeArguments()[wflxmlrfwp(clsWkgbmnqykc.getTypeParameters(), typeVariable)];
    }

    private static int wflxmlrfwp(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (obj.equals(objArr[i13])) {
                return i13;
            }
        }
        throw new NoSuchElementException();
    }

    private static Class wkgbmnqykc(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static String zdlpuopuiu(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type zoijcleaow(Type type) {
        Type iobyxmoadgVar;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                iobyxmoadgVar = cls;
                iobyxmoadgVar = new iobyxmoadg(zoijcleaow(cls.getComponentType()));
            }
            iobyxmoadgVar = cls;
            return iobyxmoadgVar;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0425zoijcleaow(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new iobyxmoadg(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new ppxfxbqfkf(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }
}
