package ph;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zdlpuopuiu extends esjtqupxsv implements zh.gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Constructor f76618iobyxmoadg;

    public zdlpuopuiu(Constructor member) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(member, "member");
        this.f76618iobyxmoadg = member;
    }

    @Override // zh.gtknphoqwx
    public List dxjokdxxww() {
        Type[] genericParameterTypes = kegysxyocb().getGenericParameterTypes();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Class declaringClass = kegysxyocb().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) hg.agtfadlqog.yggfygwlhe(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = kegysxyocb().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + kegysxyocb());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) hg.agtfadlqog.yggfygwlhe(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(genericParameterTypes);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(parameterAnnotations);
        return tzroggbefp(genericParameterTypes, parameterAnnotations, kegysxyocb().isVarArgs());
    }

    @Override // zh.lereixgezr
    public List getTypeParameters() {
        TypeVariable[] typeParameters = kegysxyocb().getTypeParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new iozdgvuglv(typeVariable));
        }
        return arrayList;
    }

    @Override // ph.esjtqupxsv
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public Constructor kegysxyocb() {
        return this.f76618iobyxmoadg;
    }
}
