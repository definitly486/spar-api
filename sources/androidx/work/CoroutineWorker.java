package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.wkgbmnqykc;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.btonecajqb;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;
import pj.pkzmftpjix;
import pj.skhdrjzrfn;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R \u0010\u001a\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ppxfxbqfkf;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/wkgbmnqykc;", "Landroidx/work/ppxfxbqfkf$iobyxmoadg;", "startWork", "()Lcom/google/common/util/concurrent/wkgbmnqykc;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lg6/btonecajqb;", "ppxfxbqfkf", "getForegroundInfoAsync", "Lgg/wwaezpbzkn;", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Lpj/pkzmftpjix;", "zoijcleaow", "Lpj/pkzmftpjix;", "()Lpj/pkzmftpjix;", "getCoroutineContext$annotations", "coroutineContext", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CoroutineWorker extends androidx.work.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters params;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
    private final pkzmftpjix coroutineContext;

    private static final class iobyxmoadg extends pkzmftpjix {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final iobyxmoadg f13852yggfygwlhe = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final pkzmftpjix f13851jyumaefscl = ikoacuggdj.iobyxmoadg();

        private iobyxmoadg() {
        }

        @Override // pj.pkzmftpjix
        public void dsvhmnatus(btonecajqb context, Runnable block) {
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(block, "block");
            f13851jyumaefscl.dsvhmnatus(context, block);
        }

        @Override // pj.pkzmftpjix
        public boolean ulzqkzuiru(btonecajqb context) {
            zdlpuopuiu.btonecajqb(context, "context");
            return f13851jyumaefscl.ulzqkzuiru(context);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f13854zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return CoroutineWorker.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f13854zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                CoroutineWorker coroutineWorker = CoroutineWorker.this;
                this.f13854zdlpuopuiu = 1;
                obj = coroutineWorker.iobyxmoadg(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f13856zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return CoroutineWorker.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f13856zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                CoroutineWorker coroutineWorker = CoroutineWorker.this;
                this.f13856zdlpuopuiu = 1;
                obj = coroutineWorker.ppxfxbqfkf(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        zdlpuopuiu.btonecajqb(appContext, "appContext");
        zdlpuopuiu.btonecajqb(params, "params");
        this.params = params;
        this.coroutineContext = iobyxmoadg.f13852yggfygwlhe;
    }

    static /* synthetic */ Object wkgbmnqykc(CoroutineWorker coroutineWorker, gxszxtbevo gxszxtbevoVar) {
        throw new IllegalStateException("Not implemented");
    }

    @Override // androidx.work.ppxfxbqfkf
    public final wkgbmnqykc getForegroundInfoAsync() {
        return g6.zdlpuopuiu.gtknphoqwx(getCoroutineContext().plus(skhdrjzrfn.zoijcleaow(null, 1, null)), null, new zoijcleaow(null), 2, null);
    }

    public abstract Object iobyxmoadg(gxszxtbevo gxszxtbevoVar);

    @Override // androidx.work.ppxfxbqfkf
    public final void onStopped() {
        super.onStopped();
    }

    public Object ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(this, gxszxtbevoVar);
    }

    @Override // androidx.work.ppxfxbqfkf
    public final wkgbmnqykc startWork() {
        btonecajqb coroutineContext = !zdlpuopuiu.eablkybsjg(getCoroutineContext(), iobyxmoadg.f13852yggfygwlhe) ? getCoroutineContext() : this.params.draadjrbmk();
        zdlpuopuiu.dxjokdxxww(coroutineContext, "if (coroutineContext != …rkerContext\n            }");
        return g6.zdlpuopuiu.gtknphoqwx(coroutineContext.plus(skhdrjzrfn.zoijcleaow(null, 1, null)), null, new ppxfxbqfkf(null), 2, null);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public pkzmftpjix getCoroutineContext() {
        return this.coroutineContext;
    }
}
