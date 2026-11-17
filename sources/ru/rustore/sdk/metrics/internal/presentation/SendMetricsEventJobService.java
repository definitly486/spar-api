package ru.rustore.sdk.metrics.internal.presentation;

import android.app.job.JobParameters;
import android.app.job.JobService;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import nb2.iwizpuwonk;
import ob2.gxszxtbevo;
import pb2.rgvfuqvkyq;
import pb2.wflxmlrfwp;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/metrics/internal/presentation/SendMetricsEventJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "sdk-public-metrics_release"}, k = 1, mv = {1, 7, 0})
public final class SendMetricsEventJobService extends JobService {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public volatile boolean f104818jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public gxszxtbevo f104819yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final gtknphoqwx f104820zdlpuopuiu = draadjrbmk.zoijcleaow(new iobyxmoadg());

    public static final class eablkybsjg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final /* synthetic */ JobParameters f104821yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(JobParameters jobParameters) {
            super(1);
            this.f104821yggfygwlhe = jobParameters;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            wwaezpbzkn it = (wwaezpbzkn) obj;
            zdlpuopuiu.btonecajqb(it, "it");
            SendMetricsEventJobService.iobyxmoadg(SendMetricsEventJobService.this, this.f104821yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {
        public iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return iwizpuwonk.f69572ppxfxbqfkf.iobyxmoadg(SendMetricsEventJobService.this);
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final /* synthetic */ JobParameters f104824yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(JobParameters jobParameters) {
            super(0);
            this.f104824yggfygwlhe = jobParameters;
        }

        @Override // tg.iobyxmoadg
        public final Object invoke() {
            SendMetricsEventJobService.iobyxmoadg(SendMetricsEventJobService.this, this.f104824yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final /* synthetic */ JobParameters f104826yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(JobParameters jobParameters) {
            super(1);
            this.f104826yggfygwlhe = jobParameters;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            zdlpuopuiu.btonecajqb((Throwable) obj, "<anonymous parameter 0>");
            SendMetricsEventJobService.iobyxmoadg(SendMetricsEventJobService.this, this.f104826yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {
        public zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Object invoke() {
            ((iwizpuwonk) SendMetricsEventJobService.this.f104820zdlpuopuiu.getValue()).f69574iobyxmoadg.iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final void iobyxmoadg(SendMetricsEventJobService sendMetricsEventJobService, JobParameters jobParameters) {
        if (sendMetricsEventJobService.f104818jyumaefscl) {
            return;
        }
        sendMetricsEventJobService.jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        zdlpuopuiu.btonecajqb(params, "params");
        this.f104819yggfygwlhe = wflxmlrfwp.iobyxmoadg(pb2.wkgbmnqykc.iobyxmoadg(rgvfuqvkyq.iobyxmoadg(pb2.iobyxmoadg.f76327iobyxmoadg.zoijcleaow(new zoijcleaow()), ob2.ppxfxbqfkf.f72563iobyxmoadg.zoijcleaow()), new ppxfxbqfkf(params)), new wkgbmnqykc(params), new eablkybsjg(params));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.f104818jyumaefscl = true;
        gxszxtbevo gxszxtbevoVar = this.f104819yggfygwlhe;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.iobyxmoadg();
        }
        return true;
    }
}
