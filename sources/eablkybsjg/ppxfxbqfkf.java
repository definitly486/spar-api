package eablkybsjg;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.agtfadlqog;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.vdvldrhtss;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f31042iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Map f31046zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f31044ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    ArrayList f31045wkgbmnqykc = new ArrayList();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final transient Map f31040eablkybsjg = new HashMap();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final Map f31041gxszxtbevo = new HashMap();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final Bundle f31043lqeggnwhkg = new Bundle();

    private static class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final gtknphoqwx f31047iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ArrayList f31048zoijcleaow = new ArrayList();

        eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            this.f31047iobyxmoadg = gtknphoqwxVar;
        }

        void iobyxmoadg(agtfadlqog agtfadlqogVar) {
            this.f31047iobyxmoadg.iobyxmoadg(agtfadlqogVar);
            this.f31048zoijcleaow.add(agtfadlqogVar);
        }

        void zoijcleaow() {
            Iterator it = this.f31048zoijcleaow.iterator();
            while (it.hasNext()) {
                this.f31047iobyxmoadg.wkgbmnqykc((agtfadlqog) it.next());
            }
            this.f31048zoijcleaow.clear();
        }
    }

    class iobyxmoadg implements agtfadlqog {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo.iobyxmoadg f31050jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ eablkybsjg.iobyxmoadg f31051yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ String f31052zdlpuopuiu;

        iobyxmoadg(String str, eablkybsjg.iobyxmoadg iobyxmoadgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar2) {
            this.f31052zdlpuopuiu = str;
            this.f31051yggfygwlhe = iobyxmoadgVar;
            this.f31050jyumaefscl = iobyxmoadgVar2;
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            if (!gtknphoqwx.iobyxmoadg.ON_START.equals(iobyxmoadgVar)) {
                if (gtknphoqwx.iobyxmoadg.ON_STOP.equals(iobyxmoadgVar)) {
                    ppxfxbqfkf.this.f31040eablkybsjg.remove(this.f31052zdlpuopuiu);
                    return;
                } else {
                    if (gtknphoqwx.iobyxmoadg.ON_DESTROY.equals(iobyxmoadgVar)) {
                        ppxfxbqfkf.this.draadjrbmk(this.f31052zdlpuopuiu);
                        return;
                    }
                    return;
                }
            }
            ppxfxbqfkf.this.f31040eablkybsjg.put(this.f31052zdlpuopuiu, new wkgbmnqykc(this.f31051yggfygwlhe, this.f31050jyumaefscl));
            if (ppxfxbqfkf.this.f31041gxszxtbevo.containsKey(this.f31052zdlpuopuiu)) {
                Object obj = ppxfxbqfkf.this.f31041gxszxtbevo.get(this.f31052zdlpuopuiu);
                ppxfxbqfkf.this.f31041gxszxtbevo.remove(this.f31052zdlpuopuiu);
                this.f31051yggfygwlhe.iobyxmoadg(obj);
            }
            ActivityResult activityResult = (ActivityResult) ppxfxbqfkf.this.f31043lqeggnwhkg.getParcelable(this.f31052zdlpuopuiu);
            if (activityResult != null) {
                ppxfxbqfkf.this.f31043lqeggnwhkg.remove(this.f31052zdlpuopuiu);
                this.f31051yggfygwlhe.iobyxmoadg(this.f31050jyumaefscl.ppxfxbqfkf(activityResult.ppxfxbqfkf(), activityResult.zoijcleaow()));
            }
        }
    }

    /* JADX INFO: renamed from: eablkybsjg.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    class C0656ppxfxbqfkf extends eablkybsjg.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f31053iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo.iobyxmoadg f31055zoijcleaow;

        C0656ppxfxbqfkf(String str, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
            this.f31053iobyxmoadg = str;
            this.f31055zoijcleaow = iobyxmoadgVar;
        }

        @Override // eablkybsjg.zoijcleaow
        public void ppxfxbqfkf() {
            ppxfxbqfkf.this.draadjrbmk(this.f31053iobyxmoadg);
        }

        @Override // eablkybsjg.zoijcleaow
        public void zoijcleaow(Object obj, androidx.core.app.ppxfxbqfkf ppxfxbqfkfVar) throws Exception {
            Integer num = (Integer) ppxfxbqfkf.this.f31046zoijcleaow.get(this.f31053iobyxmoadg);
            if (num != null) {
                ppxfxbqfkf.this.f31045wkgbmnqykc.add(this.f31053iobyxmoadg);
                try {
                    ppxfxbqfkf.this.gxszxtbevo(num.intValue(), this.f31055zoijcleaow, obj, ppxfxbqfkfVar);
                    return;
                } catch (Exception e13) {
                    ppxfxbqfkf.this.f31045wkgbmnqykc.remove(this.f31053iobyxmoadg);
                    throw e13;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f31055zoijcleaow + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final eablkybsjg.iobyxmoadg f31056iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final gxszxtbevo.iobyxmoadg f31057zoijcleaow;

        wkgbmnqykc(eablkybsjg.iobyxmoadg iobyxmoadgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar2) {
            this.f31056iobyxmoadg = iobyxmoadgVar;
            this.f31057zoijcleaow = iobyxmoadgVar2;
        }
    }

    class zoijcleaow extends eablkybsjg.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f31058iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo.iobyxmoadg f31060zoijcleaow;

        zoijcleaow(String str, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
            this.f31058iobyxmoadg = str;
            this.f31060zoijcleaow = iobyxmoadgVar;
        }

        @Override // eablkybsjg.zoijcleaow
        public void ppxfxbqfkf() {
            ppxfxbqfkf.this.draadjrbmk(this.f31058iobyxmoadg);
        }

        @Override // eablkybsjg.zoijcleaow
        public void zoijcleaow(Object obj, androidx.core.app.ppxfxbqfkf ppxfxbqfkfVar) throws Exception {
            Integer num = (Integer) ppxfxbqfkf.this.f31046zoijcleaow.get(this.f31058iobyxmoadg);
            if (num != null) {
                ppxfxbqfkf.this.f31045wkgbmnqykc.add(this.f31058iobyxmoadg);
                try {
                    ppxfxbqfkf.this.gxszxtbevo(num.intValue(), this.f31060zoijcleaow, obj, ppxfxbqfkfVar);
                    return;
                } catch (Exception e13) {
                    ppxfxbqfkf.this.f31045wkgbmnqykc.remove(this.f31058iobyxmoadg);
                    throw e13;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f31060zoijcleaow + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    private int eablkybsjg() {
        int iLqeggnwhkg = xg.ppxfxbqfkf.f122316zdlpuopuiu.lqeggnwhkg(2147418112);
        while (true) {
            int i13 = iLqeggnwhkg + 65536;
            if (!this.f31042iobyxmoadg.containsKey(Integer.valueOf(i13))) {
                return i13;
            }
            iLqeggnwhkg = xg.ppxfxbqfkf.f122316zdlpuopuiu.lqeggnwhkg(2147418112);
        }
    }

    private void gtknphoqwx(String str) {
        if (((Integer) this.f31046zoijcleaow.get(str)) != null) {
            return;
        }
        iobyxmoadg(eablkybsjg(), str);
    }

    private void iobyxmoadg(int i13, String str) {
        this.f31042iobyxmoadg.put(Integer.valueOf(i13), str);
        this.f31046zoijcleaow.put(str, Integer.valueOf(i13));
    }

    private void wkgbmnqykc(String str, int i13, Intent intent, wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar == null || wkgbmnqykcVar.f31056iobyxmoadg == null || !this.f31045wkgbmnqykc.contains(str)) {
            this.f31041gxszxtbevo.remove(str);
            this.f31043lqeggnwhkg.putParcelable(str, new ActivityResult(i13, intent));
        } else {
            wkgbmnqykcVar.f31056iobyxmoadg.iobyxmoadg(wkgbmnqykcVar.f31057zoijcleaow.ppxfxbqfkf(i13, intent));
            this.f31045wkgbmnqykc.remove(str);
        }
    }

    public final eablkybsjg.zoijcleaow btonecajqb(String str, gxszxtbevo.iobyxmoadg iobyxmoadgVar, eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        gtknphoqwx(str);
        this.f31040eablkybsjg.put(str, new wkgbmnqykc(iobyxmoadgVar2, iobyxmoadgVar));
        if (this.f31041gxszxtbevo.containsKey(str)) {
            Object obj = this.f31041gxszxtbevo.get(str);
            this.f31041gxszxtbevo.remove(str);
            iobyxmoadgVar2.iobyxmoadg(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f31043lqeggnwhkg.getParcelable(str);
        if (activityResult != null) {
            this.f31043lqeggnwhkg.remove(str);
            iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar.ppxfxbqfkf(activityResult.ppxfxbqfkf(), activityResult.zoijcleaow()));
        }
        return new C0656ppxfxbqfkf(str, iobyxmoadgVar);
    }

    final void draadjrbmk(String str) {
        Integer num;
        if (!this.f31045wkgbmnqykc.contains(str) && (num = (Integer) this.f31046zoijcleaow.remove(str)) != null) {
            this.f31042iobyxmoadg.remove(num);
        }
        this.f31040eablkybsjg.remove(str);
        if (this.f31041gxszxtbevo.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f31041gxszxtbevo.get(str));
            this.f31041gxszxtbevo.remove(str);
        }
        if (this.f31043lqeggnwhkg.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f31043lqeggnwhkg.getParcelable(str));
            this.f31043lqeggnwhkg.remove(str);
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) this.f31044ppxfxbqfkf.get(str);
        if (eablkybsjgVar != null) {
            eablkybsjgVar.zoijcleaow();
            this.f31044ppxfxbqfkf.remove(str);
        }
    }

    public final eablkybsjg.zoijcleaow dxjokdxxww(String str, vdvldrhtss vdvldrhtssVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar, eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        gtknphoqwx lifecycle = vdvldrhtssVar.getLifecycle();
        if (lifecycle.zoijcleaow().wkgbmnqykc(gtknphoqwx.zoijcleaow.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + vdvldrhtssVar + " is attempting to register while current state is " + lifecycle.zoijcleaow() + ". LifecycleOwners must call register before they are STARTED.");
        }
        gtknphoqwx(str);
        eablkybsjg eablkybsjgVar = (eablkybsjg) this.f31044ppxfxbqfkf.get(str);
        if (eablkybsjgVar == null) {
            eablkybsjgVar = new eablkybsjg(lifecycle);
        }
        eablkybsjgVar.iobyxmoadg(new iobyxmoadg(str, iobyxmoadgVar2, iobyxmoadgVar));
        this.f31044ppxfxbqfkf.put(str, eablkybsjgVar);
        return new zoijcleaow(str, iobyxmoadgVar);
    }

    public abstract void gxszxtbevo(int i13, gxszxtbevo.iobyxmoadg iobyxmoadgVar, Object obj, androidx.core.app.ppxfxbqfkf ppxfxbqfkfVar);

    public final void lqeggnwhkg(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f31045wkgbmnqykc = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f31043lqeggnwhkg.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i13 = 0; i13 < stringArrayList.size(); i13++) {
            String str = stringArrayList.get(i13);
            if (this.f31046zoijcleaow.containsKey(str)) {
                Integer num = (Integer) this.f31046zoijcleaow.remove(str);
                if (!this.f31043lqeggnwhkg.containsKey(str)) {
                    this.f31042iobyxmoadg.remove(num);
                }
            }
            iobyxmoadg(integerArrayList.get(i13).intValue(), stringArrayList.get(i13));
        }
    }

    public final void nufgyqmvbu(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f31046zoijcleaow.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f31046zoijcleaow.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f31045wkgbmnqykc));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f31043lqeggnwhkg.clone());
    }

    public final boolean ppxfxbqfkf(int i13, Object obj) {
        eablkybsjg.iobyxmoadg iobyxmoadgVar;
        String str = (String) this.f31042iobyxmoadg.get(Integer.valueOf(i13));
        if (str == null) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f31040eablkybsjg.get(str);
        if (wkgbmnqykcVar == null || (iobyxmoadgVar = wkgbmnqykcVar.f31056iobyxmoadg) == null) {
            this.f31043lqeggnwhkg.remove(str);
            this.f31041gxszxtbevo.put(str, obj);
            return true;
        }
        if (!this.f31045wkgbmnqykc.remove(str)) {
            return true;
        }
        iobyxmoadgVar.iobyxmoadg(obj);
        return true;
    }

    public final boolean zoijcleaow(int i13, int i14, Intent intent) {
        String str = (String) this.f31042iobyxmoadg.get(Integer.valueOf(i13));
        if (str == null) {
            return false;
        }
        wkgbmnqykc(str, i14, intent, (wkgbmnqykc) this.f31040eablkybsjg.get(str));
        return true;
    }
}
