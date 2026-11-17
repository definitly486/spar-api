package h81;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
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
        final /* synthetic */ ef.iobyxmoadg f39858iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f39859zoijcleaow;

        ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
            this.f39858iobyxmoadg = iobyxmoadgVar;
            this.f39859zoijcleaow = draadjrbmkVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.zoijcleaow
        public void iobyxmoadg(TabLayout.eablkybsjg eablkybsjgVar) {
            if (eablkybsjgVar != null) {
                this.f39859zoijcleaow.invoke(((yggfygwlhe.lqeggnwhkg.iobyxmoadg) ((yggfygwlhe.lqeggnwhkg) this.f39858iobyxmoadg.eablkybsjg()).wkgbmnqykc().get(eablkybsjgVar.lqeggnwhkg())).iobyxmoadg());
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
        public static final zoijcleaow f39860zdlpuopuiu = new zoijcleaow();

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
    public static final c81.nufgyqmvbu eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        c81.nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = c81.nufgyqmvbu.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(nufgyqmvbuVarPpxfxbqfkf, "inflate(...)");
        return nufgyqmvbuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((c81.nufgyqmvbu) adapterDelegateViewBinding.ppxfxbqfkf()).f19242zoijcleaow.nufgyqmvbu(new ppxfxbqfkf(adapterDelegateViewBinding, draadjrbmkVar));
        final int iPpxfxbqfkf = p41.ppxfxbqfkf.ppxfxbqfkf(adapterDelegateViewBinding.wkgbmnqykc(), b31.ppxfxbqfkf.colorTextIcons3);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: h81.pkzmftpjix
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
        int iXrmfcynszj = ((yggfygwlhe.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY);
        TabLayout tabLayout = ((c81.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f19242zoijcleaow;
        tabLayout.wwaezpbzkn();
        tabLayout.setSelectedTabIndicatorColor(iXrmfcynszj);
        tabLayout.kegysxyocb(i13, iXrmfcynszj);
        for (yggfygwlhe.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 : ((yggfygwlhe.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc()) {
            TabLayout.eablkybsjg eablkybsjgVarYadqdtsiqt = tabLayout.yadqdtsiqt();
            eablkybsjgVarYadqdtsiqt.oxmwwwfdhm(iobyxmoadgVar2.zoijcleaow());
            tabLayout.dxjokdxxww(eablkybsjgVarYadqdtsiqt);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk listener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: h81.wwaezpbzkn
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return hcddaimhww.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: h81.ylkuphrtab
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return hcddaimhww.gxszxtbevo(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f39860zdlpuopuiu);
    }
}
