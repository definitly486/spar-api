package zq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cqumvgiudr {

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
            return Boolean.valueOf(obj instanceof sr1.draadjrbmk);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f130948zdlpuopuiu = new zoijcleaow();

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
    public static final gg.wwaezpbzkn dxjokdxxww(uq1.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ShapeableImageView sivImageExt = rgvfuqvkyqVar.f114199ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sivImageExt, "sivImageExt");
        p41.eablkybsjg.nufgyqmvbu(sivImageExt, ((sr1.draadjrbmk) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), b31.gxszxtbevo.placeholder, ImageView.ScaleType.FIT_XY);
        ComposeView composeView = rgvfuqvkyqVar.f114200zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(((sr1.draadjrbmk) iobyxmoadgVar.eablkybsjg()).iobyxmoadg()) ? 0 : 8);
        if (composeView.getVisibility() == 0) {
            as0.zoijcleaow.iobyxmoadg(composeView, e.eablkybsjg.iobyxmoadg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, bfopjjpdmp.lqeggnwhkg.eablkybsjg(0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 11, null)), e31.iwizpuwonk.BottomRight, ((sr1.draadjrbmk) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), b41.iobyxmoadg.Auto);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onImageExtClicked) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onImageExtClicked, "onImageExtClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: zq1.zdlpuopuiu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return cqumvgiudr.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: zq1.yggfygwlhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.lqeggnwhkg(onImageExtClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f130948zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uq1.rgvfuqvkyq gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        uq1.rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = uq1.rgvfuqvkyq.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(rgvfuqvkyqVarPpxfxbqfkf, "inflate(...)");
        return rgvfuqvkyqVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final uq1.rgvfuqvkyq rgvfuqvkyqVar = (uq1.rgvfuqvkyq) adapterDelegateViewBinding.ppxfxbqfkf();
        rgvfuqvkyqVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: zq1.jyumaefscl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cqumvgiudr.nufgyqmvbu(draadjrbmkVar, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: zq1.iwizpuwonk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.dxjokdxxww(rgvfuqvkyqVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar, View view) {
        draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
    }
}
