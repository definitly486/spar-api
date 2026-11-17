package lm;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
abstract class yggfygwlhe {
    yggfygwlhe() {
    }

    static yggfygwlhe zoijcleaow(zdlpuopuiu zdlpuopuiuVar, Method method) {
        oxmwwwfdhm oxmwwwfdhmVarZoijcleaow = oxmwwwfdhm.zoijcleaow(zdlpuopuiuVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (cqumvgiudr.btonecajqb(genericReturnType)) {
            throw cqumvgiudr.wflxmlrfwp(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return btonecajqb.gxszxtbevo(zdlpuopuiuVar, method, oxmwwwfdhmVarZoijcleaow);
        }
        throw cqumvgiudr.wflxmlrfwp(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract Object iobyxmoadg(Object[] objArr);
}
