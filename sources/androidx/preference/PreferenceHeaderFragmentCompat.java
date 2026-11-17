package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.cdpycssgdh;
import androidx.activity.iwizpuwonk;
import androidx.activity.jyumaefscl;
import androidx.activity.lereixgezr;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jpowsppfya;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H&¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0011\u00103\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/preference/PreferenceFragmentCompat$wkgbmnqykc;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "iozdgvuglv", "(Landroid/view/LayoutInflater;)Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "Landroidx/preference/Preference;", "header", "Lgg/wwaezpbzkn;", "jpowsppfya", "(Landroidx/preference/Preference;)V", "Landroid/content/Intent;", "intent", "hcddaimhww", "(Landroid/content/Intent;)V", "Landroidx/preference/PreferenceFragmentCompat;", "caller", "pref", "", "vdvldrhtss", "(Landroidx/preference/PreferenceFragmentCompat;Landroidx/preference/Preference;)Z", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "ylkuphrtab", "()Landroidx/preference/PreferenceFragmentCompat;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewStateRestored", "(Landroid/os/Bundle;)V", "wwaezpbzkn", "()Landroidx/fragment/app/Fragment;", "Landroidx/activity/jyumaefscl;", "zdlpuopuiu", "Landroidx/activity/jyumaefscl;", "onBackPressedCallback", "lmojexxdyd", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "iobyxmoadg", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.wkgbmnqykc {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private jyumaefscl onBackPressedCallback;

    private static final class iobyxmoadg extends jyumaefscl implements SlidingPaneLayout.eablkybsjg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final PreferenceHeaderFragmentCompat f12456wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(PreferenceHeaderFragmentCompat caller) {
            super(true);
            zdlpuopuiu.btonecajqb(caller, "caller");
            this.f12456wkgbmnqykc = caller;
            caller.lmojexxdyd().iobyxmoadg(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.eablkybsjg
        public void iobyxmoadg(View panel) {
            zdlpuopuiu.btonecajqb(panel, "panel");
            wflxmlrfwp(true);
        }

        @Override // androidx.activity.jyumaefscl
        public void lqeggnwhkg() {
            this.f12456wkgbmnqykc.lmojexxdyd().zoijcleaow();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.eablkybsjg
        public void ppxfxbqfkf(View panel, float f13) {
            zdlpuopuiu.btonecajqb(panel, "panel");
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.eablkybsjg
        public void zoijcleaow(View panel) {
            zdlpuopuiu.btonecajqb(panel, "panel");
            wflxmlrfwp(false);
        }
    }

    public static final class zoijcleaow implements View.OnLayoutChangeListener {
        public zoijcleaow() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
            zdlpuopuiu.gtknphoqwx(view, "view");
            view.removeOnLayoutChangeListener(this);
            jyumaefscl jyumaefsclVar = PreferenceHeaderFragmentCompat.this.onBackPressedCallback;
            zdlpuopuiu.lqeggnwhkg(jyumaefsclVar);
            jyumaefsclVar.wflxmlrfwp(PreferenceHeaderFragmentCompat.this.lmojexxdyd().wflxmlrfwp() && PreferenceHeaderFragmentCompat.this.lmojexxdyd().draadjrbmk());
        }
    }

    private final void hcddaimhww(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }

    private final SlidingPaneLayout iozdgvuglv(LayoutInflater inflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(draadjrbmk.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(draadjrbmk.preferences_header);
        SlidingPaneLayout.wkgbmnqykc wkgbmnqykcVar = new SlidingPaneLayout.wkgbmnqykc(getResources().getDimensionPixelSize(btonecajqb.preferences_header_width), -1);
        wkgbmnqykcVar.f13304iobyxmoadg = getResources().getInteger(wflxmlrfwp.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, wkgbmnqykcVar);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(inflater.getContext());
        fragmentContainerView2.setId(draadjrbmk.preferences_detail);
        SlidingPaneLayout.wkgbmnqykc wkgbmnqykcVar2 = new SlidingPaneLayout.wkgbmnqykc(getResources().getDimensionPixelSize(btonecajqb.preferences_detail_width), -1);
        wkgbmnqykcVar2.f13304iobyxmoadg = getResources().getInteger(wflxmlrfwp.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, wkgbmnqykcVar2);
        return slidingPaneLayout;
    }

    private final void jpowsppfya(Preference header) {
        if (header.btonecajqb() == null) {
            hcddaimhww(header.draadjrbmk());
            return;
        }
        String strBtonecajqb = header.btonecajqb();
        Fragment fragmentIobyxmoadg = strBtonecajqb == null ? null : getChildFragmentManager().dvvnrvtcbc().iobyxmoadg(requireContext().getClassLoader(), strBtonecajqb);
        if (fragmentIobyxmoadg != null) {
            fragmentIobyxmoadg.setArguments(header.nufgyqmvbu());
        }
        if (getChildFragmentManager().roivzttewh() > 0) {
            FragmentManager.gtknphoqwx gtknphoqwxVarTbqsvytpvh = getChildFragmentManager().tbqsvytpvh(0);
            zdlpuopuiu.dxjokdxxww(gtknphoqwxVarTbqsvytpvh, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().s(gtknphoqwxVarTbqsvytpvh.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "childFragmentManager");
        jpowsppfya jpowsppfyaVarKcexrzcfyt = childFragmentManager.kcexrzcfyt();
        zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction()");
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        int i13 = draadjrbmk.preferences_detail;
        zdlpuopuiu.lqeggnwhkg(fragmentIobyxmoadg);
        jpowsppfyaVarKcexrzcfyt.vdvldrhtss(i13, fragmentIobyxmoadg);
        if (lmojexxdyd().draadjrbmk()) {
            jpowsppfyaVarKcexrzcfyt.cqumvgiudr(4099);
        }
        lmojexxdyd().rgvfuqvkyq();
        jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pkzmftpjix(PreferenceHeaderFragmentCompat this$0) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        jyumaefscl jyumaefsclVar = this$0.onBackPressedCallback;
        zdlpuopuiu.lqeggnwhkg(jyumaefsclVar);
        jyumaefsclVar.wflxmlrfwp(this$0.getChildFragmentManager().roivzttewh() == 0);
    }

    public final SlidingPaneLayout lmojexxdyd() {
        return (SlidingPaneLayout) requireView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parentFragmentManager");
        jpowsppfya jpowsppfyaVarKcexrzcfyt = parentFragmentManager.kcexrzcfyt();
        zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction()");
        jpowsppfyaVarKcexrzcfyt.jyumaefscl(this);
        jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        SlidingPaneLayout slidingPaneLayoutIozdgvuglv = iozdgvuglv(inflater);
        if (getChildFragmentManager().zfvoamnweg(draadjrbmk.preferences_header) == null) {
            PreferenceFragmentCompat preferenceFragmentCompatYlkuphrtab = ylkuphrtab();
            FragmentManager childFragmentManager = getChildFragmentManager();
            zdlpuopuiu.dxjokdxxww(childFragmentManager, "childFragmentManager");
            jpowsppfya jpowsppfyaVarKcexrzcfyt = childFragmentManager.kcexrzcfyt();
            zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction()");
            jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
            jpowsppfyaVarKcexrzcfyt.zoijcleaow(draadjrbmk.preferences_header, preferenceFragmentCompatYlkuphrtab);
            jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
        }
        slidingPaneLayoutIozdgvuglv.setLockMode(3);
        return slidingPaneLayoutIozdgvuglv;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        iwizpuwonk onBackPressedDispatcher;
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.onBackPressedCallback = new iobyxmoadg(this);
        SlidingPaneLayout slidingPaneLayoutLmojexxdyd = lmojexxdyd();
        if (!jhduphickx.tzroggbefp(slidingPaneLayoutLmojexxdyd) || slidingPaneLayoutLmojexxdyd.isLayoutRequested()) {
            slidingPaneLayoutLmojexxdyd.addOnLayoutChangeListener(new zoijcleaow());
        } else {
            jyumaefscl jyumaefsclVar = this.onBackPressedCallback;
            zdlpuopuiu.lqeggnwhkg(jyumaefsclVar);
            jyumaefsclVar.wflxmlrfwp(lmojexxdyd().wflxmlrfwp() && lmojexxdyd().draadjrbmk());
        }
        getChildFragmentManager().agtfadlqog(new FragmentManager.ojitshcjhn() { // from class: androidx.preference.eablkybsjg
            @Override // androidx.fragment.app.FragmentManager.ojitshcjhn
            public final void eablkybsjg() {
                PreferenceHeaderFragmentCompat.pkzmftpjix(this.f12490iobyxmoadg);
            }
        });
        lereixgezr lereixgezrVarIobyxmoadg = cdpycssgdh.iobyxmoadg(view);
        if (lereixgezrVarIobyxmoadg == null || (onBackPressedDispatcher = lereixgezrVarIobyxmoadg.getOnBackPressedDispatcher()) == null) {
            return;
        }
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        jyumaefscl jyumaefsclVar2 = this.onBackPressedCallback;
        zdlpuopuiu.lqeggnwhkg(jyumaefsclVar2);
        onBackPressedDispatcher.dxjokdxxww(viewLifecycleOwner, jyumaefsclVar2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        Fragment fragmentWwaezpbzkn;
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null || (fragmentWwaezpbzkn = wwaezpbzkn()) == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "childFragmentManager");
        jpowsppfya jpowsppfyaVarKcexrzcfyt = childFragmentManager.kcexrzcfyt();
        zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction()");
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        jpowsppfyaVarKcexrzcfyt.vdvldrhtss(draadjrbmk.preferences_detail, fragmentWwaezpbzkn);
        jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
    }

    @Override // androidx.preference.PreferenceFragmentCompat.wkgbmnqykc
    public boolean vdvldrhtss(PreferenceFragmentCompat caller, Preference pref) {
        zdlpuopuiu.btonecajqb(caller, "caller");
        zdlpuopuiu.btonecajqb(pref, "pref");
        if (caller.getId() == draadjrbmk.preferences_header) {
            jpowsppfya(pref);
            return true;
        }
        if (caller.getId() != draadjrbmk.preferences_detail) {
            return false;
        }
        androidx.fragment.app.jyumaefscl jyumaefsclVarDvvnrvtcbc = getChildFragmentManager().dvvnrvtcbc();
        ClassLoader classLoader = requireContext().getClassLoader();
        String strBtonecajqb = pref.btonecajqb();
        zdlpuopuiu.lqeggnwhkg(strBtonecajqb);
        Fragment fragmentIobyxmoadg = jyumaefsclVarDvvnrvtcbc.iobyxmoadg(classLoader, strBtonecajqb);
        zdlpuopuiu.dxjokdxxww(fragmentIobyxmoadg, "childFragmentManager.fra….fragment!!\n            )");
        fragmentIobyxmoadg.setArguments(pref.nufgyqmvbu());
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "childFragmentManager");
        jpowsppfya jpowsppfyaVarKcexrzcfyt = childFragmentManager.kcexrzcfyt();
        zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction()");
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        jpowsppfyaVarKcexrzcfyt.vdvldrhtss(draadjrbmk.preferences_detail, fragmentIobyxmoadg);
        jpowsppfyaVarKcexrzcfyt.cqumvgiudr(4099);
        jpowsppfyaVarKcexrzcfyt.nufgyqmvbu(null);
        jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
        return true;
    }

    public Fragment wwaezpbzkn() {
        Fragment fragmentZfvoamnweg = getChildFragmentManager().zfvoamnweg(draadjrbmk.preferences_header);
        if (fragmentZfvoamnweg == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
        }
        PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) fragmentZfvoamnweg;
        Fragment fragmentIobyxmoadg = null;
        if (preferenceFragmentCompat.lmojexxdyd().roivzttewh() <= 0) {
            return null;
        }
        int iRoivzttewh = preferenceFragmentCompat.lmojexxdyd().roivzttewh();
        int i13 = 0;
        while (i13 < iRoivzttewh) {
            int i14 = i13 + 1;
            Preference preferenceTbqsvytpvh = preferenceFragmentCompat.lmojexxdyd().tbqsvytpvh(i13);
            zdlpuopuiu.dxjokdxxww(preferenceTbqsvytpvh, "headerFragment.preferenc…reen.getPreference(index)");
            if (preferenceTbqsvytpvh.btonecajqb() != null) {
                String strBtonecajqb = preferenceTbqsvytpvh.btonecajqb();
                fragmentIobyxmoadg = strBtonecajqb != null ? getChildFragmentManager().dvvnrvtcbc().iobyxmoadg(requireContext().getClassLoader(), strBtonecajqb) : null;
                if (fragmentIobyxmoadg == null) {
                    break;
                }
                fragmentIobyxmoadg.setArguments(preferenceTbqsvytpvh.nufgyqmvbu());
                break;
            }
            i13 = i14;
        }
        return fragmentIobyxmoadg;
    }

    public abstract PreferenceFragmentCompat ylkuphrtab();
}
