package modern.payments.tracker;

import android.content.Context;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.tracker.di.component.DaggerTrackerComponent;
import modern.payments.tracker.di.component.TrackerComponent;
import modern.payments.tracker.impl.TrackerImpl;
import modern.payments.tracker.util.logging.ILogTree;
import modern.payments.tracker.util.logging.ReleaseTree;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.skhdrjzrfn;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lmodern/payments/tracker/Tracker;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lgg/wwaezpbzkn;", "initDaggerComponent", "(Landroid/content/Context;)V", "Lmodern/payments/tracker/util/logging/ILogTree;", "getLogTree", "()Lmodern/payments/tracker/util/logging/ILogTree;", "initialize", "Lmodern/payments/tracker/ITracker;", "getTracker", "()Lmodern/payments/tracker/ITracker;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Tracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static cllcsxoeiz coroutineScope = dsvhmnatus.iobyxmoadg(skhdrjzrfn.zoijcleaow(null, 1, null));
    private static volatile Tracker instance;
    private static volatile ITracker tracker;
    private static volatile TrackerComponent trackerComponent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lmodern/payments/tracker/Tracker$Companion;", "", "<init>", "()V", "Lmodern/payments/tracker/Tracker;", "getInstance", "()Lmodern/payments/tracker/Tracker;", "Lmodern/payments/tracker/di/component/TrackerComponent;", "trackerComponent", "Lmodern/payments/tracker/di/component/TrackerComponent;", "getTrackerComponent", "()Lmodern/payments/tracker/di/component/TrackerComponent;", "setTrackerComponent", "(Lmodern/payments/tracker/di/component/TrackerComponent;)V", "Lpj/cllcsxoeiz;", "coroutineScope", "Lpj/cllcsxoeiz;", "instance", "Lmodern/payments/tracker/Tracker;", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/tracker/ITracker;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final synchronized Tracker getInstance() {
            Tracker tracker;
            try {
                if (Tracker.instance == null) {
                    Tracker.instance = new Tracker();
                }
                tracker = Tracker.instance;
                zdlpuopuiu.lqeggnwhkg(tracker);
            } catch (Throwable th2) {
                throw th2;
            }
            return tracker;
        }

        public final TrackerComponent getTrackerComponent() {
            return Tracker.trackerComponent;
        }

        public final void setTrackerComponent(TrackerComponent trackerComponent) {
            Tracker.trackerComponent = trackerComponent;
        }

        private Companion() {
        }
    }

    private final ILogTree getLogTree() {
        Locale locale = Locale.ROOT;
        String lowerCase = "release".toLowerCase(locale);
        zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        if (!kcexrzcfyt.sopmlzcsov(lowerCase, "debug", false, 2, null)) {
            String lowerCase2 = "release".toLowerCase(locale);
            zdlpuopuiu.dxjokdxxww(lowerCase2, "toLowerCase(...)");
            if (!kcexrzcfyt.sopmlzcsov(lowerCase2, "proxy", false, 2, null)) {
                return new ReleaseTree();
            }
        }
        TrackerComponent trackerComponent2 = trackerComponent;
        if (trackerComponent2 != null) {
            return trackerComponent2.getPrettyLogFormatterTree();
        }
        return null;
    }

    private final synchronized void initDaggerComponent(Context context) {
        if (trackerComponent != null) {
            return;
        }
        trackerComponent = DaggerTrackerComponent.builder().context(context).coroutineScope(coroutineScope).build();
    }

    public final synchronized ITracker getTracker() {
        ITracker iTracker;
        ILogTree logTree = getLogTree();
        iTracker = tracker;
        if (iTracker == null) {
            tracker = new TrackerImpl(logTree);
            iTracker = tracker;
            zdlpuopuiu.lqeggnwhkg(iTracker);
        }
        return iTracker;
    }

    public final synchronized void initialize(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        initDaggerComponent(context);
    }
}
