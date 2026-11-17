package zq1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

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
            return Boolean.valueOf(obj instanceof ur1.zoijcleaow);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f131024iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f131025jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f131026yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f131027zdlpuopuiu;

        public ppxfxbqfkf(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
            this.f131027zdlpuopuiu = jpowsppfyaVar;
            this.f131026yggfygwlhe = j13;
            this.f131025jyumaefscl = iobyxmoadgVar;
            this.f131024iwizpuwonk = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f131027zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f131026yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            if (this.f131025jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f131024iwizpuwonk.invoke(this.f131025jyumaefscl.eablkybsjg());
            }
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f131028zdlpuopuiu = new zoijcleaow();

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
    public static final uq1.zoijcleaow eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        uq1.zoijcleaow zoijcleaowVarPpxfxbqfkf = uq1.zoijcleaow.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarPpxfxbqfkf, "inflate(...)");
        return zoijcleaowVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        MaterialButton btnBanner = ((uq1.zoijcleaow) adapterDelegateViewBinding.ppxfxbqfkf()).f114214zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnBanner, "btnBanner");
        btnBanner.setOnClickListener(new ppxfxbqfkf(new kotlin.jvm.internal.jpowsppfya(), 400L, adapterDelegateViewBinding, draadjrbmkVar));
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: zq1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        Integer numValueOf;
        Integer numValueOf2;
        CharSequence charSequenceIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        uq1.zoijcleaow zoijcleaowVar = (uq1.zoijcleaow) iobyxmoadgVar.ppxfxbqfkf();
        ur1.zoijcleaow zoijcleaowVar2 = (ur1.zoijcleaow) iobyxmoadgVar.eablkybsjg();
        Integer numValueOf3 = null;
        if (zoijcleaowVar2 instanceof ur1.zoijcleaow.ppxfxbqfkf) {
            ProgressBar progress = zoijcleaowVar.f114213ppxfxbqfkf;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(progress, "progress");
            ur1.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (ur1.zoijcleaow.ppxfxbqfkf) zoijcleaowVar2;
            progress.setVisibility(ppxfxbqfkfVar.draadjrbmk() ? 0 : 8);
            zoijcleaowVar.f114214zoijcleaow.setEnabled(ppxfxbqfkfVar.gtknphoqwx());
            MaterialButton btnBanner = zoijcleaowVar.f114214zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnBanner, "btnBanner");
            p41.dxjokdxxww.gtknphoqwx(btnBanner, ppxfxbqfkfVar.gtknphoqwx(), 0, 0, 6, null);
            MaterialButton materialButton = zoijcleaowVar.f114214zoijcleaow;
            String strEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
            if (ppxfxbqfkfVar.draadjrbmk()) {
                strEablkybsjg = null;
            }
            if (strEablkybsjg == null || (charSequenceIobyxmoadg = t1.zoijcleaow.iobyxmoadg(strEablkybsjg, 0, null, null)) == null) {
                charSequenceIobyxmoadg = "";
            }
            materialButton.setText(charSequenceIobyxmoadg);
        } else {
            zoijcleaowVar.f114214zoijcleaow.setText(t1.zoijcleaow.iobyxmoadg(((ur1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).eablkybsjg(), 0, null, null));
        }
        try {
            if (zoijcleaowVar2 instanceof ur1.zoijcleaow.iobyxmoadg) {
                String strWkgbmnqykc = q11.dxjokdxxww.wkgbmnqykc(((ur1.zoijcleaow.iobyxmoadg) zoijcleaowVar2).nufgyqmvbu());
                numValueOf = strWkgbmnqykc != null ? Integer.valueOf(Color.parseColor(strWkgbmnqykc)) : null;
            } else {
                if (zoijcleaowVar2 instanceof ur1.zoijcleaow.ppxfxbqfkf) {
                    String strWkgbmnqykc2 = q11.dxjokdxxww.wkgbmnqykc(((ur1.zoijcleaow.ppxfxbqfkf) zoijcleaowVar2).dxjokdxxww());
                    if (strWkgbmnqykc2 != null) {
                        numValueOf = Integer.valueOf(Color.parseColor(strWkgbmnqykc2));
                    }
                } else if (!(zoijcleaowVar2 instanceof ur1.zoijcleaow.C2834zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (numValueOf == null) {
                ColorsUiModel colorsUiModelWkgbmnqykc = ((ur1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
                numValueOf = colorsUiModelWkgbmnqykc != null ? Integer.valueOf(colorsUiModelWkgbmnqykc.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY)) : null;
            }
        } catch (Throwable th2) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
        }
        if (numValueOf != null) {
            zoijcleaowVar.f114214zoijcleaow.setBackgroundTintList(ColorStateList.valueOf(numValueOf.intValue()));
        }
        try {
            if (zoijcleaowVar2 instanceof ur1.zoijcleaow.iobyxmoadg) {
                String strWkgbmnqykc3 = q11.dxjokdxxww.wkgbmnqykc(((ur1.zoijcleaow.iobyxmoadg) zoijcleaowVar2).dxjokdxxww());
                numValueOf2 = strWkgbmnqykc3 != null ? Integer.valueOf(Color.parseColor(strWkgbmnqykc3)) : null;
            } else {
                if (zoijcleaowVar2 instanceof ur1.zoijcleaow.ppxfxbqfkf) {
                    String strWkgbmnqykc4 = q11.dxjokdxxww.wkgbmnqykc(((ur1.zoijcleaow.ppxfxbqfkf) zoijcleaowVar2).btonecajqb());
                    if (strWkgbmnqykc4 != null) {
                        numValueOf2 = Integer.valueOf(Color.parseColor(strWkgbmnqykc4));
                    }
                } else if (!(zoijcleaowVar2 instanceof ur1.zoijcleaow.C2834zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (numValueOf2 == null) {
                ColorsUiModel colorsUiModelWkgbmnqykc2 = ((ur1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
                if (colorsUiModelWkgbmnqykc2 != null) {
                    numValueOf3 = Integer.valueOf(colorsUiModelWkgbmnqykc2.xrmfcynszj(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY));
                }
            } else {
                numValueOf3 = numValueOf2;
            }
        } catch (Throwable th3) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th3, new CrashlyticsKey[0]);
        }
        if (numValueOf3 != null) {
            zoijcleaowVar.f114214zoijcleaow.setTextColor(numValueOf3.intValue());
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk listener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: zq1.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: zq1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f131028zdlpuopuiu);
    }
}
