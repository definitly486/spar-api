package xc0;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.uawqvzlxes;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class draadjrbmk {

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
            return Boolean.valueOf(obj instanceof zc0.ppxfxbqfkf);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f122030iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f122031jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f122032yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f122033zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
            this.f122033zdlpuopuiu = jpowsppfyaVar;
            this.f122032yggfygwlhe = j13;
            this.f122031jyumaefscl = iobyxmoadgVar;
            this.f122030iwizpuwonk = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            tg.draadjrbmk draadjrbmkVar;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f122033zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f122032yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f122031jyumaefscl.getBindingAdapterPosition() == -1 || (draadjrbmkVar = this.f122030iwizpuwonk) == null) {
                return;
            }
            draadjrbmkVar.invoke(Integer.valueOf(this.f122031jyumaefscl.getBindingAdapterPosition()));
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f122034zdlpuopuiu = new zoijcleaow();

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
    public static final uawqvzlxes eablkybsjg(LayoutInflater layoutInflater, ViewGroup parent) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(parent, "parent");
        uawqvzlxes uawqvzlxesVarPpxfxbqfkf = uawqvzlxes.ppxfxbqfkf(layoutInflater, parent, false);
        zdlpuopuiu.dxjokdxxww(uawqvzlxesVarPpxfxbqfkf, "inflate(...)");
        return uawqvzlxesVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        MaterialCardView root = ((uawqvzlxes) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot();
        root.setEnabled(draadjrbmkVar != null);
        zdlpuopuiu.lqeggnwhkg(root);
        root.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, adapterDelegateViewBinding, draadjrbmkVar));
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: xc0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        String strEablkybsjg = ((zc0.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg();
        if (strEablkybsjg != null && strEablkybsjg.length() != 0) {
            AppCompatImageView ivLogo = ((uawqvzlxes) iobyxmoadgVar.ppxfxbqfkf()).f66032zoijcleaow;
            zdlpuopuiu.dxjokdxxww(ivLogo, "ivLogo");
            c60.wkgbmnqykc.zoijcleaow(ivLogo, ((zc0.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk draadjrbmkVar) {
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: xc0.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return draadjrbmk.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: xc0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.gxszxtbevo(draadjrbmkVar, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f122034zdlpuopuiu);
    }
}
