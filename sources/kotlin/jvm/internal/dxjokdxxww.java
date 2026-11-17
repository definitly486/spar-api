package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww implements ah.wkgbmnqykc, nufgyqmvbu {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final HashMap f60005cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final HashMap f60006esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final HashMap f60007iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final Map f60008jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final Map f60009lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f60010yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Class f60011zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final String iobyxmoadg(Class jClass) {
            String str;
            zdlpuopuiu.btonecajqb(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) dxjokdxxww.f60006esjtqupxsv.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) dxjokdxxww.f60006esjtqupxsv.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final boolean ppxfxbqfkf(Object obj, Class jClass) {
            zdlpuopuiu.btonecajqb(jClass, "jClass");
            Map map = dxjokdxxww.f60008jyumaefscl;
            zdlpuopuiu.nufgyqmvbu(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return mbcevpiqjq.gtknphoqwx(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = sg.iobyxmoadg.ppxfxbqfkf(sg.iobyxmoadg.eablkybsjg(jClass));
            }
            return jClass.isInstance(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String zoijcleaow(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = mj.kcexrzcfyt.c(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = mj.kcexrzcfyt.c(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r0)
                java.lang.String r1 = mj.kcexrzcfyt.b(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.dxjokdxxww.eablkybsjg()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = kotlin.jvm.internal.dxjokdxxww.eablkybsjg()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.dxjokdxxww.iobyxmoadg.zoijcleaow(java.lang.Class):java.lang.String");
        }

        private iobyxmoadg() {
        }
    }

    static {
        List listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(tg.iobyxmoadg.class, tg.draadjrbmk.class, tg.rgvfuqvkyq.class, tg.vdvldrhtss.class, tg.oxmwwwfdhm.class, tg.kcexrzcfyt.class, tg.zdlpuopuiu.class, tg.yggfygwlhe.class, tg.jyumaefscl.class, tg.iwizpuwonk.class, tg.zoijcleaow.class, tg.ppxfxbqfkf.class, tg.wkgbmnqykc.class, tg.eablkybsjg.class, tg.gxszxtbevo.class, tg.lqeggnwhkg.class, tg.nufgyqmvbu.class, tg.dxjokdxxww.class, tg.btonecajqb.class, tg.gtknphoqwx.class, tg.wflxmlrfwp.class, tg.agtfadlqog.class, tg.ojitshcjhn.class);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRgvfuqvkyq, 10));
        int i13 = 0;
        for (Object obj : listRgvfuqvkyq) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            arrayList.add(gg.cqumvgiudr.iobyxmoadg((Class) obj, Integer.valueOf(i13)));
            i13 = i14;
        }
        f60008jyumaefscl = hg.tzroggbefp.kcexrzcfyt(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f60007iwizpuwonk = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f60005cqumvgiudr = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        zdlpuopuiu.dxjokdxxww(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("kotlin.jvm.internal.");
            zdlpuopuiu.lqeggnwhkg(str);
            sb3.append(mj.kcexrzcfyt.f(str, '.', null, 2, null));
            sb3.append("CompanionObject");
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(sb3.toString(), str + ".Companion");
            map3.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        for (Map.Entry entry : f60008jyumaefscl.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f60006esjtqupxsv = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            zdlpuopuiu.lqeggnwhkg(str2);
            linkedHashMap.put(key, mj.kcexrzcfyt.f(str2, '.', null, 2, null));
        }
        f60009lereixgezr = linkedHashMap;
    }

    public dxjokdxxww(Class jClass) {
        zdlpuopuiu.btonecajqb(jClass, "jClass");
        this.f60011zdlpuopuiu = jClass;
    }

    private final Void gxszxtbevo() {
        throw new sg.zoijcleaow();
    }

    public boolean equals(Object obj) {
        return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(sg.iobyxmoadg.ppxfxbqfkf(this), sg.iobyxmoadg.ppxfxbqfkf((ah.wkgbmnqykc) obj));
    }

    @Override // ah.wkgbmnqykc
    public int hashCode() {
        return sg.iobyxmoadg.ppxfxbqfkf(this).hashCode();
    }

    @Override // ah.wkgbmnqykc
    public String jyumaefscl() {
        return f60010yggfygwlhe.zoijcleaow(zoijcleaow());
    }

    @Override // ah.wkgbmnqykc
    public boolean kcexrzcfyt() {
        gxszxtbevo();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return zoijcleaow() + " (Kotlin reflection is not available)";
    }

    @Override // ah.wkgbmnqykc
    public String yggfygwlhe() {
        return f60010yggfygwlhe.iobyxmoadg(zoijcleaow());
    }

    @Override // ah.wkgbmnqykc
    public boolean zdlpuopuiu(Object obj) {
        return f60010yggfygwlhe.ppxfxbqfkf(obj, zoijcleaow());
    }

    @Override // kotlin.jvm.internal.nufgyqmvbu
    public Class zoijcleaow() {
        return this.f60011zdlpuopuiu;
    }
}
