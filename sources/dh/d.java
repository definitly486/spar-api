package dh;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ConcurrentMap f28180iobyxmoadg = new ConcurrentHashMap();

    public static final oh.gtknphoqwx iobyxmoadg(Class cls) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cls, "<this>");
        ClassLoader classLoaderBtonecajqb = ph.gxszxtbevo.btonecajqb(cls);
        o oVar = new o(classLoaderBtonecajqb);
        ConcurrentMap concurrentMap = f28180iobyxmoadg;
        WeakReference weakReference = (WeakReference) concurrentMap.get(oVar);
        if (weakReference != null) {
            oh.gtknphoqwx gtknphoqwxVar = (oh.gtknphoqwx) weakReference.get();
            if (gtknphoqwxVar != null) {
                return gtknphoqwxVar;
            }
            concurrentMap.remove(oVar, weakReference);
        }
        oh.gtknphoqwx gtknphoqwxVarIobyxmoadg = oh.gtknphoqwx.f72847ppxfxbqfkf.iobyxmoadg(classLoaderBtonecajqb);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f28180iobyxmoadg;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(oVar, new WeakReference(gtknphoqwxVarIobyxmoadg));
                if (weakReference2 == null) {
                    oVar.iobyxmoadg(null);
                    return gtknphoqwxVarIobyxmoadg;
                }
                oh.gtknphoqwx gtknphoqwxVar2 = (oh.gtknphoqwx) weakReference2.get();
                if (gtknphoqwxVar2 != null) {
                    oVar.iobyxmoadg(null);
                    return gtknphoqwxVar2;
                }
                concurrentMap2.remove(oVar, weakReference2);
            } catch (Throwable th2) {
                oVar.iobyxmoadg(null);
                throw th2;
            }
        }
    }
}
