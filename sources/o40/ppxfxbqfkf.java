package o40;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.io.Closeable;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import lk.cdpycssgdh;
import lk.lereixgezr;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.ikoacuggdj;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements o40.zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f72002gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wkgbmnqykc f72003eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lereixgezr f72004iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ConnectivityManager f72005ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zynmafqrjb f72006wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f72007zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: o40.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C1555ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f72008iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f72010yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f72011zdlpuopuiu;

        C1555ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f72010yggfygwlhe = obj;
            this.f72008iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.gtknphoqwx(null, null, this);
        }
    }

    public static final class wkgbmnqykc extends ConnectivityManager.NetworkCallback {
        wkgbmnqykc() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            zdlpuopuiu.btonecajqb(network, "network");
            ppxfxbqfkf.this.f72006wkgbmnqykc.setValue(Boolean.TRUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            zdlpuopuiu.btonecajqb(network, "network");
            zdlpuopuiu.btonecajqb(networkCapabilities, "networkCapabilities");
            ppxfxbqfkf.this.f72006wkgbmnqykc.setValue(Boolean.valueOf(ppxfxbqfkf.this.isConnected()));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            zdlpuopuiu.btonecajqb(network, "network");
            ppxfxbqfkf.this.f72006wkgbmnqykc.setValue(Boolean.FALSE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            ppxfxbqfkf.this.f72006wkgbmnqykc.setValue(Boolean.FALSE);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f72013cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f72014esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f72015iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f72016jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ int f72017lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f72018pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f72019yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f72020zdlpuopuiu;

        static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ lk.zynmafqrjb f72021cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f72022iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ List f72023jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f72024yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f72025zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(List list, ppxfxbqfkf ppxfxbqfkfVar, lk.zynmafqrjb zynmafqrjbVar, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f72023jyumaefscl = list;
                this.f72022iwizpuwonk = ppxfxbqfkfVar;
                this.f72021cqumvgiudr = zynmafqrjbVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f72023jyumaefscl, this.f72022iwizpuwonk, this.f72021cqumvgiudr, gxszxtbevoVar);
                iobyxmoadgVar.f72024yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objWkgbmnqykc;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f72025zdlpuopuiu;
                try {
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        ppxfxbqfkf ppxfxbqfkfVar = this.f72022iwizpuwonk;
                        lk.zynmafqrjb zynmafqrjbVar = this.f72021cqumvgiudr;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                        lereixgezr lereixgezrVar = ppxfxbqfkfVar.f72004iobyxmoadg;
                        this.f72025zdlpuopuiu = 1;
                        obj = ppxfxbqfkfVar.gtknphoqwx(lereixgezrVar, zynmafqrjbVar, this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(((Number) obj).longValue()));
                } catch (Throwable th2) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
                List list = this.f72023jyumaefscl;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    list.add(kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(((Number) objWkgbmnqykc).longValue()));
                }
                return kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(int i13, ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f72017lereixgezr = i13;
            this.f72018pmvmpeiblj = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f72017lereixgezr, this.f72018pmvmpeiblj, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0049  */
        /* JADX WARN: Code duplicated, block: B:12:0x0063 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0061 -> B:13:0x0064). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r10.f72014esjtqupxsv
                r2 = 1
                if (r1 == 0) goto L27
                if (r1 != r2) goto L1f
                int r1 = r10.f72013cqumvgiudr
                int r3 = r10.f72015iwizpuwonk
                java.lang.Object r4 = r10.f72016jyumaefscl
                o40.ppxfxbqfkf r4 = (o40.ppxfxbqfkf) r4
                java.lang.Object r5 = r10.f72019yggfygwlhe
                lk.zynmafqrjb r5 = (lk.zynmafqrjb) r5
                java.lang.Object r6 = r10.f72020zdlpuopuiu
                java.util.List r6 = (java.util.List) r6
                gg.zdlpuopuiu.zoijcleaow(r11)
                goto L64
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                gg.zdlpuopuiu.zoijcleaow(r11)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                lk.zynmafqrjb$iobyxmoadg r1 = new lk.zynmafqrjb$iobyxmoadg
                r1.<init>()
                java.lang.String r3 = "https://www.myspar.ru"
                lk.zynmafqrjb$iobyxmoadg r1 = r1.kcexrzcfyt(r3)
                lk.zynmafqrjb r1 = r1.zoijcleaow()
                int r3 = r10.f72017lereixgezr
                o40.ppxfxbqfkf r4 = r10.f72018pmvmpeiblj
                r5 = 0
                r6 = r11
                r9 = r5
                r5 = r1
                r1 = r9
            L47:
                if (r1 >= r3) goto L66
                o40.ppxfxbqfkf$zoijcleaow$iobyxmoadg r11 = new o40.ppxfxbqfkf$zoijcleaow$iobyxmoadg
                r7 = 0
                r11.<init>(r6, r4, r5, r7)
                r10.f72020zdlpuopuiu = r6
                r10.f72019yggfygwlhe = r5
                r10.f72016jyumaefscl = r4
                r10.f72015iwizpuwonk = r3
                r10.f72013cqumvgiudr = r1
                r10.f72014esjtqupxsv = r2
                r7 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r11 = pj.f.wkgbmnqykc(r7, r11, r10)
                if (r11 != r0) goto L64
                return r0
            L64:
                int r1 = r1 + r2
                goto L47
            L66:
                o40.ppxfxbqfkf r11 = r10.f72018pmvmpeiblj
                o40.wkgbmnqykc r11 = o40.ppxfxbqfkf.gxszxtbevo(r11, r6)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o40.ppxfxbqfkf.zoijcleaow.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(Context context, lereixgezr client) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(client, "client");
        this.f72004iobyxmoadg = client;
        this.f72005ppxfxbqfkf = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        this.f72006wkgbmnqykc = kegysxyocb.iobyxmoadg(Boolean.valueOf(isConnected()));
        this.f72003eablkybsjg = new wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o40.wkgbmnqykc btonecajqb(List list) {
        if (list.size() <= 1) {
            return o40.wkgbmnqykc.OFFLINE;
        }
        int iOkpsazkaxt = (int) jyumaefscl.okpsazkaxt(list);
        return (iOkpsazkaxt < 0 || iOkpsazkaxt >= 301) ? o40.wkgbmnqykc.POOR : o40.wkgbmnqykc.GOOD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gtknphoqwx(lereixgezr lereixgezrVar, lk.zynmafqrjb zynmafqrjbVar, gxszxtbevo gxszxtbevoVar) {
        C1555ppxfxbqfkf c1555ppxfxbqfkf;
        if (gxszxtbevoVar instanceof C1555ppxfxbqfkf) {
            c1555ppxfxbqfkf = (C1555ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c1555ppxfxbqfkf.f72008iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1555ppxfxbqfkf.f72008iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1555ppxfxbqfkf = new C1555ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c1555ppxfxbqfkf = new C1555ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZdlpuopuiu = c1555ppxfxbqfkf.f72010yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1555ppxfxbqfkf.f72008iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
            lk.eablkybsjg eablkybsjgVarIobyxmoadg = lereixgezrVar.iobyxmoadg(zynmafqrjbVar);
            c1555ppxfxbqfkf.f72011zdlpuopuiu = eablkybsjgVarIobyxmoadg;
            c1555ppxfxbqfkf.f72008iwizpuwonk = 1;
            pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(c1555ppxfxbqfkf), 1);
            rgvfuqvkyqVar.lereixgezr();
            o40.iobyxmoadg iobyxmoadgVar = new o40.iobyxmoadg(eablkybsjgVarIobyxmoadg, rgvfuqvkyqVar);
            FirebasePerfOkHttpClient.enqueue(eablkybsjgVarIobyxmoadg, iobyxmoadgVar);
            rgvfuqvkyqVar.stevsuqkhv(iobyxmoadgVar);
            objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
            if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                nufgyqmvbu.ppxfxbqfkf(c1555ppxfxbqfkf);
            }
            if (objZdlpuopuiu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
        }
        Closeable closeable = (Closeable) objZdlpuopuiu;
        try {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) closeable;
            Long lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(cdpycssgdhVar.istkbnxepw() - cdpycssgdhVar.wwaezpbzkn());
            rg.zoijcleaow.iobyxmoadg(closeable, null);
            return lEablkybsjg;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(closeable, th2);
                throw th3;
            }
        }
    }

    @Override // o40.zoijcleaow
    public Object eablkybsjg(int i13, gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(ikoacuggdj.zoijcleaow(), new zoijcleaow(i13, this, null), gxszxtbevoVar);
    }

    @Override // o40.zoijcleaow
    public void iobyxmoadg() {
        if (this.f72007zoijcleaow) {
            return;
        }
        this.f72005ppxfxbqfkf.registerDefaultNetworkCallback(this.f72003eablkybsjg);
        this.f72007zoijcleaow = true;
    }

    @Override // o40.zoijcleaow
    public boolean isConnected() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.f72005ppxfxbqfkf.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = this.f72005ppxfxbqfkf.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
    }

    @Override // o40.zoijcleaow
    public void ppxfxbqfkf() {
        if (this.f72007zoijcleaow) {
            this.f72005ppxfxbqfkf.unregisterNetworkCallback(this.f72003eablkybsjg);
            this.f72007zoijcleaow = false;
        }
    }

    @Override // o40.zoijcleaow
    public void wkgbmnqykc() {
        this.f72006wkgbmnqykc.setValue(Boolean.valueOf(isConnected()));
    }

    @Override // o40.zoijcleaow
    public wypolnanlu zoijcleaow() {
        return this.f72006wkgbmnqykc;
    }
}
