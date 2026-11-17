package modern.payments.tracker.util.logging;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.data.config.LoggerSettingsMode;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.util.logging.logWriter.LogWriter;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import pj.ikoacuggdj;
import pj.krqnebusok;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0015"}, d2 = {"Lmodern/payments/tracker/util/logging/PrettyLogFormatterTree;", "Lmodern/payments/tracker/util/logging/ILogTree;", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter;", "logToConsoleWriter", "logToFileWriter", "Lpj/cllcsxoeiz;", "scope", "<init>", "(Lmodern/payments/tracker/util/logging/logWriter/LogWriter;Lmodern/payments/tracker/util/logging/logWriter/LogWriter;Lpj/cllcsxoeiz;)V", "", "event", "", "exception", "Lmodern/payments/tracker/ITracker$Priority;", "priority", "tag", "Lgg/wwaezpbzkn;", "log", "(Ljava/lang/String;Ljava/lang/Throwable;Lmodern/payments/tracker/ITracker$Priority;Ljava/lang/String;)V", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PrettyLogFormatterTree implements ILogTree {
    public static final String METRICS_SENT_LOG_TAG = "METRIC SENT";
    private static final String PRETTY_LOGGER_TAG = "PrettyLog";
    private static final String SDK_LOG_TAG = "EcomSdkLog";
    private final LogWriter logToConsoleWriter;
    private final LogWriter logToFileWriter;
    private static final List<String> paramsToMask = jyumaefscl.rgvfuqvkyq("authCode", "clientId", "dynatraceApplicationId", "client_id");

    /* JADX INFO: renamed from: modern.payments.tracker.util.logging.PrettyLogFormatterTree$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.tracker.util.logging.PrettyLogFormatterTree$1", f = "PrettyLogFormatterTree.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: modern.payments.tracker.util.logging.PrettyLogFormatterTree$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
        @gxszxtbevo(c = "modern.payments.tracker.util.logging.PrettyLogFormatterTree$1$1", f = "PrettyLogFormatterTree.kt", l = {23}, m = "invokeSuspend")
        static final class C14371 extends draadjrbmk implements rgvfuqvkyq {
            int label;
            final /* synthetic */ PrettyLogFormatterTree this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14371(PrettyLogFormatterTree prettyLogFormatterTree, lg.gxszxtbevo<? super C14371> gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.this$0 = prettyLogFormatterTree;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
                return new C14371(this.this$0, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                int i13 = this.label;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    LogWriter logWriter = this.this$0.logToConsoleWriter;
                    this.label = 1;
                    if (logWriter.start(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
                return ((C14371) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: modern.payments.tracker.util.logging.PrettyLogFormatterTree$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
        @gxszxtbevo(c = "modern.payments.tracker.util.logging.PrettyLogFormatterTree$1$2", f = "PrettyLogFormatterTree.kt", l = {C4007z9.G}, m = "invokeSuspend")
        static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
            int label;
            final /* synthetic */ PrettyLogFormatterTree this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PrettyLogFormatterTree prettyLogFormatterTree, lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.this$0 = prettyLogFormatterTree;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
                return new AnonymousClass2(this.this$0, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                int i13 = this.label;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    LogWriter logWriter = this.this$0.logToFileWriter;
                    this.label = 1;
                    if (logWriter.start(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
                return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            AnonymousClass1 anonymousClass1 = PrettyLogFormatterTree.this.new AnonymousClass1(gxszxtbevoVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zoijcleaow.gxszxtbevo();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.L$0;
            gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new C14371(PrettyLogFormatterTree.this, null), 3, null);
            gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new AnonymousClass2(PrettyLogFormatterTree.this, null), 3, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggerSettingsMode.values().length];
            try {
                iArr[LoggerSettingsMode.REQUESTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggerSettingsMode.METRICS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PrettyLogFormatterTree(LogWriter logToConsoleWriter, LogWriter logToFileWriter, cllcsxoeiz scope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logToConsoleWriter, "logToConsoleWriter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logToFileWriter, "logToFileWriter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        this.logToConsoleWriter = logToConsoleWriter;
        this.logToFileWriter = logToFileWriter;
        gtknphoqwx.wkgbmnqykc(scope, ikoacuggdj.zoijcleaow().plus(krqnebusok.zoijcleaow(null, 1, null)), null, new AnonymousClass1(null), 2, null);
    }

    @Override // modern.payments.tracker.util.logging.ILogTree
    public void log(String event, Throwable exception, ITracker.Priority priority, String tag) {
        List<String> listMakeLogLines;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(priority, "priority");
        String str = tag == null ? PRETTY_LOGGER_TAG : tag;
        int i13 = WhenMappings.$EnumSwitchMapping$0[EcomStagingConfig.INSTANCE.getLoggerSettingsMode().ordinal()];
        if (i13 == 1) {
            if (tag == null) {
                return;
            }
            if (!kcexrzcfyt.stevsuqkhv(tag, "REQUEST", false, 2, null) && !kcexrzcfyt.stevsuqkhv(tag, "RESPONSE", false, 2, null)) {
                return;
            }
            PrettyLogFormatter prettyLogFormatter = PrettyLogFormatter.INSTANCE;
            if (event == null) {
                event = "";
            }
            listMakeLogLines = prettyLogFormatter.makeLogLines(tag, event, exception);
        } else if (i13 != 2) {
            PrettyLogFormatter prettyLogFormatter2 = PrettyLogFormatter.INSTANCE;
            if (event == null) {
                event = "";
            }
            listMakeLogLines = prettyLogFormatter2.makeLogLines(tag, event, exception);
        } else {
            if (tag == null) {
                return;
            }
            if (!kcexrzcfyt.stevsuqkhv(tag, "REQUEST", false, 2, null) && !kcexrzcfyt.stevsuqkhv(tag, "RESPONSE", false, 2, null) && !kcexrzcfyt.stevsuqkhv(tag, "METRIC SENT", false, 2, null)) {
                return;
            }
            PrettyLogFormatter prettyLogFormatter3 = PrettyLogFormatter.INSTANCE;
            if (event == null) {
                event = "";
            }
            listMakeLogLines = prettyLogFormatter3.makeLogLines(tag, event, exception);
        }
        for (String str2 : listMakeLogLines) {
            this.logToFileWriter.getLocalChannel().eablkybsjg(new LogWriter.LogData(priority.getValue(), str, str2));
            this.logToConsoleWriter.getLocalChannel().eablkybsjg(new LogWriter.LogData(priority.getValue(), PRETTY_LOGGER_TAG, str2));
        }
    }
}
