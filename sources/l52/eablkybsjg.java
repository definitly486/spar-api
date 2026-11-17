package l52;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.auzgnhcxok;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
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
            return Boolean.valueOf(obj instanceof r62.iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f61644iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f61645jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f61646yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f61647zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f61647zdlpuopuiu = jpowsppfyaVar;
            this.f61646yggfygwlhe = j13;
            this.f61645jyumaefscl = draadjrbmkVar;
            this.f61644iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f61647zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f61646yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f61645jyumaefscl.invoke(this.f61644iwizpuwonk.eablkybsjg());
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f61648zdlpuopuiu = new zoijcleaow();

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
    public static final auzgnhcxok eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        auzgnhcxok auzgnhcxokVarPpxfxbqfkf = auzgnhcxok.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(auzgnhcxokVarPpxfxbqfkf, "inflate(...)");
        return auzgnhcxokVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final auzgnhcxok auzgnhcxokVar = (auzgnhcxok) adapterDelegateViewBinding.ppxfxbqfkf();
        ShapeableImageView root = auzgnhcxokVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, draadjrbmkVar, adapterDelegateViewBinding));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: l52.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.lqeggnwhkg(auzgnhcxokVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(auzgnhcxok auzgnhcxokVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ShapeableImageView imageView = auzgnhcxokVar.f65350zoijcleaow;
        zdlpuopuiu.dxjokdxxww(imageView, "imageView");
        c60.wkgbmnqykc.ppxfxbqfkf(imageView, ((r62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), s40.gxszxtbevo.placeholder);
        auzgnhcxokVar.getRoot().setClickable(((r62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg().lqeggnwhkg());
        auzgnhcxokVar.getRoot().setElevation(((r62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg() ? iobyxmoadgVar.wkgbmnqykc().getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_4) : 0.0f);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final draadjrbmk onCardClicked) {
        zdlpuopuiu.btonecajqb(onCardClicked, "onCardClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: l52.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: l52.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.gxszxtbevo(onCardClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f61648zdlpuopuiu);
    }
}
