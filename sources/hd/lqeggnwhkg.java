package hd;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ld.gtknphoqwx;
import md.agtfadlqog;
import nd.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends com.google.firebase.perf.application.zoijcleaow implements kd.iobyxmoadg {

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final gd.iobyxmoadg f40080zynmafqrjb = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final WeakReference f40081cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private String f40082esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final nufgyqmvbu.zoijcleaow f40083iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f40084jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f40085lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f40086pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final GaugeManager f40087yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f40088zdlpuopuiu;

    private lqeggnwhkg(gtknphoqwx gtknphoqwxVar) {
        this(gtknphoqwxVar, com.google.firebase.perf.application.iobyxmoadg.zoijcleaow(), GaugeManager.getInstance());
    }

    private boolean btonecajqb() {
        return this.f40083iwizpuwonk.agtfadlqog();
    }

    private boolean dxjokdxxww() {
        return this.f40083iwizpuwonk.draadjrbmk();
    }

    public static lqeggnwhkg eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        return new lqeggnwhkg(gtknphoqwxVar);
    }

    private static boolean gtknphoqwx(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    public lqeggnwhkg esjtqupxsv(long j13) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f40081cqumvgiudr);
        this.f40083iwizpuwonk.ojitshcjhn(j13);
        zoijcleaow(perfSession);
        if (perfSession.lqeggnwhkg()) {
            this.f40087yggfygwlhe.collectGaugeMetricOnce(perfSession.gxszxtbevo());
        }
        return this;
    }

    List gxszxtbevo() {
        List listUnmodifiableList;
        synchronized (this.f40088zdlpuopuiu) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f40088zdlpuopuiu) {
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

    public lqeggnwhkg hcddaimhww(String str) {
        this.f40082esjtqupxsv = str;
        return this;
    }

    public lqeggnwhkg iozdgvuglv(long j13) {
        this.f40083iwizpuwonk.yggfygwlhe(j13);
        return this;
    }

    public lqeggnwhkg iwizpuwonk(long j13) {
        this.f40083iwizpuwonk.kcexrzcfyt(j13);
        return this;
    }

    public lqeggnwhkg lmojexxdyd(long j13) {
        this.f40083iwizpuwonk.jyumaefscl(j13);
        return this;
    }

    public long lqeggnwhkg() {
        return this.f40083iwizpuwonk.gtknphoqwx();
    }

    public boolean nufgyqmvbu() {
        return this.f40083iwizpuwonk.wflxmlrfwp();
    }

    public lqeggnwhkg oxmwwwfdhm(int i13) {
        this.f40083iwizpuwonk.vdvldrhtss(i13);
        return this;
    }

    public lqeggnwhkg pkzmftpjix(String str) {
        if (str != null) {
            this.f40083iwizpuwonk.esjtqupxsv(agtfadlqog.eablkybsjg(agtfadlqog.wkgbmnqykc(str), 2000));
        }
        return this;
    }

    public nufgyqmvbu ppxfxbqfkf() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f40081cqumvgiudr);
        unregisterForAppState();
        nd.gtknphoqwx[] gtknphoqwxVarArrPpxfxbqfkf = PerfSession.ppxfxbqfkf(gxszxtbevo());
        if (gtknphoqwxVarArrPpxfxbqfkf != null) {
            this.f40083iwizpuwonk.lqeggnwhkg(Arrays.asList(gtknphoqwxVarArrPpxfxbqfkf));
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f40083iwizpuwonk.build();
        if (!jd.wkgbmnqykc.ppxfxbqfkf(this.f40082esjtqupxsv)) {
            f40080zynmafqrjb.iobyxmoadg("Dropping network request from a 'User-Agent' that is not allowed");
            return nufgyqmvbuVar;
        }
        if (this.f40085lereixgezr) {
            if (this.f40086pmvmpeiblj) {
                f40080zynmafqrjb.iobyxmoadg("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return nufgyqmvbuVar;
        }
        this.f40084jyumaefscl.zynmafqrjb(nufgyqmvbuVar, getAppState());
        this.f40085lereixgezr = true;
        return nufgyqmvbuVar;
    }

    public lqeggnwhkg wflxmlrfwp(String str) {
        nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar;
        if (str != null) {
            nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar2 = nufgyqmvbu.wkgbmnqykc.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            switch (upperCase) {
                case "OPTIONS":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.OPTIONS;
                    break;
                case "GET":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.GET;
                    break;
                case "PUT":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.PUT;
                    break;
                case "HEAD":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.HEAD;
                    break;
                case "POST":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.POST;
                    break;
                case "PATCH":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.PATCH;
                    break;
                case "TRACE":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.TRACE;
                    break;
                case "CONNECT":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.CONNECT;
                    break;
                case "DELETE":
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.DELETE;
                    break;
                default:
                    wkgbmnqykcVar = nufgyqmvbu.wkgbmnqykc.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f40083iwizpuwonk.rgvfuqvkyq(wkgbmnqykcVar);
        }
        return this;
    }

    public lqeggnwhkg wwaezpbzkn(long j13) {
        this.f40083iwizpuwonk.iwizpuwonk(j13);
        if (SessionManager.getInstance().perfSession().lqeggnwhkg()) {
            this.f40087yggfygwlhe.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().gxszxtbevo());
        }
        return this;
    }

    public lqeggnwhkg yadqdtsiqt(String str) {
        if (str == null) {
            this.f40083iwizpuwonk.nufgyqmvbu();
            return this;
        }
        if (gtknphoqwx(str)) {
            this.f40083iwizpuwonk.zdlpuopuiu(str);
        } else {
            f40080zynmafqrjb.btonecajqb("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public lqeggnwhkg yggfygwlhe() {
        this.f40083iwizpuwonk.oxmwwwfdhm(nufgyqmvbu.eablkybsjg.GENERIC_CLIENT_ERROR);
        return this;
    }

    public lqeggnwhkg ylkuphrtab(long j13) {
        this.f40083iwizpuwonk.cqumvgiudr(j13);
        return this;
    }

    @Override // kd.iobyxmoadg
    public void zoijcleaow(PerfSession perfSession) {
        if (perfSession == null) {
            f40080zynmafqrjb.btonecajqb("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!dxjokdxxww() || btonecajqb()) {
                return;
            }
            this.f40088zdlpuopuiu.add(perfSession);
        }
    }

    public lqeggnwhkg(gtknphoqwx gtknphoqwxVar, com.google.firebase.perf.application.iobyxmoadg iobyxmoadgVar, GaugeManager gaugeManager) {
        super(iobyxmoadgVar);
        this.f40083iwizpuwonk = nufgyqmvbu.kegysxyocb();
        this.f40081cqumvgiudr = new WeakReference(this);
        this.f40084jyumaefscl = gtknphoqwxVar;
        this.f40087yggfygwlhe = gaugeManager;
        this.f40088zdlpuopuiu = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
