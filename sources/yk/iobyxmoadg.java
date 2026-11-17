package yk;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C3197iobyxmoadg f125535ppxfxbqfkf = new C3197iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f125536zoijcleaow;

    /* JADX INFO: renamed from: yk.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3197iobyxmoadg {
        public /* synthetic */ C3197iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3197iobyxmoadg() {
        }
    }

    public iobyxmoadg(eablkybsjg trustRootIndex) {
        zdlpuopuiu.btonecajqb(trustRootIndex, "trustRootIndex");
        this.f125536zoijcleaow = trustRootIndex;
    }

    private final boolean zoijcleaow(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i13) {
        if (!zdlpuopuiu.eablkybsjg(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i13) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(((iobyxmoadg) obj).f125536zoijcleaow, this.f125536zoijcleaow);
    }

    public int hashCode() {
        return this.f125536zoijcleaow.hashCode();
    }

    @Override // yk.ppxfxbqfkf
    public List iobyxmoadg(List chain, String hostname) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        zdlpuopuiu.btonecajqb(chain, "chain");
        zdlpuopuiu.btonecajqb(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        zdlpuopuiu.dxjokdxxww(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z13 = false;
        for (int i13 = 0; i13 < 9; i13++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateIobyxmoadg = this.f125536zoijcleaow.iobyxmoadg(x509Certificate2);
            if (x509CertificateIobyxmoadg != null) {
                if (arrayList.size() > 1 || !zdlpuopuiu.eablkybsjg(x509Certificate2, x509CertificateIobyxmoadg)) {
                    arrayList.add(x509CertificateIobyxmoadg);
                }
                if (zoijcleaow(x509CertificateIobyxmoadg, x509CertificateIobyxmoadg, arrayList.size() - 2)) {
                    return arrayList;
                }
                z13 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                zdlpuopuiu.dxjokdxxww(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (z13) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                    }
                    Object next = it.next();
                    zdlpuopuiu.nufgyqmvbu(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (X509Certificate) next;
                } while (!zoijcleaow(x509Certificate2, x509Certificate, arrayList.size() - 1));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
