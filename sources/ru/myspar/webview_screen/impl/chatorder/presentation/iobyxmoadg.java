package ru.myspar.webview_screen.impl.chatorder.presentation;

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
    private static final zoijcleaow f104723cqumvgiudr = new zoijcleaow(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f104724esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final cb2.iobyxmoadg f104725iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private tg.iobyxmoadg f104726jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private tg.iobyxmoadg f104727yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private tg.iobyxmoadg f104728zdlpuopuiu;

    /* JADX INFO: renamed from: ru.myspar.webview_screen.impl.chatorder.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2537iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg f104729iobyxmoadg;

        public C2537iobyxmoadg(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            this.f104729iobyxmoadg = new iobyxmoadg(context);
        }

        public Dialog iobyxmoadg() {
            return this.f104729iobyxmoadg;
        }

        public C2537iobyxmoadg ppxfxbqfkf(tg.iobyxmoadg listener) {
            zdlpuopuiu.btonecajqb(listener, "listener");
            this.f104729iobyxmoadg.f104726jyumaefscl = listener;
            return this;
        }

        public C2537iobyxmoadg wkgbmnqykc(tg.iobyxmoadg listener) {
            zdlpuopuiu.btonecajqb(listener, "listener");
            this.f104729iobyxmoadg.f104727yggfygwlhe = listener;
            return this;
        }

        public C2537iobyxmoadg zoijcleaow(tg.iobyxmoadg listener) {
            zdlpuopuiu.btonecajqb(listener, "listener");
            this.f104729iobyxmoadg.f104728zdlpuopuiu = listener;
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
        cb2.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = cb2.iobyxmoadg.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        this.f104725iwizpuwonk = iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(iobyxmoadg iobyxmoadgVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f104727yggfygwlhe;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.invoke();
        }
        iobyxmoadgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(iobyxmoadg iobyxmoadgVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f104728zdlpuopuiu;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.invoke();
        }
        iobyxmoadgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(iobyxmoadg iobyxmoadgVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar.f104726jyumaefscl;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.invoke();
        }
        iobyxmoadgVar.dismiss();
    }

    private final int lqeggnwhkg() {
        int iNufgyqmvbu = nufgyqmvbu();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return iNufgyqmvbu - (ct.iobyxmoadg.iobyxmoadg(45, context) * 2);
    }

    private final int nufgyqmvbu() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f104725iwizpuwonk.getRoot());
        setCancelable(false);
        cb2.iobyxmoadg iobyxmoadgVar = this.f104725iwizpuwonk;
        iobyxmoadgVar.f19554ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: bb2.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.webview_screen.impl.chatorder.presentation.iobyxmoadg.dxjokdxxww(this.f15683zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f19555wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: bb2.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.webview_screen.impl.chatorder.presentation.iobyxmoadg.btonecajqb(this.f15689zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f19556zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: bb2.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.webview_screen.impl.chatorder.presentation.iobyxmoadg.gtknphoqwx(this.f15687zdlpuopuiu, view);
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
