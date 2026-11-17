package modern.payments.tracker.util.logging.logWriter;

import em.iobyxmoadg;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.tracker.util.logging.ExternalLogFileStorage;
import rj.btonecajqb;
import rj.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lmodern/payments/tracker/util/logging/logWriter/LogToFileWriter;", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter;", "Lmodern/payments/tracker/util/logging/ExternalLogFileStorage;", "externalLogFileStorage", "<init>", "(Lmodern/payments/tracker/util/logging/ExternalLogFileStorage;)V", "Lcm/gxszxtbevo;", "dateTime", "", "prefix", "extension", "getFileName", "(Lcm/gxszxtbevo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "getFileTag", "(Lcm/gxszxtbevo;)Ljava/lang/String;", "Lgg/wwaezpbzkn;", "start", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/tracker/util/logging/ExternalLogFileStorage;", "Lrj/lqeggnwhkg;", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter$LogData;", "localChannel", "Lrj/lqeggnwhkg;", "getLocalChannel", "()Lrj/lqeggnwhkg;", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "getFileNameForNow", "()Ljava/lang/String;", "fileNameForNow", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LogToFileWriter implements LogWriter {
    private static final String DEFAULT_EXTENSION = "txt";
    private static final String DEFAULT_FORMATTER_PATTERN = "yyyyMMdd";
    private static final String DEFAULT_PREFIX = "app_logs_";
    private final ExternalLogFileStorage externalLogFileStorage;
    private final File file;
    private final lqeggnwhkg localChannel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String currentLogfileName = "";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmodern/payments/tracker/util/logging/logWriter/LogToFileWriter$Companion;", "", "()V", "DEFAULT_EXTENSION", "", "DEFAULT_FORMATTER_PATTERN", "DEFAULT_PREFIX", "<set-?>", "currentLogfileName", "getCurrentLogfileName", "()Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final String getCurrentLogfileName() {
            return LogToFileWriter.currentLogfileName;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.tracker.util.logging.logWriter.LogToFileWriter$start$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.tracker.util.logging.logWriter.LogToFileWriter", f = "LogToFileWriter.kt", l = {63}, m = "start")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LogToFileWriter.this.start(this);
        }
    }

    public LogToFileWriter(ExternalLogFileStorage externalLogFileStorage) {
        zdlpuopuiu.btonecajqb(externalLogFileStorage, "externalLogFileStorage");
        this.externalLogFileStorage = externalLogFileStorage;
        this.localChannel = btonecajqb.zoijcleaow(Integer.MAX_VALUE, null, null, 6, null);
        File file = new File(ExternalLogFileStorage.getFileStorageDirectory$default(externalLogFileStorage, null, 1, null), getFileNameForNow());
        this.file = file;
        currentLogfileName = getFileNameForNow();
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        file.delete();
    }

    private final String getFileName(cm.gxszxtbevo dateTime, String prefix, String extension) {
        return prefix + getFileTag(dateTime) + '.' + extension;
    }

    static /* synthetic */ String getFileName$default(LogToFileWriter logToFileWriter, cm.gxszxtbevo gxszxtbevoVar, String str, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = DEFAULT_PREFIX;
        }
        if ((i13 & 4) != 0) {
            str2 = DEFAULT_EXTENSION;
        }
        return logToFileWriter.getFileName(gxszxtbevoVar, str, str2);
    }

    private final String getFileNameForNow() {
        cm.gxszxtbevo gxszxtbevoVarHkdspvbjdz = cm.gxszxtbevo.hkdspvbjdz();
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarHkdspvbjdz, "now(...)");
        return getFileName$default(this, gxszxtbevoVarHkdspvbjdz, null, null, 6, null);
    }

    private final String getFileTag(cm.gxszxtbevo dateTime) {
        return dateTime.kcexrzcfyt(iobyxmoadg.lqeggnwhkg(DEFAULT_FORMATTER_PATTERN));
    }

    public final File getFile() {
        return this.file;
    }

    @Override // modern.payments.tracker.util.logging.logWriter.LogWriter
    public lqeggnwhkg getLocalChannel() {
        return this.localChannel;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:18:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // modern.payments.tracker.util.logging.logWriter.LogWriter
    public java.lang.Object start(lg.gxszxtbevo<? super gg.wwaezpbzkn> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof modern.payments.tracker.util.logging.logWriter.LogToFileWriter.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            modern.payments.tracker.util.logging.logWriter.LogToFileWriter$start$1 r0 = (modern.payments.tracker.util.logging.logWriter.LogToFileWriter.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            modern.payments.tracker.util.logging.logWriter.LogToFileWriter$start$1 r0 = new modern.payments.tracker.util.logging.logWriter.LogToFileWriter$start$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.L$1
            rj.dxjokdxxww r2 = (rj.dxjokdxxww) r2
            java.lang.Object r4 = r0.L$0
            modern.payments.tracker.util.logging.logWriter.LogToFileWriter r4 = (modern.payments.tracker.util.logging.logWriter.LogToFileWriter) r4
            gg.zdlpuopuiu.zoijcleaow(r9)
            goto L53
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            gg.zdlpuopuiu.zoijcleaow(r9)
            rj.lqeggnwhkg r9 = r8.getLocalChannel()
            rj.dxjokdxxww r9 = r9.iterator()
            r4 = r8
            r2 = r9
        L46:
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r9 = r2.iobyxmoadg(r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7e
            java.lang.Object r9 = r2.next()
            modern.payments.tracker.util.logging.logWriter.LogWriter$LogData r9 = (modern.payments.tracker.util.logging.logWriter.LogWriter.LogData) r9
            java.io.File r5 = r4.file
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r9.getMessage()
            r6.append(r9)
            r9 = 10
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            r6 = 2
            r7 = 0
            rg.gxszxtbevo.wkgbmnqykc(r5, r9, r7, r6, r7)
            goto L46
        L7e:
            gg.wwaezpbzkn r9 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: modern.payments.tracker.util.logging.logWriter.LogToFileWriter.start(lg.gxszxtbevo):java.lang.Object");
    }
}
