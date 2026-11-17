package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {
    private static final void iobyxmoadg(int i13, int i14) {
        if (i14 <= i13) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i13 + ", got " + i14 + ". Please update the Kotlin standard library.").toString());
    }

    private static final int ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        try {
            Field declaredField = iobyxmoadgVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(iobyxmoadgVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
        String strC;
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        gxszxtbevo gxszxtbevoVarZoijcleaow = zoijcleaow(iobyxmoadgVar);
        if (gxszxtbevoVarZoijcleaow == null) {
            return null;
        }
        iobyxmoadg(1, gxszxtbevoVarZoijcleaow.v());
        int iPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVar);
        int i13 = iPpxfxbqfkf < 0 ? -1 : gxszxtbevoVarZoijcleaow.l()[iPpxfxbqfkf];
        String strZoijcleaow = dxjokdxxww.f59989iobyxmoadg.zoijcleaow(iobyxmoadgVar);
        if (strZoijcleaow == null) {
            strC = gxszxtbevoVarZoijcleaow.c();
        } else {
            strC = strZoijcleaow + '/' + gxszxtbevoVarZoijcleaow.c();
        }
        return new StackTraceElement(strC, gxszxtbevoVarZoijcleaow.m(), gxszxtbevoVarZoijcleaow.f(), i13);
    }

    private static final gxszxtbevo zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        return (gxszxtbevo) iobyxmoadgVar.getClass().getAnnotation(gxszxtbevo.class);
    }
}
