package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.agtfadlqog;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.btonecajqb;
import com.google.gson.internal.gtknphoqwx;
import com.google.gson.internal.nufgyqmvbu;
import com.google.gson.ppxfxbqfkf;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements vdvldrhtss {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final List f24994cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f24995iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Excluder f24996jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ppxfxbqfkf f24997yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.google.gson.internal.ppxfxbqfkf f24998zdlpuopuiu;

    public static abstract class Adapter<T, A> extends TypeAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Map f24999iobyxmoadg;

        Adapter(Map map) {
            this.f24999iobyxmoadg = map;
        }

        abstract Object eablkybsjg();

        abstract Object gxszxtbevo(Object obj);

        abstract void lqeggnwhkg(Object obj, ce.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar);

        @Override // com.google.gson.TypeAdapter
        public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IOException {
            if (obj == null) {
                ppxfxbqfkfVar.jyumaefscl();
                return;
            }
            ppxfxbqfkfVar.nufgyqmvbu();
            try {
                Iterator it = this.f24999iobyxmoadg.values().iterator();
                while (it.hasNext()) {
                    ((zoijcleaow) it.next()).ppxfxbqfkf(ppxfxbqfkfVar, obj);
                }
                ppxfxbqfkfVar.draadjrbmk();
            } catch (IllegalAccessException e13) {
                throw ae.iobyxmoadg.eablkybsjg(e13);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
            if (iobyxmoadgVar.kegysxyocb() == ce.zoijcleaow.NULL) {
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }
            Object objEablkybsjg = eablkybsjg();
            try {
                iobyxmoadgVar.wkgbmnqykc();
                while (iobyxmoadgVar.vdvldrhtss()) {
                    zoijcleaow zoijcleaowVar = (zoijcleaow) this.f24999iobyxmoadg.get(iobyxmoadgVar.istkbnxepw());
                    if (zoijcleaowVar == null || !zoijcleaowVar.f25014eablkybsjg) {
                        iobyxmoadgVar.yfnezrywwk();
                    } else {
                        lqeggnwhkg(objEablkybsjg, iobyxmoadgVar, zoijcleaowVar);
                    }
                }
                iobyxmoadgVar.draadjrbmk();
                return gxszxtbevo(objEablkybsjg);
            } catch (IllegalAccessException e13) {
                throw ae.iobyxmoadg.eablkybsjg(e13);
            } catch (IllegalStateException e14) {
                throw new JsonSyntaxException(e14);
            }
        }
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final nufgyqmvbu f25000zoijcleaow;

        FieldReflectionAdapter(nufgyqmvbu nufgyqmvbuVar, Map map) {
            super(map);
            this.f25000zoijcleaow = nufgyqmvbuVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object eablkybsjg() {
            return this.f25000zoijcleaow.iobyxmoadg();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object gxszxtbevo(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void lqeggnwhkg(Object obj, ce.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) {
            zoijcleaowVar.zoijcleaow(iobyxmoadgVar, obj);
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        static final Map f25001eablkybsjg = btonecajqb();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Object[] f25002ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Map f25003wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Constructor f25004zoijcleaow;

        RecordAdapter(Class cls, Map map, boolean z13) {
            super(map);
            this.f25003wkgbmnqykc = new HashMap();
            Constructor constructorDxjokdxxww = ae.iobyxmoadg.dxjokdxxww(cls);
            this.f25004zoijcleaow = constructorDxjokdxxww;
            if (z13) {
                ReflectiveTypeAdapterFactory.ppxfxbqfkf(null, constructorDxjokdxxww);
            } else {
                ae.iobyxmoadg.draadjrbmk(constructorDxjokdxxww);
            }
            String[] strArrBtonecajqb = ae.iobyxmoadg.btonecajqb(cls);
            for (int i13 = 0; i13 < strArrBtonecajqb.length; i13++) {
                this.f25003wkgbmnqykc.put(strArrBtonecajqb[i13], Integer.valueOf(i13));
            }
            Class<?>[] parameterTypes = this.f25004zoijcleaow.getParameterTypes();
            this.f25002ppxfxbqfkf = new Object[parameterTypes.length];
            for (int i14 = 0; i14 < parameterTypes.length; i14++) {
                this.f25002ppxfxbqfkf[i14] = f25001eablkybsjg.get(parameterTypes[i14]);
            }
        }

        private static Map btonecajqb() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public Object gxszxtbevo(Object[] objArr) {
            try {
                return this.f25004zoijcleaow.newInstance(objArr);
            } catch (IllegalAccessException e13) {
                throw ae.iobyxmoadg.eablkybsjg(e13);
            } catch (IllegalArgumentException e14) {
                e = e14;
                throw new RuntimeException("Failed to invoke constructor '" + ae.iobyxmoadg.ppxfxbqfkf(this.f25004zoijcleaow) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e15) {
                e = e15;
                throw new RuntimeException("Failed to invoke constructor '" + ae.iobyxmoadg.ppxfxbqfkf(this.f25004zoijcleaow) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e16) {
                throw new RuntimeException("Failed to invoke constructor '" + ae.iobyxmoadg.ppxfxbqfkf(this.f25004zoijcleaow) + "' with args " + Arrays.toString(objArr), e16.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
        public void lqeggnwhkg(Object[] objArr, ce.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) {
            Integer num = (Integer) this.f25003wkgbmnqykc.get(zoijcleaowVar.f25016ppxfxbqfkf);
            if (num != null) {
                zoijcleaowVar.iobyxmoadg(iobyxmoadgVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ae.iobyxmoadg.ppxfxbqfkf(this.f25004zoijcleaow) + "' for field with name '" + zoijcleaowVar.f25016ppxfxbqfkf + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public Object[] eablkybsjg() {
            return (Object[]) this.f25002ppxfxbqfkf.clone();
        }
    }

    class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        final /* synthetic */ Gson f25006btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        final /* synthetic */ boolean f25007draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f25008dxjokdxxww;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        final /* synthetic */ be.iobyxmoadg f25009gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ boolean f25010gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final /* synthetic */ Method f25011lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        final /* synthetic */ boolean f25012nufgyqmvbu;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        final /* synthetic */ boolean f25013wflxmlrfwp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(String str, Field field, boolean z13, boolean z14, boolean z15, Method method, boolean z16, TypeAdapter typeAdapter, Gson gson, be.iobyxmoadg iobyxmoadgVar, boolean z17, boolean z18) {
            super(str, field, z13, z14);
            this.f25010gxszxtbevo = z15;
            this.f25011lqeggnwhkg = method;
            this.f25012nufgyqmvbu = z16;
            this.f25008dxjokdxxww = typeAdapter;
            this.f25006btonecajqb = gson;
            this.f25009gtknphoqwx = iobyxmoadgVar;
            this.f25007draadjrbmk = z17;
            this.f25013wflxmlrfwp = z18;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.zoijcleaow
        void iobyxmoadg(ce.iobyxmoadg iobyxmoadgVar, int i13, Object[] objArr) {
            Object objZoijcleaow = this.f25008dxjokdxxww.zoijcleaow(iobyxmoadgVar);
            if (objZoijcleaow != null || !this.f25007draadjrbmk) {
                objArr[i13] = objZoijcleaow;
                return;
            }
            throw new JsonParseException("null is not allowed as value for record component '" + this.f25016ppxfxbqfkf + "' of primitive type; at path " + iobyxmoadgVar.gxszxtbevo());
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.zoijcleaow
        void ppxfxbqfkf(ce.ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.f25017wkgbmnqykc) {
                if (this.f25010gxszxtbevo) {
                    Method method = this.f25011lqeggnwhkg;
                    if (method == null) {
                        ReflectiveTypeAdapterFactory.ppxfxbqfkf(obj, this.f25018zoijcleaow);
                    } else {
                        ReflectiveTypeAdapterFactory.ppxfxbqfkf(obj, method);
                    }
                }
                Method method2 = this.f25011lqeggnwhkg;
                if (method2 != null) {
                    try {
                        objInvoke = method2.invoke(obj, null);
                    } catch (InvocationTargetException e13) {
                        throw new JsonIOException("Accessor " + ae.iobyxmoadg.lqeggnwhkg(this.f25011lqeggnwhkg, false) + " threw exception", e13.getCause());
                    }
                } else {
                    objInvoke = this.f25018zoijcleaow.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                ppxfxbqfkfVar.kcexrzcfyt(this.f25015iobyxmoadg);
                (this.f25012nufgyqmvbu ? this.f25008dxjokdxxww : new TypeAdapterRuntimeTypeWrapper(this.f25006btonecajqb, this.f25008dxjokdxxww, this.f25009gtknphoqwx.wkgbmnqykc())).wkgbmnqykc(ppxfxbqfkfVar, objInvoke);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.zoijcleaow
        void zoijcleaow(ce.iobyxmoadg iobyxmoadgVar, Object obj) throws IllegalAccessException {
            Object objZoijcleaow = this.f25008dxjokdxxww.zoijcleaow(iobyxmoadgVar);
            if (objZoijcleaow == null && this.f25007draadjrbmk) {
                return;
            }
            if (this.f25010gxszxtbevo) {
                ReflectiveTypeAdapterFactory.ppxfxbqfkf(obj, this.f25018zoijcleaow);
            } else if (this.f25013wflxmlrfwp) {
                throw new JsonIOException("Cannot set value of 'static final' " + ae.iobyxmoadg.lqeggnwhkg(this.f25018zoijcleaow, false));
            }
            this.f25018zoijcleaow.set(obj, objZoijcleaow);
        }
    }

    static abstract class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final boolean f25014eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f25015iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final String f25016ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final boolean f25017wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Field f25018zoijcleaow;

        protected zoijcleaow(String str, Field field, boolean z13, boolean z14) {
            this.f25015iobyxmoadg = str;
            this.f25018zoijcleaow = field;
            this.f25016ppxfxbqfkf = field.getName();
            this.f25017wkgbmnqykc = z13;
            this.f25014eablkybsjg = z14;
        }

        abstract void iobyxmoadg(ce.iobyxmoadg iobyxmoadgVar, int i13, Object[] objArr);

        abstract void ppxfxbqfkf(ce.ppxfxbqfkf ppxfxbqfkfVar, Object obj);

        abstract void zoijcleaow(ce.iobyxmoadg iobyxmoadgVar, Object obj);
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f24998zdlpuopuiu = ppxfxbqfkfVar;
        this.f24997yggfygwlhe = ppxfxbqfkfVar2;
        this.f24996jyumaefscl = excluder;
        this.f24995iwizpuwonk = jsonAdapterAnnotationTypeAdapterFactory;
        this.f24994cqumvgiudr = list;
    }

    private Map eablkybsjg(Gson gson, be.iobyxmoadg iobyxmoadgVar, Class cls, boolean z13, boolean z14) {
        boolean z15;
        Method method;
        int i13;
        int i14;
        boolean z16;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        be.iobyxmoadg iobyxmoadgVarZoijcleaow = iobyxmoadgVar;
        boolean z17 = z13;
        Class clsPpxfxbqfkf = cls;
        while (clsPpxfxbqfkf != Object.class) {
            Field[] declaredFields = clsPpxfxbqfkf.getDeclaredFields();
            boolean z18 = true;
            boolean z19 = false;
            if (clsPpxfxbqfkf != cls && declaredFields.length > 0) {
                agtfadlqog agtfadlqogVarZoijcleaow = gtknphoqwx.zoijcleaow(this.f24994cqumvgiudr, clsPpxfxbqfkf);
                if (agtfadlqogVarZoijcleaow == agtfadlqog.BLOCK_ALL) {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + clsPpxfxbqfkf + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z17 = agtfadlqogVarZoijcleaow == agtfadlqog.BLOCK_INACCESSIBLE;
            }
            boolean z23 = z17;
            int length = declaredFields.length;
            int i15 = 0;
            while (i15 < length) {
                Field field = declaredFields[i15];
                boolean zLqeggnwhkg = this.lqeggnwhkg(field, z18);
                boolean zLqeggnwhkg2 = this.lqeggnwhkg(field, z19);
                if (zLqeggnwhkg || zLqeggnwhkg2) {
                    zoijcleaow zoijcleaowVar = null;
                    if (!z14) {
                        z15 = zLqeggnwhkg2;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z15 = z19;
                    } else {
                        Method methodNufgyqmvbu = ae.iobyxmoadg.nufgyqmvbu(clsPpxfxbqfkf, field);
                        if (!z23) {
                            ae.iobyxmoadg.draadjrbmk(methodNufgyqmvbu);
                        }
                        if (methodNufgyqmvbu.getAnnotation(yd.ppxfxbqfkf.class) != null && field.getAnnotation(yd.ppxfxbqfkf.class) == null) {
                            throw new JsonIOException("@SerializedName on " + ae.iobyxmoadg.lqeggnwhkg(methodNufgyqmvbu, z19) + " is not supported");
                        }
                        z15 = zLqeggnwhkg2;
                        method = methodNufgyqmvbu;
                    }
                    if (!z23 && method == null) {
                        ae.iobyxmoadg.draadjrbmk(field);
                    }
                    Type typeOjitshcjhn = com.google.gson.internal.zoijcleaow.ojitshcjhn(iobyxmoadgVarZoijcleaow.wkgbmnqykc(), clsPpxfxbqfkf, field.getGenericType());
                    List listGxszxtbevo = this.gxszxtbevo(field);
                    int size = listGxszxtbevo.size();
                    int i16 = z19;
                    while (i16 < size) {
                        String str = (String) listGxszxtbevo.get(i16);
                        boolean z24 = i16 != 0 ? z19 : zLqeggnwhkg;
                        int i17 = i16;
                        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
                        int i18 = size;
                        List list = listGxszxtbevo;
                        Field field2 = field;
                        int i19 = i15;
                        int i23 = length;
                        boolean z25 = z19;
                        zoijcleaowVar = zoijcleaowVar2 == null ? (zoijcleaow) linkedHashMap.put(str, wkgbmnqykc(gson, field, method, str, be.iobyxmoadg.zoijcleaow(typeOjitshcjhn), z24, z15, z23)) : zoijcleaowVar2;
                        i16 = i17 + 1;
                        zLqeggnwhkg = z24;
                        i15 = i19;
                        size = i18;
                        listGxszxtbevo = list;
                        field = field2;
                        length = i23;
                        z19 = z25;
                    }
                    zoijcleaow zoijcleaowVar3 = zoijcleaowVar;
                    Field field3 = field;
                    i13 = i15;
                    i14 = length;
                    z16 = z19;
                    if (zoijcleaowVar3 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + zoijcleaowVar3.f25015iobyxmoadg + "'; conflict is caused by fields " + ae.iobyxmoadg.gxszxtbevo(zoijcleaowVar3.f25018zoijcleaow) + " and " + ae.iobyxmoadg.gxszxtbevo(field3));
                    }
                } else {
                    i13 = i15;
                    i14 = length;
                    z16 = z19;
                }
                i15 = i13 + 1;
                z18 = true;
                this = this;
                length = i14;
                z19 = z16;
            }
            iobyxmoadgVarZoijcleaow = be.iobyxmoadg.zoijcleaow(com.google.gson.internal.zoijcleaow.ojitshcjhn(iobyxmoadgVarZoijcleaow.wkgbmnqykc(), clsPpxfxbqfkf, clsPpxfxbqfkf.getGenericSuperclass()));
            clsPpxfxbqfkf = iobyxmoadgVarZoijcleaow.ppxfxbqfkf();
            z17 = z23;
        }
        return linkedHashMap;
    }

    private List gxszxtbevo(Field field) {
        yd.ppxfxbqfkf ppxfxbqfkfVar = (yd.ppxfxbqfkf) field.getAnnotation(yd.ppxfxbqfkf.class);
        if (ppxfxbqfkfVar == null) {
            return Collections.singletonList(this.f24997yggfygwlhe.iobyxmoadg(field));
        }
        String strValue = ppxfxbqfkfVar.value();
        String[] strArrAlternate = ppxfxbqfkfVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    private boolean lqeggnwhkg(Field field, boolean z13) {
        return (this.f24996jyumaefscl.ppxfxbqfkf(field.getType(), z13) || this.f24996jyumaefscl.gxszxtbevo(field, z13)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void ppxfxbqfkf(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (gtknphoqwx.iobyxmoadg(accessibleObject, obj)) {
            return;
        }
        throw new JsonIOException(ae.iobyxmoadg.lqeggnwhkg(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private zoijcleaow wkgbmnqykc(Gson gson, Field field, Method method, String str, be.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, boolean z15) {
        boolean zIobyxmoadg = btonecajqb.iobyxmoadg(iobyxmoadgVar.ppxfxbqfkf());
        int modifiers = field.getModifiers();
        boolean z16 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        yd.zoijcleaow zoijcleaowVar = (yd.zoijcleaow) field.getAnnotation(yd.zoijcleaow.class);
        TypeAdapter typeAdapterZoijcleaow = zoijcleaowVar != null ? this.f24995iwizpuwonk.zoijcleaow(this.f24998zdlpuopuiu, gson, iobyxmoadgVar, zoijcleaowVar) : null;
        boolean z17 = typeAdapterZoijcleaow != null;
        if (typeAdapterZoijcleaow == null) {
            typeAdapterZoijcleaow = gson.wflxmlrfwp(iobyxmoadgVar);
        }
        return new iobyxmoadg(str, field, z13, z14, z15, method, z17, typeAdapterZoijcleaow, gson, iobyxmoadgVar, zIobyxmoadg, z16);
    }

    @Override // com.google.gson.vdvldrhtss
    public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
        Class clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (!Object.class.isAssignableFrom(clsPpxfxbqfkf)) {
            return null;
        }
        agtfadlqog agtfadlqogVarZoijcleaow = gtknphoqwx.zoijcleaow(this.f24994cqumvgiudr, clsPpxfxbqfkf);
        if (agtfadlqogVarZoijcleaow != agtfadlqog.BLOCK_ALL) {
            boolean z13 = agtfadlqogVarZoijcleaow == agtfadlqog.BLOCK_INACCESSIBLE;
            return ae.iobyxmoadg.gtknphoqwx(clsPpxfxbqfkf) ? new RecordAdapter(clsPpxfxbqfkf, eablkybsjg(gson, iobyxmoadgVar, clsPpxfxbqfkf, z13, true), z13) : new FieldReflectionAdapter(this.f24998zdlpuopuiu.zoijcleaow(iobyxmoadgVar), eablkybsjg(gson, iobyxmoadgVar, clsPpxfxbqfkf, z13, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + clsPpxfxbqfkf + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
