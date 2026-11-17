package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.iwizpuwonk;
import androidx.activity.jyumaefscl;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jpowsppfya;
import androidx.lifecycle.vdvldrhtss;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import gg.wwaezpbzkn;
import h5.rgvfuqvkyq;
import j5.eablkybsjg;
import j5.gxszxtbevo;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001f\u0010\u001dR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "lmojexxdyd", "Landroidx/navigation/fragment/NavHostFragment;", "iozdgvuglv", "()Landroidx/navigation/fragment/NavHostFragment;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "wwaezpbzkn", "onViewStateRestored", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroidx/activity/jyumaefscl;", "zdlpuopuiu", "Landroidx/activity/jyumaefscl;", "onBackPressedCallback", "yggfygwlhe", "Landroidx/navigation/fragment/NavHostFragment;", "_detailPaneNavHostFragment", "", "jyumaefscl", "I", "graphId", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "yadqdtsiqt", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "iobyxmoadg", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractListDetailFragment extends Fragment {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private int graphId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private NavHostFragment _detailPaneNavHostFragment;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private jyumaefscl onBackPressedCallback;

    private static final class iobyxmoadg extends jyumaefscl implements SlidingPaneLayout.eablkybsjg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final SlidingPaneLayout f12082wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(SlidingPaneLayout slidingPaneLayout) {
            super(true);
            zdlpuopuiu.btonecajqb(slidingPaneLayout, "slidingPaneLayout");
            this.f12082wkgbmnqykc = slidingPaneLayout;
            slidingPaneLayout.iobyxmoadg(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.eablkybsjg
        public void iobyxmoadg(View panel) {
            zdlpuopuiu.btonecajqb(panel, "panel");
            wflxmlrfwp(true);
        }

        @Override // androidx.activity.jyumaefscl
        public void lqeggnwhkg() {
            this.f12082wkgbmnqykc.zoijcleaow();
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

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ SlidingPaneLayout f12084zoijcleaow;

        public zoijcleaow(SlidingPaneLayout slidingPaneLayout) {
            this.f12084zoijcleaow = slidingPaneLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
            zdlpuopuiu.gtknphoqwx(view, "view");
            view.removeOnLayoutChangeListener(this);
            jyumaefscl jyumaefsclVar = AbstractListDetailFragment.this.onBackPressedCallback;
            zdlpuopuiu.lqeggnwhkg(jyumaefsclVar);
            jyumaefsclVar.wflxmlrfwp(this.f12084zoijcleaow.wflxmlrfwp() && this.f12084zoijcleaow.draadjrbmk());
        }
    }

    public NavHostFragment iozdgvuglv() {
        int i13 = this.graphId;
        return i13 != 0 ? NavHostFragment.Companion.zoijcleaow(NavHostFragment.INSTANCE, i13, null, 2, null) : new NavHostFragment();
    }

    public abstract View lmojexxdyd(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NavHostFragment navHostFragmentIozdgvuglv;
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        if (savedInstanceState != null) {
            this.graphId = savedInstanceState.getInt("android-support-nav:fragment:graphId");
        }
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(gxszxtbevo.sliding_pane_layout);
        View viewLmojexxdyd = lmojexxdyd(inflater, slidingPaneLayout, savedInstanceState);
        if (!zdlpuopuiu.eablkybsjg(viewLmojexxdyd, slidingPaneLayout) && !zdlpuopuiu.eablkybsjg(viewLmojexxdyd.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewLmojexxdyd);
        }
        Context context = inflater.getContext();
        zdlpuopuiu.dxjokdxxww(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(gxszxtbevo.sliding_pane_detail_container);
        SlidingPaneLayout.wkgbmnqykc wkgbmnqykcVar = new SlidingPaneLayout.wkgbmnqykc(inflater.getContext().getResources().getDimensionPixelSize(eablkybsjg.sliding_pane_detail_pane_width), -1);
        wkgbmnqykcVar.f13304iobyxmoadg = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, wkgbmnqykcVar);
        Fragment fragmentZfvoamnweg = getChildFragmentManager().zfvoamnweg(gxszxtbevo.sliding_pane_detail_container);
        if (fragmentZfvoamnweg != null) {
            navHostFragmentIozdgvuglv = (NavHostFragment) fragmentZfvoamnweg;
        } else {
            navHostFragmentIozdgvuglv = iozdgvuglv();
            FragmentManager childFragmentManager = getChildFragmentManager();
            zdlpuopuiu.dxjokdxxww(childFragmentManager, "childFragmentManager");
            jpowsppfya jpowsppfyaVarKcexrzcfyt = childFragmentManager.kcexrzcfyt();
            zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction()");
            jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
            jpowsppfyaVarKcexrzcfyt.zoijcleaow(gxszxtbevo.sliding_pane_detail_container, navHostFragmentIozdgvuglv);
            jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
        }
        this._detailPaneNavHostFragment = navHostFragmentIozdgvuglv;
        this.onBackPressedCallback = new iobyxmoadg(slidingPaneLayout);
        if (!jhduphickx.tzroggbefp(slidingPaneLayout) || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new zoijcleaow(slidingPaneLayout));
        } else {
            jyumaefscl jyumaefsclVar = this.onBackPressedCallback;
            zdlpuopuiu.lqeggnwhkg(jyumaefsclVar);
            jyumaefsclVar.wflxmlrfwp(slidingPaneLayout.wflxmlrfwp() && slidingPaneLayout.draadjrbmk());
        }
        iwizpuwonk onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "viewLifecycleOwner");
        jyumaefscl jyumaefsclVar2 = this.onBackPressedCallback;
        zdlpuopuiu.lqeggnwhkg(jyumaefsclVar2);
        onBackPressedDispatcher.dxjokdxxww(viewLifecycleOwner, jyumaefsclVar2);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(attrs, "attrs");
        super.onInflate(context, attrs, savedInstanceState);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, rgvfuqvkyq.NavHost);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(rgvfuqvkyq.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        zdlpuopuiu.btonecajqb(outState, "outState");
        super.onSaveInstanceState(outState);
        int i13 = this.graphId;
        if (i13 != 0) {
            outState.putInt("android-support-nav:fragment:graphId", i13);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View listPaneView = yadqdtsiqt().getChildAt(0);
        zdlpuopuiu.dxjokdxxww(listPaneView, "listPaneView");
        wwaezpbzkn(listPaneView, savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        jyumaefscl jyumaefsclVar = this.onBackPressedCallback;
        zdlpuopuiu.lqeggnwhkg(jyumaefsclVar);
        jyumaefsclVar.wflxmlrfwp(yadqdtsiqt().wflxmlrfwp() && yadqdtsiqt().draadjrbmk());
    }

    public void wwaezpbzkn(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
    }

    public final SlidingPaneLayout yadqdtsiqt() {
        View viewRequireView = requireView();
        zdlpuopuiu.nufgyqmvbu(viewRequireView, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout");
        return (SlidingPaneLayout) viewRequireView;
    }
}
