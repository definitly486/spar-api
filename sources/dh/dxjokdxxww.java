package dh;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class dxjokdxxww extends iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f28184iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ConcurrentHashMap f28185zoijcleaow;

    public dxjokdxxww(tg.draadjrbmk compute) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(compute, "compute");
        this.f28184iobyxmoadg = compute;
        this.f28185zoijcleaow = new ConcurrentHashMap();
    }

    @Override // dh.iobyxmoadg
    public Object iobyxmoadg(Class key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f28185zoijcleaow;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f28184iobyxmoadg.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
