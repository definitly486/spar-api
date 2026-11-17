package lk;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f63247eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lmojexxdyd f63248iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f63249ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f63250wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f63251zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: lk.zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1284iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ List f63252zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1284iobyxmoadg(List list) {
                super(0);
                this.f63252zdlpuopuiu = list;
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f63252zdlpuopuiu;
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final List zoijcleaow(Certificate[] certificateArr) {
            return certificateArr != null ? mk.rgvfuqvkyq.gtknphoqwx(Arrays.copyOf(certificateArr, certificateArr.length)) : hg.jyumaefscl.wflxmlrfwp();
        }

        public final zdlpuopuiu iobyxmoadg(SSLSession sSLSession) throws IOException {
            List listWflxmlrfwp;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            dxjokdxxww dxjokdxxwwVarZoijcleaow = dxjokdxxww.f63027zoijcleaow.zoijcleaow(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            lmojexxdyd lmojexxdydVarIobyxmoadg = lmojexxdyd.f63165yggfygwlhe.iobyxmoadg(protocol);
            try {
                listWflxmlrfwp = zoijcleaow(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            return new zdlpuopuiu(lmojexxdydVarIobyxmoadg, dxjokdxxwwVarZoijcleaow, zoijcleaow(sSLSession.getLocalCertificates()), new C1284iobyxmoadg(listWflxmlrfwp));
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f63253zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f63253zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                return (List) this.f63253zdlpuopuiu.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
        }
    }

    public zdlpuopuiu(lmojexxdyd tlsVersion, dxjokdxxww cipherSuite, List localCertificates, tg.iobyxmoadg peerCertificatesFn) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(localCertificates, "localCertificates");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(peerCertificatesFn, "peerCertificatesFn");
        this.f63248iobyxmoadg = tlsVersion;
        this.f63251zoijcleaow = cipherSuite;
        this.f63249ppxfxbqfkf = localCertificates;
        this.f63250wkgbmnqykc = gg.draadjrbmk.zoijcleaow(new zoijcleaow(peerCertificatesFn));
    }

    private final String zoijcleaow(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "type");
        return type;
    }

    public final lmojexxdyd eablkybsjg() {
        return this.f63248iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (obj instanceof zdlpuopuiu) {
            zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj;
            if (zdlpuopuiuVar.f63248iobyxmoadg == this.f63248iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zdlpuopuiuVar.f63251zoijcleaow, this.f63251zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zdlpuopuiuVar.wkgbmnqykc(), wkgbmnqykc()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zdlpuopuiuVar.f63249ppxfxbqfkf, this.f63249ppxfxbqfkf)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f63248iobyxmoadg.hashCode()) * 31) + this.f63251zoijcleaow.hashCode()) * 31) + wkgbmnqykc().hashCode()) * 31) + this.f63249ppxfxbqfkf.hashCode();
    }

    public final dxjokdxxww iobyxmoadg() {
        return this.f63251zoijcleaow;
    }

    public final List ppxfxbqfkf() {
        return this.f63249ppxfxbqfkf;
    }

    public String toString() {
        List listWkgbmnqykc = wkgbmnqykc();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
        Iterator it = listWkgbmnqykc.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Handshake{tlsVersion=");
        sb3.append(this.f63248iobyxmoadg);
        sb3.append(" cipherSuite=");
        sb3.append(this.f63251zoijcleaow);
        sb3.append(" peerCertificates=");
        sb3.append(string);
        sb3.append(" localCertificates=");
        List list = this.f63249ppxfxbqfkf;
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zoijcleaow((Certificate) it2.next()));
        }
        sb3.append(arrayList2);
        sb3.append('}');
        return sb3.toString();
    }

    public final List wkgbmnqykc() {
        return (List) this.f63250wkgbmnqykc.getValue();
    }
}
