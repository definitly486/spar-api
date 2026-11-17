package bz;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
class f extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17415eablkybsjg;

    f(Context context) {
        super(kc2.lqeggnwhkg.ScreenSize);
        this.f17415eablkybsjg = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        DisplayMetrics displayMetrics = this.f17415eablkybsjg.getResources().getDisplayMetrics();
        return "" + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
    }
}
