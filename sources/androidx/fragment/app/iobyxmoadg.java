package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends jpowsppfya implements FragmentManager.gtknphoqwx, FragmentManager.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    boolean f9233iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    int f9234jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    boolean f9235yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final FragmentManager f9236zdlpuopuiu;

    iobyxmoadg(FragmentManager fragmentManager) {
        super(fragmentManager.dvvnrvtcbc(), fragmentManager.lxfrhoxuzk() != null ? fragmentManager.lxfrhoxuzk().gxszxtbevo().getClassLoader() : null);
        this.f9234jyumaefscl = -1;
        this.f9233iwizpuwonk = false;
        this.f9236zdlpuopuiu = fragmentManager;
    }

    @Override // androidx.fragment.app.jpowsppfya
    void agtfadlqog(int i13, Fragment fragment, String str, int i14) {
        super.agtfadlqog(i13, fragment, str, i14);
        fragment.mFragmentManager = this.f9236zdlpuopuiu;
    }

    @Override // androidx.fragment.app.jpowsppfya
    public int btonecajqb() {
        return zynmafqrjb(true, true);
    }

    public void cdpycssgdh(String str, PrintWriter printWriter, boolean z13) {
        String str2;
        if (z13) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9248gtknphoqwx);
            printWriter.print(" mIndex=");
            printWriter.print(this.f9234jyumaefscl);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f9235yggfygwlhe);
            if (this.f9253nufgyqmvbu != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9253nufgyqmvbu));
            }
            if (this.f9260wkgbmnqykc != 0 || this.f9247eablkybsjg != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9260wkgbmnqykc));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9247eablkybsjg));
            }
            if (this.f9249gxszxtbevo != 0 || this.f9252lqeggnwhkg != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9249gxszxtbevo));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9252lqeggnwhkg));
            }
            if (this.f9245draadjrbmk != 0 || this.f9259wflxmlrfwp != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9245draadjrbmk));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f9259wflxmlrfwp);
            }
            if (this.f9243agtfadlqog != 0 || this.f9254ojitshcjhn != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9243agtfadlqog));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9254ojitshcjhn);
            }
        }
        if (this.f9256ppxfxbqfkf.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f9256ppxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) this.f9256ppxfxbqfkf.get(i13);
            switch (iobyxmoadgVar.f9265iobyxmoadg) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + iobyxmoadgVar.f9265iobyxmoadg;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i13);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(iobyxmoadgVar.f9270zoijcleaow);
            if (z13) {
                if (iobyxmoadgVar.f9269wkgbmnqykc != 0 || iobyxmoadgVar.f9263eablkybsjg != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(iobyxmoadgVar.f9269wkgbmnqykc));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(iobyxmoadgVar.f9263eablkybsjg));
                }
                if (iobyxmoadgVar.f9264gxszxtbevo != 0 || iobyxmoadgVar.f9266lqeggnwhkg != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(iobyxmoadgVar.f9264gxszxtbevo));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(iobyxmoadgVar.f9266lqeggnwhkg));
                }
            }
        }
    }

    @Override // androidx.fragment.app.jpowsppfya
    public void draadjrbmk() {
        wflxmlrfwp();
        this.f9236zdlpuopuiu.rlfsiqarku(this, true);
    }

    @Override // androidx.fragment.app.jpowsppfya
    public int dxjokdxxww() {
        return zynmafqrjb(false, true);
    }

    @Override // androidx.fragment.app.jpowsppfya
    public jpowsppfya esjtqupxsv(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f9236zdlpuopuiu) {
            return super.esjtqupxsv(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.FragmentManager.gtknphoqwx
    public int getId() {
        return this.f9234jyumaefscl;
    }

    @Override // androidx.fragment.app.FragmentManager.gtknphoqwx
    public String getName() {
        return this.f9248gtknphoqwx;
    }

    @Override // androidx.fragment.app.jpowsppfya
    public void gtknphoqwx() {
        wflxmlrfwp();
        this.f9236zdlpuopuiu.rlfsiqarku(this, false);
    }

    @Override // androidx.fragment.app.FragmentManager.rgvfuqvkyq
    public boolean iobyxmoadg(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f9246dxjokdxxww) {
            return true;
        }
        this.f9236zdlpuopuiu.gtknphoqwx(this);
        return true;
    }

    void iozdgvuglv() {
        for (int size = this.f9256ppxfxbqfkf.size() - 1; size >= 0; size--) {
            jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) this.f9256ppxfxbqfkf.get(size);
            Fragment fragment = iobyxmoadgVar.f9270zoijcleaow;
            if (fragment != null) {
                fragment.mBeingSaved = this.f9233iwizpuwonk;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.J(this.f9253nufgyqmvbu));
                fragment.setSharedElementNames(this.f9258vdvldrhtss, this.f9257rgvfuqvkyq);
            }
            switch (iobyxmoadgVar.f9265iobyxmoadg) {
                case 1:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.P(fragment, true);
                    this.f9236zdlpuopuiu.C(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + iobyxmoadgVar.f9265iobyxmoadg);
                case 3:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.draadjrbmk(fragment);
                    break;
                case 4:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.V(fragment);
                    break;
                case 5:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.P(fragment, true);
                    this.f9236zdlpuopuiu.jrbgnlbqoe(fragment);
                    break;
                case 6:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.oxmwwwfdhm(fragment);
                    break;
                case 7:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.P(fragment, true);
                    this.f9236zdlpuopuiu.istkbnxepw(fragment);
                    break;
                case 8:
                    this.f9236zdlpuopuiu.T(null);
                    break;
                case 9:
                    this.f9236zdlpuopuiu.T(fragment);
                    break;
                case 10:
                    this.f9236zdlpuopuiu.S(fragment, iobyxmoadgVar.f9267nufgyqmvbu);
                    break;
            }
        }
    }

    public void istkbnxepw(String str, PrintWriter printWriter) {
        cdpycssgdh(str, printWriter, true);
    }

    @Override // androidx.fragment.app.jpowsppfya
    public jpowsppfya jyumaefscl(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f9236zdlpuopuiu) {
            return super.jyumaefscl(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void lereixgezr(int i13) {
        if (this.f9246dxjokdxxww) {
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i13);
            }
            int size = this.f9256ppxfxbqfkf.size();
            for (int i14 = 0; i14 < size; i14++) {
                jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) this.f9256ppxfxbqfkf.get(i14);
                Fragment fragment = iobyxmoadgVar.f9270zoijcleaow;
                if (fragment != null) {
                    fragment.mBackStackNesting += i13;
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + iobyxmoadgVar.f9270zoijcleaow + " to " + iobyxmoadgVar.f9270zoijcleaow.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    Fragment lmojexxdyd(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i13 = 0;
        while (i13 < this.f9256ppxfxbqfkf.size()) {
            jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) this.f9256ppxfxbqfkf.get(i13);
            int i14 = iobyxmoadgVar.f9265iobyxmoadg;
            if (i14 == 1) {
                arrayList.add(iobyxmoadgVar.f9270zoijcleaow);
            } else if (i14 == 2) {
                Fragment fragment3 = iobyxmoadgVar.f9270zoijcleaow;
                int i15 = fragment3.mContainerId;
                boolean z13 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = (Fragment) arrayList.get(size);
                    if (fragment4.mContainerId == i15) {
                        if (fragment4 == fragment3) {
                            z13 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f9256ppxfxbqfkf.add(i13, new jpowsppfya.iobyxmoadg(9, fragment4, true));
                                i13++;
                                fragment2 = null;
                            }
                            jpowsppfya.iobyxmoadg iobyxmoadgVar2 = new jpowsppfya.iobyxmoadg(3, fragment4, true);
                            iobyxmoadgVar2.f9269wkgbmnqykc = iobyxmoadgVar.f9269wkgbmnqykc;
                            iobyxmoadgVar2.f9264gxszxtbevo = iobyxmoadgVar.f9264gxszxtbevo;
                            iobyxmoadgVar2.f9263eablkybsjg = iobyxmoadgVar.f9263eablkybsjg;
                            iobyxmoadgVar2.f9266lqeggnwhkg = iobyxmoadgVar.f9266lqeggnwhkg;
                            this.f9256ppxfxbqfkf.add(i13, iobyxmoadgVar2);
                            arrayList.remove(fragment4);
                            i13++;
                        }
                    }
                }
                if (z13) {
                    this.f9256ppxfxbqfkf.remove(i13);
                    i13--;
                } else {
                    iobyxmoadgVar.f9265iobyxmoadg = 1;
                    iobyxmoadgVar.f9268ppxfxbqfkf = true;
                    arrayList.add(fragment3);
                }
            } else if (i14 == 3 || i14 == 6) {
                arrayList.remove(iobyxmoadgVar.f9270zoijcleaow);
                Fragment fragment5 = iobyxmoadgVar.f9270zoijcleaow;
                if (fragment5 == fragment2) {
                    this.f9256ppxfxbqfkf.add(i13, new jpowsppfya.iobyxmoadg(9, fragment5));
                    i13++;
                    fragment2 = null;
                }
            } else if (i14 == 7) {
                arrayList.add(iobyxmoadgVar.f9270zoijcleaow);
            } else if (i14 == 8) {
                this.f9256ppxfxbqfkf.add(i13, new jpowsppfya.iobyxmoadg(9, fragment2, true));
                iobyxmoadgVar.f9268ppxfxbqfkf = true;
                i13++;
                fragment2 = iobyxmoadgVar.f9270zoijcleaow;
            }
            i13++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.jpowsppfya
    public jpowsppfya ojitshcjhn(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f9236zdlpuopuiu) {
            return super.ojitshcjhn(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void pmvmpeiblj() {
        int size = this.f9256ppxfxbqfkf.size() - 1;
        while (size >= 0) {
            jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) this.f9256ppxfxbqfkf.get(size);
            if (iobyxmoadgVar.f9268ppxfxbqfkf) {
                if (iobyxmoadgVar.f9265iobyxmoadg == 8) {
                    iobyxmoadgVar.f9268ppxfxbqfkf = false;
                    this.f9256ppxfxbqfkf.remove(size - 1);
                    size--;
                } else {
                    int i13 = iobyxmoadgVar.f9270zoijcleaow.mContainerId;
                    iobyxmoadgVar.f9265iobyxmoadg = 2;
                    iobyxmoadgVar.f9268ppxfxbqfkf = false;
                    for (int i14 = size - 1; i14 >= 0; i14--) {
                        jpowsppfya.iobyxmoadg iobyxmoadgVar2 = (jpowsppfya.iobyxmoadg) this.f9256ppxfxbqfkf.get(i14);
                        if (iobyxmoadgVar2.f9268ppxfxbqfkf && iobyxmoadgVar2.f9270zoijcleaow.mContainerId == i13) {
                            this.f9256ppxfxbqfkf.remove(i14);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    @Override // androidx.fragment.app.jpowsppfya
    public jpowsppfya rgvfuqvkyq(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f9236zdlpuopuiu) {
            return super.rgvfuqvkyq(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb3.append("BackStackEntry{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f9234jyumaefscl >= 0) {
            sb3.append(" #");
            sb3.append(this.f9234jyumaefscl);
        }
        if (this.f9248gtknphoqwx != null) {
            sb3.append(" ");
            sb3.append(this.f9248gtknphoqwx);
        }
        sb3.append("}");
        return sb3.toString();
    }

    public void wwaezpbzkn() {
        if (this.f9251kcexrzcfyt != null) {
            for (int i13 = 0; i13 < this.f9251kcexrzcfyt.size(); i13++) {
                ((Runnable) this.f9251kcexrzcfyt.get(i13)).run();
            }
            this.f9251kcexrzcfyt = null;
        }
    }

    void yadqdtsiqt() {
        int size = this.f9256ppxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) this.f9256ppxfxbqfkf.get(i13);
            Fragment fragment = iobyxmoadgVar.f9270zoijcleaow;
            if (fragment != null) {
                fragment.mBeingSaved = this.f9233iwizpuwonk;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f9253nufgyqmvbu);
                fragment.setSharedElementNames(this.f9257rgvfuqvkyq, this.f9258vdvldrhtss);
            }
            switch (iobyxmoadgVar.f9265iobyxmoadg) {
                case 1:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.P(fragment, false);
                    this.f9236zdlpuopuiu.draadjrbmk(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + iobyxmoadgVar.f9265iobyxmoadg);
                case 3:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.C(fragment);
                    break;
                case 4:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.jrbgnlbqoe(fragment);
                    break;
                case 5:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.P(fragment, false);
                    this.f9236zdlpuopuiu.V(fragment);
                    break;
                case 6:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.istkbnxepw(fragment);
                    break;
                case 7:
                    fragment.setAnimations(iobyxmoadgVar.f9269wkgbmnqykc, iobyxmoadgVar.f9263eablkybsjg, iobyxmoadgVar.f9264gxszxtbevo, iobyxmoadgVar.f9266lqeggnwhkg);
                    this.f9236zdlpuopuiu.P(fragment, false);
                    this.f9236zdlpuopuiu.oxmwwwfdhm(fragment);
                    break;
                case 8:
                    this.f9236zdlpuopuiu.T(fragment);
                    break;
                case 9:
                    this.f9236zdlpuopuiu.T(null);
                    break;
                case 10:
                    this.f9236zdlpuopuiu.S(fragment, iobyxmoadgVar.f9262dxjokdxxww);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    Fragment ylkuphrtab(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f9256ppxfxbqfkf.size() - 1; size >= 0; size--) {
            jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) this.f9256ppxfxbqfkf.get(size);
            int i13 = iobyxmoadgVar.f9265iobyxmoadg;
            if (i13 == 1) {
                arrayList.remove(iobyxmoadgVar.f9270zoijcleaow);
            } else if (i13 != 3) {
                switch (i13) {
                    case 6:
                        arrayList.add(iobyxmoadgVar.f9270zoijcleaow);
                        break;
                    case 7:
                        arrayList.remove(iobyxmoadgVar.f9270zoijcleaow);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = iobyxmoadgVar.f9270zoijcleaow;
                        break;
                    case 10:
                        iobyxmoadgVar.f9262dxjokdxxww = iobyxmoadgVar.f9267nufgyqmvbu;
                        break;
                }
            } else {
                arrayList.add(iobyxmoadgVar.f9270zoijcleaow);
            }
        }
        return fragment;
    }

    int zynmafqrjb(boolean z13, boolean z14) {
        if (this.f9235yggfygwlhe) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new kegysxyocb("FragmentManager"));
            istkbnxepw("  ", printWriter);
            printWriter.close();
        }
        this.f9235yggfygwlhe = true;
        if (this.f9246dxjokdxxww) {
            this.f9234jyumaefscl = this.f9236zdlpuopuiu.rgvfuqvkyq();
        } else {
            this.f9234jyumaefscl = -1;
        }
        if (z14) {
            this.f9236zdlpuopuiu.jztzpxfvev(this, z13);
        }
        return this.f9234jyumaefscl;
    }

    iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        super(iobyxmoadgVar.f9236zdlpuopuiu.dvvnrvtcbc(), iobyxmoadgVar.f9236zdlpuopuiu.lxfrhoxuzk() != null ? iobyxmoadgVar.f9236zdlpuopuiu.lxfrhoxuzk().gxszxtbevo().getClassLoader() : null, iobyxmoadgVar);
        this.f9234jyumaefscl = -1;
        this.f9233iwizpuwonk = false;
        this.f9236zdlpuopuiu = iobyxmoadgVar.f9236zdlpuopuiu;
        this.f9235yggfygwlhe = iobyxmoadgVar.f9235yggfygwlhe;
        this.f9234jyumaefscl = iobyxmoadgVar.f9234jyumaefscl;
        this.f9233iwizpuwonk = iobyxmoadgVar.f9233iwizpuwonk;
    }
}
