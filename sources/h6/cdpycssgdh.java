package h6;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.concurrent.TimeUnit;
import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f39517iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f39518zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ long f39519jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f39520yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f39521zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ojitshcjhn((sj.nufgyqmvbu) obj, (Throwable) obj2, ((Number) obj3).longValue(), (lg.gxszxtbevo) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f39521zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                Throwable th2 = (Throwable) this.f39520yggfygwlhe;
                long j13 = this.f39519jyumaefscl;
                g6.yggfygwlhe.eablkybsjg().wkgbmnqykc(cdpycssgdh.f39517iobyxmoadg, "Cannot check for unfinished work", th2);
                long jMin = Math.min(j13 * ((long) 30000), cdpycssgdh.f39518zoijcleaow);
                this.f39521zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(jMin, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true);
        }

        public final Object ojitshcjhn(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, long j13, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f39520yggfygwlhe = th2;
            iobyxmoadgVar.f39519jyumaefscl = j13;
            return iobyxmoadgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Context f39522jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f39523yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f39524zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Context context, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f39522jyumaefscl = context;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f39522jyumaefscl, gxszxtbevoVar);
            zoijcleaowVar.f39523yggfygwlhe = ((Boolean) obj).booleanValue();
            return zoijcleaowVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f39524zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            q6.zynmafqrjb.ppxfxbqfkf(this.f39522jyumaefscl, RescheduleReceiver.class, this.f39523yggfygwlhe);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static {
        String strDxjokdxxww = g6.yggfygwlhe.dxjokdxxww("UnfinishedWorkListener");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"UnfinishedWorkListener\")");
        f39517iobyxmoadg = strDxjokdxxww;
        f39518zoijcleaow = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void ppxfxbqfkf(pj.cllcsxoeiz cllcsxoeizVar, Context appContext, androidx.work.iobyxmoadg configuration, WorkDatabase db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cllcsxoeizVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appContext, "appContext");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        if (q6.cdpycssgdh.zoijcleaow(appContext, configuration)) {
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.vdvldrhtss(sj.dxjokdxxww.agtfadlqog(sj.dxjokdxxww.sopmlzcsov(db3.ulzqkzuiru().vdvldrhtss(), new iobyxmoadg(null)))), new zoijcleaow(appContext, null)), cllcsxoeizVar);
        }
    }
}
