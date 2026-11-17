package hy1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f41416ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo f41417wkgbmnqykc = new C0963iobyxmoadg();

    public static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public eablkybsjg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return false;
        }
    }

    public static final class gxszxtbevo extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gxszxtbevo f41418zdlpuopuiu = new gxszxtbevo();

        public gxszxtbevo() {
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

    /* JADX INFO: renamed from: hy1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0963iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        C0963iobyxmoadg() {
        }

        private final boolean lqeggnwhkg(jy1.ppxfxbqfkf ppxfxbqfkfVar, jy1.ppxfxbqfkf ppxfxbqfkfVar2) {
            return !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.gtknphoqwx(), ppxfxbqfkfVar2.gtknphoqwx());
        }

        private final boolean nufgyqmvbu(jy1.ppxfxbqfkf ppxfxbqfkfVar, jy1.ppxfxbqfkf ppxfxbqfkfVar2) {
            return !(ppxfxbqfkfVar.rgvfuqvkyq() == ppxfxbqfkfVar2.rgvfuqvkyq());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(jy1.iobyxmoadg oldItem, jy1.iobyxmoadg newItem) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newItem, "newItem");
            return oldItem.getClass() == newItem.getClass() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(oldItem.getItemId(), newItem.getItemId());
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Object ppxfxbqfkf(jy1.iobyxmoadg oldItem, jy1.iobyxmoadg newItem) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newItem, "newItem");
            if (!(oldItem instanceof jy1.iobyxmoadg.ppxfxbqfkf) || !(newItem instanceof jy1.iobyxmoadg.ppxfxbqfkf)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            jy1.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = (jy1.iobyxmoadg.ppxfxbqfkf) oldItem;
            jy1.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar2 = (jy1.iobyxmoadg.ppxfxbqfkf) newItem;
            if (ppxfxbqfkfVar.wkgbmnqykc().yggfygwlhe() != ppxfxbqfkfVar2.wkgbmnqykc().yggfygwlhe()) {
                arrayList.add(jy1.zoijcleaow.iobyxmoadg.f52554iobyxmoadg);
            }
            boolean zNufgyqmvbu = nufgyqmvbu(ppxfxbqfkfVar.wkgbmnqykc(), ppxfxbqfkfVar2.wkgbmnqykc());
            boolean zLqeggnwhkg = lqeggnwhkg(ppxfxbqfkfVar.wkgbmnqykc(), ppxfxbqfkfVar2.wkgbmnqykc());
            if (zNufgyqmvbu || zLqeggnwhkg) {
                arrayList.add(jy1.zoijcleaow.C1125zoijcleaow.f52556iobyxmoadg);
            }
            if (ppxfxbqfkfVar.iobyxmoadg() != ppxfxbqfkfVar2.iobyxmoadg()) {
                arrayList.add(jy1.zoijcleaow.ppxfxbqfkf.f52555iobyxmoadg);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(jy1.iobyxmoadg oldItem, jy1.iobyxmoadg newItem) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newItem, "newItem");
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    public static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f41419zdlpuopuiu = new ppxfxbqfkf();

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final b60.iobyxmoadg invoke(LayoutInflater layoutInflater, ViewGroup root) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
            b60.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = b60.iobyxmoadg.ppxfxbqfkf(layoutInflater, root, false);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
            return iobyxmoadgVarPpxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f41420zdlpuopuiu = new wkgbmnqykc();

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ef.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ef.iobyxmoadg adapterDelegateViewBinding) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
            ((b60.iobyxmoadg) adapterDelegateViewBinding.ppxfxbqfkf()).f15357zoijcleaow.setContent(t40.iobyxmoadg.f109650iobyxmoadg.iobyxmoadg());
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, tg.vdvldrhtss vdvldrhtssVar, tg.draadjrbmk onAddProductToCartClicked, tg.draadjrbmk onFavoriteProductClicked, tg.rgvfuqvkyq onChangeInputQuantity, tg.draadjrbmk onChangeMeasureType, tg.draadjrbmk onIncreaseClick, tg.draadjrbmk onDecreaseClick, tg.rgvfuqvkyq onRightAction, tg.rgvfuqvkyq onLeftAction, tg.draadjrbmk onBtnChooseAllClicked) {
        super(f41417wkgbmnqykc);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddProductToCartClicked, "onAddProductToCartClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onFavoriteProductClicked, "onFavoriteProductClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onChangeInputQuantity, "onChangeInputQuantity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onChangeMeasureType, "onChangeMeasureType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onIncreaseClick, "onIncreaseClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDecreaseClick, "onDecreaseClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onRightAction, "onRightAction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onLeftAction, "onLeftAction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBtnChooseAllClicked, "onBtnChooseAllClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(jyumaefscl.wkgbmnqykc()).ppxfxbqfkf(oxmwwwfdhm.wkgbmnqykc()).ppxfxbqfkf(new ef.zoijcleaow(ppxfxbqfkf.f41419zdlpuopuiu, new eablkybsjg(), wkgbmnqykc.f41420zdlpuopuiu, gxszxtbevo.f41418zdlpuopuiu)).iobyxmoadg(100, pmvmpeiblj.eablkybsjg(onBtnChooseAllClicked)).iobyxmoadg(101, agtfadlqog.wflxmlrfwp(rgvfuqvkyqVar, vdvldrhtssVar, onAddProductToCartClicked, onFavoriteProductClicked, onChangeInputQuantity, onChangeMeasureType, onIncreaseClick, onDecreaseClick, onRightAction, onLeftAction));
    }
}
