package oh;

import bi.cqumvgiudr;
import gh.ojitshcjhn;
import hg.agtfadlqog;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f72858iobyxmoadg = new ppxfxbqfkf();

    private ppxfxbqfkf() {
    }

    private final void eablkybsjg(Class cls, cqumvgiudr.wkgbmnqykc wkgbmnqykcVar) throws InvocationTargetException {
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(cls.getDeclaredMethods());
        while (itIobyxmoadg.hasNext()) {
            Method method = (Method) itIobyxmoadg.next();
            ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(method.getName());
            zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f72859iobyxmoadg;
            zdlpuopuiu.lqeggnwhkg(method);
            cqumvgiudr.eablkybsjg eablkybsjgVarIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(gxszxtbevoVarGxszxtbevo, wflxmlrfwpVar.ppxfxbqfkf(method));
            if (eablkybsjgVarIobyxmoadg != null) {
                Iterator itIobyxmoadg2 = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(method.getDeclaredAnnotations());
                while (itIobyxmoadg2.hasNext()) {
                    Annotation annotation = (Annotation) itIobyxmoadg2.next();
                    zdlpuopuiu.lqeggnwhkg(annotation);
                    gxszxtbevo(eablkybsjgVarIobyxmoadg, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                zdlpuopuiu.dxjokdxxww(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    Iterator itIobyxmoadg3 = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(annotationArr[i13]);
                    while (itIobyxmoadg3.hasNext()) {
                        Annotation annotation2 = (Annotation) itIobyxmoadg3.next();
                        Class clsZoijcleaow = sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg(annotation2));
                        ii.zoijcleaow zoijcleaowVarEablkybsjg = ph.gxszxtbevo.eablkybsjg(clsZoijcleaow);
                        zdlpuopuiu.lqeggnwhkg(annotation2);
                        cqumvgiudr.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = eablkybsjgVarIobyxmoadg.ppxfxbqfkf(i13, zoijcleaowVarEablkybsjg, new zoijcleaow(annotation2));
                        if (iobyxmoadgVarPpxfxbqfkf != null) {
                            f72858iobyxmoadg.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, annotation2, clsZoijcleaow);
                        }
                    }
                }
                eablkybsjgVarIobyxmoadg.iobyxmoadg();
            }
        }
    }

    private final void gxszxtbevo(cqumvgiudr.ppxfxbqfkf ppxfxbqfkfVar, Annotation annotation) throws InvocationTargetException {
        Class clsZoijcleaow = sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg(annotation));
        cqumvgiudr.iobyxmoadg iobyxmoadgVarZoijcleaow = ppxfxbqfkfVar.zoijcleaow(ph.gxszxtbevo.eablkybsjg(clsZoijcleaow), new zoijcleaow(annotation));
        if (iobyxmoadgVarZoijcleaow != null) {
            f72858iobyxmoadg.nufgyqmvbu(iobyxmoadgVarZoijcleaow, annotation, clsZoijcleaow);
        }
    }

    private final ni.gxszxtbevo iobyxmoadg(Class cls) {
        int i13 = 0;
        while (cls.isArray()) {
            i13++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            ii.zoijcleaow zoijcleaowVarEablkybsjg = ph.gxszxtbevo.eablkybsjg(cls);
            ii.zoijcleaow zoijcleaowVarWflxmlrfwp = ih.ppxfxbqfkf.f44265iobyxmoadg.wflxmlrfwp(zoijcleaowVarEablkybsjg.iobyxmoadg());
            if (zoijcleaowVarWflxmlrfwp != null) {
                zoijcleaowVarEablkybsjg = zoijcleaowVarWflxmlrfwp;
            }
            return new ni.gxszxtbevo(zoijcleaowVarEablkybsjg, i13);
        }
        if (!zdlpuopuiu.eablkybsjg(cls, Void.TYPE)) {
            gh.draadjrbmk draadjrbmkVarBtonecajqb = qi.eablkybsjg.lqeggnwhkg(cls.getName()).btonecajqb();
            zdlpuopuiu.dxjokdxxww(draadjrbmkVarBtonecajqb, "getPrimitiveType(...)");
            return i13 > 0 ? new ni.gxszxtbevo(ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(draadjrbmkVarBtonecajqb.dxjokdxxww()), i13 - 1) : new ni.gxszxtbevo(ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(draadjrbmkVarBtonecajqb.draadjrbmk()), i13);
        }
        ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
        ii.ppxfxbqfkf ppxfxbqfkfVarDraadjrbmk = ojitshcjhn.iobyxmoadg.f37293gxszxtbevo.draadjrbmk();
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarDraadjrbmk, "toSafe(...)");
        return new ni.gxszxtbevo(iobyxmoadgVar.ppxfxbqfkf(ppxfxbqfkfVarDraadjrbmk), i13);
    }

    private final void lqeggnwhkg(cqumvgiudr.iobyxmoadg iobyxmoadgVar, ii.gxszxtbevo gxszxtbevoVar, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (zdlpuopuiu.eablkybsjg(enclosingClass, Class.class)) {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            iobyxmoadgVar.ppxfxbqfkf(gxszxtbevoVar, iobyxmoadg((Class) obj));
            return;
        }
        if (dxjokdxxww.f72846iobyxmoadg.contains(enclosingClass)) {
            iobyxmoadgVar.gxszxtbevo(gxszxtbevoVar, obj);
            return;
        }
        if (ph.gxszxtbevo.draadjrbmk(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            zdlpuopuiu.lqeggnwhkg(enclosingClass);
            ii.zoijcleaow zoijcleaowVarEablkybsjg = ph.gxszxtbevo.eablkybsjg(enclosingClass);
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(((Enum) obj).name());
            zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
            iobyxmoadgVar.wkgbmnqykc(gxszxtbevoVar, zoijcleaowVarEablkybsjg, gxszxtbevoVarGxszxtbevo);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            zdlpuopuiu.dxjokdxxww(interfaces, "getInterfaces(...)");
            Class cls = (Class) agtfadlqog.ixidwrxhsl(interfaces);
            zdlpuopuiu.lqeggnwhkg(cls);
            cqumvgiudr.iobyxmoadg iobyxmoadgVarEablkybsjg = iobyxmoadgVar.eablkybsjg(gxszxtbevoVar, ph.gxszxtbevo.eablkybsjg(cls));
            if (iobyxmoadgVarEablkybsjg == null) {
                return;
            }
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Annotation");
            nufgyqmvbu(iobyxmoadgVarEablkybsjg, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        cqumvgiudr.zoijcleaow zoijcleaowVarZoijcleaow = iobyxmoadgVar.zoijcleaow(gxszxtbevoVar);
        if (zoijcleaowVarZoijcleaow == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i13 = 0;
        if (componentType.isEnum()) {
            zdlpuopuiu.lqeggnwhkg(componentType);
            ii.zoijcleaow zoijcleaowVarEablkybsjg2 = ph.gxszxtbevo.eablkybsjg(componentType);
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i13 < length) {
                Object obj2 = objArr[i13];
                zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                ii.gxszxtbevo gxszxtbevoVarGxszxtbevo2 = ii.gxszxtbevo.gxszxtbevo(((Enum) obj2).name());
                zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo2, "identifier(...)");
                zoijcleaowVarZoijcleaow.wkgbmnqykc(zoijcleaowVarEablkybsjg2, gxszxtbevoVarGxszxtbevo2);
                i13++;
            }
        } else if (zdlpuopuiu.eablkybsjg(componentType, Class.class)) {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i13 < length2) {
                Object obj3 = objArr2[i13];
                zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                zoijcleaowVarZoijcleaow.zoijcleaow(iobyxmoadg((Class) obj3));
                i13++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i13 < length3) {
                Object obj4 = objArr3[i13];
                zdlpuopuiu.lqeggnwhkg(componentType);
                cqumvgiudr.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = zoijcleaowVarZoijcleaow.ppxfxbqfkf(ph.gxszxtbevo.eablkybsjg(componentType));
                if (iobyxmoadgVarPpxfxbqfkf != null) {
                    zdlpuopuiu.nufgyqmvbu(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, (Annotation) obj4, componentType);
                }
                i13++;
            }
        } else {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i13 < length4) {
                zoijcleaowVarZoijcleaow.eablkybsjg(objArr4[i13]);
                i13++;
            }
        }
        zoijcleaowVarZoijcleaow.iobyxmoadg();
    }

    private final void nufgyqmvbu(cqumvgiudr.iobyxmoadg iobyxmoadgVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(cls.getDeclaredMethods());
        while (itIobyxmoadg.hasNext()) {
            Method method = (Method) itIobyxmoadg.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                zdlpuopuiu.lqeggnwhkg(objInvoke);
                ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(method.getName());
                zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
                lqeggnwhkg(iobyxmoadgVar, gxszxtbevoVarGxszxtbevo, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        iobyxmoadgVar.iobyxmoadg();
    }

    private final void ppxfxbqfkf(Class cls, cqumvgiudr.wkgbmnqykc wkgbmnqykcVar) throws InvocationTargetException {
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(cls.getDeclaredConstructors());
        while (itIobyxmoadg.hasNext()) {
            Constructor constructor = (Constructor) itIobyxmoadg.next();
            ii.gxszxtbevo gxszxtbevoVar = ii.nufgyqmvbu.f44461btonecajqb;
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f72859iobyxmoadg;
            zdlpuopuiu.lqeggnwhkg(constructor);
            cqumvgiudr.eablkybsjg eablkybsjgVarIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(gxszxtbevoVar, wflxmlrfwpVar.iobyxmoadg(constructor));
            if (eablkybsjgVarIobyxmoadg != null) {
                Iterator itIobyxmoadg2 = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(constructor.getDeclaredAnnotations());
                while (itIobyxmoadg2.hasNext()) {
                    Annotation annotation = (Annotation) itIobyxmoadg2.next();
                    zdlpuopuiu.lqeggnwhkg(annotation);
                    gxszxtbevo(eablkybsjgVarIobyxmoadg, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                zdlpuopuiu.lqeggnwhkg(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        Iterator itIobyxmoadg3 = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(parameterAnnotations[i13]);
                        while (itIobyxmoadg3.hasNext()) {
                            Annotation annotation2 = (Annotation) itIobyxmoadg3.next();
                            Class clsZoijcleaow = sg.iobyxmoadg.zoijcleaow(sg.iobyxmoadg.iobyxmoadg(annotation2));
                            ii.zoijcleaow zoijcleaowVarEablkybsjg = ph.gxszxtbevo.eablkybsjg(clsZoijcleaow);
                            zdlpuopuiu.lqeggnwhkg(annotation2);
                            cqumvgiudr.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = eablkybsjgVarIobyxmoadg.ppxfxbqfkf(i13 + length, zoijcleaowVarEablkybsjg, new zoijcleaow(annotation2));
                            if (iobyxmoadgVarPpxfxbqfkf != null) {
                                f72858iobyxmoadg.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, annotation2, clsZoijcleaow);
                            }
                        }
                    }
                }
                eablkybsjgVarIobyxmoadg.iobyxmoadg();
            }
        }
    }

    private final void wkgbmnqykc(Class cls, cqumvgiudr.wkgbmnqykc wkgbmnqykcVar) throws InvocationTargetException {
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(cls.getDeclaredFields());
        while (itIobyxmoadg.hasNext()) {
            Field field = (Field) itIobyxmoadg.next();
            ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(field.getName());
            zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f72859iobyxmoadg;
            zdlpuopuiu.lqeggnwhkg(field);
            cqumvgiudr.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = wkgbmnqykcVar.zoijcleaow(gxszxtbevoVarGxszxtbevo, wflxmlrfwpVar.zoijcleaow(field), null);
            if (ppxfxbqfkfVarZoijcleaow != null) {
                Iterator itIobyxmoadg2 = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(field.getDeclaredAnnotations());
                while (itIobyxmoadg2.hasNext()) {
                    Annotation annotation = (Annotation) itIobyxmoadg2.next();
                    zdlpuopuiu.lqeggnwhkg(annotation);
                    gxszxtbevo(ppxfxbqfkfVarZoijcleaow, annotation);
                }
                ppxfxbqfkfVarZoijcleaow.iobyxmoadg();
            }
        }
    }

    public final void dxjokdxxww(Class klass, cqumvgiudr.wkgbmnqykc memberVisitor) {
        zdlpuopuiu.btonecajqb(klass, "klass");
        zdlpuopuiu.btonecajqb(memberVisitor, "memberVisitor");
        eablkybsjg(klass, memberVisitor);
        ppxfxbqfkf(klass, memberVisitor);
        wkgbmnqykc(klass, memberVisitor);
    }

    public final void zoijcleaow(Class klass, cqumvgiudr.ppxfxbqfkf visitor) {
        zdlpuopuiu.btonecajqb(klass, "klass");
        zdlpuopuiu.btonecajqb(visitor, "visitor");
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(klass.getDeclaredAnnotations());
        while (itIobyxmoadg.hasNext()) {
            Annotation annotation = (Annotation) itIobyxmoadg.next();
            zdlpuopuiu.lqeggnwhkg(annotation);
            gxszxtbevo(visitor, annotation);
        }
        visitor.iobyxmoadg();
    }
}
