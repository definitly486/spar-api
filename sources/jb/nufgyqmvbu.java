package jb;

import bb.cqumvgiudr;
import bb.iwizpuwonk;
import bb.jyumaefscl;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final nufgyqmvbu f50998iobyxmoadg = new nufgyqmvbu();

    private static class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jyumaefscl f50999iobyxmoadg;

        private zoijcleaow(jyumaefscl jyumaefsclVar) {
            this.f50999iobyxmoadg = jyumaefsclVar;
        }
    }

    private nufgyqmvbu() {
    }

    static void wkgbmnqykc() {
        cqumvgiudr.agtfadlqog(f50998iobyxmoadg);
    }

    @Override // bb.iwizpuwonk
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg iobyxmoadg(jyumaefscl jyumaefsclVar) throws GeneralSecurityException {
        if (jyumaefsclVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (jyumaefsclVar.eablkybsjg() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = jyumaefsclVar.ppxfxbqfkf().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new zoijcleaow(jyumaefsclVar);
    }

    @Override // bb.iwizpuwonk
    public Class ppxfxbqfkf() {
        return lqeggnwhkg.class;
    }

    @Override // bb.iwizpuwonk
    public Class zoijcleaow() {
        return lqeggnwhkg.class;
    }
}
