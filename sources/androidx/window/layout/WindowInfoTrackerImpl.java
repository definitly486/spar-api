package androidx.window.layout;

import android.app.Activity;
import gg.wwaezpbzkn;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/zdlpuopuiu;", "Landroidx/window/layout/esjtqupxsv;", "windowMetricsCalculator", "Landroidx/window/layout/kcexrzcfyt;", "windowBackend", "<init>", "(Landroidx/window/layout/esjtqupxsv;Landroidx/window/layout/kcexrzcfyt;)V", "Landroid/app/Activity;", "activity", "Lsj/lqeggnwhkg;", "Landroidx/window/layout/iwizpuwonk;", "windowLayoutInfo", "(Landroid/app/Activity;)Lsj/lqeggnwhkg;", "Landroidx/window/layout/esjtqupxsv;", "Landroidx/window/layout/kcexrzcfyt;", "Companion", "iobyxmoadg", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowInfoTrackerImpl implements zdlpuopuiu {
    private static final int BUFFER_CAPACITY = 10;
    private final kcexrzcfyt windowBackend;
    private final esjtqupxsv windowMetricsCalculator;

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ Activity f13814esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private /* synthetic */ Object f13815iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f13816jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f13817yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f13818zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Activity activity, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f13814esjtqupxsv = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void zdlpuopuiu(rj.lqeggnwhkg lqeggnwhkgVar, iwizpuwonk info) {
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(info, "info");
            lqeggnwhkgVar.eablkybsjg(info);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = WindowInfoTrackerImpl.this.new zoijcleaow(this.f13814esjtqupxsv, gxszxtbevoVar);
            zoijcleaowVar.f13815iwizpuwonk = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0072 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0073  */
        /* JADX WARN: Code duplicated, block: B:24:0x007e A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:18:0x0064, B:22:0x0076, B:24:0x007e, B:14:0x0036, B:17:0x0060), top: B:31:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0092 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:8:0x001d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r9.f13816jyumaefscl
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                java.lang.Object r1 = r9.f13817yggfygwlhe
                rj.dxjokdxxww r1 = (rj.dxjokdxxww) r1
                java.lang.Object r4 = r9.f13818zdlpuopuiu
                u1.iobyxmoadg r4 = (u1.iobyxmoadg) r4
                java.lang.Object r5 = r9.f13815iwizpuwonk
                sj.nufgyqmvbu r5 = (sj.nufgyqmvbu) r5
                gg.zdlpuopuiu.zoijcleaow(r10)     // Catch: java.lang.Throwable -> L1f
            L1d:
                r10 = r5
                goto L64
            L1f:
                r10 = move-exception
                goto L9f
            L22:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2a:
                java.lang.Object r1 = r9.f13817yggfygwlhe
                rj.dxjokdxxww r1 = (rj.dxjokdxxww) r1
                java.lang.Object r4 = r9.f13818zdlpuopuiu
                u1.iobyxmoadg r4 = (u1.iobyxmoadg) r4
                java.lang.Object r5 = r9.f13815iwizpuwonk
                sj.nufgyqmvbu r5 = (sj.nufgyqmvbu) r5
                gg.zdlpuopuiu.zoijcleaow(r10)     // Catch: java.lang.Throwable -> L1f
                goto L76
            L3a:
                gg.zdlpuopuiu.zoijcleaow(r10)
                java.lang.Object r10 = r9.f13815iwizpuwonk
                sj.nufgyqmvbu r10 = (sj.nufgyqmvbu) r10
                rj.iobyxmoadg r1 = rj.iobyxmoadg.DROP_OLDEST
                r4 = 4
                r5 = 10
                r6 = 0
                rj.lqeggnwhkg r1 = rj.btonecajqb.zoijcleaow(r5, r1, r6, r4, r6)
                androidx.window.layout.jyumaefscl r4 = new androidx.window.layout.jyumaefscl
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.kcexrzcfyt r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                android.app.Activity r6 = r9.f13814esjtqupxsv
                l5.zoijcleaow r7 = new l5.zoijcleaow
                r7.<init>()
                r5.registerLayoutChangeCallback(r6, r7, r4)
                rj.dxjokdxxww r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
            L64:
                r9.f13815iwizpuwonk = r10     // Catch: java.lang.Throwable -> L1f
                r9.f13818zdlpuopuiu = r4     // Catch: java.lang.Throwable -> L1f
                r9.f13817yggfygwlhe = r1     // Catch: java.lang.Throwable -> L1f
                r9.f13816jyumaefscl = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r5 = r1.iobyxmoadg(r9)     // Catch: java.lang.Throwable -> L1f
                if (r5 != r0) goto L73
                return r0
            L73:
                r8 = r5
                r5 = r10
                r10 = r8
            L76:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r10 == 0) goto L93
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L1f
                androidx.window.layout.iwizpuwonk r10 = (androidx.window.layout.iwizpuwonk) r10     // Catch: java.lang.Throwable -> L1f
                r9.f13815iwizpuwonk = r5     // Catch: java.lang.Throwable -> L1f
                r9.f13818zdlpuopuiu = r4     // Catch: java.lang.Throwable -> L1f
                r9.f13817yggfygwlhe = r1     // Catch: java.lang.Throwable -> L1f
                r9.f13816jyumaefscl = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r10 = r5.emit(r10, r9)     // Catch: java.lang.Throwable -> L1f
                if (r10 != r0) goto L1d
                return r0
            L93:
                androidx.window.layout.WindowInfoTrackerImpl r10 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.kcexrzcfyt r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
                r10.unregisterLayoutChangeCallback(r4)
                gg.wwaezpbzkn r10 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r10
            L9f:
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.kcexrzcfyt r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.zoijcleaow.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public WindowInfoTrackerImpl(esjtqupxsv windowMetricsCalculator, kcexrzcfyt windowBackend) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(windowMetricsCalculator, "windowMetricsCalculator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.zdlpuopuiu
    public sj.lqeggnwhkg windowLayoutInfo(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        return sj.dxjokdxxww.wwaezpbzkn(new zoijcleaow(activity, null));
    }
}
