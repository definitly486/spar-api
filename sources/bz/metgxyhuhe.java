package bz;

import android.os.Build;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import zone.bi.mobile.fingerprint.api.FingerprintGeneralException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class metgxyhuhe {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Set f17532wkgbmnqykc = new HashSet();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final kc2.lqeggnwhkg f17533ppxfxbqfkf;

    metgxyhuhe(kc2.lqeggnwhkg lqeggnwhkgVar) {
        this.f17533ppxfxbqfkf = lqeggnwhkgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void istkbnxepw() throws q2 {
        t6.lxfrhoxuzk lxfrhoxuzkVar = (t6.lxfrhoxuzk) this;
        for (t6.ppxfxbqfkf ppxfxbqfkfVar : lxfrhoxuzkVar.gtknphoqwx()) {
            if (!t6.skhdrjzrfn.iobyxmoadg(lxfrhoxuzkVar.iobyxmoadg(), ppxfxbqfkfVar.iobyxmoadg())) {
                throw new q2(ppxfxbqfkfVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f17533ppxfxbqfkf == ((metgxyhuhe) obj).f17533ppxfxbqfkf;
    }

    public int hashCode() {
        return this.f17533ppxfxbqfkf.hashCode();
    }

    public kc2.lqeggnwhkg iwizpuwonk() {
        return this.f17533ppxfxbqfkf;
    }

    protected abstract Serializable lereixgezr();

    /* JADX WARN: Multi-variable type inference failed */
    public void pmvmpeiblj() throws u4 {
        for (String str : ((t6.stevsuqkhv) this).eablkybsjg()) {
            Set set = f17532wkgbmnqykc;
            if (!set.contains(str)) {
                try {
                    Class.forName(str);
                    set.add(str);
                } catch (ClassNotFoundException | VerifyError unused) {
                    throw new u4("External dependency '" + str + "' does not exists in the project");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Serializable zynmafqrjb() throws n0 {
        try {
            if (this instanceof t6.stevsuqkhv) {
                pmvmpeiblj();
            }
            if (this instanceof t6.lxfrhoxuzk) {
                istkbnxepw();
            }
            if (this instanceof t6.czzsidtyhn) {
                int iEsjtqupxsv = ((t6.czzsidtyhn) this).esjtqupxsv();
                int i13 = Build.VERSION.SDK_INT;
                if (iEsjtqupxsv < i13) {
                    throw new u4("this SDK version (" + i13 + ") is not supported parameter '" + this.f17533ppxfxbqfkf.name() + "'");
                }
            }
            return lereixgezr();
        } catch (n0 e13) {
            throw e13;
        } catch (Throwable th2) {
            throw new FingerprintGeneralException("Unknown caught exception", th2);
        }
    }
}
