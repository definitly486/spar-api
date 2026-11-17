package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object[] f60001iobyxmoadg = new Object[0];

    public static final Object[] iobyxmoadg(Collection collection) {
        zdlpuopuiu.btonecajqb(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    objArrCopyOf[i13] = it.next();
                    if (i14 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i15 = ((i14 * 3) + 1) >>> 1;
                        if (i15 <= i14) {
                            i15 = 2147483645;
                            if (i14 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i15);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i14);
                        zdlpuopuiu.dxjokdxxww(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i13 = i14;
                }
            }
        }
        return f60001iobyxmoadg;
    }

    public static final Object[] zoijcleaow(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        zdlpuopuiu.btonecajqb(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i13 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            zdlpuopuiu.nufgyqmvbu(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i14 = i13 + 1;
            objArrCopyOf[i13] = it.next();
            if (i14 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i15 = ((i14 * 3) + 1) >>> 1;
                if (i15 <= i14) {
                    i15 = 2147483645;
                    if (i14 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i15);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i14] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i14);
                zdlpuopuiu.dxjokdxxww(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i13 = i14;
        }
    }
}
