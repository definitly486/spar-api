package oh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wflxmlrfwp f72859iobyxmoadg = new wflxmlrfwp();

    private wflxmlrfwp() {
    }

    public final String iobyxmoadg(Constructor constructor) {
        zdlpuopuiu.btonecajqb(constructor, "constructor");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("(");
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(constructor.getParameterTypes());
        while (itIobyxmoadg.hasNext()) {
            Class cls = (Class) itIobyxmoadg.next();
            zdlpuopuiu.lqeggnwhkg(cls);
            sb3.append(ph.gxszxtbevo.gxszxtbevo(cls));
        }
        sb3.append(")V");
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final String ppxfxbqfkf(Method method) {
        zdlpuopuiu.btonecajqb(method, "method");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("(");
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(method.getParameterTypes());
        while (itIobyxmoadg.hasNext()) {
            Class cls = (Class) itIobyxmoadg.next();
            zdlpuopuiu.lqeggnwhkg(cls);
            sb3.append(ph.gxszxtbevo.gxszxtbevo(cls));
        }
        sb3.append(")");
        Class<?> returnType = method.getReturnType();
        zdlpuopuiu.dxjokdxxww(returnType, "getReturnType(...)");
        sb3.append(ph.gxszxtbevo.gxszxtbevo(returnType));
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final String zoijcleaow(Field field) {
        zdlpuopuiu.btonecajqb(field, "field");
        Class<?> type = field.getType();
        zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return ph.gxszxtbevo.gxszxtbevo(type);
    }
}
