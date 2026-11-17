package da0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hcddaimhww {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof yggfygwlhe.lqeggnwhkg);
        }
    }

    public static final class ppxfxbqfkf implements TabLayout.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f27270iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f27271zoijcleaow;

        ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
            this.f27270iobyxmoadg = iobyxmoadgVar;
            this.f27271zoijcleaow = draadjrbmkVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.zoijcleaow
        public void iobyxmoadg(TabLayout.eablkybsjg eablkybsjgVar) {
            if (eablkybsjgVar != null) {
                this.f27271zoijcleaow.invoke(((yggfygwlhe.lqeggnwhkg.iobyxmoadg) ((yggfygwlhe.lqeggnwhkg) this.f27270iobyxmoadg.eablkybsjg()).wkgbmnqykc().get(eablkybsjgVar.lqeggnwhkg())).iobyxmoadg());
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.zoijcleaow
        public void ppxfxbqfkf(TabLayout.eablkybsjg eablkybsjgVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.zoijcleaow
        public void zoijcleaow(TabLayout.eablkybsjg eablkybsjgVar) {
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f27272zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y90.nufgyqmvbu eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        y90.nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = y90.nufgyqmvbu.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(nufgyqmvbuVarPpxfxbqfkf, "inflate(...)");
        return nufgyqmvbuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((y90.nufgyqmvbu) adapterDelegateViewBinding.ppxfxbqfkf()).f124212zoijcleaow.nufgyqmvbu(new ppxfxbqfkf(adapterDelegateViewBinding, draadjrbmkVar));
        final int iPpxfxbqfkf = c60.zoijcleaow.ppxfxbqfkf(adapterDelegateViewBinding.wkgbmnqykc(), s40.ppxfxbqfkf.colorTextIcons3);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: da0.pkzmftpjix
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return hcddaimhww.lqeggnwhkg(adapterDelegateViewBinding, iPpxfxbqfkf, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, int i13, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        int iWypolnanlu = ((yggfygwlhe.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
        TabLayout tabLayout = ((y90.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f124212zoijcleaow;
        tabLayout.wwaezpbzkn();
        tabLayout.setSelectedTabIndicatorColor(iWypolnanlu);
        tabLayout.kegysxyocb(i13, iWypolnanlu);
        for (yggfygwlhe.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 : ((yggfygwlhe.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc()) {
            TabLayout.eablkybsjg eablkybsjgVarYadqdtsiqt = tabLayout.yadqdtsiqt();
            eablkybsjgVarYadqdtsiqt.oxmwwwfdhm(iobyxmoadgVar2.zoijcleaow());
            tabLayout.dxjokdxxww(eablkybsjgVarYadqdtsiqt);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk listener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: da0.wwaezpbzkn
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return hcddaimhww.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: da0.ylkuphrtab
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return hcddaimhww.gxszxtbevo(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f27272zdlpuopuiu);
    }
}
