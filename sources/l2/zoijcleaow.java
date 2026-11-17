package l2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f61356iobyxmoadg = new zoijcleaow();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static ppxfxbqfkf f61357zoijcleaow = ppxfxbqfkf.f61369wkgbmnqykc;

    public enum iobyxmoadg {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final iobyxmoadg f61368ppxfxbqfkf = new iobyxmoadg(null);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f61369wkgbmnqykc = new ppxfxbqfkf(ikoacuggdj.eablkybsjg(), null, tzroggbefp.dxjokdxxww());

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Set f61370iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f61371zoijcleaow;

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private iobyxmoadg() {
            }
        }

        public ppxfxbqfkf(Set flags, InterfaceC1240zoijcleaow interfaceC1240zoijcleaow, Map allowedViolations) {
            zdlpuopuiu.btonecajqb(flags, "flags");
            zdlpuopuiu.btonecajqb(allowedViolations, "allowedViolations");
            this.f61370iobyxmoadg = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f61371zoijcleaow = linkedHashMap;
        }

        public final Set iobyxmoadg() {
            return this.f61370iobyxmoadg;
        }

        public final Map ppxfxbqfkf() {
            return this.f61371zoijcleaow;
        }

        public final InterfaceC1240zoijcleaow zoijcleaow() {
            return null;
        }
    }

    /* JADX INFO: renamed from: l2.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public interface InterfaceC1240zoijcleaow {
    }

    private zoijcleaow() {
    }

    public static final void agtfadlqog(Fragment fragment, ViewGroup container) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(wrongFragmentContainerViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_WRONG_FRAGMENT_CONTAINER) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, wrongFragmentContainerViolation);
        }
    }

    public static final void btonecajqb(Fragment fragment) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(getTargetFragmentUsageViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_TARGET_FRAGMENT_USAGE) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, getTargetFragmentUsageViolation);
        }
    }

    public static final void draadjrbmk(Fragment violatingFragment, Fragment targetFragment, int i13) {
        zdlpuopuiu.btonecajqb(violatingFragment, "violatingFragment");
        zdlpuopuiu.btonecajqb(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, i13);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(setTargetFragmentUsageViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(violatingFragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_TARGET_FRAGMENT_USAGE) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, setTargetFragmentUsageViolation);
        }
    }

    public static final void dxjokdxxww(Fragment fragment) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(getTargetFragmentRequestCodeUsageViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_TARGET_FRAGMENT_USAGE) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    private final void eablkybsjg(Violation violation) {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    public static final void gtknphoqwx(Fragment fragment) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(setRetainInstanceUsageViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_RETAIN_INSTANCE_USAGE) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, setRetainInstanceUsageViolation);
        }
    }

    public static final void gxszxtbevo(Fragment fragment, String previousFragmentId) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(fragmentReuseViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_FRAGMENT_REUSE) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), fragmentReuseViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, fragmentReuseViolation);
        }
    }

    public static final void lqeggnwhkg(Fragment fragment, ViewGroup viewGroup) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(fragmentTagUsageViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_FRAGMENT_TAG_USAGE) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, fragmentTagUsageViolation);
        }
    }

    public static final void nufgyqmvbu(Fragment fragment) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(getRetainInstanceUsageViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_RETAIN_INSTANCE_USAGE) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, getRetainInstanceUsageViolation);
        }
    }

    public static final void ojitshcjhn(Fragment fragment, Fragment expectedParentFragment, int i13) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, i13);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(wrongNestedHierarchyViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_WRONG_NESTED_HIERARCHY) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, wrongNestedHierarchyViolation);
        }
    }

    private final void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, final Violation violation) {
        Fragment fragmentIobyxmoadg = violation.getFragment();
        final String name = fragmentIobyxmoadg.getClass().getName();
        if (ppxfxbqfkfVar.iobyxmoadg().contains(iobyxmoadg.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        ppxfxbqfkfVar.zoijcleaow();
        if (ppxfxbqfkfVar.iobyxmoadg().contains(iobyxmoadg.PENALTY_DEATH)) {
            rgvfuqvkyq(fragmentIobyxmoadg, new Runnable() { // from class: l2.iobyxmoadg
                @Override // java.lang.Runnable
                public final void run() {
                    zoijcleaow.wkgbmnqykc(name, violation);
                }
            });
        }
    }

    private final void rgvfuqvkyq(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerNufgyqmvbu = fragment.getParentFragmentManager().lxfrhoxuzk().nufgyqmvbu();
        if (zdlpuopuiu.eablkybsjg(handlerNufgyqmvbu.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerNufgyqmvbu.post(runnable);
        }
    }

    private final boolean vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar, Class cls, Class cls2) {
        Set set = (Set) ppxfxbqfkfVar.ppxfxbqfkf().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (zdlpuopuiu.eablkybsjg(cls2.getSuperclass(), Violation.class) || !jyumaefscl.xrmfcynszj(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    public static final void wflxmlrfwp(Fragment fragment, boolean z13) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z13);
        zoijcleaow zoijcleaowVar = f61356iobyxmoadg;
        zoijcleaowVar.eablkybsjg(setUserVisibleHintViolation);
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaowVar.zoijcleaow(fragment);
        if (ppxfxbqfkfVarZoijcleaow.iobyxmoadg().contains(iobyxmoadg.DETECT_SET_USER_VISIBLE_HINT) && zoijcleaowVar.vdvldrhtss(ppxfxbqfkfVarZoijcleaow, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZoijcleaow, setUserVisibleHintViolation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(String str, Violation violation) {
        zdlpuopuiu.btonecajqb(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final ppxfxbqfkf zoijcleaow(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                zdlpuopuiu.dxjokdxxww(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.ipoelvxyzq() != null) {
                    ppxfxbqfkf ppxfxbqfkfVarIpoelvxyzq = parentFragmentManager.ipoelvxyzq();
                    zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVarIpoelvxyzq);
                    return ppxfxbqfkfVarIpoelvxyzq;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f61357zoijcleaow;
    }
}
