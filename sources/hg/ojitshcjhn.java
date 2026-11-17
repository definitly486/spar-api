package hg;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ojitshcjhn {
    public static final Object[] iobyxmoadg(Object[] reference, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i13);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void ppxfxbqfkf(int i13, int i14) {
        if (i13 <= i14) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i13 + ") is greater than size (" + i14 + ").");
    }

    public static int zoijcleaow(Object[] objArr) {
        return Arrays.deepHashCode(objArr);
    }
}
