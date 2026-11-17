package hg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class iwizpuwonk {
    public static List eablkybsjg(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] gxszxtbevo(int i13, Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        if (i13 < array.length) {
            array[i13] = null;
        }
        return array;
    }

    public static List iobyxmoadg(List builder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
        return ((ig.zoijcleaow) builder).lereixgezr();
    }

    public static List ppxfxbqfkf() {
        return new ig.zoijcleaow(0, 1, null);
    }

    public static List wkgbmnqykc(int i13) {
        return new ig.zoijcleaow(i13);
    }

    public static final Object[] zoijcleaow(Object[] objArr, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(objArr, "<this>");
        if (z13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }
}
