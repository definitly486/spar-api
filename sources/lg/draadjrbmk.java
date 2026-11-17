package lg;

import gg.kcexrzcfyt;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk implements gxszxtbevo, kotlin.coroutines.jvm.internal.eablkybsjg {
    private volatile Object result;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f62502zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final iobyxmoadg f62501yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f62500jyumaefscl = AtomicReferenceFieldUpdater.newUpdater(draadjrbmk.class, Object.class, "result");

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public draadjrbmk(gxszxtbevo delegate, Object obj) {
        zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f62502zdlpuopuiu = delegate;
        this.result = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.eablkybsjg
    public kotlin.coroutines.jvm.internal.eablkybsjg getCallerFrame() {
        gxszxtbevo gxszxtbevoVar = this.f62502zdlpuopuiu;
        if (gxszxtbevoVar instanceof kotlin.coroutines.jvm.internal.eablkybsjg) {
            return (kotlin.coroutines.jvm.internal.eablkybsjg) gxszxtbevoVar;
        }
        return null;
    }

    @Override // lg.gxszxtbevo
    public btonecajqb getContext() {
        return this.f62502zdlpuopuiu.getContext();
    }

    public final Object iobyxmoadg() throws Throwable {
        Object obj = this.result;
        mg.iobyxmoadg iobyxmoadgVar = mg.iobyxmoadg.UNDECIDED;
        if (obj == iobyxmoadgVar) {
            if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f62500jyumaefscl, this, iobyxmoadgVar, mg.zoijcleaow.gxszxtbevo())) {
                return mg.zoijcleaow.gxszxtbevo();
            }
            obj = this.result;
        }
        if (obj == mg.iobyxmoadg.RESUMED) {
            return mg.zoijcleaow.gxszxtbevo();
        }
        if (obj instanceof kcexrzcfyt.zoijcleaow) {
            throw ((kcexrzcfyt.zoijcleaow) obj).f37119zdlpuopuiu;
        }
        return obj;
    }

    @Override // lg.gxszxtbevo
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            mg.iobyxmoadg iobyxmoadgVar = mg.iobyxmoadg.UNDECIDED;
            if (obj2 == iobyxmoadgVar) {
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f62500jyumaefscl, this, iobyxmoadgVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != mg.zoijcleaow.gxszxtbevo()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f62500jyumaefscl, this, mg.zoijcleaow.gxszxtbevo(), mg.iobyxmoadg.RESUMED)) {
                    this.f62502zdlpuopuiu.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f62502zdlpuopuiu;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(gxszxtbevo delegate) {
        this(delegate, mg.iobyxmoadg.UNDECIDED);
        zdlpuopuiu.btonecajqb(delegate, "delegate");
    }
}
