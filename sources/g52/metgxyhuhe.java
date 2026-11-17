package g52;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class metgxyhuhe {

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
            return Boolean.valueOf(obj instanceof t62.iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements c9.eablkybsjg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ b52.pmvmpeiblj f36296zdlpuopuiu;

        ppxfxbqfkf(b52.pmvmpeiblj pmvmpeibljVar) {
            this.f36296zdlpuopuiu = pmvmpeibljVar;
        }

        @Override // c9.eablkybsjg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public boolean eablkybsjg(Drawable resource, Object model, d9.dxjokdxxww dxjokdxxwwVar, l8.iobyxmoadg dataSource, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resource, "resource");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dataSource, "dataSource");
            this.f36296zdlpuopuiu.f15334ppxfxbqfkf.setImageDrawable(resource);
            FloatingActionButton fabPlay = this.f36296zdlpuopuiu.f15335zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fabPlay, "fabPlay");
            fabPlay.setVisibility(0);
            return true;
        }

        @Override // c9.eablkybsjg
        public boolean wkgbmnqykc(GlideException glideException, Object obj, d9.dxjokdxxww target, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(target, "target");
            return true;
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36297zdlpuopuiu = new zoijcleaow();

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
    public static final gg.wwaezpbzkn dxjokdxxww(b52.pmvmpeiblj pmvmpeibljVar, ef.iobyxmoadg iobyxmoadgVar, c9.eablkybsjg eablkybsjgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        AppCompatImageView ivThumbnail = pmvmpeibljVar.f15334ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivThumbnail, "ivThumbnail");
        c60.wkgbmnqykc.eablkybsjg(ivThumbnail, ((t62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), eablkybsjgVar, s40.gxszxtbevo.placeholder);
        ColorsUiModel colorsUiModelIobyxmoadg = ((t62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        if (colorsUiModelIobyxmoadg != null) {
            pmvmpeibljVar.f15335zoijcleaow.setImageTintList(ColorStateList.valueOf(colorsUiModelIobyxmoadg.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY)));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk listener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.ikoacuggdj
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return metgxyhuhe.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.okpsazkaxt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return metgxyhuhe.lqeggnwhkg(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36297zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b52.pmvmpeiblj gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b52.pmvmpeiblj pmvmpeibljVarPpxfxbqfkf = b52.pmvmpeiblj.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(pmvmpeibljVarPpxfxbqfkf, "inflate(...)");
        return pmvmpeibljVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final b52.pmvmpeiblj pmvmpeibljVar = (b52.pmvmpeiblj) adapterDelegateViewBinding.ppxfxbqfkf();
        final ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(pmvmpeibljVar);
        pmvmpeibljVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: g52.jztzpxfvev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                metgxyhuhe.nufgyqmvbu(draadjrbmkVar, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.xrmfcynszj
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return metgxyhuhe.dxjokdxxww(pmvmpeibljVar, adapterDelegateViewBinding, ppxfxbqfkfVar, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar, View view) {
        draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
    }
}
