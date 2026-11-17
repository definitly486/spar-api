package yk;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f125539iobyxmoadg;

    public zoijcleaow(X509Certificate... caCerts) {
        zdlpuopuiu.btonecajqb(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            zdlpuopuiu.dxjokdxxww(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f125539iobyxmoadg = linkedHashMap;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(((zoijcleaow) obj).f125539iobyxmoadg, this.f125539iobyxmoadg));
    }

    public int hashCode() {
        return this.f125539iobyxmoadg.hashCode();
    }

    @Override // yk.eablkybsjg
    public X509Certificate iobyxmoadg(X509Certificate cert) {
        zdlpuopuiu.btonecajqb(cert, "cert");
        Set set = (Set) this.f125539iobyxmoadg.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                cert.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }
}
