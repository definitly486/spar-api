package ge;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzav;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb extends zzav {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final ThreadLocal f36888yggfygwlhe = new ThreadLocal();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ThreadPoolExecutor f36889zdlpuopuiu;

    public btonecajqb() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: ge.iwizpuwonk
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: ge.cqumvgiudr
                    @Override // java.lang.Runnable
                    public final void run() {
                        btonecajqb.wkgbmnqykc(runnable);
                    }
                });
            }
        });
        this.f36889zdlpuopuiu = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lqeggnwhkg(Deque deque, Runnable runnable) {
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    static /* synthetic */ void wkgbmnqykc(Runnable runnable) {
        f36888yggfygwlhe.set(new ArrayDeque());
        runnable.run();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f36888yggfygwlhe.get();
        if (deque == null || deque.size() > 1) {
            this.f36889zdlpuopuiu.execute(new Runnable() { // from class: ge.jyumaefscl
                @Override // java.lang.Runnable
                public final void run() {
                    btonecajqb.lqeggnwhkg((Deque) btonecajqb.f36888yggfygwlhe.get(), runnable);
                }
            });
        } else {
            lqeggnwhkg(deque, runnable);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    protected final /* synthetic */ Object zza() {
        return this.f36889zdlpuopuiu;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    protected final ExecutorService zzb() {
        return this.f36889zdlpuopuiu;
    }
}
