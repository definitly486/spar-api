package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements agtfadlqog {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final agtfadlqog f9538yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f9539zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f9540iobyxmoadg;

        static {
            int[] iArr = new int[gtknphoqwx.iobyxmoadg.values().length];
            try {
                iArr[gtknphoqwx.iobyxmoadg.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gtknphoqwx.iobyxmoadg.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gtknphoqwx.iobyxmoadg.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gtknphoqwx.iobyxmoadg.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gtknphoqwx.iobyxmoadg.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gtknphoqwx.iobyxmoadg.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[gtknphoqwx.iobyxmoadg.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f9540iobyxmoadg = iArr;
        }
    }

    public lqeggnwhkg(gxszxtbevo defaultLifecycleObserver, agtfadlqog agtfadlqogVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f9539zdlpuopuiu = defaultLifecycleObserver;
        this.f9538yggfygwlhe = agtfadlqogVar;
    }

    @Override // androidx.lifecycle.agtfadlqog
    public void nufgyqmvbu(vdvldrhtss source, gtknphoqwx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        switch (iobyxmoadg.f9540iobyxmoadg[event.ordinal()]) {
            case 1:
                this.f9539zdlpuopuiu.lqeggnwhkg(source);
                break;
            case 2:
                this.f9539zdlpuopuiu.onStart(source);
                break;
            case 3:
                this.f9539zdlpuopuiu.onResume(source);
                break;
            case 4:
                this.f9539zdlpuopuiu.onPause(source);
                break;
            case 5:
                this.f9539zdlpuopuiu.onStop(source);
                break;
            case 6:
                this.f9539zdlpuopuiu.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new NoWhenBranchMatchedException();
        }
        agtfadlqog agtfadlqogVar = this.f9538yggfygwlhe;
        if (agtfadlqogVar != null) {
            agtfadlqogVar.nufgyqmvbu(source, event);
        }
    }
}
