package androidx.concurrent.futures;

import gg.wwaezpbzkn;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.nufgyqmvbu;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.rgvfuqvkyq;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc f7489zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
            super(1);
            this.f7489zdlpuopuiu = wkgbmnqykcVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            this.f7489zdlpuopuiu.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable ppxfxbqfkf(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            zdlpuopuiu.yggfygwlhe();
        }
        return cause;
    }

    public static final Object zoijcleaow(com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        try {
            if (wkgbmnqykcVar.isDone()) {
                return androidx.concurrent.futures.iobyxmoadg.btonecajqb(wkgbmnqykcVar);
            }
            rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
            wkgbmnqykcVar.iobyxmoadg(new lqeggnwhkg(wkgbmnqykcVar, rgvfuqvkyqVar), wkgbmnqykc.INSTANCE);
            rgvfuqvkyqVar.stevsuqkhv(new iobyxmoadg(wkgbmnqykcVar));
            Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            return objZdlpuopuiu;
        } catch (ExecutionException e13) {
            throw ppxfxbqfkf(e13);
        }
    }
}
