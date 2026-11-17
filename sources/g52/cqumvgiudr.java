package g52;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import ru.myspar.core.ui.view.popup_text.PopupTextView;

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
            return Boolean.valueOf(obj instanceof z52.draadjrbmk);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ b52.rgvfuqvkyq f36246jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f36247yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f36248zdlpuopuiu;

        public ppxfxbqfkf(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, b52.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f36248zdlpuopuiu = jpowsppfyaVar;
            this.f36247yggfygwlhe = j13;
            this.f36246jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f36248zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f36247yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f36246jyumaefscl.f15338ppxfxbqfkf.yadqdtsiqt();
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36249zdlpuopuiu = new zoijcleaow();

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
    public static final gg.wwaezpbzkn dxjokdxxww(b52.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ShapeableImageView sivImageExt = rgvfuqvkyqVar.f15339zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sivImageExt, "sivImageExt");
        c60.wkgbmnqykc.dxjokdxxww(sivImageExt, ((z52.draadjrbmk) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), s40.gxszxtbevo.placeholder, ImageView.ScaleType.FIT_XY);
        PopupTextView popupTextView = rgvfuqvkyqVar.f15338ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(popupTextView);
        popupTextView.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(((z52.draadjrbmk) iobyxmoadgVar.eablkybsjg()).iobyxmoadg()) ? 0 : 8);
        popupTextView.setPopupText(((z52.draadjrbmk) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onImageExtClicked) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onImageExtClicked, "onImageExtClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.zdlpuopuiu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return cqumvgiudr.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.yggfygwlhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.lqeggnwhkg(onImageExtClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36249zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b52.rgvfuqvkyq gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b52.rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = b52.rgvfuqvkyq.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(rgvfuqvkyqVarPpxfxbqfkf, "inflate(...)");
        return rgvfuqvkyqVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final b52.rgvfuqvkyq rgvfuqvkyqVar = (b52.rgvfuqvkyq) adapterDelegateViewBinding.ppxfxbqfkf();
        rgvfuqvkyqVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: g52.jyumaefscl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cqumvgiudr.nufgyqmvbu(draadjrbmkVar, adapterDelegateViewBinding, view);
            }
        });
        PopupTextView tvAdvertisement = rgvfuqvkyqVar.f15338ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvAdvertisement, "tvAdvertisement");
        tvAdvertisement.setOnClickListener(new ppxfxbqfkf(new kotlin.jvm.internal.jpowsppfya(), 400L, rgvfuqvkyqVar));
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.iwizpuwonk
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
