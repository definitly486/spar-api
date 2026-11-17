package lm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lk.zynmafqrjb;
import om.esjtqupxsv;

/* JADX INFO: loaded from: classes3.dex */
final class oxmwwwfdhm {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ojitshcjhn[] f63514btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f63515dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lk.yggfygwlhe f63516eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    final boolean f63517gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lk.cqumvgiudr f63518gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Method f63519iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f63520lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f63521nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final String f63522ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f63523wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lk.jyumaefscl f63524zoijcleaow;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final Pattern f63525cqumvgiudr = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final Pattern f63526esjtqupxsv = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        String f63527agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        boolean f63528btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        boolean f63529draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        boolean f63530dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final Type[] f63531eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        boolean f63532gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f63533gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final zdlpuopuiu f63534iobyxmoadg;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f63535iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        ojitshcjhn[] f63536jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        lk.yggfygwlhe f63537kcexrzcfyt;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        boolean f63538lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        boolean f63539nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        boolean f63540ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        String f63541oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final Annotation[] f63542ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        boolean f63543rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        boolean f63544vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        boolean f63545wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final Annotation[][] f63546wkgbmnqykc;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Set f63547yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        lk.cqumvgiudr f63548zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Method f63549zoijcleaow;

        iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, Method method) {
            this.f63534iobyxmoadg = zdlpuopuiuVar;
            this.f63549zoijcleaow = method;
            this.f63542ppxfxbqfkf = method.getAnnotations();
            this.f63531eablkybsjg = method.getGenericParameterTypes();
            this.f63546wkgbmnqykc = method.getParameterAnnotations();
        }

        private void btonecajqb(int i13, Type type) {
            if (cqumvgiudr.btonecajqb(type)) {
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        private void dxjokdxxww(int i13, String str) {
            if (!f63526esjtqupxsv.matcher(str).matches()) {
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Path parameter name must match %s. Found: %s", f63525cqumvgiudr.pattern(), str);
            }
            if (!this.f63547yggfygwlhe.contains(str)) {
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "URL \"%s\" does not contain \"{%s}\".", this.f63541oxmwwwfdhm, str);
            }
        }

        private void eablkybsjg(Annotation annotation) {
            if (annotation instanceof om.zoijcleaow) {
                wkgbmnqykc("DELETE", ((om.zoijcleaow) annotation).value(), false);
                return;
            }
            if (annotation instanceof om.gxszxtbevo) {
                wkgbmnqykc("GET", ((om.gxszxtbevo) annotation).value(), false);
                return;
            }
            if (annotation instanceof om.lqeggnwhkg) {
                wkgbmnqykc("HEAD", ((om.lqeggnwhkg) annotation).value(), false);
                return;
            }
            if (annotation instanceof om.agtfadlqog) {
                wkgbmnqykc("PATCH", ((om.agtfadlqog) annotation).value(), true);
                return;
            }
            if (annotation instanceof om.ojitshcjhn) {
                wkgbmnqykc("POST", ((om.ojitshcjhn) annotation).value(), true);
                return;
            }
            if (annotation instanceof om.rgvfuqvkyq) {
                wkgbmnqykc("PUT", ((om.rgvfuqvkyq) annotation).value(), true);
                return;
            }
            if (annotation instanceof om.wflxmlrfwp) {
                wkgbmnqykc("OPTIONS", ((om.wflxmlrfwp) annotation).value(), false);
                return;
            }
            if (annotation instanceof om.nufgyqmvbu) {
                om.nufgyqmvbu nufgyqmvbuVar = (om.nufgyqmvbu) annotation;
                wkgbmnqykc(nufgyqmvbuVar.method(), nufgyqmvbuVar.path(), nufgyqmvbuVar.hasBody());
                return;
            }
            if (annotation instanceof om.gtknphoqwx) {
                String[] strArrValue = ((om.gtknphoqwx) annotation).value();
                if (strArrValue.length == 0) {
                    throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "@Headers annotation is empty.", new Object[0]);
                }
                this.f63537kcexrzcfyt = ppxfxbqfkf(strArrValue);
                return;
            }
            if (annotation instanceof om.draadjrbmk) {
                if (this.f63543rgvfuqvkyq) {
                    throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f63544vdvldrhtss = true;
            } else if (annotation instanceof om.eablkybsjg) {
                if (this.f63544vdvldrhtss) {
                    throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f63543rgvfuqvkyq = true;
            }
        }

        private ojitshcjhn gxszxtbevo(int i13, Type type, Annotation[] annotationArr, boolean z13) {
            ojitshcjhn ojitshcjhnVar;
            if (annotationArr != null) {
                ojitshcjhnVar = null;
                for (Annotation annotation : annotationArr) {
                    ojitshcjhn ojitshcjhnVarLqeggnwhkg = lqeggnwhkg(i13, type, annotationArr, annotation);
                    if (ojitshcjhnVarLqeggnwhkg != null) {
                        if (ojitshcjhnVar != null) {
                            throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        ojitshcjhnVar = ojitshcjhnVarLqeggnwhkg;
                    }
                }
            } else {
                ojitshcjhnVar = null;
            }
            if (ojitshcjhnVar != null) {
                return ojitshcjhnVar;
            }
            if (z13) {
                try {
                    if (cqumvgiudr.nufgyqmvbu(type) == lg.gxszxtbevo.class) {
                        this.f63535iwizpuwonk = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "No Retrofit annotation found.", new Object[0]);
        }

        private static Class iobyxmoadg(Class cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        private ojitshcjhn lqeggnwhkg(int i13, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof esjtqupxsv) {
                btonecajqb(i13, type);
                if (this.f63545wflxmlrfwp) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f63530dxjokdxxww) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f63528btonecajqb) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f63532gtknphoqwx) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f63529draadjrbmk) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f63541oxmwwwfdhm != null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Url cannot be used with @%s URL", this.f63527agtfadlqog);
                }
                this.f63545wflxmlrfwp = true;
                if (type == lk.jyumaefscl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new ojitshcjhn.rgvfuqvkyq(this.f63549zoijcleaow, i13);
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof om.kcexrzcfyt) {
                btonecajqb(i13, type);
                if (this.f63528btonecajqb) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f63532gtknphoqwx) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f63529draadjrbmk) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f63545wflxmlrfwp) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f63541oxmwwwfdhm == null) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Path can only be used with relative url on @%s", this.f63527agtfadlqog);
                }
                this.f63530dxjokdxxww = true;
                om.kcexrzcfyt kcexrzcfytVar = (om.kcexrzcfyt) annotation;
                String strValue = kcexrzcfytVar.value();
                dxjokdxxww(i13, strValue);
                return new ojitshcjhn.gtknphoqwx(this.f63549zoijcleaow, i13, strValue, this.f63534iobyxmoadg.dxjokdxxww(type, annotationArr), kcexrzcfytVar.encoded());
            }
            if (annotation instanceof om.zdlpuopuiu) {
                btonecajqb(i13, type);
                om.zdlpuopuiu zdlpuopuiuVar = (om.zdlpuopuiu) annotation;
                String strValue2 = zdlpuopuiuVar.value();
                boolean zEncoded = zdlpuopuiuVar.encoded();
                Class clsNufgyqmvbu = cqumvgiudr.nufgyqmvbu(type);
                this.f63528btonecajqb = true;
                if (!Iterable.class.isAssignableFrom(clsNufgyqmvbu)) {
                    if (!clsNufgyqmvbu.isArray()) {
                        return new ojitshcjhn.draadjrbmk(strValue2, this.f63534iobyxmoadg.dxjokdxxww(type, annotationArr), zEncoded);
                    }
                    return new ojitshcjhn.draadjrbmk(strValue2, this.f63534iobyxmoadg.dxjokdxxww(iobyxmoadg(clsNufgyqmvbu.getComponentType()), annotationArr), zEncoded).zoijcleaow();
                }
                if (type instanceof ParameterizedType) {
                    return new ojitshcjhn.draadjrbmk(strValue2, this.f63534iobyxmoadg.dxjokdxxww(cqumvgiudr.lqeggnwhkg(0, (ParameterizedType) type), annotationArr), zEncoded).ppxfxbqfkf();
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, clsNufgyqmvbu.getSimpleName() + " must include generic type (e.g., " + clsNufgyqmvbu.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof om.jyumaefscl) {
                btonecajqb(i13, type);
                boolean zEncoded2 = ((om.jyumaefscl) annotation).encoded();
                Class clsNufgyqmvbu2 = cqumvgiudr.nufgyqmvbu(type);
                this.f63532gtknphoqwx = true;
                if (!Iterable.class.isAssignableFrom(clsNufgyqmvbu2)) {
                    if (!clsNufgyqmvbu2.isArray()) {
                        return new ojitshcjhn.agtfadlqog(this.f63534iobyxmoadg.dxjokdxxww(type, annotationArr), zEncoded2);
                    }
                    return new ojitshcjhn.agtfadlqog(this.f63534iobyxmoadg.dxjokdxxww(iobyxmoadg(clsNufgyqmvbu2.getComponentType()), annotationArr), zEncoded2).zoijcleaow();
                }
                if (type instanceof ParameterizedType) {
                    return new ojitshcjhn.agtfadlqog(this.f63534iobyxmoadg.dxjokdxxww(cqumvgiudr.lqeggnwhkg(0, (ParameterizedType) type), annotationArr), zEncoded2).ppxfxbqfkf();
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, clsNufgyqmvbu2.getSimpleName() + " must include generic type (e.g., " + clsNufgyqmvbu2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof om.yggfygwlhe) {
                btonecajqb(i13, type);
                Class clsNufgyqmvbu3 = cqumvgiudr.nufgyqmvbu(type);
                this.f63529draadjrbmk = true;
                if (!Map.class.isAssignableFrom(clsNufgyqmvbu3)) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeDxjokdxxww = cqumvgiudr.dxjokdxxww(type, clsNufgyqmvbu3, Map.class);
                if (!(typeDxjokdxxww instanceof ParameterizedType)) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeDxjokdxxww;
                Type typeLqeggnwhkg = cqumvgiudr.lqeggnwhkg(0, parameterizedType);
                if (String.class == typeLqeggnwhkg) {
                    return new ojitshcjhn.wflxmlrfwp(this.f63549zoijcleaow, i13, this.f63534iobyxmoadg.dxjokdxxww(cqumvgiudr.lqeggnwhkg(1, parameterizedType), annotationArr), ((om.yggfygwlhe) annotation).encoded());
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@QueryMap keys must be of type String: " + typeLqeggnwhkg, new Object[0]);
            }
            if (annotation instanceof om.dxjokdxxww) {
                btonecajqb(i13, type);
                String strValue3 = ((om.dxjokdxxww) annotation).value();
                Class clsNufgyqmvbu4 = cqumvgiudr.nufgyqmvbu(type);
                if (!Iterable.class.isAssignableFrom(clsNufgyqmvbu4)) {
                    if (!clsNufgyqmvbu4.isArray()) {
                        return new ojitshcjhn.gxszxtbevo(strValue3, this.f63534iobyxmoadg.dxjokdxxww(type, annotationArr));
                    }
                    return new ojitshcjhn.gxszxtbevo(strValue3, this.f63534iobyxmoadg.dxjokdxxww(iobyxmoadg(clsNufgyqmvbu4.getComponentType()), annotationArr)).zoijcleaow();
                }
                if (type instanceof ParameterizedType) {
                    return new ojitshcjhn.gxszxtbevo(strValue3, this.f63534iobyxmoadg.dxjokdxxww(cqumvgiudr.lqeggnwhkg(0, (ParameterizedType) type), annotationArr)).ppxfxbqfkf();
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, clsNufgyqmvbu4.getSimpleName() + " must include generic type (e.g., " + clsNufgyqmvbu4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof om.btonecajqb) {
                if (type == lk.yggfygwlhe.class) {
                    return new ojitshcjhn.nufgyqmvbu(this.f63549zoijcleaow, i13);
                }
                btonecajqb(i13, type);
                Class clsNufgyqmvbu5 = cqumvgiudr.nufgyqmvbu(type);
                if (!Map.class.isAssignableFrom(clsNufgyqmvbu5)) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeDxjokdxxww2 = cqumvgiudr.dxjokdxxww(type, clsNufgyqmvbu5, Map.class);
                if (!(typeDxjokdxxww2 instanceof ParameterizedType)) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeDxjokdxxww2;
                Type typeLqeggnwhkg2 = cqumvgiudr.lqeggnwhkg(0, parameterizedType2);
                if (String.class == typeLqeggnwhkg2) {
                    return new ojitshcjhn.lqeggnwhkg(this.f63549zoijcleaow, i13, this.f63534iobyxmoadg.dxjokdxxww(cqumvgiudr.lqeggnwhkg(1, parameterizedType2), annotationArr));
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@HeaderMap keys must be of type String: " + typeLqeggnwhkg2, new Object[0]);
            }
            if (annotation instanceof om.ppxfxbqfkf) {
                btonecajqb(i13, type);
                if (!this.f63543rgvfuqvkyq) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                om.ppxfxbqfkf ppxfxbqfkfVar = (om.ppxfxbqfkf) annotation;
                String strValue4 = ppxfxbqfkfVar.value();
                boolean zEncoded3 = ppxfxbqfkfVar.encoded();
                this.f63533gxszxtbevo = true;
                Class clsNufgyqmvbu6 = cqumvgiudr.nufgyqmvbu(type);
                if (!Iterable.class.isAssignableFrom(clsNufgyqmvbu6)) {
                    if (!clsNufgyqmvbu6.isArray()) {
                        return new ojitshcjhn.wkgbmnqykc(strValue4, this.f63534iobyxmoadg.dxjokdxxww(type, annotationArr), zEncoded3);
                    }
                    return new ojitshcjhn.wkgbmnqykc(strValue4, this.f63534iobyxmoadg.dxjokdxxww(iobyxmoadg(clsNufgyqmvbu6.getComponentType()), annotationArr), zEncoded3).zoijcleaow();
                }
                if (type instanceof ParameterizedType) {
                    return new ojitshcjhn.wkgbmnqykc(strValue4, this.f63534iobyxmoadg.dxjokdxxww(cqumvgiudr.lqeggnwhkg(0, (ParameterizedType) type), annotationArr), zEncoded3).ppxfxbqfkf();
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, clsNufgyqmvbu6.getSimpleName() + " must include generic type (e.g., " + clsNufgyqmvbu6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof om.wkgbmnqykc) {
                btonecajqb(i13, type);
                if (!this.f63543rgvfuqvkyq) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsNufgyqmvbu7 = cqumvgiudr.nufgyqmvbu(type);
                if (!Map.class.isAssignableFrom(clsNufgyqmvbu7)) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeDxjokdxxww3 = cqumvgiudr.dxjokdxxww(type, clsNufgyqmvbu7, Map.class);
                if (!(typeDxjokdxxww3 instanceof ParameterizedType)) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeDxjokdxxww3;
                Type typeLqeggnwhkg3 = cqumvgiudr.lqeggnwhkg(0, parameterizedType3);
                if (String.class == typeLqeggnwhkg3) {
                    gxszxtbevo gxszxtbevoVarDxjokdxxww = this.f63534iobyxmoadg.dxjokdxxww(cqumvgiudr.lqeggnwhkg(1, parameterizedType3), annotationArr);
                    this.f63533gxszxtbevo = true;
                    return new ojitshcjhn.eablkybsjg(this.f63549zoijcleaow, i13, gxszxtbevoVarDxjokdxxww, ((om.wkgbmnqykc) annotation).encoded());
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@FieldMap keys must be of type String: " + typeLqeggnwhkg3, new Object[0]);
            }
            if (!(annotation instanceof om.vdvldrhtss)) {
                if (annotation instanceof om.oxmwwwfdhm) {
                    btonecajqb(i13, type);
                    if (!this.f63544vdvldrhtss) {
                        throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f63538lqeggnwhkg = true;
                    Class clsNufgyqmvbu8 = cqumvgiudr.nufgyqmvbu(type);
                    if (!Map.class.isAssignableFrom(clsNufgyqmvbu8)) {
                        throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeDxjokdxxww4 = cqumvgiudr.dxjokdxxww(type, clsNufgyqmvbu8, Map.class);
                    if (!(typeDxjokdxxww4 instanceof ParameterizedType)) {
                        throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeDxjokdxxww4;
                    Type typeLqeggnwhkg4 = cqumvgiudr.lqeggnwhkg(0, parameterizedType4);
                    if (String.class == typeLqeggnwhkg4) {
                        Type typeLqeggnwhkg5 = cqumvgiudr.lqeggnwhkg(1, parameterizedType4);
                        if (lk.esjtqupxsv.ppxfxbqfkf.class.isAssignableFrom(cqumvgiudr.nufgyqmvbu(typeLqeggnwhkg5))) {
                            throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new ojitshcjhn.btonecajqb(this.f63549zoijcleaow, i13, this.f63534iobyxmoadg.lqeggnwhkg(typeLqeggnwhkg5, annotationArr, this.f63542ppxfxbqfkf), ((om.oxmwwwfdhm) annotation).encoding());
                    }
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@PartMap keys must be of type String: " + typeLqeggnwhkg4, new Object[0]);
                }
                if (annotation instanceof om.iobyxmoadg) {
                    btonecajqb(i13, type);
                    if (this.f63543rgvfuqvkyq || this.f63544vdvldrhtss) {
                        throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f63539nufgyqmvbu) {
                        throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        gxszxtbevo gxszxtbevoVarLqeggnwhkg = this.f63534iobyxmoadg.lqeggnwhkg(type, annotationArr, this.f63542ppxfxbqfkf);
                        this.f63539nufgyqmvbu = true;
                        return new ojitshcjhn.ppxfxbqfkf(this.f63549zoijcleaow, i13, gxszxtbevoVarLqeggnwhkg);
                    } catch (RuntimeException e13) {
                        throw cqumvgiudr.rgvfuqvkyq(this.f63549zoijcleaow, e13, i13, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof om.cqumvgiudr)) {
                    return null;
                }
                btonecajqb(i13, type);
                Class clsNufgyqmvbu9 = cqumvgiudr.nufgyqmvbu(type);
                for (int i14 = i13 - 1; i14 >= 0; i14--) {
                    ojitshcjhn ojitshcjhnVar = this.f63536jyumaefscl[i14];
                    if ((ojitshcjhnVar instanceof ojitshcjhn.vdvldrhtss) && ((ojitshcjhn.vdvldrhtss) ojitshcjhnVar).f63505iobyxmoadg.equals(clsNufgyqmvbu9)) {
                        throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Tag type " + clsNufgyqmvbu9.getName() + " is duplicate of parameter #" + (i14 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new ojitshcjhn.vdvldrhtss(clsNufgyqmvbu9);
            }
            btonecajqb(i13, type);
            if (!this.f63544vdvldrhtss) {
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            om.vdvldrhtss vdvldrhtssVar = (om.vdvldrhtss) annotation;
            this.f63538lqeggnwhkg = true;
            String strValue5 = vdvldrhtssVar.value();
            Class clsNufgyqmvbu10 = cqumvgiudr.nufgyqmvbu(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsNufgyqmvbu10)) {
                    if (clsNufgyqmvbu10.isArray()) {
                        if (lk.esjtqupxsv.ppxfxbqfkf.class.isAssignableFrom(clsNufgyqmvbu10.getComponentType())) {
                            return ojitshcjhn.C1295ojitshcjhn.f63499iobyxmoadg.zoijcleaow();
                        }
                        throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (lk.esjtqupxsv.ppxfxbqfkf.class.isAssignableFrom(clsNufgyqmvbu10)) {
                        return ojitshcjhn.C1295ojitshcjhn.f63499iobyxmoadg;
                    }
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (lk.esjtqupxsv.ppxfxbqfkf.class.isAssignableFrom(cqumvgiudr.nufgyqmvbu(cqumvgiudr.lqeggnwhkg(0, (ParameterizedType) type)))) {
                        return ojitshcjhn.C1295ojitshcjhn.f63499iobyxmoadg.ppxfxbqfkf();
                    }
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, clsNufgyqmvbu10.getSimpleName() + " must include generic type (e.g., " + clsNufgyqmvbu10.getSimpleName() + "<String>)", new Object[0]);
            }
            lk.yggfygwlhe yggfygwlheVarGxszxtbevo = lk.yggfygwlhe.gxszxtbevo("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", vdvldrhtssVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsNufgyqmvbu10)) {
                if (!clsNufgyqmvbu10.isArray()) {
                    if (lk.esjtqupxsv.ppxfxbqfkf.class.isAssignableFrom(clsNufgyqmvbu10)) {
                        throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new ojitshcjhn.dxjokdxxww(this.f63549zoijcleaow, i13, yggfygwlheVarGxszxtbevo, this.f63534iobyxmoadg.lqeggnwhkg(type, annotationArr, this.f63542ppxfxbqfkf));
                }
                Class clsIobyxmoadg = iobyxmoadg(clsNufgyqmvbu10.getComponentType());
                if (lk.esjtqupxsv.ppxfxbqfkf.class.isAssignableFrom(clsIobyxmoadg)) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new ojitshcjhn.dxjokdxxww(this.f63549zoijcleaow, i13, yggfygwlheVarGxszxtbevo, this.f63534iobyxmoadg.lqeggnwhkg(clsIobyxmoadg, annotationArr, this.f63542ppxfxbqfkf)).zoijcleaow();
            }
            if (type instanceof ParameterizedType) {
                Type typeLqeggnwhkg6 = cqumvgiudr.lqeggnwhkg(0, (ParameterizedType) type);
                if (lk.esjtqupxsv.ppxfxbqfkf.class.isAssignableFrom(cqumvgiudr.nufgyqmvbu(typeLqeggnwhkg6))) {
                    throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new ojitshcjhn.dxjokdxxww(this.f63549zoijcleaow, i13, yggfygwlheVarGxszxtbevo, this.f63534iobyxmoadg.lqeggnwhkg(typeLqeggnwhkg6, annotationArr, this.f63542ppxfxbqfkf)).ppxfxbqfkf();
            }
            throw cqumvgiudr.ojitshcjhn(this.f63549zoijcleaow, i13, clsNufgyqmvbu10.getSimpleName() + " must include generic type (e.g., " + clsNufgyqmvbu10.getSimpleName() + "<String>)", new Object[0]);
        }

        static Set nufgyqmvbu(String str) {
            Matcher matcher = f63525cqumvgiudr.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private lk.yggfygwlhe ppxfxbqfkf(String[] strArr) {
            lk.yggfygwlhe.iobyxmoadg iobyxmoadgVar = new lk.yggfygwlhe.iobyxmoadg();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f63548zdlpuopuiu = lk.cqumvgiudr.ppxfxbqfkf(strTrim);
                    } catch (IllegalArgumentException e13) {
                        throw cqumvgiudr.agtfadlqog(this.f63549zoijcleaow, e13, "Malformed content type: %s", strTrim);
                    }
                } else {
                    iobyxmoadgVar.iobyxmoadg(strSubstring, strTrim);
                }
            }
            return iobyxmoadgVar.gxszxtbevo();
        }

        private void wkgbmnqykc(String str, String str2, boolean z13) {
            String str3 = this.f63527agtfadlqog;
            if (str3 != null) {
                throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f63527agtfadlqog = str;
            this.f63540ojitshcjhn = z13;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f63525cqumvgiudr.matcher(strSubstring).find()) {
                    throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f63541oxmwwwfdhm = str2;
            this.f63547yggfygwlhe = nufgyqmvbu(str2);
        }

        oxmwwwfdhm zoijcleaow() {
            for (Annotation annotation : this.f63542ppxfxbqfkf) {
                eablkybsjg(annotation);
            }
            if (this.f63527agtfadlqog == null) {
                throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f63540ojitshcjhn) {
                if (this.f63544vdvldrhtss) {
                    throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f63543rgvfuqvkyq) {
                    throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f63546wkgbmnqykc.length;
            this.f63536jyumaefscl = new ojitshcjhn[length];
            int i13 = length - 1;
            int i14 = 0;
            while (i14 < length) {
                this.f63536jyumaefscl[i14] = gxszxtbevo(i14, this.f63531eablkybsjg[i14], this.f63546wkgbmnqykc[i14], i14 == i13);
                i14++;
            }
            if (this.f63541oxmwwwfdhm == null && !this.f63545wflxmlrfwp) {
                throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "Missing either @%s URL or @Url parameter.", this.f63527agtfadlqog);
            }
            boolean z13 = this.f63543rgvfuqvkyq;
            if (!z13 && !this.f63544vdvldrhtss && !this.f63540ojitshcjhn && this.f63539nufgyqmvbu) {
                throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z13 && !this.f63533gxszxtbevo) {
                throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f63544vdvldrhtss || this.f63538lqeggnwhkg) {
                return new oxmwwwfdhm(this);
            }
            throw cqumvgiudr.wflxmlrfwp(this.f63549zoijcleaow, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    oxmwwwfdhm(iobyxmoadg iobyxmoadgVar) {
        this.f63519iobyxmoadg = iobyxmoadgVar.f63549zoijcleaow;
        this.f63524zoijcleaow = iobyxmoadgVar.f63534iobyxmoadg.f63589ppxfxbqfkf;
        this.f63522ppxfxbqfkf = iobyxmoadgVar.f63527agtfadlqog;
        this.f63523wkgbmnqykc = iobyxmoadgVar.f63541oxmwwwfdhm;
        this.f63516eablkybsjg = iobyxmoadgVar.f63537kcexrzcfyt;
        this.f63518gxszxtbevo = iobyxmoadgVar.f63548zdlpuopuiu;
        this.f63520lqeggnwhkg = iobyxmoadgVar.f63540ojitshcjhn;
        this.f63521nufgyqmvbu = iobyxmoadgVar.f63543rgvfuqvkyq;
        this.f63515dxjokdxxww = iobyxmoadgVar.f63544vdvldrhtss;
        this.f63514btonecajqb = iobyxmoadgVar.f63536jyumaefscl;
        this.f63517gtknphoqwx = iobyxmoadgVar.f63535iwizpuwonk;
    }

    static oxmwwwfdhm zoijcleaow(zdlpuopuiu zdlpuopuiuVar, Method method) {
        return new iobyxmoadg(zdlpuopuiuVar, method).zoijcleaow();
    }

    zynmafqrjb iobyxmoadg(Object[] objArr) {
        ojitshcjhn[] ojitshcjhnVarArr = this.f63514btonecajqb;
        int length = objArr.length;
        if (length != ojitshcjhnVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + ojitshcjhnVarArr.length + ")");
        }
        vdvldrhtss vdvldrhtssVar = new vdvldrhtss(this.f63522ppxfxbqfkf, this.f63524zoijcleaow, this.f63523wkgbmnqykc, this.f63516eablkybsjg, this.f63518gxszxtbevo, this.f63520lqeggnwhkg, this.f63521nufgyqmvbu, this.f63515dxjokdxxww);
        if (this.f63517gtknphoqwx) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i13 = 0; i13 < length; i13++) {
            arrayList.add(objArr[i13]);
            ojitshcjhnVarArr[i13].iobyxmoadg(vdvldrhtssVar, objArr[i13]);
        }
        return vdvldrhtssVar.gtknphoqwx().oxmwwwfdhm(gtknphoqwx.class, new gtknphoqwx(this.f63519iobyxmoadg, arrayList)).zoijcleaow();
    }
}
