package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements gxszxtbevo.ppxfxbqfkf, gxszxtbevo.iobyxmoadg, gxszxtbevo.zoijcleaow, DialogPreference.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f12430cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f12432iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    RecyclerView f12433jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Runnable f12434lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private gxszxtbevo f12436yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f12437zdlpuopuiu = new ppxfxbqfkf();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f12431esjtqupxsv = agtfadlqog.preference_list_fragment;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final Handler f12435pmvmpeiblj = new iobyxmoadg(Looper.getMainLooper());

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Runnable f12438zynmafqrjb = new zoijcleaow();

    class iobyxmoadg extends Handler {
        iobyxmoadg(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat.this.cdpycssgdh();
        }
    }

    private class ppxfxbqfkf extends RecyclerView.ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Drawable f12440iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f12441ppxfxbqfkf = true;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f12443zoijcleaow;

        ppxfxbqfkf() {
        }

        private boolean dxjokdxxww(View view, RecyclerView recyclerView) {
            RecyclerView.iozdgvuglv iozdgvuglvVarSflfametgt = recyclerView.sflfametgt(view);
            boolean z13 = false;
            if (!(iozdgvuglvVarSflfametgt instanceof nufgyqmvbu) || !((nufgyqmvbu) iozdgvuglvVarSflfametgt).wkgbmnqykc()) {
                return false;
            }
            boolean z14 = this.f12441ppxfxbqfkf;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z14;
            }
            RecyclerView.iozdgvuglv iozdgvuglvVarSflfametgt2 = recyclerView.sflfametgt(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((iozdgvuglvVarSflfametgt2 instanceof nufgyqmvbu) && ((nufgyqmvbu) iozdgvuglvVarSflfametgt2).ppxfxbqfkf()) {
                z13 = true;
            }
            return z13;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
            if (dxjokdxxww(view, recyclerView)) {
                rect.bottom = this.f12443zoijcleaow;
            }
        }

        public void gxszxtbevo(boolean z13) {
            this.f12441ppxfxbqfkf = z13;
        }

        public void lqeggnwhkg(Drawable drawable) {
            if (drawable != null) {
                this.f12443zoijcleaow = drawable.getIntrinsicHeight();
            } else {
                this.f12443zoijcleaow = 0;
            }
            this.f12440iobyxmoadg = drawable;
            PreferenceFragmentCompat.this.f12433jyumaefscl.skhdrjzrfn();
        }

        public void nufgyqmvbu(int i13) {
            this.f12443zoijcleaow = i13;
            PreferenceFragmentCompat.this.f12433jyumaefscl.skhdrjzrfn();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
            if (this.f12440iobyxmoadg == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = recyclerView.getChildAt(i13);
                if (dxjokdxxww(childAt, recyclerView)) {
                    int y13 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f12440iobyxmoadg.setBounds(0, y13, width, this.f12443zoijcleaow + y13);
                    this.f12440iobyxmoadg.draw(canvas);
                }
            }
        }
    }

    public interface wkgbmnqykc {
        boolean vdvldrhtss(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.f12433jyumaefscl;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    private void wypolnanlu() {
        iozdgvuglv().setAdapter(null);
        PreferenceScreen preferenceScreenLmojexxdyd = lmojexxdyd();
        if (preferenceScreenLmojexxdyd != null) {
            preferenceScreenLmojexxdyd.cllcsxoeiz();
        }
        hkdspvbjdz();
    }

    void cdpycssgdh() {
        PreferenceScreen preferenceScreenLmojexxdyd = lmojexxdyd();
        if (preferenceScreenLmojexxdyd != null) {
            iozdgvuglv().setAdapter(ylkuphrtab(preferenceScreenLmojexxdyd));
            preferenceScreenLmojexxdyd.pkzmftpjix();
        }
        wwaezpbzkn();
    }

    public void cllcsxoeiz(Drawable drawable) {
        this.f12437zdlpuopuiu.lqeggnwhkg(drawable);
    }

    @Override // androidx.preference.gxszxtbevo.zoijcleaow
    public void draadjrbmk(PreferenceScreen preferenceScreen) {
        yadqdtsiqt();
        for (Fragment parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
        }
        getContext();
        getActivity();
    }

    public void dsvhmnatus(int i13) {
        this.f12437zdlpuopuiu.nufgyqmvbu(i13);
    }

    public abstract void hcddaimhww(Bundle bundle, String str);

    protected void hkdspvbjdz() {
    }

    public final RecyclerView iozdgvuglv() {
        return this.f12433jyumaefscl;
    }

    public RecyclerView jpowsppfya(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(draadjrbmk.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(agtfadlqog.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(pkzmftpjix());
        recyclerView2.setAccessibilityDelegateCompat(new lqeggnwhkg(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.preference.gxszxtbevo.iobyxmoadg
    public void kcexrzcfyt(Preference preference) {
        DialogFragment dialogFragmentDsvhmnatus;
        yadqdtsiqt();
        for (Fragment parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
        }
        getContext();
        getActivity();
        if (getParentFragmentManager().oipsdeybqn("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            dialogFragmentDsvhmnatus = EditTextPreferenceDialogFragmentCompat.wypolnanlu(preference.wflxmlrfwp());
        } else if (preference instanceof ListPreference) {
            dialogFragmentDsvhmnatus = ListPreferenceDialogFragmentCompat.dsvhmnatus(preference.wflxmlrfwp());
        } else {
            if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            dialogFragmentDsvhmnatus = MultiSelectListPreferenceDialogFragmentCompat.dsvhmnatus(preference.wflxmlrfwp());
        }
        dialogFragmentDsvhmnatus.setTargetFragment(this, 0);
        dialogFragmentDsvhmnatus.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    public PreferenceScreen lmojexxdyd() {
        return this.f12436yggfygwlhe.nufgyqmvbu();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(dxjokdxxww.preferenceTheme, typedValue, true);
        int i13 = typedValue.resourceId;
        if (i13 == 0) {
            i13 = rgvfuqvkyq.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i13, false);
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(requireContext());
        this.f12436yggfygwlhe = gxszxtbevoVar;
        gxszxtbevoVar.gtknphoqwx(this);
        hcddaimhww(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, vdvldrhtss.PreferenceFragmentCompat, dxjokdxxww.preferenceFragmentCompatStyle, 0);
        this.f12431esjtqupxsv = typedArrayObtainStyledAttributes.getResourceId(vdvldrhtss.PreferenceFragmentCompat_android_layout, this.f12431esjtqupxsv);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(vdvldrhtss.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(vdvldrhtss.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(vdvldrhtss.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f12431esjtqupxsv, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewJpowsppfya = jpowsppfya(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewJpowsppfya == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f12433jyumaefscl = recyclerViewJpowsppfya;
        recyclerViewJpowsppfya.btonecajqb(this.f12437zdlpuopuiu);
        cllcsxoeiz(drawable);
        if (dimensionPixelSize != -1) {
            dsvhmnatus(dimensionPixelSize);
        }
        this.f12437zdlpuopuiu.gxszxtbevo(z13);
        if (this.f12433jyumaefscl.getParent() == null) {
            viewGroup2.addView(this.f12433jyumaefscl);
        }
        this.f12435pmvmpeiblj.post(this.f12438zynmafqrjb);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f12435pmvmpeiblj.removeCallbacks(this.f12438zynmafqrjb);
        this.f12435pmvmpeiblj.removeMessages(1);
        if (this.f12432iwizpuwonk) {
            wypolnanlu();
        }
        this.f12433jyumaefscl = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenLmojexxdyd = lmojexxdyd();
        if (preferenceScreenLmojexxdyd != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenLmojexxdyd.ikoacuggdj(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f12436yggfygwlhe.draadjrbmk(this);
        this.f12436yggfygwlhe.btonecajqb(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f12436yggfygwlhe.draadjrbmk(null);
        this.f12436yggfygwlhe.btonecajqb(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenLmojexxdyd;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenLmojexxdyd = lmojexxdyd()) != null) {
            preferenceScreenLmojexxdyd.jhduphickx(bundle2);
        }
        if (this.f12432iwizpuwonk) {
            cdpycssgdh();
            Runnable runnable = this.f12434lereixgezr;
            if (runnable != null) {
                runnable.run();
                this.f12434lereixgezr = null;
            }
        }
        this.f12430cqumvgiudr = true;
    }

    public RecyclerView.rgvfuqvkyq pkzmftpjix() {
        return new LinearLayoutManager(requireContext());
    }

    @Override // androidx.preference.DialogPreference.iobyxmoadg
    public Preference rgvfuqvkyq(CharSequence charSequence) {
        gxszxtbevo gxszxtbevoVar = this.f12436yggfygwlhe;
        if (gxszxtbevoVar == null) {
            return null;
        }
        return gxszxtbevoVar.iobyxmoadg(charSequence);
    }

    protected void wwaezpbzkn() {
    }

    public Fragment yadqdtsiqt() {
        return null;
    }

    protected RecyclerView.nufgyqmvbu ylkuphrtab(PreferenceScreen preferenceScreen) {
        return new androidx.preference.wkgbmnqykc(preferenceScreen);
    }

    @Override // androidx.preference.gxszxtbevo.ppxfxbqfkf
    public boolean zdlpuopuiu(Preference preference) {
        if (preference.btonecajqb() == null) {
            return false;
        }
        boolean zVdvldrhtss = yadqdtsiqt() instanceof wkgbmnqykc ? ((wkgbmnqykc) yadqdtsiqt()).vdvldrhtss(this, preference) : false;
        for (Fragment parentFragment = this; !zVdvldrhtss && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof wkgbmnqykc) {
                zVdvldrhtss = ((wkgbmnqykc) parentFragment).vdvldrhtss(this, preference);
            }
        }
        if (!zVdvldrhtss && (getContext() instanceof wkgbmnqykc)) {
            zVdvldrhtss = ((wkgbmnqykc) getContext()).vdvldrhtss(this, preference);
        }
        if (!zVdvldrhtss && (getActivity() instanceof wkgbmnqykc)) {
            zVdvldrhtss = ((wkgbmnqykc) getActivity()).vdvldrhtss(this, preference);
        }
        if (zVdvldrhtss) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundleNufgyqmvbu = preference.nufgyqmvbu();
        Fragment fragmentIobyxmoadg = parentFragmentManager.dvvnrvtcbc().iobyxmoadg(requireActivity().getClassLoader(), preference.btonecajqb());
        fragmentIobyxmoadg.setArguments(bundleNufgyqmvbu);
        fragmentIobyxmoadg.setTargetFragment(this, 0);
        parentFragmentManager.kcexrzcfyt().vdvldrhtss(((View) requireView().getParent()).getId(), fragmentIobyxmoadg).nufgyqmvbu(null).dxjokdxxww();
        return true;
    }
}
