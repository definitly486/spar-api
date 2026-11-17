package ne;

import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.istkbnxepw;
import androidx.lifecycle.rgvfuqvkyq;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg implements Closeable, rgvfuqvkyq {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final GmsLogger f69783esjtqupxsv = new GmsLogger("MobileVisionBase", "");

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final /* synthetic */ int f69784lereixgezr = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Task f69785cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Executor f69786iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final CancellationTokenSource f69787jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ge.gxszxtbevo f69788yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final AtomicBoolean f69789zdlpuopuiu = new AtomicBoolean(false);

    public eablkybsjg(ge.gxszxtbevo gxszxtbevoVar, Executor executor) {
        this.f69788yggfygwlhe = gxszxtbevoVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f69787jyumaefscl = cancellationTokenSource;
        this.f69786iwizpuwonk = executor;
        gxszxtbevoVar.ppxfxbqfkf();
        this.f69785cqumvgiudr = gxszxtbevoVar.iobyxmoadg(executor, new Callable() { // from class: ne.lqeggnwhkg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i13 = eablkybsjg.f69784lereixgezr;
                return null;
            }
        }, cancellationTokenSource.getToken()).addOnFailureListener(new OnFailureListener() { // from class: ne.nufgyqmvbu
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                eablkybsjg.f69783esjtqupxsv.e("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, ie.iobyxmoadg
    @KeepForSdk
    @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_DESTROY)
    public synchronized void close() {
        if (this.f69789zdlpuopuiu.getAndSet(true)) {
            return;
        }
        this.f69787jyumaefscl.cancel();
        this.f69788yggfygwlhe.eablkybsjg(this.f69786iwizpuwonk);
    }

    public synchronized Task iobyxmoadg(final me.iobyxmoadg iobyxmoadgVar) {
        Preconditions.checkNotNull(iobyxmoadgVar, "InputImage can not be null");
        if (this.f69789zdlpuopuiu.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        }
        if (iobyxmoadgVar.btonecajqb() < 32 || iobyxmoadgVar.gxszxtbevo() < 32) {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.f69788yggfygwlhe.iobyxmoadg(this.f69786iwizpuwonk, new Callable() { // from class: ne.gxszxtbevo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f69790iobyxmoadg.wkgbmnqykc(iobyxmoadgVar);
            }
        }, this.f69787jyumaefscl.getToken());
    }

    final /* synthetic */ Object wkgbmnqykc(me.iobyxmoadg iobyxmoadgVar) {
        zzlx zzlxVarZze = zzlx.zze("detectorTaskWithResource#run");
        zzlxVarZze.zzb();
        try {
            Object objDxjokdxxww = this.f69788yggfygwlhe.dxjokdxxww(iobyxmoadgVar);
            zzlxVarZze.close();
            return objDxjokdxxww;
        } catch (Throwable th2) {
            try {
                zzlxVarZze.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }
}
