package v81;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import bfopjjpdmp.lqeggnwhkg;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import e31.iwizpuwonk;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import w0.nufgyqmvbu;
import z41.ribwqtqdhb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends jyumaefscl implements vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof cc1.eablkybsjg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f116334iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f116335jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f116336yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f116337zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
            this.f116337zdlpuopuiu = jpowsppfyaVar;
            this.f116336yggfygwlhe = j13;
            this.f116335jyumaefscl = iobyxmoadgVar;
            this.f116334iwizpuwonk = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f116337zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f116336yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f116335jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f116334iwizpuwonk.invoke(Integer.valueOf(this.f116335jyumaefscl.getBindingAdapterPosition()));
            }
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f116338zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ribwqtqdhb eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = ribwqtqdhb.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(ribwqtqdhbVarPpxfxbqfkf, "inflate(...)");
        return ribwqtqdhbVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) adapterDelegateViewBinding.ppxfxbqfkf();
        MaterialCardView root = ribwqtqdhbVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, adapterDelegateViewBinding, draadjrbmkVar));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: v81.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(ribwqtqdhbVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ribwqtqdhb ribwqtqdhbVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ShapeableImageView ivBanner = ribwqtqdhbVar.f128369ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivBanner, "ivBanner");
        String strWkgbmnqykc = ((cc1.eablkybsjg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
        int i13 = b31.gxszxtbevo.placeholder;
        c9.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = new c9.gxszxtbevo().ppxfxbqfkf();
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "centerCrop(...)");
        p41.eablkybsjg.eablkybsjg(ivBanner, strWkgbmnqykc, i13, (c9.gxszxtbevo) iobyxmoadgVarPpxfxbqfkf, null, 8, null);
        ComposeView composeView = ribwqtqdhbVar.f128370zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(((cc1.eablkybsjg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().length() > 0 ? 0 : 8);
        if (composeView.getVisibility() == 0) {
            as0.zoijcleaow.iobyxmoadg(composeView, e.eablkybsjg.iobyxmoadg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, lqeggnwhkg.eablkybsjg(0.0f, 0.0f, nufgyqmvbu.lqeggnwhkg(16), 0.0f, 11, null)), iwizpuwonk.BottomRight, ((cc1.eablkybsjg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), b41.iobyxmoadg.Auto);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: v81.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: v81.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f116338zdlpuopuiu);
    }
}
