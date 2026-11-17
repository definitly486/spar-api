package lk;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f63167ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final lqeggnwhkg f63168wkgbmnqykc = new iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f63169iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yk.ppxfxbqfkf f63170zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f63171iobyxmoadg = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final lqeggnwhkg iobyxmoadg() {
            return new lqeggnwhkg(hg.jyumaefscl.r(this.f63171iobyxmoadg), null, 2, 0 == true ? 1 : 0);
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f63172jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f63173yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(List list, String str) {
            super(0);
            this.f63173yggfygwlhe = list;
            this.f63172jyumaefscl = str;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<Certificate> listIobyxmoadg;
            yk.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = lqeggnwhkg.this.wkgbmnqykc();
            if (ppxfxbqfkfVarWkgbmnqykc == null || (listIobyxmoadg = ppxfxbqfkfVarWkgbmnqykc.iobyxmoadg(this.f63173yggfygwlhe, this.f63172jyumaefscl)) == null) {
                listIobyxmoadg = this.f63173yggfygwlhe;
            }
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
            for (Certificate certificate : listIobyxmoadg) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final String iobyxmoadg(Certificate certificate) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + zoijcleaow((X509Certificate) certificate).wkgbmnqykc();
        }

        public final bl.gxszxtbevo zoijcleaow(X509Certificate x509Certificate) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(x509Certificate, "<this>");
            bl.gxszxtbevo.iobyxmoadg iobyxmoadgVar = bl.gxszxtbevo.f16674iwizpuwonk;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(encoded, "publicKey.encoded");
            return bl.gxszxtbevo.iobyxmoadg.gxszxtbevo(iobyxmoadgVar, encoded, 0, 0, 3, null).pkzmftpjix();
        }

        private zoijcleaow() {
        }
    }

    public lqeggnwhkg(Set pins, yk.ppxfxbqfkf ppxfxbqfkfVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pins, "pins");
        this.f63169iobyxmoadg = pins;
        this.f63170zoijcleaow = ppxfxbqfkfVar;
    }

    public final lqeggnwhkg eablkybsjg(yk.ppxfxbqfkf certificateChainCleaner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63170zoijcleaow, certificateChainCleaner) ? this : new lqeggnwhkg(this.f63169iobyxmoadg, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof lqeggnwhkg) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVar.f63169iobyxmoadg, this.f63169iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkgVar.f63170zoijcleaow, this.f63170zoijcleaow)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f63169iobyxmoadg.hashCode()) * 41;
        yk.ppxfxbqfkf ppxfxbqfkfVar = this.f63170zoijcleaow;
        return iHashCode + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0);
    }

    public final void iobyxmoadg(String hostname, List peerCertificates) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hostname, "hostname");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(peerCertificates, "peerCertificates");
        zoijcleaow(hostname, new ppxfxbqfkf(peerCertificates, hostname));
    }

    public final List ppxfxbqfkf(String hostname) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hostname, "hostname");
        Set set = this.f63169iobyxmoadg;
        List listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listWflxmlrfwp;
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it.next());
        throw null;
    }

    public final yk.ppxfxbqfkf wkgbmnqykc() {
        return this.f63170zoijcleaow;
    }

    public final void zoijcleaow(String hostname, tg.iobyxmoadg cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hostname, "hostname");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listPpxfxbqfkf = ppxfxbqfkf(hostname);
        if (listPpxfxbqfkf.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listPpxfxbqfkf.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Certificate pinning failure!");
        sb3.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb3.append("\n    ");
            sb3.append(f63167ppxfxbqfkf.iobyxmoadg(x509Certificate2));
            sb3.append(": ");
            sb3.append(x509Certificate2.getSubjectDN().getName());
        }
        sb3.append("\n  Pinned certificates for ");
        sb3.append(hostname);
        sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        Iterator it2 = listPpxfxbqfkf.iterator();
        while (it2.hasNext()) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it2.next());
            sb3.append("\n    ");
            sb3.append((Object) null);
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public /* synthetic */ lqeggnwhkg(Set set, yk.ppxfxbqfkf ppxfxbqfkfVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(set, (i13 & 2) != 0 ? null : ppxfxbqfkfVar);
    }
}
