package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class hcddaimhww {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private lmojexxdyd f9228wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f9226iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HashMap f9229zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final HashMap f9227ppxfxbqfkf = new HashMap();

    hcddaimhww() {
    }

    pkzmftpjix agtfadlqog(String str) {
        return (pkzmftpjix) this.f9229zoijcleaow.get(str);
    }

    int btonecajqb(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f9226iobyxmoadg.indexOf(fragment);
        for (int i13 = iIndexOf - 1; i13 >= 0; i13--) {
            Fragment fragment2 = (Fragment) this.f9226iobyxmoadg.get(i13);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f9226iobyxmoadg.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f9226iobyxmoadg.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    void cqumvgiudr(HashMap map) {
        this.f9227ppxfxbqfkf.clear();
        this.f9227ppxfxbqfkf.putAll(map);
    }

    List draadjrbmk() {
        ArrayList arrayList = new ArrayList();
        for (pkzmftpjix pkzmftpjixVar : this.f9229zoijcleaow.values()) {
            if (pkzmftpjixVar != null) {
                arrayList.add(pkzmftpjixVar.gtknphoqwx());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    Fragment dxjokdxxww(String str) {
        Fragment fragmentFindFragmentByWho;
        for (pkzmftpjix pkzmftpjixVar : this.f9229zoijcleaow.values()) {
            if (pkzmftpjixVar != null && (fragmentFindFragmentByWho = pkzmftpjixVar.gtknphoqwx().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    void eablkybsjg(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f9229zoijcleaow.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (pkzmftpjix pkzmftpjixVar : this.f9229zoijcleaow.values()) {
                printWriter.print(str);
                if (pkzmftpjixVar != null) {
                    Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
                    printWriter.println(fragmentGtknphoqwx);
                    fragmentGtknphoqwx.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f9226iobyxmoadg.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i13 = 0; i13 < size; i13++) {
                Fragment fragment = (Fragment) this.f9226iobyxmoadg.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    ArrayList esjtqupxsv() {
        ArrayList arrayList = new ArrayList(this.f9229zoijcleaow.size());
        for (pkzmftpjix pkzmftpjixVar : this.f9229zoijcleaow.values()) {
            if (pkzmftpjixVar != null) {
                Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
                zynmafqrjb(fragmentGtknphoqwx.mWho, pkzmftpjixVar.oxmwwwfdhm());
                arrayList.add(fragmentGtknphoqwx.mWho);
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentGtknphoqwx + ": " + fragmentGtknphoqwx.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    List gtknphoqwx() {
        ArrayList arrayList = new ArrayList();
        for (pkzmftpjix pkzmftpjixVar : this.f9229zoijcleaow.values()) {
            if (pkzmftpjixVar != null) {
                arrayList.add(pkzmftpjixVar);
            }
        }
        return arrayList;
    }

    Fragment gxszxtbevo(String str) {
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) this.f9229zoijcleaow.get(str);
        if (pkzmftpjixVar != null) {
            return pkzmftpjixVar.gtknphoqwx();
        }
        return null;
    }

    void iobyxmoadg(Fragment fragment) {
        if (this.f9226iobyxmoadg.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f9226iobyxmoadg) {
            this.f9226iobyxmoadg.add(fragment);
        }
        fragment.mAdded = true;
    }

    void iwizpuwonk(List list) {
        this.f9226iobyxmoadg.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentGxszxtbevo = gxszxtbevo(str);
                if (fragmentGxszxtbevo == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.rhgxfdycjh(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentGxszxtbevo);
                }
                iobyxmoadg(fragmentGxszxtbevo);
            }
        }
    }

    void jyumaefscl() {
        this.f9229zoijcleaow.clear();
    }

    void kcexrzcfyt(pkzmftpjix pkzmftpjixVar) {
        Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
        if (fragmentGtknphoqwx.mRetainInstance) {
            this.f9228wkgbmnqykc.cqumvgiudr(fragmentGtknphoqwx);
        }
        if (this.f9229zoijcleaow.get(fragmentGtknphoqwx.mWho) == pkzmftpjixVar && ((pkzmftpjix) this.f9229zoijcleaow.put(fragmentGtknphoqwx.mWho, null)) != null && FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentGtknphoqwx);
        }
    }

    ArrayList lereixgezr() {
        synchronized (this.f9226iobyxmoadg) {
            try {
                if (this.f9226iobyxmoadg.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f9226iobyxmoadg.size());
                for (Fragment fragment : this.f9226iobyxmoadg) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Fragment lqeggnwhkg(int i13) {
        for (int size = this.f9226iobyxmoadg.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f9226iobyxmoadg.get(size);
            if (fragment != null && fragment.mFragmentId == i13) {
                return fragment;
            }
        }
        for (pkzmftpjix pkzmftpjixVar : this.f9229zoijcleaow.values()) {
            if (pkzmftpjixVar != null) {
                Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
                if (fragmentGtknphoqwx.mFragmentId == i13) {
                    return fragmentGtknphoqwx;
                }
            }
        }
        return null;
    }

    Fragment nufgyqmvbu(String str) {
        if (str != null) {
            for (int size = this.f9226iobyxmoadg.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f9226iobyxmoadg.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (pkzmftpjix pkzmftpjixVar : this.f9229zoijcleaow.values()) {
            if (pkzmftpjixVar != null) {
                Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
                if (str.equals(fragmentGtknphoqwx.mTag)) {
                    return fragmentGtknphoqwx;
                }
            }
        }
        return null;
    }

    List ojitshcjhn() {
        ArrayList arrayList;
        if (this.f9226iobyxmoadg.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f9226iobyxmoadg) {
            arrayList = new ArrayList(this.f9226iobyxmoadg);
        }
        return arrayList;
    }

    void oxmwwwfdhm(pkzmftpjix pkzmftpjixVar) {
        Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
        if (ppxfxbqfkf(fragmentGtknphoqwx.mWho)) {
            return;
        }
        this.f9229zoijcleaow.put(fragmentGtknphoqwx.mWho, pkzmftpjixVar);
        if (fragmentGtknphoqwx.mRetainInstanceChangedWhileDetached) {
            if (fragmentGtknphoqwx.mRetainInstance) {
                this.f9228wkgbmnqykc.gtknphoqwx(fragmentGtknphoqwx);
            } else {
                this.f9228wkgbmnqykc.cqumvgiudr(fragmentGtknphoqwx);
            }
            fragmentGtknphoqwx.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentGtknphoqwx);
        }
    }

    void pmvmpeiblj(lmojexxdyd lmojexxdydVar) {
        this.f9228wkgbmnqykc = lmojexxdydVar;
    }

    boolean ppxfxbqfkf(String str) {
        return this.f9229zoijcleaow.get(str) != null;
    }

    lmojexxdyd rgvfuqvkyq() {
        return this.f9228wkgbmnqykc;
    }

    Bundle vdvldrhtss(String str) {
        return (Bundle) this.f9227ppxfxbqfkf.get(str);
    }

    HashMap wflxmlrfwp() {
        return this.f9227ppxfxbqfkf;
    }

    void wkgbmnqykc(int i13) {
        for (pkzmftpjix pkzmftpjixVar : this.f9229zoijcleaow.values()) {
            if (pkzmftpjixVar != null) {
                pkzmftpjixVar.zdlpuopuiu(i13);
            }
        }
    }

    void yggfygwlhe(Fragment fragment) {
        synchronized (this.f9226iobyxmoadg) {
            this.f9226iobyxmoadg.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void zdlpuopuiu() {
        Iterator it = this.f9226iobyxmoadg.iterator();
        while (it.hasNext()) {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) this.f9229zoijcleaow.get(((Fragment) it.next()).mWho);
            if (pkzmftpjixVar != null) {
                pkzmftpjixVar.wflxmlrfwp();
            }
        }
        for (pkzmftpjix pkzmftpjixVar2 : this.f9229zoijcleaow.values()) {
            if (pkzmftpjixVar2 != null) {
                pkzmftpjixVar2.wflxmlrfwp();
                Fragment fragmentGtknphoqwx = pkzmftpjixVar2.gtknphoqwx();
                if (fragmentGtknphoqwx.mRemoving && !fragmentGtknphoqwx.isInBackStack()) {
                    if (fragmentGtknphoqwx.mBeingSaved && !this.f9227ppxfxbqfkf.containsKey(fragmentGtknphoqwx.mWho)) {
                        zynmafqrjb(fragmentGtknphoqwx.mWho, pkzmftpjixVar2.oxmwwwfdhm());
                    }
                    kcexrzcfyt(pkzmftpjixVar2);
                }
            }
        }
    }

    void zoijcleaow() {
        this.f9229zoijcleaow.values().removeAll(Collections.singleton(null));
    }

    Bundle zynmafqrjb(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f9227ppxfxbqfkf.put(str, bundle) : (Bundle) this.f9227ppxfxbqfkf.remove(str);
    }
}
