package q6;

import android.content.Context;
import android.os.Build;
import h6.sopmlzcsov;
import java.util.concurrent.Executor;
import pj.iyctptxqzt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f77981iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ Context f77982cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ g6.gtknphoqwx f77983iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ p6.yggfygwlhe f77984jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.work.ppxfxbqfkf f77985yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f77986zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(androidx.work.ppxfxbqfkf ppxfxbqfkfVar, p6.yggfygwlhe yggfygwlheVar, g6.gtknphoqwx gtknphoqwxVar, Context context, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f77985yggfygwlhe = ppxfxbqfkfVar;
            this.f77984jyumaefscl = yggfygwlheVar;
            this.f77983iwizpuwonk = gtknphoqwxVar;
            this.f77982cqumvgiudr = context;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f77985yggfygwlhe, this.f77984jyumaefscl, this.f77983iwizpuwonk, this.f77982cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f77986zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            com.google.common.util.concurrent.wkgbmnqykc foregroundInfoAsync = this.f77985yggfygwlhe.getForegroundInfoAsync();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
            androidx.work.ppxfxbqfkf ppxfxbqfkfVar = this.f77985yggfygwlhe;
            this.f77986zdlpuopuiu = 1;
            obj = sopmlzcsov.wkgbmnqykc(foregroundInfoAsync, ppxfxbqfkfVar, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            g6.btonecajqb btonecajqbVar = (g6.btonecajqb) obj;
            if (btonecajqbVar == null) {
                throw new IllegalStateException("Worker was marked important (" + this.f77984jyumaefscl.f75804ppxfxbqfkf + ") but did not provide ForegroundInfo");
            }
            String str = ylkuphrtab.f77981iobyxmoadg;
            p6.yggfygwlhe yggfygwlheVar = this.f77984jyumaefscl;
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(str, "Updating notification for " + yggfygwlheVar.f75804ppxfxbqfkf);
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f77983iwizpuwonk.iobyxmoadg(this.f77982cqumvgiudr, this.f77985yggfygwlhe.getId(), btonecajqbVar);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarIobyxmoadg, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
            this.f77986zdlpuopuiu = 2;
            obj = androidx.concurrent.futures.eablkybsjg.zoijcleaow(wkgbmnqykcVarIobyxmoadg, this);
            return obj == objGxszxtbevo ? objGxszxtbevo : obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static {
        String strDxjokdxxww = g6.yggfygwlhe.dxjokdxxww("WorkForegroundRunnable");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"WorkForegroundRunnable\")");
        f77981iobyxmoadg = strDxjokdxxww;
    }

    public static final Object zoijcleaow(Context context, p6.yggfygwlhe yggfygwlheVar, androidx.work.ppxfxbqfkf ppxfxbqfkfVar, g6.gtknphoqwx gtknphoqwxVar, r6.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!yggfygwlheVar.f75806vdvldrhtss || Build.VERSION.SDK_INT >= 31) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        Executor executorIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(executorIobyxmoadg, "taskExecutor.mainThreadExecutor");
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(iyctptxqzt.zoijcleaow(executorIobyxmoadg), new iobyxmoadg(ppxfxbqfkfVar, yggfygwlheVar, gtknphoqwxVar, context, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
