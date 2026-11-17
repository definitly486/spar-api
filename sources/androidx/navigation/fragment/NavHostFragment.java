package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.jlmebxxoox;
import androidx.navigation.agtfadlqog;
import androidx.navigation.ojitshcjhn;
import gg.cqumvgiudr;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import h5.nufgyqmvbu;
import h5.rgvfuqvkyq;
import j5.lqeggnwhkg;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import q5.gxszxtbevo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0004R\u001b\u0010\u000f\u001a\u00020\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lgg/wwaezpbzkn;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lh5/nufgyqmvbu;", "navHostController", "pkzmftpjix", "(Lh5/nufgyqmvbu;)V", "Landroidx/navigation/wkgbmnqykc;", "navController", "ylkuphrtab", "(Landroidx/navigation/wkgbmnqykc;)V", "Landroidx/navigation/agtfadlqog;", "Landroidx/navigation/fragment/iobyxmoadg$ppxfxbqfkf;", "iozdgvuglv", "()Landroidx/navigation/agtfadlqog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "attrs", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onDestroyView", "zdlpuopuiu", "Lgg/gtknphoqwx;", "wwaezpbzkn", "()Lh5/nufgyqmvbu;", "yggfygwlhe", "Landroid/view/View;", "viewParent", "", "jyumaefscl", "I", "graphId", "", "iwizpuwonk", "Z", "defaultNavHost", "lmojexxdyd", "()I", "containerId", "cqumvgiudr", "iobyxmoadg", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class NavHostFragment extends Fragment {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private boolean defaultNavHost;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private int graphId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private View viewParent;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx navHostController = draadjrbmk.zoijcleaow(new zoijcleaow());

    /* JADX INFO: renamed from: androidx.navigation.fragment.NavHostFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ NavHostFragment zoijcleaow(Companion companion, int i13, Bundle bundle, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                bundle = null;
            }
            return companion.iobyxmoadg(i13, bundle);
        }

        public final NavHostFragment iobyxmoadg(int i13, Bundle bundle) {
            Bundle bundle2;
            if (i13 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt("android-support-nav:fragment:graphId", i13);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle("android-support-nav:fragment:startDestinationArgs", bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }

        private Companion() {
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {
        zoijcleaow() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bundle agtfadlqog(nufgyqmvbu this_apply) {
            zdlpuopuiu.btonecajqb(this_apply, "$this_apply");
            Bundle bundleXrmfcynszj = this_apply.xrmfcynszj();
            if (bundleXrmfcynszj != null) {
                return bundleXrmfcynszj;
            }
            Bundle EMPTY = Bundle.EMPTY;
            zdlpuopuiu.dxjokdxxww(EMPTY, "EMPTY");
            return EMPTY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bundle ojitshcjhn(NavHostFragment this$0) {
            zdlpuopuiu.btonecajqb(this$0, "this$0");
            if (this$0.graphId != 0) {
                return q1.ppxfxbqfkf.zoijcleaow(cqumvgiudr.iobyxmoadg("android-support-nav:fragment:graphId", Integer.valueOf(this$0.graphId)));
            }
            Bundle bundle = Bundle.EMPTY;
            zdlpuopuiu.dxjokdxxww(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public final nufgyqmvbu invoke() {
            Context context = NavHostFragment.this.getContext();
            if (context == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            }
            zdlpuopuiu.dxjokdxxww(context, "checkNotNull(context) {\n…s attached\"\n            }");
            final nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(context);
            final NavHostFragment navHostFragment = NavHostFragment.this;
            nufgyqmvbuVar.uwvvkdfqfp(navHostFragment);
            jlmebxxoox viewModelStore = navHostFragment.getViewModelStore();
            zdlpuopuiu.dxjokdxxww(viewModelStore, "viewModelStore");
            nufgyqmvbuVar.yfnezrywwk(viewModelStore);
            navHostFragment.pkzmftpjix(nufgyqmvbuVar);
            Bundle bundleIobyxmoadg = navHostFragment.getSavedStateRegistry().iobyxmoadg("android-support-nav:fragment:navControllerState");
            if (bundleIobyxmoadg != null) {
                nufgyqmvbuVar.okpsazkaxt(bundleIobyxmoadg);
            }
            navHostFragment.getSavedStateRegistry().ppxfxbqfkf("android-support-nav:fragment:navControllerState", new gxszxtbevo.zoijcleaow() { // from class: androidx.navigation.fragment.ppxfxbqfkf
                @Override // q5.gxszxtbevo.zoijcleaow
                public final Bundle iobyxmoadg() {
                    return NavHostFragment.zoijcleaow.agtfadlqog(nufgyqmvbuVar);
                }
            });
            Bundle bundleIobyxmoadg2 = navHostFragment.getSavedStateRegistry().iobyxmoadg("android-support-nav:fragment:graphId");
            if (bundleIobyxmoadg2 != null) {
                navHostFragment.graphId = bundleIobyxmoadg2.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.getSavedStateRegistry().ppxfxbqfkf("android-support-nav:fragment:graphId", new gxszxtbevo.zoijcleaow() { // from class: androidx.navigation.fragment.wkgbmnqykc
                @Override // q5.gxszxtbevo.zoijcleaow
                public final Bundle iobyxmoadg() {
                    return NavHostFragment.zoijcleaow.ojitshcjhn(navHostFragment);
                }
            });
            if (navHostFragment.graphId != 0) {
                nufgyqmvbuVar.metgxyhuhe(navHostFragment.graphId);
            } else {
                Bundle arguments = navHostFragment.getArguments();
                int i13 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                if (i13 != 0) {
                    nufgyqmvbuVar.rlfsiqarku(i13, bundle);
                }
            }
            return nufgyqmvbuVar;
        }
    }

    private final int lmojexxdyd() {
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? j5.gxszxtbevo.nav_host_fragment_container : id2;
    }

    protected agtfadlqog iozdgvuglv() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "childFragmentManager");
        return new iobyxmoadg(contextRequireContext, childFragmentManager, lmojexxdyd());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().kcexrzcfyt().jyumaefscl(this).dxjokdxxww();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        wwaezpbzkn();
        if (savedInstanceState != null && savedInstanceState.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.defaultNavHost = true;
            getParentFragmentManager().kcexrzcfyt().jyumaefscl(this).dxjokdxxww();
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        Context context = inflater.getContext();
        zdlpuopuiu.dxjokdxxww(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(lmojexxdyd());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && h5.draadjrbmk.zoijcleaow(view) == wwaezpbzkn()) {
            h5.draadjrbmk.eablkybsjg(view, null);
        }
        this.viewParent = null;
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
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, lqeggnwhkg.NavHostFragment);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(lqeggnwhkg.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        zdlpuopuiu.btonecajqb(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.defaultNavHost) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        h5.draadjrbmk.eablkybsjg(view, wwaezpbzkn());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            zdlpuopuiu.nufgyqmvbu(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.viewParent = view2;
            zdlpuopuiu.lqeggnwhkg(view2);
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                zdlpuopuiu.lqeggnwhkg(view3);
                h5.draadjrbmk.eablkybsjg(view3, wwaezpbzkn());
            }
        }
    }

    protected void pkzmftpjix(nufgyqmvbu navHostController) {
        zdlpuopuiu.btonecajqb(navHostController, "navHostController");
        ylkuphrtab(navHostController);
    }

    public final nufgyqmvbu wwaezpbzkn() {
        return (nufgyqmvbu) this.navHostController.getValue();
    }

    protected void ylkuphrtab(androidx.navigation.wkgbmnqykc navController) {
        zdlpuopuiu.btonecajqb(navController, "navController");
        ojitshcjhn ojitshcjhnVarWwaezpbzkn = navController.wwaezpbzkn();
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "childFragmentManager");
        ojitshcjhnVarWwaezpbzkn.zoijcleaow(new j5.zoijcleaow(contextRequireContext, childFragmentManager));
        navController.wwaezpbzkn().zoijcleaow(iozdgvuglv());
    }
}
