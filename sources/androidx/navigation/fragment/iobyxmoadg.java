package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jpowsppfya;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.rgvfuqvkyq;
import androidx.lifecycle.zynmafqrjb;
import androidx.navigation.agtfadlqog;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import h5.wflxmlrfwp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
@agtfadlqog.zoijcleaow("fragment")
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003QR=B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J1\u00103\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010,\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010CR,\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0F0E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010LR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020K0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010O¨\u0006S"}, d2 = {"Landroidx/navigation/fragment/iobyxmoadg;", "Landroidx/navigation/agtfadlqog;", "Landroidx/navigation/fragment/iobyxmoadg$ppxfxbqfkf;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "level", "", "esjtqupxsv", "(I)Z", "Landroidx/navigation/ppxfxbqfkf;", "entry", "Landroidx/fragment/app/Fragment;", "fragment", "Lgg/wwaezpbzkn;", "zdlpuopuiu", "(Landroidx/navigation/ppxfxbqfkf;Landroidx/fragment/app/Fragment;)V", "Landroidx/navigation/gtknphoqwx;", "navOptions", "Landroidx/navigation/agtfadlqog$iobyxmoadg;", "navigatorExtras", "lereixgezr", "(Landroidx/navigation/ppxfxbqfkf;Landroidx/navigation/gtknphoqwx;Landroidx/navigation/agtfadlqog$iobyxmoadg;)V", "Landroidx/fragment/app/jpowsppfya;", "jyumaefscl", "(Landroidx/navigation/ppxfxbqfkf;Landroidx/navigation/gtknphoqwx;)Landroidx/fragment/app/jpowsppfya;", "", "id", "isPop", "deduplicate", "vdvldrhtss", "(Ljava/lang/String;ZZ)V", "Lh5/wflxmlrfwp;", "state", "gxszxtbevo", "(Lh5/wflxmlrfwp;)V", "kcexrzcfyt", "(Landroidx/fragment/app/Fragment;Landroidx/navigation/ppxfxbqfkf;Lh5/wflxmlrfwp;)V", "popUpTo", "savedState", "btonecajqb", "(Landroidx/navigation/ppxfxbqfkf;Z)V", "yggfygwlhe", "()Landroidx/navigation/fragment/iobyxmoadg$ppxfxbqfkf;", "", "entries", "eablkybsjg", "(Ljava/util/List;Landroidx/navigation/gtknphoqwx;Landroidx/navigation/agtfadlqog$iobyxmoadg;)V", "backStackEntry", "lqeggnwhkg", "(Landroidx/navigation/ppxfxbqfkf;)V", "Landroid/os/Bundle;", "dxjokdxxww", "()Landroid/os/Bundle;", "nufgyqmvbu", "(Landroid/os/Bundle;)V", "ppxfxbqfkf", "Landroid/content/Context;", "wkgbmnqykc", "Landroidx/fragment/app/FragmentManager;", "I", "", "Ljava/util/Set;", "savedIds", "", "Lgg/vdvldrhtss;", "Ljava/util/List;", "cqumvgiudr", "()Ljava/util/List;", "pendingOps", "Landroidx/lifecycle/agtfadlqog;", "Landroidx/lifecycle/agtfadlqog;", "fragmentObserver", "Lkotlin/Function1;", "Ltg/draadjrbmk;", "fragmentViewObserver", "iobyxmoadg", "zoijcleaow", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class iobyxmoadg extends agtfadlqog {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final zoijcleaow f12091btonecajqb = new zoijcleaow(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk fragmentViewObserver;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name and from kotlin metadata */
    private final Set savedIds;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name and from kotlin metadata */
    private final List pendingOps;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name and from kotlin metadata */
    private final androidx.lifecycle.agtfadlqog fragmentObserver;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    static final class btonecajqb extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final btonecajqb f12099zdlpuopuiu = new btonecajqb();

        btonecajqb() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final String invoke(vdvldrhtss it) {
            zdlpuopuiu.btonecajqb(it, "it");
            return (String) it.lqeggnwhkg();
        }
    }

    public static final class dxjokdxxww implements FragmentManager.ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f12100iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f12101zoijcleaow;

        dxjokdxxww(wflxmlrfwp wflxmlrfwpVar, iobyxmoadg iobyxmoadgVar) {
            this.f12100iobyxmoadg = wflxmlrfwpVar;
            this.f12101zoijcleaow = iobyxmoadgVar;
        }

        @Override // androidx.fragment.app.FragmentManager.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // androidx.fragment.app.FragmentManager.ojitshcjhn
        public void ppxfxbqfkf(Fragment fragment, boolean z13) {
            Object objPrevious;
            zdlpuopuiu.btonecajqb(fragment, "fragment");
            if (z13) {
                List list = (List) this.f12100iobyxmoadg.zoijcleaow().getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) objPrevious).gxszxtbevo(), fragment.getTag()));
                androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) objPrevious;
                if (this.f12101zoijcleaow.esjtqupxsv(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + ppxfxbqfkfVar);
                }
                if (ppxfxbqfkfVar != null) {
                    this.f12100iobyxmoadg.btonecajqb(ppxfxbqfkfVar);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.ojitshcjhn
        public void zoijcleaow(Fragment fragment, boolean z13) {
            Object obj;
            Object objPrevious;
            zdlpuopuiu.btonecajqb(fragment, "fragment");
            List listIxidwrxhsl = hg.jyumaefscl.ixidwrxhsl((Collection) this.f12100iobyxmoadg.zoijcleaow().getValue(), (Iterable) this.f12100iobyxmoadg.ppxfxbqfkf().getValue());
            ListIterator listIterator = listIxidwrxhsl.listIterator(listIxidwrxhsl.size());
            do {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) objPrevious).gxszxtbevo(), fragment.getTag()));
            androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) objPrevious;
            boolean z14 = z13 && this.f12101zoijcleaow.getPendingOps().isEmpty() && fragment.isRemoving();
            for (Object obj2 : this.f12101zoijcleaow.getPendingOps()) {
                if (zdlpuopuiu.eablkybsjg(((vdvldrhtss) obj2).lqeggnwhkg(), fragment.getTag())) {
                    obj = obj2;
                    break;
                }
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            if (vdvldrhtssVar != null) {
                this.f12101zoijcleaow.getPendingOps().remove(vdvldrhtssVar);
            }
            if (!z14 && this.f12101zoijcleaow.esjtqupxsv(2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + ppxfxbqfkfVar);
            }
            boolean z15 = vdvldrhtssVar != null && ((Boolean) vdvldrhtssVar.nufgyqmvbu()).booleanValue();
            if (!z13 && !z15 && ppxfxbqfkfVar == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (ppxfxbqfkfVar != null) {
                this.f12101zoijcleaow.kcexrzcfyt(fragment, ppxfxbqfkfVar, this.f12100iobyxmoadg);
                if (z14) {
                    if (this.f12101zoijcleaow.esjtqupxsv(2)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + ppxfxbqfkfVar + " via system back");
                    }
                    this.f12100iobyxmoadg.dxjokdxxww(ppxfxbqfkfVar, false);
                }
            }
        }
    }

    static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Fragment f12102iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f12103jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f12104yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.ppxfxbqfkf f12105zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar, wflxmlrfwp wflxmlrfwpVar, iobyxmoadg iobyxmoadgVar, Fragment fragment) {
            super(0);
            this.f12105zdlpuopuiu = ppxfxbqfkfVar;
            this.f12104yggfygwlhe = wflxmlrfwpVar;
            this.f12103jyumaefscl = iobyxmoadgVar;
            this.f12102iwizpuwonk = fragment;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            wflxmlrfwp wflxmlrfwpVar = this.f12104yggfygwlhe;
            iobyxmoadg iobyxmoadgVar = this.f12103jyumaefscl;
            Fragment fragment = this.f12102iwizpuwonk;
            for (androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar : (Iterable) wflxmlrfwpVar.ppxfxbqfkf().getValue()) {
                if (iobyxmoadgVar.esjtqupxsv(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + ppxfxbqfkfVar + " due to fragment " + fragment + " viewmodel being cleared");
                }
                wflxmlrfwpVar.eablkybsjg(ppxfxbqfkfVar);
            }
        }
    }

    static final class gtknphoqwx implements zynmafqrjb, kotlin.jvm.internal.agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final /* synthetic */ draadjrbmk f12106zdlpuopuiu;

        gtknphoqwx(draadjrbmk function) {
            zdlpuopuiu.btonecajqb(function, "function");
            this.f12106zdlpuopuiu = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof zynmafqrjb) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // androidx.lifecycle.zynmafqrjb
        public final /* synthetic */ void iobyxmoadg(Object obj) {
            this.f12106zdlpuopuiu.invoke(obj);
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return this.f12106zdlpuopuiu;
        }
    }

    static final class gxszxtbevo extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gxszxtbevo f12107zdlpuopuiu = new gxszxtbevo();

        gxszxtbevo() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final C0171iobyxmoadg invoke(t2.iobyxmoadg initializer) {
            zdlpuopuiu.btonecajqb(initializer, "$this$initializer");
            return new C0171iobyxmoadg();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.fragment.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0171iobyxmoadg extends ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public WeakReference f12108iobyxmoadg;

        public final void draadjrbmk(WeakReference weakReference) {
            zdlpuopuiu.btonecajqb(weakReference, "<set-?>");
            this.f12108iobyxmoadg = weakReference;
        }

        public final WeakReference gtknphoqwx() {
            WeakReference weakReference = this.f12108iobyxmoadg;
            if (weakReference != null) {
                return weakReference;
            }
            zdlpuopuiu.pmvmpeiblj("completeTransition");
            return null;
        }

        @Override // androidx.lifecycle.ntlheqmsrt
        protected void onCleared() {
            super.onCleared();
            tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) gtknphoqwx().get();
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        }
    }

    static final class lqeggnwhkg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.ppxfxbqfkf f12109jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f12110yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(Fragment fragment, androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar) {
            super(1);
            this.f12110yggfygwlhe = fragment;
            this.f12109jyumaefscl = ppxfxbqfkfVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.lifecycle.vdvldrhtss) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
            List pendingOps = iobyxmoadg.this.getPendingOps();
            Fragment fragment = this.f12110yggfygwlhe;
            boolean z13 = false;
            if (pendingOps == null || !pendingOps.isEmpty()) {
                Iterator it = pendingOps.iterator();
                while (it.hasNext()) {
                    if (zdlpuopuiu.eablkybsjg(((vdvldrhtss) it.next()).lqeggnwhkg(), fragment.getTag())) {
                        z13 = true;
                        break;
                    }
                }
            }
            if (vdvldrhtssVar == null || z13) {
                return;
            }
            androidx.lifecycle.gtknphoqwx lifecycle = this.f12110yggfygwlhe.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED)) {
                lifecycle.iobyxmoadg((rgvfuqvkyq) iobyxmoadg.this.fragmentViewObserver.invoke(this.f12109jyumaefscl));
            }
        }
    }

    static final class nufgyqmvbu extends jyumaefscl implements draadjrbmk {
        nufgyqmvbu() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void btonecajqb(iobyxmoadg this$0, androidx.navigation.ppxfxbqfkf entry, androidx.lifecycle.vdvldrhtss owner, androidx.lifecycle.gtknphoqwx.iobyxmoadg event) {
            zdlpuopuiu.btonecajqb(this$0, "this$0");
            zdlpuopuiu.btonecajqb(entry, "$entry");
            zdlpuopuiu.btonecajqb(owner, "owner");
            zdlpuopuiu.btonecajqb(event, "event");
            if (event == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_RESUME && ((List) this$0.zoijcleaow().zoijcleaow().getValue()).contains(entry)) {
                if (this$0.esjtqupxsv(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching RESUMED");
                }
                this$0.zoijcleaow().eablkybsjg(entry);
            }
            if (event == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
                if (this$0.esjtqupxsv(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
                }
                this$0.zoijcleaow().eablkybsjg(entry);
            }
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.agtfadlqog invoke(final androidx.navigation.ppxfxbqfkf entry) {
            zdlpuopuiu.btonecajqb(entry, "entry");
            final iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            return new androidx.lifecycle.agtfadlqog() { // from class: androidx.navigation.fragment.zoijcleaow
                @Override // androidx.lifecycle.agtfadlqog
                public final void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar2) {
                    iobyxmoadg.nufgyqmvbu.btonecajqb(iobyxmoadgVar, entry, vdvldrhtssVar, iobyxmoadgVar2);
                }
            };
        }
    }

    public static class ppxfxbqfkf extends androidx.navigation.lqeggnwhkg {

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private String f12113iozdgvuglv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(agtfadlqog fragmentNavigator) {
            super(fragmentNavigator);
            zdlpuopuiu.btonecajqb(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.lqeggnwhkg
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            return super.equals(obj) && zdlpuopuiu.eablkybsjg(this.f12113iozdgvuglv, ((ppxfxbqfkf) obj).f12113iozdgvuglv);
        }

        @Override // androidx.navigation.lqeggnwhkg
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f12113iozdgvuglv;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.lqeggnwhkg
        public void kcexrzcfyt(Context context, AttributeSet attrs) {
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(attrs, "attrs");
            super.kcexrzcfyt(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, j5.lqeggnwhkg.FragmentNavigator);
            zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(j5.lqeggnwhkg.FragmentNavigator_android_name);
            if (string != null) {
                pmvmpeiblj(string);
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            typedArrayObtainAttributes.recycle();
        }

        public final String lereixgezr() {
            String str = this.f12113iozdgvuglv;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            zdlpuopuiu.nufgyqmvbu(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        public final ppxfxbqfkf pmvmpeiblj(String className) {
            zdlpuopuiu.btonecajqb(className, "className");
            this.f12113iozdgvuglv = className;
            return this;
        }

        @Override // androidx.navigation.lqeggnwhkg
        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(super.toString());
            sb3.append(" class=");
            String str = this.f12113iozdgvuglv;
            if (str == null) {
                sb3.append("null");
            } else {
                sb3.append(str);
            }
            String string = sb3.toString();
            zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
            return string;
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ String f12114zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(String str) {
            super(1);
            this.f12114zdlpuopuiu = str;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(vdvldrhtss it) {
            zdlpuopuiu.btonecajqb(it, "it");
            return Boolean.valueOf(zdlpuopuiu.eablkybsjg(it.lqeggnwhkg(), this.f12114zdlpuopuiu));
        }
    }

    private static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public iobyxmoadg(Context context, FragmentManager fragmentManager, int i13) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i13;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new androidx.lifecycle.agtfadlqog() { // from class: j5.ppxfxbqfkf
            @Override // androidx.lifecycle.agtfadlqog
            public final void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
                androidx.navigation.fragment.iobyxmoadg.iwizpuwonk(this.f50734zdlpuopuiu, vdvldrhtssVar, iobyxmoadgVar);
            }
        };
        this.fragmentViewObserver = new nufgyqmvbu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean esjtqupxsv(int level) {
        return Log.isLoggable("FragmentManager", level) || Log.isLoggable("FragmentNavigator", level);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(iobyxmoadg this$0, androidx.lifecycle.vdvldrhtss source, androidx.lifecycle.gtknphoqwx.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(source, "source");
        zdlpuopuiu.btonecajqb(event, "event");
        if (event == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : (Iterable) this$0.zoijcleaow().ppxfxbqfkf().getValue()) {
                if (zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) obj2).gxszxtbevo(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar != null) {
                if (this$0.esjtqupxsv(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + ppxfxbqfkfVar + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                this$0.zoijcleaow().eablkybsjg(ppxfxbqfkfVar);
            }
        }
    }

    private final jpowsppfya jyumaefscl(androidx.navigation.ppxfxbqfkf entry, androidx.navigation.gtknphoqwx navOptions) {
        androidx.navigation.lqeggnwhkg lqeggnwhkgVarEablkybsjg = entry.eablkybsjg();
        zdlpuopuiu.nufgyqmvbu(lqeggnwhkgVarEablkybsjg, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundlePpxfxbqfkf = entry.ppxfxbqfkf();
        String strLereixgezr = ((ppxfxbqfkf) lqeggnwhkgVarEablkybsjg).lereixgezr();
        if (strLereixgezr.charAt(0) == '.') {
            strLereixgezr = this.context.getPackageName() + strLereixgezr;
        }
        Fragment fragmentIobyxmoadg = this.fragmentManager.dvvnrvtcbc().iobyxmoadg(this.context.getClassLoader(), strLereixgezr);
        zdlpuopuiu.dxjokdxxww(fragmentIobyxmoadg, "fragmentManager.fragment…t.classLoader, className)");
        fragmentIobyxmoadg.setArguments(bundlePpxfxbqfkf);
        jpowsppfya jpowsppfyaVarKcexrzcfyt = this.fragmentManager.kcexrzcfyt();
        zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "fragmentManager.beginTransaction()");
        int iIobyxmoadg = navOptions != null ? navOptions.iobyxmoadg() : -1;
        int iZoijcleaow = navOptions != null ? navOptions.zoijcleaow() : -1;
        int iPpxfxbqfkf = navOptions != null ? navOptions.ppxfxbqfkf() : -1;
        int iWkgbmnqykc = navOptions != null ? navOptions.wkgbmnqykc() : -1;
        if (iIobyxmoadg != -1 || iZoijcleaow != -1 || iPpxfxbqfkf != -1 || iWkgbmnqykc != -1) {
            if (iIobyxmoadg == -1) {
                iIobyxmoadg = 0;
            }
            if (iZoijcleaow == -1) {
                iZoijcleaow = 0;
            }
            if (iPpxfxbqfkf == -1) {
                iPpxfxbqfkf = 0;
            }
            jpowsppfyaVarKcexrzcfyt.yggfygwlhe(iIobyxmoadg, iZoijcleaow, iPpxfxbqfkf, iWkgbmnqykc != -1 ? iWkgbmnqykc : 0);
        }
        jpowsppfyaVarKcexrzcfyt.oxmwwwfdhm(this.containerId, fragmentIobyxmoadg, entry.gxszxtbevo());
        jpowsppfyaVarKcexrzcfyt.jyumaefscl(fragmentIobyxmoadg);
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        return jpowsppfyaVarKcexrzcfyt;
    }

    private final void lereixgezr(androidx.navigation.ppxfxbqfkf entry, androidx.navigation.gtknphoqwx navOptions, agtfadlqog.iobyxmoadg navigatorExtras) {
        boolean zIsEmpty = ((List) zoijcleaow().zoijcleaow().getValue()).isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.draadjrbmk() && this.savedIds.remove(entry.gxszxtbevo())) {
            this.fragmentManager.G(entry.gxszxtbevo());
            zoijcleaow().draadjrbmk(entry);
            return;
        }
        jpowsppfya jpowsppfyaVarJyumaefscl = jyumaefscl(entry, navOptions);
        if (!zIsEmpty) {
            androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) hg.jyumaefscl.lxfrhoxuzk((List) zoijcleaow().zoijcleaow().getValue());
            if (ppxfxbqfkfVar != null) {
                oxmwwwfdhm(this, ppxfxbqfkfVar.gxszxtbevo(), false, false, 6, null);
            }
            oxmwwwfdhm(this, entry.gxszxtbevo(), false, false, 6, null);
            jpowsppfyaVarJyumaefscl.nufgyqmvbu(entry.gxszxtbevo());
        }
        jpowsppfyaVarJyumaefscl.dxjokdxxww();
        if (esjtqupxsv(2)) {
            Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + entry);
        }
        zoijcleaow().draadjrbmk(entry);
    }

    static /* synthetic */ void oxmwwwfdhm(iobyxmoadg iobyxmoadgVar, String str, boolean z13, boolean z14, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            z14 = true;
        }
        iobyxmoadgVar.vdvldrhtss(str, z13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pmvmpeiblj(wflxmlrfwp state, iobyxmoadg this$0, FragmentManager fragmentManager, Fragment fragment) {
        Object objPrevious;
        zdlpuopuiu.btonecajqb(state, "$state");
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(fragmentManager, "<anonymous parameter 0>");
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        List list = (List) state.zoijcleaow().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!zdlpuopuiu.eablkybsjg(((androidx.navigation.ppxfxbqfkf) objPrevious).gxszxtbevo(), fragment.getTag()));
        androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) objPrevious;
        if (this$0.esjtqupxsv(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + ppxfxbqfkfVar + " to FragmentManager " + this$0.fragmentManager);
        }
        if (ppxfxbqfkfVar != null) {
            this$0.zdlpuopuiu(ppxfxbqfkfVar, fragment);
            this$0.kcexrzcfyt(fragment, ppxfxbqfkfVar, state);
        }
    }

    private final void vdvldrhtss(String id2, boolean isPop, boolean deduplicate) {
        if (deduplicate) {
            hg.jyumaefscl.pkzmftpjix(this.pendingOps, new wkgbmnqykc(id2));
        }
        this.pendingOps.add(cqumvgiudr.iobyxmoadg(id2, Boolean.valueOf(isPop)));
    }

    private final void zdlpuopuiu(androidx.navigation.ppxfxbqfkf entry, Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().dxjokdxxww(fragment, new gtknphoqwx(new lqeggnwhkg(fragment, entry)));
        fragment.getLifecycle().iobyxmoadg(this.fragmentObserver);
    }

    @Override // androidx.navigation.agtfadlqog
    public void btonecajqb(androidx.navigation.ppxfxbqfkf popUpTo, boolean savedState) {
        zdlpuopuiu.btonecajqb(popUpTo, "popUpTo");
        if (this.fragmentManager.d()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) zoijcleaow().zoijcleaow().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        List listSubList = list.subList(iIndexOf, list.size());
        androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) hg.jyumaefscl.opjhrmiecq(list);
        androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar2 = (androidx.navigation.ppxfxbqfkf) hg.jyumaefscl.lrnfpwlwnk(list, iIndexOf - 1);
        if (ppxfxbqfkfVar2 != null) {
            oxmwwwfdhm(this, ppxfxbqfkfVar2.gxszxtbevo(), false, false, 6, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar3 = (androidx.navigation.ppxfxbqfkf) obj;
            if (lj.wflxmlrfwp.iwizpuwonk(lj.wflxmlrfwp.dsvhmnatus(hg.jyumaefscl.ikoacuggdj(this.pendingOps), btonecajqb.f12099zdlpuopuiu), ppxfxbqfkfVar3.gxszxtbevo()) || !zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar3.gxszxtbevo(), ppxfxbqfkfVar.gxszxtbevo())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oxmwwwfdhm(this, ((androidx.navigation.ppxfxbqfkf) it.next()).gxszxtbevo(), true, false, 4, null);
        }
        if (savedState) {
            for (androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar4 : hg.jyumaefscl.ezmngbhpjk(listSubList)) {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar4, ppxfxbqfkfVar)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + ppxfxbqfkfVar4);
                } else {
                    this.fragmentManager.L(ppxfxbqfkfVar4.gxszxtbevo());
                    this.savedIds.add(ppxfxbqfkfVar4.gxszxtbevo());
                }
            }
        } else {
            this.fragmentManager.u(popUpTo.gxszxtbevo(), 1);
        }
        if (esjtqupxsv(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + savedState);
        }
        zoijcleaow().dxjokdxxww(popUpTo, savedState);
    }

    /* JADX INFO: renamed from: cqumvgiudr, reason: from getter */
    public final List getPendingOps() {
        return this.pendingOps;
    }

    @Override // androidx.navigation.agtfadlqog
    public Bundle dxjokdxxww() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return q1.ppxfxbqfkf.zoijcleaow(cqumvgiudr.iobyxmoadg("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.savedIds)));
    }

    @Override // androidx.navigation.agtfadlqog
    public void eablkybsjg(List entries, androidx.navigation.gtknphoqwx navOptions, agtfadlqog.iobyxmoadg navigatorExtras) {
        zdlpuopuiu.btonecajqb(entries, "entries");
        if (this.fragmentManager.d()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            lereixgezr((androidx.navigation.ppxfxbqfkf) it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // androidx.navigation.agtfadlqog
    public void gxszxtbevo(final wflxmlrfwp state) {
        zdlpuopuiu.btonecajqb(state, "state");
        super.gxszxtbevo(state);
        if (esjtqupxsv(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.fragmentManager.wflxmlrfwp(new androidx.fragment.app.wwaezpbzkn() { // from class: j5.wkgbmnqykc
            @Override // androidx.fragment.app.wwaezpbzkn
            public final void iobyxmoadg(FragmentManager fragmentManager, Fragment fragment) {
                androidx.navigation.fragment.iobyxmoadg.pmvmpeiblj(state, this, fragmentManager, fragment);
            }
        });
        this.fragmentManager.agtfadlqog(new dxjokdxxww(state, this));
    }

    public final void kcexrzcfyt(Fragment fragment, androidx.navigation.ppxfxbqfkf entry, wflxmlrfwp state) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(entry, "entry");
        zdlpuopuiu.btonecajqb(state, "state");
        jlmebxxoox viewModelStore = fragment.getViewModelStore();
        zdlpuopuiu.dxjokdxxww(viewModelStore, "fragment.viewModelStore");
        t2.ppxfxbqfkf ppxfxbqfkfVar = new t2.ppxfxbqfkf();
        ppxfxbqfkfVar.iobyxmoadg(cllcsxoeiz.zoijcleaow(C0171iobyxmoadg.class), gxszxtbevo.f12107zdlpuopuiu);
        ((C0171iobyxmoadg) new crxdokpmqz(viewModelStore, ppxfxbqfkfVar.zoijcleaow(), t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf).zoijcleaow(C0171iobyxmoadg.class)).draadjrbmk(new WeakReference(new eablkybsjg(entry, state, this, fragment)));
    }

    @Override // androidx.navigation.agtfadlqog
    public void lqeggnwhkg(androidx.navigation.ppxfxbqfkf backStackEntry) {
        zdlpuopuiu.btonecajqb(backStackEntry, "backStackEntry");
        if (this.fragmentManager.d()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        jpowsppfya jpowsppfyaVarJyumaefscl = jyumaefscl(backStackEntry, null);
        List list = (List) zoijcleaow().zoijcleaow().getValue();
        if (list.size() > 1) {
            androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) hg.jyumaefscl.lrnfpwlwnk(list, hg.jyumaefscl.ojitshcjhn(list) - 1);
            if (ppxfxbqfkfVar != null) {
                oxmwwwfdhm(this, ppxfxbqfkfVar.gxszxtbevo(), false, false, 6, null);
            }
            oxmwwwfdhm(this, backStackEntry.gxszxtbevo(), true, false, 4, null);
            this.fragmentManager.u(backStackEntry.gxszxtbevo(), 1);
            oxmwwwfdhm(this, backStackEntry.gxszxtbevo(), false, false, 2, null);
            jpowsppfyaVarJyumaefscl.nufgyqmvbu(backStackEntry.gxszxtbevo());
        }
        jpowsppfyaVarJyumaefscl.dxjokdxxww();
        zoijcleaow().gxszxtbevo(backStackEntry);
    }

    @Override // androidx.navigation.agtfadlqog
    public void nufgyqmvbu(Bundle savedState) {
        zdlpuopuiu.btonecajqb(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.savedIds.clear();
            hg.jyumaefscl.istkbnxepw(this.savedIds, stringArrayList);
        }
    }

    @Override // androidx.navigation.agtfadlqog
    /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf iobyxmoadg() {
        return new ppxfxbqfkf(this);
    }
}
