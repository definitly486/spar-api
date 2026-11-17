package ru.myspar.core.navigation.containers;

import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jpowsppfya;
import androidx.fragment.app.oxmwwwfdhm;
import b40.ppxfxbqfkf;
import f40.eablkybsjg;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import i40.iobyxmoadg;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import l9.btonecajqb;
import l9.vdvldrhtss;
import l9.wkgbmnqykc;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import ru.myspar.core.base.api.fragment.BaseFragment;
import ru.myspar.core.navigation.containers.TabContainerFragment;
import ru.myspar.core.ui.model.MainTab;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u001d\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010#\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00104\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/myspar/core/navigation/containers/TabContainerFragment;", "Lru/myspar/core/base/api/fragment/BaseFragment;", "Lf40/eablkybsjg;", "<init>", "()V", "", "isCreated", "()Z", "Lgg/wwaezpbzkn;", "dsvhmnatus", "stevsuqkhv", "wypolnanlu", "", "Ll9/vdvldrhtss;", "screens", "wkgbmnqykc", "(Ljava/util/List;)V", "lqeggnwhkg", "btonecajqb", "Lb40/wkgbmnqykc;", "zoijcleaow", "()Lb40/wkgbmnqykc;", "Landroidx/fragment/app/Fragment;", "iobyxmoadg", "()Landroidx/fragment/app/Fragment;", "Lm9/wkgbmnqykc;", "screen", "isCurrentScreen", "kegysxyocb", "(Lm9/wkgbmnqykc;Z)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "zdlpuopuiu", "Lm9/wkgbmnqykc;", "Ll9/wkgbmnqykc;", "yggfygwlhe", "Ll9/wkgbmnqykc;", "cicerone", "Lru/myspar/core/ui/model/MainTab;", "jyumaefscl", "Lgg/gtknphoqwx;", "ppxfxbqfkf", "()Lru/myspar/core/ui/model/MainTab;", "tab", "iwizpuwonk", "cllcsxoeiz", "()Lm9/wkgbmnqykc;", "defaultScreen", "cqumvgiudr", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TabContainerFragment extends BaseFragment implements eablkybsjg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f87515esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx defaultScreen;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx tab;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final wkgbmnqykc cicerone;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private m9.wkgbmnqykc screen;

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ TabContainerFragment f87520jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f87521yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f87522zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(List list, TabContainerFragment tabContainerFragment, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f87521yggfygwlhe = list;
            this.f87520jyumaefscl = tabContainerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f87521yggfygwlhe, this.f87520jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f87522zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            if (this.f87521yggfygwlhe.isEmpty()) {
                if (!this.f87520jyumaefscl.isCreated()) {
                    this.f87520jyumaefscl.zoijcleaow().dxjokdxxww(this.f87520jyumaefscl.nufgyqmvbu());
                    TabContainerFragment tabContainerFragment = this.f87520jyumaefscl;
                    String strWkgbmnqykc = tabContainerFragment.nufgyqmvbu().wkgbmnqykc();
                    this.f87522zdlpuopuiu = 2;
                    if (iobyxmoadg.ppxfxbqfkf(tabContainerFragment, strWkgbmnqykc, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            this.f87520jyumaefscl.wypolnanlu();
            b40.wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f87520jyumaefscl.zoijcleaow();
            vdvldrhtss[] vdvldrhtssVarArr = (vdvldrhtss[]) this.f87521yggfygwlhe.toArray(new vdvldrhtss[0]);
            wkgbmnqykcVarZoijcleaow.dxjokdxxww((vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
            TabContainerFragment tabContainerFragment2 = this.f87520jyumaefscl;
            String strWkgbmnqykc2 = ((vdvldrhtss) jyumaefscl.skhdrjzrfn(this.f87521yggfygwlhe)).wkgbmnqykc();
            this.f87522zdlpuopuiu = 1;
            if (iobyxmoadg.ppxfxbqfkf(tabContainerFragment2, strWkgbmnqykc2, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public TabContainerFragment() {
        super(a40.zoijcleaow.fragment_main_tab_container);
        this.cicerone = wkgbmnqykc.f61923zoijcleaow.iobyxmoadg(new b40.wkgbmnqykc());
        this.tab = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: c40.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return TabContainerFragment.mbcevpiqjq(this.f18728zdlpuopuiu);
            }
        });
        this.defaultScreen = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: c40.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return TabContainerFragment.hkdspvbjdz(this.f18724zdlpuopuiu);
            }
        });
    }

    private final void dsvhmnatus() {
        jpowsppfya jpowsppfyaVarKcexrzcfyt = getParentFragmentManager().kcexrzcfyt();
        jpowsppfyaVarKcexrzcfyt.ojitshcjhn(this);
        jpowsppfyaVarKcexrzcfyt.btonecajqb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m9.wkgbmnqykc hkdspvbjdz(TabContainerFragment tabContainerFragment) {
        m9.wkgbmnqykc wkgbmnqykcVar = tabContainerFragment.screen;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("screen");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCreated() {
        return getChildFragmentManager().zfvoamnweg(a40.iobyxmoadg.tabContainer) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MainTab mbcevpiqjq(TabContainerFragment tabContainerFragment) {
        Parcelable parcelable = tabContainerFragment.requireArguments().getParcelable("tab_name");
        MainTab mainTab = parcelable instanceof MainTab ? (MainTab) parcelable : null;
        return mainTab == null ? MainTab.MY_SPAR : mainTab;
    }

    private final void stevsuqkhv() {
        jpowsppfya jpowsppfyaVarKcexrzcfyt = getParentFragmentManager().kcexrzcfyt();
        jpowsppfyaVarKcexrzcfyt.esjtqupxsv(this);
        jpowsppfyaVarKcexrzcfyt.btonecajqb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg tzroggbefp(TabContainerFragment tabContainerFragment) {
        return tabContainerFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wypolnanlu() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        List listIgdgnonuha = childFragmentManager.igdgnonuha();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "getFragments(...)");
        Fragment fragment = (Fragment) jyumaefscl.lxfrhoxuzk(listIgdgnonuha);
        if (fragment != null) {
            childFragmentManager.kcexrzcfyt().rgvfuqvkyq(fragment).dxjokdxxww();
        }
    }

    @Override // f40.eablkybsjg
    public void btonecajqb() {
        List listIgdgnonuha = getChildFragmentManager().igdgnonuha();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "getFragments(...)");
        if (listIgdgnonuha == null || !listIgdgnonuha.isEmpty()) {
            Iterator it = listIgdgnonuha.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Fragment) it.next()).getTag(), nufgyqmvbu().wkgbmnqykc())) {
                    return;
                }
            }
        }
        wypolnanlu();
    }

    @Override // f40.eablkybsjg
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public m9.wkgbmnqykc nufgyqmvbu() {
        return (m9.wkgbmnqykc) this.defaultScreen.getValue();
    }

    @Override // f40.eablkybsjg
    public Fragment iobyxmoadg() {
        return this;
    }

    public final void kegysxyocb(m9.wkgbmnqykc screen, boolean isCurrentScreen) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screen, "screen");
        d40.iobyxmoadg.f26931iobyxmoadg.pmvmpeiblj(ppxfxbqfkf(), new tg.iobyxmoadg() { // from class: c40.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return TabContainerFragment.tzroggbefp(this.f18725zdlpuopuiu);
            }
        });
        btonecajqb btonecajqbVarIobyxmoadg = this.cicerone.iobyxmoadg();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        int i13 = a40.iobyxmoadg.tabContainer;
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        btonecajqbVarIobyxmoadg.iobyxmoadg(new ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, i13, childFragmentManager, null, null, 24, null));
        this.screen = screen;
        if (!isCurrentScreen) {
            dsvhmnatus();
            return;
        }
        eablkybsjg.wflxmlrfwp(this, null, 1, null);
        if (isCreated()) {
            stevsuqkhv();
        }
    }

    @Override // f40.eablkybsjg
    public void lqeggnwhkg() {
        zoijcleaow().dxjokdxxww(nufgyqmvbu());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Iterator it = getChildFragmentManager().igdgnonuha().iterator();
        while (it.hasNext()) {
            ((Fragment) it.next()).onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // f40.eablkybsjg
    public MainTab ppxfxbqfkf() {
        return (MainTab) this.tab.getValue();
    }

    @Override // f40.eablkybsjg
    public void wkgbmnqykc(List screens) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screens, "screens");
        pj.btonecajqb.zoijcleaow(null, new zoijcleaow(screens, this, null), 1, null);
    }

    @Override // f40.eablkybsjg
    public b40.wkgbmnqykc zoijcleaow() {
        return (b40.wkgbmnqykc) this.cicerone.zoijcleaow();
    }
}
