package nm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lm.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx extends lm.gxszxtbevo.iobyxmoadg {
    private gtknphoqwx() {
    }

    public static gtknphoqwx gxszxtbevo() {
        return new gtknphoqwx();
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public lm.gxszxtbevo ppxfxbqfkf(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, zdlpuopuiu zdlpuopuiuVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return iobyxmoadg.f70333iobyxmoadg;
        }
        return null;
    }

    @Override // lm.gxszxtbevo.iobyxmoadg
    public lm.gxszxtbevo wkgbmnqykc(Type type, Annotation[] annotationArr, zdlpuopuiu zdlpuopuiuVar) {
        if (type == String.class) {
            return btonecajqb.f70329iobyxmoadg;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return zoijcleaow.f70339iobyxmoadg;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return ppxfxbqfkf.f70337iobyxmoadg;
        }
        if (type == Character.class || type == Character.TYPE) {
            return wkgbmnqykc.f70338iobyxmoadg;
        }
        if (type == Double.class || type == Double.TYPE) {
            return eablkybsjg.f70331iobyxmoadg;
        }
        if (type == Float.class || type == Float.TYPE) {
            return gxszxtbevo.f70332iobyxmoadg;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return lqeggnwhkg.f70335iobyxmoadg;
        }
        if (type == Long.class || type == Long.TYPE) {
            return nufgyqmvbu.f70336iobyxmoadg;
        }
        if (type == Short.class || type == Short.TYPE) {
            return dxjokdxxww.f70330iobyxmoadg;
        }
        return null;
    }
}
