package bb;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import nb.istkbnxepw;
import nb.pmvmpeiblj;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw.zoijcleaow f15667iobyxmoadg;

    private ojitshcjhn(istkbnxepw.zoijcleaow zoijcleaowVar) {
        this.f15667iobyxmoadg = zoijcleaowVar;
    }

    public static ojitshcjhn btonecajqb(agtfadlqog agtfadlqogVar) {
        return new ojitshcjhn((istkbnxepw.zoijcleaow) agtfadlqogVar.nufgyqmvbu().cllcsxoeiz());
    }

    public static ojitshcjhn dxjokdxxww() {
        return new ojitshcjhn(istkbnxepw.crxdokpmqz());
    }

    private synchronized boolean eablkybsjg(int i13) {
        Iterator it = this.f15667iobyxmoadg.vdvldrhtss().iterator();
        while (it.hasNext()) {
            if (((istkbnxepw.ppxfxbqfkf) it.next()).ntlheqmsrt() == i13) {
                return true;
            }
        }
        return false;
    }

    private synchronized istkbnxepw.ppxfxbqfkf gxszxtbevo(pmvmpeiblj pmvmpeibljVar) {
        return ppxfxbqfkf(cqumvgiudr.gtknphoqwx(pmvmpeibljVar), pmvmpeibljVar.mbcevpiqjq());
    }

    private synchronized int lqeggnwhkg() {
        int iPpxfxbqfkf;
        iPpxfxbqfkf = com.google.crypto.tink.internal.kcexrzcfyt.ppxfxbqfkf();
        while (eablkybsjg(iPpxfxbqfkf)) {
            iPpxfxbqfkf = com.google.crypto.tink.internal.kcexrzcfyt.ppxfxbqfkf();
        }
        return iPpxfxbqfkf;
    }

    private synchronized istkbnxepw.ppxfxbqfkf ppxfxbqfkf(nb.esjtqupxsv esjtqupxsvVar, ylkuphrtab ylkuphrtabVar) {
        int iLqeggnwhkg;
        iLqeggnwhkg = lqeggnwhkg();
        if (ylkuphrtabVar == ylkuphrtab.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (istkbnxepw.ppxfxbqfkf) istkbnxepw.ppxfxbqfkf.jlmebxxoox().agtfadlqog(esjtqupxsvVar).ojitshcjhn(iLqeggnwhkg).vdvldrhtss(nb.lereixgezr.ENABLED).rgvfuqvkyq(ylkuphrtabVar).ppxfxbqfkf();
    }

    public synchronized ojitshcjhn iobyxmoadg(draadjrbmk draadjrbmkVar) {
        zoijcleaow(draadjrbmkVar.zoijcleaow(), false);
        return this;
    }

    public synchronized ojitshcjhn nufgyqmvbu(int i13) {
        for (int i14 = 0; i14 < this.f15667iobyxmoadg.rgvfuqvkyq(); i14++) {
            istkbnxepw.ppxfxbqfkf ppxfxbqfkfVarOjitshcjhn = this.f15667iobyxmoadg.ojitshcjhn(i14);
            if (ppxfxbqfkfVarOjitshcjhn.ntlheqmsrt() == i13) {
                if (!ppxfxbqfkfVarOjitshcjhn.sopmlzcsov().equals(nb.lereixgezr.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i13);
                }
                this.f15667iobyxmoadg.oxmwwwfdhm(i13);
            }
        }
        throw new GeneralSecurityException("key not found: " + i13);
        return this;
    }

    public synchronized agtfadlqog wkgbmnqykc() {
        return agtfadlqog.eablkybsjg((istkbnxepw) this.f15667iobyxmoadg.ppxfxbqfkf());
    }

    public synchronized int zoijcleaow(pmvmpeiblj pmvmpeibljVar, boolean z13) {
        istkbnxepw.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        try {
            ppxfxbqfkfVarGxszxtbevo = gxszxtbevo(pmvmpeibljVar);
            this.f15667iobyxmoadg.agtfadlqog(ppxfxbqfkfVarGxszxtbevo);
            if (z13) {
                this.f15667iobyxmoadg.oxmwwwfdhm(ppxfxbqfkfVarGxszxtbevo.ntlheqmsrt());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ppxfxbqfkfVarGxszxtbevo.ntlheqmsrt();
    }
}
