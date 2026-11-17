package kl;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jose4j.lang.InvalidAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final am.iobyxmoadg f59743iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f59744ppxfxbqfkf = new LinkedHashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f59745zoijcleaow;

    public wkgbmnqykc(String str, Class cls) {
        this.f59745zoijcleaow = str;
        this.f59743iobyxmoadg = am.zoijcleaow.btonecajqb(getClass().getName() + "->" + cls.getSimpleName());
    }

    private boolean ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        try {
            return iobyxmoadgVar.btonecajqb();
        } catch (Throwable th2) {
            this.f59743iobyxmoadg.wkgbmnqykc("Unexpected problem checking for availability of " + iobyxmoadgVar.eablkybsjg() + " algorithm: " + rl.zoijcleaow.iobyxmoadg(th2));
            return false;
        }
    }

    public iobyxmoadg iobyxmoadg(String str) throws InvalidAlgorithmException {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f59744ppxfxbqfkf.get(str);
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        throw new InvalidAlgorithmException(str + " is an unknown, unsupported or unavailable " + this.f59745zoijcleaow + " algorithm (not one of " + zoijcleaow() + ").");
    }

    public void wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
        String strEablkybsjg = iobyxmoadgVar.eablkybsjg();
        if (!ppxfxbqfkf(iobyxmoadgVar)) {
            this.f59743iobyxmoadg.lqeggnwhkg("{} is unavailable so will not be registered for {} algorithms.", strEablkybsjg, this.f59745zoijcleaow);
        } else {
            this.f59744ppxfxbqfkf.put(strEablkybsjg, iobyxmoadgVar);
            this.f59743iobyxmoadg.agtfadlqog("{} registered for {} algorithm {}", iobyxmoadgVar, this.f59745zoijcleaow, strEablkybsjg);
        }
    }

    public Set zoijcleaow() {
        return Collections.unmodifiableSet(this.f59744ppxfxbqfkf.keySet());
    }
}
