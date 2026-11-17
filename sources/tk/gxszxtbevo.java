package tk;

import bl.iozdgvuglv;
import bl.wwaezpbzkn;
import bl.ylkuphrtab;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.lereixgezr;
import lk.pmvmpeiblj;
import lk.yggfygwlhe;
import lk.zynmafqrjb;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo implements rk.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pmvmpeiblj f110851eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private volatile boolean f110852gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rk.wkgbmnqykc.iobyxmoadg f110853iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f110854ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile nufgyqmvbu f110855wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rk.lqeggnwhkg f110856zoijcleaow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f110849lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final List f110850nufgyqmvbu = rgvfuqvkyq.gtknphoqwx("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final List f110848dxjokdxxww = rgvfuqvkyq.gtknphoqwx("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: tk.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2731iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C2731iobyxmoadg f110857zdlpuopuiu = new C2731iobyxmoadg();

            C2731iobyxmoadg() {
                super(0);
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final yggfygwlhe invoke() {
                throw new IllegalStateException("trailers not available");
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final List iobyxmoadg(zynmafqrjb request) {
            zdlpuopuiu.btonecajqb(request, "request");
            yggfygwlhe yggfygwlheVarEablkybsjg = request.eablkybsjg();
            ArrayList arrayList = new ArrayList(yggfygwlheVarEablkybsjg.size() + 4);
            arrayList.add(new zoijcleaow(zoijcleaow.f110945lqeggnwhkg, request.lqeggnwhkg()));
            arrayList.add(new zoijcleaow(zoijcleaow.f110946nufgyqmvbu, rk.dxjokdxxww.f82947iobyxmoadg.ppxfxbqfkf(request.gtknphoqwx())));
            String strWkgbmnqykc = request.wkgbmnqykc("Host");
            if (strWkgbmnqykc != null) {
                arrayList.add(new zoijcleaow(zoijcleaow.f110941btonecajqb, strWkgbmnqykc));
            }
            arrayList.add(new zoijcleaow(zoijcleaow.f110942dxjokdxxww, request.gtknphoqwx().zdlpuopuiu()));
            int size = yggfygwlheVarEablkybsjg.size();
            for (int i13 = 0; i13 < size; i13++) {
                String strWkgbmnqykc2 = yggfygwlheVarEablkybsjg.wkgbmnqykc(i13);
                Locale US = Locale.US;
                zdlpuopuiu.dxjokdxxww(US, "US");
                String lowerCase = strWkgbmnqykc2.toLowerCase(US);
                zdlpuopuiu.dxjokdxxww(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!gxszxtbevo.f110850nufgyqmvbu.contains(lowerCase) || (zdlpuopuiu.eablkybsjg(lowerCase, "te") && zdlpuopuiu.eablkybsjg(yggfygwlheVarEablkybsjg.btonecajqb(i13), "trailers"))) {
                    arrayList.add(new zoijcleaow(lowerCase, yggfygwlheVarEablkybsjg.btonecajqb(i13)));
                }
            }
            return arrayList;
        }

        public final cdpycssgdh.iobyxmoadg zoijcleaow(yggfygwlhe headerBlock, pmvmpeiblj protocol) throws ProtocolException {
            zdlpuopuiu.btonecajqb(headerBlock, "headerBlock");
            zdlpuopuiu.btonecajqb(protocol, "protocol");
            yggfygwlhe.iobyxmoadg iobyxmoadgVar = new yggfygwlhe.iobyxmoadg();
            int size = headerBlock.size();
            rk.gtknphoqwx gtknphoqwxVarIobyxmoadg = null;
            for (int i13 = 0; i13 < size; i13++) {
                String strWkgbmnqykc = headerBlock.wkgbmnqykc(i13);
                String strBtonecajqb = headerBlock.btonecajqb(i13);
                if (zdlpuopuiu.eablkybsjg(strWkgbmnqykc, ":status")) {
                    gtknphoqwxVarIobyxmoadg = rk.gtknphoqwx.f82950wkgbmnqykc.iobyxmoadg("HTTP/1.1 " + strBtonecajqb);
                } else if (!gxszxtbevo.f110848dxjokdxxww.contains(strWkgbmnqykc)) {
                    iobyxmoadgVar.wkgbmnqykc(strWkgbmnqykc, strBtonecajqb);
                }
            }
            if (gtknphoqwxVarIobyxmoadg != null) {
                return new cdpycssgdh.iobyxmoadg().ojitshcjhn(protocol).eablkybsjg(gtknphoqwxVarIobyxmoadg.f82953zoijcleaow).draadjrbmk(gtknphoqwxVarIobyxmoadg.f82952ppxfxbqfkf).btonecajqb(iobyxmoadgVar.gxszxtbevo()).istkbnxepw(C2731iobyxmoadg.f110857zdlpuopuiu);
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(lereixgezr client, rk.wkgbmnqykc.iobyxmoadg carrier, rk.lqeggnwhkg chain, eablkybsjg http2Connection) {
        zdlpuopuiu.btonecajqb(client, "client");
        zdlpuopuiu.btonecajqb(carrier, "carrier");
        zdlpuopuiu.btonecajqb(chain, "chain");
        zdlpuopuiu.btonecajqb(http2Connection, "http2Connection");
        this.f110853iobyxmoadg = carrier;
        this.f110856zoijcleaow = chain;
        this.f110854ppxfxbqfkf = http2Connection;
        List listZynmafqrjb = client.zynmafqrjb();
        pmvmpeiblj pmvmpeibljVar = pmvmpeiblj.H2_PRIOR_KNOWLEDGE;
        this.f110851eablkybsjg = listZynmafqrjb.contains(pmvmpeibljVar) ? pmvmpeibljVar : pmvmpeiblj.HTTP_2;
    }

    @Override // rk.wkgbmnqykc
    public void cancel() {
        this.f110852gxszxtbevo = true;
        nufgyqmvbu nufgyqmvbuVar = this.f110855wkgbmnqykc;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.lqeggnwhkg(tk.iobyxmoadg.CANCEL);
        }
    }

    @Override // rk.wkgbmnqykc
    public yggfygwlhe dxjokdxxww() {
        nufgyqmvbu nufgyqmvbuVar = this.f110855wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar);
        return nufgyqmvbuVar.iozdgvuglv();
    }

    @Override // rk.wkgbmnqykc
    public void eablkybsjg(zynmafqrjb request) throws IOException {
        zdlpuopuiu.btonecajqb(request, "request");
        if (this.f110855wkgbmnqykc != null) {
            return;
        }
        this.f110855wkgbmnqykc = this.f110854ppxfxbqfkf.czzsidtyhn(f110849lqeggnwhkg.iobyxmoadg(request), request.iobyxmoadg() != null);
        if (this.f110852gxszxtbevo) {
            nufgyqmvbu nufgyqmvbuVar = this.f110855wkgbmnqykc;
            zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar);
            nufgyqmvbuVar.lqeggnwhkg(tk.iobyxmoadg.CANCEL);
            throw new IOException("Canceled");
        }
        nufgyqmvbu nufgyqmvbuVar2 = this.f110855wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar2);
        ylkuphrtab ylkuphrtabVarCqumvgiudr = nufgyqmvbuVar2.cqumvgiudr();
        long jGtknphoqwx = this.f110856zoijcleaow.gtknphoqwx();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ylkuphrtabVarCqumvgiudr.lqeggnwhkg(jGtknphoqwx, timeUnit);
        nufgyqmvbu nufgyqmvbuVar3 = this.f110855wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar3);
        nufgyqmvbuVar3.wwaezpbzkn().lqeggnwhkg(this.f110856zoijcleaow.wflxmlrfwp(), timeUnit);
    }

    @Override // rk.wkgbmnqykc
    public cdpycssgdh.iobyxmoadg gxszxtbevo(boolean z13) throws IOException {
        nufgyqmvbu nufgyqmvbuVar = this.f110855wkgbmnqykc;
        if (nufgyqmvbuVar == null) {
            throw new IOException("stream wasn't created");
        }
        cdpycssgdh.iobyxmoadg iobyxmoadgVarZoijcleaow = f110849lqeggnwhkg.zoijcleaow(nufgyqmvbuVar.yadqdtsiqt(z13), this.f110851eablkybsjg);
        if (z13 && iobyxmoadgVarZoijcleaow.gxszxtbevo() == 100) {
            return null;
        }
        return iobyxmoadgVarZoijcleaow;
    }

    @Override // rk.wkgbmnqykc
    public void iobyxmoadg() {
        nufgyqmvbu nufgyqmvbuVar = this.f110855wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar);
        nufgyqmvbuVar.rgvfuqvkyq().close();
    }

    @Override // rk.wkgbmnqykc
    public void lqeggnwhkg() {
        this.f110854ppxfxbqfkf.flush();
    }

    @Override // rk.wkgbmnqykc
    public rk.wkgbmnqykc.iobyxmoadg nufgyqmvbu() {
        return this.f110853iobyxmoadg;
    }

    @Override // rk.wkgbmnqykc
    public long ppxfxbqfkf(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        if (rk.eablkybsjg.zoijcleaow(response)) {
            return rgvfuqvkyq.btonecajqb(response);
        }
        return 0L;
    }

    @Override // rk.wkgbmnqykc
    public iozdgvuglv wkgbmnqykc(zynmafqrjb request, long j13) {
        zdlpuopuiu.btonecajqb(request, "request");
        nufgyqmvbu nufgyqmvbuVar = this.f110855wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar);
        return nufgyqmvbuVar.rgvfuqvkyq();
    }

    @Override // rk.wkgbmnqykc
    public wwaezpbzkn zoijcleaow(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        nufgyqmvbu nufgyqmvbuVar = this.f110855wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar);
        return nufgyqmvbuVar.oxmwwwfdhm();
    }
}
