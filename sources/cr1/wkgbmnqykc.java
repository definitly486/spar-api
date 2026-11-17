package cr1;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

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
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof zr1.iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f25557iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f25558jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f25559yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f25560zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f25560zdlpuopuiu = jpowsppfyaVar;
            this.f25559yggfygwlhe = j13;
            this.f25558jyumaefscl = draadjrbmkVar;
            this.f25557iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f25560zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f25559yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f25558jyumaefscl.invoke(this.f25557iwizpuwonk.eablkybsjg());
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f25561zdlpuopuiu = new zoijcleaow();

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
    public static final uq1.nufgyqmvbu eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        uq1.nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = uq1.nufgyqmvbu.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(nufgyqmvbuVarPpxfxbqfkf, "inflate(...)");
        return nufgyqmvbuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final uq1.nufgyqmvbu nufgyqmvbuVar = (uq1.nufgyqmvbu) adapterDelegateViewBinding.ppxfxbqfkf();
        MaterialButton btnMore = nufgyqmvbuVar.f114190zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnMore, "btnMore");
        btnMore.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, draadjrbmkVar, adapterDelegateViewBinding));
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: cr1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(nufgyqmvbuVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(uq1.nufgyqmvbu nufgyqmvbuVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        nufgyqmvbuVar.f114189ppxfxbqfkf.setText(t1.zoijcleaow.iobyxmoadg(((zr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), 0, null, null));
        MaterialButton btnMore = nufgyqmvbuVar.f114190zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnMore, "btnMore");
        btnMore.setVisibility(((zr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? 0 : 8);
        ColorsUiModel colorsUiModelIobyxmoadg = ((zr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        if (colorsUiModelIobyxmoadg != null) {
            nufgyqmvbuVar.f114190zoijcleaow.setTextColor(Integer.valueOf(colorsUiModelIobyxmoadg.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY)).intValue());
        }
        ColorsUiModel colorsUiModelIobyxmoadg2 = ((zr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        if (colorsUiModelIobyxmoadg2 != null) {
            ColorsUiModel colorsUiModel = ((zr1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg() ? colorsUiModelIobyxmoadg2 : null;
            if (colorsUiModel != null) {
                ((uq1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f114189ppxfxbqfkf.setTextColor(Integer.valueOf(colorsUiModel.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY)).intValue());
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk onMoreClicked) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onMoreClicked, "onMoreClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: cr1.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: cr1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(onMoreClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f25561zdlpuopuiu);
    }
}
