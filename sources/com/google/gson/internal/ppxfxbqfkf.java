package com.google.gson.internal;

import androidx.appcompat.app.yggfygwlhe;
import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f25143iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f25144ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f25145zoijcleaow;

    class agtfadlqog implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Type f25146iobyxmoadg;

        agtfadlqog(Type type) {
            this.f25146iobyxmoadg = type;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            Type type = this.f25146iobyxmoadg;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f25146iobyxmoadg.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f25146iobyxmoadg.toString());
        }
    }

    class btonecajqb implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Class f25147iobyxmoadg;

        btonecajqb(Class cls) {
            this.f25147iobyxmoadg = cls;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            try {
                return com.google.gson.internal.wflxmlrfwp.f25171iobyxmoadg.wkgbmnqykc(this.f25147iobyxmoadg);
            } catch (Exception e13) {
                throw new RuntimeException("Unable to create instance of " + this.f25147iobyxmoadg + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e13);
            }
        }
    }

    class draadjrbmk implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f25149iobyxmoadg;

        draadjrbmk(String str) {
            this.f25149iobyxmoadg = str;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            throw new JsonIOException(this.f25149iobyxmoadg);
        }
    }

    class dxjokdxxww implements com.google.gson.internal.nufgyqmvbu {
        dxjokdxxww() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new com.google.gson.internal.lqeggnwhkg();
        }
    }

    class eablkybsjg implements com.google.gson.internal.nufgyqmvbu {
        eablkybsjg() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new ConcurrentSkipListMap();
        }
    }

    class gtknphoqwx implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f25151iobyxmoadg;

        gtknphoqwx(String str) {
            this.f25151iobyxmoadg = str;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            throw new JsonIOException(this.f25151iobyxmoadg);
        }
    }

    class gxszxtbevo implements com.google.gson.internal.nufgyqmvbu {
        gxszxtbevo() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new ConcurrentHashMap();
        }
    }

    class iobyxmoadg implements com.google.gson.internal.nufgyqmvbu {
        iobyxmoadg() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new TreeSet();
        }
    }

    class lqeggnwhkg implements com.google.gson.internal.nufgyqmvbu {
        lqeggnwhkg() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new TreeMap();
        }
    }

    class nufgyqmvbu implements com.google.gson.internal.nufgyqmvbu {
        nufgyqmvbu() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new LinkedHashMap();
        }
    }

    class ojitshcjhn implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Type f25153iobyxmoadg;

        ojitshcjhn(Type type) {
            this.f25153iobyxmoadg = type;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            Type type = this.f25153iobyxmoadg;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumMap type: " + this.f25153iobyxmoadg.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f25153iobyxmoadg.toString());
        }
    }

    class oxmwwwfdhm implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Constructor f25154iobyxmoadg;

        oxmwwwfdhm(Constructor constructor) {
            this.f25154iobyxmoadg = constructor;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            try {
                return this.f25154iobyxmoadg.newInstance(null);
            } catch (IllegalAccessException e13) {
                throw ae.iobyxmoadg.eablkybsjg(e13);
            } catch (InstantiationException e14) {
                throw new RuntimeException("Failed to invoke constructor '" + ae.iobyxmoadg.ppxfxbqfkf(this.f25154iobyxmoadg) + "' with no args", e14);
            } catch (InvocationTargetException e15) {
                throw new RuntimeException("Failed to invoke constructor '" + ae.iobyxmoadg.ppxfxbqfkf(this.f25154iobyxmoadg) + "' with no args", e15.getCause());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    class C0423ppxfxbqfkf implements com.google.gson.internal.nufgyqmvbu {
        C0423ppxfxbqfkf() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new ArrayDeque();
        }
    }

    class rgvfuqvkyq implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f25155iobyxmoadg;

        rgvfuqvkyq(String str) {
            this.f25155iobyxmoadg = str;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            throw new JsonIOException(this.f25155iobyxmoadg);
        }
    }

    class vdvldrhtss implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f25156iobyxmoadg;

        vdvldrhtss(String str) {
            this.f25156iobyxmoadg = str;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            throw new JsonIOException(this.f25156iobyxmoadg);
        }
    }

    class wflxmlrfwp implements com.google.gson.internal.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f25157iobyxmoadg;

        wflxmlrfwp(String str) {
            this.f25157iobyxmoadg = str;
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            throw new JsonIOException(this.f25157iobyxmoadg);
        }
    }

    class wkgbmnqykc implements com.google.gson.internal.nufgyqmvbu {
        wkgbmnqykc() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new ArrayList();
        }
    }

    class zoijcleaow implements com.google.gson.internal.nufgyqmvbu {
        zoijcleaow() {
        }

        @Override // com.google.gson.internal.nufgyqmvbu
        public Object iobyxmoadg() {
            return new LinkedHashSet();
        }
    }

    public ppxfxbqfkf(Map map, boolean z13, List list) {
        this.f25143iobyxmoadg = map;
        this.f25145zoijcleaow = z13;
        this.f25144ppxfxbqfkf = list;
    }

    private static com.google.gson.internal.nufgyqmvbu eablkybsjg(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new agtfadlqog(type);
        }
        if (cls == EnumMap.class) {
            return new ojitshcjhn(type);
        }
        return null;
    }

    private com.google.gson.internal.nufgyqmvbu gxszxtbevo(Class cls) {
        if (this.f25145zoijcleaow) {
            return new btonecajqb(cls);
        }
        return new gtknphoqwx("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    static String iobyxmoadg(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    private static com.google.gson.internal.nufgyqmvbu ppxfxbqfkf(Class cls, com.google.gson.agtfadlqog agtfadlqogVar) {
        String strWflxmlrfwp;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.agtfadlqog agtfadlqogVar2 = com.google.gson.agtfadlqog.ALLOW;
            if (agtfadlqogVar == agtfadlqogVar2 || (com.google.gson.internal.gtknphoqwx.iobyxmoadg(declaredConstructor, null) && (agtfadlqogVar != com.google.gson.agtfadlqog.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (agtfadlqogVar != agtfadlqogVar2 || (strWflxmlrfwp = ae.iobyxmoadg.wflxmlrfwp(declaredConstructor)) == null) ? new oxmwwwfdhm(declaredConstructor) : new vdvldrhtss(strWflxmlrfwp);
            }
            return new rgvfuqvkyq("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static com.google.gson.internal.nufgyqmvbu wkgbmnqykc(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new iobyxmoadg();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new zoijcleaow();
            }
            return Queue.class.isAssignableFrom(cls) ? new C0423ppxfxbqfkf() : new wkgbmnqykc();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new eablkybsjg();
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new gxszxtbevo();
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new lqeggnwhkg();
        }
        return (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(be.iobyxmoadg.zoijcleaow(((ParameterizedType) type).getActualTypeArguments()[0]).ppxfxbqfkf())) ? new dxjokdxxww() : new nufgyqmvbu();
    }

    public String toString() {
        return this.f25143iobyxmoadg.toString();
    }

    public com.google.gson.internal.nufgyqmvbu zoijcleaow(be.iobyxmoadg iobyxmoadgVar) {
        Type typeWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        Class clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        yggfygwlhe.iobyxmoadg(this.f25143iobyxmoadg.get(typeWkgbmnqykc));
        yggfygwlhe.iobyxmoadg(this.f25143iobyxmoadg.get(clsPpxfxbqfkf));
        com.google.gson.internal.nufgyqmvbu nufgyqmvbuVarEablkybsjg = eablkybsjg(typeWkgbmnqykc, clsPpxfxbqfkf);
        if (nufgyqmvbuVarEablkybsjg != null) {
            return nufgyqmvbuVarEablkybsjg;
        }
        com.google.gson.agtfadlqog agtfadlqogVarZoijcleaow = com.google.gson.internal.gtknphoqwx.zoijcleaow(this.f25144ppxfxbqfkf, clsPpxfxbqfkf);
        com.google.gson.internal.nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = ppxfxbqfkf(clsPpxfxbqfkf, agtfadlqogVarZoijcleaow);
        if (nufgyqmvbuVarPpxfxbqfkf != null) {
            return nufgyqmvbuVarPpxfxbqfkf;
        }
        com.google.gson.internal.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = wkgbmnqykc(typeWkgbmnqykc, clsPpxfxbqfkf);
        if (nufgyqmvbuVarWkgbmnqykc != null) {
            return nufgyqmvbuVarWkgbmnqykc;
        }
        String strIobyxmoadg = iobyxmoadg(clsPpxfxbqfkf);
        if (strIobyxmoadg != null) {
            return new draadjrbmk(strIobyxmoadg);
        }
        if (agtfadlqogVarZoijcleaow == com.google.gson.agtfadlqog.ALLOW) {
            return gxszxtbevo(clsPpxfxbqfkf);
        }
        return new wflxmlrfwp("Unable to create instance of " + clsPpxfxbqfkf + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }
}
