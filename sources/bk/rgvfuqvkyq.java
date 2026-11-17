package bk;

import fk.uawqvzlxes;
import fk.yfnezrywwk;
import gg.iwizpuwonk;
import hg.jyumaefscl;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class rgvfuqvkyq {
    private static final zoijcleaow eablkybsjg(ik.zoijcleaow zoijcleaowVar, Type type, boolean z13) {
        ArrayList<zoijcleaow> arrayList;
        if (type instanceof GenericArrayType) {
            return iobyxmoadg(zoijcleaowVar, (GenericArrayType) type, z13);
        }
        if (type instanceof Class) {
            return nufgyqmvbu(zoijcleaowVar, (Class) type, z13);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
                Object objYfnezrywwk = hg.agtfadlqog.yfnezrywwk(upperBounds);
                zdlpuopuiu.dxjokdxxww(objYfnezrywwk, "first(...)");
                return gxszxtbevo(zoijcleaowVar, (Type) objYfnezrywwk, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + cllcsxoeiz.zoijcleaow(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        zdlpuopuiu.nufgyqmvbu(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        zdlpuopuiu.lqeggnwhkg(actualTypeArguments);
        if (z13) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                zdlpuopuiu.lqeggnwhkg(type2);
                arrayList.add(ojitshcjhn.zoijcleaow(zoijcleaowVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                zdlpuopuiu.lqeggnwhkg(type3);
                zoijcleaow zoijcleaowVarWkgbmnqykc = ojitshcjhn.wkgbmnqykc(zoijcleaowVar, type3);
                if (zoijcleaowVarWkgbmnqykc == null) {
                    return null;
                }
                arrayList.add(zoijcleaowVarWkgbmnqykc);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            zoijcleaow zoijcleaowVarAgtfadlqog = ck.iobyxmoadg.agtfadlqog((zoijcleaow) arrayList.get(0));
            zdlpuopuiu.nufgyqmvbu(zoijcleaowVarAgtfadlqog, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return zoijcleaowVarAgtfadlqog;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            zoijcleaow zoijcleaowVarNufgyqmvbu = ck.iobyxmoadg.nufgyqmvbu((zoijcleaow) arrayList.get(0));
            zdlpuopuiu.nufgyqmvbu(zoijcleaowVarNufgyqmvbu, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return zoijcleaowVarNufgyqmvbu;
        }
        if (Map.class.isAssignableFrom(cls)) {
            zoijcleaow zoijcleaowVarGtknphoqwx = ck.iobyxmoadg.gtknphoqwx((zoijcleaow) arrayList.get(0), (zoijcleaow) arrayList.get(1));
            zdlpuopuiu.nufgyqmvbu(zoijcleaowVarGtknphoqwx, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return zoijcleaowVarGtknphoqwx;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            zoijcleaow zoijcleaowVarBtonecajqb = ck.iobyxmoadg.btonecajqb((zoijcleaow) arrayList.get(0), (zoijcleaow) arrayList.get(1));
            zdlpuopuiu.nufgyqmvbu(zoijcleaowVarBtonecajqb, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return zoijcleaowVarBtonecajqb;
        }
        if (gg.vdvldrhtss.class.isAssignableFrom(cls)) {
            zoijcleaow zoijcleaowVarWflxmlrfwp = ck.iobyxmoadg.wflxmlrfwp((zoijcleaow) arrayList.get(0), (zoijcleaow) arrayList.get(1));
            zdlpuopuiu.nufgyqmvbu(zoijcleaowVarWflxmlrfwp, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return zoijcleaowVarWflxmlrfwp;
        }
        if (iwizpuwonk.class.isAssignableFrom(cls)) {
            zoijcleaow zoijcleaowVarRgvfuqvkyq = ck.iobyxmoadg.rgvfuqvkyq((zoijcleaow) arrayList.get(0), (zoijcleaow) arrayList.get(1), (zoijcleaow) arrayList.get(2));
            zdlpuopuiu.nufgyqmvbu(zoijcleaowVarRgvfuqvkyq, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return zoijcleaowVarRgvfuqvkyq;
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList, 10));
        for (zoijcleaow zoijcleaowVar2 : arrayList) {
            zdlpuopuiu.nufgyqmvbu(zoijcleaowVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(zoijcleaowVar2);
        }
        return ppxfxbqfkf(zoijcleaowVar, cls, arrayList2);
    }

    static /* synthetic */ zoijcleaow gxszxtbevo(ik.zoijcleaow zoijcleaowVar, Type type, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return eablkybsjg(zoijcleaowVar, type, z13);
    }

    private static final zoijcleaow iobyxmoadg(ik.zoijcleaow zoijcleaowVar, GenericArrayType genericArrayType, boolean z13) {
        zoijcleaow zoijcleaowVarWkgbmnqykc;
        ah.wkgbmnqykc wkgbmnqykcVarEablkybsjg;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) hg.agtfadlqog.yfnezrywwk(upperBounds);
        }
        zdlpuopuiu.lqeggnwhkg(genericComponentType);
        if (z13) {
            zoijcleaowVarWkgbmnqykc = ojitshcjhn.zoijcleaow(zoijcleaowVar, genericComponentType);
        } else {
            zoijcleaowVarWkgbmnqykc = ojitshcjhn.wkgbmnqykc(zoijcleaowVar, genericComponentType);
            if (zoijcleaowVarWkgbmnqykc == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            zdlpuopuiu.nufgyqmvbu(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            wkgbmnqykcVarEablkybsjg = sg.iobyxmoadg.eablkybsjg((Class) rawType);
        } else {
            if (!(genericComponentType instanceof ah.wkgbmnqykc)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + cllcsxoeiz.zoijcleaow(genericComponentType.getClass()));
            }
            wkgbmnqykcVarEablkybsjg = (ah.wkgbmnqykc) genericComponentType;
        }
        zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVarEablkybsjg, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        zoijcleaow zoijcleaowVarIobyxmoadg = ck.iobyxmoadg.iobyxmoadg(wkgbmnqykcVarEablkybsjg, zoijcleaowVarWkgbmnqykc);
        zdlpuopuiu.nufgyqmvbu(zoijcleaowVarIobyxmoadg, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return zoijcleaowVarIobyxmoadg;
    }

    public static final zoijcleaow lqeggnwhkg(ik.zoijcleaow zoijcleaowVar, Type type) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        zdlpuopuiu.btonecajqb(type, "type");
        return eablkybsjg(zoijcleaowVar, type, false);
    }

    private static final zoijcleaow nufgyqmvbu(ik.zoijcleaow zoijcleaowVar, Class cls, boolean z13) {
        zoijcleaow zoijcleaowVarWkgbmnqykc;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            zdlpuopuiu.nufgyqmvbu(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return ppxfxbqfkf(zoijcleaowVar, cls, jyumaefscl.wflxmlrfwp());
        }
        Class<?> componentType = cls.getComponentType();
        zdlpuopuiu.dxjokdxxww(componentType, "getComponentType(...)");
        if (z13) {
            zoijcleaowVarWkgbmnqykc = ojitshcjhn.zoijcleaow(zoijcleaowVar, componentType);
        } else {
            zoijcleaowVarWkgbmnqykc = ojitshcjhn.wkgbmnqykc(zoijcleaowVar, componentType);
            if (zoijcleaowVarWkgbmnqykc == null) {
                return null;
            }
        }
        ah.wkgbmnqykc wkgbmnqykcVarEablkybsjg = sg.iobyxmoadg.eablkybsjg(componentType);
        zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVarEablkybsjg, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        zoijcleaow zoijcleaowVarIobyxmoadg = ck.iobyxmoadg.iobyxmoadg(wkgbmnqykcVarEablkybsjg, zoijcleaowVarWkgbmnqykc);
        zdlpuopuiu.nufgyqmvbu(zoijcleaowVarIobyxmoadg, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return zoijcleaowVarIobyxmoadg;
    }

    private static final zoijcleaow ppxfxbqfkf(ik.zoijcleaow zoijcleaowVar, Class cls, List list) throws IllegalAccessException, InvocationTargetException {
        zoijcleaow[] zoijcleaowVarArr = (zoijcleaow[]) list.toArray(new zoijcleaow[0]);
        zoijcleaow zoijcleaowVarWkgbmnqykc = yfnezrywwk.wkgbmnqykc(cls, (zoijcleaow[]) Arrays.copyOf(zoijcleaowVarArr, zoijcleaowVarArr.length));
        if (zoijcleaowVarWkgbmnqykc != null) {
            return zoijcleaowVarWkgbmnqykc;
        }
        ah.wkgbmnqykc wkgbmnqykcVarEablkybsjg = sg.iobyxmoadg.eablkybsjg(cls);
        zoijcleaow zoijcleaowVarZoijcleaow = uawqvzlxes.zoijcleaow(wkgbmnqykcVarEablkybsjg);
        if (zoijcleaowVarZoijcleaow != null) {
            return zoijcleaowVarZoijcleaow;
        }
        zoijcleaow zoijcleaowVarZoijcleaow2 = zoijcleaowVar.zoijcleaow(wkgbmnqykcVarEablkybsjg, list);
        if (zoijcleaowVarZoijcleaow2 != null) {
            return zoijcleaowVarZoijcleaow2;
        }
        if (cls.isInterface()) {
            return new gxszxtbevo(sg.iobyxmoadg.eablkybsjg(cls));
        }
        return null;
    }

    public static final zoijcleaow wkgbmnqykc(ik.zoijcleaow zoijcleaowVar, Type type) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        zdlpuopuiu.btonecajqb(type, "type");
        zoijcleaow zoijcleaowVarEablkybsjg = eablkybsjg(zoijcleaowVar, type, true);
        if (zoijcleaowVarEablkybsjg != null) {
            return zoijcleaowVarEablkybsjg;
        }
        yfnezrywwk.agtfadlqog(zoijcleaow(type));
        throw new KotlinNothingValueException();
    }

    private static final Class zoijcleaow(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            zdlpuopuiu.dxjokdxxww(rawType, "getRawType(...)");
            return zoijcleaow(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
            Object objYfnezrywwk = hg.agtfadlqog.yfnezrywwk(upperBounds);
            zdlpuopuiu.dxjokdxxww(objYfnezrywwk, "first(...)");
            return zoijcleaow((Type) objYfnezrywwk);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            zdlpuopuiu.dxjokdxxww(genericComponentType, "getGenericComponentType(...)");
            return zoijcleaow(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + cllcsxoeiz.zoijcleaow(type.getClass()));
    }
}
