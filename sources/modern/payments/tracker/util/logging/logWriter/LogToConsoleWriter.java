package modern.payments.tracker.util.logging.logWriter;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import rj.btonecajqb;
import rj.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmodern/payments/tracker/util/logging/logWriter/LogToConsoleWriter;", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter;", "<init>", "()V", "Lgg/wwaezpbzkn;", "start", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lrj/lqeggnwhkg;", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter$LogData;", "localChannel", "Lrj/lqeggnwhkg;", "getLocalChannel", "()Lrj/lqeggnwhkg;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LogToConsoleWriter implements LogWriter {
    private final lqeggnwhkg localChannel = btonecajqb.zoijcleaow(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter$start$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter", f = "LogToConsoleWriter.kt", l = {15}, m = "start")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LogToConsoleWriter.this.start(this);
        }
    }

    @Override // modern.payments.tracker.util.logging.logWriter.LogWriter
    public lqeggnwhkg getLocalChannel() {
        return this.localChannel;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // modern.payments.tracker.util.logging.logWriter.LogWriter
    public java.lang.Object start(lg.gxszxtbevo<? super gg.wwaezpbzkn> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter$start$1 r0 = (modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter$start$1 r0 = new modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter$start$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.L$0
            rj.dxjokdxxww r2 = (rj.dxjokdxxww) r2
            gg.zdlpuopuiu.zoijcleaow(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            gg.zdlpuopuiu.zoijcleaow(r7)
            rj.lqeggnwhkg r7 = r6.getLocalChannel()
            rj.dxjokdxxww r7 = r7.iterator()
            r2 = r7
        L41:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r2.iobyxmoadg(r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r2.next()
            modern.payments.tracker.util.logging.logWriter.LogWriter$LogData r7 = (modern.payments.tracker.util.logging.logWriter.LogWriter.LogData) r7
            int r4 = r7.getPriority()
            java.lang.String r5 = r7.getTag()
            java.lang.String r7 = r7.getMessage()
            android.util.Log.println(r4, r5, r7)
            goto L41
        L6a:
            gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: modern.payments.tracker.util.logging.logWriter.LogToConsoleWriter.start(lg.gxszxtbevo):java.lang.Object");
    }
}
