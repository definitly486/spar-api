package d3;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import b3.dxjokdxxww;
import b3.lqeggnwhkg;
import b3.nufgyqmvbu;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import lk.cdpycssgdh;
import lk.cqumvgiudr;
import lk.eablkybsjg;
import lk.gxszxtbevo;
import lk.istkbnxepw;
import lk.jyumaefscl;
import lk.wkgbmnqykc;
import lk.yadqdtsiqt;
import lk.zynmafqrjb;
import v2.zdlpuopuiu;
import xa.wflxmlrfwp;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg extends b3.iobyxmoadg implements androidx.media3.datasource.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f26867agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final wflxmlrfwp f26868btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private cdpycssgdh f26869draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final nufgyqmvbu f26870dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final eablkybsjg.iobyxmoadg f26871eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private lqeggnwhkg f26872gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final nufgyqmvbu f26873gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f26874lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final wkgbmnqykc f26875nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f26876ojitshcjhn;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private long f26877rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private InputStream f26878wflxmlrfwp;

    /* JADX INFO: renamed from: d3.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0488iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.nufgyqmvbu f26880zdlpuopuiu;

        C0488iobyxmoadg(com.google.common.util.concurrent.nufgyqmvbu nufgyqmvbuVar) {
            this.f26880zdlpuopuiu = nufgyqmvbuVar;
        }

        @Override // lk.gxszxtbevo
        public void gxszxtbevo(eablkybsjg eablkybsjgVar, IOException iOException) {
            this.f26880zdlpuopuiu.cqumvgiudr(iOException);
        }

        @Override // lk.gxszxtbevo
        public void ppxfxbqfkf(eablkybsjg eablkybsjgVar, cdpycssgdh cdpycssgdhVar) {
            this.f26880zdlpuopuiu.iwizpuwonk(cdpycssgdhVar);
        }
    }

    public static final class zoijcleaow implements androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private wkgbmnqykc f26881eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private wflxmlrfwp f26882gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nufgyqmvbu f26883iobyxmoadg = new nufgyqmvbu();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f26884ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private b3.wflxmlrfwp f26885wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final eablkybsjg.iobyxmoadg f26886zoijcleaow;

        public zoijcleaow(eablkybsjg.iobyxmoadg iobyxmoadgVar) {
            this.f26886zoijcleaow = iobyxmoadgVar;
        }

        @Override // androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg iobyxmoadg() {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f26886zoijcleaow, this.f26884ppxfxbqfkf, this.f26881eablkybsjg, this.f26883iobyxmoadg, this.f26882gxszxtbevo, null);
            b3.wflxmlrfwp wflxmlrfwpVar = this.f26885wkgbmnqykc;
            if (wflxmlrfwpVar != null) {
                iobyxmoadgVar.eablkybsjg(wflxmlrfwpVar);
            }
            return iobyxmoadgVar;
        }
    }

    static {
        zdlpuopuiu.iobyxmoadg("media3.datasource.okhttp");
    }

    /* synthetic */ iobyxmoadg(eablkybsjg.iobyxmoadg iobyxmoadgVar, String str, wkgbmnqykc wkgbmnqykcVar, nufgyqmvbu nufgyqmvbuVar, wflxmlrfwp wflxmlrfwpVar, C0488iobyxmoadg c0488iobyxmoadg) {
        this(iobyxmoadgVar, str, wkgbmnqykcVar, nufgyqmvbuVar, wflxmlrfwpVar);
    }

    private void cqumvgiudr(long j13, lqeggnwhkg lqeggnwhkgVar) throws HttpDataSource$HttpDataSourceException {
        if (j13 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j13 > 0) {
            try {
                int i13 = ((InputStream) stevsuqkhv.nufgyqmvbu(this.f26878wflxmlrfwp)).read(bArr, 0, (int) Math.min(j13, 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i13 == -1) {
                    throw new HttpDataSource$HttpDataSourceException(lqeggnwhkgVar, 2008, 1);
                }
                j13 -= (long) i13;
                rgvfuqvkyq(i13);
            } catch (IOException e13) {
                if (!(e13 instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(lqeggnwhkgVar, 2000, 1);
                }
                throw ((HttpDataSource$HttpDataSourceException) e13);
            }
        }
    }

    private int iwizpuwonk(byte[] bArr, int i13, int i14) throws IOException {
        if (i14 == 0) {
            return 0;
        }
        long j13 = this.f26876ojitshcjhn;
        if (j13 != -1) {
            long j14 = j13 - this.f26877rgvfuqvkyq;
            if (j14 == 0) {
                return -1;
            }
            i14 = (int) Math.min(i14, j14);
        }
        int i15 = ((InputStream) stevsuqkhv.nufgyqmvbu(this.f26878wflxmlrfwp)).read(bArr, i13, i14);
        if (i15 == -1) {
            return -1;
        }
        this.f26877rgvfuqvkyq += (long) i15;
        rgvfuqvkyq(i15);
        return i15;
    }

    private zynmafqrjb jyumaefscl(lqeggnwhkg lqeggnwhkgVar) throws HttpDataSource$HttpDataSourceException {
        long j13 = lqeggnwhkgVar.f15058lqeggnwhkg;
        long j14 = lqeggnwhkgVar.f15059nufgyqmvbu;
        jyumaefscl jyumaefsclVarWflxmlrfwp = jyumaefscl.wflxmlrfwp(lqeggnwhkgVar.f15057iobyxmoadg.toString());
        if (jyumaefsclVarWflxmlrfwp == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", lqeggnwhkgVar, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, 1);
        }
        zynmafqrjb.iobyxmoadg iobyxmoadgVarZdlpuopuiu = new zynmafqrjb.iobyxmoadg().zdlpuopuiu(jyumaefsclVarWflxmlrfwp);
        wkgbmnqykc wkgbmnqykcVar = this.f26875nufgyqmvbu;
        if (wkgbmnqykcVar != null) {
            iobyxmoadgVarZdlpuopuiu.ppxfxbqfkf(wkgbmnqykcVar);
        }
        HashMap map = new HashMap();
        nufgyqmvbu nufgyqmvbuVar = this.f26870dxjokdxxww;
        if (nufgyqmvbuVar != null) {
            map.putAll(nufgyqmvbuVar.iobyxmoadg());
        }
        map.putAll(this.f26873gxszxtbevo.iobyxmoadg());
        map.putAll(lqeggnwhkgVar.f15054eablkybsjg);
        for (Map.Entry entry : map.entrySet()) {
            iobyxmoadgVarZdlpuopuiu.dxjokdxxww((String) entry.getKey(), (String) entry.getValue());
        }
        String strIobyxmoadg = dxjokdxxww.iobyxmoadg(j13, j14);
        if (strIobyxmoadg != null) {
            iobyxmoadgVarZdlpuopuiu.iobyxmoadg("Range", strIobyxmoadg);
        }
        String str = this.f26874lqeggnwhkg;
        if (str != null) {
            iobyxmoadgVarZdlpuopuiu.iobyxmoadg("User-Agent", str);
        }
        if (!lqeggnwhkgVar.wkgbmnqykc(1)) {
            iobyxmoadgVarZdlpuopuiu.iobyxmoadg("Accept-Encoding", "identity");
        }
        byte[] bArr = lqeggnwhkgVar.f15061wkgbmnqykc;
        iobyxmoadgVarZdlpuopuiu.gtknphoqwx(lqeggnwhkgVar.zoijcleaow(), bArr != null ? istkbnxepw.gxszxtbevo(bArr) : lqeggnwhkgVar.f15060ppxfxbqfkf == 2 ? istkbnxepw.gxszxtbevo(stevsuqkhv.f123601gxszxtbevo) : null);
        return iobyxmoadgVarZdlpuopuiu.zoijcleaow();
    }

    private cdpycssgdh yggfygwlhe(eablkybsjg eablkybsjgVar) throws IOException {
        com.google.common.util.concurrent.nufgyqmvbu nufgyqmvbuVarEsjtqupxsv = com.google.common.util.concurrent.nufgyqmvbu.esjtqupxsv();
        FirebasePerfOkHttpClient.enqueue(eablkybsjgVar, new C0488iobyxmoadg(nufgyqmvbuVarEsjtqupxsv));
        try {
            return (cdpycssgdh) nufgyqmvbuVarEsjtqupxsv.get();
        } catch (InterruptedException unused) {
            eablkybsjgVar.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e13) {
            throw new IOException(e13);
        }
    }

    private void zdlpuopuiu() {
        cdpycssgdh cdpycssgdhVar = this.f26869draadjrbmk;
        if (cdpycssgdhVar != null) {
            ((yadqdtsiqt) y2.iobyxmoadg.eablkybsjg(cdpycssgdhVar.wkgbmnqykc())).close();
        }
        this.f26878wflxmlrfwp = null;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        cdpycssgdh cdpycssgdhVar = this.f26869draadjrbmk;
        if (cdpycssgdhVar != null) {
            return Uri.parse(cdpycssgdhVar.cdpycssgdh().gtknphoqwx().toString());
        }
        lqeggnwhkg lqeggnwhkgVar = this.f26872gtknphoqwx;
        if (lqeggnwhkgVar != null) {
            return lqeggnwhkgVar.f15057iobyxmoadg;
        }
        return null;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        if (this.f26867agtfadlqog) {
            this.f26867agtfadlqog = false;
            vdvldrhtss();
            zdlpuopuiu();
        }
        this.f26869draadjrbmk = null;
        this.f26872gtknphoqwx = null;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrZoijcleaow;
        this.f26872gtknphoqwx = lqeggnwhkgVar;
        long j13 = 0;
        this.f26877rgvfuqvkyq = 0L;
        this.f26876ojitshcjhn = 0L;
        oxmwwwfdhm(lqeggnwhkgVar);
        try {
            cdpycssgdh cdpycssgdhVarYggfygwlhe = yggfygwlhe(this.f26871eablkybsjg.iobyxmoadg(jyumaefscl(lqeggnwhkgVar)));
            this.f26869draadjrbmk = cdpycssgdhVarYggfygwlhe;
            yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) y2.iobyxmoadg.eablkybsjg(cdpycssgdhVarYggfygwlhe.wkgbmnqykc());
            this.f26878wflxmlrfwp = yadqdtsiqtVar.iobyxmoadg();
            int iBtonecajqb = cdpycssgdhVarYggfygwlhe.btonecajqb();
            if (!cdpycssgdhVarYggfygwlhe.iwxlajgraz()) {
                if (iBtonecajqb == 416) {
                    if (lqeggnwhkgVar.f15058lqeggnwhkg == dxjokdxxww.ppxfxbqfkf(cdpycssgdhVarYggfygwlhe.kcexrzcfyt().iobyxmoadg("Content-Range"))) {
                        this.f26867agtfadlqog = true;
                        kcexrzcfyt(lqeggnwhkgVar);
                        long j14 = lqeggnwhkgVar.f15059nufgyqmvbu;
                        if (j14 != -1) {
                            return j14;
                        }
                        return 0L;
                    }
                }
                try {
                    bArrZoijcleaow = ya.iobyxmoadg.zoijcleaow((InputStream) y2.iobyxmoadg.eablkybsjg(this.f26878wflxmlrfwp));
                } catch (IOException unused) {
                    bArrZoijcleaow = stevsuqkhv.f123601gxszxtbevo;
                }
                byte[] bArr = bArrZoijcleaow;
                Map mapDxjokdxxww = cdpycssgdhVarYggfygwlhe.kcexrzcfyt().dxjokdxxww();
                zdlpuopuiu();
                throw new HttpDataSource$InvalidResponseCodeException(iBtonecajqb, cdpycssgdhVarYggfygwlhe.zdlpuopuiu(), iBtonecajqb == 416 ? new DataSourceException(2008) : null, mapDxjokdxxww, lqeggnwhkgVar, bArr);
            }
            cqumvgiudr cqumvgiudrVarDxjokdxxww = yadqdtsiqtVar.dxjokdxxww();
            String string = cqumvgiudrVarDxjokdxxww != null ? cqumvgiudrVarDxjokdxxww.toString() : "";
            wflxmlrfwp wflxmlrfwpVar = this.f26868btonecajqb;
            if (wflxmlrfwpVar != null && !wflxmlrfwpVar.apply(string)) {
                zdlpuopuiu();
                throw new HttpDataSource$InvalidContentTypeException(string, lqeggnwhkgVar);
            }
            if (iBtonecajqb == 200) {
                long j15 = lqeggnwhkgVar.f15058lqeggnwhkg;
                if (j15 != 0) {
                    j13 = j15;
                }
            }
            long j16 = lqeggnwhkgVar.f15059nufgyqmvbu;
            if (j16 != -1) {
                this.f26876ojitshcjhn = j16;
            } else {
                long jNufgyqmvbu = yadqdtsiqtVar.nufgyqmvbu();
                this.f26876ojitshcjhn = jNufgyqmvbu != -1 ? jNufgyqmvbu - j13 : -1L;
            }
            this.f26867agtfadlqog = true;
            kcexrzcfyt(lqeggnwhkgVar);
            try {
                cqumvgiudr(j13, lqeggnwhkgVar);
                return this.f26876ojitshcjhn;
            } catch (HttpDataSource$HttpDataSourceException e13) {
                zdlpuopuiu();
                throw e13;
            }
        } catch (IOException e14) {
            throw HttpDataSource$HttpDataSourceException.lqeggnwhkg(e14, lqeggnwhkgVar, 1);
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Map wkgbmnqykc() {
        cdpycssgdh cdpycssgdhVar = this.f26869draadjrbmk;
        return cdpycssgdhVar == null ? Collections.emptyMap() : cdpycssgdhVar.kcexrzcfyt().dxjokdxxww();
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) throws HttpDataSource$HttpDataSourceException {
        try {
            return iwizpuwonk(bArr, i13, i14);
        } catch (IOException e13) {
            throw HttpDataSource$HttpDataSourceException.lqeggnwhkg(e13, (lqeggnwhkg) stevsuqkhv.nufgyqmvbu(this.f26872gtknphoqwx), 2);
        }
    }

    private iobyxmoadg(eablkybsjg.iobyxmoadg iobyxmoadgVar, String str, wkgbmnqykc wkgbmnqykcVar, nufgyqmvbu nufgyqmvbuVar, wflxmlrfwp wflxmlrfwpVar) {
        super(true);
        this.f26871eablkybsjg = (eablkybsjg.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        this.f26874lqeggnwhkg = str;
        this.f26875nufgyqmvbu = wkgbmnqykcVar;
        this.f26870dxjokdxxww = nufgyqmvbuVar;
        this.f26868btonecajqb = wflxmlrfwpVar;
        this.f26873gxszxtbevo = new nufgyqmvbu();
    }
}
