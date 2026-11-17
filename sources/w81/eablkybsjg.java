package w81;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b31.gxszxtbevo;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.ntlheqmsrt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

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
            return Boolean.valueOf(obj instanceof l91.iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f118999iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f119000jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f119001yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f119002zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f119002zdlpuopuiu = jpowsppfyaVar;
            this.f119001yggfygwlhe = j13;
            this.f119000jyumaefscl = rgvfuqvkyqVar;
            this.f118999iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f119002zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f119001yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f119000jyumaefscl.invoke(this.f118999iwizpuwonk.eablkybsjg(), Integer.valueOf(this.f118999iwizpuwonk.getAdapterPosition()));
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f119003zdlpuopuiu = new zoijcleaow();

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
    public static final ntlheqmsrt eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        ntlheqmsrt ntlheqmsrtVarPpxfxbqfkf = ntlheqmsrt.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(ntlheqmsrtVarPpxfxbqfkf, "inflate(...)");
        return ntlheqmsrtVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        View itemView = adapterDelegateViewBinding.itemView;
        zdlpuopuiu.dxjokdxxww(itemView, "itemView");
        itemView.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, rgvfuqvkyqVar, adapterDelegateViewBinding));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: w81.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ImageView ivLogo = ((ntlheqmsrt) iobyxmoadgVar.ppxfxbqfkf()).f128270zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivLogo, "ivLogo");
        p41.eablkybsjg.nufgyqmvbu(ivLogo, ((l91.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).ppxfxbqfkf(), gxszxtbevo.placeholder, ImageView.ScaleType.FIT_XY);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final rgvfuqvkyq onBrandClicked) {
        zdlpuopuiu.btonecajqb(onBrandClicked, "onBrandClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: w81.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: w81.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.gxszxtbevo(onBrandClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f119003zdlpuopuiu);
    }
}
