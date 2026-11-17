package j5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.wwaezpbzkn;
import androidx.lifecycle.vdvldrhtss;
import androidx.navigation.agtfadlqog;
import h5.wflxmlrfwp;
import hg.jyumaefscl;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@agtfadlqog.zoijcleaow("dialog")
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006*\u00012\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\"\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0015058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00106¨\u0006;"}, d2 = {"Lj5/zoijcleaow;", "Landroidx/navigation/agtfadlqog;", "Lj5/zoijcleaow$zoijcleaow;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "", "popUpToIndex", "Landroidx/navigation/ppxfxbqfkf;", "popUpTo", "", "savedState", "Lgg/wwaezpbzkn;", "kcexrzcfyt", "(ILandroidx/navigation/ppxfxbqfkf;Z)V", "entry", "vdvldrhtss", "(Landroidx/navigation/ppxfxbqfkf;)V", "Landroidx/fragment/app/DialogFragment;", "rgvfuqvkyq", "(Landroidx/navigation/ppxfxbqfkf;)Landroidx/fragment/app/DialogFragment;", "btonecajqb", "(Landroidx/navigation/ppxfxbqfkf;Z)V", "ojitshcjhn", "()Lj5/zoijcleaow$zoijcleaow;", "", "entries", "Landroidx/navigation/gtknphoqwx;", "navOptions", "Landroidx/navigation/agtfadlqog$iobyxmoadg;", "navigatorExtras", "eablkybsjg", "(Ljava/util/List;Landroidx/navigation/gtknphoqwx;Landroidx/navigation/agtfadlqog$iobyxmoadg;)V", "backStackEntry", "lqeggnwhkg", "Lh5/wflxmlrfwp;", "state", "gxszxtbevo", "(Lh5/wflxmlrfwp;)V", "ppxfxbqfkf", "Landroid/content/Context;", "wkgbmnqykc", "Landroidx/fragment/app/FragmentManager;", "", "", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "j5/zoijcleaow$ppxfxbqfkf", "Lj5/zoijcleaow$ppxfxbqfkf;", "observer", "", "Ljava/util/Map;", "transitioningFragments", "nufgyqmvbu", "iobyxmoadg", "zoijcleaow", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zoijcleaow extends agtfadlqog {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final iobyxmoadg f50737nufgyqmvbu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final Set restoredTagsAwaitingAttach;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final ppxfxbqfkf observer;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final Map transitioningFragments;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements androidx.lifecycle.agtfadlqog {

        public /* synthetic */ class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f50744iobyxmoadg;

            static {
                int[] iArr = new int[androidx.lifecycle.gtknphoqwx.iobyxmoadg.values().length];
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f50744iobyxmoadg = iArr;
            }
        }

        ppxfxbqfkf() {
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(vdvldrhtss source, androidx.lifecycle.gtknphoqwx.iobyxmoadg event) {
            int iNextIndex;
            zdlpuopuiu.btonecajqb(source, "source");
            zdlpuopuiu.btonecajqb(event, "event");
            int i13 = iobyxmoadg.f50744iobyxmoadg[event.ordinal()];
            if (i13 == 1) {
                DialogFragment dialogFragment = (DialogFragment) source;
                Iterable iterable = (Iterable) zoijcleaow.this.zoijcleaow().zoijcleaow().getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) it.next()).gxszxtbevo(), dialogFragment.getTag())) {
                            return;
                        }
                    }
                }
                dialogFragment.dismiss();
                return;
            }
            Object obj = null;
            if (i13 == 2) {
                DialogFragment dialogFragment2 = (DialogFragment) source;
                for (Object obj2 : (Iterable) zoijcleaow.this.zoijcleaow().ppxfxbqfkf().getValue()) {
                    if (zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) obj2).gxszxtbevo(), dialogFragment2.getTag())) {
                        obj = obj2;
                    }
                }
                androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) obj;
                if (ppxfxbqfkfVar != null) {
                    zoijcleaow.this.zoijcleaow().eablkybsjg(ppxfxbqfkfVar);
                    return;
                }
                return;
            }
            if (i13 != 3) {
                if (i13 != 4) {
                    return;
                }
                DialogFragment dialogFragment3 = (DialogFragment) source;
                for (Object obj3 : (Iterable) zoijcleaow.this.zoijcleaow().ppxfxbqfkf().getValue()) {
                    if (zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) obj3).gxszxtbevo(), dialogFragment3.getTag())) {
                        obj = obj3;
                    }
                }
                androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar2 = (androidx.navigation.ppxfxbqfkf) obj;
                if (ppxfxbqfkfVar2 != null) {
                    zoijcleaow.this.zoijcleaow().eablkybsjg(ppxfxbqfkfVar2);
                }
                dialogFragment3.getLifecycle().wkgbmnqykc(this);
                return;
            }
            DialogFragment dialogFragment4 = (DialogFragment) source;
            if (dialogFragment4.requireDialog().isShowing()) {
                return;
            }
            List list = (List) zoijcleaow.this.zoijcleaow().zoijcleaow().getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) listIterator.previous()).gxszxtbevo(), dialogFragment4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar3 = (androidx.navigation.ppxfxbqfkf) jyumaefscl.lrnfpwlwnk(list, iNextIndex);
            if (!zdlpuopuiu.eablkybsjg(jyumaefscl.lxfrhoxuzk(list), ppxfxbqfkfVar3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (ppxfxbqfkfVar3 != null) {
                zoijcleaow.this.kcexrzcfyt(iNextIndex, ppxfxbqfkfVar3, false);
            }
        }
    }

    /* JADX INFO: renamed from: j5.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static class C1090zoijcleaow extends androidx.navigation.lqeggnwhkg implements h5.ppxfxbqfkf {

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private String f50745iozdgvuglv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1090zoijcleaow(agtfadlqog fragmentNavigator) {
            super(fragmentNavigator);
            zdlpuopuiu.btonecajqb(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.lqeggnwhkg
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C1090zoijcleaow)) {
                return false;
            }
            return super.equals(obj) && zdlpuopuiu.eablkybsjg(this.f50745iozdgvuglv, ((C1090zoijcleaow) obj).f50745iozdgvuglv);
        }

        @Override // androidx.navigation.lqeggnwhkg
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f50745iozdgvuglv;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.lqeggnwhkg
        public void kcexrzcfyt(Context context, AttributeSet attrs) {
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(attrs, "attrs");
            super.kcexrzcfyt(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, lqeggnwhkg.DialogFragmentNavigator);
            zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(lqeggnwhkg.DialogFragmentNavigator_android_name);
            if (string != null) {
                pmvmpeiblj(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String lereixgezr() {
            String str = this.f50745iozdgvuglv;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            zdlpuopuiu.nufgyqmvbu(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        public final C1090zoijcleaow pmvmpeiblj(String className) {
            zdlpuopuiu.btonecajqb(className, "className");
            this.f50745iozdgvuglv = className;
            return this;
        }
    }

    public zoijcleaow(Context context, FragmentManager fragmentManager) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new ppxfxbqfkf();
        this.transitioningFragments = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kcexrzcfyt(int popUpToIndex, androidx.navigation.ppxfxbqfkf popUpTo, boolean savedState) {
        androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) jyumaefscl.lrnfpwlwnk((List) zoijcleaow().zoijcleaow().getValue(), popUpToIndex - 1);
        boolean zXrmfcynszj = jyumaefscl.xrmfcynszj((Iterable) zoijcleaow().ppxfxbqfkf().getValue(), ppxfxbqfkfVar);
        zoijcleaow().dxjokdxxww(popUpTo, savedState);
        if (ppxfxbqfkfVar == null || zXrmfcynszj) {
            return;
        }
        zoijcleaow().eablkybsjg(ppxfxbqfkfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(zoijcleaow this$0, FragmentManager fragmentManager, Fragment childFragment) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(fragmentManager, "<anonymous parameter 0>");
        zdlpuopuiu.btonecajqb(childFragment, "childFragment");
        Set set = this$0.restoredTagsAwaitingAttach;
        if (mbcevpiqjq.iobyxmoadg(set).remove(childFragment.getTag())) {
            childFragment.getLifecycle().iobyxmoadg(this$0.observer);
        }
        Map map = this$0.transitioningFragments;
        mbcevpiqjq.ppxfxbqfkf(map).remove(childFragment.getTag());
    }

    private final DialogFragment rgvfuqvkyq(androidx.navigation.ppxfxbqfkf entry) {
        androidx.navigation.lqeggnwhkg lqeggnwhkgVarEablkybsjg = entry.eablkybsjg();
        zdlpuopuiu.nufgyqmvbu(lqeggnwhkgVarEablkybsjg, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C1090zoijcleaow c1090zoijcleaow = (C1090zoijcleaow) lqeggnwhkgVarEablkybsjg;
        String strLereixgezr = c1090zoijcleaow.lereixgezr();
        if (strLereixgezr.charAt(0) == '.') {
            strLereixgezr = this.context.getPackageName() + strLereixgezr;
        }
        Fragment fragmentIobyxmoadg = this.fragmentManager.dvvnrvtcbc().iobyxmoadg(this.context.getClassLoader(), strLereixgezr);
        zdlpuopuiu.dxjokdxxww(fragmentIobyxmoadg, "fragmentManager.fragment…t.classLoader, className)");
        if (DialogFragment.class.isAssignableFrom(fragmentIobyxmoadg.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) fragmentIobyxmoadg;
            dialogFragment.setArguments(entry.ppxfxbqfkf());
            dialogFragment.getLifecycle().iobyxmoadg(this.observer);
            this.transitioningFragments.put(entry.gxszxtbevo(), dialogFragment);
            return dialogFragment;
        }
        throw new IllegalArgumentException(("Dialog destination " + c1090zoijcleaow.lereixgezr() + " is not an instance of DialogFragment").toString());
    }

    private final void vdvldrhtss(androidx.navigation.ppxfxbqfkf entry) {
        rgvfuqvkyq(entry).show(this.fragmentManager, entry.gxszxtbevo());
        androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) jyumaefscl.lxfrhoxuzk((List) zoijcleaow().zoijcleaow().getValue());
        boolean zXrmfcynszj = jyumaefscl.xrmfcynszj((Iterable) zoijcleaow().ppxfxbqfkf().getValue(), ppxfxbqfkfVar);
        zoijcleaow().draadjrbmk(entry);
        if (ppxfxbqfkfVar == null || zXrmfcynszj) {
            return;
        }
        zoijcleaow().eablkybsjg(ppxfxbqfkfVar);
    }

    @Override // androidx.navigation.agtfadlqog
    public void btonecajqb(androidx.navigation.ppxfxbqfkf popUpTo, boolean savedState) {
        zdlpuopuiu.btonecajqb(popUpTo, "popUpTo");
        if (this.fragmentManager.d()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) zoijcleaow().zoijcleaow().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        Iterator it = jyumaefscl.ezmngbhpjk(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentOipsdeybqn = this.fragmentManager.oipsdeybqn(((androidx.navigation.ppxfxbqfkf) it.next()).gxszxtbevo());
            if (fragmentOipsdeybqn != null) {
                ((DialogFragment) fragmentOipsdeybqn).dismiss();
            }
        }
        kcexrzcfyt(iIndexOf, popUpTo, savedState);
    }

    @Override // androidx.navigation.agtfadlqog
    public void eablkybsjg(List entries, androidx.navigation.gtknphoqwx navOptions, agtfadlqog.iobyxmoadg navigatorExtras) {
        zdlpuopuiu.btonecajqb(entries, "entries");
        if (this.fragmentManager.d()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            vdvldrhtss((androidx.navigation.ppxfxbqfkf) it.next());
        }
    }

    @Override // androidx.navigation.agtfadlqog
    public void gxszxtbevo(wflxmlrfwp state) {
        androidx.lifecycle.gtknphoqwx lifecycle;
        zdlpuopuiu.btonecajqb(state, "state");
        super.gxszxtbevo(state);
        for (androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar : (List) state.zoijcleaow().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.fragmentManager.oipsdeybqn(ppxfxbqfkfVar.gxszxtbevo());
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(ppxfxbqfkfVar.gxszxtbevo());
            } else {
                lifecycle.iobyxmoadg(this.observer);
            }
        }
        this.fragmentManager.wflxmlrfwp(new wwaezpbzkn() { // from class: j5.iobyxmoadg
            @Override // androidx.fragment.app.wwaezpbzkn
            public final void iobyxmoadg(FragmentManager fragmentManager, Fragment fragment) {
                zoijcleaow.oxmwwwfdhm(this.f50733zdlpuopuiu, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.agtfadlqog
    public void lqeggnwhkg(androidx.navigation.ppxfxbqfkf backStackEntry) {
        zdlpuopuiu.btonecajqb(backStackEntry, "backStackEntry");
        if (this.fragmentManager.d()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogFragment dialogFragment = (DialogFragment) this.transitioningFragments.get(backStackEntry.gxszxtbevo());
        if (dialogFragment == null) {
            Fragment fragmentOipsdeybqn = this.fragmentManager.oipsdeybqn(backStackEntry.gxszxtbevo());
            dialogFragment = fragmentOipsdeybqn instanceof DialogFragment ? (DialogFragment) fragmentOipsdeybqn : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().wkgbmnqykc(this.observer);
            dialogFragment.dismiss();
        }
        rgvfuqvkyq(backStackEntry).show(this.fragmentManager, backStackEntry.gxszxtbevo());
        zoijcleaow().lqeggnwhkg(backStackEntry);
    }

    @Override // androidx.navigation.agtfadlqog
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public C1090zoijcleaow iobyxmoadg() {
        return new C1090zoijcleaow(this);
    }
}
