package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import id.eablkybsjg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ld.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public class Trace extends com.google.firebase.perf.application.zoijcleaow implements Parcelable, kd.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private Timer f24625cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Map f24626cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Map f24627esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final md.iobyxmoadg f24628istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f24629iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final GaugeManager f24630jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final List f24631lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final List f24632pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private Timer f24633yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Trace f24634yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final WeakReference f24635zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final gtknphoqwx f24636zynmafqrjb;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final gd.iobyxmoadg f24622iozdgvuglv = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final Map f24623lmojexxdyd = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final Parcelable.Creator f24624wwaezpbzkn = new zoijcleaow();

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i13) {
            return new Trace[i13];
        }
    }

    class zoijcleaow implements Parcelable.Creator {
        zoijcleaow() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i13) {
            return new Trace[i13];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z13, iobyxmoadg iobyxmoadgVar) {
        this(parcel, z13);
    }

    public static Trace eablkybsjg(String str) {
        return new Trace(str);
    }

    private void iwizpuwonk(Timer timer) {
        if (this.f24632pmvmpeiblj.isEmpty()) {
            return;
        }
        Trace trace = (Trace) this.f24632pmvmpeiblj.get(this.f24632pmvmpeiblj.size() - 1);
        if (trace.f24633yadqdtsiqt == null) {
            trace.f24633yadqdtsiqt = timer;
        }
    }

    private void ppxfxbqfkf(String str, String str2) {
        if (oxmwwwfdhm()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f24629iwizpuwonk));
        }
        if (!this.f24627esjtqupxsv.containsKey(str) && this.f24627esjtqupxsv.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        eablkybsjg.wkgbmnqykc(str, str2);
    }

    private Counter yggfygwlhe(String str) {
        Counter counter = (Counter) this.f24626cqumvgiudr.get(str);
        if (counter != null) {
            return counter;
        }
        Counter counter2 = new Counter(str);
        this.f24626cqumvgiudr.put(str, counter2);
        return counter2;
    }

    List btonecajqb() {
        return this.f24632pmvmpeiblj;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    Timer dxjokdxxww() {
        return this.f24625cdpycssgdh;
    }

    protected void finalize() throws Throwable {
        try {
            if (wflxmlrfwp()) {
                f24622iozdgvuglv.gtknphoqwx("Trace '%s' is started but not stopped when it is destructed!", this.f24629iwizpuwonk);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f24627esjtqupxsv.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f24627esjtqupxsv);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter = str != null ? (Counter) this.f24626cqumvgiudr.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.zoijcleaow();
    }

    public String getName() {
        return this.f24629iwizpuwonk;
    }

    boolean gtknphoqwx() {
        return this.f24625cdpycssgdh != null;
    }

    Map gxszxtbevo() {
        return this.f24626cqumvgiudr;
    }

    @Keep
    public void incrementMetric(String str, long j13) {
        String strEablkybsjg = eablkybsjg.eablkybsjg(str);
        if (strEablkybsjg != null) {
            f24622iozdgvuglv.wkgbmnqykc("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strEablkybsjg);
            return;
        }
        if (!gtknphoqwx()) {
            f24622iozdgvuglv.gtknphoqwx("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f24629iwizpuwonk);
        } else {
            if (oxmwwwfdhm()) {
                f24622iozdgvuglv.gtknphoqwx("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f24629iwizpuwonk);
                return;
            }
            Counter counterYggfygwlhe = yggfygwlhe(str.trim());
            counterYggfygwlhe.ppxfxbqfkf(j13);
            f24622iozdgvuglv.zoijcleaow("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(counterYggfygwlhe.zoijcleaow()), this.f24629iwizpuwonk);
        }
    }

    Timer lqeggnwhkg() {
        return this.f24633yadqdtsiqt;
    }

    List nufgyqmvbu() {
        List listUnmodifiableList;
        synchronized (this.f24631lereixgezr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f24631lereixgezr) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listUnmodifiableList;
    }

    boolean oxmwwwfdhm() {
        return this.f24633yadqdtsiqt != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z13;
        try {
            str = str.trim();
            str2 = str2.trim();
            ppxfxbqfkf(str, str2);
            f24622iozdgvuglv.zoijcleaow("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f24629iwizpuwonk);
            z13 = true;
        } catch (Exception e13) {
            f24622iozdgvuglv.wkgbmnqykc("Can not set attribute '%s' with value '%s' (%s)", str, str2, e13.getMessage());
            z13 = false;
        }
        if (z13) {
            this.f24627esjtqupxsv.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j13) {
        String strEablkybsjg = eablkybsjg.eablkybsjg(str);
        if (strEablkybsjg != null) {
            f24622iozdgvuglv.wkgbmnqykc("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strEablkybsjg);
            return;
        }
        if (!gtknphoqwx()) {
            f24622iozdgvuglv.gtknphoqwx("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f24629iwizpuwonk);
        } else if (oxmwwwfdhm()) {
            f24622iozdgvuglv.gtknphoqwx("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f24629iwizpuwonk);
        } else {
            yggfygwlhe(str.trim()).eablkybsjg(j13);
            f24622iozdgvuglv.zoijcleaow("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j13), this.f24629iwizpuwonk);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (oxmwwwfdhm()) {
            f24622iozdgvuglv.ppxfxbqfkf("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f24627esjtqupxsv.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg().hcddaimhww()) {
            f24622iozdgvuglv.iobyxmoadg("Trace feature is disabled.");
            return;
        }
        String strGxszxtbevo = eablkybsjg.gxszxtbevo(this.f24629iwizpuwonk);
        if (strGxszxtbevo != null) {
            f24622iozdgvuglv.wkgbmnqykc("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f24629iwizpuwonk, strGxszxtbevo);
            return;
        }
        if (this.f24625cdpycssgdh != null) {
            f24622iozdgvuglv.wkgbmnqykc("Trace '%s' has already started, should not start again!", this.f24629iwizpuwonk);
            return;
        }
        this.f24625cdpycssgdh = this.f24628istkbnxepw.iobyxmoadg();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f24635zdlpuopuiu);
        zoijcleaow(perfSession);
        if (perfSession.lqeggnwhkg()) {
            this.f24630jyumaefscl.collectGaugeMetricOnce(perfSession.gxszxtbevo());
        }
    }

    @Keep
    public void stop() {
        if (!gtknphoqwx()) {
            f24622iozdgvuglv.wkgbmnqykc("Trace '%s' has not been started so unable to stop!", this.f24629iwizpuwonk);
            return;
        }
        if (oxmwwwfdhm()) {
            f24622iozdgvuglv.wkgbmnqykc("Trace '%s' has already stopped, should not stop again!", this.f24629iwizpuwonk);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f24635zdlpuopuiu);
        unregisterForAppState();
        Timer timerIobyxmoadg = this.f24628istkbnxepw.iobyxmoadg();
        this.f24633yadqdtsiqt = timerIobyxmoadg;
        if (this.f24634yggfygwlhe == null) {
            iwizpuwonk(timerIobyxmoadg);
            if (this.f24629iwizpuwonk.isEmpty()) {
                f24622iozdgvuglv.ppxfxbqfkf("Trace name is empty, no log is sent to server");
                return;
            }
            this.f24636zynmafqrjb.istkbnxepw(new com.google.firebase.perf.metrics.iobyxmoadg(this).iobyxmoadg(), getAppState());
            if (SessionManager.getInstance().perfSession().lqeggnwhkg()) {
                this.f24630jyumaefscl.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().gxszxtbevo());
            }
        }
    }

    boolean wflxmlrfwp() {
        return gtknphoqwx() && !oxmwwwfdhm();
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f24634yggfygwlhe, 0);
        parcel.writeString(this.f24629iwizpuwonk);
        parcel.writeList(this.f24632pmvmpeiblj);
        parcel.writeMap(this.f24626cqumvgiudr);
        parcel.writeParcelable(this.f24625cdpycssgdh, 0);
        parcel.writeParcelable(this.f24633yadqdtsiqt, 0);
        synchronized (this.f24631lereixgezr) {
            parcel.writeList(this.f24631lereixgezr);
        }
    }

    @Override // kd.iobyxmoadg
    public void zoijcleaow(PerfSession perfSession) {
        if (perfSession == null) {
            f24622iozdgvuglv.btonecajqb("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!gtknphoqwx() || oxmwwwfdhm()) {
                return;
            }
            this.f24631lereixgezr.add(perfSession);
        }
    }

    private Trace(String str) {
        this(str, gtknphoqwx.gtknphoqwx(), new md.iobyxmoadg(), com.google.firebase.perf.application.iobyxmoadg.zoijcleaow(), GaugeManager.getInstance());
    }

    public Trace(String str, gtknphoqwx gtknphoqwxVar, md.iobyxmoadg iobyxmoadgVar, com.google.firebase.perf.application.iobyxmoadg iobyxmoadgVar2) {
        this(str, gtknphoqwxVar, iobyxmoadgVar, iobyxmoadgVar2, GaugeManager.getInstance());
    }

    public Trace(String str, gtknphoqwx gtknphoqwxVar, md.iobyxmoadg iobyxmoadgVar, com.google.firebase.perf.application.iobyxmoadg iobyxmoadgVar2, GaugeManager gaugeManager) {
        super(iobyxmoadgVar2);
        this.f24635zdlpuopuiu = new WeakReference(this);
        this.f24634yggfygwlhe = null;
        this.f24629iwizpuwonk = str.trim();
        this.f24632pmvmpeiblj = new ArrayList();
        this.f24626cqumvgiudr = new ConcurrentHashMap();
        this.f24627esjtqupxsv = new ConcurrentHashMap();
        this.f24628istkbnxepw = iobyxmoadgVar;
        this.f24636zynmafqrjb = gtknphoqwxVar;
        this.f24631lereixgezr = Collections.synchronizedList(new ArrayList());
        this.f24630jyumaefscl = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z13) {
        super(z13 ? null : com.google.firebase.perf.application.iobyxmoadg.zoijcleaow());
        this.f24635zdlpuopuiu = new WeakReference(this);
        this.f24634yggfygwlhe = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f24629iwizpuwonk = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f24632pmvmpeiblj = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f24626cqumvgiudr = concurrentHashMap;
        this.f24627esjtqupxsv = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f24625cdpycssgdh = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f24633yadqdtsiqt = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f24631lereixgezr = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z13) {
            this.f24636zynmafqrjb = null;
            this.f24628istkbnxepw = null;
            this.f24630jyumaefscl = null;
        } else {
            this.f24636zynmafqrjb = gtknphoqwx.gtknphoqwx();
            this.f24628istkbnxepw = new md.iobyxmoadg();
            this.f24630jyumaefscl = GaugeManager.getInstance();
        }
    }
}
