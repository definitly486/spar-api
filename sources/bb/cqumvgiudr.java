package bb;

import com.google.crypto.tink.shaded.protobuf.hkdspvbjdz;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import nb.pmvmpeiblj;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Logger f15626iobyxmoadg = Logger.getLogger(cqumvgiudr.class.getName());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final AtomicReference f15629zoijcleaow = new AtomicReference(new btonecajqb());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final ConcurrentMap f15627ppxfxbqfkf = new ConcurrentHashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ConcurrentMap f15628wkgbmnqykc = new ConcurrentHashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final ConcurrentMap f15624eablkybsjg = new ConcurrentHashMap();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ConcurrentMap f15625gxszxtbevo = new ConcurrentHashMap();

    class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ com.google.crypto.tink.internal.wkgbmnqykc f15630iobyxmoadg;

        iobyxmoadg(com.google.crypto.tink.internal.wkgbmnqykc wkgbmnqykcVar) {
            this.f15630iobyxmoadg = wkgbmnqykcVar;
        }
    }

    private interface zoijcleaow {
    }

    public static synchronized void agtfadlqog(iwizpuwonk iwizpuwonkVar) {
        com.google.crypto.tink.internal.nufgyqmvbu.ppxfxbqfkf().eablkybsjg(iwizpuwonkVar);
    }

    public static synchronized hkdspvbjdz btonecajqb(pmvmpeiblj pmvmpeibljVar) {
        nufgyqmvbu nufgyqmvbuVarNufgyqmvbu;
        nufgyqmvbuVarNufgyqmvbu = nufgyqmvbu(pmvmpeibljVar.ntlheqmsrt());
        if (!((Boolean) f15628wkgbmnqykc.get(pmvmpeibljVar.ntlheqmsrt())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + pmvmpeibljVar.ntlheqmsrt());
        }
        return nufgyqmvbuVarNufgyqmvbu.wkgbmnqykc(pmvmpeibljVar.ulzqkzuiru());
    }

    public static synchronized void draadjrbmk(com.google.crypto.tink.internal.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        try {
            if (wkgbmnqykcVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = f15629zoijcleaow;
            btonecajqb btonecajqbVar = new btonecajqb((btonecajqb) atomicReference.get());
            btonecajqbVar.lqeggnwhkg(wkgbmnqykcVar);
            String strWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc();
            zoijcleaow(strWkgbmnqykc, z13 ? wkgbmnqykcVar.gxszxtbevo().ppxfxbqfkf() : Collections.emptyMap(), z13);
            if (!((btonecajqb) atomicReference.get()).btonecajqb(strWkgbmnqykc)) {
                f15627ppxfxbqfkf.put(strWkgbmnqykc, iobyxmoadg(wkgbmnqykcVar));
                if (z13) {
                    wflxmlrfwp(strWkgbmnqykc, wkgbmnqykcVar.gxszxtbevo().ppxfxbqfkf());
                }
            }
            f15628wkgbmnqykc.put(strWkgbmnqykc, Boolean.valueOf(z13));
            atomicReference.set(btonecajqbVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static synchronized Map dxjokdxxww() {
        return Collections.unmodifiableMap(f15625gxszxtbevo);
    }

    public static Object eablkybsjg(String str, com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar, Class cls) {
        return ((btonecajqb) f15629zoijcleaow.get()).ppxfxbqfkf(str, cls).ppxfxbqfkf(nufgyqmvbuVar);
    }

    public static synchronized nb.esjtqupxsv gtknphoqwx(pmvmpeiblj pmvmpeibljVar) {
        nufgyqmvbu nufgyqmvbuVarNufgyqmvbu;
        nufgyqmvbuVarNufgyqmvbu = nufgyqmvbu(pmvmpeibljVar.ntlheqmsrt());
        if (!((Boolean) f15628wkgbmnqykc.get(pmvmpeibljVar.ntlheqmsrt())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + pmvmpeibljVar.ntlheqmsrt());
        }
        return nufgyqmvbuVarNufgyqmvbu.iobyxmoadg(pmvmpeibljVar.ulzqkzuiru());
    }

    public static Object gxszxtbevo(String str, byte[] bArr, Class cls) {
        return eablkybsjg(str, com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(bArr), cls);
    }

    private static zoijcleaow iobyxmoadg(com.google.crypto.tink.internal.wkgbmnqykc wkgbmnqykcVar) {
        return new iobyxmoadg(wkgbmnqykcVar);
    }

    public static Object lqeggnwhkg(nb.esjtqupxsv esjtqupxsvVar, Class cls) {
        return eablkybsjg(esjtqupxsvVar.ntlheqmsrt(), esjtqupxsvVar.ulzqkzuiru(), cls);
    }

    public static nufgyqmvbu nufgyqmvbu(String str) {
        return ((btonecajqb) f15629zoijcleaow.get()).gxszxtbevo(str);
    }

    public static Object ojitshcjhn(jyumaefscl jyumaefsclVar, Class cls) {
        return com.google.crypto.tink.internal.nufgyqmvbu.ppxfxbqfkf().gxszxtbevo(jyumaefsclVar, cls);
    }

    static Object ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, Class cls) {
        return com.google.crypto.tink.internal.nufgyqmvbu.ppxfxbqfkf().zoijcleaow(lqeggnwhkgVar, cls);
    }

    private static void wflxmlrfwp(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f15625gxszxtbevo.put((String) entry.getKey(), draadjrbmk.iobyxmoadg(str, ((hkdspvbjdz) ((com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg) entry.getValue()).f23871iobyxmoadg).toByteArray(), ((com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg) entry.getValue()).f23872zoijcleaow));
        }
    }

    public static Class wkgbmnqykc(Class cls) {
        try {
            return com.google.crypto.tink.internal.nufgyqmvbu.ppxfxbqfkf().iobyxmoadg(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static synchronized void zoijcleaow(String str, Map map, boolean z13) {
        if (z13) {
            try {
                ConcurrentMap concurrentMap = f15628wkgbmnqykc;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z13) {
            if (((btonecajqb) f15629zoijcleaow.get()).btonecajqb(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f15625gxszxtbevo.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f15625gxszxtbevo.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }
}
