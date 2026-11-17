package g52;

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
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

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
            return Boolean.valueOf(obj instanceof b62.zoijcleaow);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f36335iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f36336jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f36337yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f36338zdlpuopuiu;

        public ppxfxbqfkf(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
            this.f36338zdlpuopuiu = jpowsppfyaVar;
            this.f36337yggfygwlhe = j13;
            this.f36336jyumaefscl = iobyxmoadgVar;
            this.f36335iwizpuwonk = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f36338zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f36337yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            if (this.f36336jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f36335iwizpuwonk.invoke(this.f36336jyumaefscl.eablkybsjg());
            }
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36339zdlpuopuiu = new zoijcleaow();

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
    public static final b52.zoijcleaow eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b52.zoijcleaow zoijcleaowVarPpxfxbqfkf = b52.zoijcleaow.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarPpxfxbqfkf, "inflate(...)");
        return zoijcleaowVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        MaterialButton btnBanner = ((b52.zoijcleaow) adapterDelegateViewBinding.ppxfxbqfkf()).f15353zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnBanner, "btnBanner");
        btnBanner.setOnClickListener(new ppxfxbqfkf(new kotlin.jvm.internal.jpowsppfya(), 400L, adapterDelegateViewBinding, draadjrbmkVar));
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.ppxfxbqfkf
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
        b52.zoijcleaow zoijcleaowVar = (b52.zoijcleaow) iobyxmoadgVar.ppxfxbqfkf();
        b62.zoijcleaow zoijcleaowVar2 = (b62.zoijcleaow) iobyxmoadgVar.eablkybsjg();
        Integer numValueOf3 = null;
        if (zoijcleaowVar2 instanceof b62.zoijcleaow.ppxfxbqfkf) {
            ProgressBar progress = zoijcleaowVar.f15352ppxfxbqfkf;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(progress, "progress");
            b62.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = (b62.zoijcleaow.ppxfxbqfkf) zoijcleaowVar2;
            progress.setVisibility(ppxfxbqfkfVar.draadjrbmk() ? 0 : 8);
            zoijcleaowVar.f15353zoijcleaow.setEnabled(ppxfxbqfkfVar.gtknphoqwx());
            MaterialButton btnBanner = zoijcleaowVar.f15353zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnBanner, "btnBanner");
            c60.nufgyqmvbu.gtknphoqwx(btnBanner, ppxfxbqfkfVar.gtknphoqwx(), 0, 0, 6, null);
            MaterialButton materialButton = zoijcleaowVar.f15353zoijcleaow;
            String strEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
            if (ppxfxbqfkfVar.draadjrbmk()) {
                strEablkybsjg = null;
            }
            if (strEablkybsjg == null || (charSequenceIobyxmoadg = t1.zoijcleaow.iobyxmoadg(strEablkybsjg, 0, null, null)) == null) {
                charSequenceIobyxmoadg = "";
            }
            materialButton.setText(charSequenceIobyxmoadg);
        } else {
            zoijcleaowVar.f15353zoijcleaow.setText(t1.zoijcleaow.iobyxmoadg(((b62.zoijcleaow) iobyxmoadgVar.eablkybsjg()).eablkybsjg(), 0, null, null));
        }
        try {
            if (zoijcleaowVar2 instanceof b62.zoijcleaow.iobyxmoadg) {
                String strWkgbmnqykc = k30.draadjrbmk.wkgbmnqykc(((b62.zoijcleaow.iobyxmoadg) zoijcleaowVar2).nufgyqmvbu());
                numValueOf = strWkgbmnqykc != null ? Integer.valueOf(Color.parseColor(strWkgbmnqykc)) : null;
            } else {
                if (zoijcleaowVar2 instanceof b62.zoijcleaow.ppxfxbqfkf) {
                    String strWkgbmnqykc2 = k30.draadjrbmk.wkgbmnqykc(((b62.zoijcleaow.ppxfxbqfkf) zoijcleaowVar2).dxjokdxxww());
                    if (strWkgbmnqykc2 != null) {
                        numValueOf = Integer.valueOf(Color.parseColor(strWkgbmnqykc2));
                    }
                } else if (!(zoijcleaowVar2 instanceof b62.zoijcleaow.C0261zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (numValueOf == null) {
                ColorsUiModel colorsUiModelWkgbmnqykc = ((b62.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
                numValueOf = colorsUiModelWkgbmnqykc != null ? Integer.valueOf(colorsUiModelWkgbmnqykc.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY)) : null;
            }
        } catch (Throwable th2) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th2, new CrashlyticsKey[0]);
        }
        if (numValueOf != null) {
            zoijcleaowVar.f15353zoijcleaow.setBackgroundTintList(ColorStateList.valueOf(numValueOf.intValue()));
        }
        try {
            if (zoijcleaowVar2 instanceof b62.zoijcleaow.iobyxmoadg) {
                String strWkgbmnqykc3 = k30.draadjrbmk.wkgbmnqykc(((b62.zoijcleaow.iobyxmoadg) zoijcleaowVar2).dxjokdxxww());
                numValueOf2 = strWkgbmnqykc3 != null ? Integer.valueOf(Color.parseColor(strWkgbmnqykc3)) : null;
            } else {
                if (zoijcleaowVar2 instanceof b62.zoijcleaow.ppxfxbqfkf) {
                    String strWkgbmnqykc4 = k30.draadjrbmk.wkgbmnqykc(((b62.zoijcleaow.ppxfxbqfkf) zoijcleaowVar2).btonecajqb());
                    if (strWkgbmnqykc4 != null) {
                        numValueOf2 = Integer.valueOf(Color.parseColor(strWkgbmnqykc4));
                    }
                } else if (!(zoijcleaowVar2 instanceof b62.zoijcleaow.C0261zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (numValueOf2 == null) {
                ColorsUiModel colorsUiModelWkgbmnqykc2 = ((b62.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
                if (colorsUiModelWkgbmnqykc2 != null) {
                    numValueOf3 = Integer.valueOf(colorsUiModelWkgbmnqykc2.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.ON_PRIMARY));
                }
            } else {
                numValueOf3 = numValueOf2;
            }
        } catch (Throwable th3) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th3, new CrashlyticsKey[0]);
        }
        if (numValueOf3 != null) {
            zoijcleaowVar.f15353zoijcleaow.setTextColor(numValueOf3.intValue());
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk listener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36339zdlpuopuiu);
    }
}
