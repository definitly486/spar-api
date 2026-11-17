package ob;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f72481iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final dxjokdxxww f72480zoijcleaow = new dxjokdxxww(new btonecajqb.iobyxmoadg());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final dxjokdxxww f72478ppxfxbqfkf = new dxjokdxxww(new btonecajqb.eablkybsjg());

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final dxjokdxxww f72479wkgbmnqykc = new dxjokdxxww(new btonecajqb.lqeggnwhkg());

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final dxjokdxxww f72474eablkybsjg = new dxjokdxxww(new btonecajqb.gxszxtbevo());

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final dxjokdxxww f72475gxszxtbevo = new dxjokdxxww(new btonecajqb.zoijcleaow());

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final dxjokdxxww f72476lqeggnwhkg = new dxjokdxxww(new btonecajqb.wkgbmnqykc());

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final dxjokdxxww f72477nufgyqmvbu = new dxjokdxxww(new btonecajqb.ppxfxbqfkf());

    private interface eablkybsjg {
        Object iobyxmoadg(String str);
    }

    private static class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final btonecajqb f72482iobyxmoadg;

        @Override // ob.dxjokdxxww.eablkybsjg
        public Object iobyxmoadg(String str) {
            return this.f72482iobyxmoadg.iobyxmoadg(str, null);
        }

        private ppxfxbqfkf(btonecajqb btonecajqbVar) {
            this.f72482iobyxmoadg = btonecajqbVar;
        }
    }

    private static class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final btonecajqb f72483iobyxmoadg;

        @Override // ob.dxjokdxxww.eablkybsjg
        public Object iobyxmoadg(String str) throws GeneralSecurityException {
            Iterator it = dxjokdxxww.zoijcleaow(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f72483iobyxmoadg.iobyxmoadg(str, (Provider) it.next());
                } catch (Exception e13) {
                    if (exc == null) {
                        exc = e13;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        private wkgbmnqykc(btonecajqb btonecajqbVar) {
            this.f72483iobyxmoadg = btonecajqbVar;
        }
    }

    private static class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final btonecajqb f72484iobyxmoadg;

        @Override // ob.dxjokdxxww.eablkybsjg
        public Object iobyxmoadg(String str) {
            Iterator it = dxjokdxxww.zoijcleaow(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f72484iobyxmoadg.iobyxmoadg(str, (Provider) it.next());
                } catch (Exception e13) {
                    if (exc == null) {
                        exc = e13;
                    }
                }
            }
            return this.f72484iobyxmoadg.iobyxmoadg(str, null);
        }

        private zoijcleaow(btonecajqb btonecajqbVar) {
            this.f72484iobyxmoadg = btonecajqbVar;
        }
    }

    public dxjokdxxww(btonecajqb btonecajqbVar) {
        if (gb.zoijcleaow.ppxfxbqfkf()) {
            this.f72481iobyxmoadg = new wkgbmnqykc(btonecajqbVar);
        } else if (vdvldrhtss.zoijcleaow()) {
            this.f72481iobyxmoadg = new zoijcleaow(btonecajqbVar);
        } else {
            this.f72481iobyxmoadg = new ppxfxbqfkf(btonecajqbVar);
        }
    }

    public static List zoijcleaow(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object iobyxmoadg(String str) {
        return this.f72481iobyxmoadg.iobyxmoadg(str);
    }
}
