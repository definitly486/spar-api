package bz;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
class b extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17385eablkybsjg;

    b(Context context) {
        super(kc2.lqeggnwhkg.ScreenColorDepth);
        this.f17385eablkybsjg = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        double d13 = this.f17385eablkybsjg.getResources().getDisplayMetrics().density;
        if (d13 >= 4.0d) {
            return "~640 dpi";
        }
        if (d13 >= 3.0d) {
            return "~480 dpi";
        }
        if (d13 >= 2.0d) {
            return "~320 dpi";
        }
        if (d13 >= 1.5d) {
            return "~240 dpi";
        }
        return d13 >= 1.0d ? "~160 dpi" : "~120 dpi";
    }
}
