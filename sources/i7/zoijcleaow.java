package i7;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static final Object iobyxmoadg(lk.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        draadjrbmk draadjrbmkVar = new draadjrbmk(eablkybsjgVar, rgvfuqvkyqVar);
        FirebasePerfOkHttpClient.enqueue(eablkybsjgVar, draadjrbmkVar);
        rgvfuqvkyqVar.stevsuqkhv(draadjrbmkVar);
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }
}
