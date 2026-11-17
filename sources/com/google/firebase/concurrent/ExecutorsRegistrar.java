package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import ub.pmvmpeiblj;
import ub.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final zdlpuopuiu f24191iobyxmoadg = new zdlpuopuiu(new tc.zoijcleaow() { // from class: vb.iobyxmoadg
        @Override // tc.zoijcleaow
        public final Object get() {
            return ExecutorsRegistrar.rgvfuqvkyq();
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final zdlpuopuiu f24194zoijcleaow = new zdlpuopuiu(new tc.zoijcleaow() { // from class: vb.zoijcleaow
        @Override // tc.zoijcleaow
        public final Object get() {
            return ExecutorsRegistrar.vdvldrhtss();
        }
    });

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final zdlpuopuiu f24192ppxfxbqfkf = new zdlpuopuiu(new tc.zoijcleaow() { // from class: vb.ppxfxbqfkf
        @Override // tc.zoijcleaow
        public final Object get() {
            return ExecutorsRegistrar.oxmwwwfdhm();
        }
    });

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final zdlpuopuiu f24193wkgbmnqykc = new zdlpuopuiu(new tc.zoijcleaow() { // from class: vb.wkgbmnqykc
        @Override // tc.zoijcleaow
        public final Object get() {
            return ExecutorsRegistrar.kcexrzcfyt();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService agtfadlqog(ub.wkgbmnqykc wkgbmnqykcVar) {
        return (ScheduledExecutorService) f24194zoijcleaow.get();
    }

    private static ThreadFactory btonecajqb(String str, int i13) {
        return new zoijcleaow(str, i13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService draadjrbmk(ub.wkgbmnqykc wkgbmnqykcVar) {
        return (ScheduledExecutorService) f24191iobyxmoadg.get();
    }

    private static StrictMode.ThreadPolicy dxjokdxxww() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory gtknphoqwx(String str, int i13, StrictMode.ThreadPolicy threadPolicy) {
        return new zoijcleaow(str, i13, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService kcexrzcfyt() {
        return Executors.newSingleThreadScheduledExecutor(btonecajqb("Firebase Scheduler", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor ojitshcjhn(ub.wkgbmnqykc wkgbmnqykcVar) {
        return vb.gtknphoqwx.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService oxmwwwfdhm() {
        return yggfygwlhe(Executors.newCachedThreadPool(btonecajqb("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService rgvfuqvkyq() {
        return yggfygwlhe(Executors.newFixedThreadPool(4, gtknphoqwx("Firebase Background", 10, dxjokdxxww())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService vdvldrhtss() {
        return yggfygwlhe(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), gtknphoqwx("Firebase Lite", 0, zdlpuopuiu())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService wflxmlrfwp(ub.wkgbmnqykc wkgbmnqykcVar) {
        return (ScheduledExecutorService) f24192ppxfxbqfkf.get();
    }

    private static ScheduledExecutorService yggfygwlhe(ExecutorService executorService) {
        return new ojitshcjhn(executorService, (ScheduledExecutorService) f24193wkgbmnqykc.get());
    }

    private static StrictMode.ThreadPolicy zdlpuopuiu() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(ub.ppxfxbqfkf.gxszxtbevo(pmvmpeiblj.iobyxmoadg(tb.iobyxmoadg.class, ScheduledExecutorService.class), pmvmpeiblj.iobyxmoadg(tb.iobyxmoadg.class, ExecutorService.class), pmvmpeiblj.iobyxmoadg(tb.iobyxmoadg.class, Executor.class)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: vb.eablkybsjg
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return ExecutorsRegistrar.draadjrbmk(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ub.ppxfxbqfkf.gxszxtbevo(pmvmpeiblj.iobyxmoadg(tb.zoijcleaow.class, ScheduledExecutorService.class), pmvmpeiblj.iobyxmoadg(tb.zoijcleaow.class, ExecutorService.class), pmvmpeiblj.iobyxmoadg(tb.zoijcleaow.class, Executor.class)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: vb.gxszxtbevo
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return ExecutorsRegistrar.wflxmlrfwp(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ub.ppxfxbqfkf.gxszxtbevo(pmvmpeiblj.iobyxmoadg(tb.ppxfxbqfkf.class, ScheduledExecutorService.class), pmvmpeiblj.iobyxmoadg(tb.ppxfxbqfkf.class, ExecutorService.class), pmvmpeiblj.iobyxmoadg(tb.ppxfxbqfkf.class, Executor.class)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: vb.lqeggnwhkg
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return ExecutorsRegistrar.agtfadlqog(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ub.ppxfxbqfkf.eablkybsjg(pmvmpeiblj.iobyxmoadg(tb.wkgbmnqykc.class, Executor.class)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: vb.nufgyqmvbu
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return ExecutorsRegistrar.ojitshcjhn(wkgbmnqykcVar);
            }
        }).wkgbmnqykc());
    }
}
