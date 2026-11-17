package ph;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jh.nuxfzjnpeb;
import jh.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class esjtqupxsv extends yggfygwlhe implements btonecajqb, pmvmpeiblj, zh.vdvldrhtss {
    @Override // zh.wkgbmnqykc
    public boolean cdpycssgdh() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof esjtqupxsv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kegysxyocb(), ((esjtqupxsv) obj).kegysxyocb());
    }

    @Override // zh.wkgbmnqykc
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // zh.zdlpuopuiu
    public ii.gxszxtbevo getName() {
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo;
        String name = kegysxyocb().getName();
        return (name == null || (gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(name)) == null) ? ii.nufgyqmvbu.f44477zoijcleaow : gxszxtbevoVarGxszxtbevo;
    }

    @Override // zh.kcexrzcfyt
    public nuxfzjnpeb getVisibility() {
        int iYlkuphrtab = ylkuphrtab();
        if (Modifier.isPublic(iYlkuphrtab)) {
            return zeieaojujs.nufgyqmvbu.f51375ppxfxbqfkf;
        }
        if (Modifier.isPrivate(iYlkuphrtab)) {
            return zeieaojujs.eablkybsjg.f51371ppxfxbqfkf;
        }
        if (Modifier.isProtected(iYlkuphrtab)) {
            return Modifier.isStatic(iYlkuphrtab) ? nh.ppxfxbqfkf.f70061ppxfxbqfkf : nh.zoijcleaow.f70062ppxfxbqfkf;
        }
        return nh.iobyxmoadg.f70060ppxfxbqfkf;
    }

    public int hashCode() {
        return kegysxyocb().hashCode();
    }

    @Override // zh.kcexrzcfyt
    public boolean isAbstract() {
        return Modifier.isAbstract(ylkuphrtab());
    }

    @Override // zh.kcexrzcfyt
    public boolean isFinal() {
        return Modifier.isFinal(ylkuphrtab());
    }

    @Override // ph.btonecajqb
    public AnnotatedElement kcexrzcfyt() {
        Member memberKegysxyocb = kegysxyocb();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(memberKegysxyocb, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberKegysxyocb;
    }

    public abstract Member kegysxyocb();

    @Override // zh.wkgbmnqykc
    public /* bridge */ /* synthetic */ zh.iobyxmoadg lqeggnwhkg(ii.ppxfxbqfkf ppxfxbqfkfVar) {
        return lqeggnwhkg(ppxfxbqfkfVar);
    }

    @Override // zh.vdvldrhtss
    /* JADX INFO: renamed from: stevsuqkhv, reason: merged with bridge method [inline-methods] */
    public vdvldrhtss wypolnanlu() {
        Class<?> declaringClass = kegysxyocb().getDeclaringClass();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(declaringClass, "getDeclaringClass(...)");
        return new vdvldrhtss(declaringClass);
    }

    public String toString() {
        return getClass().getName() + ": " + kegysxyocb();
    }

    protected final List tzroggbefp(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z13) throws IllegalAccessException, InvocationTargetException {
        String str;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List listZoijcleaow = ppxfxbqfkf.f76598iobyxmoadg.zoijcleaow(kegysxyocb());
        int size = listZoijcleaow != null ? listZoijcleaow.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i13 = 0;
        while (i13 < length) {
            yadqdtsiqt yadqdtsiqtVarIobyxmoadg = yadqdtsiqt.f76617iobyxmoadg.iobyxmoadg(parameterTypes[i13]);
            if (listZoijcleaow != null) {
                str = (String) hg.jyumaefscl.lrnfpwlwnk(listZoijcleaow, i13 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i13 + '+' + size + " (name=" + getName() + " type=" + yadqdtsiqtVarIobyxmoadg + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new lmojexxdyd(yadqdtsiqtVarIobyxmoadg, parameterAnnotations[i13], str, z13 && i13 == hg.agtfadlqog.opjhrmiecq(parameterTypes)));
            i13++;
        }
        return arrayList;
    }

    @Override // zh.kcexrzcfyt
    public boolean wkgbmnqykc() {
        return Modifier.isStatic(ylkuphrtab());
    }

    @Override // ph.pmvmpeiblj
    public int ylkuphrtab() {
        return kegysxyocb().getModifiers();
    }

    @Override // ph.btonecajqb, zh.wkgbmnqykc
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listZoijcleaow;
        AnnotatedElement annotatedElementKcexrzcfyt = kcexrzcfyt();
        return (annotatedElementKcexrzcfyt == null || (declaredAnnotations = annotatedElementKcexrzcfyt.getDeclaredAnnotations()) == null || (listZoijcleaow = gtknphoqwx.zoijcleaow(declaredAnnotations)) == null) ? hg.jyumaefscl.wflxmlrfwp() : listZoijcleaow;
    }

    @Override // ph.btonecajqb, zh.wkgbmnqykc
    public lqeggnwhkg lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        AnnotatedElement annotatedElementKcexrzcfyt = kcexrzcfyt();
        if (annotatedElementKcexrzcfyt == null || (declaredAnnotations = annotatedElementKcexrzcfyt.getDeclaredAnnotations()) == null) {
            return null;
        }
        return gtknphoqwx.iobyxmoadg(declaredAnnotations, fqName);
    }
}
