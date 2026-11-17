package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ub.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private nd.wkgbmnqykc applicationProcessState;
    private final com.google.firebase.perf.config.iobyxmoadg configResolver;
    private final zdlpuopuiu cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final zdlpuopuiu gaugeManagerExecutor;
    private dxjokdxxww gaugeMetadataManager;
    private final zdlpuopuiu memoryGaugeCollector;
    private String sessionId;
    private final ld.gtknphoqwx transportManager;
    private static final gd.iobyxmoadg logger = gd.iobyxmoadg.eablkybsjg();
    private static final GaugeManager instance = new GaugeManager();

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f24654iobyxmoadg;

        static {
            int[] iArr = new int[nd.wkgbmnqykc.values().length];
            f24654iobyxmoadg = iArr;
            try {
                iArr[nd.wkgbmnqykc.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24654iobyxmoadg[nd.wkgbmnqykc.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new zdlpuopuiu(new tc.zoijcleaow() { // from class: com.google.firebase.perf.session.gauges.gxszxtbevo
            @Override // tc.zoijcleaow
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), ld.gtknphoqwx.gtknphoqwx(), com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg(), null, new zdlpuopuiu(new tc.zoijcleaow() { // from class: com.google.firebase.perf.session.gauges.lqeggnwhkg
            @Override // tc.zoijcleaow
            public final Object get() {
                return GaugeManager.lambda$new$0();
            }
        }), new zdlpuopuiu(new tc.zoijcleaow() { // from class: com.google.firebase.perf.session.gauges.nufgyqmvbu
            @Override // tc.zoijcleaow
            public final Object get() {
                return GaugeManager.lambda$new$1();
            }
        }));
    }

    private long getCpuGaugeCollectionFrequencyMs(nd.wkgbmnqykc wkgbmnqykcVar) {
        long jEsjtqupxsv;
        int i13 = iobyxmoadg.f24654iobyxmoadg[wkgbmnqykcVar.ordinal()];
        if (i13 != 1) {
            jEsjtqupxsv = i13 != 2 ? -1L : this.configResolver.lereixgezr();
        } else {
            jEsjtqupxsv = this.configResolver.esjtqupxsv();
        }
        if (ppxfxbqfkf.gxszxtbevo(jEsjtqupxsv)) {
            return -1L;
        }
        return jEsjtqupxsv;
    }

    private nd.gxszxtbevo getGaugeMetadata() {
        return (nd.gxszxtbevo) nd.gxszxtbevo.wflxmlrfwp().lqeggnwhkg(this.gaugeMetadataManager.iobyxmoadg()).nufgyqmvbu(this.gaugeMetadataManager.zoijcleaow()).gtknphoqwx(this.gaugeMetadataManager.ppxfxbqfkf()).build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(nd.wkgbmnqykc wkgbmnqykcVar) {
        long jZynmafqrjb;
        int i13 = iobyxmoadg.f24654iobyxmoadg[wkgbmnqykcVar.ordinal()];
        if (i13 != 1) {
            jZynmafqrjb = i13 != 2 ? -1L : this.configResolver.istkbnxepw();
        } else {
            jZynmafqrjb = this.configResolver.zynmafqrjb();
        }
        if (draadjrbmk.eablkybsjg(jZynmafqrjb)) {
            return -1L;
        }
        return jZynmafqrjb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ppxfxbqfkf lambda$new$0() {
        return new ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ draadjrbmk lambda$new$1() {
        return new draadjrbmk();
    }

    private boolean startCollectingCpuMetrics(long j13, Timer timer) {
        if (j13 == -1) {
            logger.iobyxmoadg("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((ppxfxbqfkf) this.cpuGaugeCollector.get()).gtknphoqwx(j13, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j13, Timer timer) {
        if (j13 == -1) {
            logger.iobyxmoadg("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((draadjrbmk) this.memoryGaugeCollector.get()).btonecajqb(j13, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, nd.wkgbmnqykc wkgbmnqykcVar) {
        nd.lqeggnwhkg.zoijcleaow zoijcleaowVarJyumaefscl = nd.lqeggnwhkg.jyumaefscl();
        while (!((ppxfxbqfkf) this.cpuGaugeCollector.get()).f24679iobyxmoadg.isEmpty()) {
            zoijcleaowVarJyumaefscl.nufgyqmvbu((nd.eablkybsjg) ((ppxfxbqfkf) this.cpuGaugeCollector.get()).f24679iobyxmoadg.poll());
        }
        while (!((draadjrbmk) this.memoryGaugeCollector.get()).f24662zoijcleaow.isEmpty()) {
            zoijcleaowVarJyumaefscl.lqeggnwhkg((nd.zoijcleaow) ((draadjrbmk) this.memoryGaugeCollector.get()).f24662zoijcleaow.poll());
        }
        zoijcleaowVarJyumaefscl.draadjrbmk(str);
        this.transportManager.pmvmpeiblj((nd.lqeggnwhkg) zoijcleaowVarJyumaefscl.build(), wkgbmnqykcVar);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((ppxfxbqfkf) this.cpuGaugeCollector.get(), (draadjrbmk) this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new dxjokdxxww(context);
    }

    public boolean logGaugeMetadata(String str, nd.wkgbmnqykc wkgbmnqykcVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.pmvmpeiblj((nd.lqeggnwhkg) nd.lqeggnwhkg.jyumaefscl().draadjrbmk(str).gtknphoqwx(getGaugeMetadata()).build(), wkgbmnqykcVar);
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, final nd.wkgbmnqykc wkgbmnqykcVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(wkgbmnqykcVar, perfSession.gxszxtbevo());
        if (jStartCollectingGauges == -1) {
            logger.btonecajqb("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String strBtonecajqb = perfSession.btonecajqb();
        this.sessionId = strBtonecajqb;
        this.applicationProcessState = wkgbmnqykcVar;
        try {
            long j13 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.eablkybsjg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24670zdlpuopuiu.lambda$startCollectingGauges$2(strBtonecajqb, wkgbmnqykcVar);
                }
            }, j13, j13, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e13) {
            logger.btonecajqb("Unable to start collecting Gauges: " + e13.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final nd.wkgbmnqykc wkgbmnqykcVar = this.applicationProcessState;
        ((ppxfxbqfkf) this.cpuGaugeCollector.get()).draadjrbmk();
        ((draadjrbmk) this.memoryGaugeCollector.get()).gtknphoqwx();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                this.f24685zdlpuopuiu.lambda$stopCollectingGauges$3(str, wkgbmnqykcVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = nd.wkgbmnqykc.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(ppxfxbqfkf ppxfxbqfkfVar, draadjrbmk draadjrbmkVar, Timer timer) {
        ppxfxbqfkfVar.ppxfxbqfkf(timer);
        draadjrbmkVar.ppxfxbqfkf(timer);
    }

    GaugeManager(zdlpuopuiu zdlpuopuiuVar, ld.gtknphoqwx gtknphoqwxVar, com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar, dxjokdxxww dxjokdxxwwVar, zdlpuopuiu zdlpuopuiuVar2, zdlpuopuiu zdlpuopuiuVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = nd.wkgbmnqykc.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = zdlpuopuiuVar;
        this.transportManager = gtknphoqwxVar;
        this.configResolver = iobyxmoadgVar;
        this.gaugeMetadataManager = dxjokdxxwwVar;
        this.cpuGaugeCollector = zdlpuopuiuVar2;
        this.memoryGaugeCollector = zdlpuopuiuVar3;
    }

    private long startCollectingGauges(nd.wkgbmnqykc wkgbmnqykcVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(wkgbmnqykcVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(wkgbmnqykcVar);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }
}
