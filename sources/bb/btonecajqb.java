package bb;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class btonecajqb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Logger f15621zoijcleaow = Logger.getLogger(btonecajqb.class.getName());

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConcurrentMap f15622iobyxmoadg;

    class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ com.google.crypto.tink.internal.wkgbmnqykc f15623iobyxmoadg;

        iobyxmoadg(com.google.crypto.tink.internal.wkgbmnqykc wkgbmnqykcVar) {
            this.f15623iobyxmoadg = wkgbmnqykcVar;
        }

        @Override // bb.btonecajqb.zoijcleaow
        public Class iobyxmoadg() {
            return this.f15623iobyxmoadg.getClass();
        }

        @Override // bb.btonecajqb.zoijcleaow
        public nufgyqmvbu ppxfxbqfkf(Class cls) throws GeneralSecurityException {
            try {
                return new dxjokdxxww(this.f15623iobyxmoadg, cls);
            } catch (IllegalArgumentException e13) {
                throw new GeneralSecurityException("Primitive type not supported", e13);
            }
        }

        @Override // bb.btonecajqb.zoijcleaow
        public nufgyqmvbu wkgbmnqykc() {
            com.google.crypto.tink.internal.wkgbmnqykc wkgbmnqykcVar = this.f15623iobyxmoadg;
            return new dxjokdxxww(wkgbmnqykcVar, wkgbmnqykcVar.zoijcleaow());
        }

        @Override // bb.btonecajqb.zoijcleaow
        public Set zoijcleaow() {
            return this.f15623iobyxmoadg.dxjokdxxww();
        }
    }

    private interface zoijcleaow {
        Class iobyxmoadg();

        nufgyqmvbu ppxfxbqfkf(Class cls);

        nufgyqmvbu wkgbmnqykc();

        Set zoijcleaow();
    }

    btonecajqb(btonecajqb btonecajqbVar) {
        this.f15622iobyxmoadg = new ConcurrentHashMap(btonecajqbVar.f15622iobyxmoadg);
    }

    private static String dxjokdxxww(Set set) {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = set.iterator();
        boolean z13 = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z13) {
                sb3.append(", ");
            }
            sb3.append(cls.getCanonicalName());
            z13 = false;
        }
        return sb3.toString();
    }

    private nufgyqmvbu eablkybsjg(String str, Class cls) throws GeneralSecurityException {
        zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(str);
        if (cls == null) {
            return zoijcleaowVarWkgbmnqykc.wkgbmnqykc();
        }
        if (zoijcleaowVarWkgbmnqykc.zoijcleaow().contains(cls)) {
            return zoijcleaowVarWkgbmnqykc.ppxfxbqfkf(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + zoijcleaowVarWkgbmnqykc.iobyxmoadg() + ", supported primitives: " + dxjokdxxww(zoijcleaowVarWkgbmnqykc.zoijcleaow()));
    }

    private static Object iobyxmoadg(Object obj) {
        obj.getClass();
        return obj;
    }

    private synchronized void nufgyqmvbu(zoijcleaow zoijcleaowVar, boolean z13) {
        try {
            String strZoijcleaow = zoijcleaowVar.wkgbmnqykc().zoijcleaow();
            zoijcleaow zoijcleaowVar2 = (zoijcleaow) this.f15622iobyxmoadg.get(strZoijcleaow);
            if (zoijcleaowVar2 != null && !zoijcleaowVar2.iobyxmoadg().equals(zoijcleaowVar.iobyxmoadg())) {
                f15621zoijcleaow.warning("Attempted overwrite of a registered key manager for key type " + strZoijcleaow);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZoijcleaow, zoijcleaowVar2.iobyxmoadg().getName(), zoijcleaowVar.iobyxmoadg().getName()));
            }
            if (z13) {
                this.f15622iobyxmoadg.put(strZoijcleaow, zoijcleaowVar);
            } else {
                this.f15622iobyxmoadg.putIfAbsent(strZoijcleaow, zoijcleaowVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized zoijcleaow wkgbmnqykc(String str) {
        if (!this.f15622iobyxmoadg.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (zoijcleaow) this.f15622iobyxmoadg.get(str);
    }

    private static zoijcleaow zoijcleaow(com.google.crypto.tink.internal.wkgbmnqykc wkgbmnqykcVar) {
        return new iobyxmoadg(wkgbmnqykcVar);
    }

    boolean btonecajqb(String str) {
        return this.f15622iobyxmoadg.containsKey(str);
    }

    nufgyqmvbu gxszxtbevo(String str) {
        return wkgbmnqykc(str).wkgbmnqykc();
    }

    synchronized void lqeggnwhkg(com.google.crypto.tink.internal.wkgbmnqykc wkgbmnqykcVar) {
        if (!wkgbmnqykcVar.iobyxmoadg().iobyxmoadg()) {
            throw new GeneralSecurityException("failed to register key manager " + wkgbmnqykcVar.getClass() + " as it is not FIPS compatible.");
        }
        nufgyqmvbu(zoijcleaow(wkgbmnqykcVar), false);
    }

    nufgyqmvbu ppxfxbqfkf(String str, Class cls) {
        return eablkybsjg(str, (Class) iobyxmoadg(cls));
    }

    btonecajqb() {
        this.f15622iobyxmoadg = new ConcurrentHashMap();
    }
}
