package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public abstract class jpowsppfya {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    int f9243agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    boolean f9244btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    int f9245draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    boolean f9246dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    int f9247eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    String f9248gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    int f9249gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jyumaefscl f9250iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    ArrayList f9251kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    int f9252lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    int f9253nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    CharSequence f9254ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    boolean f9255oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    ArrayList f9256ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    ArrayList f9257rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    ArrayList f9258vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    CharSequence f9259wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f9260wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ClassLoader f9261zoijcleaow;

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        androidx.lifecycle.gtknphoqwx.zoijcleaow f9262dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f9263eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f9264gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f9265iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        int f9266lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        androidx.lifecycle.gtknphoqwx.zoijcleaow f9267nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f9268ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f9269wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        Fragment f9270zoijcleaow;

        iobyxmoadg() {
        }

        iobyxmoadg(int i13, Fragment fragment) {
            this.f9265iobyxmoadg = i13;
            this.f9270zoijcleaow = fragment;
            this.f9268ppxfxbqfkf = false;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.RESUMED;
            this.f9267nufgyqmvbu = zoijcleaowVar;
            this.f9262dxjokdxxww = zoijcleaowVar;
        }

        iobyxmoadg(int i13, Fragment fragment, boolean z13) {
            this.f9265iobyxmoadg = i13;
            this.f9270zoijcleaow = fragment;
            this.f9268ppxfxbqfkf = z13;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.RESUMED;
            this.f9267nufgyqmvbu = zoijcleaowVar;
            this.f9262dxjokdxxww = zoijcleaowVar;
        }

        iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            this.f9265iobyxmoadg = iobyxmoadgVar.f9265iobyxmoadg;
            this.f9270zoijcleaow = iobyxmoadgVar.f9270zoijcleaow;
            this.f9268ppxfxbqfkf = iobyxmoadgVar.f9268ppxfxbqfkf;
            this.f9269wkgbmnqykc = iobyxmoadgVar.f9269wkgbmnqykc;
            this.f9263eablkybsjg = iobyxmoadgVar.f9263eablkybsjg;
            this.f9264gxszxtbevo = iobyxmoadgVar.f9264gxszxtbevo;
            this.f9266lqeggnwhkg = iobyxmoadgVar.f9266lqeggnwhkg;
            this.f9267nufgyqmvbu = iobyxmoadgVar.f9267nufgyqmvbu;
            this.f9262dxjokdxxww = iobyxmoadgVar.f9262dxjokdxxww;
        }
    }

    jpowsppfya(jyumaefscl jyumaefsclVar, ClassLoader classLoader) {
        this.f9256ppxfxbqfkf = new ArrayList();
        this.f9244btonecajqb = true;
        this.f9255oxmwwwfdhm = false;
        this.f9250iobyxmoadg = jyumaefsclVar;
        this.f9261zoijcleaow = classLoader;
    }

    void agtfadlqog(int i13, Fragment fragment, String str, int i14) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            l2.zoijcleaow.gxszxtbevo(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i13 != 0) {
            if (i13 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i15 = fragment.mFragmentId;
            if (i15 != 0 && i15 != i13) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i13);
            }
            fragment.mFragmentId = i13;
            fragment.mContainerId = i13;
        }
        gxszxtbevo(new iobyxmoadg(i14, fragment));
    }

    public abstract int btonecajqb();

    public jpowsppfya cqumvgiudr(int i13) {
        this.f9253nufgyqmvbu = i13;
        return this;
    }

    public abstract void draadjrbmk();

    public abstract int dxjokdxxww();

    public jpowsppfya eablkybsjg(Fragment fragment, String str) {
        agtfadlqog(0, fragment, str, 1);
        return this;
    }

    public jpowsppfya esjtqupxsv(Fragment fragment) {
        gxszxtbevo(new iobyxmoadg(5, fragment));
        return this;
    }

    public abstract void gtknphoqwx();

    void gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
        this.f9256ppxfxbqfkf.add(iobyxmoadgVar);
        iobyxmoadgVar.f9269wkgbmnqykc = this.f9260wkgbmnqykc;
        iobyxmoadgVar.f9263eablkybsjg = this.f9247eablkybsjg;
        iobyxmoadgVar.f9264gxszxtbevo = this.f9249gxszxtbevo;
        iobyxmoadgVar.f9266lqeggnwhkg = this.f9252lqeggnwhkg;
    }

    public jpowsppfya iwizpuwonk(boolean z13) {
        this.f9255oxmwwwfdhm = z13;
        return this;
    }

    public jpowsppfya jyumaefscl(Fragment fragment) {
        gxszxtbevo(new iobyxmoadg(8, fragment));
        return this;
    }

    jpowsppfya kcexrzcfyt(boolean z13, Runnable runnable) {
        if (!z13) {
            wflxmlrfwp();
        }
        if (this.f9251kcexrzcfyt == null) {
            this.f9251kcexrzcfyt = new ArrayList();
        }
        this.f9251kcexrzcfyt.add(runnable);
        return this;
    }

    public jpowsppfya lqeggnwhkg(View view, String str) {
        if (hkdspvbjdz.eablkybsjg()) {
            String strYlkuphrtab = jhduphickx.ylkuphrtab(view);
            if (strYlkuphrtab == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f9257rgvfuqvkyq == null) {
                this.f9257rgvfuqvkyq = new ArrayList();
                this.f9258vdvldrhtss = new ArrayList();
            } else {
                if (this.f9258vdvldrhtss.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.f9257rgvfuqvkyq.contains(strYlkuphrtab)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strYlkuphrtab + "' has already been added to the transaction.");
                }
            }
            this.f9257rgvfuqvkyq.add(strYlkuphrtab);
            this.f9258vdvldrhtss.add(str);
        }
        return this;
    }

    public jpowsppfya nufgyqmvbu(String str) {
        if (!this.f9244btonecajqb) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f9246dxjokdxxww = true;
        this.f9248gtknphoqwx = str;
        return this;
    }

    public jpowsppfya ojitshcjhn(Fragment fragment) {
        gxszxtbevo(new iobyxmoadg(4, fragment));
        return this;
    }

    public jpowsppfya oxmwwwfdhm(int i13, Fragment fragment, String str) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        agtfadlqog(i13, fragment, str, 2);
        return this;
    }

    public jpowsppfya ppxfxbqfkf(int i13, Fragment fragment, String str) {
        agtfadlqog(i13, fragment, str, 1);
        return this;
    }

    public jpowsppfya rgvfuqvkyq(Fragment fragment) {
        gxszxtbevo(new iobyxmoadg(3, fragment));
        return this;
    }

    public jpowsppfya vdvldrhtss(int i13, Fragment fragment) {
        return oxmwwwfdhm(i13, fragment, null);
    }

    public jpowsppfya wflxmlrfwp() {
        if (this.f9246dxjokdxxww) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f9244btonecajqb = false;
        return this;
    }

    public final jpowsppfya wkgbmnqykc(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return ppxfxbqfkf(viewGroup.getId(), fragment, str);
    }

    public jpowsppfya yggfygwlhe(int i13, int i14, int i15, int i16) {
        this.f9260wkgbmnqykc = i13;
        this.f9247eablkybsjg = i14;
        this.f9249gxszxtbevo = i15;
        this.f9252lqeggnwhkg = i16;
        return this;
    }

    public jpowsppfya zdlpuopuiu(int i13, int i14) {
        return yggfygwlhe(i13, i14, 0, 0);
    }

    public jpowsppfya zoijcleaow(int i13, Fragment fragment) {
        agtfadlqog(i13, fragment, null, 1);
        return this;
    }

    jpowsppfya(jyumaefscl jyumaefsclVar, ClassLoader classLoader, jpowsppfya jpowsppfyaVar) {
        this(jyumaefsclVar, classLoader);
        Iterator it = jpowsppfyaVar.f9256ppxfxbqfkf.iterator();
        while (it.hasNext()) {
            this.f9256ppxfxbqfkf.add(new iobyxmoadg((iobyxmoadg) it.next()));
        }
        this.f9260wkgbmnqykc = jpowsppfyaVar.f9260wkgbmnqykc;
        this.f9247eablkybsjg = jpowsppfyaVar.f9247eablkybsjg;
        this.f9249gxszxtbevo = jpowsppfyaVar.f9249gxszxtbevo;
        this.f9252lqeggnwhkg = jpowsppfyaVar.f9252lqeggnwhkg;
        this.f9253nufgyqmvbu = jpowsppfyaVar.f9253nufgyqmvbu;
        this.f9246dxjokdxxww = jpowsppfyaVar.f9246dxjokdxxww;
        this.f9244btonecajqb = jpowsppfyaVar.f9244btonecajqb;
        this.f9248gtknphoqwx = jpowsppfyaVar.f9248gtknphoqwx;
        this.f9243agtfadlqog = jpowsppfyaVar.f9243agtfadlqog;
        this.f9254ojitshcjhn = jpowsppfyaVar.f9254ojitshcjhn;
        this.f9245draadjrbmk = jpowsppfyaVar.f9245draadjrbmk;
        this.f9259wflxmlrfwp = jpowsppfyaVar.f9259wflxmlrfwp;
        if (jpowsppfyaVar.f9257rgvfuqvkyq != null) {
            ArrayList arrayList = new ArrayList();
            this.f9257rgvfuqvkyq = arrayList;
            arrayList.addAll(jpowsppfyaVar.f9257rgvfuqvkyq);
        }
        if (jpowsppfyaVar.f9258vdvldrhtss != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f9258vdvldrhtss = arrayList2;
            arrayList2.addAll(jpowsppfyaVar.f9258vdvldrhtss);
        }
        this.f9255oxmwwwfdhm = jpowsppfyaVar.f9255oxmwwwfdhm;
    }
}
