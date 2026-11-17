package fn1;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
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
            return Boolean.valueOf(obj instanceof gn1.iobyxmoadg.C0863iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f34474zdlpuopuiu = new zoijcleaow();

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
    public static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }

    private static final String dxjokdxxww(gn1.iobyxmoadg.C0863iobyxmoadg c0863iobyxmoadg, ef.iobyxmoadg iobyxmoadgVar) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = iobyxmoadgVar.wkgbmnqykc().getPackageManager();
        try {
            if (Build.VERSION.SDK_INT < 33) {
                applicationInfo = packageManager.getApplicationInfo(c0863iobyxmoadg.lqeggnwhkg(), 0);
            } else {
                PackageManager.ApplicationInfoFlags applicationInfoFlagsOf = PackageManager.ApplicationInfoFlags.of(131072L);
                zdlpuopuiu.dxjokdxxww(applicationInfoFlagsOf, "of(...)");
                applicationInfo = packageManager.getApplicationInfo(c0863iobyxmoadg.lqeggnwhkg(), applicationInfoFlagsOf);
            }
            zdlpuopuiu.lqeggnwhkg(applicationInfo);
            return packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onSelectBankingApp) {
        zdlpuopuiu.btonecajqb(onSelectBankingApp, "onSelectBankingApp");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: fn1.nufgyqmvbu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return draadjrbmk.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: fn1.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.lqeggnwhkg(onSelectBankingApp, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f34474zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        MaterialTextView materialTextView = ((cn1.zoijcleaow) iobyxmoadgVar.ppxfxbqfkf()).f20242wkgbmnqykc;
        String strDxjokdxxww = dxjokdxxww((gn1.iobyxmoadg.C0863iobyxmoadg) iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar);
        if (strDxjokdxxww == null) {
            strDxjokdxxww = "";
        }
        if (kcexrzcfyt.zfvoamnweg(strDxjokdxxww)) {
            strDxjokdxxww = ((gn1.iobyxmoadg.C0863iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg();
        }
        materialTextView.setText(strDxjokdxxww);
        ImageView imageView = ((cn1.zoijcleaow) iobyxmoadgVar.ppxfxbqfkf()).f20241ppxfxbqfkf;
        Drawable drawableNufgyqmvbu = nufgyqmvbu((gn1.iobyxmoadg.C0863iobyxmoadg) iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar);
        if (drawableNufgyqmvbu == null) {
            zdlpuopuiu.lqeggnwhkg(imageView);
            p41.eablkybsjg.ppxfxbqfkf(imageView, ((gn1.iobyxmoadg.C0863iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg(), b31.gxszxtbevo.placeholder);
        } else {
            imageView.setImageDrawable(drawableNufgyqmvbu);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cn1.zoijcleaow gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        cn1.zoijcleaow zoijcleaowVarPpxfxbqfkf = cn1.zoijcleaow.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarPpxfxbqfkf, "inflate(...)");
        return zoijcleaowVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.itemView.setOnClickListener(new View.OnClickListener() { // from class: fn1.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.btonecajqb(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: fn1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.gtknphoqwx(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final Drawable nufgyqmvbu(gn1.iobyxmoadg.C0863iobyxmoadg c0863iobyxmoadg, ef.iobyxmoadg iobyxmoadgVar) {
        try {
            return iobyxmoadgVar.wkgbmnqykc().getPackageManager().getApplicationIcon(c0863iobyxmoadg.lqeggnwhkg());
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
