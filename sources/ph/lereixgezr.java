package ph;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lereixgezr extends esjtqupxsv implements zh.oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Method f76588iobyxmoadg;

    public lereixgezr(Method member) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(member, "member");
        this.f76588iobyxmoadg = member;
    }

    @Override // zh.oxmwwwfdhm
    public boolean cllcsxoeiz() {
        return rgvfuqvkyq() != null;
    }

    @Override // zh.oxmwwwfdhm
    public List dxjokdxxww() {
        Type[] genericParameterTypes = kegysxyocb().getGenericParameterTypes();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = kegysxyocb().getParameterAnnotations();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameterAnnotations, "getParameterAnnotations(...)");
        return tzroggbefp(genericParameterTypes, parameterAnnotations, kegysxyocb().isVarArgs());
    }

    @Override // zh.lereixgezr
    public List getTypeParameters() {
        TypeVariable<Method>[] typeParameters = kegysxyocb().getTypeParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new iozdgvuglv(typeVariable));
        }
        return arrayList;
    }

    @Override // ph.esjtqupxsv
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public Method kegysxyocb() {
        return this.f76588iobyxmoadg;
    }

    @Override // zh.oxmwwwfdhm
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public yadqdtsiqt getReturnType() {
        yadqdtsiqt.iobyxmoadg iobyxmoadgVar = yadqdtsiqt.f76617iobyxmoadg;
        Type genericReturnType = kegysxyocb().getGenericReturnType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(genericReturnType, "getGenericReturnType(...)");
        return iobyxmoadgVar.iobyxmoadg(genericReturnType);
    }

    @Override // zh.oxmwwwfdhm
    public zh.zoijcleaow rgvfuqvkyq() {
        Object defaultValue = kegysxyocb().getDefaultValue();
        if (defaultValue != null) {
            return nufgyqmvbu.f76594zoijcleaow.iobyxmoadg(defaultValue, null);
        }
        return null;
    }
}
