package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class lmojexxdyd extends androidx.lifecycle.ntlheqmsrt {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final crxdokpmqz.ppxfxbqfkf f9282nufgyqmvbu = new iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f9288wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HashMap f9285iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HashMap f9289zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final HashMap f9287ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f9283eablkybsjg = false;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f9284gxszxtbevo = false;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f9286lqeggnwhkg = false;

    class iobyxmoadg implements crxdokpmqz.ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public androidx.lifecycle.ntlheqmsrt create(Class cls) {
            return new lmojexxdyd(true);
        }
    }

    lmojexxdyd(boolean z13) {
        this.f9288wkgbmnqykc = z13;
    }

    private void ojitshcjhn(String str, boolean z13) {
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) this.f9289zoijcleaow.get(str);
        if (lmojexxdydVar != null) {
            if (z13) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lmojexxdydVar.f9289zoijcleaow.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lmojexxdydVar.agtfadlqog((String) it.next(), true);
                }
            }
            lmojexxdydVar.onCleared();
            this.f9289zoijcleaow.remove(str);
        }
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) this.f9287ppxfxbqfkf.get(str);
        if (jlmebxxooxVar != null) {
            jlmebxxooxVar.iobyxmoadg();
            this.f9287ppxfxbqfkf.remove(str);
        }
    }

    static lmojexxdyd zdlpuopuiu(jlmebxxoox jlmebxxooxVar) {
        return (lmojexxdyd) new crxdokpmqz(jlmebxxooxVar, f9282nufgyqmvbu).zoijcleaow(lmojexxdyd.class);
    }

    void agtfadlqog(String str, boolean z13) {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        ojitshcjhn(str, z13);
    }

    void cqumvgiudr(Fragment fragment) {
        if (this.f9286lqeggnwhkg) {
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f9285iobyxmoadg.remove(fragment.mWho) == null || !FragmentManager.rhgxfdycjh(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void draadjrbmk(Fragment fragment, boolean z13) {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        ojitshcjhn(fragment.mWho, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lmojexxdyd.class != obj.getClass()) {
            return false;
        }
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
        return this.f9285iobyxmoadg.equals(lmojexxdydVar.f9285iobyxmoadg) && this.f9289zoijcleaow.equals(lmojexxdydVar.f9289zoijcleaow) && this.f9287ppxfxbqfkf.equals(lmojexxdydVar.f9287ppxfxbqfkf);
    }

    void esjtqupxsv(boolean z13) {
        this.f9286lqeggnwhkg = z13;
    }

    void gtknphoqwx(Fragment fragment) {
        if (this.f9286lqeggnwhkg) {
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f9285iobyxmoadg.containsKey(fragment.mWho)) {
                return;
            }
            this.f9285iobyxmoadg.put(fragment.mWho, fragment);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public int hashCode() {
        return (((this.f9285iobyxmoadg.hashCode() * 31) + this.f9289zoijcleaow.hashCode()) * 31) + this.f9287ppxfxbqfkf.hashCode();
    }

    boolean iwizpuwonk() {
        return this.f9283eablkybsjg;
    }

    jlmebxxoox jyumaefscl(Fragment fragment) {
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) this.f9287ppxfxbqfkf.get(fragment.mWho);
        if (jlmebxxooxVar != null) {
            return jlmebxxooxVar;
        }
        jlmebxxoox jlmebxxooxVar2 = new jlmebxxoox();
        this.f9287ppxfxbqfkf.put(fragment.mWho, jlmebxxooxVar2);
        return jlmebxxooxVar2;
    }

    boolean lereixgezr(Fragment fragment) {
        if (this.f9285iobyxmoadg.containsKey(fragment.mWho)) {
            return this.f9288wkgbmnqykc ? this.f9283eablkybsjg : !this.f9284gxszxtbevo;
        }
        return true;
    }

    @Override // androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f9283eablkybsjg = true;
    }

    lmojexxdyd oxmwwwfdhm(Fragment fragment) {
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) this.f9289zoijcleaow.get(fragment.mWho);
        if (lmojexxdydVar != null) {
            return lmojexxdydVar;
        }
        lmojexxdyd lmojexxdydVar2 = new lmojexxdyd(this.f9288wkgbmnqykc);
        this.f9289zoijcleaow.put(fragment.mWho, lmojexxdydVar2);
        return lmojexxdydVar2;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("FragmentManagerViewModel{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("} Fragments (");
        Iterator it = this.f9285iobyxmoadg.values().iterator();
        while (it.hasNext()) {
            sb3.append(it.next());
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(") Child Non Config (");
        Iterator it2 = this.f9289zoijcleaow.keySet().iterator();
        while (it2.hasNext()) {
            sb3.append((String) it2.next());
            if (it2.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(") ViewModelStores (");
        Iterator it3 = this.f9287ppxfxbqfkf.keySet().iterator();
        while (it3.hasNext()) {
            sb3.append((String) it3.next());
            if (it3.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(')');
        return sb3.toString();
    }

    Fragment vdvldrhtss(String str) {
        return (Fragment) this.f9285iobyxmoadg.get(str);
    }

    Collection yggfygwlhe() {
        return new ArrayList(this.f9285iobyxmoadg.values());
    }
}
