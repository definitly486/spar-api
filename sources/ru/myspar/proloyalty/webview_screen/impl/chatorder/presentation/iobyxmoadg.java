package ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends Dialog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final zoijcleaow f102080cqumvgiudr = new zoijcleaow(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f102081esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ax1.iobyxmoadg f102082iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private tg.iobyxmoadg f102083jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private tg.iobyxmoadg f102084yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private tg.iobyxmoadg f102085zdlpuopuiu;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2459iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg f102086iobyxmoadg;

        public C2459iobyxmoadg(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            this.f102086iobyxmoadg = new iobyxmoadg(context);
        }

        public Dialog iobyxmoadg() {
            return this.f102086iobyxmoadg;
        }

        public C2459iobyxmoadg ppxfxbqfkf(tg.iobyxmoadg listener) {
            zdlpuopuiu.btonecajqb(listener, "listener");
            this.f102086iobyxmoadg.f102083jyumaefscl = listener;
            return this;
        }

        public C2459iobyxmoadg wkgbmnqykc(tg.iobyxmoadg listener) {
            zdlpuopuiu.btonecajqb(listener, "listener");
            this.f102086iobyxmoadg.f102084yggfygwlhe = listener;
            return this;
        }

        public C2459iobyxmoadg zoijcleaow(tg.iobyxmoadg listener) {
            zdlpuopuiu.btonecajqb(listener, "listener");
            this.f102086iobyxmoadg.f102085zdlpuopuiu = listener;
            return this;
        }
    }

    private static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        ax1.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ax1.iobyxmoadg.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        this.f102082iwizpuwonk = iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(iobyxmoadg iobyxmoadgVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f102084yggfygwlhe;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.invoke();
        }
        iobyxmoadgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(iobyxmoadg iobyxmoadgVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f102085zdlpuopuiu;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.invoke();
        }
        iobyxmoadgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(iobyxmoadg iobyxmoadgVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f102083jyumaefscl;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.invoke();
        }
        iobyxmoadgVar.dismiss();
    }

    private final int lqeggnwhkg() {
        int iNufgyqmvbu = nufgyqmvbu();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return iNufgyqmvbu - (wr0.iobyxmoadg.iobyxmoadg(45, context) * 2);
    }

    private final int nufgyqmvbu() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f102082iwizpuwonk.getRoot());
        setCancelable(false);
        ax1.iobyxmoadg iobyxmoadgVar = this.f102082iwizpuwonk;
        iobyxmoadgVar.f14719ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: zw1.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.iobyxmoadg.dxjokdxxww(this.f131448zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f14720wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: zw1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.iobyxmoadg.btonecajqb(this.f131455zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f14721zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: zw1.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.iobyxmoadg.gtknphoqwx(this.f131453zdlpuopuiu, view);
            }
        });
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = 0.85f;
            }
            if (attributes != null) {
                attributes.width = lqeggnwhkg();
            }
            window.setAttributes(attributes);
        }
    }
}
