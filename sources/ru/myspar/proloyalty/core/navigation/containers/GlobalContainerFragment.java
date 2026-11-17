package ru.myspar.proloyalty.core.navigation.containers;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jpowsppfya;
import androidx.fragment.app.jyumaefscl;
import androidx.fragment.app.oxmwwwfdhm;
import f21.zoijcleaow;
import g21.ppxfxbqfkf;
import gg.wwaezpbzkn;
import i21.iobyxmoadg;
import java.util.Iterator;
import java.util.List;
import k21.agtfadlqog;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import l9.btonecajqb;
import l9.wkgbmnqykc;
import ru.myspar.proloyalty.core.base.api.fragment.BaseFragment;
import ru.myspar.proloyalty.core.navigation.containers.GlobalContainerFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0004J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/myspar/proloyalty/core/navigation/containers/GlobalContainerFragment;", "Lru/myspar/proloyalty/core/base/api/fragment/BaseFragment;", "Lk21/agtfadlqog;", "<init>", "()V", "Lg21/wkgbmnqykc;", "zoijcleaow", "()Lg21/wkgbmnqykc;", "Landroidx/fragment/app/Fragment;", "iobyxmoadg", "()Landroidx/fragment/app/Fragment;", "", "eablkybsjg", "()I", "Lgg/wwaezpbzkn;", "hcddaimhww", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Ll9/wkgbmnqykc;", "zdlpuopuiu", "Ll9/wkgbmnqykc;", "getCicerone", "()Ll9/wkgbmnqykc;", "cicerone", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalContainerFragment extends BaseFragment implements agtfadlqog {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final wkgbmnqykc cicerone;

    public GlobalContainerFragment() {
        super(zoijcleaow.fragment_global_container);
        this.cicerone = wkgbmnqykc.f61923zoijcleaow.iobyxmoadg(new g21.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment cllcsxoeiz(Fragment fragment, jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return fragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hkdspvbjdz(boolean z13) {
        iobyxmoadg.f41720iobyxmoadg.esjtqupxsv(z13);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agtfadlqog jpowsppfya(GlobalContainerFragment globalContainerFragment) {
        return globalContainerFragment;
    }

    @Override // k21.agtfadlqog
    public int eablkybsjg() {
        return getChildFragmentManager().roivzttewh();
    }

    public final void hcddaimhww() {
        final Fragment fragmentZoijcleaow;
        m9.wkgbmnqykc wkgbmnqykcVarZoijcleaow;
        iobyxmoadg.f41720iobyxmoadg.lereixgezr(new tg.iobyxmoadg() { // from class: h21.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return GlobalContainerFragment.jpowsppfya(this.f39224zdlpuopuiu);
            }
        });
        btonecajqb btonecajqbVarIobyxmoadg = this.cicerone.iobyxmoadg();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        int i13 = f21.iobyxmoadg.global_container;
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        btonecajqbVarIobyxmoadg.iobyxmoadg(new ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, i13, childFragmentManager, null, new draadjrbmk() { // from class: h21.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return GlobalContainerFragment.hkdspvbjdz(((Boolean) obj).booleanValue());
            }
        }, 8, null));
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        if (childFragmentManager2.roivzttewh() == 0) {
            jpowsppfya jpowsppfyaVarKcexrzcfyt = getParentFragmentManager().kcexrzcfyt();
            jpowsppfyaVarKcexrzcfyt.ojitshcjhn(this);
            jpowsppfyaVarKcexrzcfyt.btonecajqb();
            return;
        }
        List listIgdgnonuha = childFragmentManager2.igdgnonuha();
        zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "getFragments(...)");
        Fragment fragment = (Fragment) hg.jyumaefscl.lxfrhoxuzk(listIgdgnonuha);
        if (fragment == null || (fragmentZoijcleaow = g21.iobyxmoadg.zoijcleaow(fragment, null, false, 1, null)) == null || (wkgbmnqykcVarZoijcleaow = m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, fragmentZoijcleaow.getTag(), false, new m9.ppxfxbqfkf() { // from class: h21.ppxfxbqfkf
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return GlobalContainerFragment.cllcsxoeiz(fragmentZoijcleaow, (jyumaefscl) obj);
            }
        }, 2, null)) == null) {
            return;
        }
        zoijcleaow().btonecajqb(wkgbmnqykcVarZoijcleaow);
    }

    @Override // k21.agtfadlqog
    public Fragment iobyxmoadg() {
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Iterator it = getChildFragmentManager().igdgnonuha().iterator();
        while (it.hasNext()) {
            ((Fragment) it.next()).onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // k21.agtfadlqog
    public g21.wkgbmnqykc zoijcleaow() {
        return (g21.wkgbmnqykc) this.cicerone.zoijcleaow();
    }
}
