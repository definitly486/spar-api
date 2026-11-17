package h52;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.ui.view.popup_text.PopupTextView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof z52.iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ b52.kcexrzcfyt f39511jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f39512yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f39513zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, b52.kcexrzcfyt kcexrzcfytVar) {
            this.f39513zdlpuopuiu = jpowsppfyaVar;
            this.f39512yggfygwlhe = j13;
            this.f39511jyumaefscl = kcexrzcfytVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f39513zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f39512yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f39511jyumaefscl.f15318ppxfxbqfkf.yadqdtsiqt();
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39514zdlpuopuiu = new zoijcleaow();

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
    public static final b52.kcexrzcfyt eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        b52.kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = b52.kcexrzcfyt.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(kcexrzcfytVarPpxfxbqfkf, "inflate(...)");
        return kcexrzcfytVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final b52.kcexrzcfyt kcexrzcfytVar = (b52.kcexrzcfyt) adapterDelegateViewBinding.ppxfxbqfkf();
        PopupTextView tvAdvertisement = kcexrzcfytVar.f15318ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvAdvertisement, "tvAdvertisement");
        tvAdvertisement.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, kcexrzcfytVar));
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: h52.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(kcexrzcfytVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(b52.kcexrzcfyt kcexrzcfytVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ImageView ivImage = kcexrzcfytVar.f15319zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivImage, "ivImage");
        c60.wkgbmnqykc.ppxfxbqfkf(ivImage, ((z52.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), s40.gxszxtbevo.placeholder);
        PopupTextView popupTextView = ((b52.kcexrzcfyt) iobyxmoadgVar.ppxfxbqfkf()).f15318ppxfxbqfkf;
        zdlpuopuiu.lqeggnwhkg(popupTextView);
        popupTextView.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(((z52.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg()) ? 0 : 8);
        popupTextView.setPopupText(((z52.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: h52.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: h52.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f39514zdlpuopuiu);
    }
}
