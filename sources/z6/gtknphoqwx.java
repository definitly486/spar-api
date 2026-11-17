package z6;

import android.net.Uri;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.network.HttpException;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import gg.wwaezpbzkn;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.cqumvgiudr;
import lk.yadqdtsiqt;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import x6.agtfadlqog;
import x6.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx implements dxjokdxxww {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f129183gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final lk.wkgbmnqykc f129184lqeggnwhkg = new lk.wkgbmnqykc.iobyxmoadg().gtknphoqwx().draadjrbmk().iobyxmoadg();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final lk.wkgbmnqykc f129185nufgyqmvbu = new lk.wkgbmnqykc.iobyxmoadg().gtknphoqwx().wflxmlrfwp().iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f129186eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f129187iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f129188ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f129189wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f129190zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f129191jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f129193zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129193zdlpuopuiu = obj;
            this.f129191jyumaefscl |= Integer.MIN_VALUE;
            return gtknphoqwx.this.ppxfxbqfkf(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f129195esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f129196iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f129197jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f129198yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f129199zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129196iwizpuwonk = obj;
            this.f129195esjtqupxsv |= Integer.MIN_VALUE;
            return gtknphoqwx.this.iobyxmoadg(this);
        }
    }

    public static final class zoijcleaow implements dxjokdxxww.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gg.gtknphoqwx f129200iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f129201ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gg.gtknphoqwx f129202zoijcleaow;

        public zoijcleaow(gg.gtknphoqwx gtknphoqwxVar, gg.gtknphoqwx gtknphoqwxVar2, boolean z13) {
            this.f129200iobyxmoadg = gtknphoqwxVar;
            this.f129202zoijcleaow = gtknphoqwxVar2;
            this.f129201ppxfxbqfkf = z13;
        }

        private final boolean ppxfxbqfkf(Uri uri) {
            return zdlpuopuiu.eablkybsjg(uri.getScheme(), HostSelectionInterceptorImpl.PROTOCOL_HTTP) || zdlpuopuiu.eablkybsjg(uri.getScheme(), HostSelectionInterceptorImpl.PROTOCOL_HTTPS);
        }

        @Override // z6.dxjokdxxww.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww iobyxmoadg(Uri uri, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            if (ppxfxbqfkf(uri)) {
                return new gtknphoqwx(uri.toString(), draadjrbmkVar, this.f129200iobyxmoadg, this.f129202zoijcleaow, this.f129201ppxfxbqfkf);
            }
            return null;
        }
    }

    public gtknphoqwx(String str, e7.draadjrbmk draadjrbmkVar, gg.gtknphoqwx gtknphoqwxVar, gg.gtknphoqwx gtknphoqwxVar2, boolean z13) {
        this.f129187iobyxmoadg = str;
        this.f129190zoijcleaow = draadjrbmkVar;
        this.f129188ppxfxbqfkf = gtknphoqwxVar;
        this.f129189wkgbmnqykc = gtknphoqwxVar2;
        this.f129186eablkybsjg = z13;
    }

    private final y6.iobyxmoadg.ppxfxbqfkf agtfadlqog(y6.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar, zynmafqrjb zynmafqrjbVar, cdpycssgdh cdpycssgdhVar, d7.iobyxmoadg iobyxmoadgVar) {
        y6.iobyxmoadg.zoijcleaow zoijcleaowVarIobyxmoadg;
        Throwable th2;
        wwaezpbzkn wwaezpbzknVar;
        Long lValueOf;
        wwaezpbzkn wwaezpbzknVar2;
        Throwable th3 = null;
        if (!lqeggnwhkg(zynmafqrjbVar, cdpycssgdhVar)) {
            if (ppxfxbqfkfVar != null) {
                i7.gtknphoqwx.wkgbmnqykc(ppxfxbqfkfVar);
            }
            return null;
        }
        if (ppxfxbqfkfVar != null) {
            zoijcleaowVarIobyxmoadg = ppxfxbqfkfVar.x();
        } else {
            y6.iobyxmoadg iobyxmoadgVar2 = (y6.iobyxmoadg) this.f129189wkgbmnqykc.getValue();
            zoijcleaowVarIobyxmoadg = iobyxmoadgVar2 != null ? iobyxmoadgVar2.iobyxmoadg(wkgbmnqykc()) : null;
        }
        try {
            if (zoijcleaowVarIobyxmoadg == null) {
                return null;
            }
            try {
                if (cdpycssgdhVar.btonecajqb() != 304 || iobyxmoadgVar == null) {
                    bl.wkgbmnqykc wkgbmnqykcVarZoijcleaow = bl.zdlpuopuiu.zoijcleaow(eablkybsjg().rgvfuqvkyq(zoijcleaowVarIobyxmoadg.getMetadata(), false));
                    try {
                        new d7.iobyxmoadg(cdpycssgdhVar).lqeggnwhkg(wkgbmnqykcVarZoijcleaow);
                        wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        if (wkgbmnqykcVarZoijcleaow != null) {
                            try {
                                wkgbmnqykcVarZoijcleaow.close();
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                        }
                        th2 = null;
                    } catch (Throwable th5) {
                        if (wkgbmnqykcVarZoijcleaow != null) {
                            try {
                                wkgbmnqykcVarZoijcleaow.close();
                            } catch (Throwable th6) {
                                gg.lqeggnwhkg.iobyxmoadg(th5, th6);
                            }
                        }
                        th2 = th5;
                        wwaezpbzknVar = null;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    zdlpuopuiu.lqeggnwhkg(wwaezpbzknVar);
                    bl.wkgbmnqykc wkgbmnqykcVarZoijcleaow2 = bl.zdlpuopuiu.zoijcleaow(eablkybsjg().rgvfuqvkyq(zoijcleaowVarIobyxmoadg.getData(), false));
                    try {
                        yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc();
                        zdlpuopuiu.lqeggnwhkg(yadqdtsiqtVarWkgbmnqykc);
                        lValueOf = Long.valueOf(yadqdtsiqtVarWkgbmnqykc.draadjrbmk().P(wkgbmnqykcVarZoijcleaow2));
                        if (wkgbmnqykcVarZoijcleaow2 != null) {
                            try {
                                wkgbmnqykcVarZoijcleaow2.close();
                            } catch (Throwable th7) {
                                th3 = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        if (wkgbmnqykcVarZoijcleaow2 != null) {
                            try {
                                wkgbmnqykcVarZoijcleaow2.close();
                            } catch (Throwable th9) {
                                gg.lqeggnwhkg.iobyxmoadg(th8, th9);
                            }
                        }
                        th3 = th8;
                        lValueOf = null;
                    }
                    if (th3 != null) {
                        throw th3;
                    }
                    zdlpuopuiu.lqeggnwhkg(lValueOf);
                } else {
                    cdpycssgdh cdpycssgdhVarPpxfxbqfkf = cdpycssgdhVar.cqumvgiudr().btonecajqb(d7.zoijcleaow.f27128ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar.wkgbmnqykc(), cdpycssgdhVar.kcexrzcfyt())).ppxfxbqfkf();
                    bl.wkgbmnqykc wkgbmnqykcVarZoijcleaow3 = bl.zdlpuopuiu.zoijcleaow(eablkybsjg().rgvfuqvkyq(zoijcleaowVarIobyxmoadg.getMetadata(), false));
                    try {
                        new d7.iobyxmoadg(cdpycssgdhVarPpxfxbqfkf).lqeggnwhkg(wkgbmnqykcVarZoijcleaow3);
                        wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                        if (wkgbmnqykcVarZoijcleaow3 != null) {
                            try {
                                wkgbmnqykcVarZoijcleaow3.close();
                            } catch (Throwable th10) {
                                th3 = th10;
                            }
                        }
                    } catch (Throwable th11) {
                        if (wkgbmnqykcVarZoijcleaow3 != null) {
                            try {
                                wkgbmnqykcVarZoijcleaow3.close();
                            } catch (Throwable th12) {
                                gg.lqeggnwhkg.iobyxmoadg(th11, th12);
                            }
                        }
                        th3 = th11;
                        wwaezpbzknVar2 = null;
                    }
                    if (th3 != null) {
                        throw th3;
                    }
                    zdlpuopuiu.lqeggnwhkg(wwaezpbzknVar2);
                }
                y6.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = zoijcleaowVarIobyxmoadg.iobyxmoadg();
                i7.gtknphoqwx.wkgbmnqykc(cdpycssgdhVar);
                return ppxfxbqfkfVarIobyxmoadg;
            } catch (Exception e13) {
                i7.gtknphoqwx.iobyxmoadg(zoijcleaowVarIobyxmoadg);
                throw e13;
            }
        } catch (Throwable th13) {
            i7.gtknphoqwx.wkgbmnqykc(cdpycssgdhVar);
            throw th13;
        }
    }

    private final d7.iobyxmoadg btonecajqb(y6.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar) throws Throwable {
        Throwable th2;
        d7.iobyxmoadg iobyxmoadgVar;
        try {
            bl.eablkybsjg eablkybsjgVarPpxfxbqfkf = bl.zdlpuopuiu.ppxfxbqfkf(eablkybsjg().vdvldrhtss(ppxfxbqfkfVar.getMetadata()));
            try {
                iobyxmoadgVar = new d7.iobyxmoadg(eablkybsjgVarPpxfxbqfkf);
                if (eablkybsjgVarPpxfxbqfkf != null) {
                    try {
                        eablkybsjgVarPpxfxbqfkf.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (eablkybsjgVarPpxfxbqfkf != null) {
                    try {
                        eablkybsjgVarPpxfxbqfkf.close();
                    } catch (Throwable th5) {
                        gg.lqeggnwhkg.iobyxmoadg(th4, th5);
                    }
                }
                th2 = th4;
                iobyxmoadgVar = null;
            }
            if (th2 != null) {
                throw th2;
            }
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
            return iobyxmoadgVar;
        } catch (IOException unused) {
            return null;
        }
    }

    private final agtfadlqog draadjrbmk(yadqdtsiqt yadqdtsiqtVar) {
        return ojitshcjhn.iobyxmoadg(yadqdtsiqtVar.draadjrbmk(), this.f129190zoijcleaow.lqeggnwhkg());
    }

    private final y6.iobyxmoadg.ppxfxbqfkf dxjokdxxww() {
        y6.iobyxmoadg iobyxmoadgVar;
        if (!this.f129190zoijcleaow.dxjokdxxww().wkgbmnqykc() || (iobyxmoadgVar = (y6.iobyxmoadg) this.f129189wkgbmnqykc.getValue()) == null) {
            return null;
        }
        return iobyxmoadgVar.zoijcleaow(wkgbmnqykc());
    }

    private final bl.dxjokdxxww eablkybsjg() {
        Object value = this.f129189wkgbmnqykc.getValue();
        zdlpuopuiu.lqeggnwhkg(value);
        return ((y6.iobyxmoadg) value).ppxfxbqfkf();
    }

    private final x6.wkgbmnqykc gtknphoqwx(cdpycssgdh cdpycssgdhVar) {
        return cdpycssgdhVar.jyumaefscl() != null ? x6.wkgbmnqykc.NETWORK : x6.wkgbmnqykc.DISK;
    }

    private final boolean lqeggnwhkg(zynmafqrjb zynmafqrjbVar, cdpycssgdh cdpycssgdhVar) {
        return this.f129190zoijcleaow.dxjokdxxww().lqeggnwhkg() && (!this.f129186eablkybsjg || d7.zoijcleaow.f27128ppxfxbqfkf.ppxfxbqfkf(zynmafqrjbVar, cdpycssgdhVar));
    }

    private final zynmafqrjb nufgyqmvbu() {
        zynmafqrjb.iobyxmoadg iobyxmoadgVarBtonecajqb = new zynmafqrjb.iobyxmoadg().kcexrzcfyt(this.f129187iobyxmoadg).btonecajqb(this.f129190zoijcleaow.btonecajqb());
        for (Map.Entry entry : this.f129190zoijcleaow.rgvfuqvkyq().iobyxmoadg().entrySet()) {
            Object key = entry.getKey();
            zdlpuopuiu.nufgyqmvbu(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            iobyxmoadgVarBtonecajqb.oxmwwwfdhm((Class) key, entry.getValue());
        }
        boolean zWkgbmnqykc = this.f129190zoijcleaow.dxjokdxxww().wkgbmnqykc();
        boolean zWkgbmnqykc2 = this.f129190zoijcleaow.gtknphoqwx().wkgbmnqykc();
        if (!zWkgbmnqykc2 && zWkgbmnqykc) {
            iobyxmoadgVarBtonecajqb.ppxfxbqfkf(lk.wkgbmnqykc.f63216rgvfuqvkyq);
        } else if (!zWkgbmnqykc2 || zWkgbmnqykc) {
            if (!zWkgbmnqykc2 && !zWkgbmnqykc) {
                iobyxmoadgVarBtonecajqb.ppxfxbqfkf(f129185nufgyqmvbu);
            }
        } else if (this.f129190zoijcleaow.dxjokdxxww().lqeggnwhkg()) {
            iobyxmoadgVarBtonecajqb.ppxfxbqfkf(lk.wkgbmnqykc.f63215ojitshcjhn);
        } else {
            iobyxmoadgVarBtonecajqb.ppxfxbqfkf(f129184lqeggnwhkg);
        }
        return iobyxmoadgVarBtonecajqb.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ppxfxbqfkf(zynmafqrjb zynmafqrjbVar, lg.gxszxtbevo gxszxtbevoVar) throws IOException {
        ppxfxbqfkf ppxfxbqfkfVar;
        cdpycssgdh cdpycssgdhVarExecute;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f129191jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f129191jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f129193zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f129191jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            if (!i7.gtknphoqwx.oxmwwwfdhm()) {
                lk.eablkybsjg eablkybsjgVarIobyxmoadg = ((lk.eablkybsjg.iobyxmoadg) this.f129188ppxfxbqfkf.getValue()).iobyxmoadg(zynmafqrjbVar);
                ppxfxbqfkfVar.f129191jyumaefscl = 1;
                objIobyxmoadg = i7.zoijcleaow.iobyxmoadg(eablkybsjgVarIobyxmoadg, ppxfxbqfkfVar);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (this.f129190zoijcleaow.gtknphoqwx().wkgbmnqykc()) {
                    throw new NetworkOnMainThreadException();
                }
                cdpycssgdhVarExecute = FirebasePerfOkHttpClient.execute(((lk.eablkybsjg.iobyxmoadg) this.f129188ppxfxbqfkf.getValue()).iobyxmoadg(zynmafqrjbVar));
            }
            if (!cdpycssgdhVarExecute.iwxlajgraz() || cdpycssgdhVarExecute.btonecajqb() == 304) {
                return cdpycssgdhVarExecute;
            }
            yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVarExecute.wkgbmnqykc();
            if (yadqdtsiqtVarWkgbmnqykc != null) {
                i7.gtknphoqwx.wkgbmnqykc(yadqdtsiqtVarWkgbmnqykc);
            }
            throw new HttpException(cdpycssgdhVarExecute);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        cdpycssgdhVarExecute = (cdpycssgdh) objIobyxmoadg;
        if (cdpycssgdhVarExecute.iwxlajgraz()) {
        }
        return cdpycssgdhVarExecute;
    }

    private final agtfadlqog wflxmlrfwp(y6.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar) {
        return ojitshcjhn.ppxfxbqfkf(ppxfxbqfkfVar.getData(), eablkybsjg(), wkgbmnqykc(), ppxfxbqfkfVar);
    }

    private final String wkgbmnqykc() {
        String strNufgyqmvbu = this.f129190zoijcleaow.nufgyqmvbu();
        return strNufgyqmvbu == null ? this.f129187iobyxmoadg : strNufgyqmvbu;
    }

    public final String gxszxtbevo(String str, cqumvgiudr cqumvgiudrVar) {
        String strBtonecajqb;
        String string = cqumvgiudrVar != null ? cqumvgiudrVar.toString() : null;
        if ((string == null || kcexrzcfyt.stevsuqkhv(string, "text/plain", false, 2, null)) && (strBtonecajqb = i7.gtknphoqwx.btonecajqb(MimeTypeMap.getSingleton(), str)) != null) {
            return strBtonecajqb;
        }
        if (string != null) {
            return kcexrzcfyt.j(string, ';', null, 2, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x012c A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013a A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014d A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0155 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x016d A[Catch: Exception -> 0x013f, TRY_LEAVE, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z6.dxjokdxxww
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) throws Exception {
        wkgbmnqykc wkgbmnqykcVar;
        y6.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar;
        Exception e13;
        d7.zoijcleaow zoijcleaowVarZoijcleaow;
        gtknphoqwx gtknphoqwxVar;
        y6.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarAgtfadlqog;
        d7.zoijcleaow zoijcleaowVar;
        cdpycssgdh cdpycssgdhVar;
        yadqdtsiqt yadqdtsiqtVarEsjtqupxsv;
        cdpycssgdh cdpycssgdhVar2;
        Exception e14;
        Object objPpxfxbqfkf;
        gtknphoqwx gtknphoqwxVar2;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f129195esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f129195esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f129196iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f129195esjtqupxsv;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cdpycssgdhVar2 = (cdpycssgdh) wkgbmnqykcVar.f129197jyumaefscl;
                ppxfxbqfkfVarAgtfadlqog = (y6.iobyxmoadg.ppxfxbqfkf) wkgbmnqykcVar.f129198yggfygwlhe;
                gtknphoqwxVar2 = (gtknphoqwx) wkgbmnqykcVar.f129199zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    cdpycssgdh cdpycssgdhVar3 = (cdpycssgdh) obj;
                    yadqdtsiqt yadqdtsiqtVarEsjtqupxsv2 = i7.gtknphoqwx.esjtqupxsv(cdpycssgdhVar3);
                    return new wflxmlrfwp(gtknphoqwxVar2.draadjrbmk(yadqdtsiqtVarEsjtqupxsv2), gtknphoqwxVar2.gxszxtbevo(gtknphoqwxVar2.f129187iobyxmoadg, yadqdtsiqtVarEsjtqupxsv2.dxjokdxxww()), gtknphoqwxVar2.gtknphoqwx(cdpycssgdhVar3));
                } catch (Exception e15) {
                    e14 = e15;
                    i7.gtknphoqwx.wkgbmnqykc(cdpycssgdhVar2);
                    throw e14;
                }
            }
            d7.zoijcleaow zoijcleaowVar2 = (d7.zoijcleaow) wkgbmnqykcVar.f129197jyumaefscl;
            ppxfxbqfkfVar = (y6.iobyxmoadg.ppxfxbqfkf) wkgbmnqykcVar.f129198yggfygwlhe;
            gtknphoqwxVar = (gtknphoqwx) wkgbmnqykcVar.f129199zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zoijcleaowVar = zoijcleaowVar2;
                ppxfxbqfkfVarAgtfadlqog = ppxfxbqfkfVar;
                try {
                    cdpycssgdhVar = (cdpycssgdh) obj;
                    yadqdtsiqtVarEsjtqupxsv = i7.gtknphoqwx.esjtqupxsv(cdpycssgdhVar);
                    try {
                        ppxfxbqfkfVarAgtfadlqog = gtknphoqwxVar.agtfadlqog(ppxfxbqfkfVarAgtfadlqog, zoijcleaowVar.zoijcleaow(), cdpycssgdhVar, zoijcleaowVar.iobyxmoadg());
                        if (ppxfxbqfkfVarAgtfadlqog != null) {
                            agtfadlqog agtfadlqogVarWflxmlrfwp = gtknphoqwxVar.wflxmlrfwp(ppxfxbqfkfVarAgtfadlqog);
                            String str = gtknphoqwxVar.f129187iobyxmoadg;
                            d7.iobyxmoadg iobyxmoadgVarBtonecajqb = gtknphoqwxVar.btonecajqb(ppxfxbqfkfVarAgtfadlqog);
                            return new wflxmlrfwp(agtfadlqogVarWflxmlrfwp, gtknphoqwxVar.gxszxtbevo(str, iobyxmoadgVarBtonecajqb != null ? iobyxmoadgVarBtonecajqb.zoijcleaow() : null), x6.wkgbmnqykc.NETWORK);
                        }
                        if (yadqdtsiqtVarEsjtqupxsv.nufgyqmvbu() > 0) {
                            return new wflxmlrfwp(gtknphoqwxVar.draadjrbmk(yadqdtsiqtVarEsjtqupxsv), gtknphoqwxVar.gxszxtbevo(gtknphoqwxVar.f129187iobyxmoadg, yadqdtsiqtVarEsjtqupxsv.dxjokdxxww()), gtknphoqwxVar.gtknphoqwx(cdpycssgdhVar));
                        }
                        i7.gtknphoqwx.wkgbmnqykc(cdpycssgdhVar);
                        zynmafqrjb zynmafqrjbVarNufgyqmvbu = gtknphoqwxVar.nufgyqmvbu();
                        wkgbmnqykcVar.f129199zdlpuopuiu = gtknphoqwxVar;
                        wkgbmnqykcVar.f129198yggfygwlhe = ppxfxbqfkfVarAgtfadlqog;
                        wkgbmnqykcVar.f129197jyumaefscl = cdpycssgdhVar;
                        wkgbmnqykcVar.f129195esjtqupxsv = 2;
                        objPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf(zynmafqrjbVarNufgyqmvbu, wkgbmnqykcVar);
                        if (objPpxfxbqfkf == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        cdpycssgdhVar2 = cdpycssgdhVar;
                        obj = objPpxfxbqfkf;
                        gtknphoqwxVar2 = gtknphoqwxVar;
                        cdpycssgdh cdpycssgdhVar4 = (cdpycssgdh) obj;
                        yadqdtsiqt yadqdtsiqtVarEsjtqupxsv3 = i7.gtknphoqwx.esjtqupxsv(cdpycssgdhVar4);
                        return new wflxmlrfwp(gtknphoqwxVar2.draadjrbmk(yadqdtsiqtVarEsjtqupxsv3), gtknphoqwxVar2.gxszxtbevo(gtknphoqwxVar2.f129187iobyxmoadg, yadqdtsiqtVarEsjtqupxsv3.dxjokdxxww()), gtknphoqwxVar2.gtknphoqwx(cdpycssgdhVar4));
                    } catch (Exception e16) {
                        cdpycssgdhVar2 = cdpycssgdhVar;
                        e14 = e16;
                        i7.gtknphoqwx.wkgbmnqykc(cdpycssgdhVar2);
                        throw e14;
                    }
                } catch (Exception e17) {
                    e13 = e17;
                    ppxfxbqfkfVar = ppxfxbqfkfVarAgtfadlqog;
                    if (ppxfxbqfkfVar != null) {
                        i7.gtknphoqwx.wkgbmnqykc(ppxfxbqfkfVar);
                    }
                    throw e13;
                }
            } catch (Exception e18) {
                e13 = e18;
                if (ppxfxbqfkfVar != null) {
                    i7.gtknphoqwx.wkgbmnqykc(ppxfxbqfkfVar);
                }
                throw e13;
            }
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        y6.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = dxjokdxxww();
        try {
            if (ppxfxbqfkfVarDxjokdxxww != null) {
                Long lWkgbmnqykc = eablkybsjg().draadjrbmk(ppxfxbqfkfVarDxjokdxxww.getMetadata()).wkgbmnqykc();
                if (lWkgbmnqykc != null && lWkgbmnqykc.longValue() == 0) {
                    return new wflxmlrfwp(wflxmlrfwp(ppxfxbqfkfVarDxjokdxxww), gxszxtbevo(this.f129187iobyxmoadg, null), x6.wkgbmnqykc.DISK);
                }
                if (!this.f129186eablkybsjg) {
                    agtfadlqog agtfadlqogVarWflxmlrfwp2 = wflxmlrfwp(ppxfxbqfkfVarDxjokdxxww);
                    String str2 = this.f129187iobyxmoadg;
                    d7.iobyxmoadg iobyxmoadgVarBtonecajqb2 = btonecajqb(ppxfxbqfkfVarDxjokdxxww);
                    return new wflxmlrfwp(agtfadlqogVarWflxmlrfwp2, gxszxtbevo(str2, iobyxmoadgVarBtonecajqb2 != null ? iobyxmoadgVarBtonecajqb2.zoijcleaow() : null), x6.wkgbmnqykc.DISK);
                }
                zoijcleaowVarZoijcleaow = new d7.zoijcleaow.C0500zoijcleaow(nufgyqmvbu(), btonecajqb(ppxfxbqfkfVarDxjokdxxww)).zoijcleaow();
                if (zoijcleaowVarZoijcleaow.zoijcleaow() == null && zoijcleaowVarZoijcleaow.iobyxmoadg() != null) {
                    return new wflxmlrfwp(wflxmlrfwp(ppxfxbqfkfVarDxjokdxxww), gxszxtbevo(this.f129187iobyxmoadg, zoijcleaowVarZoijcleaow.iobyxmoadg().zoijcleaow()), x6.wkgbmnqykc.DISK);
                }
            } else {
                zoijcleaowVarZoijcleaow = new d7.zoijcleaow.C0500zoijcleaow(nufgyqmvbu(), null).zoijcleaow();
            }
            zynmafqrjb zynmafqrjbVarZoijcleaow = zoijcleaowVarZoijcleaow.zoijcleaow();
            zdlpuopuiu.lqeggnwhkg(zynmafqrjbVarZoijcleaow);
            wkgbmnqykcVar.f129199zdlpuopuiu = this;
            wkgbmnqykcVar.f129198yggfygwlhe = ppxfxbqfkfVarDxjokdxxww;
            wkgbmnqykcVar.f129197jyumaefscl = zoijcleaowVarZoijcleaow;
            wkgbmnqykcVar.f129195esjtqupxsv = 1;
            Object objPpxfxbqfkf2 = ppxfxbqfkf(zynmafqrjbVarZoijcleaow, wkgbmnqykcVar);
            if (objPpxfxbqfkf2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gtknphoqwxVar = this;
            d7.zoijcleaow zoijcleaowVar3 = zoijcleaowVarZoijcleaow;
            ppxfxbqfkfVarAgtfadlqog = ppxfxbqfkfVarDxjokdxxww;
            obj = objPpxfxbqfkf2;
            zoijcleaowVar = zoijcleaowVar3;
            cdpycssgdhVar = (cdpycssgdh) obj;
            yadqdtsiqtVarEsjtqupxsv = i7.gtknphoqwx.esjtqupxsv(cdpycssgdhVar);
            ppxfxbqfkfVarAgtfadlqog = gtknphoqwxVar.agtfadlqog(ppxfxbqfkfVarAgtfadlqog, zoijcleaowVar.zoijcleaow(), cdpycssgdhVar, zoijcleaowVar.iobyxmoadg());
            if (ppxfxbqfkfVarAgtfadlqog != null) {
                agtfadlqog agtfadlqogVarWflxmlrfwp3 = gtknphoqwxVar.wflxmlrfwp(ppxfxbqfkfVarAgtfadlqog);
                String str3 = gtknphoqwxVar.f129187iobyxmoadg;
                d7.iobyxmoadg iobyxmoadgVarBtonecajqb3 = gtknphoqwxVar.btonecajqb(ppxfxbqfkfVarAgtfadlqog);
                return new wflxmlrfwp(agtfadlqogVarWflxmlrfwp3, gtknphoqwxVar.gxszxtbevo(str3, iobyxmoadgVarBtonecajqb3 != null ? iobyxmoadgVarBtonecajqb3.zoijcleaow() : null), x6.wkgbmnqykc.NETWORK);
            }
            if (yadqdtsiqtVarEsjtqupxsv.nufgyqmvbu() > 0) {
                return new wflxmlrfwp(gtknphoqwxVar.draadjrbmk(yadqdtsiqtVarEsjtqupxsv), gtknphoqwxVar.gxszxtbevo(gtknphoqwxVar.f129187iobyxmoadg, yadqdtsiqtVarEsjtqupxsv.dxjokdxxww()), gtknphoqwxVar.gtknphoqwx(cdpycssgdhVar));
            }
            i7.gtknphoqwx.wkgbmnqykc(cdpycssgdhVar);
            zynmafqrjb zynmafqrjbVarNufgyqmvbu2 = gtknphoqwxVar.nufgyqmvbu();
            wkgbmnqykcVar.f129199zdlpuopuiu = gtknphoqwxVar;
            wkgbmnqykcVar.f129198yggfygwlhe = ppxfxbqfkfVarAgtfadlqog;
            wkgbmnqykcVar.f129197jyumaefscl = cdpycssgdhVar;
            wkgbmnqykcVar.f129195esjtqupxsv = 2;
            objPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf(zynmafqrjbVarNufgyqmvbu2, wkgbmnqykcVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cdpycssgdhVar2 = cdpycssgdhVar;
            obj = objPpxfxbqfkf;
            gtknphoqwxVar2 = gtknphoqwxVar;
            cdpycssgdh cdpycssgdhVar5 = (cdpycssgdh) obj;
            yadqdtsiqt yadqdtsiqtVarEsjtqupxsv4 = i7.gtknphoqwx.esjtqupxsv(cdpycssgdhVar5);
            return new wflxmlrfwp(gtknphoqwxVar2.draadjrbmk(yadqdtsiqtVarEsjtqupxsv4), gtknphoqwxVar2.gxszxtbevo(gtknphoqwxVar2.f129187iobyxmoadg, yadqdtsiqtVarEsjtqupxsv4.dxjokdxxww()), gtknphoqwxVar2.gtknphoqwx(cdpycssgdhVar5));
        } catch (Exception e19) {
            ppxfxbqfkfVar = ppxfxbqfkfVarDxjokdxxww;
            e13 = e19;
            if (ppxfxbqfkfVar != null) {
                i7.gtknphoqwx.wkgbmnqykc(ppxfxbqfkfVar);
            }
            throw e13;
        }
    }
}
