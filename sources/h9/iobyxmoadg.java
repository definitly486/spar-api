package h9;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final lqeggnwhkg f39923iobyxmoadg = new C0924iobyxmoadg();

    private static final class eablkybsjg implements u1.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wkgbmnqykc f39924iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final u1.eablkybsjg f39925ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lqeggnwhkg f39926zoijcleaow;

        eablkybsjg(u1.eablkybsjg eablkybsjgVar, wkgbmnqykc wkgbmnqykcVar, lqeggnwhkg lqeggnwhkgVar) {
            this.f39925ppxfxbqfkf = eablkybsjgVar;
            this.f39924iobyxmoadg = wkgbmnqykcVar;
            this.f39926zoijcleaow = lqeggnwhkgVar;
        }

        @Override // u1.eablkybsjg
        public boolean iobyxmoadg(Object obj) {
            if (obj instanceof gxszxtbevo) {
                ((gxszxtbevo) obj).eablkybsjg().zoijcleaow(true);
            }
            this.f39926zoijcleaow.iobyxmoadg(obj);
            return this.f39925ppxfxbqfkf.iobyxmoadg(obj);
        }

        @Override // u1.eablkybsjg
        public Object zoijcleaow() {
            Object objZoijcleaow = this.f39925ppxfxbqfkf.zoijcleaow();
            if (objZoijcleaow == null) {
                objZoijcleaow = this.f39924iobyxmoadg.iobyxmoadg();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objZoijcleaow.getClass());
                }
            }
            if (objZoijcleaow instanceof gxszxtbevo) {
                ((gxszxtbevo) objZoijcleaow).eablkybsjg().zoijcleaow(false);
            }
            return objZoijcleaow;
        }
    }

    public interface gxszxtbevo {
        h9.ppxfxbqfkf eablkybsjg();
    }

    /* JADX INFO: renamed from: h9.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0924iobyxmoadg implements lqeggnwhkg {
        C0924iobyxmoadg() {
        }

        @Override // h9.iobyxmoadg.lqeggnwhkg
        public void iobyxmoadg(Object obj) {
        }
    }

    public interface lqeggnwhkg {
        void iobyxmoadg(Object obj);
    }

    class ppxfxbqfkf implements lqeggnwhkg {
        ppxfxbqfkf() {
        }

        @Override // h9.iobyxmoadg.lqeggnwhkg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(List list) {
            list.clear();
        }
    }

    public interface wkgbmnqykc {
        Object iobyxmoadg();
    }

    class zoijcleaow implements wkgbmnqykc {
        zoijcleaow() {
        }

        @Override // h9.iobyxmoadg.wkgbmnqykc
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public List iobyxmoadg() {
            return new ArrayList();
        }
    }

    public static u1.eablkybsjg eablkybsjg() {
        return gxszxtbevo(20);
    }

    public static u1.eablkybsjg gxszxtbevo(int i13) {
        return zoijcleaow(new u1.lqeggnwhkg(i13), new zoijcleaow(), new ppxfxbqfkf());
    }

    private static u1.eablkybsjg iobyxmoadg(u1.eablkybsjg eablkybsjgVar, wkgbmnqykc wkgbmnqykcVar) {
        return zoijcleaow(eablkybsjgVar, wkgbmnqykcVar, ppxfxbqfkf());
    }

    private static lqeggnwhkg ppxfxbqfkf() {
        return f39923iobyxmoadg;
    }

    public static u1.eablkybsjg wkgbmnqykc(int i13, wkgbmnqykc wkgbmnqykcVar) {
        return iobyxmoadg(new u1.lqeggnwhkg(i13), wkgbmnqykcVar);
    }

    private static u1.eablkybsjg zoijcleaow(u1.eablkybsjg eablkybsjgVar, wkgbmnqykc wkgbmnqykcVar, lqeggnwhkg lqeggnwhkgVar) {
        return new eablkybsjg(eablkybsjgVar, wkgbmnqykcVar, lqeggnwhkgVar);
    }
}
